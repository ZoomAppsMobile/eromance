package com.zoomapps.eromance.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.*
import com.zoomapps.eromance.Adapters.NotificationsEventsAdapter
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Helpers.UserNotificationEventsPresenter
import com.zoomapps.eromance.Interfaces.IUserInteractionView
import com.zoomapps.eromance.Interfaces.IUserNotificationEventsView
import com.zoomapps.eromance.Models.Notifications_Event_List_Model
import com.zoomapps.eromance.R
import kotterknife.bindView

class UserNotificationEventsActivity : AppCompatActivity() , IUserNotificationEventsView {

    override fun onLoaded(dataList: List<Notifications_Event_List_Model.Datum>?) {
        setViewInfo(is_type_error = false)
        if(dataList!=null) {
            var filteredData = dataList.filter { it -> it.entityClass != "App\\Conversation\\Message\\Message" }
            //INIT RV
            this.dataList = filteredData;
            mAdapter = NotificationsEventsAdapter(this.dataList!!, this)
            notif_list_rv.layoutManager = mLL_Manager
            notif_list_rv.adapter = mAdapter
        }
    }

    override fun onError() {
        setViewInfo(getString(R.string.error_data))

    }

    override fun onEmpty() {
        setViewInfo(getString(R.string.no_data))
    }

    fun setViewInfo(msg:String="", is_type_error:Boolean=true){
        if(is_type_error) {
            statusMessage_TV.text = msg
            loading_PB.visibility = ViewGroup.GONE
        }
        else{
            loading_PB.visibility = ViewGroup.GONE
            content_helper_LL.visibility = ViewGroup.GONE
            notif_list_rv.visibility= ViewGroup.VISIBLE
        }
    }

    val userNotifPresenter = UserNotificationEventsPresenter(this,this)

    //--View---
    val loading_PB : ProgressBar by bindView(R.id.loading_PB)
    val notif_list_rv : RecyclerView by bindView(R.id.notif_list_rv)
    val statusMessage_TV : TextView by bindView(R.id.statusMessage_TV)
    val helper_BTN : Button by bindView(R.id.helper_BTN)
    val content_helper_LL: LinearLayout by bindView(R.id.content_helper_LL)
    //RV Elements
    var mAdapter : RecyclerView.Adapter<*>?=null
    val mLL_Manager = LinearLayoutManager(this)
    var dataList : List<Notifications_Event_List_Model.Datum>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_notification_events)
        setToolbar(this ,
                getString(R.string.events),
                findViewById<TextView>(R.id.tv_map) as TextView,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView,
                true)

        statusMessage_TV.text= getString(R.string.go_upload)
        userNotifPresenter.getData();
    }
}
