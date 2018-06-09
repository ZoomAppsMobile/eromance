package com.zoomapps.eromance.DialogFragment

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.bumptech.glide.Glide
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.Activities.UserProfileActivity
import com.zoomapps.eromance.Adapters.MeetTypesAdapter
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.MeetDetailsPresenter
import com.zoomapps.eromance.Helpers.MeetDetailsPresenter2
import com.zoomapps.eromance.Helpers.OpenTypesBy
import com.zoomapps.eromance.Interfaces.IMeetDetailsView
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.ConnectedToMeetResponse
import com.zoomapps.eromance.Models.MeetsModel
import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView
import retrofit2.Call
import retrofit2.Response
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by User on 12.09.2017.
 */
class MeetDetailsDialogFragment2 : BaseDialogFragment(), IMeetDetailsView {
    override fun onRequestError() {
        send_btn.isClickable = true
        onShowToast("Не удалось отправить запрос")
    }

    override fun onConnectedToMeet(isBlocked: Boolean?) {
        if (isBlocked == false) {
            send_btn.setText("Отсоединиться")
            send_btn.setTextColor(getColorById(this!!.activity!!, R.color.golden))
            send_btn.setBackgroundColor(getColorById(this!!.activity!!, R.color.white))
            send_btn.isClickable = true
        } else {
            send_btn.setText("Заблокировано")
            onShowToast("Вашу заявку отклонили")
            send_btn.setTextColor(getColorById(this!!.activity!!, R.color.white))
            send_btn.setBackgroundColor(getColorById(this!!.activity!!, R.color.custom_dark_gray))
            send_btn.isClickable = false
        }
    }

    override fun onUnconnectedToMeet() {
        send_btn.setText("Присоединиться")
        send_btn.setTextColor(getColorById(this!!.activity!!, R.color.white))
        send_btn.setBackgroundColor(getColorById(this!!.activity!!, R.color.golden))
        send_btn.isClickable = true
    }

    override fun onShowToast(message: String?) {
        showToast(this!!.context!!, message);
    }

    lateinit var title_TV: TextView;
    var responsef = null;
    lateinit var content_LL: LinearLayout;
    lateinit var user_avatar_CIV: CircleImageView;
    lateinit var username_TV: TextView;
    lateinit var user_rating_IV: ImageView;
    lateinit var is_vip_IV: ImageView;
    lateinit var additional_LL: LinearLayout;
    lateinit var meets_list_RV: RecyclerView;
    lateinit var be_with_LL: RelativeLayout;
    lateinit var be_with_TV: TextView;
    lateinit var be_with_avatar_CIV: CircleImageView;
    lateinit var be_with_username_TV: TextView;
    lateinit var payment_type_TV: TextView
    lateinit var left_time_TV: TextView
    lateinit var cancel_btn: Button;
    lateinit var send_btn: Button;
    lateinit var dynamic_user_meet: LinearLayout
    lateinit var presenter: MeetDetailsPresenter2;
    private val detailsData: MeetsModel.Datum
        get() = getDetailsInfo()

    private var details: MeetsModel.Datum? = null

    private fun getDetailsInfo(): MeetsModel.Datum {
        if (details == null) {
            if (arguments!!.getString(ARG_PARAM1) == null || arguments!!.getString(ARG_PARAM1).isEmpty()) {
                dismiss();
                showPreparedToast(this!!.activity!!, "success_evening")
                return MeetsModel().Datum();
            }
            details = deSerializeToJson(arguments!!.getString(ARG_PARAM1), MeetsModel.Datum::class.java)
        }
        return details!!;
    }

    private val type: String?
        get() = arguments!!.getString(ARG_PARAM2)


    var defaultClickAction = object : View.OnClickListener {
        override fun onClick(p0: View?) {
            dismiss();
        }
    }

