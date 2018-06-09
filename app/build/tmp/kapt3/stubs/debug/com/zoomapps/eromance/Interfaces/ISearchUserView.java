package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 26.07.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/ISearchUserView;", "", "onDataLoaded", "", "datum", "", "Lcom/zoomapps/eromance/Models/UserRateModel$Datum;", "Lcom/zoomapps/eromance/Models/UserRateModel;", "onLoadError", "msg", "", "app_debug"})
public abstract interface ISearchUserView {
    
    public abstract void onDataLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.UserRateModel.Datum> datum);
    
    public abstract void onLoadError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
}