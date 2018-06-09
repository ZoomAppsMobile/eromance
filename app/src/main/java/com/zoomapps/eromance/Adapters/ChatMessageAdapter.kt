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
import android.widget.TextView
import com.bumptech.glide.Glide
import com.vanniktech.emoji.EmojiTextView
import com.zoomapps.eromance.Activities.FullScreenImage
import com.zoomapps.eromance.Controllers.GlobalVariables
import com.zoomapps.eromance.Controllers.getImagePath
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.MyCustomDate
import com.zoomapps.eromance.Models.ChatMessageModel
import com.zoomapps.eromance.R

/**
 * Created by User on 06.06.2017.
 */
class ChatMessageAdapter
        (private val mDataset: MutableList<ChatMessageModel.Datum_>?,
         private val mContext: Context?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var viewHolder : RecyclerView.ViewHolder?=null
        if(mDataset?.get(position)==null) {
            return
        }
        when (holder?.getItemViewType()) {
            0 -> {
                viewHolder = holder as ViewHolderMyMessage;
                    setData(mDataset?.get(position)!!,
                            viewHolder?.message_TV,
                            viewHolder?.message_IV,
                            viewHolder?.message_date_TV,
                            viewHolder?.message_bubble_LL)
                 return
            }
            2 -> {
                viewHolder = holder as ViewHolderInterlocutorMessage;
                setData(mDataset?.get(position)!!,
                        viewHolder?.message_TV,
                        viewHolder?.message_IV,
                        viewHolder?.message_date_TV,
                        viewHolder?.message_bubble_LL)
                return
            }
        }
    }
    fun setData(data:ChatMessageModel.Datum_ , msg_TV :TextView? , msg_IV :ImageView? , msg_date_TV:TextView? , container_LL :LinearLayout?){
        if(data.isAttachment!=false){
            msg_TV?.visibility = ViewGroup.GONE
            msg_IV?.visibility = ViewGroup.VISIBLE
            setImageMessage(data.content ,msg_IV , true )
        }
        else{
            msg_IV?.visibility = ViewGroup.GONE
            msg_TV?.visibility = ViewGroup.VISIBLE
            setTextMessage(data.content ,msg_TV )
        }
        setMessageDate(data.updatedAt.toString(),msg_date_TV)
        setClick(data , container_LL,true);
    }
    val ServerImageMessageTag_Type = "Server_Img-"
    val ImageMessageTag_Type = "Img-"
    val TextMessageTag_Type = "Text-"
    fun setClick(msg_data:ChatMessageModel.Datum_ , buggbleview:LinearLayout? , from_network: Boolean=false){
        if(msg_data.isAttachment!=false){
            buggbleview?.tag = ServerImageMessageTag_Type+msg_data.content
            buggbleview?.setOnClickListener { v->
                var view_tag = v.tag.toString()
                if(view_tag.startsWith(ServerImageMessageTag_Type)) {
                    var imagepath= view_tag.replace(ServerImageMessageTag_Type , "")
                    if(from_network)
                        imagepath = getImagePath(msg_data.content!!)!!
                    (mContext as Activity).startActivity(Intent(mContext,FullScreenImage::class.java )
                            .putExtra("image_data",imagepath))
                }
            }
        }
    }
    fun setMessageDate(date_str:String? , msg_date_TV:TextView?){
        //TODO: Date parser
        msg_date_TV?.setText(MyCustomDate(date_str!!).getDiffenence( mContext!!));
    }
    fun setTextMessage(message_text:String? , msg_TV :TextView?  ){
        msg_TV?.text = "$message_text"
    }
    fun setImageMessage(image_path:String? , msg_IV :ImageView? , from_network:Boolean = false ){
        if(from_network){
            loadImageToIV(mContext!!,msg_IV!!,image_path)
        }
        else
            Glide.with(mContext).load(image_path).into(msg_IV)
    }
    inner class ViewHolderMyMessage(var myView: View) : RecyclerView.ViewHolder(myView) {
        var message_bubble_LL:LinearLayout ?=null
        var message_TV : EmojiTextView?= null
        var message_IV : ImageView?= null
        var message_date_TV : TextView ?= null
    }
    inner class ViewHolderInterlocutorMessage(var myView: View) : RecyclerView.ViewHolder(myView) {
        var message_bubble_LL:LinearLayout ?=null
        var message_TV : EmojiTextView?= null
        var message_IV : ImageView?= null
        var message_date_TV : TextView ?= null
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            0 ->
            {
                val v = LayoutInflater.from(parent?.context)
                        .inflate(R.layout.layout_my_message, parent, false)
                val vh = ViewHolderMyMessage(v)
                vh.message_bubble_LL = v.findViewById<LinearLayout>(R.id.message_bubble_LL) as LinearLayout
                vh.message_TV  = v.findViewById<EmojiTextView>(R.id.message_TV) as EmojiTextView
                vh.message_IV  = v.findViewById<ImageView>(R.id.message_IV) as ImageView
                vh.message_date_TV  = v.findViewById<TextView>(R.id.message_date_TV) as TextView
                return vh;
            }
            else -> {
                val v = LayoutInflater.from(parent?.context)
                        .inflate(R.layout.layout_interlocutor_message, parent, false)
                val vh = ViewHolderInterlocutorMessage(v)
                vh.message_bubble_LL = v.findViewById<LinearLayout>(R.id.message_bubble_LL) as LinearLayout
                vh.message_TV  = v.findViewById<EmojiTextView>(R.id.message_TV) as EmojiTextView
                vh.message_IV  = v.findViewById<ImageView>(R.id.message_IV) as ImageView
                vh.message_date_TV  = v.findViewById<TextView>(R.id.message_date_TV) as TextView
                return vh;
            }
        }
    }

    override fun getItemCount(): Int {
        return mDataset?.size!!;
    }

    override fun getItemViewType(position: Int): Int {
       // return position % 2 * 2;
         if(mDataset?.get(position)?.userId == GlobalStaticVariables.myId){
             return 0
         }
        else{
             return 2
         }
    }
}
