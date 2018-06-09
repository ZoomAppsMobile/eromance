package com.zoomapps.eromance.Adapters

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RatingBar
import android.widget.TextView
import com.zoomapps.eromance.Activities.UserProfileActivity
import com.zoomapps.eromance.Controllers.GlobalVariables
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Controllers.serializeToJson
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.MyCustomDate
import com.zoomapps.eromance.Helpers.OpenTypesBy
import com.zoomapps.eromance.Models.ReviewModel
import com.zoomapps.eromance.Models.SearchPairModel
import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView

/**
 * Created by User on 03.07.2017.
 */
class ReviewListAdapter
(private val mDataset: List<ReviewModel.GetReviewResponseDatum>?,
 private val mContext: Context?) : RecyclerView.Adapter<ReviewListAdapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var main_container_CV : CardView ?=null
        var item_username_TV : TextView ?=null
        var item_user_avatar_CIV : CircleImageView ?=null
        var review_content_TV : TextView ?=null
        var review_date_TV : TextView?=null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_review_item, parent, false)

        val vh = ViewHolder(v)
        vh.main_container_CV = v.findViewById<CardView>(R.id.main_container_CV) as CardView
        vh.item_username_TV = v.findViewById<TextView>(R.id.item_username_TV) as TextView
        vh.item_user_avatar_CIV = v.findViewById<CircleImageView>(R.id.item_user_avatar_CIV) as CircleImageView
        vh.review_content_TV = v.findViewById<TextView>(R.id.review_content_TV) as TextView
        vh.review_date_TV = v.findViewById<TextView>(R.id.review_date_TV) as TextView
        return vh
    }



    override fun onBindViewHolder(h: ViewHolder, position: Int) {
        if (mDataset?.get(position) != null) {
            var cd = mDataset?.get(position)
            h.main_container_CV?.tag = cd?.userId;
            h.review_content_TV?.text = cd?.content
            h.review_date_TV?.text = MyCustomDate(cd?.createdAt!!).getDiffenence( mContext!!)
            h.main_container_CV?.setOnClickListener { v ->
                openUserProfile(v.tag.toString())
            }

            if( cd?.userId == GlobalStaticVariables.myId){
                if(cd?.user == null) {
                    h.item_username_TV?.text = GlobalStaticVariables.myData?.username
                    loadImageToIV(mContext!!, h.item_user_avatar_CIV!!, GlobalStaticVariables.myData?.avatar)
                }
            }
            else {
                h.item_username_TV?.text = cd?.user?.data?.username
                loadImageToIV(mContext!!, h.item_user_avatar_CIV!!, cd?.user?.data?.avatar)
            }
        }

    }

    fun openUserProfile(uid:String?){
        val intent = Intent(mContext , UserProfileActivity::class.java)
                .putExtra("user_data", uid)
                .putExtra("open_type", OpenTypesBy.user_id)
        mContext?.startActivity(intent)
    }

    override fun getItemCount(): Int {
        return mDataset?.size!!
    }


}