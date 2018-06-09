package com.zoomapps.eromance.Controllers

import android.content.Context
import android.preference.PreferenceManager
import android.content.SharedPreferences

class PrefSingleton private constructor() {
    private var mContext: Context? = null
    private var mMyPreferences: SharedPreferences? = null

    fun Initialize(ctxt: Context) {
        mContext = ctxt
        mMyPreferences = PreferenceManager.getDefaultSharedPreferences(mContext)
    }

    fun getPref():SharedPreferences?{
        if(mMyPreferences!=null)
             return mMyPreferences
        else
            return null
    }

    fun getPreference(key:String):String{
        return mMyPreferences!!.getString(key,"")
    }
    fun getBooleanPreference(key:String):Boolean{
        return mMyPreferences!!.getBoolean(key,false)
    }

    fun writePreference(key: String, value: String) {
        val e = mMyPreferences!!.edit()
        e.putString(key, value)
        e.commit()
    }
    fun writeBooleanPreference(key: String, value: Boolean) {
        val e = mMyPreferences!!.edit()
        e.putBoolean(key, value)
        e.commit()
    }
    companion object {
        private var mInstance: PrefSingleton? = null
        val instance: PrefSingleton
            get() {
                if (mInstance == null) mInstance = PrefSingleton()
                return mInstance!!
            }
    }

}