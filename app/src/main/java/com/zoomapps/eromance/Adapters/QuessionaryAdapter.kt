package com.zoomapps.eromance.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.zoomapps.eromance.Controllers.TypeConvertor
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.questions_with_keys_group_id_list
import com.zoomapps.eromance.Models.QuessionariesValues
import com.zoomapps.eromance.Models.UserQuessionary
import com.zoomapps.eromance.R
import org.w3c.dom.Text

/**
 * Created by User on 19.05.2017.
 */
class QuessionaryAdapter
    (private val mDataset: List<UserQuessionary.Datum>,
     private val mContext: Context?) : RecyclerView.Adapter<QuessionaryAdapter.ViewHolder>() {

    val typeConvertor = TypeConvertor(mContext!!)
        inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
            var q_item_IV : ImageView?=null
            var q_item_title_TV  : TextView?=null
            var q_item_value_TV : TextView?=null
        }

        override fun onCreateViewHolder(parent: ViewGroup,
                                        viewType: Int): ViewHolder {
            val v = LayoutInflater.from(parent.context)
                    .inflate(R.layout.layout_quessionary_item , parent, false)

            val vh = ViewHolder(v)
            vh.q_item_IV = v.findViewById<ImageView>(R.id.q_item_IV) as ImageView
            vh.q_item_title_TV = v.findViewById<TextView>(R.id.q_item_title_TV) as TextView
            vh.q_item_value_TV = v.findViewById<TextView>(R.id.q_item_value_TV) as TextView
            return vh
        }
        fun quessionaryTypeConverter(type_id_val:Int?=-1):String{
            return ""
        }
        fun getColorValue(ci:Int):Int
        {
            return mContext?.resources?.getColor(ci)!!
        }

        override fun onBindViewHolder(h: ViewHolder, position: Int) {
            if (mDataset?.get(position) != null) {
                h.q_item_title_TV?.text = questions_with_keys_group_id_list.get(mDataset?.get(position)?.groupId!!)
                if (mDataset?.get(position)?.value != null && mDataset?.get(position)?.value != "") {
                    h.q_item_value_TV?.text = mDataset?.get(position)?.value?.toString()
                }
                else{
                    h.q_item_value_TV?.text = typeConvertor.getKeyById(QuessionariesValues::class.java,
                            mDataset?.get(position)?.questionnaireId!!)
                }
            }

        }

        override fun getItemCount(): Int {
            return mDataset?.size!!
        }


}