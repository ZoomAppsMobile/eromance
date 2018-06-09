package com.zoomapps.eromance.Interfaces

import com.zoomapps.eromance.Models.GiftsModel

/**
 * Created by User on 11.07.2017.
 */
interface IGiftsView {
    fun onLoaded(data: GiftsModel.UserGiftsResponse?)
    fun onLoadError()
    fun giftSelected(giftId:String)
}