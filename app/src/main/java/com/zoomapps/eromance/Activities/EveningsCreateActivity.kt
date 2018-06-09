package com.zoomapps.eromance.Activities

import android.app.DatePickerDialog
import android.app.ProgressDialog
import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Adapters.SearchParamsAdapter
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Helpers.DB_Helper
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.meetTypes_LIST
import com.zoomapps.eromance.Interfaces.TypesAdapterInteraction
import com.zoomapps.eromance.Models.*
import com.zoomapps.eromance.R
import io.realm.Realm
import kotterknife.bindView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import java.text.SimpleDateFormat




class EveningsCreateActivity : BaseCreateActivity(),
        RadioGroup.OnCheckedChangeListener,
        View.OnClickListener,
        DatePickerDialog.OnDateSetListener,TimePickerDialog.OnTimeSetListener , TypesAdapterInteraction
{
    override fun addType(pos: Int) {
        val type_id = adapterData.get(pos).id!!
        clickedTypesList.add(type_id)
    }

    override fun checkType(pos: Int): Boolean {
        val type_id = adapterData.get(pos).id!!
        return  clickedTypesList.contains(type_id)
    }

    override fun removeType(pos: Int) {
        val type_id = adapterData.get(pos).id!!
        clickedTypesList.remove(type_id)
    }


    var clickedTypesList = ArrayList<Int>()

    override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {
        when(clickedType)
        {
            "from"->
            {
                dateFromCalendar?.set(Calendar.HOUR_OF_DAY, p1);
                dateFromCalendar?.set(Calendar.MINUTE, p2);
                updateLabel("from");
            }
            "to"->
            {
                dateToCalendar?.set(Calendar.HOUR_OF_DAY, p1);
                dateToCalendar?.set(Calendar.MINUTE, p2);
                updateLabel("to");
            }
        }
    }
    fun showTimePicker(type:String)
    {
        when(type)
        {
            "from"->
            {
                TimePickerDialog(this,this,dateFromCalendar?.get(Calendar.HOUR_OF_DAY)!!,
                        dateFromCalendar?.get(Calendar.MINUTE)!!,true).show();

            }
            "to"->{
                TimePickerDialog(this,this,dateToCalendar?.get(Calendar.HOUR_OF_DAY)!!,
                        dateToCalendar?.get(Calendar.MINUTE)!!,true).show();
            }
        }
    }
    override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int)
    {
        when(clickedType)
        {
            "from"->
            {
                dateFromCalendar?.set(Calendar.YEAR, p1);
                dateFromCalendar?.set(Calendar.MONTH, p2);
                dateFromCalendar?.set(Calendar.DAY_OF_MONTH, p3);
              }
            "to"->
            {
                dateToCalendar?.set(Calendar.YEAR, p1);
                dateToCalendar?.set(Calendar.MONTH, p2);
                dateToCalendar?.set(Calendar.DAY_OF_MONTH, p3);
            }
        }
        showTimePicker(clickedType)
    }

    fun updateLabel(time_type:String)
    {
        val myFormat = "yyyy-MM-dd HH:mm:ss" //In which you need put here
        val sdf = SimpleDateFormat(myFormat, Locale.US)
        when(time_type){
            "from"->{
                var str_date  = sdf.format(dateFromCalendar?.time);
                var splited_date = str_date.split(" ");
                from_date_tv.text = splited_date[0].toString()
                from_time_tv.text = splited_date[1].toString()
            }
            "to"->{
                var str_date  = sdf.format(dateToCalendar?.time);
                var splited_date = str_date.split(" ");
                to_date_tv.text = splited_date[0].toString()
                to_time_tv.text = splited_date[1].toString()
            }
        }
    }

    private fun cvtToGmt(date: Date): Date {
        val tz = TimeZone.getDefault()
        var ret = Date(date.time - tz.rawOffset)

        // if we are now in DST, back off by the delta.  Note that we are checking the GMT date, this is the KEY.
        if (tz.inDaylightTime(ret)) {
            val dstDate = Date(ret.time - tz.dstSavings)

            // check to make sure we have not crossed back into standard time
            // this happens when we are on the cusp of DST (7pm the day before the change for PDT)
            if (tz.inDaylightTime(dstDate)) {
                ret = dstDate
            }
        }
        return ret
    }

    var clickedType : String = ""
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.tv_currentDateFrom->
            {
                clickedType = "from"
                DatePickerDialog(this@EveningsCreateActivity, this,
                        dateFromCalendar?.get(Calendar.YEAR)!!,
                        dateFromCalendar?.get(Calendar.MONTH)!!,
                        dateFromCalendar?.get(Calendar.DAY_OF_MONTH)!!).show()
            }
            R.id.tv_currentDateBefore->
            {
                clickedType = "to"
                DatePickerDialog(this@EveningsCreateActivity, this,
                        dateToCalendar?.get(Calendar.YEAR)!!,
                        dateToCalendar?.get(Calendar.MONTH)!!,
                        dateToCalendar?.get(Calendar.DAY_OF_MONTH)!!).show()
            }
            R.id.tv_currentTimeFrom->{
                clickedType = "from"
                showTimePicker(clickedType)
            }
            R.id.tv_currentTimeBefore->{
                clickedType = "to"
                showTimePicker(clickedType)
            }
            //TODO:ADD Time click
        }

    }
    var dateFromCalendar : Calendar?=null
    var dateToCalendar : Calendar?=null

    override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
        if(p0?.id == R.id.item_payment_type_RG){
            processPaymentRG(p1)
        }
    }
    fun processPaymentRG(id:Int){
        when(id){
            R.id.fifty_RB->{
                checkedPayment = 1
            }
            R.id.forMe_RB->{
                checkedPayment = 2
            }
            R.id.forYou_RB->{
                checkedPayment = 3
            }
//            R.id.not_alone_RB->{
//                checkedPayment = 4
//            }
        }
    }

    val to_date_tv : TextView by bindView(R.id.tv_currentDateBefore)
    val to_time_tv : TextView by bindView(R.id.tv_currentTimeBefore)
    val from_date_tv : TextView by bindView(R.id.tv_currentDateFrom)
    val from_time_tv : TextView by bindView(R.id.tv_currentTimeFrom)

    val item_payment_type_RG : RadioGroup by bindView(R.id.item_payment_type_RG)
    val search_params_RV : RecyclerView by bindView(R.id.search_params_RV)
    val duration_container : LinearLayout by bindView(R.id.duration_container)
    val btn_create : Button by bindView(R.id.btn_create)
    val dateFrom_LL : LinearLayout by bindView(R.id.dateFrom_LL)
    val dateTo_LL : LinearLayout by bindView(R.id.dateTo_LL)
    var checkedPayment = 0
    var checkedTime = 0
    var loading_PD : ProgressDialog?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_evenings_create)
        mContext = this
        selectedUser_TV = findViewById<TextView>(R.id.selectedUser_TV)
        setToolbar(this ,
                "Планы",
                findViewById<TextView>(R.id.tv_map),
                findViewById<ImageView>(R.id.custom_toolbar_home_btn)  ,
                true)
        io.realm.Realm.init(this);
        var realm = Realm.getDefaultInstance()
        loading_PD = ProgressDialog(this)
        loading_PD?.setMessage(getString(R.string.go_upload))
        btn_create.setOnClickListener {
            if(checkFields()){
                sendRequest()
              /*  for(tmp in SearchParamsAdapter.selectedItemsObj.selectedItems?.toList()!!){
                    list.add(tmp)
                }
                sendRequest(checkedTime.toString(),checkedPayment.toString(), list)*/
            }
        }
        item_payment_type_RG.setOnCheckedChangeListener(this)
        init_params_RV(DB_Helper.mapEveningToSimple(DB_Helper.getEveningsTypes(realm)!!));
        init_date_clicks();

