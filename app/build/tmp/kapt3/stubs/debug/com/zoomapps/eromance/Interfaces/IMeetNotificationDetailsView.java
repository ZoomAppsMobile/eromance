package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 14.09.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\tH&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&\u00a8\u0006\u0012"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/IMeetNotificationDetailsView;", "", "close", "", "onAcceptedUserToMeet", "onDeclinedUserFromMeet", "onLoadDesiredUserData", "_userData", "Lcom/zoomapps/eromance/Models/AccountModel/LoginModel$Datum;", "Lcom/zoomapps/eromance/Models/AccountModel/LoginModel;", "onLoadMeetData", "_meetData", "Lcom/zoomapps/eromance/Models/MeetsModel$Datum;", "Lcom/zoomapps/eromance/Models/MeetsModel;", "onRequestError", "onShowToast", "message", "", "app_debug"})
public abstract interface IMeetNotificationDetailsView {
    
    public abstract void onAcceptedUserToMeet();
    
    public abstract void onDeclinedUserFromMeet();
    
    public abstract void onRequestError();
    
    public abstract void onShowToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void onLoadMeetData(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.MeetsModel.Datum _meetData);
    
    public abstract void onLoadDesiredUserData(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.AccountModel.LoginModel.Datum _userData);
    
    public abstract void close();
}