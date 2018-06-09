package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0014H\u0016J\u0006\u0010A\u001a\u00020*J\u0010\u0010B\u001a\u00020*2\u0006\u0010@\u001a\u00020\u0014H\u0016J\u0014\u0010C\u001a\u00020?2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00070EJ\b\u0010F\u001a\u00020?H\u0016J\u001a\u0010G\u001a\u00020?2\b\u0010H\u001a\u0004\u0018\u00010 2\u0006\u0010I\u001a\u00020\u0014H\u0016J\u0012\u0010J\u001a\u00020?2\b\u0010K\u001a\u0004\u0018\u00010LH\u0014J\b\u0010M\u001a\u00020?H\u0014J\b\u0010N\u001a\u00020?H\u0014J\u000e\u0010O\u001a\u00020?2\u0006\u0010P\u001a\u00020\u0014J\u000e\u0010Q\u001a\u00020?2\u0006\u0010P\u001a\u00020\u0014J\u0010\u0010R\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0014H\u0016J$\u0010S\u001a\u00020?2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020U2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00140ER*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R*\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0006j\b\u0012\u0004\u0012\u00020\u0014`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR\u001b\u0010\u001f\u001a\u00020 8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b!\u0010\"R\u001b\u0010$\u001a\u00020%8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u0012\u001a\u0004\b&\u0010\'R\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010+\"\u0004\b,\u0010-R\u001b\u0010.\u001a\u00020 8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\u0012\u001a\u0004\b/\u0010\"R\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00107\u001a\b\u0012\u0002\b\u0003\u0018\u000108X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00109\u001a\u00020:8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010\u0012\u001a\u0004\b;\u0010<\u00a8\u0006X"}, d2 = {"Lcom/zoomapps/eromance/Activities/CreateMeetActivity;", "Lcom/zoomapps/eromance/Activities/BaseCreateActivity;", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "Lcom/zoomapps/eromance/Interfaces/TypesAdapterInteraction;", "()V", "adapterData", "Ljava/util/ArrayList;", "Lcom/zoomapps/eromance/Models/SimpleTypeDatum;", "Lkotlin/collections/ArrayList;", "getAdapterData", "()Ljava/util/ArrayList;", "setAdapterData", "(Ljava/util/ArrayList;)V", "btn_create", "Landroid/widget/Button;", "getBtn_create", "()Landroid/widget/Button;", "btn_create$delegate", "Lkotlin/properties/ReadOnlyProperty;", "checkedPayment", "", "getCheckedPayment", "()I", "setCheckedPayment", "(I)V", "checkedTime", "getCheckedTime", "setCheckedTime", "checkedTypes", "getCheckedTypes", "setCheckedTypes", "duration_RG", "Landroid/widget/RadioGroup;", "getDuration_RG", "()Landroid/widget/RadioGroup;", "duration_RG$delegate", "duration_container", "Landroid/widget/LinearLayout;", "getDuration_container", "()Landroid/widget/LinearLayout;", "duration_container$delegate", "isStoped", "", "()Z", "setStoped", "(Z)V", "item_payment_type_RG", "getItem_payment_type_RG", "item_payment_type_RG$delegate", "loading_PD", "Landroid/app/ProgressDialog;", "getLoading_PD", "()Landroid/app/ProgressDialog;", "setLoading_PD", "(Landroid/app/ProgressDialog;)V", "mAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "search_params_RV", "Landroid/support/v7/widget/RecyclerView;", "getSearch_params_RV", "()Landroid/support/v7/widget/RecyclerView;", "search_params_RV$delegate", "addType", "", "pos", "checkFields", "checkType", "init_params_RV", "item_list", "", "onActivitySuccessResult", "onCheckedChanged", "p0", "p1", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStop", "processDurationRG", "id", "processPaymentRG", "removeType", "sendRequest", "tim", "", "pid", "tps_id", "app_debug"})
public final class CreateMeetActivity extends com.zoomapps.eromance.Activities.BaseCreateActivity implements android.widget.RadioGroup.OnCheckedChangeListener, com.zoomapps.eromance.Interfaces.TypesAdapterInteraction {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Integer> checkedTypes;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty item_payment_type_RG$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty search_params_RV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty duration_container$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty duration_RG$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btn_create$delegate = null;
    private int checkedPayment;
    private int checkedTime;
    @org.jetbrains.annotations.Nullable()
    private android.app.ProgressDialog loading_PD;
    private android.support.v7.widget.RecyclerView.Adapter<?> mAdapter;
    private boolean isStoped;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.zoomapps.eromance.Models.SimpleTypeDatum> adapterData;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getCheckedTypes() {
        return null;
    }
    
    public final void setCheckedTypes(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    @java.lang.Override()
    public void onActivitySuccessResult() {
    }
    
    @java.lang.Override()
    public void removeType(int pos) {
    }
    
    @java.lang.Override()
    public void addType(int pos) {
    }
    
    @java.lang.Override()
    public boolean checkType(int pos) {
        return false;
    }
    
    @java.lang.Override()
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable()
    android.widget.RadioGroup p0, int p1) {
    }
    
    public final void processPaymentRG(int id) {
    }
    
    public final void processDurationRG(int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RadioGroup getItem_payment_type_RG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getSearch_params_RV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getDuration_container() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RadioGroup getDuration_RG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtn_create() {
        return null;
    }
    
    public final int getCheckedPayment() {
        return 0;
    }
    
    public final void setCheckedPayment(int p0) {
    }
    
    public final int getCheckedTime() {
        return 0;
    }
    
    public final void setCheckedTime(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.ProgressDialog getLoading_PD() {
        return null;
    }
    
    public final void setLoading_PD(@org.jetbrains.annotations.Nullable()
    android.app.ProgressDialog p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final boolean checkFields() {
        return false;
    }
    
    public final void sendRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String tim, @org.jetbrains.annotations.NotNull()
    java.lang.String pid, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> tps_id) {
    }
    
    public final boolean isStoped() {
        return false;
    }
    
    public final void setStoped(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.zoomapps.eromance.Models.SimpleTypeDatum> getAdapterData() {
        return null;
    }
    
    public final void setAdapterData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.zoomapps.eromance.Models.SimpleTypeDatum> p0) {
    }
    
    public final void init_params_RV(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.SimpleTypeDatum> item_list) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public CreateMeetActivity() {
        super();
    }
}