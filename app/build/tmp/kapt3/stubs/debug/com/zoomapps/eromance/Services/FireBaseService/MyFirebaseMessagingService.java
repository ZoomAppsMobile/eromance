package com.zoomapps.eromance.Services.FireBaseService;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\f\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u000fR\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017J\u0014\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0018\u00010\u000fR\u00020\u0010J\u001c\u0010\u001c\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u000fR\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016J\u0012\u0010\u001e\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u000fR\u00020\u0010J8\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\u0010J0\u0010$\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\u0010H\u0002J\u001c\u0010%\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0018\u00010\u000fR\u00020\u00102\u0006\u0010&\u001a\u00020\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006("}, d2 = {"Lcom/zoomapps/eromance/Services/FireBaseService/MyFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "push_notif_id_start", "", "getPush_notif_id_start", "()I", "checkCurrentConversation", "", "uid", "(Ljava/lang/Integer;)Z", "getIntentByType", "Landroid/app/PendingIntent;", "pid", "data", "Lcom/zoomapps/eromance/Models/PushModels/MessageModel$MessageData;", "Lcom/zoomapps/eromance/Models/PushModels/MessageModel;", "(Ljava/lang/Integer;Lcom/zoomapps/eromance/Models/PushModels/MessageModel$MessageData;)Landroid/app/PendingIntent;", "handleMessage", "", "messageBody", "raw_message", "", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "processChatMessage", "msg_data", "processGamePush", "raw_data", "processInteractionPush", "sendBigTextNotification", "title", "content", "smallText", "push_id", "sendNotification", "simplePushProcess", "type", "Companion", "app_debug"})
public final class MyFirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    private final int push_notif_id_start = 200;
    private static final java.lang.String TAG = "MyFirebaseMsgService";
    public static final com.zoomapps.eromance.Services.FireBaseService.MyFirebaseMessagingService.Companion Companion = null;
    
    @android.support.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @android.annotation.SuppressLint(value = {"WrongConstant"})
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.Nullable()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    public final int getPush_notif_id_start() {
        return 0;
    }
    
    private final void handleMessage(com.zoomapps.eromance.Models.PushModels.MessageModel.MessageData messageBody, java.lang.String raw_message) {
    }
    
    public final void processInteractionPush(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.PushModels.MessageModel.MessageData messageBody) {
    }
    
    public final void processGamePush(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.PushModels.MessageModel.MessageData messageBody, @org.jetbrains.annotations.Nullable()
    java.lang.String raw_data) {
    }
    
    public final void simplePushProcess(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.PushModels.MessageModel.MessageData msg_data, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public final boolean checkCurrentConversation(@org.jetbrains.annotations.Nullable()
    java.lang.Integer uid) {
        return false;
    }
    
    public final void processChatMessage(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.PushModels.MessageModel.MessageData msg_data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.PendingIntent getIntentByType(@org.jetbrains.annotations.Nullable()
    java.lang.Integer pid, @org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.PushModels.MessageModel.MessageData data) {
        return null;
    }
    
    private final void sendNotification(java.lang.String title, java.lang.String content, int push_id, com.zoomapps.eromance.Models.PushModels.MessageModel.MessageData data) {
    }
    
    public final void sendBigTextNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.lang.String smallText, int push_id, @org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.PushModels.MessageModel.MessageData data) {
    }
    
    public MyFirebaseMessagingService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/zoomapps/eromance/Services/FireBaseService/MyFirebaseMessagingService$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}