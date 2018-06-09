package com.zoomapps.eromance.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import com.zoomapps.eromance.Activities.auth.EditProfileActivity
import com.zoomapps.eromance.R
import io.realm.Realm
import java.security.AccessController.getContext


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        try {
            Realm.init(getApplicationContext());
            val realm = Realm.getDefaultInstance()
            realm.beginTransaction()
            realm.deleteAll()
            realm.commitTransaction()
        }catch (ex :Exception){

        }
        startAuth()
    }

    fun startAuth() {
       startActivity(Intent(this@SplashActivity, AuthActivity::class.java))
       //startActivity(Intent(this@SplashActivity, EditProfileActivity::class.java))
        finish()
    }
}