    fun initViews(v: View?) {
        title_TV = v?.findViewById<TextView>(R.id.title_TV) as TextView;
        content_LL = v?.findViewById<LinearLayout>(R.id.content_LL) as LinearLayout;
        user_avatar_CIV = v?.findViewById<CircleImageView>(R.id.user_avatar_CIV) as CircleImageView;
        username_TV = v?.findViewById<TextView>(R.id.username_TV) as TextView;
        user_rating_IV = v?.findViewById<ImageView>(R.id.user_rating_IV) as ImageView;
        is_vip_IV = v?.findViewById<ImageView>(R.id.is_vip_IV) as ImageView;
        additional_LL = v?.findViewById<LinearLayout>(R.id.additional_LL) as LinearLayout;
        meets_list_RV = v?.findViewById<RecyclerView>(R.id.meets_list_RV) as RecyclerView;
        be_with_LL = v?.findViewById<RelativeLayout>(R.id.be_with_LL) as RelativeLayout;
        be_with_TV = v?.findViewById<TextView>(R.id.be_with_TV) as TextView;
        be_with_avatar_CIV = v?.findViewById<CircleImageView>(R.id.be_with_avatar_CIV) as CircleImageView;
        be_with_username_TV = v?.findViewById<TextView>(R.id.be_with_username_TV) as TextView;
        payment_type_TV = v?.findViewById<TextView>(R.id.payment_type_TV) as TextView;
        left_time_TV = v?.findViewById<TextView>(R.id.left_time_TV) as TextView;
        cancel_btn = v?.findViewById<Button>(R.id.cancel_btn) as Button;
        send_btn = v?.findViewById<Button>(R.id.send_btn) as Button;
        dynamic_user_meet = v.findViewById(R.id.dynamic_user_meet) as LinearLayout
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v = inflater?.inflate(R.layout.dialog_meet_details2, null);
        //return super.onCreateView(inflater, container, savedInstanceState)
        var call = API_Client.apiService!!.preSubscribe(GlobalStaticVariables.language_type!!,Server_Entities.Meet, getDetailsInfo().id!!)
        call.enqueue(object : retrofit2.Callback<ConnectedToMeetResponse> {
            override fun onResponse(_call: Call<ConnectedToMeetResponse>?, response: Response<ConnectedToMeetResponse>?) {
                if (response != null) {
                    var data = response?.body()?.data?.lastOrNull()
                    var responsef = response.body();
                    var i: Int = 0;
                    for (i in response.body().data!!.indices) {
                        var call = API_Client.apiService!!.getUserInfo(response.body().data!!.get(i).userId.toString(), "profile")
                        call.enqueue(object : retrofit2.Callback<LoginModel.Example> {
                            override fun onResponse(_call: Call<LoginModel.Example>?, response: Response<LoginModel.Example>?) {
                                if (response != null) {

                                    try {





                                    var data = response.body();
                                    var dinamic_user_meetlayout = LayoutInflater.from(context).inflate(R.layout.dinamic_user_meetlayout, null)
                                    // var dinamic_user_meetlayout = inflater?.inflate(R.layout.dinamic_user_meetlayout, null, false);
                                    val username_TV_subckribe = dinamic_user_meetlayout.findViewById(R.id.username_TV_subckribe) as TextView
                                    val user_avatar_subckribe = dinamic_user_meetlayout.findViewById(R.id.user_avatar_subckribe) as CircleImageView

                                    username_TV_subckribe?.setText(data.data?.username)
                                    Glide.with(context).load(GlobalVariables.server_url + data.data?.avatar).into(user_avatar_subckribe)
                                    //user_avatar_subckribe.setBackgroundResource(R.drawable.splash_logo);
                                    user_avatar_subckribe.setOnClickListener {
                                        if (responsef.data!!.get(0).userId.toString() != null) {
                                            context?.startActivity(Intent(context!!, UserProfileActivity::class.java)
                                                    .putExtra("user_data",responsef.data!!.get(0).userId.toString())
                                                    .putExtra("open_type", OpenTypesBy.user_id));
                                        }
                                    };

                                    dynamic_user_meet.addView(dinamic_user_meetlayout)
                                    Log.e("data", "${responsef.data!!.size}")


                                    }catch (ex:Exception){

                                    }
                                }





                            }


                            override fun onFailure(_call: Call<LoginModel.Example>?, t: Throwable?) {
                                Log.e("data", t!!.message.toString())
                            }

                        })


                    }


                }
            }

            override fun onFailure(_call: Call<ConnectedToMeetResponse>?, t: Throwable?) {
                Log.e("data", t!!.message.toString())
            }

        })







        removeTitle()
        initViews(v);
        title_TV.setText("Детали встречи");
        setViewData();
        getIfUserConnected()
        return v
    }

