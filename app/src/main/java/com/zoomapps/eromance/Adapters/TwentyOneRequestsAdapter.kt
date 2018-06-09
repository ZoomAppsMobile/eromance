package com.zoomapps.eromance.Adapters

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import com.zoomapps.eromance.Activities.UserProfileActivity
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.MyCustomDate
import com.zoomapps.eromance.Models.AdultRequestsModel
import com.zoomapps.eromance.Models.ReviewModel
import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView
import android.support.v4.content.ContextCompat.startActivity
import com.zoomapps.eromance.Controllers.TypeConvertor
import com.zoomapps.eromance.Models.Types.UserServiceTypes


/**
 * Created by User on 04.07.2017.
 */
class TwentyOneRequestsAdapter
(private val mDataset: List<AdultRequestsModel.Datum>?,
 private val mContext: Context?) : RecyclerView.Adapter<TwentyOneRequestsAdapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var main_container_CV: CardView? = null
        var item_username_TV: TextView? = null
        var item_user_avatar_CIV: CircleImageView? = null
        var service_type_TV : TextView?=null
        var service_content_TV: TextView? = null
        var service_request_date_TV: TextView? = null
        var callToUser_IB : ImageButton?=null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_twenty_one_request_item, parent, false)

        val vh = ViewHolder(v)
        vh.main_container_CV = v.findViewById<CardView>(R.id.main_container_CV) as CardView
        vh.item_username_TV = v.findViewById<TextView>(R.id.item_username_TV) as TextView
        vh.item_user_avatar_CIV = v.findViewById<CircleImageView>(R.id.item_user_avatar_CIV) as CircleImageView
        vh.service_type_TV = v.findViewById<TextView>(R.id.service_type_TV) as TextView
        vh.service_content_TV = v.findViewById<TextView>(R.id.service_content_TV) as TextView
        vh.service_request_date_TV = v.findViewById<TextView>(R.id.service_request_date_TV) as TextView
        vh.callToUser_IB = v.findViewById<ImageButton>(R.id.callToUser_IB) as ImageButton
        return vh
    }

    val typeConv = TypeConvertor(mContext!!)
    fun getStrTypes(serv_id:List<String>?):String{
        var returnStr = "";
        if(serv_id!=null && serv_id.isNotEmpty())
            for( tmp in serv_id)
                if(tmp!=null && tmp!="" && tmp.toInt()!=-1)
                    returnStr+= typeConv?.getKeyById( UserServiceTypes::class.java,tmp.toInt())+" "
        return returnStr
    }
    override fun onBindViewHolder(h: ViewHolder, position: Int) {
        if (mDataset?.get(position) != null) {
            var cd = mDataset?.get(position)
            h.main_container_CV?.tag = cd?.userId;
            h.service_content_TV?.text = cd?.description
            h.service_request_date_TV?.text = MyCustomDate(cd?.updatedAt!!).getDiffenence( mContext!!)
            h.main_container_CV?.setOnClickListener { v ->
                showToast(mContext!!, "user_id = " + v.tag.toString())
            }
            h.service_type_TV?.text = getStrTypes(cd?.servicesId)
            h.item_username_TV?.text = cd?.user?.data?.profile?.data?.realName
            loadImageToIV(mContext!!, h.item_user_avatar_CIV!!, cd?.user?.data?.avatar)
            h.callToUser_IB?.tag = cd?.user?.data?.phone
            h.callToUser_IB?.setOnClickListener {v->
                var tagData = (v as ImageButton).tag.toString()
                if(tagData!=null && tagData!=""){
                    val callIntent = Intent(Intent.ACTION_CALL)
                    callIntent.data = Uri.parse("tel:"+tagData)
                    mContext.startActivity(callIntent)
                }
            }
        }

    }

    fun openUserProfile() {
        val intent = Intent(mContext, UserProfileActivity::class.java)
        mContext?.startActivity(intent)
    }

    override fun getItemCount(): Int {
        return mDataset?.size!!
    }


}