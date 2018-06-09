package com.zoomapps.eromance.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.zoomapps.eromance.Controllers.getColorById
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.MyCustomDate
import com.zoomapps.eromance.Models.GameHistoryModel
import com.zoomapps.eromance.Models.GameModel
import com.zoomapps.eromance.R

/**
 * Created by User on 14.07.2017.
 */
class GameHistoryAdapter// Provide a suitable constructor (depends on the kind of dataset)
(private val mDataset: MutableList<GameHistoryModel.Datum>?, private val mContext: Context?) : RecyclerView.Adapter<GameHistoryAdapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var main_item_container : LinearLayout? = null
        var cu_rock_pick : ImageView ?=null
        var cu_scissors_pick : ImageView ?=null
        var cu_paper_pick : ImageView ?=null
        var ou_rock_pick : ImageView ?=null
        var ou_scissors_pick : ImageView ?=null
        var ou_paper_pick : ImageView ?=null
        var game_result_TV : TextView?=null
        var game_item_bet_TV : TextView?=null
        var game_rival_name_TV : TextView?=null
        var game_date_TV : TextView?=null
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_geme_history_item, parent, false)

        val vh = ViewHolder(v)
            vh.main_item_container = v.findViewById<LinearLayout>(R.id.main_item_container) as LinearLayout
        vh.cu_rock_pick = v.findViewById<ImageView>(R.id.cu_rock_pick) as ImageView
        vh.cu_scissors_pick = v.findViewById<ImageView>(R.id.cu_scissors_pick) as ImageView
        vh.cu_paper_pick = v.findViewById<ImageView>(R.id.cu_paper_pick) as ImageView
        vh.ou_rock_pick = v.findViewById<ImageView>(R.id.ou_rock_pick) as ImageView
        vh.ou_scissors_pick = v.findViewById<ImageView>(R.id.ou_scissors_pick) as ImageView
        vh.ou_paper_pick = v.findViewById<ImageView>(R.id.ou_paper_pick) as ImageView
        vh.game_result_TV = v.findViewById<TextView>(R.id.game_result_TV) as TextView
        vh.game_item_bet_TV = v.findViewById<TextView>(R.id.game_item_bet_TV) as TextView
        vh.game_rival_name_TV = v.findViewById<TextView>(R.id.game_rival_name_TV) as TextView
        vh.game_date_TV = v.findViewById<TextView>(R.id.game_date_TV) as TextView
        return vh
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.game_item_bet_TV?.text = mDataset?.get(position)?.bet.toString()
        var oponentData =  mDataset?.get(position)?.game?.data?.bets?.data?.firstOrNull { it->it.userId!=GlobalStaticVariables.myId }
        var myData =  mDataset?.get(position)?.game?.data?.bets?.data?.firstOrNull { it->it.userId==GlobalStaticVariables.myId }
        if(oponentData!=null){
            holder.game_rival_name_TV?.text =oponentData?.user?.data?.username
            //CUR
            holder.cu_rock_pick?.setImageResource(R.drawable.icon_game_rock_uncheck)
            holder.cu_scissors_pick?.setImageResource(R.drawable.icon_game_scissors_uncheck)
            holder.cu_paper_pick?.setImageResource(R.drawable.icon_game_paper_uncheck)
            //OPPONENT
            holder.ou_rock_pick?.setImageResource(R.drawable.icon_game_rock_uncheck)
            holder.ou_scissors_pick?.setImageResource(R.drawable.icon_game_scissors_uncheck)
            holder.ou_paper_pick?.setImageResource(R.drawable.icon_game_paper_uncheck)

            when(oponentData.thingId){
                1->{
                    holder.ou_rock_pick?.setImageResource(R.drawable.icon_game_rock)
                }
                2->{
                    holder.ou_scissors_pick?.setImageResource(R.drawable.icon_game_scissors)
                }
                3->{
                    holder.ou_paper_pick?.setImageResource(R.drawable.icon_game_paper)
                }
            }
            when(myData?.thingId){
                1->{
                    holder.cu_rock_pick?.setImageResource(R.drawable.icon_game_rock)
                }
                2->{
                    holder.cu_scissors_pick?.setImageResource(R.drawable.icon_game_scissors)
                }
                3->{
                    holder.cu_paper_pick?.setImageResource(R.drawable.icon_game_paper)
                }
            }
        }
        else{
            holder.game_rival_name_TV?.text = mContext!!.getString(R.string.not_known)
            if(myData!=null) {
                when (myData.thingId) {
                    1 -> {
                        holder.cu_rock_pick?.setImageResource(R.drawable.icon_game_rock)
                    }
                    2 -> {
                        holder.cu_scissors_pick?.setImageResource(R.drawable.icon_game_scissors)
                    }
                    3 -> {
                        holder.cu_paper_pick?.setImageResource(R.drawable.icon_game_paper)
                    }
                }
            }
        }
        var game_res=""
         when(mDataset?.get(position)?.statusId){
            1->{
                game_res = mContext!!.getString(R.string.expectation)
                holder.game_result_TV?.setTextColor(getColorById(mContext!!,R.color.yellow))
            }
            2->{
                game_res = mContext!!.getString(R.string.victory)
                holder.game_result_TV?.setTextColor(getColorById(mContext!!,R.color.green))
            }
            3->{
                game_res = mContext!!.getString(R.string.loss)
                holder.game_result_TV?.setTextColor(getColorById(mContext!!,R.color.green))
            }
            4->{
                game_res = mContext!!.getString(R.string.draw)
                holder.game_result_TV?.setTextColor(getColorById(mContext!!,R.color.green))
            }
        } //TODO:PARSE
        holder.game_result_TV?.text = game_res
        holder.game_date_TV?.text = MyCustomDate(mDataset?.get(position)?.game?.data?.updatedAt!!).getDiffenence( mContext!!)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {

        return mDataset?.size!!
    }

}