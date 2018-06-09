package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u001a\u00102\u001a\u00020/2\u0010\u00103\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u000704H\u0016J\u0010\u00105\u001a\u00020/2\u0006\u00106\u001a\u000207H\u0016J\u0016\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000207J\u0018\u0010<\u001a\u00020/2\u0010\u00103\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u000704R$\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\u0011\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u0011\u001a\u0004\b&\u0010\'R\u001b\u0010)\u001a\u00020*8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b-\u0010\u0011\u001a\u0004\b+\u0010,\u00a8\u0006="}, d2 = {"Lcom/zoomapps/eromance/Activities/SearchUserActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/zoomapps/eromance/Interfaces/ISearchUserView;", "()V", "adapterData", "Ljava/util/ArrayList;", "Lcom/zoomapps/eromance/Models/UserRateModel$Datum;", "Lcom/zoomapps/eromance/Models/UserRateModel;", "getAdapterData", "()Ljava/util/ArrayList;", "setAdapterData", "(Ljava/util/ArrayList;)V", "female_RB", "Landroid/widget/RadioButton;", "getFemale_RB", "()Landroid/widget/RadioButton;", "female_RB$delegate", "Lkotlin/properties/ReadOnlyProperty;", "mAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "getMAdapter", "()Landroid/support/v7/widget/RecyclerView$Adapter;", "setMAdapter", "(Landroid/support/v7/widget/RecyclerView$Adapter;)V", "male_RB", "getMale_RB", "male_RB$delegate", "presenter", "Lcom/zoomapps/eromance/Helpers/SearchUserPresenter;", "getPresenter", "()Lcom/zoomapps/eromance/Helpers/SearchUserPresenter;", "search_ED", "Landroid/widget/EditText;", "getSearch_ED", "()Landroid/widget/EditText;", "search_ED$delegate", "search_result_RV", "Landroid/support/v7/widget/RecyclerView;", "getSearch_result_RV", "()Landroid/support/v7/widget/RecyclerView;", "search_result_RV$delegate", "startSearching_BTN", "Landroid/widget/Button;", "getStartSearching_BTN", "()Landroid/widget/Button;", "startSearching_BTN$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDataLoaded", "datum", "", "onLoadError", "msg", "", "selectUserAndFinish", "uid", "", "name", "setRV", "app_debug"})
public final class SearchUserActivity extends android.support.v7.app.AppCompatActivity implements com.zoomapps.eromance.Interfaces.ISearchUserView {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty search_result_RV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty male_RB$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty female_RB$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty startSearching_BTN$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty search_ED$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.zoomapps.eromance.Models.UserRateModel.Datum> adapterData;
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.RecyclerView.Adapter<?> mAdapter;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Helpers.SearchUserPresenter presenter = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onDataLoaded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.UserRateModel.Datum> datum) {
    }
    
    @java.lang.Override()
    public void onLoadError(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getSearch_result_RV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RadioButton getMale_RB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RadioButton getFemale_RB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getStartSearching_BTN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getSearch_ED() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.zoomapps.eromance.Models.UserRateModel.Datum> getAdapterData() {
        return null;
    }
    
    public final void setAdapterData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.zoomapps.eromance.Models.UserRateModel.Datum> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.widget.RecyclerView.Adapter<?> getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.RecyclerView.Adapter<?> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Helpers.SearchUserPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setRV(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.UserRateModel.Datum> datum) {
    }
    
    public final void selectUserAndFinish(int uid, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public SearchUserActivity() {
        super();
    }
}