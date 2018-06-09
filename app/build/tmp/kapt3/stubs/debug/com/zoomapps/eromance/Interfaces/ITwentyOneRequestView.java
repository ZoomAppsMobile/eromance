package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 04.07.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u00060\u0006R\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/ITwentyOneRequestView;", "", "onDataLoadError", "", "onDataLoaded", "out", "Lcom/zoomapps/eromance/Models/AdultRequestsModel$AdultRequestsListResponse;", "Lcom/zoomapps/eromance/Models/AdultRequestsModel;", "app_debug"})
public abstract interface ITwentyOneRequestView {
    
    public abstract void onDataLoaded(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.AdultRequestsModel.AdultRequestsListResponse out);
    
    public abstract void onDataLoadError();
}