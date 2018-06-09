package com.zoomapps.eromance.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.Helpers.PasswordInteractionPresenter
import com.zoomapps.eromance.Interfaces.IPasswordInteractionView
import com.zoomapps.eromance.R
import kotterknife.bindView
import android.content.DialogInterface
import android.os.Build
import android.widget.*
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.DataResetPassword
import com.zoomapps.eromance.Models.MeetsModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class PasswordInteractionActivity : AppCompatActivity(), IPasswordInteractionView {
    override fun on_CheckError(msg: String?) {
        showToast(this, msg!!)
    }

    override fun cp_OnSuccess() {
        showToast(this, getString(R.string.success_update_password))
        finish()
    }

    override fun cp_OnError() {
        showPreparedToast(this, getString(R.string.error))
    }

    override fun rp_OnSuccess() {
        showPreparedToast(this, getString(R.string.password_send_email))
        finish()
    }

    override fun rp_OnError() {
        showPreparedToast(this, getString(R.string.error))
    }

    val change_password_container: LinearLayout by bindView(R.id.change_password_container)
    val current_password_ED: EditText by bindView(R.id.current_password_ED)
    val retype_new_password_ED: EditText by bindView(R.id.retype_new_password_ED)
    val restore_password_container: LinearLayout by bindView(R.id.restore_password_container)
    val user_email_for_restore_ED: EditText by bindView(R.id.user_email_for_restore_ED)
    val confirm_btn: Button by bindView(R.id.confirm_btn)
    val presenter = PasswordInteractionPresenter(this, this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_interaction)
        setToolbar(this,
                "",
                findViewById<TextView>(R.id.tv_map) as TextView,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView,
                true)
        init_mainview(intent.getStringExtra("type"))
        setBtn()
    }

    var view_type: Int? = null;
    fun getDataToSend(): String {
        when (view_type) {
            1 -> {
                return current_password_ED.text.toString()
            }
            2 -> {
                return user_email_for_restore_ED.text.toString()

            }
            else -> {
                return ""
            }
        }
    }

    fun setBtn() {
        var pca = DialogInterface.OnClickListener { dialog, which ->
            presenter.makeAction(view_type!!, getDataToSend())
        }
        var nca = DialogInterface.OnClickListener { dialog, which ->

        }
        confirm_btn.setOnClickListener {

            when (view_type) {
                1 -> {
                    val apiService = API_Client.client!!.create(API_Interface::class.java)
                    apiService.chanchePassword(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId!!, current_password_ED.text.toString(),retype_new_password_ED.text.toString()).enqueue(object : Callback<DataResetPassword> {
                        override fun onResponse(call: Call<DataResetPassword>?, response: Response<DataResetPassword>) {
                            if (response.isSuccessful) {
                                if (response.body().code == 302) {
                                    Toast.makeText(this@PasswordInteractionActivity, getString(R.string.email_no), Toast.LENGTH_LONG).show()
                                } else {
                                    Toast.makeText(this@PasswordInteractionActivity, getString(R.string.success_update_password), Toast.LENGTH_LONG).show()
                                }
                            } else {
                                Toast.makeText(this@PasswordInteractionActivity, getString(R.string.error_data), Toast.LENGTH_LONG).show()
                            }


                        }

                        override fun onFailure(call: Call<DataResetPassword>?, t: Throwable) {

                        }
                    })




                }
                2 -> {
                    if (user_email_for_restore_ED.text.length >= 3) {
                        val apiService = API_Client.client!!.create(API_Interface::class.java)
                        apiService.resetPassword(user_email_for_restore_ED.text.toString()).enqueue(object : Callback<DataResetPassword> {
                            override fun onResponse(call: Call<DataResetPassword>?, response: Response<DataResetPassword>) {
                                if (response.isSuccessful) {
                                    if (response.body().code == 302) {
                                        Toast.makeText(this@PasswordInteractionActivity, getString(R.string.email_no), Toast.LENGTH_LONG).show()
                                    } else {
                                        Toast.makeText(this@PasswordInteractionActivity, getString(R.string.success_update_password), Toast.LENGTH_LONG).show()
                                    }
                                } else {
                                    Toast.makeText(this@PasswordInteractionActivity,  getString(R.string.error_data), Toast.LENGTH_LONG).show()
                                }


                            }

                            override fun onFailure(call: Call<DataResetPassword>?, t: Throwable) {

                            }
                        })
                    } else {
                        Toast.makeText(this, "Укажите почту", Toast.LENGTH_LONG).show()
                    }
                }
            }


        }

    }

    fun init_mainview(type: String?) {
        if (type == null || type == "") {
            finish();return
        }

        when (type) {
            "change" -> {
                (findViewById<TextView>(R.id.type_title_TV) as TextView).text = getString(R.string.edit_password)
                view_type = 1;
                change_password_container.visibility = ViewGroup.VISIBLE
                restore_password_container.visibility = ViewGroup.GONE
               // retype_new_password_ED.addTextChangedListener(presenter.checkPasswordTypes(current_password_ED, retype_new_password_ED))
            }
            "restore" -> {
                (findViewById<TextView>(R.id.type_title_TV) as TextView).text = getString(R.string.reestablish_password)
                view_type = 2;
                change_password_container.visibility = ViewGroup.GONE
                restore_password_container.visibility = ViewGroup.VISIBLE
            }
            else -> {
                init_mainview(null)
            }
        }
    }
}

