package com.zoomapps.eromance.Adapters

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.zoomapps.eromance.Activities.ChatActivity
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Models.DialogsModel
import com.zoomapps.eromance.R
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class DialogsAdapter
(private val mDataset: MutableList<DialogsModel.Datum>?,
 private val mContext: Context?) : RecyclerView.Adapter<DialogsAdapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var main_item_container : LinearLayout?=null
        var item_user_avatar_IV : ImageView?=null
        var item_user_status_frame_IV : ImageView?=null
        var item_user_name_TV : TextView?=null
        var item_dialog_info_container : LinearLayout?=null
        var item_message_count_TV : TextView?=null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_dialog_items, parent, false)
        val vh = ViewHolder(v)

        vh.main_item_container = v.findViewById<LinearLayout>(R.id.main_item_container ) as LinearLayout
        vh.item_user_avatar_IV = v.findViewById<ImageView>(R.id.item_user_avatar_IV ) as ImageView
        vh.item_user_status_frame_IV = v.findViewById<ImageView>(R.id.item_user_status_frame_IV ) as ImageView
        vh.item_user_name_TV = v.findViewById<TextView>(R.id.item_user_name_TV ) as TextView
        vh.item_dialog_info_container = v.findViewById<LinearLayout>(R.id.item_dialog_info_container ) as LinearLayout
        vh.item_message_count_TV = v.findViewById<TextView>(R.id.item_message_count_TV ) as TextView
        return vh
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (mDataset?.get(position) != null) {
            holder.main_item_container?.tag = mDataset?.get(position)?.joinedUserId;
            holder.main_item_container?.setOnClickListener { v->
                var view_tag = v.tag?.toString()
                (mContext as AppCompatActivity).startActivity(Intent(mContext, ChatActivity::class.java).putExtra("intercular_id",view_tag))
            }
            holder.item_user_name_TV?.text =  mDataset?.get(position)?.joined?.data?.username
            loadImageToIV(mContext!! , holder.item_user_avatar_IV!! ,  mDataset?.get(position)?.joined?.data?.avatar )
            holder.item_message_count_TV?.text = mDataset?.get(position)?.countUnread.toString() + "/"+mDataset?.get(position)?.countTotal.toString()
            if(mDataset?.get(position)?.joined?.data?.is_online!=null
                    && mDataset?.get(position)?.joined?.data?.is_online == true ){
                holder.item_user_status_frame_IV?.setImageResource(R.drawable.user_online_ava_frame)
            }
            else{
                holder.item_user_status_frame_IV?.setImageResource(R.drawable.user_offline_ava_frame)
            }
        }

    }

    override fun getItemCount(): Int {
        return mDataset?.size!!
    }
}
