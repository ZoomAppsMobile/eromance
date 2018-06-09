package com.zoomapps.eromance.Interfaces

import com.zoomapps.eromance.Models.UserProfileModel
import com.zoomapps.eromance.Models.UserRateModel

/**
 * Created by User on 26.07.2017.
 */
interface ISearchUserView {
    fun onDataLoaded(datum:List<UserRateModel.Datum>)

    fun onLoadError(msg:String)
}