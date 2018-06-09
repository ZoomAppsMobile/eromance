package com.zoomapps.eromance.Helpers

import android.content.Context
import android.widget.Toast
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Interfaces.IGameView
import com.zoomapps.eromance.Models.GameHistoryModel
import com.zoomapps.eromance.Models.GameModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

/**
 * Created by User on 14.07.2017.
 */
class GameHelper(val mContext: Context,val viewInterface: IGameView){
    fun getData(){
        viewInterface.onLoadedStarted("All")
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getGameList(GlobalStaticVariables.language_type!!,is_played = false)
        call.enqueue(object : Callback<GameModel.GamesListModel.GameListResponse> {
            override fun onResponse(call: Call<GameModel.GamesListModel.GameListResponse>,
                                    response: Response<GameModel.GamesListModel.GameListResponse>) {
                val mainPageDataList = response.body().data
                if(mainPageDataList != null&& mainPageDataList.isNotEmpty() ) {
                    val statusCode = response.code()

                    var listData = mainPageDataList.filter { it->it.isPlayed==false &&it.bets!=null && it.bets?.data!=null && it.bets?.data?.isNotEmpty()!!}.toList()
                    viewInterface.onAllGamesLoaded(listData)
                }
                else {
                    Toast.makeText(mContext,"Список пуст", Toast.LENGTH_SHORT).show()
                    viewInterface.onAllGamesLoaded(ArrayList<GameModel.GamesListModel.Datum>())
                }
            }

            override fun onFailure(call: Call<GameModel.GamesListModel.GameListResponse>, t: Throwable) {
                // Log error here since request failed
                Toast.makeText(mContext,"Error", Toast.LENGTH_SHORT).show();
                viewInterface.onAllGamesLoaded(ArrayList<GameModel.GamesListModel.Datum>())
            }
        })
    }
    fun getGameHistory(){
        viewInterface.onLoadedStarted("History")
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getGameHistoryList(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId?.toString()!!)
        call.enqueue(object : Callback<GameHistoryModel.ResponseData> {
            override fun onResponse(call: Call<GameHistoryModel.ResponseData>,
                                    response: Response<GameHistoryModel.ResponseData>) {
                val mainPageDataList = response.body().data
                if(mainPageDataList != null&& mainPageDataList.isNotEmpty() ) {
                    val statusCode = response.code()
                    viewInterface.onHistoryGamesLoaded(mainPageDataList)
                }
                else {
                    Toast.makeText(mContext,"Список пуст", Toast.LENGTH_SHORT).show()
                    viewInterface.onHistoryGamesLoaded(ArrayList<GameHistoryModel.Datum>())
                }
            }

            override fun onFailure(call: Call<GameHistoryModel.ResponseData>, t: Throwable) {
                // Log error here since request failed
                Toast.makeText(mContext,"Error", Toast.LENGTH_SHORT).show();
                viewInterface.onHistoryGamesLoaded(ArrayList<GameHistoryModel.Datum>())
            }
        })
    }

}

