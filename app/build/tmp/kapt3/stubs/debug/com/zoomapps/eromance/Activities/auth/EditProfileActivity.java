package com.zoomapps.eromance.Activities.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010Y\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J*\u0010]\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010^2\u0006\u0010_\u001a\u00020&2\u0006\u0010`\u001a\u00020&2\u0006\u0010a\u001a\u00020&H\u0016J\u0006\u0010b\u001a\u00020\u001fJ\u0006\u0010c\u001a\u00020ZJ0\u0010d\u001a\u00020Z2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020/0%2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020/0%2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020/0%J\u0012\u0010h\u001a\u00020Z2\b\u0010i\u001a\u0004\u0018\u00010jH\u0014J*\u0010k\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010^2\u0006\u0010_\u001a\u00020&2\u0006\u0010l\u001a\u00020&2\u0006\u0010`\u001a\u00020&H\u0016J\u0006\u0010A\u001a\u00020ZJ\u0006\u0010m\u001a\u00020ZR\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0019\u0010)\u001a\n +*\u0004\u0018\u00010*0*\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u00010/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\u001c\u00107\u001a\u0004\u0018\u00010/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\u001c\u0010:\u001a\u0004\u0018\u00010/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00101\"\u0004\b<\u00103R\u001c\u0010=\u001a\u0004\u0018\u00010>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001b\u0010C\u001a\u00020D8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bG\u0010\t\u001a\u0004\bE\u0010FR\u001b\u0010H\u001a\u00020D8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bJ\u0010\t\u001a\u0004\bI\u0010FR\u001b\u0010K\u001a\u00020L8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bO\u0010\t\u001a\u0004\bM\u0010NR\u001b\u0010P\u001a\u00020D8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bR\u0010\t\u001a\u0004\bQ\u0010FR\u001b\u0010S\u001a\u00020L8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bU\u0010\t\u001a\u0004\bT\u0010NR\u001b\u0010V\u001a\u00020D8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bX\u0010\t\u001a\u0004\bW\u0010F\u00a8\u0006n"}, d2 = {"Lcom/zoomapps/eromance/Activities/auth/EditProfileActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Landroid/text/TextWatcher;", "()V", "btn_continion", "Landroid/widget/Button;", "getBtn_continion", "()Landroid/widget/Button;", "btn_continion$delegate", "Lkotlin/properties/ReadOnlyProperty;", "date", "Landroid/app/DatePickerDialog$OnDateSetListener;", "getDate", "()Landroid/app/DatePickerDialog$OnDateSetListener;", "setDate", "(Landroid/app/DatePickerDialog$OnDateSetListener;)V", "datePickerDialog", "Landroid/app/DatePickerDialog;", "getDatePickerDialog", "()Landroid/app/DatePickerDialog;", "setDatePickerDialog", "(Landroid/app/DatePickerDialog;)V", "etDateOfBirth", "Landroid/widget/EditText;", "getEtDateOfBirth", "()Landroid/widget/EditText;", "etDateOfBirth$delegate", "etNick", "getEtNick", "etNick$delegate", "is_Social", "", "()Ljava/lang/Boolean;", "set_Social", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "list", "", "", "getList", "()Ljava/util/List;", "myCalendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getMyCalendar", "()Ljava/util/Calendar;", "selectedCity", "", "getSelectedCity", "()Ljava/lang/String;", "setSelectedCity", "(Ljava/lang/String;)V", "selectedCountry", "getSelectedCountry", "setSelectedCountry", "selectedLookingFor", "getSelectedLookingFor", "setSelectedLookingFor", "selectedSex", "getSelectedSex", "setSelectedSex", "socialData", "Lcom/zoomapps/eromance/Models/SocialDataModel;", "getSocialData", "()Lcom/zoomapps/eromance/Models/SocialDataModel;", "setSocialData", "(Lcom/zoomapps/eromance/Models/SocialDataModel;)V", "stCity", "Lfr/ganfra/materialspinner/MaterialSpinner;", "getStCity", "()Lfr/ganfra/materialspinner/MaterialSpinner;", "stCity$delegate", "stCounty", "getStCounty", "stCounty$delegate", "stDateOfBirth", "Landroid/support/design/widget/TextInputLayout;", "getStDateOfBirth", "()Landroid/support/design/widget/TextInputLayout;", "stDateOfBirth$delegate", "stLookFor", "getStLookFor", "stLookFor$delegate", "stNick", "getStNick", "stNick$delegate", "stSex", "getStSex", "stSex$delegate", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "checkFields", "init_edittexts", "init_spinners", "countryList", "cityList", "sexList", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTextChanged", "before", "updateLabel", "app_debug"})
public final class EditProfileActivity extends android.support.v7.app.AppCompatActivity implements android.text.TextWatcher {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty stCounty$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty stCity$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty stDateOfBirth$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty etDateOfBirth$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty stNick$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty etNick$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty stSex$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty stLookFor$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btn_continion$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.app.DatePickerDialog datePickerDialog;
    private final java.util.Calendar myCalendar = null;
    @org.jetbrains.annotations.Nullable()
    private android.app.DatePickerDialog.OnDateSetListener date;
    @org.jetbrains.annotations.Nullable()
    private com.zoomapps.eromance.Models.SocialDataModel socialData;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean is_Social;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> list = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedCountry;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedCity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedSex;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedLookingFor;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.Nullable()
    android.text.Editable s) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final fr.ganfra.materialspinner.MaterialSpinner getStCounty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final fr.ganfra.materialspinner.MaterialSpinner getStCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.design.widget.TextInputLayout getStDateOfBirth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtDateOfBirth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.design.widget.TextInputLayout getStNick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtNick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final fr.ganfra.materialspinner.MaterialSpinner getStSex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final fr.ganfra.materialspinner.MaterialSpinner getStLookFor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtn_continion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.DatePickerDialog getDatePickerDialog() {
        return null;
    }
    
    public final void setDatePickerDialog(@org.jetbrains.annotations.Nullable()
    android.app.DatePickerDialog p0) {
    }
    
    public final java.util.Calendar getMyCalendar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.DatePickerDialog.OnDateSetListener getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable()
    android.app.DatePickerDialog.OnDateSetListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.zoomapps.eromance.Models.SocialDataModel getSocialData() {
        return null;
    }
    
    public final void setSocialData(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.SocialDataModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean is_Social() {
        return null;
    }
    
    public final void set_Social(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setSocialData() {
    }
    
    public final boolean checkFields() {
        return false;
    }
    
    public final void updateLabel() {
    }
    
    public final void init_edittexts() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedCountry() {
        return null;
    }
    
    public final void setSelectedCountry(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedCity() {
        return null;
    }
    
    public final void setSelectedCity(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedSex() {
        return null;
    }
    
    public final void setSelectedSex(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedLookingFor() {
        return null;
    }
    
    public final void setSelectedLookingFor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void init_spinners(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> countryList, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> cityList, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> sexList) {
    }
    
    public EditProfileActivity() {
        super();
    }
}