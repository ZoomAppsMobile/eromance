package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 06.07.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tR\u00020\n0\bH&J\u001a\u0010\u000b\u001a\u00020\u00032\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\fR\u00020\n0\bH&J\u001a\u0010\r\u001a\u00020\u00032\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u000eR\u00020\u000f0\bH&J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0018\u00010\u0011R\u00020\u0012H&\u00a8\u0006\u0013"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/IUserProfileView;", "", "onGiftSendError", "", "onGiftSendSuccesfully", "onUserAreBlocked", "onUserGiftsLoaded", "out", "", "Lcom/zoomapps/eromance/Models/GiftsModel$Data;", "Lcom/zoomapps/eromance/Models/GiftsModel;", "onUserGiftsLoaded2", "Lcom/zoomapps/eromance/Models/GiftsModel$Datum;", "onUserPhotosLoaded", "Lcom/zoomapps/eromance/Models/UserPhotosModel$Data;", "Lcom/zoomapps/eromance/Models/UserPhotosModel;", "onUserProfileDataLoaded", "Lcom/zoomapps/eromance/Models/UserProfileModel$Datum;", "Lcom/zoomapps/eromance/Models/UserProfileModel;", "app_debug"})
public abstract interface IUserProfileView {
    
    public abstract void onUserProfileDataLoaded(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.UserProfileModel.Datum out);
    
    public abstract void onUserPhotosLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.UserPhotosModel.Data> out);
    
    public abstract void onUserGiftsLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.GiftsModel.Data> out);
    
    public abstract void onUserGiftsLoaded2(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.GiftsModel.Datum> out);
    
    public abstract void onGiftSendSuccesfully();
    
    public abstract void onGiftSendError();
    
    public abstract void onUserAreBlocked();
}