package com.zoomapps.eromance.Activities

import android.Manifest
import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import com.zoomapps.eromance.R
import kotterknife.bindView
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import java.io.File
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.*
import com.google.gson.Gson
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.DialogFragment.DialogFragmentInteraction
import com.zoomapps.eromance.DialogFragment.EditStatusDialogFragment
import com.zoomapps.eromance.DialogFragment.PaymentDialogFragment
import com.zoomapps.eromance.Helpers.MenuData_Setter
import com.zoomapps.eromance.Models.PaymentModel
import com.zoomapps.eromance.Models.UserStatusModel
import de.hdodenhof.circleimageview.CircleImageView
import okhttp3.*
import okhttp3.RequestBody
import okhttp3.MultipartBody
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException


class MyProfileActivity : AppCompatActivity() , DialogFragmentInteraction  {

    override fun onOkPressed(content: String?,code:Int) {
        if(code == 2) {
            onStatusEdit(content)
        }
        else if(code==3){
            onBecomeVip();
        }
    }

    fun onBecomeVip(){
        PaymentController.getInstance().makeRequest(PaymentController.PaymentTypes.PROFILE_VIP)
                ?.enqueue(object:Callback<PaymentModel.PaymentResponseData>{
                    override fun onFailure(call: Call<PaymentModel.PaymentResponseData>?, t: Throwable?) {

                    }

                    override fun onResponse(call: Call<PaymentModel.PaymentResponseData>?, response: Response<PaymentModel.PaymentResponseData>?) {
                        if(response?.body()?.data?.amount!=null) {
                            PaymentController.getInstance().onRequestSuccess(PaymentController.PaymentTypes.PROFILE_VIP,response.body()?.data?.amount!!)
                            setVipStatus()
                            showToast(this@MyProfileActivity,getString(R.string.became_user))
                        }
                        else
                            showToast(this@MyProfileActivity,getString(R.string.error))
                    }

                })
    }

    fun onStatusEdit(content:String?){
        setStatus(content)
        var call: Call<UserStatusModel.PostUserStatusResponse>? = null
        val apiService = API_Client.client!!.create(API_Interface::class.java)

        if (userStatus_ID != null) {
            call = apiService.updateUserStatus(GlobalStaticVariables.language_type!!,userStatus_ID.toString(), GlobalStaticVariables.myId.toString(), content)
        } else {
            call = apiService.postUserStatus(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId.toString(), content)
        }
        call.enqueue(object : Callback<UserStatusModel.PostUserStatusResponse> {
            override fun onFailure(call: Call<UserStatusModel.PostUserStatusResponse>?, t: Throwable?) {
                var test = ""
            }

            override fun onResponse(call: Call<UserStatusModel.PostUserStatusResponse>?, response: Response<UserStatusModel.PostUserStatusResponse>?) {
                userStatus_ID = response?.body()?.data?.id;
                showToast(this@MyProfileActivity, getString(R.string.update_status))
            }
        })
    }

    val profile_image_IV : CircleImageView by bindView(R.id.profile_image_IV)


    val user_name_TV : TextView by bindView(R.id.user_name_TV)
    val user_country_TV : TextView by bindView(R.id.user_country_TV)
    val user_city_TV : TextView by bindView(R.id.user_city_TV)
    val user_coins_TV : TextView by bindView(R.id.user_coins_TV)
    val user_profile_LL : LinearLayout by bindView(R.id.user_profile_LL)
    val my_guests_LL : LinearLayout by bindView(R.id.my_guests_LL)
    val my_favorites_LL : LinearLayout by bindView(R.id.my_favorites_LL)
    val my_notifications_LL : LinearLayout by bindView(R.id.my_notifications_LL)
    val my_photoalbum_LL : LinearLayout by bindView(R.id.my_photoalbum_LL)
    val my_gifts_LL : LinearLayout by bindView(R.id.my_gifts_LL)
    val my_chats_LL : LinearLayout by bindView(R.id.my_chats_LL)
    val my_likes_LL : LinearLayout by bindView(R.id.my_likes_LL)
    val my_balance_LL : LinearLayout by bindView(R.id.my_balance_LL)
    val is_vip_IV : ImageView by bindView(R.id.is_vip_IV)
    private val TAG = "PermissionDemo"
    private val REQUEST_WRITE_STORAGE = 112

