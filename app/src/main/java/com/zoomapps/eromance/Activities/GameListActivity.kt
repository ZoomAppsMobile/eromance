package com.zoomapps.eromance.Activities

import android.app.Activity
import android.content.Intent
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.view.ViewPager
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.ViewGroup
import android.widget.*
import com.bumptech.glide.Glide
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Adapters.GameListAdapter
import com.zoomapps.eromance.BaseActivity
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.MenuClickListener
import com.zoomapps.eromance.Helpers.MenuData_Setter
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.GameModel
import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView
import kotterknife.bindView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import android.support.v4.view.PagerAdapter
import com.zoomapps.eromance.Adapters.ScreenSlidePagerAdapter
import com.zoomapps.eromance.Helpers.GameHelper
import com.zoomapps.eromance.Interfaces.IGameView
import com.zoomapps.eromance.Models.GameHistoryModel


class GameListActivity : BaseActivity(), IGameView ,ViewPager.OnPageChangeListener
{
    var TYPE_All = "All"
    var TYPE_History = "History"

    override fun onLoadedStarted(out: String) {
        when(out){
            TYPE_All->{
                mPagerAdapter.all_games_fragment?.onLoadedStarted()
            }
            TYPE_History->{
                mPagerAdapter.history_games_fragment?.onLoadedStarted()
            }

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(resultCode ==  Activity.RESULT_OK){
            if(requestCode == 215){
                mPagerAdapter.all_games_fragment?.getData();
            }
        }
    }

    override fun onPageScrollStateChanged(state: Int) {
        var test =""
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        var test =""
    }

    override fun onPageSelected(position: Int) {
        updateTextUI(position)
    }

    override fun onHistoryGamesLoaded(data: List<GameHistoryModel.Datum>) {
        mPagerAdapter.history_games_fragment?.updateRV(data)
    }

    override fun onAllGamesLoaded(data: List<GameModel.GamesListModel.Datum>) {
        mPagerAdapter.all_games_fragment?.updateRV(data)
    }

    val create_game_btn : FloatingActionButton by bindView(R.id.create_game_btn)
    val main_RV : RecyclerView by bindView(R.id.main_RV)
     var mAdapter: RecyclerView.Adapter<*>? = null
    val viewPager : ViewPager by bindView(R.id.pager)
    val prensenter = GameHelper(this,this)
    val game_all_TV : TextView by bindView(R.id.game_all_TV)
    val game_history_TV : TextView by bindView(R.id.game_history_TV)
    val refresh_IV : ImageView by bindView(R.id.refresh_IV)

    fun setMenuClicks(){
        (findViewById<LinearLayout>(R.id.myProfile_NAV_LL)).setOnClickListener(MenuClickListener(this))
        (findViewById<LinearLayout>(R.id.games_NAV_LL)).setOnClickListener(MenuClickListener(this))
        (findViewById<LinearLayout>(R.id.settings_NAV_LL) ).setOnClickListener(MenuClickListener(this))
    }
    //--------------------------------
    private var mLayoutManager: RecyclerView.LayoutManager? = null
    lateinit var mPagerAdapter : ScreenSlidePagerAdapter
    var start_view_pos = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(GlobalStaticVariables.isUser_Twenty_One_Provider==true) {
            setContentView(R.layout.activity_21_game_list)
            (findViewById<LinearLayout>(R.id.twentyOne_Requests_NAV_LL) ).setOnClickListener(MenuClickListener(this))
            findViewById<LinearLayout>(R.id.home_21_NAV_LL).setOnClickListener(MenuClickListener(this))

        }
        else {
            setContentView(R.layout.activity_game_list)
            (findViewById<LinearLayout>(R.id.searchPair_NAV_LL) ).setOnClickListener(MenuClickListener(this))
            (findViewById<LinearLayout>(R.id.momentMeets_NAV_LL) ).setOnClickListener(MenuClickListener(this))
            (findViewById<LinearLayout>(R.id.placesForRest_NAV_LL) ).setOnClickListener(MenuClickListener(this))
            (findViewById<LinearLayout>(R.id.eveningPlans_NAV_LL)).setOnClickListener(MenuClickListener(this))
            (findViewById<LinearLayout>(R.id.map_NAV_LL) ).setOnClickListener(MenuClickListener(this))
            (findViewById<LinearLayout>(R.id.twentyOne_NAV_LL) ).setOnClickListener(MenuClickListener(this))
            findViewById<LinearLayout>(R.id.home_NAV_LL).setOnClickListener(MenuClickListener(this))
        }
        if(intent.getBooleanExtra("from_notification",false)){
            start_view_pos = 1
        }
        setToolbar(this ,
                getString(R.string.game),
                findViewById<TextView>(R.id.tv_map) ,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn),
                false,
                findViewById<TextView>(R.id.drawer_layout) as DrawerLayout)

