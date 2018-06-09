package com.zoomapps.eromance.Helpers

import android.content.Context
import android.util.Log
import com.zoomapps.eromance.R
import java.text.SimpleDateFormat
import java.util.*



/**
 * Created by User on 19.06.2017.
 */
open class MyCustomDate(val str_Date:String){
    var elapsedYears :Int?=null
    var elapsedMonth :Int?=null
    var elapsedDays :Long?=null ;
    var elapsedHours:Long?=null ;
    var elapsedMinutes:Long?=null ;
    var elapsedSeconds:Long?=null ;





    init {
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)

        val date = sdf.parse(str_Date)//toUTC(sdf.parse(str_Date))

        val cal = Calendar.getInstance()
        cal.setTime(date)// all done
        val cal_now = Calendar.getInstance()
        elapsedYears = cal_now.get(Calendar.YEAR) - cal.get(Calendar.YEAR)
        elapsedMonth = elapsedYears?.times(12)!! + cal_now.get(Calendar.MONTH) - cal.get(Calendar.MONTH)
        val date_now = toUTC(Date())


        var diff = date_now.getTime() - date.getTime();
        elapsedSeconds = diff / 1000;
        elapsedMinutes = elapsedSeconds!!/ 60;
        elapsedHours = elapsedMinutes!! / 60;
        elapsedDays = elapsedHours!! / 24;

    }

    fun toUTC(date: Date): Date {
        var datems = date.time
        val timezoneoffset = TimeZone.getDefault().getOffset(datems)
        datems -= timezoneoffset
        return Date(datems)
    }

    fun getDiffenence(context: Context):String{
        val mContext : Context = context
        if(elapsedYears!! > 0){
            return elapsedYears.toString()+" " + context.getString(R.string.year_ago)
        }
        else if(elapsedMonth!! > 0){
            return elapsedMonth.toString()+" " + context.getString(R.string.month_ago).toString()
        }
        if(elapsedDays!! > 0){
            return elapsedDays.toString()+" " + context.getString(R.string.day_ago).toString()
        }
        if(elapsedHours!!>0){
            return elapsedHours.toString()+" " + context.getString(R.string.hour_ago).toString()
        }
        if(elapsedMinutes!!>0){
            return elapsedMinutes.toString()+" " + context.getString(R.string.minutes_ago).toString()
        }
        if(elapsedSeconds!!>0){
            return elapsedSeconds.toString()+" " + context.getString(R.string.seconds_ago)
        }
        return  ""
    }

}