package com.zoomapps.eromance.DialogFragment

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.zoomapps.eromance.Adapters.MeetTypesAdapter
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.Helpers.MeetDetailsPresenter
import com.zoomapps.eromance.Helpers.NotificationMeetDetailsPresenter
import com.zoomapps.eromance.Interfaces.IMeetDetailsView
import com.zoomapps.eromance.Interfaces.IMeetNotificationDetailsView
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.MeetsModel
import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView
import net.cachapa.expandablelayout.ExpandableLayout
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by User on 14.09.2017.
 */
class MeetNotificationDetailsDialog  : BaseDialogFragment() , IMeetNotificationDetailsView {
    override fun close() {
        close()
    }

    override fun onLoadMeetData(_meetData: MeetsModel.Datum?) {
        setViewData(_meetData);
    }

    override fun onLoadDesiredUserData(_userData: LoginModel.Datum?) {
        setDesiredUserData(_userData)
    }

    override fun onAcceptedUserToMeet() {
        send_btn.isClickable = true
        send_btn.setText(getString(R.string.decline))
        send_btn.setTextColor(getColorById(this!!.activity!!, R.color.golden))
        send_btn.setBackgroundColor(getColorById(this!!.activity!!, R.color.white))
    }

    override fun onDeclinedUserFromMeet() {
        send_btn.isClickable = true
        send_btn.setText(getString(R.string.accept))
        send_btn.setTextColor(getColorById(this!!.activity!!, R.color.white))
        send_btn.setBackgroundColor(getColorById(this!!.activity!!, R.color.golden))
    }

    override fun onShowToast(message: String) {
        showToast(this!!.context!!,message);
    }


    override fun onRequestError() {
        send_btn.isClickable = true
        onShowToast(getString(R.string.error_request))
    }

    lateinit var title_TV : TextView;
    lateinit var content_LL : LinearLayout;
    lateinit var user_avatar_CIV : CircleImageView;
    lateinit var username_TV : TextView;
    lateinit var user_rating_IV : ImageView;
    lateinit var is_vip_IV : ImageView;
    lateinit var additional_LL : LinearLayout;
    lateinit var meets_list_RV : RecyclerView;
    lateinit var be_with_LL : RelativeLayout;
    lateinit var be_with_TV : TextView;
    lateinit var be_with_avatar_CIV : CircleImageView;
    lateinit var be_with_username_TV : TextView;
    lateinit var payment_type_TV : TextView
    lateinit var left_time_TV : TextView
    lateinit var cancel_btn : Button;
    lateinit var send_btn : Button;
    lateinit var presenter: NotificationMeetDetailsPresenter;

    private val interaction_ID: String
        get() = arguments!!.getString(ARG_PARAM1)
    private val desiredToConnectUserId: String
        get() = arguments!!.getString(ARG_PARAM2)
    private val entityClass: String
        get() = arguments!!.getString(ARG_PARAM3)

    private var details : MeetsModel.Datum ?=null

//    private fun getDetailsInfo() : MeetsModel.Datum{
//        if(details==null) {
//            if(arguments.getString(ARG_PARAM1)==null || arguments.getString(ARG_PARAM1).isEmpty()) {
//                dismiss();
//                showPreparedToast(activity,"Error")
//                return MeetsModel().Datum();
//            }
//            details = deSerializeToJson(arguments.getString(ARG_PARAM1), MeetsModel.Datum::class.java)
//        }
//        return details!!;
//    }

    var defaultClickAction = object: View.OnClickListener{
        override fun onClick(p0: View?) {
            dismiss();
        }
    }

    fun initViews(v: View?){
        title_TV =  v?.findViewById<TextView>(R.id.title_TV) as TextView;
        content_LL =  v?.findViewById<LinearLayout>(R.id.content_LL) as LinearLayout;
        user_avatar_CIV =  v?.findViewById<CircleImageView>(R.id.user_avatar_CIV) as CircleImageView;
        username_TV =  v?.findViewById<TextView>(R.id.username_TV) as TextView;
        user_rating_IV =  v?.findViewById<ImageView>(R.id.user_rating_IV) as ImageView;
        is_vip_IV =  v?.findViewById<ImageView>(R.id.is_vip_IV) as ImageView;
        additional_LL =  v?.findViewById<LinearLayout>(R.id.additional_LL) as LinearLayout;
        meets_list_RV =  v?.findViewById<RelativeLayout>(R.id.meets_list_RV) as RecyclerView;
        be_with_LL =  v?.findViewById<RelativeLayout>(R.id.be_with_LL) as RelativeLayout;
        be_with_TV =  v?.findViewById<TextView>(R.id.be_with_TV) as TextView;
        be_with_avatar_CIV =  v?.findViewById<CircleImageView>(R.id.be_with_avatar_CIV) as CircleImageView;
        be_with_username_TV =  v?.findViewById<TextView>(R.id.be_with_username_TV) as TextView;
        payment_type_TV = v?.findViewById<TextView>(R.id.payment_type_TV) as TextView;
        left_time_TV = v?.findViewById<TextView>(R.id.left_time_TV) as TextView;
        cancel_btn =  v?.findViewById<Button>(R.id.cancel_btn) as Button;
        send_btn =  v?.findViewById<Button>(R.id.send_btn) as Button;
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v = inflater?.inflate(R.layout.dialog_user_n_meet_details, null);
        //return super.onCreateView(inflater, container, savedInstanceState)
        removeTitle()
        initViews(v);
        title_TV.setText(getString(R.string.detail));
        val expand_text = v?.findViewById<TextView>(R.id.expand_button_TV) as TextView
        var expandableLayout = v?.findViewById<ExpandableLayout>(R.id.expandable_layout) as ExpandableLayout
        expand_text.setText(getString(R.string.uncover))
        v?.findViewById<LinearLayout>(R.id.expand_button_LL).setOnClickListener {
            if (expandableLayout.isExpanded) {
                expandableLayout.collapse()
                expand_text.setText(getString(R.string.uncover))
            } else {
                expandableLayout.expand()
                expand_text.setText(getString(R.string.hide))
            }
        }
        presenter = NotificationMeetDetailsPresenter(this,interaction_ID.toInt(),desiredToConnectUserId.toInt(),entityClass);
        send_btn.isClickable= false
        getData()
        return v
    }

