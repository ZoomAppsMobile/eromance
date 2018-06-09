package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 13.06.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u001a\u0010\u0005\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\bR\u00020\t0\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/IFavoritesView;", "", "onEmpty", "", "onLoadError", "onLoaded", "likelist", "", "Lcom/zoomapps/eromance/Models/UserRateModel$Datum;", "Lcom/zoomapps/eromance/Models/UserRateModel;", "app_debug"})
public abstract interface IFavoritesView {
    
    public abstract void onLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.UserRateModel.Datum> likelist);
    
    public abstract void onLoadError();
    
    public abstract void onEmpty();
}