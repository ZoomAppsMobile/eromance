package com.zoomapps.eromance.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.*
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Adapters.GuestAdapter
import com.zoomapps.eromance.Controllers.RequestMaker
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Interfaces.RequestMakerListener
import com.zoomapps.eromance.Models.GuestModel
import com.zoomapps.eromance.Models.Notifications_Event_List_Model
import com.zoomapps.eromance.R
import kotterknife.bindView

class MyGuestsActivity : AppCompatActivity() , RequestMakerListener {
    override fun <T> onError(out: T?) {
        content_helper_LL.visibility = ViewGroup.GONE
        showPreparedToast(this, getString(R.string.error))
    }

    override fun <T> onRequestSuccess(out: T) {
        content_helper_LL.visibility = ViewGroup.GONE
        var response = (out as GuestModel.GuestListResponse)
        if(response.data==null && response.data?.isEmpty()!!){
            showToast(this , getString(R.string.list_empty))
            return
        }
        else {
            notif_list_rv.visibility = ViewGroup.VISIBLE
            dataList = response.data;
            mAdapter = GuestAdapter(dataList!! , this)
            notif_list_rv.layoutManager = LinearLayoutManager(this)
            notif_list_rv.adapter = mAdapter;
        }
    }
    val loading_PB : ProgressBar by bindView(R.id.loading_PB)
    val notif_list_rv : RecyclerView by bindView(R.id.notif_list_rv)
    val statusMessage_TV : TextView by bindView(R.id.statusMessage_TV)
    val helper_BTN : Button by bindView(R.id.helper_BTN)
    val content_helper_LL: LinearLayout by bindView(R.id.content_helper_LL)
    //RV Elements
    var mAdapter : RecyclerView.Adapter<*>?=null
    val mLL_Manager = LinearLayoutManager(this)
    var dataList : List<GuestModel.Datum>?=null

    val requestMaker = RequestMaker(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_guests)
        setToolbar(this ,
                getString(R.string.guests),
                findViewById<TextView>(R.id.tv_map) as TextView,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView,
                true)
        getData()
    }
    fun getData(){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getGuestList(GlobalStaticVariables.language_type!!)
        requestMaker.makeRequest(call)
    }
}
