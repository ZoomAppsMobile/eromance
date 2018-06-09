package com.zoomapps.eromance.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.*
import com.zoomapps.eromance.Adapters.TwentyOneRequestsAdapter
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Helpers.MenuClickListener
import com.zoomapps.eromance.Helpers.MenuData_Setter
import com.zoomapps.eromance.Helpers.TwentyOneRequestsPresenter
import com.zoomapps.eromance.Interfaces.ITwentyOneRequestView
import com.zoomapps.eromance.Models.AdultRequestsModel
import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView
import kotterknife.bindView
import java.util.*

class TwentyOneRequestsActivity : AppCompatActivity() , ITwentyOneRequestView {
    override fun onDataLoadError() {

    }

    override fun onDataLoaded(out: AdultRequestsModel.AdultRequestsListResponse) {
        if(out !=null && out.data?.isNotEmpty()!!){
            setRV(out.data!!)
        }
    }

    val request_list_RV : RecyclerView by bindView(R.id.request_list_RV)


    val drawer_layout : DrawerLayout by bindView(R.id.drawer_layout)
    val tv_map : TextView by bindView(R.id.tv_map)

    val myProfile_NAV_LL : LinearLayout by bindView(R.id.myProfile_NAV_LL)
    val games_NAV_LL : LinearLayout by bindView(R.id.games_NAV_LL)
    val twentyOne_NAV_LL : LinearLayout by bindView(R.id.twentyOne_Requests_NAV_LL)
    val settings_NAV_LL : LinearLayout by bindView(R.id.settings_NAV_LL)
    val cur_username_NAV_TV : TextView by bindView(R.id.cur_username_NAV_TV)
    val cur_country_NAV_TV : TextView by bindView(R.id.cur_country_NAV_TV)
    val cur_city_NAV_TV : TextView by bindView(R.id.cur_city_NAV_TV)
    val cur_coins_NAV_TV : TextView by bindView(R.id.cur_coins_NAV_TV)
    val profile_image_CIV : CircleImageView by bindView(R.id.profile_image_CIV)

    var mAdapter : RecyclerView.Adapter<*>?=null
    var adapterDataList : MutableList<AdultRequestsModel.Datum>?=null
    val presenter = TwentyOneRequestsPresenter(this,this)

    fun setMenuClicks(){
        myProfile_NAV_LL.setOnClickListener(MenuClickListener(this))
        games_NAV_LL.setOnClickListener(MenuClickListener(this));
        twentyOne_NAV_LL.setOnClickListener(MenuClickListener(this));
        settings_NAV_LL.setOnClickListener(MenuClickListener(this));
        findViewById<LinearLayout>(R.id.home_21_NAV_LL).setOnClickListener(MenuClickListener(this))
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twenty_one_requests)
        setMenuClicks()
        MenuData_Setter(this).setMenuData(cur_username_NAV_TV,cur_country_NAV_TV,
                cur_city_NAV_TV,cur_coins_NAV_TV,profile_image_CIV,
                (findViewById<RatingBar>(R.id.go_rating)as RatingBar),
                (findViewById<TextView>(R.id.rating_value_TV) as TextView),if(findViewById<RelativeLayout>(R.id.network_status_container) != null)findViewById<RelativeLayout>(R.id.network_status_container) as RelativeLayout else null)
        setToolbar(this ,
                "Запросы",
                findViewById<TextView>(R.id.tv_map) as TextView,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView ,
                false,
                findViewById<DrawerLayout>(R.id.drawer_layout) as DrawerLayout)

        adapterDataList =  ArrayList<AdultRequestsModel.Datum>()
        request_list_RV.layoutManager = LinearLayoutManager(this)
        presenter.getData()
    }

    fun setRV(datum:List<AdultRequestsModel.Datum>){
        adapterDataList?.clear()
        adapterDataList?.addAll(datum)
        if(mAdapter==null){
            mAdapter = TwentyOneRequestsAdapter(adapterDataList,this)
            request_list_RV.adapter = mAdapter
        }
        else{
            mAdapter?.notifyDataSetChanged()
        }
    }
}
