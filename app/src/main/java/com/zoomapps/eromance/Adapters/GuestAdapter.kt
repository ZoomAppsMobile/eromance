package com.zoomapps.eromance.Adapters

import android.content.Context
import android.support.percent.PercentRelativeLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.zoomapps.eromance.Controllers.Server_Entities
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Helpers.MyCustomDate
import com.zoomapps.eromance.Models.GuestModel
import com.zoomapps.eromance.Models.Notifications_Event_List_Model
import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView

/**
 * Created by User on 19.06.2017.
 */
class GuestAdapter
(private val mDataset: List<GuestModel.Datum>,
 private val mContext: Context?) : RecyclerView.Adapter<GuestAdapter.ViewHolder>() {
    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var element_container : LinearLayout?=null
        var avatar_container_PRL : PercentRelativeLayout?=null
        var avatar_CIV : CircleImageView?=null
        var notif_type_IV : ImageView?=null
        var notif_info_container : LinearLayout?=null
        var element_date_TV : TextView?=null
        var element_content_TV : TextView?=null
        var element_username_TV : TextView?=null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_notif_evets_row , parent, false)

        val vh = ViewHolder(v)
        vh.element_container = v.findViewById<LinearLayout>(R.id.element_container) as LinearLayout
        vh.avatar_container_PRL = v.findViewById<PercentRelativeLayout>(R.id.avatar_container_PRL) as PercentRelativeLayout
        vh.avatar_CIV = v.findViewById<CircleImageView>(R.id.avatar_CIV) as CircleImageView
        vh.notif_type_IV = v.findViewById<ImageView>(R.id.notif_type_IV) as ImageView
        vh.notif_info_container = v.findViewById<LinearLayout>(R.id.notif_info_container) as LinearLayout
        vh.element_date_TV = v.findViewById<TextView>(R.id.element_date_TV) as TextView
        vh.element_content_TV = v.findViewById<TextView>(R.id.element_content_TV) as TextView
        vh.element_username_TV = v.findViewById<TextView>(R.id.element_username_TV) as TextView

        return vh
    }

    override fun onBindViewHolder(h: ViewHolder, position: Int) {
        if (mDataset?.get(position) != null) {
            var cd = mDataset?.get(position);
            try {
                h.element_date_TV?.text = MyCustomDate(cd.createdAt!!).getDiffenence( mContext!!);
            }
            catch (ex:Exception){
                var msg = ex.message;
            }
            h.element_username_TV?.text = cd.acted?.data?.username
            loadImageToIV(mContext!! , h.avatar_CIV!! , cd.acted?.data?.avatar)
            h.notif_type_IV?.visibility = ViewGroup.GONE
            h.element_content_TV?.text = mContext.getString(R.string.view_profile)
        }

    }


    override fun getItemCount(): Int {
        return mDataset?.size!!
    }


}