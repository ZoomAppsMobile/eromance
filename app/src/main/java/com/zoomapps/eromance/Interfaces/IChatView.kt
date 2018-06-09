package com.zoomapps.eromance.Interfaces

import com.zoomapps.eromance.Models.ChatMessageModel
import com.zoomapps.eromance.Models.DialogsModel
import com.zoomapps.eromance.Models.UserProfileModel

/**
 * Created by User on 13.06.2017.
 */
interface IChatView{
    fun sendContentIsEmpty();

    fun messageSendSuccessfully(messageData: ChatMessageModel.Datum_)

    fun messageSendError()

    fun imageMessageSendError()

    fun userDataLoaded(joinedUserData: DialogsModel.Data?)

    fun userProfileDataLoaded(joinedUserData: UserProfileModel.Datum?)

    fun messageLoaded(loadedMessageList:List<ChatMessageModel.Datum_>?)

    fun onMessageReceived(messageData: ChatMessageModel.Datum_)
}