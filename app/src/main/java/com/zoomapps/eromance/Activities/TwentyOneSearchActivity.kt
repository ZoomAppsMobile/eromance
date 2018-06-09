package com.zoomapps.eromance.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.*

import com.appyvet.rangebar.RangeBar
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.Helpers.TwentyOneSearchPresenter
import com.zoomapps.eromance.Interfaces.ITwentyOneSendRequestView
import com.zoomapps.eromance.R

import java.util.ArrayList

import fr.ganfra.materialspinner.MaterialSpinner
import kotterknife.bindView


class TwentyOneSearchActivity : AppCompatActivity(),ITwentyOneSendRequestView {
    override fun onRequestSendSuccessfully() {
        Toast.makeText(this,getString(R.string.send_request),Toast.LENGTH_LONG).show()
        finish()
    }

    override fun onRequestSendError(err_msg: String?) {
        showToast(this,getString(R.string.error));
        finish()
    }

    internal var arrayMsAppearence: ArrayAdapter<Int>?=null
    internal var arrayMsSex: ArrayAdapter<Int>?=null
    internal val mMsAppearence: MaterialSpinner by bindView(R.id.msAppearence)
    internal val mMsSex: MaterialSpinner by bindView(R.id.msSex)
    internal val mRangebar: RangeBar by bindView(R.id.rangebar)
    internal val tvTickStart: TextView by bindView(R.id.tv_tick_start)
    internal val tvTickEnd: TextView by bindView(R.id.tv_tick_end)
    val btn_cancel : Button by  bindView(R.id.btn_cancel)
    val btn_sell_request : Button by bindView(R.id.btn_sell_request)
    val presenter = TwentyOneSearchPresenter(this,this)

    val cb_delicate_conversation : CheckBox by bindView(R.id.cb_delicate_conversation)
    val cb_strep_dance :CheckBox by bindView(R.id.cb_strep_dance)
    val cb_accompanying_escord :CheckBox by bindView(R.id.cb_accompanying_escord)
    val cb_professional_massage :CheckBox by bindView(R.id.cb_professional_massage)
    val request_description_ED : EditText by bindView(R.id.request_description_ED)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_21_search)
        initRangeBar()
        spinnerListHint()
        btn_cancel.setOnClickListener {
            finish()
        }
        btn_sell_request.setOnClickListener {
            var desiredServices = getCheckedItems()
            presenter.sendRequset(desiredServices,request_description_ED?.text.toString())
        }
    }
    private fun getCheckedItems():List<Int>{
        var list = ArrayList<Int>()
        if(cb_delicate_conversation.isChecked){
            list.add(1)
        }
        if(cb_strep_dance.isChecked){
            list.add(2)
        }
        if(cb_accompanying_escord.isChecked){
            list.add(3)
        }
        if(cb_professional_massage.isChecked){
            list.add(4)
        }
        return list;
    }

    private fun initRangeBar() {
        mRangebar.setOnRangeBarChangeListener { rangeBar, leftPinIndex, rightPinIndex, leftPinValue, rightPinValue ->
            tvTickStart.text = leftPinValue
            tvTickEnd.text = rightPinValue
        }
    }

    private fun spinnerListHint() {
//        arrayMsSex = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, list)
//        arrayMsSex!!.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        mMsAppearence.adapter = arrayMsSex
//        mMsAppearence.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
//                if (position != -1) {
//                    val selected = Integer.parseInt(mMsAppearence.getItemAtPosition(position).toString())
//                    if (selected % 2 == 0) {
//                        mMsAppearence.error = "error"
//                    }
//                }
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>) {
//
//            }
//
//        }
//        arrayMsAppearence = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, list)
//        mMsSex.adapter = arrayMsAppearence
//        mMsSex.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
//                if (position != -1) {
//                    val selected = Integer.parseInt(mMsSex.getItemAtPosition(position).toString())
//                    if (selected % 2 == 0) {
//                        mMsSex.error = "error"
//                    }
//                }
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>) {
//
//            }
//
//        }


    }

}
