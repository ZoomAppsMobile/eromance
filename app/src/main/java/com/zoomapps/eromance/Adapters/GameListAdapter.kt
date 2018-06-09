package com.zoomapps.eromance.Adapters

import android.app.Activity
import android.app.Dialog
import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.media.Image
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.zoomapps.eromance.Activities.UserProfileActivity
import com.zoomapps.eromance.Controllers.serializeToJson
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.GameModel
import com.zoomapps.eromance.R
import java.util.*
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.Window
import android.view.Window.FEATURE_NO_TITLE
import android.widget.*
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Activities.GameListActivity
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.MyCustomDate
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ViewDialog {
    fun setImageToUnCheck(){
        rock_variant_IV?.setImageResource(R.drawable.icon_game_rock_uncheck)
        scissors_variant_IV?.setImageResource(R.drawable.icon_game_scissors_uncheck)
        paper_variant_IV?.setImageResource(R.drawable.icon_game_paper_uncheck)
    }
    var selectedVariant = 0;
    var betValue = 0
    fun initThings(){
        rock_variant_IV?.setOnClickListener{
            if(selectedVariant!=1) {
                setImageToUnCheck()
                rock_variant_IV?.setImageResource(R.drawable.icon_game_rock)
                selectedVariant=1
            }
        }
        scissors_variant_IV?.setOnClickListener {
            if(selectedVariant!=2) {
                setImageToUnCheck()
                scissors_variant_IV?.setImageResource(R.drawable.icon_game_scissors)
                selectedVariant=2
            }
        }
        paper_variant_IV?.setOnClickListener {
            if(selectedVariant!=3) {
                setImageToUnCheck()
                paper_variant_IV?.setImageResource(R.drawable.icon_game_paper)
                selectedVariant=3
            }
        }
    }
    fun init_btns(_context:Context){
        cancel_btn?.setOnClickListener {
            mainDialog?.cancel()
        }
        ok_btn?.setOnClickListener {
            //TODO: CANCEL and SenD REquest
            sendRequest(_context)
            mainDialog?.cancel()
        }
    }
    var PD_Loading : ProgressDialog ?=null
    fun sendRequest(mContext: Context?){
        PD_Loading = ProgressDialog(mContext)
        PD_Loading?.setMessage(mContext!!.getString(R.string.go_upload))
        PD_Loading?.show()
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.answerToGame(game_id.toString() , betValue.toString(),selectedVariant.toString() ,GlobalStaticVariables.myId?.toString()!!)
        call.enqueue(object : Callback<GameModel.GameBetModel.GameAnswerRequest> {
            override fun onResponse(call: Call<GameModel.GameBetModel.GameAnswerRequest>, response: Response<GameModel.GameBetModel.GameAnswerRequest>) {
                val mainPageDataList = response.body()
                if(mainPageDataList != null) {
                    if(response.body().code!=-1)
                        PD_Loading?.cancel()
                    when(response.body().code){
                        1->{
                            Toast.makeText(mContext, mContext!!.getString(R.string.you_lose), Toast.LENGTH_SHORT).show()
                            val call_sec =  apiService.runGame(response.body().data?.gameId.toString())
                            call_sec.enqueue(object : Callback<GameModel.GameActivateModel.GamePlayRequest> {
                                override fun onResponse(call: Call<GameModel.GameActivateModel.GamePlayRequest>?, response: Response<GameModel.GameActivateModel.GamePlayRequest>?) {
                                    try{
                                        PD_Loading?.cancel()
                                       var myData= response?.body()?.data?.bets?.data?.filter { it->it.userId==GlobalStaticVariables.myId }?.firstOrNull()
                                        var opponentData= response?.body()?.data?.bets?.data?.filter { it->it.userId!=GlobalStaticVariables.myId }?.firstOrNull()
                                        var thing_diffs = myData?.thingId!! - opponentData?.thingId!!;
                                        when(thing_diffs){
                                            -2->{
                                                Toast.makeText(mContext,mContext!!.getString(R.string.you_lose), Toast.LENGTH_SHORT).show()
                                            }
                                            -1->{
                                                Toast.makeText(mContext,mContext!!.getString(R.string.you_won), Toast.LENGTH_SHORT).show()
                                            }
                                            0->{
                                                Toast.makeText(mContext, mContext!!.getString(R.string.draw), Toast.LENGTH_SHORT).show()
                                            }
                                            1->{
                                                Toast.makeText(mContext,mContext!!.getString(R.string.you_lose), Toast.LENGTH_SHORT).show()
                                            }
                                            2->{
                                                Toast.makeText(mContext,mContext!!.getString(R.string.you_won), Toast.LENGTH_SHORT).show()
                                            }

                                        }
                                        var dataToRemove = (mContext as GameListActivity).AdapterData?.filter{it -> it.id == game_id}?.firstOrNull()
                                        if(dataToRemove!=null) {
                                            (mContext as GameListActivity).AdapterData?.remove(dataToRemove)
                                            (mContext as GameListActivity).mAdapter?.notifyDataSetChanged()
                                        }
                                    }
                                    catch (ex:Exception){

                                    }
                                }

                                override fun onFailure(call: Call<GameModel.GameActivateModel.GamePlayRequest>?, t: Throwable?) {
                                    PD_Loading?.cancel()
                                }

                            })
                        }
                        501->{
                            Toast.makeText(mContext,mContext!!.getString(R.string.game_end), Toast.LENGTH_SHORT).show()
                        }
                        502->{
                            Toast.makeText(mContext,mContext!!.getString(R.string.already_answered), Toast.LENGTH_SHORT).show()
                        }
                        503->{
                            Toast.makeText(mContext,mContext!!.getString(R.string.delete_game), Toast.LENGTH_SHORT).show()
                        }
                        401->{
                            //"Вы уже являетесь участником игры"
                            Toast.makeText(mContext,mContext!!.getString(R.string.no_money), Toast.LENGTH_SHORT).show()
                        }
                        402->{
                            Toast.makeText(mContext,mContext!!.getString(R.string.already_game_two_user), Toast.LENGTH_SHORT).show()
                        }
                    }
                }
                else {
                    Toast.makeText(mContext,mContext!!.getString(R.string.error_data), Toast.LENGTH_SHORT).show()

                }
            }

            override fun onFailure(call: Call<GameModel.GameBetModel.GameAnswerRequest>, t: Throwable) {
                // Log error here since request failed
                Toast.makeText(mContext,mContext!!.getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })
    }
    var cancel_btn : Button?=null
    var ok_btn : Button ?=null
    var rock_variant_IV :ImageView?=null
    var scissors_variant_IV :ImageView?=null
    var paper_variant_IV :ImageView?=null
    var mainDialog:Dialog?=null
    var game_id=0
    fun showDialog(activity: Context , tagData:String) {
        var splitedData = tagData.split(',')
        game_id = splitedData.get(0).toInt()
        betValue = splitedData.get(1).toInt()
        mainDialog = Dialog(activity)
        mainDialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        mainDialog?.setCancelable(false)
        mainDialog?.setContentView(R.layout.dialog_thing_picker)
        mainDialog?.window!!.setBackgroundDrawable(ColorDrawable(android.graphics.Color.TRANSPARENT))
        rock_variant_IV = mainDialog?.findViewById<ImageView>(R.id.rock_variant_IV) as ImageView
        scissors_variant_IV = mainDialog?.findViewById<ImageView>(R.id.scissors_variant_IV) as ImageView
         paper_variant_IV = mainDialog?.findViewById<ImageView>(R.id.paper_variant_IV) as ImageView
        initThings()
        cancel_btn = mainDialog?.findViewById<Button>(R.id.cancel_btn) as Button
        ok_btn = mainDialog?.findViewById<Button>(R.id.ok_btn) as Button
        init_btns(activity)

        mainDialog?.show()
    }
}
class GameListAdapter// Provide a suitable constructor (depends on the kind of dataset)
(private val mDataset: MutableList<GameModel.GamesListModel.Datum>?, private val mContext: Context?) : RecyclerView.Adapter<GameListAdapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var itemContainer : LinearLayout? = null
        var game_bet_TV:TextView?=null
       var game_time_TV :TextView ? = null
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_games_items, parent, false)

        val vh = ViewHolder(v)
        vh.itemContainer = v.findViewById<LinearLayout>(R.id.main_item_container) as LinearLayout
        vh.game_bet_TV =  v.findViewById<TextView>(R.id.game_item_bet_TV) as TextView
        vh.game_time_TV =  v.findViewById<TextView>(R.id.game_item_time_TV) as TextView
        return vh
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(mDataset?.get(position)?.bets?.data!= null && mDataset?.get(position)?.bets?.data?.isNotEmpty()!!) {
            holder.game_bet_TV?.text = mDataset?.get(position)?.bets?.data?.get(0)?.bet?.toString()
            holder.game_time_TV?.text = MyCustomDate(mDataset?.get(position)?.createdAt!!).getDiffenence(mContext!!)
            holder.itemContainer?.tag = mDataset?.get(position)?.id?.toString() + "," + mDataset?.get(position)?.bets?.data?.get(0)?.bet?.toString()
            holder.itemContainer?.setOnClickListener { v->
                var data = (v as LinearLayout).tag as String;
                if (mContext != null) {
                    var dialog = ViewDialog().showDialog(mContext!!, data);
                } else {
                    Log.e("[GameListAdapter]", "Context is null")
                }
            }
        }
        /* holder.itemContainer!!.tag =  serializeToJson( mDataset!![position]);
         holder.itemContainer!!.setOnClickListener {
             var data =  holder.itemContainer!!.tag as String;
             (mContext as Activity).startActivity(Intent(mContext,UserProfileActivity::class.java).putExtra("user_data",data));
         }*/
        //tmpTV!!.setText(spannableString)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {

        return mDataset?.size!!
    }

}
/**
 * Created by User on 28.02.2017.
 */
