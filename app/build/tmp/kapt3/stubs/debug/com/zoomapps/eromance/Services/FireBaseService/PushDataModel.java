package com.zoomapps.eromance.Services.FireBaseService;

import java.lang.System;

/**
 * * Created by User on 18.05.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/zoomapps/eromance/Services/FireBaseService/PushDataModel;", "", "()V", "message_body", "Lcom/zoomapps/eromance/Services/FireBaseService/MessageBody;", "getMessage_body", "()Lcom/zoomapps/eromance/Services/FireBaseService/MessageBody;", "setMessage_body", "(Lcom/zoomapps/eromance/Services/FireBaseService/MessageBody;)V", "section", "", "getSection", "()Ljava/lang/String;", "setSection", "(Ljava/lang/String;)V", "type", "getType", "setType", "app_debug"})
public final class PushDataModel {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "section")
    private java.lang.String section;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "type")
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "message_body")
    private com.zoomapps.eromance.Services.FireBaseService.MessageBody message_body;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSection() {
        return null;
    }
    
    public final void setSection(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.zoomapps.eromance.Services.FireBaseService.MessageBody getMessage_body() {
        return null;
    }
    
    public final void setMessage_body(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Services.FireBaseService.MessageBody p0) {
    }
    
    public PushDataModel() {
        super();
    }
}