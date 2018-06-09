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
import android.widget.RelativeLayout
import android.widget.TextView
import com.zoomapps.eromance.Activities.UserProfileActivity
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Controllers.openUserProfile
import com.zoomapps.eromance.Helpers.MyCustomDate
import com.zoomapps.eromance.Helpers.OpenTypesBy
import com.zoomapps.eromance.Models.MapModels
import com.zoomapps.eromance.Models.MapsModels
import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView
import java.util.*

/**
 * Created by User on 17.07.2017.
 */
class MapBottomUserListAdapter (private val mDataset: MutableList<MapModels.Datum>?,
                                private val mContext: Context?) : RecyclerView.Adapter<MapBottomUserListAdapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var main_container : LinearLayout?=null
        var user_avatar_CIV : CircleImageView ?=null
        var user_net_status : ImageView ?=null
        var user_realname_TV : TextView?=null
        var point_created_time_TV : TextView ?=null
        var avatar_container_RL : RelativeLayout ?= null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_map_user_item, parent, false)

        val vh = ViewHolder(v)
        vh.main_container  =  v.findViewById<LinearLayout>(R.id.main_container) as LinearLayout
        vh.user_avatar_CIV  =  v.findViewById<CircleImageView>(R.id.user_avatar_CIV) as CircleImageView
        vh.user_net_status  =  v.findViewById<ImageView>(R.id.user_net_status) as ImageView
        vh.user_realname_TV  =  v.findViewById<TextView>(R.id.user_realname_TV) as TextView
        vh.point_created_time_TV  =  v.findViewById<TextView>(R.id.point_created_time_TV) as TextView
        vh.avatar_container_RL = v.findViewById<RelativeLayout>(R.id.avatar_container_RL) as RelativeLayout
        return vh
    }

    override fun onBindViewHolder(h: ViewHolder, position: Int) {
        if(mDataset?.get(position)!=null){
            var cd=mDataset?.get(position)
            loadImageToIV(mContext!! , h.user_avatar_CIV!!,cd?.user?.data?.avatar)
            h.user_realname_TV?.text = cd?.user?.data?.username
            if(cd?.createdAt!=null)
                h.point_created_time_TV?.text = MyCustomDate(cd?.createdAt!!).getDiffenence( mContext!!)
            if(cd?.user?.data?.is_online!=null && cd?.user?.data?.is_online == true){
                h.user_net_status?.setImageResource(R.drawable.icon_status_online)
            }
            else{
                h.user_net_status?.setImageResource(R.drawable.icon_status_offline)
            }
            h.avatar_container_RL?.tag =cd?.userId.toString()
            h.avatar_container_RL?.setOnClickListener {v->
                var user_id = if(v.tag !=null) v.tag.toString() else null
                if(user_id!=null && !user_id.isNullOrEmpty()){
                    openUserProfile(mContext,user_id)
                }
            }
        }
    }

    override fun getItemCount(): Int {

        return mDataset?.size!!
    }


}
