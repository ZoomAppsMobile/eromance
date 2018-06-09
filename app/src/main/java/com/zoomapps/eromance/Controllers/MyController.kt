package com.zoomapps.eromance.Controllers

import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Resources
import android.graphics.LinearGradient
import android.graphics.Shader
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Build
import android.support.v4.view.GravityCompat
import android.support.v7.app.AppCompatActivity
import android.util.DisplayMetrics
import android.view.View
import com.google.gson.Gson
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Activities.MainActivity
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.TranslationModel

import com.zoomapps.eromance.R

import com.zoomapps.eromance.R.id.tv_plan_na_vecher
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File
import java.io.FileFilter
import java.text.SimpleDateFormat
import java.util.*
import android.support.v4.app.ActivityCompat.startActivityForResult
import android.provider.MediaStore
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AlertDialog
import android.view.Gravity
import android.widget.*
import com.zoomapps.eromance.Activities.FullScreenImage
import com.zoomapps.eromance.Activities.UserProfileActivity
import com.zoomapps.eromance.Helpers.MyCustomDate
import com.zoomapps.eromance.Helpers.OpenTypesBy
import com.zoomapps.eromance.Models.DeviceTokenModel
import java.text.ParseException
import java.util.concurrent.TimeUnit


fun getPaymentValue(pid:Int?):String{
    when(pid){
        1->{
            return "50/50"
        }
        2->{
            return "За мой счет"
        }
        3->{
            return "За ваш счет"
        }
        4->{
            return "Буду не один(-на)"
        }
    }
    return ""
}

fun printDifference(startDate: Calendar, endDate: Calendar):String
{
    var different = endDate.timeInMillis - startDate.timeInMillis
    val secondsInMilli: Long = 1000
    val minutesInMilli = secondsInMilli * 60
    val hoursInMilli = minutesInMilli * 60
    val daysInMilli = hoursInMilli * 24

    val elapsedDays = different / daysInMilli
    different = different % daysInMilli

    val elapsedHours = different / hoursInMilli
    different = different % hoursInMilli

    val elapsedMinutes = different / minutesInMilli
    different = different % minutesInMilli

    val elapsedSeconds = different / secondsInMilli

    return "$elapsedDays-$elapsedHours-$elapsedMinutes"
}

fun getScreenWidth(activity: Activity): Int {
    val metrics = activity.resources.displayMetrics
    val width = metrics.widthPixels
    val height = metrics.heightPixels
    return width
}
fun sendPushTokenToServer(fcm_token:String?, mcontext: Context) {
    val apiService = API_Client.client!!.create(API_Interface::class.java)

    var call =  apiService.sendFCMtoken(user_id =  GlobalStaticVariables.myId.toString() ,
            token = fcm_token.toString())

    call.enqueue(object : Callback<DeviceTokenModel.UserDeviceResponse> {
        override fun onResponse(call: Call<DeviceTokenModel.UserDeviceResponse>, response: Response<DeviceTokenModel.UserDeviceResponse>) {
            val test =""
            val data = response.body();
        }


        override fun onFailure(call: Call<DeviceTokenModel.UserDeviceResponse>, t: Throwable) {
            val test = ""
        }
    })
}

fun savePushToken(push_token :String?){
    PrefSingleton.instance.writePreference(GlobalVariables.push_token,push_token.toString())
}
fun showToast(_context:Context,_text:String?){
    if(_text!=null)
        (_context as Activity).runOnUiThread {
            Toast.makeText(_context!!,_text,Toast.LENGTH_SHORT).show()
        }
}

fun showDialog(mContext: Context , title:String , message:String ,
               positiveClick: DialogInterface.OnClickListener ,
               negativeClick: DialogInterface.OnClickListener){
    val builder: AlertDialog.Builder
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        builder = AlertDialog.Builder(mContext)
    } else {
        builder = AlertDialog.Builder(mContext)
    }
    builder.setTitle(title)
            .setMessage(message)
            .setPositiveButton(android.R.string.yes,positiveClick)
            .setNegativeButton(android.R.string.no, negativeClick )
            .setIcon(android.R.drawable.ic_dialog_alert)
            .show()
}
fun<T> serializeToJson( myClass:T):String {
    var gson = Gson()
    val string_json = gson.toJson(myClass);
    return string_json;
}

