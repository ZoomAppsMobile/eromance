package com.zoomapps.eromance.Interfaces

/**
 * Created by User on 29.05.2017.
 */
interface MapDialogInterface{
    fun setSex(type:Int)
    fun removeSex(type:Int)
    //fun checkSex(type:Int):Boolean

    fun setType(type:Int)
    fun removeType(type:Int)
    fun checkType(type:Int):Boolean

    fun setDialogResult()
}