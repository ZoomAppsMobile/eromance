package com.zoomapps.eromance.Helpers;

import java.lang.System;

/**
 * * Created by User on 13.06.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016J\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0002J\'\u0010!\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0016H\u0002\u00a2\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00060%R\u00020&2\n\u0010\'\u001a\u00060(R\u00020)J\u0014\u0010*\u001a\u00020\u001a2\n\u0010+\u001a\u00060(R\u00020)H\u0007J\u0006\u0010,\u001a\u00020\u001aJ\u0006\u0010-\u001a\u00020\u001aJ\u0018\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0016H\u0002J&\u00102\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010 J\u0018\u00103\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u00064"}, d2 = {"Lcom/zoomapps/eromance/Helpers/MessagePresenter;", "", "mContext", "Landroid/content/Context;", "viewInterface", "Lcom/zoomapps/eromance/Interfaces/IChatView;", "(Landroid/content/Context;Lcom/zoomapps/eromance/Interfaces/IChatView;)V", "imageMessage", "", "getImageMessage", "()I", "getMContext", "()Landroid/content/Context;", "textMessage", "getTextMessage", "getViewInterface", "()Lcom/zoomapps/eromance/Interfaces/IChatView;", "setViewInterface", "(Lcom/zoomapps/eromance/Interfaces/IChatView;)V", "convertParamsToJson", "Lcom/google/gson/JsonObject;", "my_id", "", "to_user", "content", "getData", "", "interocular_id", "getDataBy_UID", "uid", "getRealPathFromURI", "contentURI", "Landroid/net/Uri;", "getType", "image", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;", "mapPushMsgToResponseMsg", "Lcom/zoomapps/eromance/Models/ChatMessageModel$Datum_;", "Lcom/zoomapps/eromance/Models/ChatMessageModel;", "data", "Lcom/zoomapps/eromance/Models/PushModels/MessageModel$MessageData;", "Lcom/zoomapps/eromance/Models/PushModels/MessageModel;", "onMessageEvent", "event", "onPause", "onResume", "sendImageMessage", "file", "Ljava/io/File;", "to_user_id", "sendMessage", "sendTextMessage", "app_debug"})
public final class MessagePresenter {
    private final int textMessage = 10;
    private final int imageMessage = 11;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    private com.zoomapps.eromance.Interfaces.IChatView viewInterface;
    
    public final int getTextMessage() {
        return 0;
    }
    
    public final int getImageMessage() {
        return 0;
    }
    
    public final void getData(@org.jetbrains.annotations.Nullable()
    java.lang.String interocular_id) {
    }
    
    private final java.lang.Integer getType(java.lang.String content, java.lang.String image) {
        return null;
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String to_user, @org.jetbrains.annotations.Nullable()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    android.net.Uri image) {
    }
    
    public final void getDataBy_UID(@org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
    }
    
    private final java.lang.String getRealPathFromURI(android.net.Uri contentURI) {
        return null;
    }
    
    private final void sendImageMessage(java.io.File file, java.lang.String to_user_id) {
    }
    
    private final com.google.gson.JsonObject convertParamsToJson(java.lang.String my_id, java.lang.String to_user, java.lang.String content) {
        return null;
    }
    
    private final void sendTextMessage(java.lang.String to_user_id, java.lang.String content) {
    }
    
    public final void onResume() {
    }
    
    public final void onPause() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.PushModels.MessageModel.MessageData event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Models.ChatMessageModel.Datum_ mapPushMsgToResponseMsg(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.PushModels.MessageModel.MessageData data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Interfaces.IChatView getViewInterface() {
        return null;
    }
    
    public final void setViewInterface(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Interfaces.IChatView p0) {
    }
    
    public MessagePresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Interfaces.IChatView viewInterface) {
        super();
    }
}