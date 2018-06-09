package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\"\u001a\u00020#2\u0010\u0010$\u001a\f\u0012\b\u0012\u00060\u0018R\u00020\u00190%J\u0012\u0010&\u001a\u00020#2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020#H\u0016J\u001a\u0010*\u001a\u00020#2\u0010\u0010$\u001a\f\u0012\b\u0012\u00060\u0018R\u00020\u00190%H\u0016J\b\u0010+\u001a\u00020#H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u000e\u0012\b\u0012\u00060\u0018R\u00020\u0019\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u0006,"}, d2 = {"Lcom/zoomapps/eromance/Activities/DialogsActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/zoomapps/eromance/Interfaces/DialogsView;", "()V", "dialogs_list_RV", "Landroid/support/v7/widget/RecyclerView;", "getDialogs_list_RV", "()Landroid/support/v7/widget/RecyclerView;", "dialogs_list_RV$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ll_manager", "Landroid/support/v7/widget/LinearLayoutManager;", "getLl_manager", "()Landroid/support/v7/widget/LinearLayoutManager;", "setLl_manager", "(Landroid/support/v7/widget/LinearLayoutManager;)V", "mAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "getMAdapter", "()Landroid/support/v7/widget/RecyclerView$Adapter;", "setMAdapter", "(Landroid/support/v7/widget/RecyclerView$Adapter;)V", "mainDataList", "", "Lcom/zoomapps/eromance/Models/DialogsModel$Datum;", "Lcom/zoomapps/eromance/Models/DialogsModel;", "getMainDataList", "()Ljava/util/List;", "setMainDataList", "(Ljava/util/List;)V", "presenter", "Lcom/zoomapps/eromance/Helpers/DialogsPresenter;", "getPresenter", "()Lcom/zoomapps/eromance/Helpers/DialogsPresenter;", "init_RV", "", "datalist", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDataEmpty", "onLoaded", "onLoadingError", "app_debug"})
public final class DialogsActivity extends android.support.v7.app.AppCompatActivity implements com.zoomapps.eromance.Interfaces.DialogsView {
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Helpers.DialogsPresenter presenter = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.zoomapps.eromance.Models.DialogsModel.Datum> mainDataList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty dialogs_list_RV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private android.support.v7.widget.LinearLayoutManager ll_manager;
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.RecyclerView.Adapter<?> mAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.DialogsModel.Datum> datalist) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Helpers.DialogsPresenter getPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.DialogsModel.Datum> getMainDataList() {
        return null;
    }
    
    public final void setMainDataList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.DialogsModel.Datum> p0) {
    }
    
    public final void init_RV(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.DialogsModel.Datum> datalist) {
    }
    
    @java.lang.Override()
    public void onLoadingError() {
    }
    
    @java.lang.Override()
    public void onDataEmpty() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getDialogs_list_RV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.LinearLayoutManager getLl_manager() {
        return null;
    }
    
    public final void setLl_manager(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.LinearLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.widget.RecyclerView.Adapter<?> getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.RecyclerView.Adapter<?> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public DialogsActivity() {
        super();
    }
}