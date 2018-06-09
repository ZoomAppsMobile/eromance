package com.zoomapps.eromance.Interfaces

import com.zoomapps.eromance.Models.DialogsModel

/**
 * Created by User on 15.06.2017.
 */
interface DialogsView{
    fun onLoaded( datalist: List<DialogsModel.Datum>)
    fun onLoadingError()
    fun onDataEmpty()
}