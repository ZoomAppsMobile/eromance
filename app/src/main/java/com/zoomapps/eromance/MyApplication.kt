package com.zoomapps.eromance

import android.app.Application
import android.content.Context
import android.content.Intent
import android.support.multidex.MultiDex
import android.support.v7.app.AppCompatDelegate
import android.widget.Toast
//import com.instabug.library.Instabug
//import com.instabug.library.invocation.InstabugInvocationEvent
import com.zoomapps.eromance.Controllers.PrefSingleton
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.mAppInstance
import com.vanniktech.emoji.EmojiManager
import com.vanniktech.emoji.one.EmojiOneProvider
import com.vk.sdk.VKAccessToken
import com.vk.sdk.VKAccessTokenTracker
import com.vk.sdk.VKSdk
import com.zoomapps.eromance.Activities.AuthActivity
import com.zoomapps.eromance.Controllers.PaymentController
import com.zoomapps.eromance.Helpers.GlobalStaticVariables

class MyApplication : Application() {

    init {

        instance = this
    }

    companion object {
        private var instance: MyApplication? = null

        fun applicationContext() : Context {
            return instance!!.applicationContext
        }
    }


    var vkAccessTokenTracker: VKAccessTokenTracker = object : VKAccessTokenTracker() {
        override fun onVKAccessTokenChanged(oldToken: VKAccessToken?, newToken: VKAccessToken?) {
            if (newToken == null) {
                val intent = Intent(this@MyApplication, AuthActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(intent)
            }
        }
    }

   override fun onCreate() {
        super.onCreate()
          GlobalStaticVariables.language_type = GlobalStaticVariables.sharedPreferences.getString("language", "ru")
          MultiDex.install(this);
          AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
           vkAccessTokenTracker.startTracking()
           VKSdk.initialize(this)
//       Realm.init(this)
        PrefSingleton.instance.Initialize(applicationContext)
      //  Stetho.initializeWithDefaults(this)
       EmojiManager.install(EmojiOneProvider())
       PaymentController.getInstance().init_payment()
//       Instabug.Builder(this, "bf30e9998b6adfe5fadad87325fb47b1")
//               .setInvocationEvent(InstabugInvocationEvent.SCREENSHOT_GESTURE)
//               .build()
     //  VKSdk.initialize(applicationContext)
       mAppInstance = this

       val context: Context = MyApplication.applicationContext()
    }

}