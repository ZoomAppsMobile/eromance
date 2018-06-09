package com.zoomapps.eromance.Helpers

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.RelativeLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import com.zoomapps.eromance.Activities.MyProfileActivity
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView

/**
 * Created by User on 05.06.2017.
 */
class MenuData_Setter(val _ctx:Context) {
    fun setMenuData(username_TV:TextView ,country_TV:TextView ,city_TV:TextView ,coins_TV:TextView ,
                    avatar_CIV :CircleImageView , rtng_bar :RatingBar , rating_TV:TextView, network_status_container:RelativeLayout?){
        (_ctx as Activity).runOnUiThread {
            username_TV.text = GlobalStaticVariables.myData?.username.toString()
            country_TV.text =  TypeConvertor.staticFuns.getCustomTranslations(GlobalStaticVariables.myData?.profile?.data?.countryId, Custom_Translation_Types.country)
            city_TV.text =  TypeConvertor.staticFuns.getCustomTranslations(GlobalStaticVariables.myData?.profile?.data?.cityId,Custom_Translation_Types.city)
            //TODO:COUNTRY and CITY
            coins_TV.text = GlobalStaticVariables.myData?.amount.toString()
            loadImageToView(avatar_CIV)
            avatar_CIV.setOnClickListener({
                var intent = Intent(_ctx, MyProfileActivity::class.java)
                _ctx.startActivity(intent)
            })
            try {
                rating_TV.text = GlobalStaticVariables.myData?.profile?.data?.rating?.toString()
                rtng_bar.rating = GlobalStaticVariables.myData?.profile?.data?.rating?.toFloat()!!
            }
            catch (ex : Exception){
                rtng_bar.rating = 0.0f
            }
            if(network_status_container!=null){
                if(GlobalStaticVariables.isSocketServiceActive){
                    network_status_container.findViewById<ImageView>(R.id.online_icon_IV).visibility = View.VISIBLE
                    network_status_container.findViewById<ImageView>(R.id.offline_icon_IV).visibility = View.GONE
                }
                else{
                    network_status_container.findViewById<ImageView>(R.id.online_icon_IV).visibility = View.GONE
                    network_status_container.findViewById<ImageView>(R.id.offline_icon_IV).visibility = View.VISIBLE
                }
            }
        }
    }
    fun loadImageToView(ava_CIV:CircleImageView){
        loadImageToIV(_ctx,ava_CIV,GlobalStaticVariables.myData?.avatar)
    }
}