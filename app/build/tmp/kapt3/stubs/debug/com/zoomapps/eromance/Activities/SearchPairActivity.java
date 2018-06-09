package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001J\u001b\u0010\u008b\u0001\u001a\u00020\u00042\u0007\u0010\u008c\u0001\u001a\u00020\u000e2\t\b\u0002\u0010\u008d\u0001\u001a\u00020\u0004J\u0016\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0u2\u0007\u0010\u008d\u0001\u001a\u00020\u0004J\b\u0010\u008f\u0001\u001a\u00030\u008a\u0001J\n\u0010\u0090\u0001\u001a\u00030\u008a\u0001H\u0002J\u0016\u0010\u0091\u0001\u001a\u00030\u008a\u00012\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0014J\u0017\u0010\u0094\u0001\u001a\u00030\u008a\u00012\r\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020v0uJ\b\u0010\u0096\u0001\u001a\u00030\u008a\u0001J\b\u0010\u0097\u0001\u001a\u00030\u008a\u0001J\b\u0010\u0098\u0001\u001a\u00030\u008a\u0001J\b\u0010\u0099\u0001\u001a\u00030\u008a\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001b\u0010\u001c\u001a\u00020\u001d8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020\u001d8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001fR\u001e\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u000207X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00108\"\u0004\b9\u0010:R\u0013\u0010;\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b;\u0010\'R\u001c\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001b\u0010B\u001a\u00020C8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bF\u0010!\u001a\u0004\bD\u0010ER\u001b\u0010G\u001a\u00020C8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bI\u0010!\u001a\u0004\bH\u0010ER\u001b\u0010J\u001a\u00020C8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bL\u0010!\u001a\u0004\bK\u0010ER\u001b\u0010M\u001a\u00020C8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bO\u0010!\u001a\u0004\bN\u0010ER\u001b\u0010P\u001a\u00020C8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bR\u0010!\u001a\u0004\bQ\u0010ER\u001b\u0010S\u001a\u00020T8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\bW\u0010!\u001a\u0004\bU\u0010VR\u001b\u0010X\u001a\u00020T8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\bZ\u0010!\u001a\u0004\bY\u0010VR\u001b\u0010[\u001a\u00020\\8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b_\u0010!\u001a\u0004\b]\u0010^R\u001b\u0010`\u001a\u00020\\8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bb\u0010!\u001a\u0004\ba\u0010^R\u001b\u0010c\u001a\u00020d8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bg\u0010!\u001a\u0004\be\u0010fR\u001e\u0010h\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\bi\u0010\'\"\u0004\bj\u0010)R\u001e\u0010k\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\bl\u0010\'\"\u0004\bm\u0010)R\u001e\u0010n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\bo\u0010\'\"\u0004\bp\u0010)R\u001e\u0010q\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\br\u0010\'\"\u0004\bs\u0010)R\"\u0010t\u001a\n\u0012\u0004\u0012\u00020v\u0018\u00010uX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001b\u0010{\u001a\u00020|8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u007f\u0010!\u001a\u0004\b}\u0010~R\u001e\u0010\u0080\u0001\u001a\u00020|8@X\u0080\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0082\u0001\u0010!\u001a\u0005\b\u0081\u0001\u0010~R\u001e\u0010\u0083\u0001\u001a\u00020|8@X\u0080\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0085\u0001\u0010!\u001a\u0005\b\u0084\u0001\u0010~R\u001e\u0010\u0086\u0001\u001a\u00020|8@X\u0080\u0084\u0002\u00a2\u0006\u000e\n\u0005\b\u0088\u0001\u0010!\u001a\u0005\b\u0087\u0001\u0010~\u00a8\u0006\u009a\u0001"}, d2 = {"Lcom/zoomapps/eromance/Activities/SearchPairActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "ageFrom", "", "getAgeFrom", "()I", "setAgeFrom", "(I)V", "ageTo", "getAgeTo", "setAgeTo", "arrayMs_acquainted", "Landroid/widget/ArrayAdapter;", "", "getArrayMs_acquainted$app_debug", "()Landroid/widget/ArrayAdapter;", "setArrayMs_acquainted$app_debug", "(Landroid/widget/ArrayAdapter;)V", "arrayMs_apperance", "getArrayMs_apperance$app_debug", "setArrayMs_apperance$app_debug", "arrayMs_city", "getArrayMs_city$app_debug", "setArrayMs_city$app_debug", "arrayMs_country", "getArrayMs_country$app_debug", "setArrayMs_country$app_debug", "cb_add_setting", "Landroid/widget/CheckBox;", "getCb_add_setting", "()Landroid/widget/CheckBox;", "cb_add_setting$delegate", "Lkotlin/properties/ReadOnlyProperty;", "cb_online_user", "getCb_online_user", "cb_online_user$delegate", "checked_city", "getChecked_city", "()Ljava/lang/Integer;", "setChecked_city", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "clear_IV", "Landroid/widget/ImageView;", "getClear_IV", "()Landroid/widget/ImageView;", "clear_IV$delegate", "heightFrom", "getHeightFrom", "setHeightFrom", "heightTo", "getHeightTo", "setHeightTo", "isOnlineUser_search", "", "()Z", "setOnlineUser_search", "(Z)V", "is_online", "loadingPD", "Landroid/app/ProgressDialog;", "getLoadingPD", "()Landroid/app/ProgressDialog;", "setLoadingPD", "(Landroid/app/ProgressDialog;)V", "ms_acquainted", "Lfr/ganfra/materialspinner/MaterialSpinner;", "getMs_acquainted", "()Lfr/ganfra/materialspinner/MaterialSpinner;", "ms_acquainted$delegate", "ms_city", "getMs_city", "ms_city$delegate", "ms_country", "getMs_country", "ms_country$delegate", "ms_target", "getMs_target", "ms_target$delegate", "ms_type_appearance", "getMs_type_appearance", "ms_type_appearance$delegate", "rangebarAge", "Lcom/appyvet/rangebar/RangeBar;", "getRangebarAge$app_debug", "()Lcom/appyvet/rangebar/RangeBar;", "rangebarAge$delegate", "rangebarHight", "getRangebarHight$app_debug", "rangebarHight$delegate", "rb_all", "Landroid/widget/RadioButton;", "getRb_all", "()Landroid/widget/RadioButton;", "rb_all$delegate", "rb_my_city", "getRb_my_city", "rb_my_city$delegate", "search_btn", "Landroid/widget/Button;", "getSearch_btn", "()Landroid/widget/Button;", "search_btn$delegate", "selectedCity", "getSelectedCity", "setSelectedCity", "selectedComplection", "getSelectedComplection", "setSelectedComplection", "selectedCountry", "getSelectedCountry", "setSelectedCountry", "selectedSex", "getSelectedSex", "setSelectedSex", "spinnerDataList", "", "Lcom/zoomapps/eromance/Models/QuessionariesValuesDatum;", "getSpinnerDataList", "()Ljava/util/List;", "setSpinnerDataList", "(Ljava/util/List;)V", "tvTickEndAge", "Landroid/widget/TextView;", "getTvTickEndAge$app_debug", "()Landroid/widget/TextView;", "tvTickEndAge$delegate", "tvTickEndHight", "getTvTickEndHight$app_debug", "tvTickEndHight$delegate", "tvTickStartAge", "getTvTickStartAge$app_debug", "tvTickStartAge$delegate", "tvTickStartHight", "getTvTickStartHight$app_debug", "tvTickStartHight$delegate", "clearFields", "", "getIdFromKey", "key", "group_id", "getIntList", "getSpinnerValues", "initRangeBar", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "processSeekBar", "datalist", "searchStart", "setBtnClicks", "setCheckBoxes", "setRadioBts", "app_debug"})
public final class SearchPairActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty rangebarHight$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty rangebarAge$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tvTickStartHight$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tvTickEndHight$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tvTickStartAge$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tvTickEndAge$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty rb_all$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty rb_my_city$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty ms_acquainted$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty ms_target$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty ms_country$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty ms_city$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty ms_type_appearance$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty cb_add_setting$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty cb_online_user$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty search_btn$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty clear_IV$delegate = null;
    private int heightFrom;
    private int heightTo;
    private int ageFrom;
    private int ageTo;
    @org.jetbrains.annotations.Nullable()
    private android.app.ProgressDialog loadingPD;
    private boolean isOnlineUser_search;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer checked_city;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.String> arrayMs_acquainted;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.String> arrayMs_city;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.String> arrayMs_country;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.String> arrayMs_apperance;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends com.zoomapps.eromance.Models.QuessionariesValuesDatum> spinnerDataList;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer selectedSex;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer selectedCity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer selectedCountry;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer selectedComplection;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.appyvet.rangebar.RangeBar getRangebarHight$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.appyvet.rangebar.RangeBar getRangebarAge$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvTickStartHight$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvTickEndHight$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvTickStartAge$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvTickEndAge$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RadioButton getRb_all() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RadioButton getRb_my_city() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final fr.ganfra.materialspinner.MaterialSpinner getMs_acquainted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final fr.ganfra.materialspinner.MaterialSpinner getMs_target() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final fr.ganfra.materialspinner.MaterialSpinner getMs_country() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final fr.ganfra.materialspinner.MaterialSpinner getMs_city() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final fr.ganfra.materialspinner.MaterialSpinner getMs_type_appearance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.CheckBox getCb_add_setting() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.CheckBox getCb_online_user() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getSearch_btn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getClear_IV() {
        return null;
    }
    
    public final int getHeightFrom() {
        return 0;
    }
    
    public final void setHeightFrom(int p0) {
    }
    
    public final int getHeightTo() {
        return 0;
    }
    
    public final void setHeightTo(int p0) {
    }
    
    public final int getAgeFrom() {
        return 0;
    }
    
    public final void setAgeFrom(int p0) {
    }
    
    public final int getAgeTo() {
        return 0;
    }
    
    public final void setAgeTo(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.ProgressDialog getLoadingPD() {
        return null;
    }
    
    public final void setLoadingPD(@org.jetbrains.annotations.Nullable()
    android.app.ProgressDialog p0) {
    }
    
    public final boolean isOnlineUser_search() {
        return false;
    }
    
    public final void setOnlineUser_search(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getChecked_city() {
        return null;
    }
    
    public final void setChecked_city(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void clearFields() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.String> getArrayMs_acquainted$app_debug() {
        return null;
    }
    
    public final void setArrayMs_acquainted$app_debug(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.String> getArrayMs_city$app_debug() {
        return null;
    }
    
    public final void setArrayMs_city$app_debug(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.String> getArrayMs_country$app_debug() {
        return null;
    }
    
    public final void setArrayMs_country$app_debug(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.String> getArrayMs_apperance$app_debug() {
        return null;
    }
    
    public final void setArrayMs_apperance$app_debug(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.zoomapps.eromance.Models.QuessionariesValuesDatum> getSpinnerDataList() {
        return null;
    }
    
    public final void setSpinnerDataList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends com.zoomapps.eromance.Models.QuessionariesValuesDatum> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getIntList(int group_id) {
        return null;
    }
    
    public final int getIdFromKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int group_id) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSelectedSex() {
        return null;
    }
    
    public final void setSelectedSex(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSelectedCity() {
        return null;
    }
    
    public final void setSelectedCity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSelectedCountry() {
        return null;
    }
    
    public final void setSelectedCountry(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSelectedComplection() {
        return null;
    }
    
    public final void setSelectedComplection(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final void processSeekBar(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.zoomapps.eromance.Models.QuessionariesValuesDatum> datalist) {
    }
    
    public final void setCheckBoxes() {
    }
    
    public final void setRadioBts() {
    }
    
    public final void setBtnClicks() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer is_online() {
        return null;
    }
    
    public final void searchStart() {
    }
    
    private final void initRangeBar() {
    }
    
    public final void getSpinnerValues() {
    }
    
    public SearchPairActivity() {
        super();
    }
}