    fun getData(){
        presenter.fetchDatum()
    }

    var mMeetDetails : MeetsModel.Datum?=null
    fun getDetailsInfo() : MeetsModel.Datum{
        return  mMeetDetails!!;
    }
    fun setDesiredUserData(userData: LoginModel.Datum?){
        username_TV.setText(userData?.profile?.data?.realName)
        loadImageToIV(this!!.activity!!, user_avatar_CIV,userData?.avatar);
        if(userData?.profile?.data?.rating!=null)
            setRating(this!!.activity!!, user_rating_IV, userData?.profile?.data?.rating!!);
        if(userData?.isVip!=null && userData?.isVip!!)
            is_vip_IV.visibility = View.VISIBLE
        else
            is_vip_IV.visibility = View.GONE
        username_TV.setOnClickListener {
            openUserProfile(this!!.activity!!,userData?.id?.toString()!!)
        }
    }

    fun setViewData(details: MeetsModel.Datum?){
        mMeetDetails = details;
        initRV()
        if(getDetailsInfo().joinedUserId!=null && getDetailsInfo().joined!=null) {
            be_with_LL.visibility = View.VISIBLE
            loadImageToIV(this!!.activity!!,be_with_avatar_CIV,getDetailsInfo().joined?.data?.avatar)
            be_with_username_TV.setText(getDetailsInfo().joined?.data?.profile?.data?.realName)
        }
        else{
            be_with_LL.visibility= View.GONE
        }
        setBtnActions()
        setDate()
    }

    val timeZone = TimeZone.getTimeZone("UTC")
    val cal_now =  Calendar.getInstance(timeZone)
    fun setDate(){
        payment_type_TV?.text = getPaymentValue(getDetailsInfo().paymentId)
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)
        // sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        var date = sdf.parse(getDetailsInfo().createdAt);
        if(getDetailsInfo().finishedAt!=null){
            date= sdf.parse(getDetailsInfo().finishedAt);
        }

        val cal = Calendar.getInstance()
        cal.setTime(date)// all done
        try {
            Log.e("Itm Date Before",cal.time.toString())
            if(getDetailsInfo().timeId!=null){
                cal.add(Calendar.HOUR_OF_DAY ,getDetailsInfo()?.timeId!!)
            }

            Log.e("My Date",cal_now.time.toString())
            Log.e("Itm Date",cal.time.toString())

            var dateDiff =  printDifference(cal_now,cal).split('-');
            try{
                left_time_TV.setText(String.format("%s дней и %s часов",dateDiff[0], dateDiff[2]))
            }
            catch(ex:IndexOutOfBoundsException) {
            }
        }
        catch (e: ParseException) { }
    }

    fun setBtnActions(){
        be_with_LL.setOnClickListener {
            if(getDetailsInfo().joinedUserId!=null)
                openUserProfile(this!!.activity!!,getDetailsInfo().joinedUserId?.toString()!!)
        }

        send_btn.setOnClickListener{
            send_btn.isClickable = false
            presenter.makeAction()
//            (view as DialogFragmentInteraction).onOkPressed();
            //dismiss()
        }

        cancel_btn.setOnClickListener (defaultClickAction)
    }

    fun initRV(){
        meets_list_RV.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL,false)
        if(getDetailsInfo().types?.data!=null)
            meets_list_RV.adapter = MeetTypesAdapter(getDetailsInfo().types?.data!!, activity)
    }

    companion object {
        private val ARG_PARAM1 = "interaction_id"
        private val ARG_PARAM2 = "desiredToConnectUserId"
        private val ARG_PARAM3 = "entityClass"

        fun newInstance(interaction_id:String?,desiredToConnectUserId:String? , entityClass:String?) : MeetNotificationDetailsDialog{
            val fragment = MeetNotificationDetailsDialog()
            val args = Bundle()
            args.putString(ARG_PARAM1, interaction_id)
            args.putString(ARG_PARAM2, desiredToConnectUserId)
            args.putString(ARG_PARAM3, entityClass)

            fragment.arguments = args
            return fragment
        }
    }

    override fun onDestroy() {
        try{
            presenter.isDialogDestroyed = true
        }
        catch(ex: UninitializedPropertyAccessException ){

        }
        super.onDestroy()
    }
}