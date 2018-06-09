package com.zoomapps.eromance.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zoomapps.eromance.R
import android.widget.*
import com.zoomapps.eromance.Interfaces.MapDialogInterface
import com.zoomapps.eromance.Models.MapsModels
import java.util.*


class TopFilterAdapter
(private val mDataset: MutableList<MapsModels.FilterItems>?,
 private val mContext: Context?) : RecyclerView.Adapter<TopFilterAdapter.ViewHolder>() {


    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var main_top_filter_item_container: LinearLayout? = null
        var main_top_filter_TV: TextView? = null
        var main_top_filter_icon_IV: ImageView? = null
        var main_top_filter_icon_CB: CheckBox? = null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_top_filter_items, parent, false)

        val vh = ViewHolder(v)
        vh.main_top_filter_item_container = v.findViewById<LinearLayout>(R.id.main_top_filter_item_container) as LinearLayout
        vh.main_top_filter_TV = v.findViewById<TextView>(R.id.main_top_filter_TV) as TextView
        vh.main_top_filter_icon_IV = v.findViewById<ImageView>(R.id.main_top_filter_icon_IV) as ImageView
        vh.main_top_filter_icon_CB = v.findViewById<CheckBox>(R.id.main_top_filter_icon_CB) as CheckBox
        return vh
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.main_top_filter_icon_IV?.setImageResource(mDataset?.get(position)?.image_int!!)
        holder.main_top_filter_TV?.text = mDataset?.get(position)?.filter_item_text
        holder.main_top_filter_item_container?.tag = holder.main_top_filter_icon_CB
        holder.main_top_filter_icon_CB?.tag = position
        if ((mContext as MapDialogInterface).checkType(position)!!) {
            holder.main_top_filter_icon_CB?.isChecked = true
        } else {
            holder.main_top_filter_icon_CB?.isChecked = false
        }
//        holder.main_top_filter_icon_CB!!.setOnCheckedChangeListener({ buttonView, isChecked ->
//
//            if (isChecked)
//                (mContext as MapDialogInterface).setType(1)
//            else
//                (mContext as MapDialogInterface).removeType(1)
//        })

        holder.main_top_filter_item_container?.setOnClickListener { v ->
            var curviewCB = v.tag as CheckBox
            var checkedPos = curviewCB.tag as Int
            var checkedPosNew:Int? = null

            when(checkedPos){
                0 -> checkedPosNew = 1
                1 -> checkedPosNew = 2
                2 -> checkedPosNew = 3
                3 -> checkedPosNew = 4
                4 -> checkedPosNew = 5
                5 -> checkedPosNew = 6
            }
            if ((mContext as MapDialogInterface).checkType(checkedPosNew!!)) {
                (mContext as MapDialogInterface).removeType(checkedPosNew)
                Log.e("curviewCB", "${checkedPosNew} ")
                curviewCB.isChecked = false
            } else {
                (mContext as MapDialogInterface).setType(checkedPosNew)
                curviewCB.isChecked = true
            }
        }
    }

    override fun getItemCount(): Int {
        return mDataset?.size!!
    }
}
/**
 * Created by User on 28.02.2017.
 */