    val user_status_TV : TextView by bindView(R.id.user_status_TV)
    val edit_status_IV : ImageView by bindView(R.id.edit_status_IV)
    val become_vip_IV : ImageView by bindView(R.id.become_vip_IV)

    fun checkPermission(){
        var permission = ContextCompat.checkSelfPermission(this,
            Manifest.permission.WRITE_EXTERNAL_STORAGE);

    if (permission != PackageManager.PERMISSION_GRANTED) {
        Log.i(TAG, "Permission to record denied");

        if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            var builder =  AlertDialog.Builder(this);
            builder.setMessage(getString(R.string.access_cd_card))
                    .setTitle("Permission required");

            builder.setPositiveButton(getString(R.string.yes),  object : DialogInterface.OnClickListener{
                override fun onClick(p0: DialogInterface?, p1: Int) {
                        Log.i(TAG, "Clicked");
                        makeRequest();
                }

            });

            var dialog = builder.create();
            dialog.show();

        } else {
            makeRequest();
        }
    }
    }

     override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
         when (requestCode) {
             REQUEST_WRITE_STORAGE -> {

                 if (grantResults.size === 0 || grantResults[0] !== PackageManager.PERMISSION_GRANTED) {
                     Log.i(TAG, "Permission has been denied by user")
                 } else {
                     Log.i(TAG, "Permission has been granted by user")
                 }
                 return
             }
         }
    }
    protected fun makeRequest() {
        ActivityCompat.requestPermissions(this,
                arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                REQUEST_WRITE_STORAGE)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)
