package com.zoomapps.eromance.Activities


import android.content.DialogInterface
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Build
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View

import com.zoomapps.eromance.R
import kotterknife.bindView
import android.content.Intent
import android.R.id.message
import android.content.SharedPreferences
import android.net.Uri
import android.os.Handler
import android.preference.PreferenceManager
import android.util.Log
import android.view.LayoutInflater
import android.widget.*
import com.bumptech.glide.Glide
import com.google.android.gms.plus.PlusShare
import com.zoomapps.eromance.BaseActivity
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import ru.ok.android.sdk.Odnoklassniki
import com.facebook.share.widget.AppInviteDialog
import com.facebook.share.model.AppInviteContent
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.Helpers.OpenTypesBy
import com.zoomapps.eromance.Helpers.ThirdPartyApiCalls
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.ConnectedToMeetResponse
import de.hdodenhof.circleimageview.CircleImageView
import io.realm.Realm
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Response
import ru.ok.android.sdk.OkAuthListener
import ru.ok.android.sdk.OkListener
import ru.ok.android.sdk.util.OkAuthType
import ru.ok.android.sdk.util.OkScope
import java.util.*


class SettingLanguageActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    lateinit var sharedPreferences: SharedPreferences
    override fun onClick(v: View?) {
        var sharing = Intent(Intent.ACTION_SEND)
        when (v!!.id) {
            R.id.btn_walking -> {
                sharing = Intent(Intent.ACTION_SEND)
                sharing.setType("text/plain");
                sharing.setPackage("com.whatsapp");
                sharing.putExtra(Intent.EXTRA_TEXT, "The text you wanted to share");
                try {
                } catch (ex: android.content.ActivityNotFoundException) {
                    Toast.makeText(this, "Whatsapp have not been installed.", Toast.LENGTH_LONG).show()
                }
            }
            R.id.vk_invite -> {
                sharing.setType("text/plain");
                sharing.setPackage("com.vk");
                sharing.putExtra(Intent.EXTRA_TEXT, "The text you wanted to share");
                try {
                    startActivity(sharing);
                } catch (ex: android.content.ActivityNotFoundException) {
                    Toast.makeText(this, "Привет vk", Toast.LENGTH_LONG).show()
                }
            }
        }
        startActivity(sharing);
    }


    internal val btnOpenDrawer: RelativeLayout by bindView(R.id.btnOpenDrawer)
    internal val drawer_layout: DrawerLayout by bindView(R.id.drawer_layout)
    internal val tv_map: TextView by bindView(R.id.tv_map)
    internal var menu_btn_sbsed = false
    val notif_settings: LinearLayout by bindView(R.id.notif_settings)
    val tv_contol: TextView by bindView(R.id.tv_contol)
    val tv_feedback_coders: TextView by bindView(R.id.tv_feedback_coders)
    val rb_english: RadioButton by bindView(R.id.rb_english);
    val rb_ru: RadioButton by bindView(R.id.rb_ru);
    val rb_kz: RadioButton by bindView(R.id.rb_kz);
    val tv_delete_account: TextView by bindView(R.id.tv_delete_account)
    val shareWhatsApp: TextView by bindView(R.id.btn_walking)
    val vk_invite: TextView by bindView(R.id.vk_invite)


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 22890) {
            if (Odnoklassniki.getInstance().isActivityRequestOAuth(requestCode)) {
                Odnoklassniki.getInstance().onAuthActivityResult(requestCode, resultCode, data, getAuthListener());
            } else if (Odnoklassniki.getInstance().isActivityRequestViral(requestCode)) {
                Odnoklassniki.getInstance().onActivityResultResult(requestCode, resultCode, data, getToastListener());
            } else {
                super.onActivityResult(requestCode, resultCode, data);
            }
        }
        //super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting_language)
        rb_english.setOnCheckedChangeListener(this)
        rb_ru.setOnCheckedChangeListener(this)
        rb_kz.setOnCheckedChangeListener(this)
        rb_ru.setOnClickListener {
            GlobalStaticVariables.language_type = "ru"
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)

            //Runtime.getRuntime().exit(0)

        }
        rb_kz.setOnClickListener {
            GlobalStaticVariables.language_type = "kk"
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
            //Runtime.getRuntime().exit(0)
        }
        rb_english.setOnClickListener {
            GlobalStaticVariables.language_type = "en"
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
            //Runtime.getRuntime().exit(0)
        }


        shareWhatsApp.setOnClickListener(this)
        setToolbar(this,
                getString(R.string.setting),
                findViewById<TextView>(R.id.tv_map) as TextView,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView, true)
        ((findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView).getParent() as RelativeLayout).setOnClickListener {
            onBackPressed()
        }
        //initButtonToolbar()
        textGradient()
        notif_settings.setOnClickListener {
            var statusOfNotif = checkNotificationStatus();
            var adb = AlertDialog.Builder(this);
            adb.setTitle(getString(R.string.notifacation))
            adb.setMessage(if (statusOfNotif) getString(R.string.of_notification) else getString(R.string.on_notification))
                    .setCancelable(false)
                    .setPositiveButton(getString(R.string.yes), object : DialogInterface.OnClickListener {
                        override fun onClick(p0: DialogInterface?, p1: Int) {
                            changeNotifStatus(!statusOfNotif)
                            tv_contol.text = if (!statusOfNotif) getString(R.string.of_notification) else getString(R.string.on_notification)
                        }

                    })
                    .setNegativeButton(getString(R.string.cancel), object : DialogInterface.OnClickListener {
                        override fun onClick(p0: DialogInterface?, p1: Int) {

                        }

                    })

            // create alert dialog
            var alertDialog = adb.create();
            // show it
            alertDialog.show();

        }
        tv_feedback_coders.setOnClickListener {
            val emailIntent = Intent(android.content.Intent.ACTION_SENDTO)
            emailIntent.setData(Uri.parse("mailto:"));
            val aEmailList = arrayOf("bekarysdev@gmail.com")
            emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, aEmailList)
            emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Проблемы с приложением Eromance.")
            // emailIntent.setType("plain/text")
            emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Напишите свою проблему.")

            startActivity(Intent.createChooser(emailIntent, "Отправить сообщение через..."))
