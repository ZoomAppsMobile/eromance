package com.zoomapps.eromance.Activities


import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.util.Log
import android.widget.*
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.GraphRequest
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.auth.api.signin.GoogleSignInResult
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient
import com.vk.sdk.VKAccessToken
import com.vk.sdk.VKCallback
import com.vk.sdk.VKScope
import com.vk.sdk.VKSdk
import com.vk.sdk.api.VKError
import com.vk.sdk.util.VKUtil
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Activities.auth.RegisterObActivity
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.AccountModel.LoginModel

import com.zoomapps.eromance.R
import io.realm.Realm
import kotterknife.bindView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import com.zoomapps.eromance.Helpers.SocialLoginPresenter
import com.zoomapps.eromance.Helpers.ThirdPartyApiCalls
import com.zoomapps.eromance.Interfaces.ISocialLoginView
import com.zoomapps.eromance.Interfaces.RequestMakerListener
import com.zoomapps.eromance.Models.SocialAuthModel
import com.zoomapps.eromance.Models.SocialDataModel
import com.zoomapps.eromance.Models.TwentyOneModel
import com.zoomapps.eromance.MyApplication
import kotlinx.android.synthetic.main.activity_auth.*
import org.json.JSONException
import org.json.JSONObject
import ru.ok.android.sdk.Odnoklassniki
import ru.ok.android.sdk.OkAuthListener
import ru.ok.android.sdk.OkListener
import ru.ok.android.sdk.util.OkAuthType
import ru.ok.android.sdk.util.OkScope


