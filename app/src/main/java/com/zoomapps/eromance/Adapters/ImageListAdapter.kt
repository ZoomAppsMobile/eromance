
/**
 * Created by User on 22.05.2017.
 */
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
import com.zoomapps.eromance.R
import android.widget.*
import com.zoomapps.eromance.Models.MapsModels
import java.util.*
import com.bumptech.glide.Glide
import com.zoomapps.eromance.Models.ImageAlbumModel
import com.zoomapps.eromance.Models.UserPhotosModel
import android.os.Build
import android.util.Log
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Activities.FullScreenImage
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.CustomViews.SquareRelativeLayout
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ImageListAdapter
(private val mDataset: MutableList<UserPhotosModel.Data>?,
 private val mContext: Context?,var ImageArr : Array<String>?) : RecyclerView.Adapter<ImageListAdapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var item_image_IV : ImageView? = null
        var elementRootView : SquareRelativeLayout ? = null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_album_image_item, parent, false)

        val vh = ViewHolder(v)
        vh.item_image_IV =  v.findViewById<ImageView>(R.id.item_image_IV) as ImageView
        vh.elementRootView = v.findViewById<SquareRelativeLayout>(R.id.elementRootView) as  SquareRelativeLayout
        return vh
    }

    var alertD : AlertDialog?=null
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(mDataset?.get(position)?.image!="") {
            holder?.elementRootView!!.tag =mDataset?.get(position)?.id;
            loadImageToIV( mContext!! , holder?.item_image_IV!!,mDataset?.get(position)?.image!!)
            holder?.elementRootView!!.setOnClickListener { v ->
                var view_obj = v as SquareRelativeLayout
                var view_tag = view_obj.tag.toString()
                selectedItem_ID = view_tag.toInt()
                var imageIds = Array<String>(mDataset.size,{i->mDataset.get(i).id.toString()})
                var selectedItemData = mDataset?.filter {  it-> it.id == selectedItem_ID}?.firstOrNull()
                if(selectedItemData != null){
                    openImageViewer(mContext,ImageArr,position,imageIds)
                }
            }
            holder?.elementRootView!!.setOnLongClickListener { v ->
                var view_obj = v as SquareRelativeLayout
                var view_tag = view_obj.tag.toString()
                selectedItem_ID = view_tag.toInt()
                alertD?.show()
                true
            }
        }

    }
    fun deleteImageRequest(img_ID:Int){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.deleteUserPhoto(img_ID.toString() , GlobalStaticVariables.myId.toString())
        call.enqueue(object : Callback<UserPhotosModel.UserGetPhotosResponse> {
            override fun onResponse(call: Call<UserPhotosModel.UserGetPhotosResponse>,
                                    response: Response<UserPhotosModel.UserGetPhotosResponse>) {
                val mainPageDataList = response.body()
                if(mainPageDataList != null &&mainPageDataList.code == 1 ) {
                    showToast(mContext!!,mContext.getString(R.string.delete));
                    mDataset?.removeAll { it->it.id == img_ID }
                    notifyDataSetChanged()
                }
                else {
                    showPreparedToast(mContext!!,"Failed");
                }
            }

            override fun onFailure(call: Call<UserPhotosModel.UserGetPhotosResponse>, t: Throwable) {
                // Log error here since request failed
                showPreparedToast(mContext!!,"Failed");
            }

        })

    }
    override fun getItemCount(): Int {

        return mDataset?.size!!
    }
    var selectedItem_ID = -1
    init {
        var adb = AlertDialog.Builder(mContext)
        adb?.setTitle(mContext!!.getString(R.string.delete))
        adb?.setMessage(mContext!!.getString(R.string.delete_image))
        adb?.setNegativeButton(mContext!!.getString(R.string.cancel), object:DialogInterface.OnClickListener{
            override fun onClick(p0: DialogInterface?, p1: Int) {
                if(alertD!=null){
                    alertD?.cancel()
                }
            }

        })
        adb.setPositiveButton(mContext!!.getString(R.string.yes),object:DialogInterface.OnClickListener{
            override fun onClick(p0: DialogInterface?, p1: Int) {
               if(selectedItem_ID!=-1){
                   deleteImageRequest(selectedItem_ID);
                   alertD?.cancel()
               }
            }

        })
        alertD = adb?.create()
        alertD?.setOnCancelListener {
            selectedItem_ID==-1;
        }
    }

}
/**
 * Created by User on 28.02.2017.
 */
