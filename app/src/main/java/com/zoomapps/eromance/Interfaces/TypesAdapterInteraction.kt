package com.zoomapps.eromance.Interfaces

/**
 * Created by User on 29.05.2017.
 */
interface TypesAdapterInteraction {
    fun addType(type_id:Int);
    fun checkType(type_id:Int):Boolean;
    fun removeType(type_id:Int)
}