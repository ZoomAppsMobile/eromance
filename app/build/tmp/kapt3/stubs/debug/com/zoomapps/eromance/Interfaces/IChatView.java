package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 13.06.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001c\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\b\u0012\u00060\u0007R\u00020\b\u0018\u00010\u0006H&J\b\u0010\t\u001a\u00020\u0003H&J\u0014\u0010\n\u001a\u00020\u00032\n\u0010\u000b\u001a\u00060\u0007R\u00020\bH&J\u0014\u0010\f\u001a\u00020\u00032\n\u0010\u000b\u001a\u00060\u0007R\u00020\bH&J\b\u0010\r\u001a\u00020\u0003H&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0018\u00010\u0010R\u00020\u0011H&J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0018\u00010\u0013R\u00020\u0014H&\u00a8\u0006\u0015"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/IChatView;", "", "imageMessageSendError", "", "messageLoaded", "loadedMessageList", "", "Lcom/zoomapps/eromance/Models/ChatMessageModel$Datum_;", "Lcom/zoomapps/eromance/Models/ChatMessageModel;", "messageSendError", "messageSendSuccessfully", "messageData", "onMessageReceived", "sendContentIsEmpty", "userDataLoaded", "joinedUserData", "Lcom/zoomapps/eromance/Models/DialogsModel$Data;", "Lcom/zoomapps/eromance/Models/DialogsModel;", "userProfileDataLoaded", "Lcom/zoomapps/eromance/Models/UserProfileModel$Datum;", "Lcom/zoomapps/eromance/Models/UserProfileModel;", "app_debug"})
public abstract interface IChatView {
    
    public abstract void sendContentIsEmpty();
    
    public abstract void messageSendSuccessfully(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.ChatMessageModel.Datum_ messageData);
    
    public abstract void messageSendError();
    
    public abstract void imageMessageSendError();
    
    public abstract void userDataLoaded(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.DialogsModel.Data joinedUserData);
    
    public abstract void userProfileDataLoaded(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.UserProfileModel.Datum joinedUserData);
    
    public abstract void messageLoaded(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.ChatMessageModel.Datum_> loadedMessageList);
    
    public abstract void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.ChatMessageModel.Datum_ messageData);
}