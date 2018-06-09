package com.zoomapps.eromance.Interfaces

/**
 * Created by User on 16.06.2017.
 */
interface RequestMakerListener {
    fun<T> onError(out:T?=null)
    fun<T> onRequestSuccess(out:T)
}