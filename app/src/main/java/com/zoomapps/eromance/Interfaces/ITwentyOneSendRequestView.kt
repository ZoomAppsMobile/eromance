package com.zoomapps.eromance.Interfaces

/**
 * Created by User on 30.06.2017.
 */
interface ITwentyOneSendRequestView {
    fun onRequestSendSuccessfully()
    fun onRequestSendError(err_msg:String?="")
}
