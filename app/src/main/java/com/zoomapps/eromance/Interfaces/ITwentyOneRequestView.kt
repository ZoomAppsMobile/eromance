package com.zoomapps.eromance.Interfaces

import com.zoomapps.eromance.Models.AdultRequestsModel

/**
 * Created by User on 04.07.2017.
 */
interface ITwentyOneRequestView {
    fun onDataLoaded(out: AdultRequestsModel.AdultRequestsListResponse)
    fun onDataLoadError()
}