fun<T> deSerializeToJson( myJson:String , modelType:Class<T>):T {
    var gson = Gson()
    var return_model = gson.fromJson(myJson,modelType);
    return return_model;
}
fun showPreparedToast(_context: Context,_type:String){
    var toast_msg =""
    toast_msg = when(_type){
        "Fields"-> _context.getString(R.string.fill_field)
        "Save"->  _context.getString(R.string.success_register)
        "Fields2"-> "Goood"
        "Network"-> _context.getString(R.string.internet_error)
        "Response"-> _context.getString(R.string.error_data)
        "Auth"->  _context.getString(R.string.login_and_password_no_search)
        "AuthVK"-> _context.getString(R.string.login_and_password_no_search)
        "Success"-> _context.getString(R.string.success)
        "NotActivated"-> _context.getString(R.string.login_and_password_no_search)
        "Unknown"-> _context.getString(R.string.error)
        "Not_found_key"-> _context.getString(R.string.error_code)
        "Not_found"->  _context.getString(R.string.not_found)
        "Error"-> _context.getString(R.string.error)
        "success_evening"-> _context.getString(R.string.success_evening)
        "Loading"->  _context.getString(R.string.go_upload)
        "Result_Empty"-> _context.getString(R.string.result_empty)
        "Wait"-> _context.getString(R.string.wait)
        "Send_Data_Empty"->  _context.getString(R.string.Send_Data_Empty)
        "List_Empty"-> _context.getString(R.string.list_empty)
        "Send_To_Moderation"-> _context.getString(R.string.Send_To_Moderation)
        "Soon"-> _context.getString(R.string.Soon)
        else->""
    }
    showToast(_context,toast_msg)
}

fun pxToDp(px: Int): Int {
    return (px / Resources.getSystem().displayMetrics.density).toInt()
}

fun dpToPx(dp: Int): Int {
    return (dp * Resources.getSystem().displayMetrics.density).toInt()
}



fun  openGallery(mContext : Context, req_code: Int , show_text:String ? = "Выберите картинку") {
    if (checkAndRequestPermissions(mContext as Activity,android.Manifest.permission.READ_EXTERNAL_STORAGE)) {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        (mContext as Activity).startActivityForResult(Intent.createChooser(intent, show_text), req_code)
    }
    else{

    }
}

fun checkAndRequestPermissions(act : Activity , permissionID:String) :Boolean{
    val storage = ContextCompat.checkSelfPermission(act, permissionID)
    if (storage != PackageManager.PERMISSION_GRANTED) {
        ActivityCompat.requestPermissions(act,
               arrayOf<String>(permissionID),1);
        return false;
    }
    else{
        return true
    }
}
fun callToPhone(mContext:Context, phoneNum:String?){
    if(phoneNum!=null && checkAndRequestPermissions(mContext as Activity,
            android.Manifest.permission.READ_EXTERNAL_STORAGE)) {
        val callIntent = Intent(Intent.ACTION_CALL)
        callIntent.data = Uri.parse("tel:"+phoneNum)
        (mContext as Activity).startActivity(callIntent)
    }
}
fun setTranslations(forseUpd : Boolean?=false):Boolean{
    if( GlobalStaticVariables.allTranslations!= null &&!forseUpd!!)
    {
        return true
    }
    val apiService = API_Client.client!!.create(API_Interface::class.java)
    val call = apiService.getDictionary()
    call.enqueue(object: Callback<TranslationModel.TranslationResponse> {
        override fun onResponse(call: Call<TranslationModel.TranslationResponse>?, response: Response<TranslationModel.TranslationResponse>?) {

            if(response!!.body()!=null && response!!.errorBody()==null){
                if(response!!.body().data==null|| response.body().code!=1){
                    return
                }
                else{
                    if(response.body().data!=null){
                        //TODO:SAVE Dictionary
                        GlobalStaticVariables.allTranslations = response.body().data;
                    }
                    else{

                    }
                }
            }
        }

        override fun onFailure(call: Call<TranslationModel.TranslationResponse>?, t: Throwable?) {

        }

    })
    return false;
}

fun calculateGameOutcome(your_thing_id :Int? , opponent_thing_id:Int?):String{
    if(your_thing_id==null || opponent_thing_id==null)
        return "unknown"
    var thing_diffs = your_thing_id - opponent_thing_id;
    when(thing_diffs){
        -2->{
            return "lose"
        }
        -1->{
            return "win"
        }
        0->{
            return "draw"
        }
        1->{
            return "lose"
        }
        2->{
            return "win"
        }

    }
    return "unknown"
}

fun  getStrList(data: List<TranslationModel.IdValueModel>):List<String>{
    var returnList = ArrayList<String>()
    for(tmp in data){
        returnList.add(tmp.value!!)
    }
    return returnList.toList()
}
class ImageFileFilter
/**

 */
(internal var file: File) : FileFilter {
    private val okFileExtensions = arrayOf("jpg", "png", "gif", "jpeg")
    override fun accept(file: File): Boolean {
        for (extension in okFileExtensions) {
            if (file.getName().toLowerCase().endsWith(extension)) {
                return true
            }
        }
        return false
    }
}
fun convertDateToAge(str_Date:String):String {
    try {
        val cal = Calendar.getInstance()
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)
        cal.setTime(sdf.parse(str_Date))// all done
        val cal_now = Calendar.getInstance()
        val diffYear = cal.get(Calendar.YEAR) - cal_now.get(Calendar.YEAR)
        //TODO :LOGIC
        //val diffMonth = diffYear * 12 + cal.get(Calendar.MONTH) - cal_now.get(Calendar.MONTH)
       // var user_age_raw = (diffMonth / 12) ;
      //  val user_age_double = Math.abs(user_age_raw - Math.floor(user_age_raw.toDouble()))
        return Math.abs(diffYear).toString()
    }
    catch (ex:Exception){

    }
    return "";
}

