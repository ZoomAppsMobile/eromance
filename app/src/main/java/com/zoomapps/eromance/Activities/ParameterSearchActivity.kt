package com.zoomapps.eromance.Activities


import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Build
import android.os.Bundle

import android.os.Handler
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.TimePicker

import com.zoomapps.eromance.R
import kotterknife.bindView

import java.util.Calendar
import java.util.Date


class ParameterSearchActivity : AppCompatActivity() {

    internal var timePickerDialog: TimePickerDialog ?=null
    internal val Ll_date_meeting: LinearLayout by bindView(R.id.Ll_date_meseting)
  //  internal val Ll_time_meeting: LinearLayout by bindView(R.id.Ll_time_meeting)
    internal val drawer_layout: DrawerLayout by bindView(R.id.drawer_layout)
    internal val expandable_layout: LinearLayout by bindView(R.id.expandable_layout)
    internal val btnOpenDrawer: RelativeLayout by bindView(R.id.btnOpenDrawer)
    internal val expand_button: LinearLayout by bindView(R.id.expand_button)
    internal var date: Date ?=null

    internal var menu_btn_sbsed = false
    internal var isOpen = false
    internal val tv_plan_na_vecher: TextView by bindView(R.id.tv_plan_na_vecher)
    internal val tv_currentTimeFrom: TextView by bindView(R.id.tv_currentTimeFrom)
    internal val tv_currentDateFrom: TextView by bindView(R.id.tv_currentDateFrom)
    internal val tv_currentDateBefore: TextView by bindView(R.id.tv_currentDateBefore)
    internal val tv_currentTimeBefore: TextView by bindView(R.id.tv_currentTimeBefore)
    internal var calendar: Calendar?=null
    internal var hourDay = 1
    internal var min = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parameter_search)
        calendar = Calendar.getInstance()
        date = Date()


        runExpandableLayout()
        textGradient()
        initButtonToolbar()
        startDatePicker()
        startTimePicker()
    }

    private fun runExpandableLayout() {
        expandable_layout.visibility = View.GONE
        expand_button.setOnClickListener { v ->
            val btn_arrow_top = findViewById<Button>(R.id.btn_arrow_top) as Button
            val btn_arrow_bot = findViewById<Button>(R.id.btn_arrow_bot) as Button
            if (v.id == R.id.expand_button) {
                if (!isOpen) {
                    isOpen = true
                    expandable_layout.visibility = View.VISIBLE
                    run {
                        btn_arrow_top.visibility = View.VISIBLE
                        btn_arrow_bot.visibility = View.INVISIBLE
                    }
                } else {
                    isOpen = false
                    expandable_layout.visibility = View.GONE
                    run {
                        btn_arrow_top.visibility = View.INVISIBLE
                        btn_arrow_bot.visibility = View.VISIBLE
                    }
                }
            }
        }


    }

    fun getColorById(id: Int): Int {
        val version = Build.VERSION.SDK_INT
        if (version >= 23) {
            return ContextCompat.getColor(this, id)
        } else {
            return resources.getColor(id)
        }
    }

    //@RequiresApi(api = Build.VERSION_CODES.M)
    private fun textGradient() {
        tv_plan_na_vecher.measure(0, 0)       //must call measure!
        val x_end = tv_plan_na_vecher.measuredWidth.toFloat()  //get width
        val y_end = tv_plan_na_vecher.measuredHeight.toFloat() //get height
        val test = tv_plan_na_vecher.width
        val textShader = LinearGradient(0f, 0f, 0f, y_end,
                intArrayOf(getColorById(R.color.golden_gradient3), getColorById(R.color.golden_gradient4), getColorById(R.color.golden_gradient3)),
                floatArrayOf(0.43f, 0.65f, 0.75f),
                Shader.TileMode.MIRROR)

        tv_plan_na_vecher.paint.shader = textShader
    }


    private fun initButtonToolbar() {

        if (!menu_btn_sbsed) {
            menu_btn_sbsed = true
            btnOpenDrawer.setOnClickListener { drawer_layout.openDrawer(GravityCompat.START) }
        }
    }

    private fun startDatePicker() {
        Ll_date_meeting.setOnClickListener {
            datePickerDialogFrom()
            Ll_date_meeting.isClickable = false
        }
    }

    private fun startTimePicker() {
        /*Ll_time_meeting.setOnClickListener {
            timePickerDialogFrom()
            Ll_date_meeting.isClickable = false
        }*/
    }

    private fun datePickerDialogFrom() {
        val mYear = calendar!!.get(Calendar.YEAR)
        val mMonth = calendar!!.get(Calendar.MONTH)
        val mDay = calendar!!.get(Calendar.DAY_OF_MONTH)
        val mdatePickerListenerFrom = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            tv_currentDateFrom.text = dayOfMonth.toString() + "-" + (month + 1).toString() + "-" + year
            Handler().postDelayed({
                datePickerDialogBefore()
                Ll_date_meeting.isClickable = true
            }, 1000)
        }
        DatePickerDialog(this, mdatePickerListenerFrom, mYear, mMonth, mDay).show()
    }

    private fun datePickerDialogBefore() {
        val mYear = calendar!!.get(Calendar.YEAR)
        val mMonth = calendar!!.get(Calendar.MONTH)
        val mDay = calendar!!.get(Calendar.DAY_OF_MONTH)
        val mdatePickerListenerBefore = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            tv_currentDateBefore.text = dayOfMonth.toString() + "-" + (month + 1) + "-" + year
        }
        DatePickerDialog(this, mdatePickerListenerBefore, mYear, mMonth, mDay).show()


    }

    private fun timePickerDialogFrom() {
        val hour = calendar!!.get(Calendar.HOUR_OF_DAY)
        val minute = calendar!!.get(Calendar.MINUTE)

        timePickerDialog = TimePickerDialog(this@ParameterSearchActivity, TimePickerDialog.OnTimeSetListener { timePicker, selectedHour, selectedMinute ->
            tv_currentTimeFrom.text = selectedHour.toString() + ":" + selectedMinute
            Handler().postDelayed({
                timePickerDialogBefore()
              //  Ll_time_meeting.isClickable = true
            }, 1000)
        }, hour, minute, true)//Yes 24 hour time
        timePickerDialog!!.show()
    }

    private fun timePickerDialogBefore() {
        val hour = calendar!!.get(Calendar.HOUR_OF_DAY)
        val minute = calendar!!.get(Calendar.MINUTE)

        timePickerDialog = TimePickerDialog(this@ParameterSearchActivity, TimePickerDialog.OnTimeSetListener { timePicker, selectedHour, selectedMinute -> tv_currentTimeBefore.text = selectedHour.toString() + ":" + selectedMinute }, hour, minute, true)//Yes 24 hour time
        timePickerDialog!!.show()
    }
}
