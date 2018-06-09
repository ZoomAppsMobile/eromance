package com.zoomapps.eromance.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zoomapps.eromance.R
import android.widget.*
import com.zoomapps.eromance.Models.MapsModels
import java.util.*


class Map_Bottom_SetPoints_Adapter
(private val mDataset: MutableList<MapsModels.FilterItems>?,
 private val mContext: Context?) : RecyclerView.Adapter<Map_Bottom_SetPoints_Adapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var type_element_IV : ImageView ? = null

    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout__map_bottom_types_item, parent, false)

        val vh = ViewHolder(v)
        vh.type_element_IV =  v.findViewById<ImageView>(R.id.type_element_IV) as ImageView
        return vh
    }
    fun imageStateChange(im_view : ImageView , state:Boolean , imageChecked : Int , imageUncheck:Int){
        if(state){
            im_view.setImageResource(imageChecked)
        }
        else{
            im_view.setImageResource(imageUncheck)
        }
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.type_element_IV?.tag = mDataset?.get(position)?.filter_item_id
        imageStateChange(holder.type_element_IV!!,
                mDataset?.get(position)?.filter_item_state!!,
                mDataset?.get(position)?.image_active_int!!,
                mDataset?.get(position)?.image_int!!)

        holder.type_element_IV?.setOnClickListener { v->
            var curviewCB = v as ImageView
            var checkedPos = curviewCB.tag as String
            var selectedData =  mDataset?.filter { it->it.filter_item_id == checkedPos }?.firstOrNull();
            if(selectedData!=null) {
                mDataset?.filter { it -> it.filter_item_id == checkedPos }?.forEach { it.filter_item_state = !it.filter_item_state }
                imageStateChange(curviewCB,
                        selectedData?.filter_item_state!!,
                        selectedData?.image_active_int!!,
                        selectedData?.image_int!!)
            }
        }
    }

    override fun getItemCount(): Int {

        return mDataset?.size!!
    }

    object selectedItemsObj {
        var selectedItems : MutableList<Int>?=ArrayList<Int>()
    }

}
/**
 * Created by User on 28.02.2017.
 */
