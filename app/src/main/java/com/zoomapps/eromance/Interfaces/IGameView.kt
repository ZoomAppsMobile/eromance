package com.zoomapps.eromance.Interfaces

import com.zoomapps.eromance.Models.GameHistoryModel
import com.zoomapps.eromance.Models.GameModel

/**
 * Created by User on 14.07.2017.
 */
interface IGameView {
    fun onLoadedStarted(out:String)
    fun onAllGamesLoaded(data:List<GameModel.GamesListModel.Datum>)
    fun onHistoryGamesLoaded(data: List<GameHistoryModel.Datum>)
}