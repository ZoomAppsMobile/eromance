package com.zoomapps.eromance.Adapters

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zoomapps.eromance.R
import android.widget.*
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Activities.UserProfileActivity
import com.zoomapps.eromance.Adapters.viewIniter.setUserView
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.DialogFragment.MeetDetailsDialogFragment
import com.zoomapps.eromance.DialogFragment.MeetDetailsDialogFragment2
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.MessageEvent
import com.zoomapps.eromance.Helpers.OpenTypesBy
import com.zoomapps.eromance.Interfaces.IMeetDetailsView
import com.zoomapps.eromance.Interfaces.RequestMakerListener
import com.zoomapps.eromance.Models.ConnectedToMeetResponse
import com.zoomapps.eromance.Models.MeetsModel
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import retrofit2.Call
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*
import java.text.ParseException


class Connection_ResultList_Adapter
(private val mDataset: MutableList<MeetsModel.Datum>?,
 private val mContext: Context?, val type: String, val test: String?) : RecyclerView.Adapter<Connection_ResultList_Adapter.ViewHolder>(),
        RequestMakerListener, IMeetDetailsView {


    private var interaction_id: Int? = null
    public var isConnectionCheck = false
    private var details : MeetsModel.Datum ?=null


    private lateinit var send_btn : Button



    override fun onRequestError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    override fun onShowToast(message: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onUnconnectedToMeet() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onConnectedToMeet(isBlocked: Boolean?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    val rqst_mkr = RequestMaker(this)
    val apiService = API_Client.client!!.create(API_Interface::class.java)

    override fun <T> onError(out: T?) {

    }

    override fun <T> onRequestSuccess(out: T) {

    }

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var item_profile_image_IV: ImageView? = null
        var item_payment_type_TV: TextView? = null
        var left_time_container: LinearLayout? = null
        var days_left_TV: TextView? = null
        var hour_left_TV: TextView? = null
        var minutes_left_TV: TextView? = null
        var item_connect_btn: Button? = null
        var tv_target: TextView? = null
        var recyclerView: RecyclerView? = null
        var item_stars_IV: ImageView? = null
        var item_status_IV: ImageView? = null
        var item_user_status_container: RelativeLayout? = null
        var vip_IV: ImageView? = null
        var item_joined_user_TV: TextView? = null
        var user_info_container: LinearLayout? = null
        var click_layout : LinearLayout? = null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.recycler_view_parametr_search_list_users, parent, false)

        val vh = ViewHolder(v)
        vh.item_stars_IV = v.findViewById<ImageView>(R.id.item_stars_IV) as ImageView
        vh.item_status_IV = v.findViewById<ImageView>(R.id.item_status_IV) as ImageView
        vh.item_user_status_container = v.findViewById<RelativeLayout>(R.id.item_user_status_container) as RelativeLayout
        vh.item_profile_image_IV = v.findViewById<ImageView>(R.id.item_profile_image_IV) as ImageView
        vh.item_payment_type_TV = v.findViewById<TextView>(R.id.item_payment_type_TV) as TextView
        vh.left_time_container = v.findViewById<LinearLayout>(R.id.left_time_container) as LinearLayout
        vh.days_left_TV = v.findViewById<TextView>(R.id.days_left_TV) as TextView
        vh.hour_left_TV = v.findViewById<TextView>(R.id.hour_left_TV) as TextView
        vh.minutes_left_TV = v.findViewById<TextView>(R.id.minutes_left_TV) as TextView
        vh.item_connect_btn = v.findViewById<Button>(R.id.item_connect_btn) as Button
        vh.tv_target = v.findViewById<TextView>(R.id.tv_target) as TextView
        vh.recyclerView = v.findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView
        vh.vip_IV = v.findViewById<ImageView>(R.id.vip_IV) as ImageView
        vh.item_joined_user_TV = v.findViewById<TextView>(R.id.item_joined_user_TV) as TextView
        vh.user_info_container = v.findViewById<LinearLayout>(R.id.user_info_container) as LinearLayout
        vh.click_layout = v.findViewById(R.id.click_layout) as LinearLayout
        return vh
    }


    var clickedItems = ArrayList<Int>()

    val timeZone = TimeZone.getTimeZone("UTC")
    val cal_now = Calendar.getInstance(timeZone)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {



        if (mDataset?.get(position) != null) {
            if (GlobalStaticVariables.myId == mDataset?.get(position)?.userId!!) {

              holder.item_connect_btn!!.setText(mContext!!.getString(R.string.meets))
            }else{
//                var call = API_Client.apiService!!.checkSubscribe(GlobalStaticVariables.myId.toString(),2)
//                call.enqueue(object: retrofit2.Callback<ConnectedToMeetResponse> {
//                    override fun onResponse(_call: Call<ConnectedToMeetResponse>?, response: Response<ConnectedToMeetResponse>?) {
//                        isConnectionCheck = true;
//                        var isConnected = true;
//                        var isBlocked = false;
//                        if(response!=null){
//                            if(response.body()!=null && response.body().data!=null && response.body().data!!.isNotEmpty() ){
//                                var data = response?.body()?.data?.lastOrNull()
//                                if(data!=null && data.id!=null){
//                                    interaction_id = data.id!!
//                                    if(data.isAcceptedType == Acception_TYPES.DECLINED){
//                                        isConnected = false
//                                        isBlocked = true
////
//                                    }
//                                    else
//                                     isConnected = true
//                                }
//                            }
//                            else{
//                                isConnected = false;
//                            }
//
//                        }
//                        //connectionCallback(isConnected,isBlocked)
//                        when(isConnected){
//                            true->{
//                                holder.item_connect_btn!!.setText("Отписаться")
//                            }
//                            false ->{
//                                holder.item_connect_btn!!.setText("Подписаться")
//                             }
//                        }
//                    }
//
//                    override fun onFailure(_call: Call<ConnectedToMeetResponse>?, t: Throwable?) {
//
//                    }
//
//                })



                holder.item_connect_btn!!.setText(mContext!!.getString(R.string.learn_more))



            }
//       }else if(checked){
//               holder.item_connect_btn!!.setText("Отписаться")
//          }


            try {
                setUserView(mContext!!, holder.user_info_container!!, holder.item_status_IV!!, holder.item_stars_IV!!, holder.item_profile_image_IV!!,
                        mDataset?.get(position)?.user?.data!!, mDataset?.get(position)?.user?.data?.is_online)
            } catch (ex: Exception) {
                //Todo:CHECK exception
            }
            holder.user_info_container?.setOnClickListener {
                if (mDataset?.get(position)?.userId != null) {
                    mContext?.startActivity(Intent(mContext!!, UserProfileActivity::class.java)
                            .putExtra("user_data", mDataset?.get(position)?.userId?.toString())
                            .putExtra("open_type", OpenTypesBy.user_id));
                }
            }
            holder.item_payment_type_TV?.text = getPaymentValue(mDataset?.get(position)?.paymentId!!)
            val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)
            // sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
            var date = sdf.parse(mDataset?.get(position)?.createdAt);
            if (mDataset?.get(position)?.finishedAt != null) {
                date = sdf.parse(mDataset?.get(position)?.finishedAt);
            }

            val cal = Calendar.getInstance()
            cal.setTime(date)// all done
            try {
                Log.e("Itm Date Before", cal.time.toString())
                if (mDataset?.get(position)?.timeId != null) {
                    cal.add(Calendar.HOUR_OF_DAY, mDataset?.get(position)?.timeId!!)
                }

                Log.e("My Date", cal_now.time.toString())
                Log.e("Itm Date", cal.time.toString())

                var dateDiff = printDifference(cal_now, cal).split('-');
                try {
                    holder.days_left_TV?.text = dateDiff[0]
                    holder.hour_left_TV?.text = dateDiff[2]
                    holder.minutes_left_TV?.text = dateDiff[4]
                } catch (ex: IndexOutOfBoundsException) {
                }
            } catch (e: ParseException) {
            }
            if (mDataset?.get(position)?.joinedUserId != null) {
                holder.item_joined_user_TV?.visibility = View.VISIBLE
                if (mDataset?.get(position)?.joined?.data != null) {
                    holder.item_joined_user_TV?.text = if (mDataset?.get(position)?.joined?.data?.profile?.data?.realName != null) mDataset?.get(position)?.joined?.data?.profile?.data?.realName?.toString() else mDataset?.get(position)?.joined?.data?.username.toString()
                    holder.item_joined_user_TV?.setOnClickListener {
                        openUserProfile(mContext!!, mDataset?.get(position)?.joinedUserId.toString())
                    }
                } else
                    holder.item_joined_user_TV?.text = mDataset?.get(position)?.joinedUserId.toString()
            } else {
                holder.item_joined_user_TV?.visibility = View.GONE
            }
            holder.click_layout?.tag = mDataset?.get(position)?.id.toString() + "-" + mDataset?.get(position)?.userId.toString()
            changeBgOfBtn(holder.click_layout!!, clickedItems?.contains(mDataset?.get(position)?.id)!!)
            holder.click_layout?.setOnClickListener { v ->

                var data = v.tag.toString().split('-')
//                if(data.get(1)!=null && data.get(1).toInt()== GlobalStaticVariables.myId){
//                    showToast(mContext!! , "Вы не моэете присоединится самому себе")
//                }
//                var meet_id = data?.get(0)
//                if(!clickedItems?.contains(meet_id.toInt())!!) {
//                    changeBgOfBtn( (v as Button) ,true)
//                    clickedItems?.add(meet_id.toInt())
//                    val call = apiService.connectToMeet(meet_id, GlobalStaticVariables.myId.toString())
//                    //connectToMeet
//                    //http://eromance.life/api/v1/ru/user_interactions?entity_class=App\Meet\Meet&entity_id=2&user_id=13
//                    rqst_mkr.makeRequest(call)
//                }
//                else{
//                    showToast(mContext!!,"Вы уже отправляли запрос на данную встречу")
//                }


                if (GlobalStaticVariables.myId == mDataset?.get(position)?.userId!!) {


                    var dialogFrag = MeetDetailsDialogFragment2.newInstance(serializeToJson(mDataset.get(position)), type)
                    dialogFrag.show((mContext as AppCompatActivity).supportFragmentManager, "dialogFragmentChangePassword")
//                    showToast(mContext!! , "Вы не моэете присоединится самому себе")


                } else {


                    var dialogFrag = MeetDetailsDialogFragment.newInstance(serializeToJson(mDataset.get(position)), type)
                    dialogFrag.show((mContext as AppCompatActivity).supportFragmentManager, "dialogFragmentChangePassword")


                }


            }


            holder.item_connect_btn?.tag = mDataset?.get(position)?.id.toString() + "-" + mDataset?.get(position)?.userId.toString()
            holder.item_connect_btn?.setOnClickListener { v ->

                var data = v.tag.toString().split('-')
//                if(data.get(1)!=null && data.get(1).toInt()== GlobalStaticVariables.myId){
//                    showToast(mContext!! , "Вы не моэете присоединится самому себе")
//                }
//                var meet_id = data?.get(0)
//                if(!clickedItems?.contains(meet_id.toInt())!!) {
//                    changeBgOfBtn( (v as Button) ,true)
//                    clickedItems?.add(meet_id.toInt())
//                    val call = apiService.connectToMeet(meet_id, GlobalStaticVariables.myId.toString())
//                    //connectToMeet
//                    //http://eromance.life/api/v1/ru/user_interactions?entity_class=App\Meet\Meet&entity_id=2&user_id=13
//                    rqst_mkr.makeRequest(call)
//                }
//                else{
//                    showToast(mContext!!,"Вы уже отправляли запрос на данную встречу")
//                }


                if (GlobalStaticVariables.myId == mDataset?.get(position)?.userId!!) {


                    var dialogFrag = MeetDetailsDialogFragment2.newInstance(serializeToJson(mDataset.get(position)), type)
                    dialogFrag.show((mContext as AppCompatActivity).supportFragmentManager, "dialogFragmentChangePassword")
//                    showToast(mContext!! , "Вы не моэете присоединится самому себе")


                } else {


                    var dialogFrag = MeetDetailsDialogFragment.newInstance(serializeToJson(mDataset.get(position)), type)
                    dialogFrag.show((mContext as AppCompatActivity).supportFragmentManager, "dialogFragmentChangePassword")


                }


            }


            if (mDataset?.get(position)?.user?.data?.isVip != null
                    && mDataset?.get(position)?.user?.data?.isVip!!) {
                holder.vip_IV?.visibility = View.VISIBLE;
            } else {
                holder.vip_IV?.visibility = View.GONE;
            }
            // mDataset?.get(position)?.


            //TODO:IF meet or plan is vip then vipIV visible
        }

    }

    fun changeBgOfBtn(btn_view: LinearLayout, isClicked: Boolean = false) {
        //if (isClicked)
            //btn_view.setBackgroundColor(getColorById(mContext!!, R.color.custom_dark_gray))
       // else
           // btn_view.setBackgroundColor(getColorById(mContext!!, R.color.white))
    }

    override fun getItemCount(): Int {
        return mDataset?.size!!
    }

    object selectedItemsObj {
        var selectedItems: MutableList<Int>? = ArrayList<Int>()
    }

}
/**
 * Created by User on 28.02.2017.
 */
