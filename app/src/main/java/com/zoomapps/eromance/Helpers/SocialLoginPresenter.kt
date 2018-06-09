package com.zoomapps.eromance.Helpers

import android.app.Activity
import android.content.Context
import com.zoomapps.eromance.Interfaces.ISocialLoginView

/**
 * Created by User on 21.06.2017.
 */
class SocialLoginPresenter(val mContext: Activity, var _view : ISocialLoginView){
    fun fb_login(){
        val scope = mutableListOf<String>()
        scope.add("public_profile")
        scope.add("email")
    }
}