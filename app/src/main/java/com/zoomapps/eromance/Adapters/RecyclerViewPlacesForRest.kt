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
import com.zoomapps.eromance.Activities.FullScreenImage
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.Models.ModelForRest
import com.zoomapps.eromance.Models.PlaceInfoModel
import com.zoomapps.eromance.R

class RecyclerViewPlacesForRest
(private val mDataset: List<PlaceInfoModel.Datum>?,
 private val mContext: Context?) : RecyclerView.Adapter<RecyclerViewPlacesForRest.ViewHolder>() {

    override fun onBindViewHolder(holder: RecyclerViewPlacesForRest.ViewHolder, position: Int) {
        if (mDataset?.get(position) != null) {
            var cd = mDataset?.get(position);
            if(checkImage(cd?.image)){
                loadImageToIV(mContext!! ,holder?.iv_list_picture!! ,cd?.image );
                holder?.main_place_photo_item?.tag = getImagePath(cd?.image)
                var imageIds = Array<String>(mDataset.size,{i->mDataset.get(i).id.toString()})
                holder?.main_place_photo_item?.setOnClickListener { v->
                    var image_path = v.tag.toString()
                    if(image_path!=null && image_path.isNotEmpty()) {
                        //(mContext as Activity).startActivity(Intent(mContext, FullScreenImage::class.java).putExtra("image_data", image_path))
                        openImageViewer(mContext , Array<String>(mDataset.size , {i->getImagePath(mDataset.get(i).image)!!}),position,imageIds)
                    }
                }
            }
        }
    }

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var main_place_photo_item : LinearLayout?=null
        var iv_list_picture: ImageView? = null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_view_places_for_rest, parent, false)

        val vh = ViewHolder(v)
        vh.main_place_photo_item = v.findViewById<LinearLayout>(R.id.main_place_photo_item) as  LinearLayout
        vh.iv_list_picture = v.findViewById<ImageView>(R.id.iv_list_picture) as  ImageView

        return vh
    }

    override fun getItemCount(): Int {
        return mDataset?.size!!
    }


}