Log.e("MyProfileActivity", "profile_image_IV")
        setToolbar(this ,
                getString(R.string.my_profile),
                findViewById<TextView>(R.id.tv_map) as TextView,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView,
                true)
        checkPermission()
        profile_image_IV.setOnClickListener {
            openGallery(this,5)
           Toast.makeText(this, "123", Toast.LENGTH_LONG).show()
        }
        user_profile_LL.setOnClickListener {
            startActivity(Intent(this, UserQuessionaryActivity::class.java).putExtra("isEdit",true))
        }
        my_photoalbum_LL.setOnClickListener {
            startActivity(Intent(this,AddAlbumActivity::class.java))
        }
        my_chats_LL.setOnClickListener {
            startActivity(Intent(this,DialogsActivity::class.java))
        }
        my_likes_LL.setOnClickListener {
            startActivity(Intent(this,FavoritesListActivity::class.java).putExtra("type" ,"likes"))
        }
        my_favorites_LL.setOnClickListener {
            startActivity(Intent(this,FavoritesListActivity::class.java).putExtra("type" ,"favorites"))
        }
        my_notifications_LL.setOnClickListener {
            startActivity(Intent(this,UserNotificationEventsActivity::class.java))
        }
        my_guests_LL.setOnClickListener {
            startActivity(Intent(this,MyGuestsActivity::class.java))
        }
        my_gifts_LL.setOnClickListener {
            startActivity(Intent(this,GiftsActivity::class.java))
        }
        become_vip_IV.setOnClickListener {
            var dialogFrag = PaymentDialogFragment.newInstance(getString(R.string.vip_user)+"\n: "+ getString(R.string.price) +  " " + PaymentController.getInstance()
                    .getPaymentAmount(PaymentController.getInstance().getIdByKey(PaymentController.PaymentTypes.PROFILE_VIP)).toString()+" " + getString(R.string.money));
            dialogFrag.show(supportFragmentManager, "paymentFragment")
        }
        setUserData()
    }
    fun setUserData(){
        ProfileData_Setter(this).setMenuData(user_name_TV,user_country_TV,
                user_city_TV,user_coins_TV,profile_image_IV,
                (findViewById<RatingBar>(R.id.go_rating)as RatingBar),
                (findViewById<TextView>(R.id.rating_value_TV) as TextView),
                findViewById<RelativeLayout>(R.id.network_status_container) as RelativeLayout)
        getUserStatus();
        setVipStatus()
    }
    fun setVipStatus(){
        if(GlobalStaticVariables?.myData?.isVip!=null && GlobalStaticVariables?.myData?.isVip!!){
            is_vip_IV.visibility = View.VISIBLE
        }
        else{
            is_vip_IV.visibility = View.GONE
        }
    }
    var userStatus_ID :Int?= null;
    var user_status :String?=""
    fun getUserStatus(){
        val apiService = API_Client.client!!.create(API_Interface::class.java)

        val call = apiService.getUserStatus(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId.toString())
        call.enqueue(object : Callback<UserStatusModel.GetUserStatusResponse> {
            override fun onFailure(call: Call<UserStatusModel.GetUserStatusResponse>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<UserStatusModel.GetUserStatusResponse>?, response: Response<UserStatusModel.GetUserStatusResponse>?) {
                if(response?.body()!=null&&response.body()?.data!=null &&response.body()?.data?.isNotEmpty()!! ) {
                    userStatus_ID= response.body()?.data?.firstOrNull()?.id;
                    user_status =  response?.body()?.data?.firstOrNull()?.content;
                    setStatus(user_status)
                }
            }

        })
        edit_status_IV.setOnClickListener {
            editStatus()
        }
    }
    fun setStatus(new_status:String?){
        user_status = new_status
        user_status_TV.text = String.format(getString(R.string.status)+ " : %s", new_status);
    }
    fun editStatus(){
        var dialogFrag= EditStatusDialogFragment.newInstance(user_status)
        dialogFrag.show(supportFragmentManager, "dialogFragmentChangePassword")
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK) {
            val selectedImageUri = data?.data
            if(data==null||selectedImageUri == null)
                return
            uploadAvatar(selectedImageUri)
        Log.e("uploadAvatar", "uploadAvatar");
        }
    }

    fun uploadAvatar(imageUri : Uri){
        val file = File(getPath(this,imageUri))
        val fbody = RequestBody.create(MediaType.parse("image/*"), file)

        UploadService()?.uploadImage(file,file.name,"http://185.146.1.72:8080/api/v1/ru/users/"+GlobalStaticVariables.myId?.toString()+"/avatar", object : okhttp3.Callback {
            override fun onFailure(call: okhttp3.Call?, e: IOException?) {
                var error = ""
            }

            override fun onResponse(call: okhttp3.Call?, response: okhttp3.Response?) {
                if (response!=null&& response.isSuccessful) {
                    val responseStr = response.body()?.string()
                    val container2 = Gson().fromJson(responseStr, LoginModel.ImageLoadedResponse::class.java)
                    if(container2 == null)
                        return
                   // GlobalStaticVariables.myData = container2.data ;
                    runOnUiThread {
                        loadImageToIV(this@MyProfileActivity,profile_image_IV,container2.data?.avatar)
                        GlobalStaticVariables.myData?.avatar = container2.data?.avatar;
                        showPreparedToast(this@MyProfileActivity ,getString(R.string.success));
                    }







                   // startActivity(Intent(this@MyProfileActivity, M::class.java))

                    // Do what you want to do with the response.
                }
                else {
                    try {
                        val responseStr = response!!.body()?.string()
                    }
                    catch (ex:Exception){

                    }
                    // Request not successful
                }
            }
        })
      /*  val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.uploadAvatar(GlobalStaticVariables.myId.toString(),fbody)
        call.enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>?, response: Response<ResponseBody>?) {
                var rawJSON = response?.body().toString()
            }
            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

            }
        })*/
    }

    class UploadService {
        fun uploadImage(image: File, imageName: String, url_path :String, callback:okhttp3.Callback):okhttp3.Call  {
            val client = OkHttpClient()

            val requestBody = MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("image", imageName, RequestBody.create(MediaType.parse("text/csv"), image))
                    .build()

            val request = Request.Builder().url(url_path)
                    .post(requestBody).build()

            val call = client.newCall(request)
            call.enqueue(callback);
            return call
        }
        private val MEDIA_TYPE_PNG = MediaType.parse("image/png")
    }
}