private fun getDateDiff( date1:Date, date2:Date, timeUnit:TimeUnit ):Long {
    var diffInMillies = date2.getTime() - date1.getTime();
    return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
}

fun getColorById(ctx:Activity, id: Int): Int {
    val version = Build.VERSION.SDK_INT
    if (version >= 23) {
        return ContextCompat.getColor(ctx, id)
    } else {
        return ctx.resources.getColor(id)
    }
}
fun getColorById(ctx:Context, id: Int): Int {
    val version = Build.VERSION.SDK_INT
    if (version >= 23) {
        return ContextCompat.getColor(ctx, id)
    } else {
        return ctx.resources.getColor(id)
    }
}
private fun textGradient(_ctx:Activity, changeing_tv:TextView) {
    changeing_tv.measure(0, 0)       //must call measure!
    val x_end = changeing_tv.measuredWidth.toFloat()  //get width
    val y_end = changeing_tv.measuredHeight.toFloat() //get height
    val test = changeing_tv.width
    val textShader = LinearGradient(0f, 0f, 0f, y_end,
            intArrayOf(getColorById(_ctx,R.color.golden_gradient3), getColorById(_ctx,R.color.golden_gradient4), getColorById(_ctx,R.color.golden_gradient3)),
            floatArrayOf(0.43f, 0.65f, 0.75f),
            Shader.TileMode.MIRROR)

    changeing_tv.paint.shader = textShader
}
fun openImageViewer(mContext :Context , ImageArr :Array<String>? , position:Int , imageIdsArr:Array<String>?=null){
    (mContext as Activity)
            .startActivity(Intent(mContext , FullScreenImage::class.java)
                    .putExtra("image_data", ImageArr)
                    .putExtra("start_position",position)
                    .putExtra("image_ids",imageIdsArr))
}
fun openImageViewer(mContext :Context , image :String ,imageId:String?=null ){
    (mContext as Activity)
            .startActivity(Intent(mContext , FullScreenImage::class.java)
                    .putExtra("image_data", image)
                    .putExtra("image_ids",imageId))
}

fun setToolbar(ctx:Activity, tb_title:String, title_TV: TextView, home_btn: ImageView, isIconBack:Boolean=false ,dr_lay:DrawerLayout?=null )
{
    (ctx).runOnUiThread {
        title_TV.text = tb_title;
        textGradient(ctx,title_TV)
        if(isIconBack) {
            home_btn.setImageResource(R.drawable.ic_back_golden)
            (home_btn.getParent() as RelativeLayout).setOnClickListener {
                ctx.finish()
            }
        }
        else
            (home_btn.getParent() as RelativeLayout).setOnClickListener{
                dr_lay?.openDrawer(Gravity.LEFT)
            }
    }
}

fun openUserProfile(_ctx: Context , user_id:String){
  //  Log.e("user_id",user_id);
    var test = user_id
    (_ctx as Activity).startActivity(Intent(_ctx,
            UserProfileActivity::class.java)
            .putExtra("user_data",user_id)
            .putExtra("open_type", OpenTypesBy.user_id));
}


val image_formats = arrayOf(".jpg", ".png", ".gif", ".jpeg")
fun checkImage(image_url:String?):Boolean{
    if(image_url.toString() !="")
        for(tmp in image_formats) {
            if (image_url?.endsWith(tmp)!!){
                return true
            }
        }
    return false
}

fun isOnline( context:Context): Boolean {
    val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetwork = cm.getActiveNetworkInfo()

    if(activeNetwork!=null)
        return activeNetwork.isConnectedOrConnecting
    else
        return false
}

fun checkIfAgreementRead():Boolean{
    return PrefSingleton.instance.getBooleanPreference(GlobalVariables.isUserReadAgreement_key)
}

fun checkNotificationStatus():Boolean{
    return !PrefSingleton.instance.getBooleanPreference(GlobalVariables.settings_notification_key)
}
fun changeNotifStatus(newStatus:Boolean){
    return PrefSingleton.instance.writeBooleanPreference(GlobalVariables.settings_notification_key , newStatus)
}

fun openMaps( _ctx:Context,latitude:Double ,longitude:Double ,text:String){
    val uri = String.format(Locale.ENGLISH, "geo:%f,%f?q=%f,%f(%s)", latitude, longitude,latitude, longitude,text)
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
    _ctx?.startActivity(intent)
}