class AuthActivity : AppCompatActivity(), ISocialLoginView,
        GoogleApiClient.OnConnectionFailedListener, RequestMakerListener {

    override fun <T> onError(out: T?) {

    }

    companion object {
        lateinit var instance: AuthActivity
    }

    init {
        instance = this
    }

    override fun <T> onRequestSuccess(out: T) {
        var data = out as TwentyOneModel.UserProvidingServiceResponse;
        try {
            GlobalStaticVariables.providing_service_id = data.data?.firstOrNull()?.typeId;
        } catch (ex: Exception) {

        }
        startActivity(Intent(this@AuthActivity, TwentyOneUsersMainActivity::class.java))
        finish()
    }

    override fun onConnectionFailed(p0: ConnectionResult) {

    }


    val okResCode = 22890
    val vkReqCode = 10485;
    private val RC_SIGN_IN = 9001
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        // super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode == RC_SIGN_IN) {
//            var result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
//            handleSignInResult(result);
//        } else {
//            callbackManager!!.onActivityResult(requestCode, resultCode, data)
//        }
        //ok = 22890
        val callback = object : VKCallback<VKAccessToken> {
            override fun onResult(res: VKAccessToken) {
                // User passed Authorization
                vkGetInfo()
            }

            override fun onError(error: VKError) {
                Toast.makeText(this@AuthActivity, getString(R.string.no_get_data), Toast.LENGTH_SHORT).show()
            }
        }
        if (requestCode == vkReqCode && !VKSdk.onActivityResult(requestCode, resultCode, data, callback)) {
            super.onActivityResult(requestCode, resultCode, data)
        }
        if (requestCode == okResCode) {
            if (Odnoklassniki.getInstance().isActivityRequestOAuth(requestCode)) {
                Odnoklassniki.getInstance().onAuthActivityResult(requestCode, resultCode, data, getAuthListener());
            } else if (Odnoklassniki.getInstance().isActivityRequestViral(requestCode)) {
                Odnoklassniki.getInstance().onActivityResultResult(requestCode, resultCode, data, getToastListener());
            } else {
                super.onActivityResult(requestCode, resultCode, data);
            }
        } else if (requestCode != okResCode && requestCode != vkReqCode) {
            if (requestCode == RC_SIGN_IN) {
                var result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
                handleSignInResult(result);
            } else {
                callbackManager!!.onActivityResult(requestCode, resultCode, data)
            }
        }
    }


    fun handleSignInResult(result: GoogleSignInResult) {
        if (result.isSuccess()) {
            // Signed in successfully, show authenticated UI.
            var acct = result.getSignInAccount();
            var id = acct?.id
            var username = acct!!.getDisplayName();
            var email = acct?.email
            startSocial(setDataToModel(3, id, username, email, null, null, null, null))
        } else {
            showPreparedToast(this@AuthActivity, "Error")
        }
    }

    fun setDataToModel(type: Int?, id: String?, username: String?, email_str: String?, birthday_str: String?, phone: String?, locale: Array<String?>?, gender: String?): SocialDataModel {
        var ret_data = SocialDataModel()
        ret_data.social_type = type.toString()
        ret_data.id = id
        ret_data.username = username
        ret_data.email_str = email_str
        ret_data.birthday_str = birthday_str
        ret_data.sex = parseGender(type, gender)
        return ret_data;
    }

    fun parseGender(type: Int?, value: String?): String? {
        when (type) {
            2 -> {
                if (value == "male") return "1" else "2"
            }
            else -> {
                return null
            }
        }
        return null
    }

    var mContext: Context? = null
    var callbackManager: CallbackManager? = null

    fun startSocial(data: SocialDataModel) {
        checkSocial(data)
    }

    fun checkSocial(social_data: SocialDataModel) {


        val apiService = API_Client.client!!.create(API_Interface::class.java)


        val call = apiService.getSocialInfo(GlobalStaticVariables.language_type!!,social_data.id!!, social_data.social_type!!)
        pd_loading!!.show()
        call.enqueue(object : Callback<SocialAuthModel.CheckSocialResponseData> {
            override fun onResponse(call: Call<SocialAuthModel.CheckSocialResponseData>?, response: Response<SocialAuthModel.CheckSocialResponseData>?) {


                if (response?.errorBody() == null && response?.body() != null) {


                    var data = response.body().data
                    if (response.body().data != null && data?.isNotEmpty()!!) {

                        var curData = data.firstOrNull { it ->
                            it.uid == social_data.id
                                    && it.typeId.toString() == social_data.social_type
                        }
                        if (curData != null)
                            onSocialChecked(curData?.userId.toString(), true, social_data)     //Error


                        else
                            onSocialChecked(null, false, social_data)


                    } else {
                        onSocialChecked(null, false, social_data)
                    }


                } else {
                    showPreparedToast(this@AuthActivity, "Error")
                }
            }

            override fun onFailure(call: Call<SocialAuthModel.CheckSocialResponseData>?, t: Throwable?) {
                showPreparedToast(this@AuthActivity, "Error")
            }

        })
    }

    fun onSocialChecked(uid: String?, isRegistered: Boolean, data: SocialDataModel) {


        if (!isRegistered) {
            var str_data = serializeToJson(data)
            var intent = Intent(this@AuthActivity, RegisterObActivity::class.java)
            intent.putExtra("is_social", true)
            intent.putExtra("social_data", str_data)
            startActivity(intent)
            finish()
        } else {
            val apiService = API_Client.client!!.create(API_Interface::class.java)
            val call = apiService.getUserInfo(GlobalStaticVariables.language_type!!,uid!!)
            pd_loading!!.show()
            call.enqueue(object : Callback<LoginModel.Example> {
                override fun onResponse(call: Call<LoginModel.Example>?, response: Response<LoginModel.Example>?) {
                    pd_loading!!.cancel()
                    if (response!!.body() != null && response!!.errorBody() == null) {
                        if (response!!.body().data == null || response.body().code != 1) {
                            showPreparedToast(this@AuthActivity, "Auth")
                        } else {
                            if (response.body().data!!.isActive == true && response.body().data?.profile != null) {
                                processLogin(response.body().data)
                            } else {
                                showPreparedToast(this@AuthActivity, "NotActivated")
                            }
                        }
                    }
                }

                override fun onFailure(call: Call<LoginModel.Example>?, t: Throwable?) {
                    pd_loading!!.cancel()
                    showPreparedToast(this@AuthActivity, "Response")
                }

            })
        }
    }

    fun setupFb() {
        callbackManager = CallbackManager.Factory.create();
        LoginManager.getInstance().registerCallback(
                callbackManager,
                object : FacebookCallback<LoginResult> {
                    override fun onSuccess(loginResult: LoginResult) {
                        val request = GraphRequest.newMeRequest(
                                loginResult.accessToken)
                        { `object`, response ->
                            Log.v("AuthActivity", response.toString())
                            // Application code

                            var username: String? = if (`object`.keys().containsKey("name")) `object`.getString("name") else null
                            var id: String? = if (`object`.keys().containsKey("id")) `object`.getString("id") else null
                            var email_str: String? = if (`object`.keys().containsKey("email")) `object`.getString("email") else null
                            var birthday_str: String? = if (`object`.keys().containsKey("birthday")) `object`.getString("birthday") else null
                            var gender: String? = if (`object`.keys().containsKey("gender")) `object`.getString("gender") else null  // 01/31/1980 format
                            startSocial(setDataToModel(2, id, username, email_str, birthday_str, null, null, gender))
                            // var password_str = md5(id.toString()+"fb")
                        }
                        val parameters = Bundle()
                        parameters.putString("fields", "id,name,email,gender,birthday")
                        request.parameters = parameters
                        request.executeAsync()
                    }

                    override fun onCancel() {}

                    override fun onError(exception: FacebookException) {
                        Toast.makeText(this@AuthActivity, getString(R.string.error_sign), Toast.LENGTH_SHORT).show()
                    }
                }


        )
        facebook_btn.setOnClickListener {
            LoginManager.getInstance().logInWithReadPermissions(
                    this,
                    Arrays.asList("email", "public_profile")
            );
        }

    }

    fun Iterator<String>.containsKey(key: String): Boolean {
        forEach { if (it == key) return true }
        return false
    }

    var mGoogleApiClient: GoogleApiClient? = null
    fun setupGoo() {
        var gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleApiClient = GoogleApiClient.Builder(this)
                .enableAutoManage(this /* FragmentActivity */, this /* OnConnectionFailedListener */)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();
        google_btn.setOnClickListener {
            val signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient)
            startActivityForResult(signInIntent, RC_SIGN_IN)
        }

    }

    var isActivityResumed = false
    var isLoginstate = false;
    fun setupVk() {

        VKSdk.wakeUpSession(this, object : VKCallback<VKSdk.LoginState> {
            override fun onResult(res: VKSdk.LoginState) {
                if (isActivityResumed) {
                    when (res) {
                        VKSdk.LoginState.LoggedOut -> {
                            isLoginstate = false;
                        }
                        VKSdk.LoginState.LoggedIn -> {
                            isLoginstate = true;
                        }
                        VKSdk.LoginState.Pending -> {
                        }
                        VKSdk.LoginState.Unknown -> {
                        }
                    }
                }
            }

            override fun onError(error: VKError) {

            }
        })
        vk_BTN.setOnClickListener {
            var token = "";
            if (!isLoginstate) {
                try {
                    VKSdk.login(this, VKScope.FRIENDS, VKScope.PHOTOS, VKScope.NOHTTPS, VKScope.MESSAGES, VKScope.DOCS);
                } catch (ex: Exception) {
                    Toast.makeText(this@AuthActivity, getString(R.string.error_sign), Toast.LENGTH_SHORT).show()
                    try {
                        VKSdk.logout()
                    } catch (exep_tio: Exception) {

                    }
                }
            } else {
                token = VKSdk.getAccessToken().accessToken
                if (!VKSdk.isLoggedIn()) {
                    isLoginstate = false;
                }
                if (VKSdk.isLoggedIn() && token != "") {
                    vkGetInfo()
                }
            }
            var stopper = "";
        }
    }

    fun vkGetInfo() {
        var apiController = ThirdPartyApiCalls(this);
        apiController.vkMethods("profile");
    }

    fun setupSocial() {
        setupFb();
        setupGoo()
        setupVk()
        setupOk()
    }

    lateinit var odnoklassniki: Odnoklassniki;
    fun setupOk() {
        odnoklassniki = Odnoklassniki.createInstance(this, getString(R.string.ok_client_id), getString(R.string.ok_public_key));
//        odnoklassniki.checkValidTokens(object : OkListener {
//            override fun onError(error: String?) {
//                Toast.makeText(this@AuthActivity,
//                        String.format("%s: %s", getString(R.string.error), error), Toast.LENGTH_LONG).show();
//            }
//
//            override fun onSuccess(json: JSONObject?) {
//                //showForm();
//               // ThirdPartyApiCalls(this@AuthActivity).getOkUserInfo( odnoklassniki)
//            }
//
//        });
        odnok_btn.setOnClickListener {
            odnoklassniki.requestAuthorization(this@AuthActivity, getString(R.string.ok_app_link)
                    , OkAuthType.ANY, OkScope.VALUABLE_ACCESS);
        }
    }


    val btn_reg: Button by bindView(R.id.btn_reg)
    val btn_login: Button by bindView(R.id.btn_login)
    val et_login: EditText by bindView(R.id.etLogin)
    val et_password: EditText by bindView(R.id.etPass)
    var pd_loading: ProgressDialog? = null
    val cbAcceptRG: CheckBox by bindView(R.id.cbAcceptRG)
    val tvRequestActivation: TextView by bindView(R.id.tvRequestActivation)
    val presenter = SocialLoginPresenter(this, this)
    val vk_BTN: Button by bindView(R.id.vk_BTN)
    val facebook_btn: Button by bindView(R.id.facebook_btn)
    val google_btn: Button by bindView(R.id.google_btn)
    val odnok_btn: Button by bindView(R.id.odnok_btn)
    var myValue:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var language:String? = null
        val sharedPreferenses = PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
        when (Locale.getDefault().getLanguage()) {
            "ru" -> {
                language = sharedPreferenses!!.getString("language", Locale.getDefault().getLanguage())

            }
            "en" -> {
                language = sharedPreferenses.getString("language", Locale.getDefault().getLanguage())
            }
            "kk" -> {
                language = sharedPreferenses.getString("language", Locale.getDefault().getLanguage())
            }
            else -> {
                language = sharedPreferenses.getString("language", "ru")
            }
        }
        val locale = Locale(language)
        val resource = resources
        val configuration = resource.configuration
        val displayMetrics = resources.displayMetrics
        configuration.setLocale(locale)
        resource.updateConfiguration(configuration, displayMetrics)


        setContentView(R.layout.activity_auth)
        Realm.init(this)


        setupSocial();
        init_btns()
        setupDictionary();

        val fingPrints = VKUtil.getCertificateFingerprint(this, this.packageName)
        println("FSFSFDSFS" + Arrays.asList(*fingPrints))

        pd_loading = ProgressDialog(this)
        pd_loading!!.setMessage("Идет загрузка")
        pd_loading!!.setCancelable(false)
        et_login.setText(PrefSingleton.instance.getPreference("USERNAME"))
        et_password.setText(PrefSingleton.instance.getPreference("PASSWORD"))
        if (et_password.text.length > 0) {
            cbAcceptRG.isChecked = true
            btn_login.performClick()
        }
    }

    fun setupDictionary(): Boolean {
        return setTranslations() && TypeController(this).setTypes()
    }

    private fun init_btns() {
        tvRequestActivation.setOnClickListener {
            startActivity(Intent(this, PasswordInteractionActivity::class.java).putExtra("type", "restore"));
        }
        btn_reg.setOnClickListener {

            startActivity(Intent(this@AuthActivity, RegisterObActivity::class.java))
            finish()
        }







        btn_login.setOnClickListener {
            if (checkLoginFields()) {

                val apiService = API_Client.client!!.create(API_Interface::class.java)
                val call = apiService.getLogin(GlobalStaticVariables.language_type!!,et_login.text.toString(), et_password.text.toString())
                pd_loading!!.show()
                call.enqueue(object : Callback<LoginModel.UserLoginResponse> {
                    override fun onResponse(call: Call<LoginModel.UserLoginResponse>?, response: Response<LoginModel.UserLoginResponse>?) {
                        pd_loading!!.cancel()
                        if (response!!.body() != null && response!!.errorBody() == null) {


                            if (response!!.body().getData()!!.size == 0 || response.body().getCode() != 1) {
                                showPreparedToast(this@AuthActivity, "Auth")
                            } else {


                                PrefSingleton.instance.writePreference("USERNAME", et_login.text.toString())
                                if (cbAcceptRG.isChecked) {
                                    PrefSingleton.instance.writePreference("PASSWORD", et_password.text.toString())
                                } else {
                                    PrefSingleton.instance.writePreference("PASSWORD", "")
                                }
//                                    GlobalStaticVariables.isUser_Twenty_One_Provider = response.body().data?.profile?.data?.isAdultConfirmed;
//
//                                    setTranslations()
//                                    GlobalStaticVariables.myData = response.body().data!!
//                                    GlobalStaticVariables.myId =response.body().data!!.id;
//                                    if(GlobalStaticVariables.isUser_Twenty_One_Provider == false) {
//                                        startActivity(Intent(this@AuthActivity, MainActivity::class.java))
//                                        finish()
//                                    }
//                                    else{
//                                        val call = apiService.getUserProvidingServiceType(  GlobalStaticVariables.myId!!)
//                                        RequestMaker(this@AuthActivity).makeRequest(call)
//                                    }
                                processLogin(response.body().getData()!!.get(0))


                            }
                        }

                    }

                    override fun onFailure(call: Call<LoginModel.UserLoginResponse>?, t: Throwable?) {
                        pd_loading!!.cancel()
                        showPreparedToast(this@AuthActivity, "Response")

                    }

                })
            }
        }
    }


    // cache data in GlobalStaricVaribles
    fun processLogin(data: LoginModel.Datum?) {
        //TODO:SAVE USERDATA
        GlobalStaticVariables.isUser_Twenty_One_Provider = data?.profile?.data?.isAdultConfirmed;

        setTranslations()
        GlobalStaticVariables.myData = data!!
        GlobalStaticVariables.myId = data!!.id;
        if (GlobalStaticVariables.isUser_Twenty_One_Provider == false) {
            startActivity(Intent(this@AuthActivity, MainActivity::class.java))
            finish()
        } else {
            val call = API_Client.client!!.create(API_Interface::class.java).getUserProvidingServiceType(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId!!)
            RequestMaker(this@AuthActivity).makeRequest(call)
        }
    }

    fun checkLoginFields(): Boolean {
        if (et_login.text.toString().equals("") || et_password.text.toString().equals("")) {
            showPreparedToast(this@AuthActivity, "Fields")
        } else if (et_password.text.toString().length < 6) {
            showToast(this@AuthActivity, getString(R.string.constraints_password))
        } else if (!isOnline(this@AuthActivity)) {
            showPreparedToast(this@AuthActivity, "Network")
        } else {
            return true;
        }
        return false
    }


    private fun getAuthListener(): OkAuthListener {
        return object : OkAuthListener {
            override fun onSuccess(json: JSONObject?) {
                try {
                    Toast.makeText(this@AuthActivity,
                            String.format("access_token: %s", json?.getString("access_token")),
                            Toast.LENGTH_SHORT).show();
                    ThirdPartyApiCalls(this@AuthActivity).getOkUserInfo(odnoklassniki)
                } catch (e: JSONException) {
                    e.printStackTrace();
                }
//                showForm();
            }

            override fun onCancel(error: String?) {
                Toast.makeText(this@AuthActivity,
                        String.format("%s: %s", getString(R.string.cancel_signin), error),
                        Toast.LENGTH_SHORT).show();
            }

            override fun onError(error: String?) {
                Toast.makeText(this@AuthActivity,
                        String.format("%s: %s", getString(R.string.error), error),
                        Toast.LENGTH_SHORT).show();
            }
        };
    }

    fun getToastListener(): OkListener {
        return object : OkListener {
            override fun onSuccess(json: JSONObject?) {
                Toast.makeText(this@AuthActivity, json.toString(), Toast.LENGTH_LONG).show();
                ThirdPartyApiCalls(this@AuthActivity).getOkUserInfo(odnoklassniki)
            }

            override fun onError(error: String?) {
                Toast.makeText(this@AuthActivity, String.format("%s: %s", getString(R.string.error), error), Toast.LENGTH_LONG).show();
            }

        };
    }

    override fun onResume() {
        super.onResume()
        isActivityResumed = true;
        if (VKSdk.isLoggedIn()) {
            isLoginstate = true;
        } else {
            isLoginstate = false;
        }
    }

    override fun onPause() {
        isActivityResumed = false;
        super.onPause()
    }
}
