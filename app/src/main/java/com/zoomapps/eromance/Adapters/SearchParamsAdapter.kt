package com.zoomapps.eromance.Adapters

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zoomapps.eromance.R
import android.widget.*
import com.zoomapps.eromance.Activities.MomentalMeetsActivity
import com.zoomapps.eromance.Interfaces.TypesAdapterInteraction
import com.zoomapps.eromance.Models.DictionaryModel
import com.zoomapps.eromance.Models.MapsModels
import com.zoomapps.eromance.Models.MeetTypesDatum
import com.zoomapps.eromance.Models.SimpleTypeDatum
import java.util.*


class SearchParamsAdapter
(private val mDataset: List<SimpleTypeDatum>?,
 private val mContext: Context? ) : RecyclerView.Adapter<SearchParamsAdapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var main_top_filter_item_container : LinearLayout ? = null
        var main_top_filter_TV : TextView ?=null
        var main_top_filter_icon_IV : ImageView ?=null
        var main_top_filter_icon_CB : CheckBox ?=null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_paramets_item, parent, false)

        val vh = ViewHolder(v)
        vh.main_top_filter_item_container =  v.findViewById<LinearLayout>(R.id.main_top_filter_item_container) as LinearLayout
        vh.main_top_filter_TV = v.findViewById<TextView>(R.id.main_top_filter_TV) as TextView
        vh.main_top_filter_icon_IV =  v.findViewById<ImageView>(R.id.main_top_filter_icon_IV) as ImageView
        vh.main_top_filter_icon_CB =  v.findViewById<CheckBox>(R.id.main_top_filter_icon_CB) as CheckBox
        return vh
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       // holder.main_top_filter_icon_IV?.setImageResource(mDataset?.get(position)?.image_int!!)
        holder.main_top_filter_TV?.text = firstUpperCase(mDataset?.get(position)?.value)
        holder.main_top_filter_item_container?.tag = holder.main_top_filter_icon_CB
        holder.main_top_filter_icon_CB?.tag = position
        if((mContext as TypesAdapterInteraction).checkType(position)!!){
            holder.main_top_filter_icon_CB?.isChecked = true
        }
        else{
            holder.main_top_filter_icon_CB?.isChecked = false
        }
        holder.main_top_filter_item_container?.setOnClickListener { v->
            var curviewCB = v.tag as CheckBox
            var checkedPos = curviewCB.tag as Int
            if((mContext as TypesAdapterInteraction).checkType(checkedPos)!!){
                (mContext as TypesAdapterInteraction).removeType(checkedPos)
                curviewCB.isChecked = false
            }
            else{
                (mContext as TypesAdapterInteraction).addType(checkedPos)
                curviewCB.isChecked = true
            }
        }
    }

    override fun getItemCount(): Int {
        return mDataset?.size!!
    }

    fun firstUpperCase(word: String?): String {
        return if (word == null || word.isEmpty()) "" else word.substring(0, 1).toUpperCase() + word.substring(1)//или return word;
    }
}
/**
 * Created by User on 28.02.2017.
 */