        setMenuClicks()
        val cur_username_NAV_TV = (findViewById<TextView>(R.id.cur_username_NAV_TV))
        val cur_country_NAV_TV = (findViewById<TextView>(R.id.cur_country_NAV_TV) )
        val cur_city_NAV_TV = (findViewById<TextView>(R.id.cur_city_NAV_TV) )
        val cur_coins_NAV_TV = (findViewById<TextView>(R.id.cur_coins_NAV_TV) )
        val profile_image_CIV = (findViewById<CircleImageView>(R.id.profile_image_CIV) )

        MenuData_Setter(this).setMenuData(cur_username_NAV_TV,cur_country_NAV_TV,
                cur_city_NAV_TV,cur_coins_NAV_TV,profile_image_CIV,
                (findViewById<RatingBar>(R.id.go_rating)),
                (findViewById<TextView>(R.id.rating_value_TV)),
                if(findViewById<RelativeLayout>(R.id.network_status_container) != null)
                    findViewById<RelativeLayout>(R.id.network_status_container) else null)

//        main_RV!!.isNestedScrollingEnabled = false
//        mLayoutManager = LinearLayoutManager(this@GameListActivity)
//        main_RV!!.layoutManager = mLayoutManager
        create_game_btn.setOnClickListener {
            startActivityForResult(Intent(this,GameCreatedActivity::class.java),215)
        }
        mPagerAdapter = ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mPagerAdapter);
        game_all_TV.setOnClickListener {
            updateTextUI(0)
        }
        game_history_TV.setOnClickListener {
            updateTextUI(1)
        }
        viewPager.setOnPageChangeListener(this)
        viewPager.setCurrentItem(start_view_pos)
        refresh_IV.setOnClickListener {
            updateViewContent()
        }
    }
    var listLoaded = false;
    fun updateViewContent(){
        prensenter.getGameHistory()
        prensenter.getData()
    }

    fun updateTextUI(num:Int){
        when(num){
            0->{
                game_all_TV.setTypeface(null, Typeface.BOLD);
                game_history_TV.setTypeface(null, Typeface.NORMAL);
            }
            1->{
                game_history_TV.setTypeface(null, Typeface.BOLD);
                game_all_TV.setTypeface(null, Typeface.NORMAL);
            }
        }

        viewPager.setCurrentItem(num,true)
    }
    val finishedgames="finished"
    val opengames="open"
    var list_current_type = opengames;
    fun init_switcher(){
//        gameList_swicher_TV.setOnClickListener {
//            var new_type = (getTypeByStatus()+1).mod(2)
//            getData(new_type)
//            update_UI(new_type)
//        }
    }


    var AdapterData : MutableList<GameModel.GamesListModel.Datum> ?=null
//    fun init_recyclerView(data:MutableList<GameModel.GamesListModel.Datum>){
//        AdapterData = data
//        mDataAdapter = GameListAdapter(AdapterData,this)
//        main_RV!!.adapter = mDataAdapter
//    }
    var isStoped = false
    override fun onStop() {
        super.onStop()
        isStoped = true
    }
    fun getTypeByStatus():Int{
        when(list_current_type){
            opengames->{
                return 0
            }
            finishedgames->{
                return 1
            }
            else->{
                return -1
            }
        }
    }
    override fun onResume() {
        super.onResume()
        if(isStoped){
            isStoped=!isStoped
//            getData(getTypeByStatus())
        }
    }
}