    fun getIfUserConnected() {
        if (getDetailsInfo().id == null) {
            onShowToast("Не удалось получить данные")
            dismiss()
            return;
        }
        if (type == null) {
            dismiss()
            return;
        }
        presenter = MeetDetailsPresenter2(this, getDetailsInfo().id!!, type!!);
        send_btn.isClickable = false;
        presenter.checkConnection()
    }

    fun setViewData() {
        username_TV.setText(getDetailsInfo().user?.data?.profile?.data?.realName)
        loadImageToIV(this!!.activity!!, user_avatar_CIV, getDetailsInfo().user?.data?.avatar);
        if (getDetailsInfo().user?.data?.profile?.data?.rating != null)
            setRating(this!!.activity!!, user_rating_IV, getDetailsInfo().user?.data?.profile?.data?.rating!!);
        initRV()
        if (getDetailsInfo().user?.data?.isVip != null && getDetailsInfo().user?.data?.isVip!!)
            is_vip_IV.visibility = View.VISIBLE
        else
            is_vip_IV.visibility = View.GONE
        if (getDetailsInfo().joinedUserId != null && getDetailsInfo().joined != null) {
            be_with_LL.visibility = View.VISIBLE
            loadImageToIV(this!!.activity!!, be_with_avatar_CIV, getDetailsInfo().joined?.data?.avatar)
            be_with_username_TV.setText(getDetailsInfo().joined?.data?.profile?.data?.realName)
        } else {
            be_with_LL.visibility = View.GONE
        }
        setBtnActions()
        setDate()
    }

    val timeZone = TimeZone.getTimeZone("UTC")
    val cal_now = Calendar.getInstance(timeZone)
    fun setDate() {
        payment_type_TV?.text = getPaymentValue(getDetailsInfo().paymentId)
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)
        // sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        var date = sdf.parse(getDetailsInfo().createdAt);
        if (getDetailsInfo().finishedAt != null) {
            date = sdf.parse(getDetailsInfo().finishedAt);
        }

        val cal = Calendar.getInstance()
        cal.setTime(date)// all done
        try {
            Log.e("Itm Date Before", cal.time.toString())
            if (getDetailsInfo().timeId != null) {
                cal.add(Calendar.HOUR_OF_DAY, getDetailsInfo()?.timeId!!)
            }

            Log.e("My Date", cal_now.time.toString())
            Log.e("Itm Date", cal.time.toString())

            var dateDiff = printDifference(cal_now, cal).split('-');
            try {
                left_time_TV.setText(String.format("%s дней и %s часов", dateDiff[0], dateDiff[2]))
            } catch (ex: IndexOutOfBoundsException) {
            }
        } catch (e: ParseException) {
        }
    }

    fun setBtnActions() {
        be_with_LL.setOnClickListener {
            if (getDetailsInfo().joinedUserId != null)
                openUserProfile(this!!.activity!!, getDetailsInfo().joinedUserId?.toString()!!)
        }
        username_TV.setOnClickListener {
            openUserProfile(this!!.activity!!, getDetailsInfo().userId?.toString()!!)
        }

        send_btn.setOnClickListener {
            send_btn.isClickable = false
            presenter.makeAction()
//            (view as DialogFragmentInteraction).onOkPressed();
            //dismiss()
        }

        cancel_btn.setOnClickListener(defaultClickAction)
    }

    fun initRV() {
        if (activity == null)
            return
        meets_list_RV.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        if (getDetailsInfo().types?.data != null)
            meets_list_RV.adapter = MeetTypesAdapter(getDetailsInfo().types?.data!!, activity)
    }

    companion object {
        private val ARG_PARAM1 = "details"
        private val ARG_PARAM2 = "type"

        fun newInstance(details: String?, type: String?): MeetDetailsDialogFragment2 {
            val fragment = MeetDetailsDialogFragment2()
            val args = Bundle()
            args.putString(ARG_PARAM1, details)
            args.putString(ARG_PARAM2, type)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onDestroy() {
        try {
            presenter.isDialogDestroyed = true
        } catch (ex: UninitializedPropertyAccessException) {

        }
        super.onDestroy()
    }
}