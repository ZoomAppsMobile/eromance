package com.zoomapps.eromance.Services.NetworkCheckService;

import java.lang.System;

/**
 * * Created by User on 03.08.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\"\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 H\u0016J\u0012\u0010$\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u001cH\u0016J\u0006\u0010%\u001a\u00020\u0010J\u0006\u0010&\u001a\u00020\u0010J8\u0010\'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00182\b\u0010)\u001a\u0004\u0018\u00010\u00182\b\u0010*\u001a\u0004\u0018\u00010\u00182\u0006\u0010+\u001a\u00020 2\f\u0010,\u001a\b\u0018\u00010-R\u00020.R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/zoomapps/eromance/Services/NetworkCheckService/NetworkCheckSocketService;", "Landroid/app/Service;", "()V", "appConnectedToService", "", "Ljava/lang/Boolean;", "is_server_active", "()Z", "set_server_active", "(Z)V", "is_socket_connected", "set_socket_connected", "mSocket", "Lio/socket/client/Socket;", "serviceBinded", "addSocketHandlers", "", "closeSocketSession", "connect", "disconnect", "initializeSocket", "isSocketConnected", "off", "event", "", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "", "intent", "flags", "startId", "onUnbind", "registerUser", "restartSocket", "sendBigTextNotification", "title", "content", "smallText", "push_id", "data", "Lcom/zoomapps/eromance/Models/PushModels/MessageModel$MessageData;", "Lcom/zoomapps/eromance/Models/PushModels/MessageModel;", "app_debug"})
public final class NetworkCheckSocketService extends android.app.Service {
    private final java.lang.Boolean appConnectedToService = null;
    private io.socket.client.Socket mSocket;
    private final boolean serviceBinded = false;
    private boolean is_socket_connected;
    private boolean is_server_active;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent p0) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public boolean onUnbind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return false;
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void initializeSocket() {
    }
    
    private final void closeSocketSession() {
    }
    
    public final boolean is_socket_connected() {
        return false;
    }
    
    public final void set_socket_connected(boolean p0) {
    }
    
    public final boolean is_server_active() {
        return false;
    }
    
    public final void set_server_active(boolean p0) {
    }
    
    public final void registerUser() {
    }
    
    private final void addSocketHandlers() {
    }
    
    public final void connect() {
    }
    
    public final void disconnect() {
    }
    
    public final void restartSocket() {
    }
    
    public final void off(@org.jetbrains.annotations.NotNull()
    java.lang.String event) {
    }
    
    public final boolean isSocketConnected() {
        return false;
    }
    
    public final void sendBigTextNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.lang.String smallText, int push_id, @org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.PushModels.MessageModel.MessageData data) {
    }
    
    public NetworkCheckSocketService() {
        super();
    }
}