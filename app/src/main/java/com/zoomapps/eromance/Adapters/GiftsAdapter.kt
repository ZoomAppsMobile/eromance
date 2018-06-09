package com.zoomapps.eromance.Adapters

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Activities.FullScreenImage
import com.zoomapps.eromance.Activities.GiftsActivity
import com.zoomapps.eromance.Controllers.GlobalVariables
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.CustomViews.SquareRelativeLayout
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.GiftsModel
import com.zoomapps.eromance.Models.UserPhotosModel
import com.zoomapps.eromance.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by User on 11.07.2017.
 */
class GiftsAdapter(private val mDataset: List<GiftsModel.Data>?,
                   private val mContext: Context? , val hasClickAction:Boolean ,
                   val showBorder:Boolean=true) : RecyclerView.Adapter<GiftsAdapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var gift_image_IV : ImageView? = null
        var main_element_contaienr : LinearLayout? = null
        var gift_name_TV: TextView?=null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_gift_element, parent, false)

        val vh = ViewHolder(v)
        vh.main_element_contaienr =  v.findViewById<LinearLayout>(R.id.main_element_contaienr) as LinearLayout
        vh.gift_image_IV =  v.findViewById<ImageView>(R.id.gift_image_IV) as ImageView
        vh.gift_name_TV = v.findViewById<TextView>(R.id.gift_name_TV) as TextView
        return vh
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        loadImageToIV(mContext!! , holder.gift_image_IV!! , mDataset?.get(position)?.image)
        holder.gift_name_TV?.text =  mDataset?.get(position)?.key
        holder.main_element_contaienr?.tag = mDataset?.get(position)?.id.toString();
        holder.main_element_contaienr?.setOnClickListener { v->


            //(mContext as GiftsActivity).onBack()


            if(hasClickAction){
                (mContext as GiftsActivity).onElementSelected(v.tag.toString())
            }
        }
        if(!showBorder){
            holder.main_element_contaienr?.background = null
            holder.main_element_contaienr?.setBackgroundResource(0)
        }
    }

    override fun getItemCount(): Int {
        return mDataset?.size!!
    }


}