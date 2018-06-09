package com.zoomapps.eromance.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.zoomapps.eromance.BaseActivity
import com.zoomapps.eromance.Controllers.GlobalVariables
import com.zoomapps.eromance.Controllers.PrefSingleton
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.R
import kotterknife.bindView

class TwentyOneStartActivty : BaseActivity() {

    val btn_send_request_to_service : Button by bindView(R.id.btn_send_request_to_service)
    val btn_become_provider : Button by bindView(R.id.btn_become_provider)
    val cancel_btn  : Button by bindView(R.id.cancel_btn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twenty_one_start_activty)
        cancel_btn.setOnClickListener {
            finish()
        }
        btn_send_request_to_service.setOnClickListener {
            startActivity(Intent(this@TwentyOneStartActivty , TwentyOneSearchActivity::class.java))
            finish()
        }
        btn_become_provider.setOnClickListener {
            if(PrefSingleton.instance.getBooleanPreference(GlobalVariables.is_becomeprovider_request_send_key) != true)
            {
                startActivity(Intent(this@TwentyOneStartActivty, TwentyOneBecomeProviderActivity::class.java))
                finish()
            }
            else{
                showToast(this,getString(R.string.reply_moderator))
            }
        }

    }
}