//            val intent = Intent(Intent.ACTION_SEND)
//            intent.type = "text/rfc822"
//            intent.putExtra(android.content.Intent.EXTRA_EMAIL,  "bekarysdev@gmail.com");
//            intent.putExtra(Intent.EXTRA_SUBJECT, "Проблемы с приложением Eromance.")
//            intent.putExtra(Intent.EXTRA_TEXT, message)
//            val mailer = Intent.createChooser(intent, null)
//            startActivity(mailer)
        }
        findViewById<TextView>(R.id.tv_change_password).setOnClickListener {
            startActivity(Intent(this, PasswordInteractionActivity::class.java).putExtra("type", "change"));
        }
//        (findViewById(R.id.share_app_container) as LinearLayout).setOnClickListener {
//            shareApp()
//        }
        (findViewById<TextView>(R.id.tv_exit_acc) as TextView).setOnClickListener {
            PrefSingleton.instance.writePreference("PASSWORD", "")
            finish()
        }
        setupSocial();
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext())
        when (sharedPreferences.getString("language", "ru")) {
            "ru" -> {
                rb_ru.isChecked = true

            }
            "en" -> {
                rb_english.isChecked = true
            }
            "kk" -> {
                rb_kz.isChecked = true
            }
            else -> {
                rb_ru.isChecked = true

            }
        }


    }

    fun setSharedPreferences(value: String) {

        var editor = sharedPreferences.edit()
        editor.putString("language", value)
        editor.commit()


    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        when (buttonView!!.id) {
            R.id.rb_english -> {
                if (isChecked) {
                    rb_ru.isChecked = false
                    rb_kz.isChecked = false
                    setSharedPreferences("en")
                }

            }
            R.id.rb_ru -> {
                if (isChecked) {
                    rb_kz.isChecked = false
                    rb_english.isChecked = false
                    setSharedPreferences("ru")
                }
            }
            R.id.rb_kz -> {
                if (isChecked) {
                    rb_ru.isChecked = false
                    rb_english.isChecked = false
                    setSharedPreferences("kk")
                }
            }

        }

        try {
            Realm.init(getApplicationContext());
            val realm = Realm.getDefaultInstance()
            realm.beginTransaction()
            realm.deleteAll()
            realm.commitTransaction()
        } catch (ex: Exception) {

        }



        tv_delete_account.setOnClickListener({
            var call = API_Client.apiService!!.deleteUser(GlobalStaticVariables.myId!!)
            call.enqueue(object : retrofit2.Callback<Void> {
                override fun onResponse(_call: Call<Void>?, response: Response<Void>?) {
                    if (response != null) {
                        Toast.makeText(this@SettingLanguageActivity, getString(R.string.success), Toast.LENGTH_LONG).show()
                    }
                }

                override fun onFailure(_call: Call<Void>?, t: Throwable?) {
                    Toast.makeText(this@SettingLanguageActivity, getString(R.string.error_delete_account), Toast.LENGTH_LONG).show()
                }

            })
        })
    }


    fun setupSocial() {
        setup_ok();
        setup_goo()
        setup_fb();
        setup_vk()
    }

    var odnoklassniki: Odnoklassniki? = null;
    var singedToOK = false
    fun setup_ok() {
        odnoklassniki = Odnoklassniki.createInstance(this, getString(R.string.ok_client_id), getString(R.string.ok_public_key));
        odnoklassniki?.checkValidTokens(object : OkListener {
            override fun onError(error: String?) {
                singedToOK = false
            }

            override fun onSuccess(json: JSONObject?) {
                singedToOK = true
            }

        });
        findViewById<Button>(R.id.ok_invite).setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if (singedToOK)
                    odnoklassniki?.performAppInvite(this@SettingLanguageActivity, null)
                else {
                    odnoklassniki?.requestAuthorization(this@SettingLanguageActivity, getString(R.string.ok_app_link)
                            , OkAuthType.ANY, OkScope.VALUABLE_ACCESS);
                }
            }
        })
    }

    fun setup_goo() {
        val builder = PlusShare.Builder(this)
        val shareIntent = PlusShare.Builder(this@SettingLanguageActivity)
                .setType("text/plain")
                .setText("Meet your future partner in Eromance.")
                .setContentUrl(Uri.parse("https://developers.google.com/+/"))
                .intent

        findViewById<Button>(R.id.goo_invite).setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                startActivityForResult(shareIntent, 0)
//                builder.addCallToAction(
//                        "CREATE_ITEM", /** call-to-action button label */
//                        Uri.parse("http://plus.google.com/pages/create"),
//                        /** call-to-action url (for desktop use) */
//                        "/pages/create" /** call to action deep-link ID (for mobile use), 512 characters or fewer */);
//
                //                // Set the content url (for desktop use).
//                builder.setContentUrl(Uri.parse("https://plus.google.com/pages/"));
//
//                // Set the target deep-link ID (for mobile use).
//                builder.setContentDeepLinkId("/pages/",
//                        null, null, null);
//
//                // Set the share text.
//                builder.setText("Create your Google+ Page too!");
//                startActivityForResult(builder.getIntent(), 0);

            }
        })
    }

    fun setup_fb() {
//        val appLinkUrl: String
//        val previewImageUrl: String
//
//        appLinkUrl = "https://www.mydomain.com/myapplink"
//        previewImageUrl = "https://www.mydomain.com/my_invite_image.jpg"
//
//        if (AppInviteDialog.canShow()) {
//            val content = AppInviteContent.Builder()
//                    .setApplinkUrl(appLinkUrl)
//                    .setPreviewImageUrl(previewImageUrl)
//                    .build()
//            AppInviteDialog.show(this, content)
//        }
        findViewById<Button>(R.id.fb_invite).setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                shareApp();
            }
        });
    }

    fun setup_vk() {
        findViewById<Button>(R.id.vk_invite).setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                shareApp();
            }
        });
    }

    fun shareApp() {
        try {
            val i = Intent(Intent.ACTION_SEND)
            i.type = "text/plain"
            i.putExtra(Intent.EXTRA_SUBJECT, "Eromance")
            var sAux = "\nТекст про приложение\n\n"
            sAux = sAux + "https://play.google.com/store/apps/details?id=com.zoomapps.eromance \n\n"
            i.putExtra(Intent.EXTRA_TEXT, sAux)
            startActivity(Intent.createChooser(i, "Выберите"))
        } catch (e: Exception) {
            Log.e("SHARE", "ERRRRRRRRR")
        }
    }

    private fun initButtonToolbar() {
        /*if (!menu_btn_sbsed) {
            menu_btn_sbsed = true
            btnOpenDrawer.setOnClickListener { drawer_layout.openDrawer(GravityCompat.START) }
        }*/
    }

    fun getColorById(id: Int): Int {
        val version = Build.VERSION.SDK_INT
        if (version >= 23) {
            return ContextCompat.getColor(this, id)
        } else {
            return resources.getColor(id)
        }
    }


    private fun textGradient() {
        tv_map.measure(0, 0)       //must call measure!
        val x_end = tv_map.measuredWidth.toFloat()  //get width
        val y_end = tv_map.measuredHeight.toFloat() //get height
        val test = tv_map.width
        val textShader = LinearGradient(0f, 0f, 0f, y_end,
                intArrayOf(getColorById(R.color.golden_gradient3), getColorById(R.color.golden_gradient4), getColorById(R.color.golden_gradient3)),
                floatArrayOf(0.43f, 0.65f, 0.75f),
                Shader.TileMode.MIRROR)

        tv_map.paint.shader = textShader
    }

    var isBackPressed = false
    override fun onBackPressed() {
        if (GlobalStaticVariables.isUser_Twenty_One_Provider != null && GlobalStaticVariables.isUser_Twenty_One_Provider == true) {
            startActivity(Intent(this@SettingLanguageActivity, TwentyOneUsersMainActivity::class.java))
            finish()
        } else {
            startActivity(Intent(this@SettingLanguageActivity, MainActivity::class.java))
            finish()
        }


    }

    private fun getAuthListener(): OkAuthListener {
        return object : OkAuthListener {
            override fun onSuccess(json: JSONObject?) {
                try {
                    singedToOK = true
                    findViewById<Button>(R.id.ok_invite).performClick()
                } catch (e: JSONException) {
                    e.printStackTrace();
                }
//                showForm();
            }

            override fun onCancel(error: String?) {
                Toast.makeText(this@SettingLanguageActivity,
                        String.format("%s: %s", getString(R.string.cancel_signin), error),
                        Toast.LENGTH_SHORT).show();
            }

            override fun onError(error: String?) {
                singedToOK = false

                Toast.makeText(this@SettingLanguageActivity,
                        String.format("%s: %s", getString(R.string.error), error),
                        Toast.LENGTH_SHORT).show();
            }
        };
    }

    fun getToastListener(): OkListener {
        return object : OkListener {
            override fun onSuccess(json: JSONObject?) {
                singedToOK = true
                findViewById<Button>(R.id.ok_invite).performClick()
            }

            override fun onError(error: String?) {
                singedToOK = false
                Toast.makeText(this@SettingLanguageActivity, String.format("%s: %s", getString(R.string.error), error), Toast.LENGTH_LONG).show();
            }

        };
    }
}
