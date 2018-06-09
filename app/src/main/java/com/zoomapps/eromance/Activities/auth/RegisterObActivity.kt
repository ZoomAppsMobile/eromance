package com.zoomapps.eromance.Activities.auth


import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.ViewGroup
import android.widget.*
import com.github.pinball83.maskededittext.MaskedEditText
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.Models.AccountModel.RegisterModel

import com.zoomapps.eromance.R

import kotterknife.bindView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.SocialAuthModel
import com.zoomapps.eromance.Models.SocialDataModel
import com.zoomapps.eromance.MyApplication
import java.util.*


class RegisterObActivity : AppCompatActivity() {

    var pd_loading: ProgressDialog? =null
     var list: MutableList<Int> = ArrayList()
    var arrayAdapterCountySpinner: ArrayAdapter<Int>? = null
    var arrayAdapterCitySpinner: ArrayAdapter<Int>? = null
     var arrayAdapterDateOfBirthSpinner: ArrayAdapter<Int>? = null
     var arrayAdapterNickSpinner: ArrayAdapter<Int>? = null
     var arrayAdapterSexSpinner: ArrayAdapter<Int>? = null
     var arrayAdapterTargetSpinner: ArrayAdapter<Int>? = null
     var arrayAdapterLookForSpinner: ArrayAdapter<Int>? = null
     var arrayAdapterAppearanceSpinner: ArrayAdapter<Int>? = null
     var arrayAdapterCarSpinner: ArrayAdapter<Int>? = null
 /*   val stCountySpinner: MaterialSpinner by bindView(R.id.stCounty)
    val stCitySpinner: MaterialSpinner by bindView(R.id.stCity)
    val stDateOfBirthSpinner: TextInputLayout by bindView(R.id.stDateOfBirth)
    val etDateOfBirth : EditText by bindView(R.id.etDateOfBirth)
    val stNickSpinner: MaterialSpinner  by bindView(R.id.stNick)
    val stSexSpinner: MaterialSpinner by bindView(R.id.stSex)
    val stTargetSpinner: MaterialSpinner  by bindView(R.id.stTarget)
    val stLookForSpinner: MaterialSpinner by bindView(R.id.stLookFor)
    val stAppearanceSpinner: MaterialSpinner by bindView(R.id.stAppearance)
    val stCarSpinner: MaterialSpinner by bindView(R.id.stCar)
    val user_reg_data_LL : LinearLayout by bindView(R.id.user_reg_data_LL)*/
    //For reg state views
    val basic_fields_LL : LinearLayout by bindView(R.id.basic_fields_LL)
    val fields_forKey_LL : LinearLayout by bindView(R.id.fields_forKey_LL)
    val btn_next_LL : LinearLayout by bindView(R.id.btn_next_LL)
    var reg_state = 0;
    val etUsername : EditText by bindView(R.id.etUsername)
    val etEmail : EditText by bindView(R.id.etEmail)
    val etPhone : EditText by bindView(R.id.etPhone)
    val etPass : EditText by bindView(R.id.etPass)
    val etKey : EditText by bindView (R.id.etKey)
  //  val btn_continion : Button by bindView(R.id.btn_continion)
    val btn_confirm_key : Button by bindView(R.id.btn_confirm_key)
    val tvRequestActivation : TextView by bindView(R.id.tvRequestActivation)
    var socialData:SocialDataModel?=null
    var isSocial :Boolean =false
    var maskText : MaskedEditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_ob)
        isSocial = intent.getBooleanExtra("is_social",false)
        reg_state++;




        if(isSocial){
            try {
                var test = intent.getStringExtra("social_data")
                Log.e("[SOCIAL DATA]" , test);
                var data = deSerializeToJson(intent.getStringExtra("social_data"), SocialDataModel::class.java);
                if(data!=null)
                    socialData = data
                initState(1);
            }
            catch(ex:Exception){
                finish()
                return
            }
        }
        else{
            initState();
        }
        //initItem()
        //spinnerListHint()
        initDialog();
        init_activiationKeyText();
        setSocialData();

         //   etUsername.setText("miko7777")

           // etEmail.setText("miko_982@mail.ru")

            //etPhone.setText("12315454")

            //etPass.setText(md5(String.format("123456")))

    }

    fun setSocialData() {
        if (!socialData?.username.isNullOrEmpty())
            etUsername.setText(socialData?.username)
        if (!socialData?.email_str.isNullOrEmpty())
            etEmail.setText(socialData?.email_str)
        if (!socialData?.phone_str.isNullOrEmpty())
            etPhone.setText(socialData?.phone_str)
        if (!socialData?.id.isNullOrEmpty()) {
            etPass.setText(md5(String.format("social_type=%s&id=%s", socialData?.social_type, socialData?.id)))
        }
       // etPass.visibility = View.GONE
    }

    fun md5(password:String):String{
        return password
    }

    fun initDialog(){
        pd_loading = ProgressDialog(this)
        pd_loading!!.setMessage(getString(R.string.go_upload))
        pd_loading!!.setCancelable(false)
    }
    fun initState(type:Int?=0){
        clearViews();
        when(reg_state){
            1->showBasicReg(type)
            2->showFieldForKey();
            3->showMoreReg()
            4->endRegistration();
        }
    }
    fun showLoadingDialog(request_Type : String ){
        when(request_Type){
            "Basic"->{
                pd_loading!!.setMessage(getString(R.string.go_upload))
                pd_loading!!.show()
            }
            "Key"->{
                pd_loading!!.setMessage(getString(R.string.go_upload))
                pd_loading!!.show()
            }
            "Additional"->{

            }
        }
    }
    fun showError(errorObj : RegisterModel.RegisterErrors):String{
        if(errorObj.username!=null){
            return errorObj.username!!.get(0);
        }
        else if (errorObj.email!=null){
            return errorObj.email!!.get(0);
        }
        else if(errorObj.password!=null){
            return errorObj.password!!.get(0);
        }
        else
            return getString(R.string.error)
    }
    var default_ask_key_text = MyApplication.applicationContext().resources.getString(R.string.request_key_activation)
    var salt_for_ask_key_timer = MyApplication.applicationContext().resources.getString(R.string.can_request_key_activation)
    var key_request_timeout = 30
    var is_timer_active = false
    var timer = Timer()
    fun init_timer(){
        timer = Timer()
        is_timer_active = true
        key_request_timeout=30
        timer.schedule(object : TimerTask() {
            override fun run() {
                key_request_timeout--
                if(key_request_timeout<=0){
                    timer.cancel()
                    timer.purge()
                    is_timer_active = false
                    runOnUiThread {
                        tvRequestActivation.text = default_ask_key_text;
                    }
                }
                else{
                    runOnUiThread {
                        tvRequestActivation.text = salt_for_ask_key_timer+key_request_timeout.toString();
                    }
                }
            }
        }, 0,1000)
    }
    var user_email :String?="";
    fun askAuth_Key(){
        showLoadingDialog("Basic")
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.askKeyAgain(GlobalStaticVariables.language_type!!,user_email!!)
        call.enqueue(object : Callback<RegisterModel.RegisterResponse> {
            override fun onResponse(call: Call<RegisterModel.RegisterResponse>,
                                    response: Response<RegisterModel.RegisterResponse>) {
                pd_loading!!.cancel()
                val test = response.body()
                if(test != null&&test.code==1  &&test.data!=null) {
                    showPreparedToast(this@RegisterObActivity,"Success")
                    block_ask_key_btn=false
                    init_timer()
                    user_email = test.data!!.email
                }
                else if(test!=null &&test.data!=null&&test.data!!.errors!=null){
                    showToast(this@RegisterObActivity,showError(test.data!!.errors!!))
                }
                else{
                    Toast.makeText(this@RegisterObActivity,getString(R.string.error_data), Toast.LENGTH_SHORT).show()
                }
            }
            override fun onFailure(call: Call<RegisterModel.RegisterResponse>, t: Throwable) {
                // Log error here since request failed
                pd_loading!!.cancel()
                Toast.makeText(this@RegisterObActivity,getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })
    }
    var block_ask_key_btn = false
    fun init_activiationKeyText(){
        tvRequestActivation.setOnClickListener {
            if(!block_ask_key_btn) {
                if (is_timer_active) {
                    showToast(this@RegisterObActivity,getString(R.string.timer_end))
                } else {
                    block_ask_key_btn = true;
                    askAuth_Key();
                }
            }
        }
    }
    fun nextStep(){
        showFieldForKey();
        init_timer()
    }
    fun sendSocialData(user_id:Int){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.setSocialNode(GlobalStaticVariables.language_type!!,socialData?.id!! , socialData?.social_type!! ,user_id.toString() )
        call.enqueue(object : Callback<SocialAuthModel.SocialResponseData> {
            override fun onResponse(call: Call<SocialAuthModel.SocialResponseData>?, response: Response<SocialAuthModel.SocialResponseData>?) {
                var resData = response?.body()
                if(response?.errorBody()==null && resData!=null && resData.code==1) {
                    nextStep()
                }
                else{
                    showToast(this@RegisterObActivity,"Error")
                }
            }

            override fun onFailure(call: Call<SocialAuthModel.SocialResponseData>?, t: Throwable?) {
                showToast(this@RegisterObActivity,"Error")
            }
        })
        //ONSUCCESS nextStep
    }
    fun sendData(data:RegisterModel.RegisterRequestData,type: Int?=0):Boolean{
        showLoadingDialog("Basic")
        var type_def = 1;
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.register(data.username!!,data.phone!!,data.email!!,data.password!!,type_def)
         call.enqueue(object : Callback<RegisterModel.RegisterResponse> {
            override fun onResponse(call: Call<RegisterModel.RegisterResponse>,
                                    response: Response<RegisterModel.RegisterResponse>) {
                pd_loading!!.cancel()
                val test = response.body()
                if(test != null && test.code==1  &&  test.data!=null) {
                    showPreparedToast(this@RegisterObActivity,"Success")
                    if(isSocial==false) {
                        nextStep()
                    }
                    else{
                        sendSocialData(test?.data?.id!!)
                    }
                    user_email = test.data!!.email
                }

                else if(test!=null && test.data!=null&&test.data!!.errors!=null){
                    showToast(this@RegisterObActivity,showError(test.data!!.errors!!))
                }
                else{
                    Toast.makeText(this@RegisterObActivity,getString(R.string.no_get_data), Toast.LENGTH_SHORT).show()
                }
            }
            override fun onFailure(call: Call<RegisterModel.RegisterResponse>, t: Throwable) {
                // Log error here since request failed
                pd_loading!!.cancel()
                Toast.makeText(this@RegisterObActivity,getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })
        return false;
    }

    fun clearViews(){
        basic_fields_LL.visibility = ViewGroup.GONE
        fields_forKey_LL.visibility = ViewGroup.GONE
        btn_next_LL.visibility = ViewGroup.GONE
        //user_reg_data_LL.visibility = ViewGroup.GONE
    //    btn_continion.visibility = ViewGroup.GONE
    }
    fun sendRegData(type: Int?=0){

        var sendData = RegisterModel.RegisterRequestData()
        sendData.apply {
            username = etUsername.text.toString()
            email = etEmail.text.toString()
            phone = etPhone.text.toString()
            type_id = 1
            password = etPass.text.toString()
        }
        if(sendData.email!="" && sendData.email!="" && sendData.phone!=""&& sendData.password!="")
        {
            if(sendData.password.toString().length < 6){
                showToast(this@RegisterObActivity,getString(R.string.constraints_password))
            }
            else{
                sendData(sendData,type);
            }
        }
        else{
            showPreparedToast(this,"Fields");
        }
    }
    fun sendAuthKey(){
        var keytoken = etKey.text.toString();
        if(keytoken=="") {
            showPreparedToast(this,"Fields");
            return
        }
        showLoadingDialog("Key")
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.acivateToken(keytoken)
        call.enqueue(object : Callback<RegisterModel.ActivateKeyResponse> {
            override fun onResponse(call: Call<RegisterModel.ActivateKeyResponse>,
                                    response: Response<RegisterModel.ActivateKeyResponse>) {
                pd_loading!!.cancel()
                val test = response.body()
                if(test != null && test.data!=null ) {
                    if(test.code==1) {
                        //TODO: GO TO profile edit page
                        GlobalStaticVariables.myId =test.data?.data?.userId;
                        var intentEdit = Intent(this@RegisterObActivity, EditProfileActivity::class.java)
                        if(isSocial) {
                            intentEdit.putExtra("socialData", serializeToJson(socialData))
                            intentEdit.putExtra("isSocialCheck", true)
                        }
                        startActivity(intentEdit);
                        showPreparedToast(this@RegisterObActivity, "Success")
                        PrefSingleton.instance.writePreference("USERNAME", etEmail.text.toString())
                    }

                    else{
                        showPreparedToast(this@RegisterObActivity, "Unknown")
                    }
                }
                else if(test.code==302){
                    showPreparedToast(this@RegisterObActivity,"Not_found_key")
                }
                else {
                    Toast.makeText(this@RegisterObActivity,getString(R.string.error), Toast.LENGTH_SHORT).show()
                }
            }
            override fun onFailure(call: Call<RegisterModel.ActivateKeyResponse>, t: Throwable) {
                // Log error here since request failed
                pd_loading!!.cancel()
                Toast.makeText(this@RegisterObActivity,getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })
    }
    fun showBasicReg(type:Int?=0){
        basic_fields_LL.visibility = ViewGroup.VISIBLE;
        btn_next_LL.visibility = ViewGroup.VISIBLE
        btn_confirm_key.setOnClickListener {
            sendRegData(type);
        }
    }
    fun showFieldForKey(){
        basic_fields_LL.visibility = ViewGroup.GONE;
        fields_forKey_LL.visibility = ViewGroup.VISIBLE
        btn_confirm_key.setOnClickListener {
            sendAuthKey()
        }
    }
    fun showMoreReg(){
        clearViews()
       // user_reg_data_LL.visibility = ViewGroup.VISIBLE
       // btn_continion.visibility = ViewGroup.VISIBLE
    }
    fun endRegistration(){

    }


}


