package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0014J\b\u00108\u001a\u000205H\u0016J\b\u00109\u001a\u000205H\u0016J\u001c\u0010:\u001a\u0002052\u0012\u0010\n\u001a\u000e\u0012\b\u0012\u00060\fR\u00020\r\u0018\u00010\u000bH\u0016J\u001a\u0010;\u001a\u0002052\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020?R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R&\u0010\n\u001a\u000e\u0012\b\u0012\u00060\fR\u00020\r\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001b\u0010&\u001a\u00020\'8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010\t\u001a\u0004\b-\u0010.R\u0011\u00100\u001a\u000201\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103\u00a8\u0006@"}, d2 = {"Lcom/zoomapps/eromance/Activities/UserNotificationEventsActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/zoomapps/eromance/Interfaces/IUserNotificationEventsView;", "()V", "content_helper_LL", "Landroid/widget/LinearLayout;", "getContent_helper_LL", "()Landroid/widget/LinearLayout;", "content_helper_LL$delegate", "Lkotlin/properties/ReadOnlyProperty;", "dataList", "", "Lcom/zoomapps/eromance/Models/Notifications_Event_List_Model$Datum;", "Lcom/zoomapps/eromance/Models/Notifications_Event_List_Model;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "helper_BTN", "Landroid/widget/Button;", "getHelper_BTN", "()Landroid/widget/Button;", "helper_BTN$delegate", "loading_PB", "Landroid/widget/ProgressBar;", "getLoading_PB", "()Landroid/widget/ProgressBar;", "loading_PB$delegate", "mAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "getMAdapter", "()Landroid/support/v7/widget/RecyclerView$Adapter;", "setMAdapter", "(Landroid/support/v7/widget/RecyclerView$Adapter;)V", "mLL_Manager", "Landroid/support/v7/widget/LinearLayoutManager;", "getMLL_Manager", "()Landroid/support/v7/widget/LinearLayoutManager;", "notif_list_rv", "Landroid/support/v7/widget/RecyclerView;", "getNotif_list_rv", "()Landroid/support/v7/widget/RecyclerView;", "notif_list_rv$delegate", "statusMessage_TV", "Landroid/widget/TextView;", "getStatusMessage_TV", "()Landroid/widget/TextView;", "statusMessage_TV$delegate", "userNotifPresenter", "Lcom/zoomapps/eromance/Helpers/UserNotificationEventsPresenter;", "getUserNotifPresenter", "()Lcom/zoomapps/eromance/Helpers/UserNotificationEventsPresenter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onEmpty", "onError", "onLoaded", "setViewInfo", "msg", "", "is_type_error", "", "app_debug"})
public final class UserNotificationEventsActivity extends android.support.v7.app.AppCompatActivity implements com.zoomapps.eromance.Interfaces.IUserNotificationEventsView {
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Helpers.UserNotificationEventsPresenter userNotifPresenter = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty loading_PB$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty notif_list_rv$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty statusMessage_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty helper_BTN$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty content_helper_LL$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.RecyclerView.Adapter<?> mAdapter;
    @org.jetbrains.annotations.NotNull()
    private final android.support.v7.widget.LinearLayoutManager mLL_Manager = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.zoomapps.eromance.Models.Notifications_Event_List_Model.Datum> dataList;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onLoaded(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.Notifications_Event_List_Model.Datum> dataList) {
    }
    
    @java.lang.Override()
    public void onError() {
    }
    
    @java.lang.Override()
    public void onEmpty() {
    }
    
    public final void setViewInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, boolean is_type_error) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Helpers.UserNotificationEventsPresenter getUserNotifPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getLoading_PB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getNotif_list_rv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getStatusMessage_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getHelper_BTN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getContent_helper_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.widget.RecyclerView.Adapter<?> getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.RecyclerView.Adapter<?> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.LinearLayoutManager getMLL_Manager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.Notifications_Event_List_Model.Datum> getDataList() {
        return null;
    }
    
    public final void setDataList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.Notifications_Event_List_Model.Datum> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public UserNotificationEventsActivity() {
        super();
    }
}