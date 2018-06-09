package com.zoomapps.eromance.Interfaces

import com.zoomapps.eromance.Models.GiftsModel
import com.zoomapps.eromance.Models.UserPhotosModel
import com.zoomapps.eromance.Models.UserProfileModel

/**
 * Created by User on 06.07.2017.
 */
interface IUserProfileView {
    fun onUserProfileDataLoaded(out: UserProfileModel.Datum?)
    fun onUserPhotosLoaded(out : List<UserPhotosModel.Data> )
    fun onUserGiftsLoaded(out: List<GiftsModel.Data>)
    fun onUserGiftsLoaded2(out: List<GiftsModel.Datum>)
    fun onGiftSendSuccesfully()
    fun onGiftSendError()
    fun onUserAreBlocked()
}