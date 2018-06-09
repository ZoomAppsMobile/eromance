package com.zoomapps.eromance.Activities

import android.app.ProgressDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.*
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Adapters.SearchParamsAdapter
import com.zoomapps.eromance.Controllers.GlobalVariables
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Helpers.DB_Helper
import com.zoomapps.eromance.Helpers.DB_Helper.mapMeetToSimple
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.meetTypes_LIST
import com.zoomapps.eromance.Interfaces.TypesAdapterInteraction
import com.zoomapps.eromance.Models.DictionaryModel
import com.zoomapps.eromance.Models.MeetsModel
import com.zoomapps.eromance.Models.MeetTypesDatum
import com.zoomapps.eromance.Models.SimpleTypeDatum
import com.zoomapps.eromance.R
import io.realm.Realm
import kotterknife.bindView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import kotlin.collections.ArrayList


class CreateMeetActivity : BaseCreateActivity(), RadioGroup.OnCheckedChangeListener, TypesAdapterInteraction {
     var checkedTypes = ArrayList<Int>()
    //    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
//
//        if (requestCode == 1) {
//            if (resultCode == Activity.RESULT_OK) {
//                selectedUser_ID = data.getIntExtra("uid",-1)
//                val name = data.getStringExtra("name")
//                selectedUser_TV.visibility = View.VISIBLE
//                selectedUser_TV.text = "Отмечен: "+name
//            }
//            if (resultCode == Activity.RESULT_CANCELED) {
//                //Write your code if there's no result
//            }
//        }
//    }
    override fun onActivitySuccessResult() {
        mAdapter?.notifyDataSetChanged()
    }

    override fun removeType(pos: Int) {

        val type_id = adapterData.get(pos).id!!
        checkedTypes?.remove(type_id)

    }


    override fun addType(pos: Int) {
        val type_id = adapterData.get(pos).id!!
        checkedTypes?.add(type_id)

       // EventBus.getDefault().post(checkedTypes)

    }

    override fun checkType(pos: Int): Boolean {
        val type_id = adapterData.get(pos).id!!
        return checkedTypes?.contains(type_id)!!
    }

