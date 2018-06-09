package com.zoomapps.eromance.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.zoomapps.eromance.Models.MeetsModel
import com.zoomapps.eromance.Models.SimpleTypeDatum
import com.zoomapps.eromance.R

/**
 * Created by User on 12.09.2017.
 */
class MeetTypesAdapter(private val dataList : List<MeetsModel.Datum_>,
                       private val mContext: Context? ): RecyclerView.Adapter<MeetTypesAdapter.ViewHolder>() {


    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var main_top_filter_TV : TextView?=null
        var main_top_filter_icon_IV : ImageView?=null
    }
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_meet_type, parent, false)

        val vh = ViewHolder(v)
        vh.main_top_filter_TV = v.findViewById<TextView>(R.id.main_top_filter_TV) as TextView
        vh.main_top_filter_icon_IV =  v.findViewById<ImageView>(R.id.main_top_filter_icon_IV) as ImageView
        return vh
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.main_top_filter_TV?.text = dataList?.get(position)?.value
    }

    override fun getItemCount(): Int {
        return dataList.size;
    }

}