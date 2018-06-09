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
import android.widget.RatingBar
import android.widget.TextView
import com.bumptech.glide.Glide
import com.zoomapps.eromance.Activities.UserProfileActivity
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Controllers.serializeToJson
import com.zoomapps.eromance.Helpers.OpenTypesBy
import com.zoomapps.eromance.Models.SearchPairModel
import com.zoomapps.eromance.R

/**
 * Created by User on 05.06.2017.
 */

class SearchPairAdapter
(private val mDataset: List<SearchPairModel.Datum>?,
 private val mContext: Context?) : RecyclerView.Adapter<SearchPairAdapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var main_item_container: LinearLayout? = null
        var item_user_avatar_IV: ImageView? = null
        var item_user_status_frame_IV: ImageView? = null
        var item_user_info_LL: LinearLayout? = null
        var item_text_info_container: LinearLayout? = null
        var item_username_TV: TextView? = null
        var item_age_TV: TextView? = null
        var item_height_TV: TextView? = null
        var item_user_rating_RtgBar: RatingBar? = null
        var iv_isVip : ImageView?=null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_user_row_item, parent, false)

        val vh = ViewHolder(v)
        vh.main_item_container = v.findViewById<LinearLayout>(R.id.main_item_container) as  LinearLayout
        vh.item_user_avatar_IV = v.findViewById<ImageView>(R.id.item_user_avatar_IV) as  ImageView
        vh.item_user_status_frame_IV = v.findViewById<ImageView>(R.id.item_user_status_frame_IV) as  ImageView
        vh.item_user_info_LL = v.findViewById<LinearLayout>(R.id.item_user_info_LL) as  LinearLayout
        vh.item_text_info_container = v.findViewById<LinearLayout>(R.id.item_text_info_container) as  LinearLayout
        vh.item_username_TV = v.findViewById<TextView>(R.id.item_username_TV) as  TextView
        vh.item_age_TV = v.findViewById<TextView>(R.id.item_age_TV) as  TextView
        vh.item_height_TV = v.findViewById<TextView>(R.id.item_height_TV) as  TextView
        vh.item_user_rating_RtgBar = v.findViewById<RatingBar>(R.id.item_user_rating_RtgBar) as  RatingBar
        vh.iv_isVip = v.findViewById<ImageView>(R.id.iv_isVip) as ImageView
        return vh
    }



    override fun onBindViewHolder(h: ViewHolder, position: Int) {
        if (mDataset?.get(position) != null) {

            var cd = mDataset?.get(position);
            h.main_item_container?.tag =cd?.user?.data?.id.toString();
            h.main_item_container?.setOnClickListener { v->
                var curview = v as LinearLayout;
                var data =  curview.tag as String;
                if(curview.tag  !=null) {
                    (mContext as Activity).startActivity(Intent(mContext, UserProfileActivity::class.java)
                            .putExtra("user_data", data)
                            .putExtra("open_type", OpenTypesBy.user_id));
                }
                else{

                }
            }
            h.item_username_TV?.text = cd?.user?.data?.username;
            loadImageToIV(mContext!!,h.item_user_avatar_IV!!,cd?.user?.data?.avatar)
            h.item_user_rating_RtgBar?.rating =cd?.rating?.toFloat()!!
            h.item_age_TV?.text =cd?.bornAt
            h.item_height_TV?.visibility = ViewGroup.GONE
            if(cd?.user?.data?.is_online!=null) {
                if (cd?.user?.data?.is_online==false) {
                    h.item_user_status_frame_IV?.setImageResource(R.drawable.user_offline_ava_frame)
                }
                else{
                    h.item_user_status_frame_IV?.setImageResource(R.drawable.user_online_ava_frame)
                }
            }
            if(cd?.user?.data?.isVip!=null && cd?.user?.data?.isVip!!){
                h.iv_isVip?.visibility = View.VISIBLE
            }
            else
                h.iv_isVip?.visibility = View.GONE
        }

    }

    fun openUserProfile(){
        val intent = Intent(mContext , UserProfileActivity::class.java)
        mContext?.startActivity(intent)
    }

    override fun getItemCount(): Int {
        return mDataset?.size!!
    }


}
/**
 * Created by User on 28.02.2017.
 */
