package com.zoomapps.eromance.Adapters

import android.content.Context
import android.support.percent.PercentLayoutHelper
import android.support.percent.PercentRelativeLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.zoomapps.eromance.Controllers.Server_Entities
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Controllers.serializeToJson
import com.zoomapps.eromance.DialogFragment.MeetDetailsDialogFragment
import com.zoomapps.eromance.DialogFragment.MeetNotificationDetailsDialog
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.MyCustomDate
import com.zoomapps.eromance.Models.Notifications_Event_List_Model
import com.zoomapps.eromance.Models.UserQuessionary
import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView

/**
 * Created by User on 19.06.2017.
 */
class NotificationsEventsAdapter
(private val mDataset: List<Notifications_Event_List_Model.Datum>,
 private val mContext: Context?) : RecyclerView.Adapter<NotificationsEventsAdapter.ViewHolder>() {
    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var element_container : LinearLayout ?=null
        var avatar_container_PRL : PercentRelativeLayout ?=null
        var avatar_CIV : CircleImageView ?=null
        var notif_type_IV : ImageView ?=null
        var notif_info_container : LinearLayout ?=null
        var element_date_TV : TextView ?=null
        var element_content_TV : TextView ?=null
        var element_username_TV : TextView ?=null
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
                h.element_date_TV?.text = MyCustomDate(cd.updatedAt!!).getDiffenence( mContext!!);
            }
            catch (ex:Exception){
                var msg = ex.message;
            }

            if(cd.data?.entity_class == Server_Entities.Meet || cd.data?.entity_class == Server_Entities.Evening)
                h.element_username_TV?.text = "К вашей встрече хотят присоединиться"
            else
                h.element_username_TV?.text = cd.data?.from?.username
            loadImageToIV(mContext!! , h.avatar_CIV!! , cd.data?.from?.avatar)
            setDataByType(h.element_content_TV!!,
                    h.notif_type_IV!! ,
                    h.element_username_TV!!,
                    h.avatar_CIV!!,
                    h.itemView,
                    cd.entityClass ,
                    cd )
        }

    }

    fun setDataByType(content_TV:TextView , type_icon_IV :ImageView , username_TV:TextView, user_avatar:CircleImageView?,
                      itemView:View,
                      type_str:String? , data:Notifications_Event_List_Model.Datum){
        when(type_str){
            Server_Entities.Rating ->{
                type_icon_IV.setImageResource(R.drawable.white_star)
                content_TV.text = "Вы "+if(data.data?.isLiked!!) mContext!!.getString(R.string.likes) else  mContext!!.getString(R.string.blocked)
            }
            Server_Entities.Message->{
                type_icon_IV.setImageResource(R.drawable.ic_message)
                content_TV.text = data.data?.content
            }
            Server_Entities.Gift->{
                type_icon_IV.setImageResource(R.drawable.ic_giftcard)
                if(data.userId == GlobalStaticVariables.myId) {
                    content_TV.text = mContext!!.getString(R.string.you_send_gift)
                }
                else{
                    content_TV.text = mContext!!.getString(R.string.you_send_gift_)
                }
            }
            Server_Entities.Interaction->{
                if(data.data?.entity_class==Server_Entities.Meet || data.data?.entity_class==Server_Entities.Evening) {
                    type_icon_IV.setImageResource(R.drawable.ic_message)
                    content_TV.text = mContext!!.getString(R.string.click_view)
                    itemView.setOnClickListener {
                        var dialogFrag = MeetNotificationDetailsDialog
                                .newInstance(data.entityId.toString(), data.userId.toString(),data.data?.entity_class)
                        dialogFrag.show((mContext as AppCompatActivity).supportFragmentManager, "dialogFragmentChangePassword")
                    }

                }
            }
            Server_Entities.Game->{
                username_TV.text = data?.data?.enemy?.user?.username
                loadImageToIV(mContext!! ,user_avatar!! , data?.data?.enemy?.user?.avatar)
                type_icon_IV.setImageResource(R.drawable.ic_game)
                var game_res_text = calcWinner(data?.data?.bet?.thingId,data?.data?.enemy?.bet?.thingId);
                var bet_text = "Игра со стоимостю :" + data.data?.bet?.bet
                content_TV.text = bet_text + "\n" + game_res_text
            }
            else->{
                type_icon_IV.setImageResource(R.drawable.com_facebook_close)
            }
        }
    }

    fun calcWinner(myThing_ID:Int? , opponentThing_Id:Int?):String{
        if(myThing_ID == null || opponentThing_Id==null)
            return   mContext!!.getString(R.string.unknown)
       var thing_diffs = myThing_ID!! - opponentThing_Id!!;
        return when(thing_diffs){
            -2->{
                mContext!!.getString(R.string.you_lose)
            }
            -1->{
                mContext!!.getString(R.string.you_won)
            }
            0->{
                mContext!!.getString(R.string.draw)
            }
            1->{
                mContext!!.getString(R.string.you_lose)
            }
            2->{
                mContext!!.getString(R.string.you_won)
            }
            else->{
                mContext!!.getString(R.string.unknown)
            }
        }
    }

    override fun getItemCount(): Int {
        return mDataset?.size!!
    }


}