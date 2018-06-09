package com.zoomapps.eromance.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.bumptech.glide.Glide
import com.google.firebase.iid.FirebaseInstanceId
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Adapters.MainUsersListAdapter
import com.zoomapps.eromance.Adapters.viewIniter
import com.zoomapps.eromance.Controllers.GlobalVariables.server_url
import com.zoomapps.eromance.Helpers.*
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.UserProfileModel
import com.zoomapps.eromance.R
import com.zoomapps.eromance.Services.NetworkCheckService.NetworkCheckSocketService
import de.hdodenhof.circleimageview.CircleImageView
import kotterknife.bindView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import android.content.ComponentName

import android.os.IBinder
import android.content.ServiceConnection
import android.preference.PreferenceManager
import android.util.Log
import com.google.firebase.crash.FirebaseCrash
import com.zoomapps.eromance.Controllers.*


class MainActivity : BaseMainActivity() {
    init {

    }

    override fun setupBase() {
        mContext = this;
    }


    fun getPushToken(): String? {
        try {
            var push_token = FirebaseInstanceId.getInstance().token;
            savePushToken(push_token.toString())
            return push_token.toString()
        } catch (ex: Exception) {

        }
        return ""
    }

    fun registerPush() {
        var push_token = getPushToken()
        if (push_token != "") {
            sendPushTokenToServer(push_token, this)
        }
    }


    fun startSocketService() {
        if (!GlobalStaticVariables.isSocketServiceActive) {
            startService(Intent(this@MainActivity, NetworkCheckSocketService::class.java))
        }
    }

    val usersListRV: RecyclerView by bindView(R.id.usersListRV)
    private var mAdapter: RecyclerView.Adapter<*>? = null
    private var mLayoutManager: RecyclerView.LayoutManager? = null
    val top_users_container: LinearLayout by bindView(R.id.top_users_container);
    val tu_sn_avatar_IV: ImageView by bindView(R.id.tu_sn_avatar_IV);
    val user_status_container_left: LinearLayout by bindView(R.id.user_status_container_left);
    val tu_sn_status_IV: ImageView by bindView(R.id.tu_sn_status_IV);
    val tu_sn_stars_IV: ImageView by bindView(R.id.tu_sn_stars_IV);
    val tu_fs_avatar_IV: ImageView by bindView(R.id.tu_fs_avatar_IV);
    val user_status_container_mid: LinearLayout by bindView(R.id.user_status_container_mid);
    val tu_fs_status_IV: ImageView by bindView(R.id.tu_fs_status_IV);
    val tu_fs_stars_IV: ImageView by bindView(R.id.tu_fs_stars_IV);
    val tu_td_avatar_IV: ImageView by bindView(R.id.tu_td_avatar_IV);
    val user_status_container_right: LinearLayout by bindView(R.id.user_status_container_right);
    val tu_td_status_IV: ImageView by bindView(R.id.tu_td_status_IV);
    val tu_td_stars_IV: ImageView by bindView(R.id.tu_td_stars_IV);
    var topRow_clickListener: View.OnClickListener? = null
    val lu_user_container: LinearLayout by bindView(R.id.lu_user_container)
    val mid_user_container: LinearLayout by bindView(R.id.mid_user_container)
    val ru_user_container: LinearLayout by bindView(R.id.ru_user_container)
    //-----------------NAVIGATION--------------------
    val myProfile_NAV_LL: LinearLayout by bindView(R.id.myProfile_NAV_LL)
    val searchPair_NAV_LL: LinearLayout by bindView(R.id.searchPair_NAV_LL)
    val momentMeets_NAV_LL: LinearLayout by bindView(R.id.momentMeets_NAV_LL)
    val placesForRest_NAV_LL: LinearLayout by bindView(R.id.placesForRest_NAV_LL)
    val eveningPlans_NAV_LL: LinearLayout by bindView(R.id.eveningPlans_NAV_LL)
    val map_NAV_LL: LinearLayout by bindView(R.id.map_NAV_LL)
    val games_NAV_LL: LinearLayout by bindView(R.id.games_NAV_LL)
    val imageView17: ImageView by bindView(R.id.imageView17)
    val twentyOne_NAV_LL: LinearLayout by bindView(R.id.twentyOne_NAV_LL)
    val settings_NAV_LL: LinearLayout by bindView(R.id.settings_NAV_LL)
    val cur_username_NAV_TV: TextView by bindView(R.id.cur_username_NAV_TV)
    val cur_country_NAV_TV: TextView by bindView(R.id.cur_country_NAV_TV)
    val cur_city_NAV_TV: TextView by bindView(R.id.cur_city_NAV_TV)
    val cur_coins_NAV_TV: TextView by bindView(R.id.cur_coins_NAV_TV)
    val nav_recyclerView: RecyclerView by bindView(R.id.nav_recyclerView)
    val profile_image_CIV: CircleImageView by bindView(R.id.profile_image_CIV)
    val home_NAV_LL: LinearLayout by bindView(R.id.home_NAV_LL)
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