//        findViewById(R.id.not_alone_RB).setOnClickListener {
//            notAloneRB_Clicked()
//        }
        (findViewById<CheckBox>(R.id.not_alone_CB)).setOnCheckedChangeListener { compoundButton, b ->
            if(b){
                notAloneRB_Clicked()
                if(checkedPayment==0)
                    checkedPayment = 4
            }
            else{
                notAloneUnChecked()
                if(checkedPayment==4)
                    checkedPayment=0
            }
        }
        selectedUser_TV.setOnClickListener {
            onSelectedUserTV_Click()
        }
    }

    fun init_date_clicks(){
        dateFromCalendar =Calendar.getInstance()
        dateToCalendar =Calendar.getInstance()
        from_date_tv.setOnClickListener(this)
        from_time_tv.setOnClickListener(this)
        to_date_tv.setOnClickListener(this)
        to_time_tv.setOnClickListener(this)
        updateLabel("from")
        updateLabel("to")
    }
    fun checkFields():Boolean{
        if(checkedPayment!=0 && dateFromCalendar!=null && dateToCalendar!=null )     //&& clickedTypesList.isNotEmpty()
        {

            return true
        }
        showPreparedToast(this,"Fields")
        return false
    }


    fun sendRequest( ){
        loading_PD?.show()

        clickedTypesList.add(1)

        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val formattedFrom = sdf.format(dateFromCalendar?.getTime())
        val formattedTo = sdf.format(dateToCalendar?.getTime())
//        if(checkedPayment!=4){
//            selectedUser_ID = null
//        }
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        var call : Call<EveningsModel.EveningCreateResponse>
        if(selectedUser_ID!=null)
             call = apiService.postEvening(clickedTypesList,
                checkedPayment.toString(),
                formattedFrom,formattedTo,
                GlobalStaticVariables.myId.toString(), selectedUser_ID.toString())
        else
            call = apiService.postEvening(clickedTypesList,
                    checkedPayment.toString(),
                    formattedFrom,formattedTo,
                    GlobalStaticVariables.myId.toString())
        call.enqueue(object : Callback<EveningsModel.EveningCreateResponse> {
            override fun onResponse(call: Call<EveningsModel.EveningCreateResponse>,
                                    response: Response<EveningsModel.EveningCreateResponse>) {
                loading_PD?.cancel()
                val mainPageDataList = response.body().data
                if(mainPageDataList != null&& response.body().code==1 ) {
                    val statusCode = response.code()
                    var listData =  mainPageDataList;
                    showPreparedToast(this@EveningsCreateActivity,getString(R.string.success));
                    finish()
                }
                else if(response.body().code==303){
                    Toast.makeText(this@EveningsCreateActivity,getString(R.string.error), Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(this@EveningsCreateActivity,getString(R.string.error), Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<EveningsModel.EveningCreateResponse>, t: Throwable) {
                loading_PD?.cancel()
                // Log error here since request failed
                Toast.makeText(this@EveningsCreateActivity,getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })
    }
    var adapterData = ArrayList<SimpleTypeDatum>()
    private var mAdapter: RecyclerView.Adapter<*>? = null
    fun init_params_RV(item_list:List<SimpleTypeDatum>){
        adapterData.clear()
        adapterData.addAll(item_list)
        var  mLayoutManager = LinearLayoutManager(this@EveningsCreateActivity)
        search_params_RV!!.layoutManager = mLayoutManager
        mAdapter = SearchParamsAdapter(item_list,this)
        search_params_RV!!.adapter = mAdapter
    }
}
