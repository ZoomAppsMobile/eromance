package com.zoomapps.eromance.Helpers;

import java.lang.System;

/**
 * * Created by Asus on 15.03.2018.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010&\u001a\u00020\'J\b\u0010(\u001a\u00020\'H\u0002J\u001a\u0010)\u001a\u00020\'2\u0006\u0010*\u001a\u00020\u00152\b\b\u0002\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020\'H\u0002J\u0006\u0010-\u001a\u00020\'R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006."}, d2 = {"Lcom/zoomapps/eromance/Helpers/MeetDitailPresenterActivity;", "", "viewInterface", "Lcom/zoomapps/eromance/Interfaces/IMeetDetailsView;", "mMeetId", "", "type", "", "activity", "Lcom/zoomapps/eromance/Activities/MomentalMeetsActivity;", "(Lcom/zoomapps/eromance/Interfaces/IMeetDetailsView;ILjava/lang/String;Lcom/zoomapps/eromance/Activities/MomentalMeetsActivity;)V", "getActivity", "()Lcom/zoomapps/eromance/Activities/MomentalMeetsActivity;", "apiService", "Lcom/zoomapps/eromance/API/API_Interface;", "kotlin.jvm.PlatformType", "getApiService", "()Lcom/zoomapps/eromance/API/API_Interface;", "interaction_id", "Ljava/lang/Integer;", "isConnected", "", "isConnectionCheck", "()Z", "setConnectionCheck", "(Z)V", "isDialogDestroyed", "setDialogDestroyed", "getMMeetId", "()I", "setMMeetId", "(I)V", "getType", "()Ljava/lang/String;", "getViewInterface", "()Lcom/zoomapps/eromance/Interfaces/IMeetDetailsView;", "setViewInterface", "(Lcom/zoomapps/eromance/Interfaces/IMeetDetailsView;)V", "checkConnection", "", "connectToMeet", "connectionCallback", "status", "isBlocked", "disConnectFromMeet", "makeAction", "app_debug"})
public final class MeetDitailPresenterActivity {
    private boolean isConnected;
    private java.lang.Integer interaction_id;
    private boolean isDialogDestroyed;
    private boolean isConnectionCheck;
    private final com.zoomapps.eromance.API.API_Interface apiService = null;
    @org.jetbrains.annotations.NotNull()
    private com.zoomapps.eromance.Interfaces.IMeetDetailsView viewInterface;
    private int mMeetId;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Activities.MomentalMeetsActivity activity = null;
    
    public final boolean isDialogDestroyed() {
        return false;
    }
    
    public final void setDialogDestroyed(boolean p0) {
    }
    
    public final boolean isConnectionCheck() {
        return false;
    }
    
    public final void setConnectionCheck(boolean p0) {
    }
    
    public final com.zoomapps.eromance.API.API_Interface getApiService() {
        return null;
    }
    
    public final void checkConnection() {
    }
    
    private final void connectionCallback(boolean status, boolean isBlocked) {
    }
    
    public final void makeAction() {
    }
    
    private final void connectToMeet() {
    }
    
    private final void disConnectFromMeet() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Interfaces.IMeetDetailsView getViewInterface() {
        return null;
    }
    
    public final void setViewInterface(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Interfaces.IMeetDetailsView p0) {
    }
    
    public final int getMMeetId() {
        return 0;
    }
    
    public final void setMMeetId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Activities.MomentalMeetsActivity getActivity() {
        return null;
    }
    
    public MeetDitailPresenterActivity(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Interfaces.IMeetDetailsView viewInterface, int mMeetId, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Activities.MomentalMeetsActivity activity) {
        super();
    }
}