    //--------------------------------
    var allUserData = ArrayList<UserProfileModel.Datum>()

    fun getData() {
        val apiService = API_Client.client!!.create(API_Interface::class.java)

        val call = apiService.getMainProfileList()
        call.enqueue(object : Callback<UserProfileModel.ProfileFindResponse> {
            override fun onResponse(call: Call<UserProfileModel.ProfileFindResponse>, response: Response<UserProfileModel.ProfileFindResponse>) {
                if (response.body() == null)
                    return
                val mainPageDataList = response.body().data
                if (mainPageDataList != null && mainPageDataList.isNotEmpty()) {
                    val statusCode = response.code()
                    var listData = mainPageDataList;
                    allUserData.addAll(listData)
                    processViews(listData)

//                    val apiService = API_Client.client!!.create(API_Interface::class.java)
//                    val call = apiService.getUserInfo(GlobalStaticVariables.myData?.id!!.toString())
//                    call.enqueue(object: Callback<LoginModel.Example> {
//                        override fun onResponse(call: Call<LoginModel.Example>?, response: Response<LoginModel.Example>?) {
//                            if(response!!.body()!=null && response!!.errorBody()==null){
//                                if(response!!.body().data==null|| response.body().code!=1){
//                                    showPreparedToast(this@MainActivity,"Auth")
//                                }
//                                else{
//                                    if(response.body().data!!.isActive==true && response.body().data?.profile!=null){
//                                        AuthActivity.instance.processLogin(response.body().data)
//                                    }
//                                    else{
//                                        showPreparedToast(this@MainActivity,"NotActivated")
//                                    }
//                                }
//                            }
//                        }
//
//                        override fun onFailure(call: Call<LoginModel.Example>?, t: Throwable?) {
//                            showPreparedToast(this@MainActivity,"Response")
//                        }
//
//                    })

                } else {
                    finish()
                    Toast.makeText(this@MainActivity, "Не удалось получить данные", Toast.LENGTH_SHORT).show()

                }
            }

            override fun onFailure(call: Call<UserProfileModel.ProfileFindResponse>, t: Throwable) {
                // Log error here since request failed
                Toast.makeText(this@MainActivity, "Error", Toast.LENGTH_SHORT).show();
            }

        })
    }

    fun setTopElements(dataList: List<UserProfileModel.Datum>) {
        if (dataList.size > 0) {
            for (tmp in dataList) {
                var indexNum = dataList.indexOf(tmp)
                when (indexNum) {
                    0 -> {
                        //Middle
                        mid_user_container.visibility = ViewGroup.VISIBLE
                        viewIniter.setUserView(this, mid_user_container, tu_fs_status_IV, tu_fs_stars_IV, tu_fs_avatar_IV, tmp.user?.data?.avatar, tmp.rating, tmp.user?.data?.is_online)
                        mid_user_container.tag = serializeToJson(tmp);
                        mid_user_container.setOnClickListener(topRow_clickListener)

                    }
                    1 -> {
                        //Left
                        lu_user_container.visibility = ViewGroup.VISIBLE
                        viewIniter.setUserView(this, lu_user_container, tu_sn_status_IV, tu_sn_stars_IV, tu_sn_avatar_IV, tmp.user?.data?.avatar, tmp.rating, tmp.user?.data?.is_online)
                        lu_user_container.tag = serializeToJson(tmp);
                        lu_user_container.setOnClickListener(topRow_clickListener)
                    }
                    2 -> {
                        //Right
                        ru_user_container.visibility = ViewGroup.VISIBLE
                        viewIniter.setUserView(this, lu_user_container, tu_td_status_IV, tu_td_stars_IV, tu_td_avatar_IV, tmp.user?.data?.avatar, tmp.rating, tmp.user?.data?.is_online)
                        ru_user_container.tag = serializeToJson(tmp);
                        ru_user_container.setOnClickListener(topRow_clickListener)
                    }
                }
            }
        } else {
        }
    }

    //    fun processViews(dataList: List<LoginModel.Datum>)
//    {
//        if(dataList.size>3){
//            var dataForTopElements = dataList.subList(0,3);
//            setTopElements(dataForTopElements)
//            var dataForRV = dataList.subList(3,dataList.size-1)
//            setRecyclerView(dataForRV)
//        }
//        else{
//            setTopElements(dataList)
//        }
//    }
    fun processViews(dataList: List<UserProfileModel.Datum>) {
        if (dataList.size > 3) {
            var dataForTopElements = dataList.subList(0, 3);
            setTopElements(dataForTopElements)
            var dataForRV = dataList.subList(3, dataList.size)
            setRecyclerView(dataForRV)
        } else {
            setTopElements(dataList)
        }
    }

