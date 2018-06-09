package com.zoomapps.eromance.Activities


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.zoomapps.eromance.BaseActivity
import com.zoomapps.eromance.Controllers.GlobalVariables
import com.zoomapps.eromance.Controllers.PrefSingleton

import com.zoomapps.eromance.R
import kotterknife.bindView

class TwentyOneLicenseAgreementActivity : BaseActivity() {

    val btn_acquaited_with : Button by bindView(R.id.btn_acquaited_with)
    val btn_cancel : Button by bindView(R.id.btn_cancel)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_21_license_agreement)
        btn_acquaited_with.setOnClickListener {
            PrefSingleton.instance.writeBooleanPreference(GlobalVariables.isUserReadAgreement_key,true)
            startActivity(Intent(this@TwentyOneLicenseAgreementActivity,TwentyOneStartActivty::class.java))
            finish()
        }
        btn_cancel.setOnClickListener {
            finish()
        }
    }
}
