package com.zoomapps.eromance.Activities

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Client.apiService
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Adapters.Connection_ResultList_Adapter
import com.zoomapps.eromance.Adapters.SearchParamsAdapter
import com.zoomapps.eromance.BaseActivity
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.Helpers.*
import com.zoomapps.eromance.Helpers.DB_Helper.mapMeetToSimple
import com.zoomapps.eromance.Interfaces.TypesAdapterInteraction
import com.zoomapps.eromance.Models.*

import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView
import io.realm.Realm
import kotterknife.bindView
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class MomentalMeetsActivity : BaseActivity(), TypesAdapterInteraction {
    private val checked: Boolean = false;
    private var presenter: MeetDitailPresenterActivity? = null;
    var isConnectionCheck = true;
    private var interaction_id: Int? = null
    lateinit var send_btn: Button;
    var isConnected = false;
    var test: String = "";


    override fun addType(type_id: Int) {
        selectedTypes.add(type_id)
    }

    override fun checkType(type_id: Int): Boolean {
        return selectedTypes.contains(type_id)
    }

    override fun removeType(type_id: Int) {
        selectedTypes.remove(type_id)
    }

//    private var details: MeetsModel.Datum? = null
//        get() = arguments!!.getString(MeetDetailsDialogFragment.ARG_PARAM2)
//
//    private fun getDetailsInfo(): MeetsModel.Datum {
//        if (details == null) {
//            if (arguments!!.getString(MeetDetailsDialogFragment.ARG_PARAM1) == null || arguments?.getString(MeetDetailsDialogFragment.ARG_PARAM1)!!.isEmpty()) {
//                dismiss();
//                showPreparedToast(this!!.activity!!, "success_evening")
//                return MeetsModel().Datum();
//            }
//            details = deSerializeToJson(arguments!!.getString(MeetDetailsDialogFragment.ARG_PARAM1), MeetsModel.Datum::class.java)
//        }
//        return details!!;
//    }


    val expand_button: LinearLayout by bindView(R.id.expand_button)
    // val arrow_frame_btn : TextView by bindView(R.id.arrow_frame_btn)
    val btn_arrow_top: Button by bindView(R.id.btn_arrow_top)
    val btn_arrow_bot: Button by bindView(R.id.btn_arrow_bot)
    val expandable_layout: LinearLayout by bindView(R.id.expandable_layout)
    val Ll_date_meseting: TextView by bindView(R.id.Ll_date_meseting)
    val tv_date_meeting: TextView by bindView(R.id.tv_date_meeting)
    val tv_time_meeting: TextView by bindView(R.id.tv_time_meeting)
    val tv_currentDateFrom: TextView by bindView(R.id.tv_currentDateFrom)
    val tv_currentTimeFrom: TextView by bindView(R.id.tv_currentTimeFrom)
    val tv_currentDateBefore: TextView by bindView(R.id.tv_currentDateBefore)
    val tv_currentTimeBefore: TextView by bindView(R.id.tv_currentTimeBefore)
    val dateTo_LL: LinearLayout by bindView(R.id.dateTo_LL)
    val dateFrom_LL: LinearLayout by bindView(R.id.dateFrom_LL)
    val search_params_RV: RecyclerView by bindView(R.id.search_params_RV)
    val loading_PG: ProgressBar by bindView(R.id.loading_PG)
    val meets_list_RV: RecyclerView by bindView(R.id.meets_list_RV)
    val duration_container: LinearLayout  by bindView(R.id.duration_container)
    val duration_RG: RadioGroup  by bindView(R.id.duration_RG)
    val one_hour_RB: RadioButton  by bindView(R.id.one_hour_RB)
    val two_hour_RB: RadioButton  by bindView(R.id.two_hour_RB)
    val search_btn: Button by bindView(R.id.startSearching_BTN)
    var realm: Realm? = null
    var selectedTypes = ArrayList<Int>()
    var selectedTimeType = -1;
    var meetTypesList: List<SimpleTypeDatum>? = null

    //-----------------NAVIGATION--------------------
    val myProfile_NAV_LL: LinearLayout by bindView(R.id.myProfile_NAV_LL)
    val searchPair_NAV_LL: LinearLayout by bindView(R.id.searchPair_NAV_LL)
    val momentMeets_NAV_LL: LinearLayout by bindView(R.id.momentMeets_NAV_LL)
    val placesForRest_NAV_LL: LinearLayout by bindView(R.id.placesForRest_NAV_LL)
    val eveningPlans_NAV_LL: LinearLayout by bindView(R.id.eveningPlans_NAV_LL)
    val map_NAV_LL: LinearLayout by bindView(R.id.map_NAV_LL)
    val games_NAV_LL: LinearLayout by bindView(R.id.games_NAV_LL)
    val twentyOne_NAV_LL: LinearLayout by bindView(R.id.twentyOne_NAV_LL)
    val settings_NAV_LL: LinearLayout by bindView(R.id.settings_NAV_LL)
    val cur_username_NAV_TV: TextView by bindView(R.id.cur_username_NAV_TV)
    val cur_country_NAV_TV: TextView by bindView(R.id.cur_country_NAV_TV)
    val cur_city_NAV_TV: TextView by bindView(R.id.cur_city_NAV_TV)
    val cur_coins_NAV_TV: TextView by bindView(R.id.cur_coins_NAV_TV)
    val nav_recyclerView: RecyclerView by bindView(R.id.nav_recyclerView)
    val profile_image_CIV: CircleImageView by bindView(R.id.profile_image_CIV)
    val tv_errorMsg: TextView by bindView(R.id.tv_errorMsg)

    fun setMenuClicks() {
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
        EventBus.getDefault().register(this);
        setContentView(R.layout.activity_momental_meets)
        setToolbar(this,
                getString(R.string.all_meets),
                findViewById<TextView>(R.id.tv_map) as TextView,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView,
                false,
                findViewById<DrawerLayout>(R.id.drawer_layout) as DrawerLayout)
        //realm!!.deleteAll()





















        duration_container.visibility = ViewGroup.VISIBLE
        Realm.init(this);
        realm = Realm.getDefaultInstance()
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { view ->
            startActivity(Intent(this, CreateMeetActivity::class.java))
        }
        setMenuClicks();

        MenuData_Setter(this).setMenuData(cur_username_NAV_TV, cur_country_NAV_TV,
                cur_city_NAV_TV, cur_coins_NAV_TV, profile_image_CIV,
                (findViewById<RatingBar>(R.id.go_rating) as RatingBar),
                (findViewById<TextView>(R.id.rating_value_TV) as TextView), findViewById<RelativeLayout>(R.id.network_status_container) as RelativeLayout)
        search_btn.setOnClickListener {
            isExpandableLayoutVisible = false;
            expandable_layout.visibility = ViewGroup.GONE
            getData(true)
        }
        init_searchParams_view();
        checkValueData();


    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onMessageEvent(event: MessageEvent) {
        mAdapter!!.notifyDataSetChanged();
        mAdapter2!!.notifyDataSetChanged();
    }


    fun <T> convertAnyToType(dataList: List<Any>): ArrayList<T> {
        var returnData: ArrayList<T>? = null;
        for (tmp in dataList) {
            returnData?.add(tmp as T)
        }
        return returnData!!
    }

    fun checkValueData() {
       var savedTypes = (DB_Helper.getMeetTypes(realm!!))
       if (savedTypes == null) {
            getTypes()
       } else {
           var setType = mapMeetToSimple(savedTypes)
           meetTypesList = setType.toList();
           init_params_RV(meetTypesList!!)
          getData();

        }
    }

    private var mAdapter2: RecyclerView.Adapter<*>? = null
    var sr_data_list: MutableList<MeetsModel.Datum>? = null
    var mainmLayoutManager: LinearLayoutManager? = null
    fun init_rv_data(datum: List<MeetsModel.Datum>?) {
        loading_PG.visibility = ViewGroup.GONE
        var data_list = ArrayList<MeetsModel.Datum>();
        if (datum != null) {
            //return
            data_list.addAll(datum);
        } else {
            setError(getString(R.string.empty));
        }

        if (mAdapter2 == null) {
            var listManager = LinearLayoutManager(this@MomentalMeetsActivity)
            meets_list_RV!!.layoutManager = listManager
            sr_data_list = data_list.toMutableList()
            mAdapter2 = Connection_ResultList_Adapter(sr_data_list, this, Server_Entities.Meet, "123")

            meets_list_RV!!.adapter = mAdapter2
        } else {
            sr_data_list?.clear()
            sr_data_list?.addAll(data_list)
            mAdapter2?.notifyDataSetChanged()
        }
    }

    fun setError(message: String?) {
        if (message == null)
            return
        tv_errorMsg.visibility = View.VISIBLE
        showToast(this, message);
        tv_errorMsg.text = message
    }

    fun getData(isFilter: Boolean? = false) {
        tv_errorMsg.visibility = View.GONE
        loading_PG.visibility = ViewGroup.VISIBLE
        val apiService = API_Client.client!!.create(API_Interface::class.java)

        if (isFilter!!) {
            val filterMeetsCall = apiService.getFilteredMeets(GlobalStaticVariables.language_type!!,if (selectedTimeType != -1) selectedTimeType.toString() else null,
                    meet_types = if (selectedTypes.isNotEmpty()) selectedTypes else null)
            handle_request(filterMeetsCall)
        } else {
            val getMeetsCall = apiService.getMeets(GlobalStaticVariables.language_type!!)
            handle_request(getMeetsCall)
        }

    }

    fun handle_request(call: Call<MeetsModel.MeetsResponse>) {
        call.enqueue(object : Callback<MeetsModel.MeetsResponse> {
            override fun onResponse(call: Call<MeetsModel.MeetsResponse>,
                                    response: Response<MeetsModel.MeetsResponse>) {

                loading_PG.visibility = ViewGroup.GONE
                val mainPageDataList = response.body().data
                if (mainPageDataList != null && mainPageDataList.isNotEmpty()) {
                    val statusCode = response.code()
                    var listData = mainPageDataList;
                    init_rv_data(mainPageDataList)
                } else {
                    if (response.body().code != 1) {
                        setError(getString(R.string.error_data))
                    } else {
                        init_rv_data(null)
                        //Toast.makeText(this@MomentalMeetsActivity, "Пусто", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            override fun onFailure(call: Call<MeetsModel.MeetsResponse>, t: Throwable) {
                loading_PG.visibility = ViewGroup.GONE
                // Log error here since request failed
                setError(getString(R.string.unknown_data));

            }
        })
    }

    fun getTypes() {
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getMeetTypes()
        call.enqueue(object : Callback<MeetTypesResponse> {
            override fun onResponse(call: Call<MeetTypesResponse>, response: Response<MeetTypesResponse>) {
                val mainPageDataList = response.body().data
                  DB_Helper.saveMeetTypes(realm!!, response.body())
                if (mainPageDataList != null) {
                    val statusCode = response.code()
                    var listData = mapMeetToSimple(mainPageDataList);
                    meetTypesList = listData;
                    init_params_RV(listData!!)
                    Log.e("meetTypesList", mainPageDataList!!.get(0).value)
                    getData();
                   // realm!!.deleteAll()






                } else {
                    finish()
                    Toast.makeText(this@MomentalMeetsActivity, getString(R.string.error_data), Toast.LENGTH_SHORT).show()

                }
            }

            override fun onFailure(call: Call<MeetTypesResponse>, t: Throwable) {
                // Log error here since request failed
                setError(getString(R.string.unknown_data));
            }
        })
    }

    var isExpandableLayoutVisible = false;
    fun init_searchParams_view() {
        expandable_layout.visibility = ViewGroup.GONE
        init_dateClicks();
        expand_button.setOnClickListener {
            when (isExpandableLayoutVisible) {
                false -> {
                    expandable_layout.visibility = ViewGroup.VISIBLE
                }
                true -> {
                    expandable_layout.visibility = ViewGroup.GONE
                }
            }
            isExpandableLayoutVisible = !isExpandableLayoutVisible
        }

    }

    fun init_dateClicks() {
        one_hour_RB.setOnClickListener {
            selectedTimeType = 1
        }
        two_hour_RB.setOnClickListener {
            selectedTimeType = 2
        }
    }

    private var mAdapter: RecyclerView.Adapter<*>? = null
    fun init_params_RV(item_list: List<SimpleTypeDatum>) {
        var mLayoutManager = LinearLayoutManager(this@MomentalMeetsActivity)
        search_params_RV!!.layoutManager = mLayoutManager
        mAdapter = SearchParamsAdapter(item_list, this)
        search_params_RV!!.adapter = mAdapter
    }

    override fun onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy()
    }

    var ispaused = false
    override fun onPause() {
        ispaused = true
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
        if (ispaused) {
            getData()
            ispaused = false
        }
    }


}
