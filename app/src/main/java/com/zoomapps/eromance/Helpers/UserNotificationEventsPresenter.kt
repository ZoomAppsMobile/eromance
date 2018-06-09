package com.zoomapps.eromance.Helpers

import android.content.Context
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Controllers.RequestMaker
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Interfaces.IUserNotificationEventsView
import com.zoomapps.eromance.Interfaces.RequestMakerListener
import com.zoomapps.eromance.Models.Notifications_Event_List_Model

/**
 * Created by User on 19.06.2017.
 */
class UserNotificationEventsPresenter(val mContext: Context,
                                      val viewInterface : IUserNotificationEventsView):RequestMakerListener {
    override fun <T> onError(out: T?) {
        showPreparedToast(mContext,"Error")
        viewInterface.onError()
    }

    val requestMaker=RequestMaker(this)

    override fun <T> onRequestSuccess(out: T) {
        var data = out as Notifications_Event_List_Model.NotifiactionsListResponse
        if(data!=null && data.data!=null && data.data?.isNotEmpty()!!)
            viewInterface.onLoaded(data.data)
        else
            viewInterface.onEmpty()
    }

    fun getData(){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getUserNotifications(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId.toString())
        requestMaker.makeRequest(call)
    }
}