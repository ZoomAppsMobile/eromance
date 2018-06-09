package com.zoomapps.eromance.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.zoomapps.eromance.R
import kotterknife.bindView
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Interfaces.RequestMakerListener
import com.zoomapps.eromance.Models.TwentyOneModel
import com.zoomapps.eromance.Models.Types.UserServiceTypes
import com.zoomapps.eromance.Models.UpdateProfileModel
import fr.ganfra.materialspinner.MaterialSpinner
import retrofit2.Call
import retrofit2.Retrofit
import java.util.*


class TwentyOneBecomeProviderActivity : AppCompatActivity() , RequestMakerListener{
    override fun <T> onError(out: T?) {
        showPreparedToast(this, getString(R.string.error))

    }
    var successfullRequest:Int=0
    override fun <T> onRequestSuccess(out: T) {
        when (out) {
            is TwentyOneModel.UserBecomeProviderResponse->{
                var data = out as TwentyOneModel.UserBecomeProviderResponse;
                if (data.code == 1) {
                    showPreparedToast(this, getString(R.string.go_upload))
                    PrefSingleton.instance.writeBooleanPreference(GlobalVariables.is_becomeprovider_request_send_key, true)
                    successfullRequest++;
                }
            }
            is UpdateProfileModel.UpdateProfileResponse->{
                successfullRequest++;
            }
        }
        if(successfullRequest==2)
            finish()
    }
    val rqstMkr = RequestMaker(this)
    val btn_cancel : Button by bindView(R.id.btn_cancel)
    val btn_send_request : Button by bindView(R.id.btn_send_request)
//    val rb_delicate_conversation : RadioButton by bindView(R.id.rb_delicate_conversation)
//    val rb_strep_dance : RadioButton by bindView(R.id.rb_strep_dance)
//    val rb_accompanying_escord : RadioButton by bindView(R.id.rb_accompanying_escord)
//    val rb_professional_massage : RadioButton by bindView(R.id.rb_professional_massage)
//    val type_radioGroup : RadioGroup by bindView(R.id.type_radioGroup)
    val ms_service_types : MaterialSpinner by bindView(R.id.ms_service_types)
    var selectedType : Int?=-1
    val convertorHelper =  TypeConvertor(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twenty_one_become_provider)
        setBtnsAction()
    }
    fun getList():List<String>?{
        var sendList = ArrayList<String>()
        var dataList = GlobalStaticVariables.userServicesTypes_LIST?.toList()
        for( tmp in dataList!!){
            sendList.add(tmp.key!!)
        }
        return sendList
    }

    fun setBtnsAction(){
        btn_cancel.setOnClickListener {
            finish()
        }
        btn_send_request.setOnClickListener {
            //TODO : make send request
            val apiService = API_Client.client!!.create(API_Interface::class.java)
            val call = apiService.become_twentyOne_Provider(GlobalStaticVariables.myId.toString() , selectedType)
            val call2 = apiService.becomeAdult(GlobalStaticVariables.language_type!!,profile_id = GlobalStaticVariables.myData?.profile?.data?.id!!,
                    is_adult = 1, real_name = GlobalStaticVariables.myData?.profile?.data?.realName!!,
                    born_at = GlobalStaticVariables.myData?.profile?.data?.bornAt!!,
                    user_id = GlobalStaticVariables.myData?.id!!,
                    sex_id = GlobalStaticVariables.myData?.profile?.data?.sexId!!,
                    search_for = GlobalStaticVariables.myData?.profile?.data?.searchFor!!,
                    country_id = GlobalStaticVariables.myData?.profile?.data?.countryId!!,
                    city_id = GlobalStaticVariables.myData?.profile?.data?.cityId!!,
                    language_id = GlobalStaticVariables.myData?.profile?.data?.languageId!!
            )
            rqstMkr.makeRequest(call)
            if( GlobalStaticVariables.myData?.profile?.data?.isAdult==false) {
                rqstMkr.makeRequest(call2)
            }
            else{
                successfullRequest++;
            }
        }

       var arrayMs_service_status = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, getList() )
        ms_service_types.adapter = arrayMs_service_status
        ms_service_types.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val cur_group_id = 1
                if(position ==-1){
                    selectedType = -1;
                }
                else {
                    val selected = ms_service_types.getItemAtPosition(position).toString()
                    selectedType =  convertorHelper.getIdByKey(UserServiceTypes::class.java, selected);
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }

        }

    }
}
