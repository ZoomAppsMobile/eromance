package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 15.06.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\b0\u0006H&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/DialogsView;", "", "onDataEmpty", "", "onLoaded", "datalist", "", "Lcom/zoomapps/eromance/Models/DialogsModel$Datum;", "Lcom/zoomapps/eromance/Models/DialogsModel;", "onLoadingError", "app_debug"})
public abstract interface DialogsView {
    
    public abstract void onLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.DialogsModel.Datum> datalist);
    
    public abstract void onLoadingError();
    
    public abstract void onDataEmpty();
}