package com.zoomapps.eromance.Activities


import android.app.ProgressDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.*
import com.google.gson.JsonObject
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Helpers.GlobalStaticVariables

import com.zoomapps.eromance.R

import java.util.ArrayList

import fr.ganfra.materialspinner.MaterialSpinner
import kotterknife.bindView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.google.gson.JsonArray
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.maxUserHeight
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.maxUserWeight
import com.zoomapps.eromance.Models.*


class UserQuessionaryActivity : AppCompatActivity() {

    internal var valueLanguagStat: Int = 0
    internal var valueFamilyStat: Int = 0
    internal var valueChildren: Int = 0
    internal var valueCharacter: Int = 0
    internal var valueComplection: Int = 0
    internal var valueSmoking: Int = 0
    internal var valueAlchohol: Int = 0
    internal var valueHair: Int = 0
    internal var valueCareer: Int = 0
    internal var valueCar : Int =0

    internal var i = 1

    internal var list: MutableList<Int> = ArrayList()
    internal var arrayMs_languag_status: ArrayAdapter<String>?=null
    internal var arrayMs_famaly_status: ArrayAdapter<String>?=null
    internal var arrayMs_children: ArrayAdapter<String>?=null
    internal var arrayMs_character: ArrayAdapter<String>?=null
    internal var arrayMs_complection: ArrayAdapter<String>?=null
    internal var arrayMs_smoking: ArrayAdapter<String>?=null
    internal var arrayMs_alchohol: ArrayAdapter<String>?=null
    internal var arrayMs_career: ArrayAdapter<String>?=null
    internal var arrayMs_hair: ArrayAdapter<String>?=null
    internal var arrayMs_car: ArrayAdapter<String>?=null

    internal val mMs_languag_status: MaterialSpinner  by bindView(R.id.ms_languag_stat)
    internal val mMs_famaly_status: MaterialSpinner  by bindView(R.id.ms_family_stat)
    internal val mMs_children: MaterialSpinner by bindView(R.id.ms_children)
    internal val mMs_character: MaterialSpinner by bindView(R.id.ms_character)
    internal val mMs_complection: MaterialSpinner by bindView(R.id.ms_complection)
    internal val mMs_smoking: MaterialSpinner by bindView(R.id.ms_smoking)
    internal val mMs_alchohol: MaterialSpinner by bindView(R.id.ms_alchohol)
    internal val mMs_career: MaterialSpinner by bindView(R.id.ms_career)
    internal val mMs_car: MaterialSpinner by bindView(R.id.ms_car)
    internal val mMs_hair: MaterialSpinner by bindView(R.id.ms_hair)
    internal val mEd_about_me: EditText by bindView(R.id.ed_about_me)
    internal val mEd_interests: EditText by bindView(R.id.ed_interests)

