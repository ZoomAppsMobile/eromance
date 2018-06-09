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
import com.zoomapps.eromance.Activities.UserProfileActivity
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Controllers.serializeToJson
import com.zoomapps.eromance.Helpers.OpenTypesBy
import com.zoomapps.eromance.Models.SearchPairModel
import com.zoomapps.eromance.Models.UserProfileModel
import com.zoomapps.eromance.R
import android.content.DialogInterface
import android.support.v7.app.AlertDialog
import com.zoomapps.eromance.Activities.SearchUserActivity
import com.zoomapps.eromance.Models.UserRateModel


/**
 * Created by User on 26.07.2017.
 */
class SearchUserAdapter (private val mDataset: MutableList<UserRateModel.Datum>?,
                         private val mContext: Context?) : RecyclerView.Adapter<SearchUserAdapter.ViewHolder>() {

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
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_user_row_item, parent, false)

        val vh = ViewHolder(v)
        vh.main_item_container = v.findViewById<LinearLayout>(R.id.main_item_container) as LinearLayout
        vh.item_user_avatar_IV = v.findViewById<ImageView>(R.id.item_user_avatar_IV) as ImageView
        vh.item_user_status_frame_IV = v.findViewById<ImageView>(R.id.item_user_status_frame_IV) as ImageView
        vh.item_user_info_LL = v.findViewById<LinearLayout>(R.id.item_user_info_LL) as LinearLayout
        vh.item_text_info_container = v.findViewById<LinearLayout>(R.id.item_text_info_container) as LinearLayout
        vh.item_username_TV = v.findViewById<TextView>(R.id.item_username_TV) as TextView
        vh.item_age_TV = v.findViewById<TextView>(R.id.item_age_TV) as TextView
        vh.item_height_TV = v.findViewById<TextView>(R.id.item_height_TV) as TextView
        vh.item_user_rating_RtgBar = v.findViewById<RatingBar>(R.id.item_user_rating_RtgBar) as RatingBar
        return vh
    }



    override fun onBindViewHolder(h: ViewHolder, position: Int) {
        if (mDataset?.get(position) != null) {

            var cd = mDataset?.get(position);
            h.main_item_container?.tag = cd?.ownerUserId.toString() + "-" + cd?.owner?.data?.profile?.data?.realName.toString()
            h.main_item_container?.setOnClickListener { v->
                var curview = v as LinearLayout;
                var data =  curview.tag as String;
                var splitted_data = data.split('-')
                openUserProfile(splitted_data[0],splitted_data[1])
            }
            h.item_username_TV?.text = cd?.owner?.data?.profile?.data?.realName.toString()
            loadImageToIV(mContext!!,h.item_user_avatar_IV!!,cd?.owner?.data?.avatar)
            h.item_user_rating_RtgBar?.rating =cd?.owner?.data?.profile?.data?.rating?.toFloat()!!
            h.item_age_TV?.text = cd?.owner?.data?.profile?.data?.bornAt
            h.item_height_TV?.visibility = ViewGroup.GONE
        }

    }


    fun openUserProfile(uid:String , name:String){
        AlertDialog.Builder(mContext!!)
                .setTitle(mContext.getString(R.string.selection_user))
                .setMessage(mContext.getString(R.string.you_select) + ": " + name)
                .setPositiveButton(mContext.getString(R.string.yes),
                        DialogInterface.OnClickListener { dialog, which ->
                            selectUserAndFinish(uid.toInt(), name)
                        })
                .setNegativeButton(mContext.getString(R.string.no), null).show()
    }

    fun selectUserAndFinish(uid:Int , name:String){
        (mContext as SearchUserActivity).selectUserAndFinish(uid,name)
    }

    override fun getItemCount(): Int {
        return mDataset?.size!!
    }


}
/**
 * Created by User on 28.02.2017.
 */
