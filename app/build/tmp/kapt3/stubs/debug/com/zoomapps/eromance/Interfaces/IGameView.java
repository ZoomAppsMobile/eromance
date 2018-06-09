package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 14.07.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0005H&J\u001a\u0010\b\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u00060\tR\u00020\n0\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/IGameView;", "", "onAllGamesLoaded", "", "data", "", "Lcom/zoomapps/eromance/Models/GameModel$GamesListModel$Datum;", "Lcom/zoomapps/eromance/Models/GameModel$GamesListModel;", "onHistoryGamesLoaded", "Lcom/zoomapps/eromance/Models/GameHistoryModel$Datum;", "Lcom/zoomapps/eromance/Models/GameHistoryModel;", "onLoadedStarted", "out", "", "app_debug"})
public abstract interface IGameView {
    
    public abstract void onLoadedStarted(@org.jetbrains.annotations.NotNull()
    java.lang.String out);
    
    public abstract void onAllGamesLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.GameModel.GamesListModel.Datum> data);
    
    public abstract void onHistoryGamesLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.GameHistoryModel.Datum> data);
}