    override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
        if (p0?.id == R.id.item_payment_type_RG) {
            processPaymentRG(p1)
        } else if (p0?.id == R.id.duration_RG) {
            processDurationRG(p1)
        }
    }

    fun processPaymentRG(id: Int) {
        when (id) {
            R.id.fifty_RB -> {
                checkedPayment = 1
            }
            R.id.forMe_RB -> {
                checkedPayment = 2
            }
            R.id.forYou_RB -> {
                checkedPayment = 3
            }
//            R.id.not_alone_RB->{
//                checkedPayment = 4
//            }
        }
    }


    fun processDurationRG(id: Int) {
        when (id) {
            R.id.one_hour_RB -> {
                checkedTime = 1
            }
            R.id.two_hour_RB -> {
                checkedTime = 2
            }
        }
    }

    val item_payment_type_RG: RadioGroup by bindView(R.id.item_payment_type_RG)
    val search_params_RV: RecyclerView by bindView(R.id.search_params_RV)
    val duration_container: LinearLayout by bindView(R.id.duration_container)
    val duration_RG: RadioGroup by bindView(R.id.duration_RG)
    val btn_create: Button by bindView(R.id.btn_create)


    var checkedPayment = 0
    var checkedTime = 0
    var loading_PD: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_meet)
       // EventBus.getDefault().register(this);
        mContext = this
        selectedUser_TV = findViewById<TextView>(R.id.selectedUser_TV)
        setToolbar(this,
                getString(R.string.create),
                findViewById<TextView>(R.id.tv_map),
                findViewById<ImageView>(R.id.custom_toolbar_home_btn),
                true)
        io.realm.Realm.init(this);
        var realm = Realm.getDefaultInstance()
        loading_PD = ProgressDialog(this)
        loading_PD?.setMessage("Идет загрузка")
        btn_create.setOnClickListener {
            if (checkFields()) {

//                for (i in 0 until checkedTypes.size) {
//                       when(i){
//                           0-> addType(0)
//                           1-> addType(1)
//                           2-> addType(2)
//                           3-> addType(3)
//                           4-> addType(4)
//                           5-> addType(5)
//                       }
//                    Log.e("tps_id", "${i} : Результат");
//                }

               sendRequest(checkedTime.toString(), checkedPayment.toString(), checkedTypes!!)
           }
        }
        item_payment_type_RG.setOnCheckedChangeListener(this)
        duration_RG.setOnCheckedChangeListener(this)
        init_params_RV(mapMeetToSimple(DB_Helper.getMeetTypes(realm)!!));

        (findViewById<CheckBox>(R.id.not_alone_CB)).setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                notAloneRB_Clicked()
                if (checkedPayment == 0)
                    checkedPayment = 4
            } else {
                notAloneUnChecked()
                if (checkedPayment == 4)
                    checkedPayment = 0
            }
        }
        selectedUser_TV.setOnClickListener {
            onSelectedUserTV_Click()
        }
    }

    fun checkFields(): Boolean {
        if (checkedPayment != 0 && checkedTime != 0) {
            return true
        }
        showPreparedToast(this, "Fields")
        return false
    }

    fun sendRequest(tim: String, pid: String, tps_id: List<Int>) {
        loading_PD?.show()


//        if(pid.toInt()!=4){
//            selectedUser_ID = null
//        }
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        var call: Call<MeetsModel.MeetsCreateResponse>? = null
        if (selectedUser_ID != null) {
            call = apiService.postMeets(tim, pid, tps_id, GlobalStaticVariables.myId.toString(), joined_user_id = selectedUser_ID.toString())
        } else {
            call = apiService.postMeets(tim, pid, tps_id, GlobalStaticVariables.myId.toString())

        }

//        @Subscribe(threadMode = ThreadMode.MAIN)
//        fun onMessageEvent(messege : List<Int> ) {
//            Toast.makeText(this@CreateMeetActivity, messege.size.toString(), Toast.LENGTH_SHORT).show()
//        }

        call.enqueue(object : Callback<MeetsModel.MeetsCreateResponse> {
            override fun onResponse(call: Call<MeetsModel.MeetsCreateResponse>,
                                    response: Response<MeetsModel.MeetsCreateResponse>) {
                loading_PD?.cancel()
                val mainPageDataList = response.body().data
                if (mainPageDataList != null && response.body().code == 1) {
                    val statusCode = response.code()
                    var listData = mainPageDataList;
                    showPreparedToast(this@CreateMeetActivity, "Success");
                    finish()
                } else if (response.body().code == 303) {
                    Toast.makeText(this@CreateMeetActivity, getString(R.string.error), Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this@CreateMeetActivity, getString(R.string.error), Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<MeetsModel.MeetsCreateResponse>, t: Throwable) {
                loading_PD?.cancel()
                // Log error here since request failed
                Toast.makeText(this@CreateMeetActivity, getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })
    }

    private var mAdapter: RecyclerView.Adapter<*>? = null
    var isStoped = false
//    override fun onResume() {
//        super.onResume()
//        if(mAdapter!=null &&isStoped)
//            mAdapter?.notifyDataSetChanged()
//    }

    override fun onStop() {
        super.onStop()
        isStoped = true
    }

    var adapterData = ArrayList<SimpleTypeDatum>()
    fun init_params_RV(item_list: List<SimpleTypeDatum>) {
        adapterData.clear()
        adapterData.addAll(item_list)
        var mLayoutManager = LinearLayoutManager(this@CreateMeetActivity)
        search_params_RV!!.layoutManager = mLayoutManager
        mAdapter = SearchParamsAdapter(item_list, this)
        search_params_RV!!.adapter = mAdapter
    }

    override fun onDestroy() {
        super.onDestroy()
        //EventBus.getDefault().unregister(this);
    }
}