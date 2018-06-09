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
import android.widget.FrameLayout
import android.widget.ImageView
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Activities.FullScreenImage
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.CustomViews.SquareRelativeLayout
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.UserPhotosModel
import com.zoomapps.eromance.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by User on 06.07.2017.
 */
class UserPhotosAdapter(private val mDataset: List<UserPhotosModel.Data>?,
                        private val mContext: Context?,var ImageArr : Array<String>?) : RecyclerView.Adapter<UserPhotosAdapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var user_photo_IV : ImageView? = null
        var user_image_frame_container : FrameLayout? = null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_user_photo_item, parent, false)

        val vh = ViewHolder(v)
        vh.user_photo_IV =  v.findViewById<ImageView>(R.id.user_photo_IV) as ImageView
        vh.user_image_frame_container = v.findViewById<FrameLayout>(R.id.user_image_frame_container) as FrameLayout
        return vh
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(mDataset?.get(position)?.image!="") {
            holder?.user_image_frame_container!!.tag =mDataset?.get(position)?.id;
            loadImageToIV( mContext!! , holder?.user_photo_IV!!,mDataset?.get(position)?.image!!)
            holder?.user_image_frame_container!!.setOnClickListener { v ->
                var view_obj = v as FrameLayout
                var view_tag = view_obj.tag.toString()
                selectedItem_ID = view_tag.toInt()
                var selectedItemData = mDataset?.filter {  it-> it.id == selectedItem_ID}?.firstOrNull()
                var imageIds = Array<String>(mDataset.size,{i->mDataset.get(i).id.toString()})
                if(selectedItemData != null){
                    openImageViewer(mContext,ImageArr,position,imageIds)
                    //(mContext as Activity).startActivity(Intent(mContext , FullScreenImage::class.java).putExtra("image_data", GlobalVariables.server_url + selectedItemData.image))
                }
            }
        }

    }

    override fun getItemCount(): Int {

        return mDataset?.size!!
    }
    var selectedItem_ID = -1


}
/**
 * Created by User on 28.02.2017.
 */
