package com.zoomapps.eromance.Interfaces

import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.MeetsModel

/**
 * Created by User on 14.09.2017.
 */
interface IMeetNotificationDetailsView {
    fun onAcceptedUserToMeet()
    fun onDeclinedUserFromMeet()

    fun onRequestError()
    fun onShowToast(message: String)

    fun onLoadMeetData(_meetData: MeetsModel.Datum?)
    fun onLoadDesiredUserData(_userData: LoginModel.Datum?)

    fun close()
}