    val all_cities_RB: RadioButton by bindView(R.id.all_cities_RB)
    val my_city_RB: RadioButton by bindView(R.id.my_city_RB)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var language:String? = null
        val sharedPreferenses = PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
        when (Locale.getDefault().getLanguage()) {
            "ru" -> {
                language = sharedPreferenses.getString("language", Locale.getDefault().getLanguage()).toString()
            }
            "en" -> {
                language = sharedPreferenses.getString("language", Locale.getDefault().getLanguage())
            }
            "kk" -> {
                language = sharedPreferenses.getString("language", Locale.getDefault().getLanguage())
            }
            else -> {
                language = sharedPreferenses.getString("language", "ru") as Nothing?
            }
        }
        val locale = Locale(language)
        var resource = resources
        var configuration = resource.configuration
        var displayMetrics = resources.displayMetrics
        configuration.setLocale(locale)
        resource.updateConfiguration(configuration,displayMetrics)
       // Toast.makeText(this, $"{GlobalStaticVariables.myData?.profile?.data?.cityId" }, Toast.LENGTH_LONG).show()

        Log.e("GlobalStaticVariables", "${GlobalStaticVariables.language_type}")

        setContentView(R.layout.activity_main)
        setToolbar(this,
                getString(R.string.head),
                findViewById<TextView>(R.id.tv_map),
                findViewById<ImageView>(R.id.custom_toolbar_home_btn),
                false,
                findViewById<DrawerLayout>(R.id.drawer_layout))
        registerPush()
        startSocketService()

        imageView17.setOnClickListener({
            var goSetting = Intent(this, SettingLanguageActivity::class.java)
            startActivity(goSetting)
        })
        mid_user_container.visibility = ViewGroup.GONE
        lu_user_container.visibility = ViewGroup.GONE
        ru_user_container.visibility = ViewGroup.GONE
        setMenuClicks()
        //FirebaseCrash.report( Exception("My first Android non-fatal error"));
//        MenuData_Setter(this).setMenuData(cur_username_NAV_TV,cur_country_NAV_TV,
//                cur_city_NAV_TV,cur_coins_NAV_TV,profile_image_CIV,
//                (findViewById(R.id.go_rating)as RatingBar),
//                (findViewById(R.id.rating_value_TV) as TextView),if(findViewById(R.id.network_status_container) != null)findViewById(R.id.network_status_container) as RelativeLayout else null)

        usersListRV!!.isNestedScrollingEnabled = false
        mLayoutManager = LinearLayoutManager(this@MainActivity)
        usersListRV!!.layoutManager = GridLayoutManager(this, 3)
        topRow_clickListener = View.OnClickListener { v ->
            var curview = v as LinearLayout;
            var data = curview.tag as String;
            startActivity(Intent(this, UserProfileActivity::class.java)
                    .putExtra("user_data", data)
                    .putExtra("open_type", OpenTypesBy.all_data));
        }
//        getData()
        updateViewElemets()
        all_cities_RB.setOnClickListener {
            if (allUserData != null && allUserData.isNotEmpty())
                processViews(allUserData)
        }

        my_city_RB.setOnClickListener {
            if (allUserData != null && allUserData.isNotEmpty()
                    && GlobalStaticVariables.myData?.profile?.data?.cityId != null) {
                var tmp = allUserData.filter { it -> it.cityId == GlobalStaticVariables.myData?.profile?.data?.cityId }
                processViews(tmp)
            }
        }
    }

    fun updateViewElemets() {
        getData()
//        Log.e("avatar" , GlobalStaticVariables.myData?.avatar!!);
        MenuData_Setter(this).setMenuData(cur_username_NAV_TV, cur_country_NAV_TV,
                cur_city_NAV_TV, cur_coins_NAV_TV, profile_image_CIV,
                (findViewById<RatingBar>(R.id.go_rating)),
                (findViewById<TextView>(R.id.rating_value_TV)), if (findViewById<RelativeLayout>(R.id.network_status_container) != null) findViewById<RelativeLayout>(R.id.network_status_container) as RelativeLayout else null)
    }

    var adapterData = ArrayList<UserProfileModel.Datum>()

    fun setRecyclerView(data: List<UserProfileModel.Datum>) {
        adapterData.clear()
        adapterData.addAll(data)
        if (mAdapter == null) {
            mAdapter = MainUsersListAdapter(adapterData, this)
            usersListRV!!.adapter = mAdapter
        } else {
            mAdapter?.notifyDataSetChanged()
        }
    }

    var isStoped = false
    override fun onStop() {
        super.onStop()
        isStoped = true
    }

    override fun onResume() {
        super.onResume()
        if (isStoped) {
            updateViewElemets()
            isStoped = false
        }
    }

}
