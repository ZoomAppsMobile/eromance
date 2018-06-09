package com.zoomapps.eromance

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

open class BaseActivity : AppCompatActivity() {
    val THRESHOLD = 2000L
    var doubleBackToExitPressedOnce = false
    
    override fun onBackPressed() {
        if(doubleBackToExitPressedOnce){
            super.onBackPressed()
            return
        }
        doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Нажмите два раза чтобы выйти", Toast.LENGTH_SHORT).show();
        Handler().postDelayed(Runnable {
            doubleBackToExitPressedOnce=false;
        },THRESHOLD)
    }
}
