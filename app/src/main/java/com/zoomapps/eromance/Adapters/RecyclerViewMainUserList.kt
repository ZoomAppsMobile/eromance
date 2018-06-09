package com.zoomapps.eromance.Adapters

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.media.Image
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import com.zoomapps.eromance.Activities.UserProfileActivity
import com.zoomapps.eromance.Controllers.GlobalVariables
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Controllers.serializeToJson
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.UserProfileModel
import com.zoomapps.eromance.R
import java.util.*

object viewIniter{
    fun getUserRatingImage(star_amount:Int?=0):Int{
        when(star_amount){
            0->return R.drawable.icon_user_stars_zero;
            1->return R.drawable.icon_user_stars_one;
            2->return R.drawable.icon_user_stars_two;
            3->return R.drawable.icon_user_stars_three;
            4->return R.drawable.icon_user_stars_four;
            5->return R.drawable.icon_user_stars_five;
        }
        return R.drawable.icon_user_stars_zero;
    }
    fun getUserStatusImage(status:Boolean):Int{
        if (status == false) {
            return (R.drawable.icon_status_offline)
        } else {
            return (R.drawable.icon_status_online)
        }
    }
    fun setUserView(_Context:Context,mainContainer:LinearLayout,
                    IV_status :ImageView,IV_stars:ImageView , IV_Avatar:ImageView ,
                    setData:LoginModel.Datum , is_online:Boolean?){
        val rand = Random()
        val n = rand.nextInt(2) + 1
        IV_status?.setImageResource(getUserStatusImage(if(is_online!=null) is_online else false))
        loadImageToIV(_Context , IV_Avatar , setData.avatar)
        try {
            (_Context as Activity).runOnUiThread {
                var rating_res_img = getUserRatingImage(setData.profile?.data!!.rating!!.toInt());
                IV_stars.setImageResource(rating_res_img);
            }
        }
        catch (ex:Exception){

        }
    }
    fun setUserView(_Context:Context,mainContainer:LinearLayout,
                    IV_status :ImageView,IV_stars:ImageView , IV_Avatar:ImageView ,
                    avatar:String? ,ratings:Double? , is_online:Boolean?){
        val rand = Random()
        val n = rand.nextInt(2) + 1
        IV_status?.setImageResource(getUserStatusImage(if(is_online!=null) is_online else false))

        loadImageToIV(_Context , IV_Avatar , avatar)
        try {
            var rating_res_img = getUserRatingImage(ratings?.toInt());
            IV_stars.setImageResource(rating_res_img);
        }
        catch (ex:Exception){

        }
    }
}
