package com.zoomapps.eromance.Activities


import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.*

import com.appyvet.rangebar.RangeBar
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.BaseActivity
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.*
import com.zoomapps.eromance.R
import fr.ganfra.materialspinner.MaterialSpinner
import kotterknife.bindView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class SearchPairActivity : AppCompatActivity() {

    internal val rangebarHight: RangeBar by bindView(R.id.rangebar_hight)
    internal val rangebarAge: RangeBar by bindView(R.id.rangebar_age)
    internal val tvTickStartHight: TextView by bindView(R.id.tv_tick_start_height)
    internal val tvTickEndHight: TextView by bindView(R.id.tv_tick_end_height)
    internal val tvTickStartAge: TextView by bindView(R.id.tv_tick_start_age)
    internal val tvTickEndAge: TextView by bindView(R.id.tv_tick_end_age)

    val rb_all :RadioButton by bindView(R.id.rb_all)
    val rb_my_city :RadioButton by bindView(R.id.rb_my_city)

    val ms_acquainted :MaterialSpinner by bindView(R.id.ms_acquainted)
    val ms_target :MaterialSpinner by bindView(R.id.ms_target)

    val ms_country :MaterialSpinner by bindView(R.id.ms_country)
    val ms_city :MaterialSpinner by bindView(R.id.ms_city)
    val ms_type_appearance :MaterialSpinner by bindView(R.id.ms_type_appearance)
    val cb_add_setting :CheckBox by bindView(R.id.cb_add_setting)
    val cb_online_user :CheckBox by bindView(R.id.cb_online_user)
    val search_btn :Button by bindView(R.id.search_btn)
    val clear_IV : ImageView by bindView(R.id.clear_IV)
    var heightFrom = 0;
    var heightTo = 0;
    var ageFrom = 0;
    var ageTo = 0;
    var loadingPD : ProgressDialog ?=null
    var isOnlineUser_search = false;
    var checked_city : Int?=null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_pair)
        setToolbar(this ,
                getString(R.string.couples),
                findViewById<TextView>(R.id.tv_map) as TextView,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView , true)
        loadingPD= ProgressDialog(this)
        loadingPD?.setCancelable(false);
        loadingPD?.setMessage(getString(R.string.go_upload))
        initRangeBar()
        setBtnClicks()
        setRadioBts()
        setCheckBoxes();
        getSpinnerValues()

        clear_IV.setOnClickListener{
            clearFields();
        }
    }

    fun clearFields(){
        startActivity(Intent(this@SearchPairActivity,SearchPairActivity::class.java))
        finish();
    }

    internal var arrayMs_acquainted: ArrayAdapter<String>?=null
    internal var arrayMs_city: ArrayAdapter<String>?=null
    internal var arrayMs_country: ArrayAdapter<String>?=null
    internal var arrayMs_apperance: ArrayAdapter<String>?=null
    var spinnerDataList :List<QuessionariesValuesDatum>?=null
    fun getIntList(group_id:Int):List<String>{
        var sendData = ArrayList<String>();
        var tmp_list =  spinnerDataList?.filter { it->it.groupId == group_id }?.toList()
        for(tmp in tmp_list!!){
            sendData.add(tmp.key!!)
        }
        return sendData
    }
    fun getIdFromKey(key:String,group_id:Int = 5):Int{
        var tmp_list =  spinnerDataList?.filter { it->it.groupId == group_id }?.toList()
        var s_result = tmp_list?.firstOrNull{it->it.key == key}
        if(s_result!=null){
            return s_result.id!!
        }
        return 0
    }
    var selectedSex :Int?= null;
    var selectedCity :Int?= null;
    var selectedCountry :Int?= null;
    var selectedComplection :Int?= null;
    fun processSeekBar(datalist:List<QuessionariesValuesDatum>){
        spinnerDataList = datalist;


        var dictionaryData = GlobalStaticVariables.allTranslations
            arrayMs_acquainted = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, getStrList(dictionaryData?.userProfileSexes!! ))//sex


        API_Client.apiService!!.getListCities().enqueue(object : Callback<GetListCitiesModel>{
            override fun onFailure(call: Call<GetListCitiesModel>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<GetListCitiesModel>?, response: Response<GetListCitiesModel>?) {
                var listCountries = response!!.body()
                val MutlistCities: MutableList<String> = mutableListOf()
                listCountries.data.forEach({ v->
                    MutlistCities.add(v.value)
                })
                arrayMs_city = ArrayAdapter(this@SearchPairActivity,android.R.layout.simple_spinner_dropdown_item,  MutlistCities)
                ms_city.adapter = arrayMs_city
            }

        })

             API_Client.apiService!!.getListCountries().enqueue(object : Callback<GetListCountriesModel>{
                 override fun onFailure(call: Call<GetListCountriesModel>?, t: Throwable?) {

                 }

                 override fun onResponse(call: Call<GetListCountriesModel>?, response: Response<GetListCountriesModel>?) {
                     var listCountries = response!!.body()
                     val MutlistCountries: MutableList<String> = mutableListOf()
                     listCountries.data.forEach({ v->
                         MutlistCountries.add(v.value)
                     })
                     arrayMs_country = ArrayAdapter(this@SearchPairActivity,android.R.layout.simple_spinner_dropdown_item,MutlistCountries)
                     ms_country.adapter = arrayMs_country
                 }

             })









            arrayMs_apperance = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, getIntList(5) ) //Complection
            ms_acquainted.adapter = arrayMs_acquainted



        ms_acquainted.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                if (position != -1) {
                    selectedSex = TypeConvertor.staticFuns
                            .getCustomTranslations(ms_acquainted.getItemAtPosition(position).toString(),Custom_Translation_Types.sex)

                }
                else{
                    selectedSex = null
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }

        ms_city.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                if (position != -1) {
                    selectedCity = TypeConvertor.staticFuns
                            .getCustomTranslations(ms_city.getItemAtPosition(position).toString(),Custom_Translation_Types.city)
                }
                else{
                    selectedCity = null
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }

        ms_country.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                if (position != -1) {
                    selectedCountry = TypeConvertor.staticFuns
                            .getCustomTranslations(ms_country.getItemAtPosition(position).toString(),Custom_Translation_Types.country)
                }
                else{
                    selectedCountry = null
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
        ms_type_appearance.adapter = arrayMs_apperance
        ms_type_appearance.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                if (position != -1) {
                    selectedComplection = getIdFromKey(ms_type_appearance.getItemAtPosition(position).toString())
                }
                else{
                    selectedComplection = null
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
    }
    fun setCheckBoxes(){
        cb_online_user.setOnCheckedChangeListener { compoundButton, b ->
            isOnlineUser_search = b ;
        }
    }
    fun setRadioBts(){
        rb_all.setOnCheckedChangeListener { compoundButton, b ->
            checked_city = null;
        }
        rb_my_city.setOnCheckedChangeListener { compoundButton, b ->
            checked_city = 1;
        }
    }
    fun setBtnClicks(){
        search_btn.setOnClickListener {
            searchStart();
        }
    }
    val is_online:Int?
    get() { if(isOnlineUser_search) return 1 else return null}

    fun searchStart(){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        var call = apiService.searchPair(
                GlobalStaticVariables.language_type!!,
                age_from =ageFrom ,
                age_to=ageTo,
                height_from = heightFrom,
                height_to = heightTo,
                complection = selectedComplection,
                sex = selectedSex,
                country_id = selectedCountry,
                is_online=is_online,
                city_id = selectedCity)

        call.enqueue(object : Callback<SearchPairModel.SearchPairResponse> {
            override fun onResponse(call: Call<SearchPairModel.SearchPairResponse>,
                                    response: Response<SearchPairModel.SearchPairResponse>) {
                if(response.body() == null || response.body().data==null)
                    return
                val mainPageDataList = response.body().data
                if(mainPageDataList != null&& mainPageDataList.isNotEmpty() ) {
                    val statusCode = response.code()
                    if(response.body()?.data?.isEmpty()!!){
                        showPreparedToast(this@SearchPairActivity,"Result_Empty");
                    }
                    else{
                        startActivity(Intent(this@SearchPairActivity,FoundPairUserList::class.java).putExtra("data",serializeToJson(response.body())));
                    }
                }
                else {
                    Toast.makeText(this@SearchPairActivity,getString(R.string.error_data), Toast.LENGTH_SHORT).show()

                }
            }

            override fun onFailure(call: Call<SearchPairModel.SearchPairResponse>, t: Throwable) {
                // Log error here since request failed
                Toast.makeText(this@SearchPairActivity,"Error", Toast.LENGTH_SHORT).show();
            }
        })

    }
    private fun initRangeBar() {
        rangebarHight.tickStart = 0f ;
        rangebarHight.tickEnd = GlobalStaticVariables.maxUserHeight.toFloat();
        rangebarHight.setOnRangeBarChangeListener { rangeBar, leftPinIndex, rightPinIndex, leftPinValue, rightPinValue ->
            tvTickStartHight.text = leftPinValue
            tvTickEndHight.text = rightPinValue
            heightFrom = leftPinValue.toInt();
            heightTo = rightPinValue.toInt();

        }
        rangebarHight.left = GlobalStaticVariables.maxUserHeight;
        heightTo = GlobalStaticVariables.maxUserHeight;
        tvTickEndHight.text = heightTo.toString()

        rangebarAge.tickStart = 0f;
        rangebarAge.tickEnd = 80f;
        rangebarAge.setOnRangeBarChangeListener { rangeBar, leftPinIndex, rightPinIndex, leftPinValue, rightPinValue ->
            tvTickStartAge.text = leftPinValue
            tvTickEndAge.text = rightPinValue
            ageFrom = leftPinValue.toInt();
            ageTo = rightPinValue.toInt();
        }
        ageTo = 80;
        tvTickEndAge.text = ageTo.toString()

        rangebarAge.left =  80;
    }
    fun getSpinnerValues(){
        loadingPD?.show()
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getQuessionaryVariants()
        call.enqueue(object : Callback<QuessionariesValues> {
            override fun onResponse(call: Call<QuessionariesValues>, response: Response<QuessionariesValues>) {
                loadingPD?.cancel()
                val mainPageDataList = response.body().data
                if(mainPageDataList != null ) {
                    val statusCode = response.code()
                    var listData =  mainPageDataList;
                    processSeekBar(listData)
                }
                else {
                    finish()
                    Toast.makeText(this@SearchPairActivity,getString(R.string.error_data), Toast.LENGTH_SHORT).show()

                }
            }

            override fun onFailure(call: Call<QuessionariesValues>, t: Throwable) {
                // Log error here since request failed
                loadingPD?.cancel()
                Toast.makeText(this@SearchPairActivity,"Error", Toast.LENGTH_SHORT).show();
            }
        })
    }
}
