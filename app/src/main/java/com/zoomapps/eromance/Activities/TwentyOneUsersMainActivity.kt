package com.zoomapps.eromance.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.google.firebase.iid.FirebaseInstanceId
import com.zoomapps.eromance.Adapters.MainUsersListAdapter
import com.zoomapps.eromance.Adapters.viewIniter
import com.zoomapps.eromance.Controllers.savePushToken
import com.zoomapps.eromance.Controllers.sendPushTokenToServer
import com.zoomapps.eromance.Controllers.serializeToJson
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Helpers.*
import com.zoomapps.eromance.Interfaces.ITwentyOneUsersMain
import com.zoomapps.eromance.Models.UserProfileModel
import com.zoomapps.eromance.R
import com.zoomapps.eromance.Services.NetworkCheckService.NetworkCheckSocketService
import de.hdodenhof.circleimageview.CircleImageView
import kotterknife.bindView
import java.util.*

class TwentyOneUsersMainActivity : AppCompatActivity(),ITwentyOneUsersMain {
    override fun onDataLoadError() {

    }

    override fun onDataLoaded(out: UserProfileModel.ProfileFindResponse) {
        var data_list = out.data
        processViews(data_list!!)
    }

    var mAdapter : RecyclerView.Adapter<*>?=null
    var rv_dataList: MutableList<UserProfileModel.Datum>?=null
    val presenter = TwentyOneUsersMainPresenter(this,this)

    val usersListRV : RecyclerView by bindView(R.id.usersListRV)
    val top_users_container : LinearLayout by bindView(R.id.top_users_container);
    val tu_sn_avatar_IV : ImageView by bindView(R.id.tu_sn_avatar_IV);
    val user_status_container_left : LinearLayout by bindView(R.id.user_status_container_left);
    val tu_sn_status_IV : ImageView by bindView(R.id.tu_sn_status_IV);
    val tu_sn_stars_IV : ImageView by bindView(R.id.tu_sn_stars_IV);
    val tu_fs_avatar_IV : ImageView by bindView(R.id.tu_fs_avatar_IV);
    val user_status_container_mid : LinearLayout by bindView(R.id.user_status_container_mid);
    val tu_fs_status_IV : ImageView by bindView(R.id.tu_fs_status_IV);
    val tu_fs_stars_IV : ImageView by bindView(R.id.tu_fs_stars_IV);
    val tu_td_avatar_IV : ImageView by bindView(R.id.tu_td_avatar_IV);
    val user_status_container_right : LinearLayout by bindView(R.id.user_status_container_right);
    val tu_td_status_IV : ImageView by bindView(R.id.tu_td_status_IV);
    val tu_td_stars_IV : ImageView by bindView(R.id.tu_td_stars_IV);
    var topRow_clickListener : View.OnClickListener ?= null
    val lu_user_container : LinearLayout by bindView(R.id.lu_user_container)
    val mid_user_container : LinearLayout by bindView(R.id.mid_user_container)
    val ru_user_container : LinearLayout by bindView(R.id.ru_user_container)
    //-----------------NAVIGATION--------------------
    val myProfile_NAV_LL : LinearLayout by bindView(R.id.myProfile_NAV_LL)
    val games_NAV_LL : LinearLayout by bindView(R.id.games_NAV_LL)
    val twentyOne_NAV_LL : LinearLayout by bindView(R.id.twentyOne_Requests_NAV_LL)
    val settings_NAV_LL : LinearLayout by bindView(R.id.settings_NAV_LL)
    val cur_username_NAV_TV : TextView by bindView(R.id.cur_username_NAV_TV)
    val cur_country_NAV_TV : TextView by bindView(R.id.cur_country_NAV_TV)
    val cur_city_NAV_TV : TextView by bindView(R.id.cur_city_NAV_TV)
    val cur_coins_NAV_TV : TextView by bindView(R.id.cur_coins_NAV_TV)
    val profile_image_CIV : CircleImageView by bindView(R.id.profile_image_CIV)

