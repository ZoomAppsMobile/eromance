package com.zoomapps.eromance.Adapters

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Activities.FullScreenImage
import com.zoomapps.eromance.Controllers.GlobalVariables
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.CustomViews.SquareRelativeLayout
import com.zoomapps.eromance.CustomViews.TouchImageView
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Interfaces.IFullScreenImageView
import com.zoomapps.eromance.Models.UserPhotosModel
import com.zoomapps.eromance.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by User on 04.09.2017.
 */
class FullImageViewListAdapter
(private val mDataset: MutableList<String>?,
 private val mContext: Context?) : RecyclerView.Adapter<FullImageViewListAdapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var imgDisplay : TouchImageView? = null
        var loading_PB :ProgressBar?=null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_image_view_item, parent, false)

        val vh = ViewHolder(v)
        vh.imgDisplay =  v.findViewById<TouchImageView>(R.id.imgDisplay) as TouchImageView
        vh.loading_PB = v.findViewById<ProgressBar>(R.id.loading_PB) as ProgressBar
        return vh
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(mDataset?.get(position)!=null &&mDataset?.get(position) !="") {
            FullScreenImage.AsyncLoadImage(mContext!! ,
                    holder.imgDisplay!! , holder.loading_PB!!,
                    position ,mContext as IFullScreenImageView).execute(mDataset.get(position))
        }
    }

    override fun getItemCount(): Int {

        return mDataset?.size!!
    }
}