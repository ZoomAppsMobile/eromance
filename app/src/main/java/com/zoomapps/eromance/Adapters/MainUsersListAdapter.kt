package com.zoomapps.eromance.Adapters

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import com.bumptech.glide.Glide
import com.zoomapps.eromance.Activities.UserProfileActivity
import com.zoomapps.eromance.Controllers.GlobalVariables
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Controllers.serializeToJson
import com.zoomapps.eromance.Helpers.OpenTypesBy
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.UserProfileModel
import com.zoomapps.eromance.R
import java.util.*

/**
 * Created by User on 04.07.2017.
 */

class MainUsersListAdapter// Provide a suitable constructor (depends on the kind of dataset)
(private val mDataset: MutableList<UserProfileModel.Datum>?,
 private val mContext: Context?) : RecyclerView.Adapter<MainUsersListAdapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var users_row_container : LinearLayout? = null
        var element_avatar_IV : ImageView?=null
        var element_status_IV : ImageView?=null
        var element_stars_IV : ImageView?=null
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_circle_user_element, parent, false)

        val vh = ViewHolder(v)
        vh.users_row_container = v.findViewById<LinearLayout>(R.id.users_row_container) as LinearLayout
        vh.element_avatar_IV=v.findViewById<ImageView>(R.id.element_avatar_IV) as ImageView
        vh.element_status_IV=v.findViewById<ImageView>(R.id.element_status_IV) as ImageView
        vh.element_stars_IV=v.findViewById<ImageView>(R.id.element_stars_IV) as ImageView
        return vh
    }

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
    fun getUserStatusImage(status_id:Boolean?):Int{
        if (status_id!=null && status_id == true) {
            return (R.drawable.icon_status_online)
        } else {
            return (R.drawable.icon_status_offline)
        }
    }

    fun setUserView(IV_status : ImageView, IV_stars: ImageView, IV_Avatar: ImageView, rating:Double? , img_url:String? ,
                    is_online:Boolean?){

        IV_status?.setImageResource(getUserStatusImage(is_online))
        //Glide.with(Context).load()
        loadImageToIV(mContext!! , IV_Avatar ,img_url )
        try {
            var rating_res_img = getUserRatingImage(rating?.toInt());
            IV_stars.setImageResource(rating_res_img);
        }
        catch (ex:Exception){

        }
    }

    fun setUserData(holder: ViewHolder,posi:Int){
        holder.users_row_container?.tag =  serializeToJson( mDataset!![posi]);
        holder.users_row_container?.setOnClickListener { v->
            var curview = v as LinearLayout;
            var data =  curview.tag as String;
            (mContext as Activity).startActivity(Intent(mContext,
                    UserProfileActivity::class.java)
                    .putExtra("user_data",data)
                    .putExtra("open_type", OpenTypesBy.all_data));
        }

        setUserView( holder.element_status_IV!!,holder.element_stars_IV!!,
                holder.element_avatar_IV!!, mDataset?.get(posi).rating , mDataset?.get(posi).user?.data?.avatar ,
                mDataset?.get(posi).user?.data?.is_online)

    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        setUserData(holder,position);
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {
        return  mDataset!!.size
    }
}

/**
 * Created by User on 28.02.2017.
 */