    fun setMenuClicks(){
        myProfile_NAV_LL.setOnClickListener(MenuClickListener(this))
        games_NAV_LL.setOnClickListener(MenuClickListener(this));
        twentyOne_NAV_LL.setOnClickListener(MenuClickListener(this));
        settings_NAV_LL.setOnClickListener(MenuClickListener(this));
        findViewById<LinearLayout>(R.id.home_21_NAV_LL).setOnClickListener(MenuClickListener(this))
    }
    fun registerPush(){
        var push_token = getPushToken()
        if(push_token!=""){
            sendPushTokenToServer(push_token,this)
        }
    }
    fun getPushToken():String?{
        try {
            var  push_token = FirebaseInstanceId.getInstance().token;
            savePushToken(push_token.toString())
            return push_token.toString()
        }
        catch (ex:Exception)
        {

        }
        return ""
    }
    fun startSocketService() {
        if (!GlobalStaticVariables.isSocketServiceActive) {
            startService(Intent(this@TwentyOneUsersMainActivity, NetworkCheckSocketService::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twenty_one_users_main)
        setToolbar(this ,
                "Главная",
                findViewById<TextView>(R.id.tv_map) as TextView,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView ,
                false,
                findViewById<DrawerLayout>(R.id.drawer_layout) as DrawerLayout)
        registerPush()
        startSocketService()
        usersListRV.layoutManager = GridLayoutManager(this,3)
        mid_user_container.visibility = ViewGroup.GONE
        lu_user_container.visibility = ViewGroup.GONE
        ru_user_container.visibility = ViewGroup.GONE
        setMenuClicks()
        MenuData_Setter(this).setMenuData(cur_username_NAV_TV,cur_country_NAV_TV,
                cur_city_NAV_TV,cur_coins_NAV_TV,profile_image_CIV,
                (findViewById<RatingBar>(R.id.go_rating)as RatingBar),
                (findViewById<TextView>(R.id.rating_value_TV) as TextView),
                if(findViewById<RelativeLayout>(R.id.network_status_container) != null)findViewById<RelativeLayout>(R.id.network_status_container) as RelativeLayout else null)


        usersListRV!!.isNestedScrollingEnabled = false
        topRow_clickListener = View.OnClickListener { v->
            var curview = v as LinearLayout;
            var data =  curview.tag as String;
            startActivity(Intent(this,UserProfileActivity::class.java)
                    .putExtra("user_data",data)
                    .putExtra("open_type", OpenTypesBy.all_data));
        }
        presenter.getData()
    }

    fun setRV(dataList: List<UserProfileModel.Datum>){
        if(rv_dataList == null){
            rv_dataList = ArrayList<UserProfileModel.Datum>()
        }
        rv_dataList!!.addAll(dataList)
        if(mAdapter==null) {
            mAdapter = MainUsersListAdapter(rv_dataList, this)
            usersListRV.adapter = mAdapter
        }
        else{
            mAdapter!!.notifyDataSetChanged()
        }
    }

    fun processViews(dataList: List<UserProfileModel.Datum>)
    {
        if(dataList.size>3){
            var dataForTopElements = dataList.subList(0,3);
            setTopElements(dataForTopElements)
            var dataForRV = dataList.subList(3,dataList.size)
            setRV(dataForRV)
        }
        else{
            setTopElements(dataList)
        }
    }
    fun setTopElements(dataList: List<UserProfileModel.Datum>){
        if(dataList.size>0){
            for (tmp in dataList){
                var indexNum = dataList.indexOf(tmp)
                when(indexNum){
                    0->{
                        //Middle
                        mid_user_container.visibility = ViewGroup.VISIBLE
                        viewIniter.setUserView(this , mid_user_container , tu_fs_status_IV,tu_fs_stars_IV,tu_fs_avatar_IV,tmp.user?.data?.avatar , tmp.rating, tmp.user?.data?.is_online)
                        mid_user_container.tag =  serializeToJson( tmp);
                        mid_user_container.setOnClickListener(topRow_clickListener)

                    }
                    1->{
                        //Left
                        lu_user_container.visibility = ViewGroup.VISIBLE
                        viewIniter.setUserView(this , lu_user_container , tu_fs_status_IV,tu_fs_stars_IV,tu_fs_avatar_IV,tmp.user?.data?.avatar , tmp.rating, tmp.user?.data?.is_online)
                        lu_user_container.tag =  serializeToJson( tmp);
                        lu_user_container.setOnClickListener(topRow_clickListener)
                    }
                    2->{
                        //Right
                        ru_user_container.visibility = ViewGroup.VISIBLE
                        viewIniter.setUserView(this , ru_user_container , tu_fs_status_IV,tu_fs_stars_IV,tu_fs_avatar_IV,tmp.user?.data?.avatar , tmp.rating, tmp.user?.data?.is_online)
                        ru_user_container.tag =  serializeToJson( tmp);
                        ru_user_container.setOnClickListener(topRow_clickListener)
                    }
                }
            }
        }
        else{
        }
    }
}
