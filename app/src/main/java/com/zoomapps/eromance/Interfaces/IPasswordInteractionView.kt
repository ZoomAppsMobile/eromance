package com.zoomapps.eromance.Interfaces

/**
 * Created by User on 19.06.2017.
 */
interface IPasswordInteractionView {
    fun cp_OnSuccess()
    fun cp_OnError()
    fun on_CheckError(msg:String?)

    fun rp_OnSuccess()
    fun rp_OnError()

}