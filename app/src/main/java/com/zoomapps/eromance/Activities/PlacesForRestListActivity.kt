package com.zoomapps.eromance.Activities

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Adapters.PlacesListAdapter
import com.zoomapps.eromance.Adapters.SearchParamsAdapter
import com.zoomapps.eromance.BaseActivity
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.Helpers.DB_Helper
import com.zoomapps.eromance.Helpers.MenuClickListener
import com.zoomapps.eromance.Helpers.MenuData_Setter
import com.zoomapps.eromance.Interfaces.TypesAdapterInteraction
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.PlacesModel
import com.zoomapps.eromance.Models.SimpleTypeDatum
import com.zoomapps.eromance.Models.Types.PlaceTypesDatum
import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView
import io.realm.Realm
import kotterknife.bindView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class PlacesForRestListActivity : BaseActivity() , TypesAdapterInteraction {
    override fun addType(type_id: Int) {
        selectedTypes.add(type_id)
    }

    override fun checkType(type_id: Int): Boolean {
        return selectedTypes.contains(type_id)
    }

    override fun removeType(type_id: Int) {
        selectedTypes.remove(type_id)
    }

    var selectedTypes = ArrayList<Int>()
    var searchedPlaceName :String=""
    var mLayoutManager : LinearLayoutManager ?=null
    var mDataAdapter: RecyclerView.Adapter<*>? = null
    var mParamsAdapter: RecyclerView.Adapter<*>? = null
    val place_list_rv : RecyclerView by bindView(R.id.place_list_rv)
    var mRV_Data : MutableList<PlacesModel.Datum> ? = null

    //-----------------NAVIGATION--------------------
    val myProfile_NAV_LL : LinearLayout by bindView(R.id.myProfile_NAV_LL)
    val searchPair_NAV_LL : LinearLayout by bindView(R.id.searchPair_NAV_LL)
    val momentMeets_NAV_LL : LinearLayout by bindView(R.id.momentMeets_NAV_LL)
    val placesForRest_NAV_LL : LinearLayout by bindView(R.id.placesForRest_NAV_LL)
    val eveningPlans_NAV_LL : LinearLayout by bindView(R.id.eveningPlans_NAV_LL)
    val map_NAV_LL : LinearLayout by bindView(R.id.map_NAV_LL)
    val games_NAV_LL : LinearLayout by bindView(R.id.games_NAV_LL)
    val twentyOne_NAV_LL : LinearLayout by bindView(R.id.twentyOne_NAV_LL)
    val settings_NAV_LL : LinearLayout by bindView(R.id.settings_NAV_LL)
    val cur_username_NAV_TV : TextView by bindView(R.id.cur_username_NAV_TV)
    val cur_country_NAV_TV : TextView by bindView(R.id.cur_country_NAV_TV)
    val cur_city_NAV_TV : TextView by bindView(R.id.cur_city_NAV_TV)
    val cur_coins_NAV_TV : TextView by bindView(R.id.cur_coins_NAV_TV)
    val nav_recyclerView : RecyclerView by bindView(R.id.nav_recyclerView)
    val profile_image_CIV : CircleImageView by bindView(R.id.profile_image_CIV)

    val mProgressBar : ProgressBar by bindView(R.id.loading_bar)
    val tv_errorMsg : TextView by bindView(R.id.tv_errorMsg)
    //Search
    val search_ED : EditText by bindView(R.id.search_ED)
    val search_params_RV : RecyclerView by bindView(R.id.search_params_RV)
    lateinit var realm : Realm

    fun setMenuClicks(){
        myProfile_NAV_LL.setOnClickListener(MenuClickListener(this))
        searchPair_NAV_LL.setOnClickListener(MenuClickListener(this));
        momentMeets_NAV_LL.setOnClickListener(MenuClickListener(this));
        placesForRest_NAV_LL.setOnClickListener(MenuClickListener(this));
        eveningPlans_NAV_LL.setOnClickListener(MenuClickListener(this));
        map_NAV_LL.setOnClickListener(MenuClickListener(this));
        games_NAV_LL.setOnClickListener(MenuClickListener(this));
        twentyOne_NAV_LL.setOnClickListener(MenuClickListener(this));
        settings_NAV_LL.setOnClickListener(MenuClickListener(this));
        findViewById<LinearLayout>(R.id.home_NAV_LL).setOnClickListener(MenuClickListener(this))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_places_for_rest_list)
        place_list_rv!!.isNestedScrollingEnabled = false
        mLayoutManager = LinearLayoutManager(this@PlacesForRestListActivity)
        place_list_rv!!.layoutManager = mLayoutManager
        setToolbar(this ,
                getString(R.string.places),
                findViewById<TextView>(R.id.tv_map) as TextView,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView ,
                false,
                findViewById<DrawerLayout>(R.id.drawer_layout) as DrawerLayout)
        setMenuClicks();
        MenuData_Setter(this).setMenuData(cur_username_NAV_TV,cur_country_NAV_TV,
                cur_city_NAV_TV,cur_coins_NAV_TV,profile_image_CIV,
                (findViewById<RatingBar>(R.id.go_rating)as RatingBar),
                (findViewById<TextView>(R.id.rating_value_TV) as TextView),if(findViewById<RelativeLayout>(R.id.network_status_container) != null)
            findViewById<RelativeLayout>(R.id.network_status_container) as RelativeLayout else null)
        Realm.init(this);
        realm = Realm.getDefaultInstance()
        search_params_RV.layoutManager = GridLayoutManager(this@PlacesForRestListActivity,2)
        mParamsAdapter = SearchParamsAdapter(paramItems,this)
        search_params_RV.adapter = mParamsAdapter

        search_ED.addTextChangedListener(object:TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                searchedPlaceName = p0.toString()
            }

        })
        init_searchParams_view()
    }

    fun loader_inter(isShow:Boolean){
        mProgressBar.visibility = if(isShow) View.VISIBLE  else View.GONE
    }

    fun setError(message:String?){
        if(message==null)
            return
        tv_errorMsg.visibility = View.VISIBLE
        showToast(this,message);
        tv_errorMsg.text = message
    }
