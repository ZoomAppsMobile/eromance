package com.zoomapps.eromance.Interfaces

import com.zoomapps.eromance.Models.UserRateModel

/**
 * Created by User on 13.06.2017.
 */
interface IFavoritesView{
    fun onLoaded(likelist:List<UserRateModel.Datum>)
    fun onLoadError()
    fun onEmpty()
}