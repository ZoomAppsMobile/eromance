package com.zoomapps.eromance.Activities

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.view.View
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.*
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Adapters.Connection_ResultList_Adapter
import com.zoomapps.eromance.Adapters.SearchParamsAdapter
import com.zoomapps.eromance.BaseActivity
import com.zoomapps.eromance.Controllers.Server_Entities
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.Helpers.DB_Helper
import com.zoomapps.eromance.Helpers.DB_Helper.mapEveningToSimple
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.MenuClickListener
import com.zoomapps.eromance.Helpers.MenuData_Setter
import com.zoomapps.eromance.Interfaces.TypesAdapterInteraction
import com.zoomapps.eromance.Models.*
import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView
import io.realm.Realm
import kotterknife.bindView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*

class EveningsListActivity : BaseActivity(), TypesAdapterInteraction ,
        DatePickerDialog.OnDateSetListener,TimePickerDialog.OnTimeSetListener ,
        View.OnClickListener{

    override fun addType(type_id: Int) {
        selectedTypes.add(type_id)
    }

    override fun checkType(type_id: Int): Boolean {
        return selectedTypes.contains(type_id)
    }

    override fun removeType(type_id: Int) {
        selectedTypes.remove(type_id)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.tv_currentDateFrom->
            {
                clickedType = "from"
                DatePickerDialog(this@EveningsListActivity, this,
                        dateFromCalendar?.get(Calendar.YEAR)!!,
                        dateFromCalendar?.get(Calendar.MONTH)!!,
                        dateFromCalendar?.get(Calendar.DAY_OF_MONTH)!!).show()
            }
            R.id.tv_currentDateBefore->
            {
                clickedType = "to"
                DatePickerDialog(this@EveningsListActivity, this,
                        dateToCalendar?.get(Calendar.YEAR)!!,
                        dateToCalendar?.get(Calendar.MONTH)!!,
                        dateToCalendar?.get(Calendar.DAY_OF_MONTH)!!).show()
            }
            R.id.tv_currentTimeFrom->{
                clickedType = "from"
                showTimePicker(clickedType)
            }
            R.id.tv_currentTimeBefore->{
                clickedType = "to"
                showTimePicker(clickedType)
            }
        //TODO:ADD Time click
        }

    }

    var selectedTypes  = ArrayList<Int>()
    val expand_button : LinearLayout by bindView(R.id.expand_button)
    // val arrow_frame_btn : TextView by bindView(R.id.arrow_frame_btn)
    val btn_arrow_top : Button by bindView(R.id.btn_arrow_top)
    val btn_arrow_bot : Button by bindView(R.id.btn_arrow_bot)

    val expandable_layout : LinearLayout by bindView(R.id.expandable_layout)
    val Ll_date_meseting : TextView by bindView(R.id.Ll_date_meseting)
    val tv_date_meeting : TextView by bindView(R.id.tv_date_meeting)
    val tv_time_meeting : TextView by bindView(R.id.tv_time_meeting)

    val to_date_tv : TextView by bindView(R.id.tv_currentDateBefore)
    val to_time_tv : TextView by bindView(R.id.tv_currentTimeBefore)
    val from_date_tv : TextView by bindView(R.id.tv_currentDateFrom)
    val from_time_tv : TextView by bindView(R.id.tv_currentTimeFrom)

    val dateTo_LL : LinearLayout by bindView(R.id.dateTo_LL)
    val dateFrom_LL : LinearLayout by bindView(R.id.dateFrom_LL)

    val search_params_RV : RecyclerView by bindView(R.id.search_params_RV)

    val loading_PG : ProgressBar by bindView(R.id.loading_PG)
    val search_btn : Button by bindView(R.id.startSearching_BTN)
    var eveningTypesList : List<SimpleTypeDatum>?= null
    val eveningsList_RV : RecyclerView by bindView(R.id.eveningsList_RV)
    val date_range_container : LinearLayout by bindView(R.id.date_range_container)
    val timeLabel_RL : RelativeLayout by bindView(R.id.timeLabel_RL)
    var realm : Realm ?=null

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
    val tv_errorMsg : TextView by bindView(R.id.tv_errorMsg)

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
        setContentView(R.layout.activity_evenings_list)

        setToolbar(this ,
                getString(R.string.plans),
                findViewById<TextView>(R.id.tv_map),
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) ,
                false,
                findViewById<DrawerLayout>(R.id.drawer_layout))

        Realm.init(this);
        realm = Realm.getDefaultInstance()
        setMenuClicks();
        MenuData_Setter(this).setMenuData(cur_username_NAV_TV,cur_country_NAV_TV,
                cur_city_NAV_TV,cur_coins_NAV_TV,profile_image_CIV,
                (findViewById<RatingBar>(R.id.go_rating)),
                (findViewById<TextView>(R.id.rating_value_TV) ),findViewById<RelativeLayout>(R.id.network_status_container) )
        date_range_container.visibility = ViewGroup.VISIBLE
        timeLabel_RL.visibility = ViewGroup.VISIBLE
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener{ view ->
            startActivity(Intent(this,EveningsCreateActivity::class.java))
        }
        init_searchParams_view();
        checkValueData();
        search_btn.setOnClickListener {
            isExpandableLayoutVisible = false;
            expandable_layout.visibility=ViewGroup.GONE
            getData(true)
        }
    }
    fun checkValueData(){
        var savedTypes = (DB_Helper.getEveningsTypes(realm!!));
        if(savedTypes == null ){
            getTypes();
        }
        else{
            var setType = mapEveningToSimple(savedTypes)
            eveningTypesList = setType;
            init_params_RV(eveningTypesList!!)
            getData();
        }
    }

    var clickedType : String = ""
    var dateFromCalendar : Calendar?=null
    var dateToCalendar : Calendar?=null

    override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {
        when(clickedType)
        {
            "from"->
            {
                dateFromCalendar?.set(Calendar.HOUR_OF_DAY, p1);
                dateFromCalendar?.set(Calendar.MINUTE, p2);
                updateLabel("from");
            }
            "to"->
            {
                dateToCalendar?.set(Calendar.HOUR_OF_DAY, p1);
                dateToCalendar?.set(Calendar.MINUTE, p2);
                updateLabel("to");
            }
        }
    }

    fun setError(message:String?){
        if(message==null)
            return
        tv_errorMsg.visibility = View.VISIBLE
        showToast(this,message);
        tv_errorMsg.text = message
    }

    fun  init_dateClicks(){
        dateFromCalendar =Calendar.getInstance()
        dateToCalendar =Calendar.getInstance()
        from_date_tv.setOnClickListener(this)
        from_time_tv.setOnClickListener(this)
        to_date_tv.setOnClickListener(this)
        to_time_tv.setOnClickListener(this)
        updateLabel("from")
        updateLabel("to")
    }
    fun showTimePicker(type:String)
    {
        when(type)
        {
            "from"->
            {
                TimePickerDialog(this,this,dateFromCalendar?.get(Calendar.HOUR_OF_DAY)!!,
                        dateFromCalendar?.get(Calendar.MINUTE)!!,true).show();

            }
            "to"->{
                TimePickerDialog(this,this,dateToCalendar?.get(Calendar.HOUR_OF_DAY)!!,
                        dateToCalendar?.get(Calendar.MINUTE)!!,true).show();
            }
        }
    }
    override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int)
    {
        when(clickedType)
        {
            "from"->
            {
                dateFromCalendar?.set(Calendar.YEAR, p1);
                dateFromCalendar?.set(Calendar.MONTH, p2);
                dateFromCalendar?.set(Calendar.DAY_OF_MONTH, p3);
            }
            "to"->
            {
                dateToCalendar?.set(Calendar.YEAR, p1);
                dateToCalendar?.set(Calendar.MONTH, p2);
                dateToCalendar?.set(Calendar.DAY_OF_MONTH, p3);
            }
        }
        showTimePicker(clickedType)
    }

    fun updateLabel(time_type:String)
    {
        val myFormat = "yyyy-MM-dd HH:mm:ss" //In which you need put here
        val sdf = SimpleDateFormat(myFormat, Locale.US)
        when(time_type){
            "from"->{
                var str_date  = sdf.format(dateFromCalendar?.time);
                var splited_date = str_date.split(" ");
                from_date_tv.text = splited_date[0].toString()
                from_time_tv.text = splited_date[1].toString()
            }
            "to"->{
                var str_date  = sdf.format(dateToCalendar?.time);
                var splited_date = str_date.split(" ");
                to_date_tv.text = splited_date[0].toString()
                to_time_tv.text = splited_date[1].toString()
            }
        }
    }

    var isExpandableLayoutVisible = false;
    fun init_searchParams_view(){
        expandable_layout.visibility = ViewGroup.GONE
        init_dateClicks();
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

    }
    var mAdapter : RecyclerView.Adapter<*>?=null
    fun init_params_RV(item_list:List<SimpleTypeDatum>){
        var  mLayoutManager = LinearLayoutManager(this@EveningsListActivity)
        search_params_RV!!.layoutManager = mLayoutManager
        mAdapter = SearchParamsAdapter(item_list,this)
        search_params_RV!!.adapter = mAdapter
    }
    fun getTypes(){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getEveningTypes()
        call.enqueue(object : Callback<EveningTypesResponse> {
            override fun onResponse(call: Call<EveningTypesResponse>, response: Response<EveningTypesResponse>) {
                val mainPageDataList = response.body().data
              //  response.body().data?.forEach { it->it.type_id = 2}
                DB_Helper.saveEveningTypes(realm!!,response.body())
                if(mainPageDataList != null&& mainPageDataList.isNotEmpty() ) {
                    val statusCode = response.code()
                    var listData =  mainPageDataList;
                    eveningTypesList = mapEveningToSimple(mainPageDataList);
                    init_params_RV(eveningTypesList!!)
                    getData();
                }
                else {
                    finish()
                    showToast(this@EveningsListActivity,getString(R.string.error_data))

                }
            }

            override fun onFailure(call: Call<EveningTypesResponse>, t: Throwable) {
                // Log error here since request failed
                setError(getString(R.string.unknown_data))
               // showPreparedToast(this@EveningsListActivity,"Error")
            }
        })
    }

    var start_Date : String =""
    var end_Date : String = ""

    fun getData(ifFilter:Boolean  = false)
    {
        tv_errorMsg.visibility = View.GONE
        loading_PG.visibility =ViewGroup.VISIBLE
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        if(ifFilter) {
            val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            val formattedFrom = sdf.format(dateFromCalendar?.getTime())
            val formattedTo = sdf.format(dateToCalendar?.getTime())
            val _call = apiService
                    .getFilteredEvenings(GlobalStaticVariables.language_type!!,evening_types = if(selectedTypes.isNotEmpty())selectedTypes else null)
                //  started_at =  if(formattedFrom.isNotEmpty()) formattedFrom else null ,
                  //  finished_at = if(formattedTo.isNotEmpty()) formattedTo else null)
            handle_request(_call)
        }
        else{
            val _call = apiService.getEvening(GlobalStaticVariables.language_type!!)
            handle_request(_call)
        }
    }
    fun handle_request (call: Call<EveningsModel.EveningListResponse>){
        call.enqueue(object : Callback<EveningsModel.EveningListResponse> {
            override fun onResponse(call: Call<EveningsModel.EveningListResponse>,
                                    response: Response<EveningsModel.EveningListResponse>) {
                loading_PG.visibility = ViewGroup.GONE
                val mainPageDataList = response.body()
                if(mainPageDataList != null&& mainPageDataList.data!=null&& mainPageDataList?.data?.isNotEmpty()!! ) {
                    val statusCode = response.code()
                    var listData =  mainPageDataList;
                    init_rv_data(mainPageDataList?.data!!)
                }
                else if(mainPageDataList!=null) {
                    if (response.body().code != 1)
                        setError(getString(R.string.error_data))
                    else {
                        init_rv_data(null)
                    }
                }
                else{
                    setError(getString(R.string.error_server))
                }
            }

            override fun onFailure(call: Call<EveningsModel.EveningListResponse>, t: Throwable) {
                loading_PG.visibility = ViewGroup.GONE
                setError(getString(R.string.unknown_data))
            }
        })
    }
    private var mAdapter2: RecyclerView.Adapter<*>? = null
    var sr_data_list:MutableList<MeetsModel.Datum> ?=null
    var mainmLayoutManager : LinearLayoutManager?=null
    fun init_rv_data(datum:List<MeetsModel.Datum>?) {
        var data_list = ArrayList<MeetsModel.Datum>()
        if(datum!=null){
            data_list.addAll(datum)
        }
        else{
            setError(getString(R.string.empty))
        }
        loading_PG.visibility = ViewGroup.GONE
        if(sr_data_list==null) {
            sr_data_list = ArrayList<MeetsModel.Datum>()
            sr_data_list?.addAll(data_list)
            mainmLayoutManager= LinearLayoutManager(this@EveningsListActivity)
            eveningsList_RV.layoutManager = mainmLayoutManager
            mAdapter2 = Connection_ResultList_Adapter(sr_data_list,this , Server_Entities.Evening, "123")
            eveningsList_RV.adapter = mAdapter2
        }
        else{
            sr_data_list?.clear()
            sr_data_list?.addAll(data_list)
            mAdapter2?.notifyDataSetChanged()
        }
    }
    var ispaused = false
    override fun onPause() {
        ispaused = true
        super.onPause()
    }
    override fun onResume() {
        super.onResume()
        if(ispaused) {
            getData()
            ispaused = false
        }
    }
}