//btn_arrow_bot
    var paramItems = ArrayList<SimpleTypeDatum>()
    val expand_button : LinearLayout by bindView(R.id.expand_button)
    val expand_button2 : Button by bindView(R.id.btn_arrow_bot)
    val expandable_layout : LinearLayout by bindView(R.id.expandable_layout)
    val search_btn : Button by bindView(R.id.startSearching_BTN)
    var isExpandableLayoutVisible = false;
    fun init_searchParams_view(){
        expandable_layout.visibility = ViewGroup.GONE
        expand_button.setOnClickListener {
            when(isExpandableLayoutVisible){
                false->{
                    expandable_layout.visibility = ViewGroup.VISIBLE
                }
                true->{
                    expandable_layout.visibility = ViewGroup.GONE
                }
            }
            isExpandableLayoutVisible = !isExpandableLayoutVisible
        }


        expand_button2.setOnClickListener {
            when(isExpandableLayoutVisible){
                false->{
                    expandable_layout.visibility = ViewGroup.VISIBLE
                }
                true->{
                    expandable_layout.visibility = ViewGroup.GONE
                }
            }
            isExpandableLayoutVisible = !isExpandableLayoutVisible
        }


        search_btn.setOnClickListener {
            isExpandableLayoutVisible = false;
            expandable_layout.visibility=ViewGroup.GONE
            getData(true)
        }
        checkValueData()
    }
    var placeTypesList : List<SimpleTypeDatum>?=null
    fun checkValueData(){
        var savedTypes = (DB_Helper.getSavedPlaceTypes(realm!!))
        if(savedTypes == null ){
           // getTypes();
        }
        else{
            var setType = DB_Helper.mapPlacesToSimple(savedTypes)
            placeTypesList = setType.toList();
            init_params_RV(placeTypesList!!)
        }
        getData();
    }
    fun init_params_RV(item_list:List<SimpleTypeDatum>){
        runOnUiThread {
            paramItems.clear()
            paramItems.addAll(item_list)
            mParamsAdapter?.notifyDataSetChanged()
        }
    }
    fun setDataToRV(data : List<PlacesModel.Datum> ){
        if(mRV_Data == null){
            mRV_Data = ArrayList<PlacesModel.Datum>()
        }
        else{
            mRV_Data?.clear()
        }
        mRV_Data?.addAll(data)

        if(mDataAdapter == null) {
            mDataAdapter = PlacesListAdapter(mRV_Data, this)
            place_list_rv!!.adapter = mDataAdapter
        }
        else{
            mDataAdapter?.notifyDataSetChanged()
        }
    }

    fun getData(isFilter:Boolean=false){
        tv_errorMsg.visibility = View.GONE
        loader_inter(true)
        val apiService = API_Client.client!!.create(API_Interface::class.java)
         var call : Call<PlacesModel.PlacesListResponse>?=null
        if(isFilter){
           /* if(selectedTypes.isNotEmpty() && searchedPlaceName!=""&&searchedPlaceName.length>1)
                call = apiService.getFilteredPlaceList(selectedTypes,searchedPlaceName)
            else if(selectedTypes.isNotEmpty() && (searchedPlaceName==""||!(searchedPlaceName.length>1)))
                call = apiService.getFilteredPlaceList(selectedTypes)
            else if(selectedTypes.isEmpty()&& searchedPlaceName!=""&&searchedPlaceName.length>1  )
                call = apiService.getFilteredPlaceList(name = searchedPlaceName)
            else
                call = apiService.getFilteredPlaceList()*/
            call = apiService.getPlaceList()

        }
      else {
            call = apiService.getPlaceList()
        }
        call.enqueue(object : Callback<PlacesModel.PlacesListResponse> {
            override fun onResponse(call: Call<PlacesModel.PlacesListResponse>,
                                    response: Response<PlacesModel.PlacesListResponse>) {
                loader_inter(false)
                val mainPageDataList = response.body().data
                if(mainPageDataList != null&& mainPageDataList.isNotEmpty() ) {
                    val statusCode = response.code()
                    var listData =  mainPageDataList;
                    setDataToRV(listData);
                }
                else {
                    setError("Список пуст")
                    if(mainPageDataList!=null)
                        setDataToRV(mainPageDataList);
                }
            }

            override fun onFailure(call: Call<PlacesModel.PlacesListResponse>, t: Throwable) {
                // Log error here since request failed
                loader_inter(false)
                setError( getString(R.string.error))
            }

        })
    }

}
