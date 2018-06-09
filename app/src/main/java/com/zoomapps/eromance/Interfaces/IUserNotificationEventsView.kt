package com.zoomapps.eromance.Interfaces

import com.zoomapps.eromance.Models.Notifications_Event_List_Model

/**
 * Created by User on 19.06.2017.
 */
interface IUserNotificationEventsView {
    fun onLoaded(dataList:List<Notifications_Event_List_Model.Datum>?)
    fun onError()
    fun onEmpty()
}