    internal val mTv_languag_status_hint: TextView by bindView(R.id.tv_languag_status_hint)
    internal val mTv_famaly_status_hint: TextView by bindView(R.id.tv_family_status_hint)
    internal val mTv_children_hint: TextView by bindView(R.id.tv_children_hint)
    internal val mTv_character_hint: TextView by bindView(R.id.tv_character_hint)
    internal val mTv_complection_hint: TextView by bindView(R.id.tv_complection_hint)
    internal val mTv_smoking_hint: TextView by bindView(R.id.tv_smoking_hint)
    internal val mTv_alchohol_hint: TextView by bindView(R.id.tv_alchohol_hint)
    internal val mTv_career_hint: TextView by bindView(R.id.tv_career_hint)
    internal val mTv_car_hint: TextView by bindView(R.id.tv_car_hint)
    internal val mTv_hair_hint: TextView by bindView(R.id.tv_hair_hint)
    internal val mTv_height_hint: TextView by bindView(R.id.tv_height)
    internal val user_height_SB : SeekBar by bindView(R.id.user_height_SB)
    internal val user_weight_SB : SeekBar by bindView(R.id.user_weight_SB)
    val tv_value_weight : TextView by bindView(R.id.tv_value_weight)
    val tv_value_height : TextView by bindView(R.id.tv_value_height)
    val btn_skipe : Button by bindView(R.id.btn_skipe)
    var loadingPD : ProgressDialog ? = null
    val questions_with_keys_group_id_list = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    var user_weight : Int?=null
    var user_height :Int?=null
    var user_interests :String?=null
    var user_about :String?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_neob)
        GlobalSendData = ArrayList<UserQuessionary.UserAdditionalRequestDatum>()
        if( intent.getBooleanExtra("isEdit",false)){
            btn_skipe.text = getString(R.string.save)
        }
        loadingPD = ProgressDialog(this)
        loadingPD?.setMessage(getString(R.string.go_upload))
        loadingPD?.setCancelable(false)

        init_EditTextChanges()
        getSpinnerValues()




        changehint()
        initSeekbar()
        init_button()
    }
    fun init_button(){
        btn_skipe.setOnClickListener {
            sendProfileData();
        }
    }
    fun init_EditTextChanges(){
        mEd_about_me.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val cur_group_id = 13
                if(p0.isNullOrBlank()){
                  //  removeElement(cur_group_id)
                    user_about = null
                }
                else {
                    user_about = p0.toString()
                   // makeFieldChanges(cur_group_id,str_Value_p2 = p0.toString(),quessionary_value2 = 47)
                }
            }

        })
        mEd_interests.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val cur_group_id = 14
                if(p0.isNullOrBlank()){
                    //removeElement(cur_group_id)
                    user_interests = null
                }
                else {
                    user_interests = p0.toString()
                  //  makeFieldChanges(cur_group_id,str_Value_p2 = p0.toString(),quessionary_value2 = 48)
                }
            }

        })
    }
    fun getIntList(group_id:Int):List<String>{
        var sendData = ArrayList<String>();
         var tmp_list =  spinnerDataList?.filter { it->it.groupId == group_id }?.toList()
        for(tmp in tmp_list!!){
            sendData.add(tmp.key!!)
        }
        return sendData
    }
    fun getIntListIndex(group_id:Int,value_id:Int):Int{
        var tmp_list =  spinnerDataList?.filter { it->it.groupId == group_id }?.toList()
         var retData = tmp_list?.indexOfFirst { it->it.id == value_id }
        return if(retData!=null ) retData else -1
    }
    var spinnerDataList :List<QuessionariesValuesDatum>?=null
    fun processSeekBar(datalist:List<QuessionariesValuesDatum>){
        spinnerDataList = datalist;
        arrayMs_languag_status = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, getIntList(1) )
        arrayMs_famaly_status = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, getIntList(2 ) )
        arrayMs_children = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, getIntList( 3) )
        arrayMs_character = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, getIntList( 4) )
        arrayMs_complection = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, getIntList(5 ) )
        arrayMs_smoking = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, getIntList(6 ) )
        arrayMs_alchohol = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, getIntList( 7) )
        arrayMs_career = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, getIntList(8 ) )
        arrayMs_hair = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, getIntList(10 ) )
        arrayMs_car = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, getIntList( 9) )
        // initItem()
        spinnerListHint()
    }
    fun getSpinnerValues(){
        loadingPD?.show()
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getQuessionaryVariants()
        call.enqueue(object : Callback<QuessionariesValues> {
            override fun onResponse(call: Call<QuessionariesValues>, response: Response<QuessionariesValues>) {
                loadingPD?.cancel()
                val mainPageDataList = response.body().data
                if(mainPageDataList != null&& mainPageDataList.isNotEmpty() ) {
                    var listData =  mainPageDataList;
                    processSeekBar(listData)
                    getLastData()
                }
                else {
                    finish()
                    Toast.makeText(this@UserQuessionaryActivity,getString(R.string.error_data), Toast.LENGTH_SHORT).show()

                }
            }

            override fun onFailure(call: Call<QuessionariesValues>, t: Throwable) {
                // Log error here since request failed
                loadingPD?.cancel()
                Toast.makeText(this@UserQuessionaryActivity,getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })
    }

    fun getLastData(){
        //TODO:CHANGE
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getMyProfileData(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myData?.profile?.data?.id.toString())

        Log.d("MyEiD",GlobalStaticVariables.myData?.profile?.data?.id.toString())

        call.enqueue(object : Callback<Update_Profile_Model.ResponseData> {
            override fun onResponse(call: Call<Update_Profile_Model.ResponseData>, response: Response<Update_Profile_Model.ResponseData>) {
                loadingPD?.cancel()
                val mainPageDataList = response.body().data
                if(mainPageDataList != null ) {
                    val statusCode = response.code()
                    var listData =  mainPageDataList;
                    setDataToSpinners(listData)
                    Log.d("satues","puytr")
                }
                else {
                    finish()
                    Toast.makeText(this@UserQuessionaryActivity,getString(R.string.error_data), Toast.LENGTH_SHORT).show()

                }
            }

            override fun onFailure(call: Call<Update_Profile_Model.ResponseData>, t: Throwable) {
                // Log error here since request failed
                loadingPD?.cancel()
                Toast.makeText(this@UserQuessionaryActivity,getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })
    }

    fun setDataToSpinners(datum: Update_Profile_Model.Data?){



        if(datum == null || datum?.user==null|| datum?.user?.data==null||datum?.user?.data?.questionnaires ==null ||
                datum?.user?.data?.questionnaires?.data?.isEmpty()!! )
            return
        user_height_SB.progress = if(datum?.height!=null)datum?.height!! else 0
        user_weight_SB.progress = if(datum?.weight!=null)datum?.weight!! else 0
        var emptyString = ""
        mEd_about_me.setText(if(datum?.aboutPerson!=null) datum?.aboutPerson?.toString() else emptyString)
        mEd_interests.setText(if(datum?.aboutInterests!=null) datum?.aboutInterests!! else emptyString)

        var quessionariesData =  datum?.user?.data?.questionnaires?.data
        for(tmp in questions_with_keys_group_id_list){
            var tmp_froup_data = quessionariesData?.firstOrNull{it->it.groupId == tmp}
            if(tmp_froup_data!=null)
             setValueToSpinners(tmp,tmp_froup_data)
        }
    }

    fun setValueToSpinners(group_id:Int , data: Update_Profile_Model.Datum){
        var index = getIntListIndex(group_id , data.questionnaireId!!) +1
        Log.e("GROUP_ID",group_id.toString())
        Log.e("Index_ID",index.toString())
        when (group_id) {
            1 -> {
                mMs_languag_status.setSelection(index)
            }
            2 -> {
                mMs_famaly_status.setSelection(index)
            }
            3 -> {
                mMs_children.setSelection(index)
            }
            4 -> {
                mMs_character.setSelection(index)
            }
            5 -> {
                mMs_complection.setSelection(index)
            }
            6 -> {
                mMs_smoking.setSelection(index)
            }
            7 -> {
                mMs_alchohol.setSelection(index)
            }
            8 -> {
                mMs_career.setSelection(index)
            }
            9 -> {
                mMs_car.setSelection(index)
            }
            10 -> {
                mMs_hair.setSelection(index)
            }
            else -> {

            }

        }


    }

    fun genereateJsonForProfile(dataobj:JsonObject):JsonObject{
        var baseJsonData = JsonObject()
        baseJsonData.add("questionnaires",dataobj)
        baseJsonData.addProperty("real_name" , GlobalStaticVariables.myData?.profile?.data?.realName  )
        baseJsonData.addProperty("born_at" , GlobalStaticVariables.myData?.profile?.data?.bornAt  )
        baseJsonData.addProperty("user_id" , GlobalStaticVariables.myData?.profile?.data?.userId  )
        baseJsonData.addProperty("sex_id" , GlobalStaticVariables.myData?.profile?.data?.sexId  )
        baseJsonData.addProperty("search_for" , GlobalStaticVariables.myData?.profile?.data?.searchFor  )
        baseJsonData.addProperty("country_id" , GlobalStaticVariables.myData?.profile?.data?.countryId  )
        baseJsonData.addProperty("city_id" , GlobalStaticVariables.myData?.profile?.data?.cityId  )
        baseJsonData.addProperty("language_id" , GlobalStaticVariables.myData?.profile?.data?.languageId  )
        baseJsonData.addProperty("weight" , user_weight )
        baseJsonData.addProperty("height" , user_height )
        baseJsonData.addProperty("about_person" , user_about )
        baseJsonData.addProperty("about_interests" , user_interests)
        baseJsonData.addProperty("visability_id" , "1"  )

        return  baseJsonData
    }

    fun sendTestRequest(testData: JsonObject){
        loadingPD?.show()
        val apiService = API_Client.client!!.create(API_Interface::class.java)

        val call = apiService.updateProfile(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myData?.profile?.data?.id.toString(),
                genereateJsonForProfile(testData))

        call.enqueue(object : Callback<UserProfileEditModel.UserProfileEditResponse> {
            override fun onResponse(call: Call<UserProfileEditModel.UserProfileEditResponse>,
                                    response: Response<UserProfileEditModel.UserProfileEditResponse>) {
                loadingPD?.cancel()
                val test = response.body()

                if(test != null && test.code==1) {
                    val mainPageDataList = response.body().data
                    val statusCode = response.code()
                    finish()
                }
                else {
                    Toast.makeText(this@UserQuessionaryActivity,getString(R.string.fill_field), Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<UserProfileEditModel.UserProfileEditResponse>, t: Throwable) {
                loadingPD?.cancel()
                // Log error here since request failed
                Toast.makeText(this@UserQuessionaryActivity,getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })
}
    inline fun <T> MutableList<T>.mapInPlace(mutator: (T)->T) {
        val iterate = this.listIterator()
        while (iterate.hasNext()) {
            val oldValue = iterate.next()
            val newValue = mutator(oldValue)
            if (newValue !== oldValue) {
                iterate.set(newValue)
            }
        }
    }
    var GlobalSendData : MutableList<UserQuessionary.UserAdditionalRequestDatum>?=null
    fun sendProfileData(){
        var sendTest =UserQuessionary.UserAdditionalRequest().apply{
            data = GlobalSendData?.toList()
        }
        sendTestRequest(jsonGenerator(sendTest.data!!))
    }
    fun jsonGenerator(parseData:List<UserQuessionary.UserAdditionalRequestDatum>): JsonObject {
        val jsonArray = JsonArray()
        for(tmp in parseData) {
            val payerReg = JsonObject()
            payerReg.addProperty("value", tmp.str_value)
            payerReg.addProperty("group_id", tmp.groupId)
            payerReg.addProperty("questionnaire_id", tmp.questionnaireId)
            jsonArray.add(payerReg)
        }
        val dataobj = JsonObject()

        dataobj.add("data", jsonArray)

        return dataobj
    }












    fun checkIfFieldDoExist(group_id: Int):Boolean{
        var tmp_check =  GlobalSendData?.filter{it->it.groupId==group_id}?.firstOrNull()
        if(tmp_check == null )
            return false
        else
             return true
    }
    fun elementCreator (group_id_p1: Int , str_Value_p1:String = "",
                        quessionary_value1:Int?=null) :UserQuessionary.UserAdditionalRequestDatum{
        return UserQuessionary.UserAdditionalRequestDatum().apply{
            groupId = group_id_p1
            str_value = str_Value_p1
            questionnaireId = quessionary_value1
        }
    }

    fun <T> ItChanger(group_id_p1: Int , str_Value_p1:String = "",
                      quessionary_value1:Int?=null){

    }
    fun addToGlobalSendData(group_id_p: Int , str_Value_p:String = "", quessionary_value:Int?=null){
        GlobalSendData?.add(elementCreator(group_id_p,str_Value_p,quessionary_value))
    }
    fun makeFieldChanges(group_id_p2: Int , str_Value_p2:String = "", quessionary_value2:Int?=null){
        if(checkIfFieldDoExist(group_id_p2)){
            GlobalSendData?.mapInPlace {
                if(it.groupId==group_id_p2) {
                    it.str_value =str_Value_p2
                    it.questionnaireId = quessionary_value2
                    it
                }
                else
                    it
            }
        }
        else{
            addToGlobalSendData(group_id_p2,str_Value_p2,quessionary_value2)
        }
    }

    fun initSeekbar(){
        user_height_SB.max=maxUserHeight
        user_height_SB.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                tv_value_height.text = p1.toString()
                user_height = p1
                //  makeFieldChanges(12, p1.toString(),46)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })
        user_weight_SB.max=maxUserWeight
         user_weight_SB.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
             override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                 tv_value_weight.text = p1.toString()
                 user_weight = p1
                 //  makeFieldChanges(11, p1.toString(),45)
             }

             override fun onStartTrackingTouch(p0: SeekBar?) {
             }

             override fun onStopTrackingTouch(p0: SeekBar?) {
             }

         })
    }
    private fun changehint() {
        mMs_languag_status.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: View, position: Int, id: Long) {
                valueLanguagStat = mMs_famaly_status.selectedItemPosition
                if (valueLanguagStat < i) {
                    mTv_languag_status_hint.visibility = View.GONE
                } else {
                    mTv_languag_status_hint.visibility = View.VISIBLE
                }
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // your code here
            }

        }
        mMs_famaly_status.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: View, position: Int, id: Long) {
                valueFamilyStat = mMs_famaly_status.selectedItemPosition
                if (valueFamilyStat < i) {
                    mTv_famaly_status_hint.visibility = View.GONE
                } else {
                    mTv_famaly_status_hint.visibility = View.VISIBLE
                }
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // your code here
            }

        }
        mMs_children.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: View, position: Int, id: Long) {
                valueChildren = mMs_children.selectedItemPosition
                if (valueChildren < i) {
                    mTv_children_hint.visibility = View.GONE
                } else {
                    mTv_children_hint.visibility = View.VISIBLE
                }
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // your code here
            }

        }
        mMs_character.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: View, position: Int, id: Long) {
                valueCharacter = mMs_character.selectedItemPosition
                if (valueCharacter < i) {
                    mTv_character_hint.visibility = View.GONE
                } else {
                    mTv_character_hint.visibility = View.VISIBLE
                }
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // your code here
            }

        }
        mMs_complection.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: View, position: Int, id: Long) {
                valueComplection = mMs_complection.selectedItemPosition
                if (valueComplection < i) {
                    mTv_complection_hint.visibility = View.GONE
                } else {
                    mTv_complection_hint.visibility = View.VISIBLE
                }
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // your code here
            }

        }
        mMs_smoking.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: View, position: Int, id: Long) {
                valueSmoking = mMs_smoking.selectedItemPosition
                if (valueSmoking < i) {
                    mTv_smoking_hint.visibility = View.GONE
                } else {
                    mTv_smoking_hint.visibility = View.VISIBLE
                }
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // your code here
            }

        }
        mMs_alchohol.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: View, position: Int, id: Long) {
                valueAlchohol = mMs_alchohol.selectedItemPosition
                if (valueAlchohol < i) {
                    mTv_alchohol_hint.visibility = View.GONE
                } else {
                    mTv_alchohol_hint.visibility = View.VISIBLE
                }
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // your code here
            }

        }
        mMs_career.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: View, position: Int, id: Long) {
                valueCareer = mMs_career.selectedItemPosition
                if (valueCareer < i) {
                    mTv_career_hint.visibility = View.GONE
                } else {
                    mTv_career_hint.visibility = View.VISIBLE
                }
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // your code here
            }

        }
        mMs_car.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: View, position: Int, id: Long) {
                valueCar = mMs_car.selectedItemPosition
                if (valueCar < i) {
                    mTv_car_hint.visibility = View.GONE
                } else {
                    mTv_car_hint.visibility = View.VISIBLE
                }
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // your code here
            }

        }
        mMs_hair.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: View, position: Int, id: Long) {
                valueHair = mMs_hair.selectedItemPosition
                if (valueHair < i) {
                    mTv_hair_hint.visibility = View.GONE
                } else {
                    mTv_hair_hint.visibility = View.VISIBLE
                }
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // your code here
            }

        }


    }
    fun removeElement(group_id_p: Int){
        if(checkIfFieldDoExist(group_id_p))
            GlobalSendData?.removeAll{it->it.groupId==group_id_p}
    }
    fun getElementQuessionaryIdByKey(group_id_p:Int,key_p:String):Int{
       var foundItem = spinnerDataList?.filter { it->it.groupId==group_id_p && it.key==key_p  }?.firstOrNull()
        return foundItem?.id!!
    }

    private fun spinnerListHint() {

        mMs_languag_status.adapter = arrayMs_languag_status
        mMs_languag_status.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val cur_group_id = 1
                if(position ==-1){
                    removeElement(cur_group_id)
                }
                else {
                    val selected = mMs_languag_status.getItemAtPosition(position).toString()
                    makeFieldChanges(cur_group_id,quessionary_value2 = getElementQuessionaryIdByKey(cur_group_id,selected))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

        }

        mMs_famaly_status.adapter = arrayMs_famaly_status
        mMs_famaly_status.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val cur_group_id = 2
                if(position ==-1){
                    removeElement(cur_group_id)
                }
                else {
                    val selected = mMs_famaly_status.getItemAtPosition(position).toString()
                    makeFieldChanges(cur_group_id,quessionary_value2 = getElementQuessionaryIdByKey(cur_group_id,selected))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

        }

        mMs_children.adapter = arrayMs_children
        mMs_children.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val cur_group_id = 3
                if(position ==-1){
                    removeElement(cur_group_id)
                }
                else {
                    val selected = mMs_children.getItemAtPosition(position).toString()
                    makeFieldChanges(cur_group_id,quessionary_value2 = getElementQuessionaryIdByKey(cur_group_id,selected))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

        }

        mMs_character.adapter = arrayMs_character
        mMs_character.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val cur_group_id = 4
                if(position ==-1){
                    removeElement(cur_group_id)
                }
                else {
                    val selected = mMs_character.getItemAtPosition(position).toString()
                    makeFieldChanges(cur_group_id,quessionary_value2 = getElementQuessionaryIdByKey(cur_group_id,selected))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

        }

        mMs_complection.adapter = arrayMs_complection
        mMs_complection.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val cur_group_id = 5
                if(position ==-1){
                    removeElement(cur_group_id)
                }
                else {
                    val selected = mMs_complection.getItemAtPosition(position).toString()
                    makeFieldChanges(cur_group_id,quessionary_value2 = getElementQuessionaryIdByKey(cur_group_id,selected))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

        }

        mMs_smoking.adapter = arrayMs_smoking
        mMs_smoking.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val cur_group_id = 6
                if(position ==-1){
                    removeElement(cur_group_id)
                }
                else {
                    val selected = mMs_smoking.getItemAtPosition(position).toString()
                    makeFieldChanges(cur_group_id,quessionary_value2 = getElementQuessionaryIdByKey(cur_group_id,selected))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

        }

        mMs_alchohol.adapter = arrayMs_alchohol
        mMs_alchohol.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val cur_group_id = 7
                if(position ==-1){
                    removeElement(cur_group_id)
                }
                else {
                    val selected = mMs_alchohol.getItemAtPosition(position).toString()
                    makeFieldChanges(cur_group_id,quessionary_value2 = getElementQuessionaryIdByKey(cur_group_id,selected))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

        }
        mMs_career.adapter = arrayMs_career
        mMs_career.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val cur_group_id = 8
                if(position ==-1){
                    removeElement(cur_group_id)
                }
                else {
                    val selected = mMs_career.getItemAtPosition(position).toString()
                    makeFieldChanges(cur_group_id,quessionary_value2 = getElementQuessionaryIdByKey(cur_group_id,selected))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

        }
        mMs_car.adapter = arrayMs_car
        mMs_car.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val cur_group_id = 9
                if(position ==-1){
                    removeElement(cur_group_id)
                }
                else {
                    val selected = mMs_car.getItemAtPosition(position).toString()
                    makeFieldChanges(cur_group_id,quessionary_value2 = getElementQuessionaryIdByKey(cur_group_id,selected))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

        }
        mMs_hair.adapter = arrayMs_hair
        mMs_hair.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val cur_group_id = 10
                if(position ==-1){
                    removeElement(cur_group_id)
                }
                else {
                    val selected = mMs_hair.getItemAtPosition(position).toString()
                    makeFieldChanges(cur_group_id,quessionary_value2 = getElementQuessionaryIdByKey(cur_group_id,selected))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

        }


    }


}
