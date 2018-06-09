package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u0016H\u0016J\u0006\u0010^\u001a\u00020_J\u0010\u0010`\u001a\u00020_2\u0006\u0010]\u001a\u00020\u0016H\u0016J\u0010\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020bH\u0002J\u0006\u0010d\u001a\u00020\\J\u0014\u0010e\u001a\u00020\\2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\n0gJ\u001a\u0010h\u001a\u00020\\2\b\u0010i\u001a\u0004\u0018\u00010D2\u0006\u0010j\u001a\u00020\u0016H\u0016J\u0012\u0010k\u001a\u00020\\2\b\u0010i\u001a\u0004\u0018\u00010lH\u0016J\u0012\u0010m\u001a\u00020\\2\b\u0010n\u001a\u0004\u0018\u00010oH\u0014J*\u0010p\u001a\u00020\\2\b\u0010i\u001a\u0004\u0018\u00010q2\u0006\u0010j\u001a\u00020\u00162\u0006\u0010r\u001a\u00020\u00162\u0006\u0010s\u001a\u00020\u0016H\u0016J\"\u0010t\u001a\u00020\\2\b\u0010i\u001a\u0004\u0018\u00010u2\u0006\u0010j\u001a\u00020\u00162\u0006\u0010r\u001a\u00020\u0016H\u0016J\u000e\u0010v\u001a\u00020\\2\u0006\u0010w\u001a\u00020\u0016J\u0010\u0010x\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u0016H\u0016J\u0006\u0010y\u001a\u00020\\J\u000e\u0010z\u001a\u00020\\2\u0006\u0010{\u001a\u00020\u001fJ\u000e\u0010|\u001a\u00020\\2\u0006\u0010}\u001a\u00020\u001fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001c\u0010\'\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001b\u0010-\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\u0014\u001a\u0004\b/\u00100R\u001c\u00102\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R\u001b\u00105\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010\u0014\u001a\u0004\b6\u00100R\u001b\u00108\u001a\u00020.8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010\u0014\u001a\u0004\b9\u00100R\u001b\u0010;\u001a\u00020<8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b?\u0010\u0014\u001a\u0004\b=\u0010>R\u001b\u0010@\u001a\u00020<8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bB\u0010\u0014\u001a\u0004\bA\u0010>R\u001b\u0010C\u001a\u00020D8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bG\u0010\u0014\u001a\u0004\bE\u0010FR\u001c\u0010H\u001a\u0004\u0018\u00010IX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0014\u0010N\u001a\b\u0012\u0002\b\u0003\u0018\u00010OX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010P\u001a\u00020Q8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bT\u0010\u0014\u001a\u0004\bR\u0010SR\u001b\u0010U\u001a\u00020<8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bW\u0010\u0014\u001a\u0004\bV\u0010>R\u001b\u0010X\u001a\u00020<8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bZ\u0010\u0014\u001a\u0004\bY\u0010>\u00a8\u0006~"}, d2 = {"Lcom/zoomapps/eromance/Activities/EveningsCreateActivity;", "Lcom/zoomapps/eromance/Activities/BaseCreateActivity;", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "Landroid/view/View$OnClickListener;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "Landroid/app/TimePickerDialog$OnTimeSetListener;", "Lcom/zoomapps/eromance/Interfaces/TypesAdapterInteraction;", "()V", "adapterData", "Ljava/util/ArrayList;", "Lcom/zoomapps/eromance/Models/SimpleTypeDatum;", "getAdapterData", "()Ljava/util/ArrayList;", "setAdapterData", "(Ljava/util/ArrayList;)V", "btn_create", "Landroid/widget/Button;", "getBtn_create", "()Landroid/widget/Button;", "btn_create$delegate", "Lkotlin/properties/ReadOnlyProperty;", "checkedPayment", "", "getCheckedPayment", "()I", "setCheckedPayment", "(I)V", "checkedTime", "getCheckedTime", "setCheckedTime", "clickedType", "", "getClickedType", "()Ljava/lang/String;", "setClickedType", "(Ljava/lang/String;)V", "clickedTypesList", "getClickedTypesList", "setClickedTypesList", "dateFromCalendar", "Ljava/util/Calendar;", "getDateFromCalendar", "()Ljava/util/Calendar;", "setDateFromCalendar", "(Ljava/util/Calendar;)V", "dateFrom_LL", "Landroid/widget/LinearLayout;", "getDateFrom_LL", "()Landroid/widget/LinearLayout;", "dateFrom_LL$delegate", "dateToCalendar", "getDateToCalendar", "setDateToCalendar", "dateTo_LL", "getDateTo_LL", "dateTo_LL$delegate", "duration_container", "getDuration_container", "duration_container$delegate", "from_date_tv", "Landroid/widget/TextView;", "getFrom_date_tv", "()Landroid/widget/TextView;", "from_date_tv$delegate", "from_time_tv", "getFrom_time_tv", "from_time_tv$delegate", "item_payment_type_RG", "Landroid/widget/RadioGroup;", "getItem_payment_type_RG", "()Landroid/widget/RadioGroup;", "item_payment_type_RG$delegate", "loading_PD", "Landroid/app/ProgressDialog;", "getLoading_PD", "()Landroid/app/ProgressDialog;", "setLoading_PD", "(Landroid/app/ProgressDialog;)V", "mAdapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "search_params_RV", "Landroid/support/v7/widget/RecyclerView;", "getSearch_params_RV", "()Landroid/support/v7/widget/RecyclerView;", "search_params_RV$delegate", "to_date_tv", "getTo_date_tv", "to_date_tv$delegate", "to_time_tv", "getTo_time_tv", "to_time_tv$delegate", "addType", "", "pos", "checkFields", "", "checkType", "cvtToGmt", "Ljava/util/Date;", "date", "init_date_clicks", "init_params_RV", "item_list", "", "onCheckedChanged", "p0", "p1", "onClick", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDateSet", "Landroid/widget/DatePicker;", "p2", "p3", "onTimeSet", "Landroid/widget/TimePicker;", "processPaymentRG", "id", "removeType", "sendRequest", "showTimePicker", "type", "updateLabel", "time_type", "app_debug"})
public final class EveningsCreateActivity extends com.zoomapps.eromance.Activities.BaseCreateActivity implements android.widget.RadioGroup.OnCheckedChangeListener, android.view.View.OnClickListener, android.app.DatePickerDialog.OnDateSetListener, android.app.TimePickerDialog.OnTimeSetListener, com.zoomapps.eromance.Interfaces.TypesAdapterInteraction {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Integer> clickedTypesList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedType;
    @org.jetbrains.annotations.Nullable()
    private java.util.Calendar dateFromCalendar;
    @org.jetbrains.annotations.Nullable()
    private java.util.Calendar dateToCalendar;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty to_date_tv$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty to_time_tv$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty from_date_tv$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty from_time_tv$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty item_payment_type_RG$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty search_params_RV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty duration_container$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btn_create$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty dateFrom_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty dateTo_LL$delegate = null;
    private int checkedPayment;
    private int checkedTime;
    @org.jetbrains.annotations.Nullable()
    private android.app.ProgressDialog loading_PD;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.zoomapps.eromance.Models.SimpleTypeDatum> adapterData;
    private android.support.v7.widget.RecyclerView.Adapter<?> mAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void addType(int pos) {
    }
    
    @java.lang.Override()
    public boolean checkType(int pos) {
        return false;
    }
    
    @java.lang.Override()
    public void removeType(int pos) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getClickedTypesList() {
        return null;
    }
    
    public final void setClickedTypesList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    @java.lang.Override()
    public void onTimeSet(@org.jetbrains.annotations.Nullable()
    android.widget.TimePicker p0, int p1, int p2) {
    }
    
    public final void showTimePicker(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    @java.lang.Override()
    public void onDateSet(@org.jetbrains.annotations.Nullable()
    android.widget.DatePicker p0, int p1, int p2, int p3) {
    }
    
    public final void updateLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String time_type) {
    }
    
    private final java.util.Date cvtToGmt(java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedType() {
        return null;
    }
    
    public final void setClickedType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Calendar getDateFromCalendar() {
        return null;
    }
    
    public final void setDateFromCalendar(@org.jetbrains.annotations.Nullable()
    java.util.Calendar p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Calendar getDateToCalendar() {
        return null;
    }
    
    public final void setDateToCalendar(@org.jetbrains.annotations.Nullable()
    java.util.Calendar p0) {
    }
    
    @java.lang.Override()
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable()
    android.widget.RadioGroup p0, int p1) {
    }
    
    public final void processPaymentRG(int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTo_date_tv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTo_time_tv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getFrom_date_tv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getFrom_time_tv() {
        return null;
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
    public final android.widget.Button getBtn_create() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getDateFrom_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getDateTo_LL() {
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
    
    public final void init_date_clicks() {
    }
    
    public final boolean checkFields() {
        return false;
    }
    
    public final void sendRequest() {
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
    
    public EveningsCreateActivity() {
        super();
    }
}