package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 11.07.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0018\u00010\tR\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/IGiftsView;", "", "giftSelected", "", "giftId", "", "onLoadError", "onLoaded", "data", "Lcom/zoomapps/eromance/Models/GiftsModel$UserGiftsResponse;", "Lcom/zoomapps/eromance/Models/GiftsModel;", "app_debug"})
public abstract interface IGiftsView {
    
    public abstract void onLoaded(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.GiftsModel.UserGiftsResponse data);
    
    public abstract void onLoadError();
    
    public abstract void giftSelected(@org.jetbrains.annotations.NotNull()
    java.lang.String giftId);
}