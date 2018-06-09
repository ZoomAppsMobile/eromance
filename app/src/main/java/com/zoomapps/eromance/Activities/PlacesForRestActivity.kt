package com.zoomapps.eromance.Activities


import android.Manifest
import android.content.DialogInterface
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.*
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface

import com.zoomapps.eromance.Adapters.RecyclerViewPlacesForRest
import com.zoomapps.eromance.AdditionalyClass.CircularProgressBar
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.ModelForRest
import com.zoomapps.eromance.Models.PlaceInfoModel
import com.zoomapps.eromance.Models.Types.PlaceTypes
import com.zoomapps.eromance.R
import kotterknife.bindView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import java.util.Random

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.ActivityCompat
import android.support.v7.app.AlertDialog
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.Helpers.GlobalStaticVariables


class PlacesForRestActivity : AppCompatActivity() {

    internal val btnOpenDrawer: RelativeLayout by bindView(R.id.btnOpenDrawer)
    internal val tv_map: TextView by bindView(R.id.tv_map)
    internal val recyclerView: RecyclerView by bindView(R.id.recyclerview_images)
    internal var menu_btn_sbsed = false
    internal var mAdapter: RecyclerViewPlacesForRest?=null

    val titleRecreation_TV : TextView by bindView(R.id.titleRecreation_TV)
    val typeTitleTV : TextView by bindView(R.id.typeTitleTV)

    val average_check_TV : TextView by bindView(R.id.average_check_TV)
    val opening_hourTV : TextView by bindView(R.id.opening_hourTV)
    val telephoneTV : TextView by bindView(R.id.telephoneTV)
    val siteRecreationTV : TextView by bindView(R.id.siteRecreationTV)
    val adressRecreationTV : TextView by bindView(R.id.adressRecreationTV)
    val showPlaceOnMap_IV : LinearLayout by bindView(R.id.showPlaceOnMap_IV)
    val callLayout : LinearLayout by bindView(R.id.callLayout)

    //  @RequiresApi(api = Build.VERSION_CODES.M)
    var curPlaceId = "-1";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_places_for_rest)
         curPlaceId = intent.getStringExtra("place_id");
        if(curPlaceId == null || curPlaceId.isEmpty()){
            showPreparedToast(this@PlacesForRestActivity, getString(R.string.error))
            return
        }

        setToolbar(this ,
              "Места",
              findViewById<TextView>(R.id.tv_map) as TextView,
              findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView ,
              true)
        recyclerView.layoutManager = LinearLayoutManager(this)

       // progressBar.indeterminateDrawable.setColorFilter(getColorById(R.color.golden), android.graphics.PorterDuff.Mode.MULTIPLY)
        textGradient()
        getData(curPlaceId);
        callLayout.setOnClickListener {
            val message = getString(R.string.call_support)
            val button1String = getString(R.string.yes)
            val button2String = getString(R.string.cancel)

            val ad = AlertDialog.Builder(this)
            ad.setMessage(message) // сообщение
            ad.setPositiveButton(button1String) { dialog, arg1 ->
                val permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)

                if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), 123)

                } else {
                    startActivity(Intent(Intent.ACTION_CALL).setData(Uri.parse("tel:" + "+" + "77752632438")))
                }
            }
            ad.setNegativeButton(button2String) { dialog, arg1 -> }

            ad.show()
        }
    }


    fun setReviewBtn(data: PlaceInfoModel.Data){
        findViewById<FloatingActionButton>(R.id.make_review_FAB).setOnClickListener {
            var reviewIntent = Intent(this@PlacesForRestActivity , UserReviewActivity::class.java)
            reviewIntent.putExtra("user_avatar",data.image)
            reviewIntent.putExtra("user_real_name",data.name)
            reviewIntent.putExtra("user_rating",0.0)
            reviewIntent.putExtra("place_id",data?.id?.toString())
            startActivity(reviewIntent)
        }
    }
    fun getData(place_id:String?){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getPlaceInfo(GlobalStaticVariables.language_type!!,place_id!!)
        call.enqueue(object : Callback<PlaceInfoModel.PlaceInfoResponse> {
            override fun onResponse(call: Call<PlaceInfoModel.PlaceInfoResponse>, response: Response<PlaceInfoModel.PlaceInfoResponse>) {
                val mainPageDataList = response.body().data
                if(mainPageDataList != null) {
                    val statusCode = response.code()
                    processDataToView(mainPageDataList);
                    setPhoneData(mainPageDataList.user?.data?.phone)
                    setReviewBtn(mainPageDataList)
                }
                else {
                    finish()
                    Toast.makeText(this@PlacesForRestActivity,getString(R.string.error_data), Toast.LENGTH_SHORT).show()

                }
            }

            override fun onFailure(call: Call<PlaceInfoModel.PlaceInfoResponse>, t: Throwable) {
                // Log error here since request failed
                Toast.makeText(this@PlacesForRestActivity,getString(R.string.error), Toast.LENGTH_SHORT).show();
            }

        })
    }
    fun setHeaderData(place_name:String? , place_type :Int? , place_kitchen:String?){
        titleRecreation_TV.text = if(place_name!=null) place_name else getString(R.string.no_information);
        typeTitleTV.text = if(place_type!=null) TypeConvertor(this!!).getKeyById(PlaceTypes::class.java ,place_type)!! else getString(R.string.no_information)

    }
    fun setMapPoints(lat:Double? , lng:Double? , text:String){
        showPlaceOnMap_IV.setOnClickListener {
            openMaps(this, lat!!,lng!!,text);
        }











    }
    var phoneNum :String?=null
    fun setPhoneData(pN:String?){
        phoneNum = pN
        callLayout.setOnClickListener {
            val message = getString(R.string.call_support)
            val button1String =  getString(R.string.yes)
            val button2String =  getString(R.string.no)

            val ad = AlertDialog.Builder(this)
            ad.setMessage(message) // сообщение
            ad.setPositiveButton(button1String) { dialog, arg1 ->
                val permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)

                if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), 123)

                } else {
                    startActivity(Intent(Intent.ACTION_CALL).setData(Uri.parse("tel:" + "+" + "77752632438")))
                }
            }
            ad.setNegativeButton(button2String) { dialog, arg1 -> }

            ad.show()
        }


    }
    fun setMainPhoto(img_path:String?){

    }
    fun setMainInfo(aveg_Price:Int? , workTime:List<Int?>? , phone_num :String? , web_site:String?,
                    txt_address:String?){
        average_check_TV.text = aveg_Price?.toString()
        opening_hourTV.text = workTime?.get(0)?.toString()+"-"+workTime?.get(1)?.toString()
        telephoneTV.text = phone_num?.toString()
        siteRecreationTV.text = web_site?.toString()
        adressRecreationTV.text =txt_address?.toString()
    }
    fun processDataToView(data:PlaceInfoModel.Data?){
        setMapPoints(data?.latitude ,data?.longitude,
                data?.name!!+"+"+if(data?.typeId!=null) TypeConvertor(this!!).getKeyById(PlaceTypes::class.java ,data?.typeId)!! else  getString(R.string.no_information)
        )
        setMainPhoto(data?.image)
        setMainInfo(data?.averegPrice , listOf(data?.hourFrom,data?.hourTo) , data?.user?.data?.phone , data?.site , data?.address )
        setHeaderData(data?.name,data?.typeId,data?.food);
        init_recycler(data?.photos?.data)
    }

    internal fun init_recycler(image_list:List<PlaceInfoModel.Datum>?) {
        if(image_list==null)
            return
        mAdapter = RecyclerViewPlacesForRest(image_list, this)
        recyclerView.adapter = mAdapter
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
}
