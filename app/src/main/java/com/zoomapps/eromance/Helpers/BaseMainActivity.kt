package com.zoomapps.eromance.Helpers

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

open class BaseMainActivity : AppCompatActivity() {
    protected var mContext : Context?=null ;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_base_main)

    }
   protected open fun setupBase(){}

}
