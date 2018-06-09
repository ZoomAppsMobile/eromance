package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020FJ\u0010\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010\u0017J!\u0010K\u001a\u00020I2\u0012\u0010L\u001a\u000e\u0012\b\u0012\u00060NR\u00020O\u0018\u00010MH\u0000\u00a2\u0006\u0002\bPJ\u0012\u0010Q\u001a\u00020I2\b\u0010R\u001a\u0004\u0018\u00010SH\u0014J\u0014\u0010T\u001a\u00020I2\f\u0010U\u001a\b\u0018\u00010VR\u00020OJ)\u0010W\u001a\u00020I2\b\u0010X\u001a\u0004\u0018\u00010\u00172\b\u0010Y\u001a\u0004\u0018\u00010F2\b\u0010Z\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010[JE\u0010\\\u001a\u00020I2\b\u0010]\u001a\u0004\u0018\u00010F2\u0010\u0010^\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010F\u0018\u00010M2\b\u0010_\u001a\u0004\u0018\u00010\u00172\b\u0010`\u001a\u0004\u0018\u00010\u00172\b\u0010a\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010bJ\u0010\u0010c\u001a\u00020I2\b\u0010d\u001a\u0004\u0018\u00010\u0017J\'\u0010e\u001a\u00020I2\b\u0010f\u001a\u0004\u0018\u00010g2\b\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010i\u001a\u00020\u0017\u00a2\u0006\u0002\u0010jJ\u0010\u0010k\u001a\u00020I2\b\u0010l\u001a\u0004\u0018\u00010\u0017J\u0012\u0010m\u001a\u00020I2\n\u0010U\u001a\u00060VR\u00020OJ\b\u0010n\u001a\u00020IH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\r8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001b\u0010(\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b)\u0010\u0006R\u001c\u0010+\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001b\u0010.\u001a\u00020/8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u0010\b\u001a\u0004\b0\u00101R\u001b\u00103\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b5\u0010\b\u001a\u0004\b4\u0010\u0014R\u001b\u00106\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010\b\u001a\u0004\b7\u0010\u0006R\u001b\u00109\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b;\u0010\b\u001a\u0004\b:\u0010\u0006R\u001b\u0010<\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b>\u0010\b\u001a\u0004\b=\u0010\u0006R\u001b\u0010?\u001a\u00020\u00048@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010\b\u001a\u0004\b@\u0010\u0006R\u001b\u0010B\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\bC\u0010\u0006\u00a8\u0006o"}, d2 = {"Lcom/zoomapps/eromance/Activities/PlacesForRestActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "adressRecreationTV", "Landroid/widget/TextView;", "getAdressRecreationTV", "()Landroid/widget/TextView;", "adressRecreationTV$delegate", "Lkotlin/properties/ReadOnlyProperty;", "average_check_TV", "getAverage_check_TV", "average_check_TV$delegate", "btnOpenDrawer", "Landroid/widget/RelativeLayout;", "getBtnOpenDrawer$app_debug", "()Landroid/widget/RelativeLayout;", "btnOpenDrawer$delegate", "callLayout", "Landroid/widget/LinearLayout;", "getCallLayout", "()Landroid/widget/LinearLayout;", "callLayout$delegate", "curPlaceId", "", "getCurPlaceId", "()Ljava/lang/String;", "setCurPlaceId", "(Ljava/lang/String;)V", "mAdapter", "Lcom/zoomapps/eromance/Adapters/RecyclerViewPlacesForRest;", "getMAdapter$app_debug", "()Lcom/zoomapps/eromance/Adapters/RecyclerViewPlacesForRest;", "setMAdapter$app_debug", "(Lcom/zoomapps/eromance/Adapters/RecyclerViewPlacesForRest;)V", "menu_btn_sbsed", "", "getMenu_btn_sbsed$app_debug", "()Z", "setMenu_btn_sbsed$app_debug", "(Z)V", "opening_hourTV", "getOpening_hourTV", "opening_hourTV$delegate", "phoneNum", "getPhoneNum", "setPhoneNum", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "getRecyclerView$app_debug", "()Landroid/support/v7/widget/RecyclerView;", "recyclerView$delegate", "showPlaceOnMap_IV", "getShowPlaceOnMap_IV", "showPlaceOnMap_IV$delegate", "siteRecreationTV", "getSiteRecreationTV", "siteRecreationTV$delegate", "telephoneTV", "getTelephoneTV", "telephoneTV$delegate", "titleRecreation_TV", "getTitleRecreation_TV", "titleRecreation_TV$delegate", "tv_map", "getTv_map$app_debug", "tv_map$delegate", "typeTitleTV", "getTypeTitleTV", "typeTitleTV$delegate", "getColorById", "", "id", "getData", "", "place_id", "init_recycler", "image_list", "", "Lcom/zoomapps/eromance/Models/PlaceInfoModel$Datum;", "Lcom/zoomapps/eromance/Models/PlaceInfoModel;", "init_recycler$app_debug", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "processDataToView", "data", "Lcom/zoomapps/eromance/Models/PlaceInfoModel$Data;", "setHeaderData", "place_name", "place_type", "place_kitchen", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "setMainInfo", "aveg_Price", "workTime", "phone_num", "web_site", "txt_address", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "setMainPhoto", "img_path", "setMapPoints", "lat", "", "lng", "text", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "setPhoneData", "pN", "setReviewBtn", "textGradient", "app_debug"})
public final class PlacesForRestActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btnOpenDrawer$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tv_map$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty recyclerView$delegate = null;
    private boolean menu_btn_sbsed;
    @org.jetbrains.annotations.Nullable()
    private com.zoomapps.eromance.Adapters.RecyclerViewPlacesForRest mAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty titleRecreation_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty typeTitleTV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty average_check_TV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty opening_hourTV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty telephoneTV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty siteRecreationTV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty adressRecreationTV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty showPlaceOnMap_IV$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty callLayout$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String curPlaceId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String phoneNum;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getBtnOpenDrawer$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTv_map$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getRecyclerView$app_debug() {
        return null;
    }
    
    public final boolean getMenu_btn_sbsed$app_debug() {
        return false;
    }
    
    public final void setMenu_btn_sbsed$app_debug(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.zoomapps.eromance.Adapters.RecyclerViewPlacesForRest getMAdapter$app_debug() {
        return null;
    }
    
    public final void setMAdapter$app_debug(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Adapters.RecyclerViewPlacesForRest p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTitleRecreation_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTypeTitleTV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getAverage_check_TV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getOpening_hourTV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTelephoneTV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getSiteRecreationTV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getAdressRecreationTV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getShowPlaceOnMap_IV() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getCallLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurPlaceId() {
        return null;
    }
    
    public final void setCurPlaceId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setReviewBtn(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.PlaceInfoModel.Data data) {
    }
    
    public final void getData(@org.jetbrains.annotations.Nullable()
    java.lang.String place_id) {
    }
    
    public final void setHeaderData(@org.jetbrains.annotations.Nullable()
    java.lang.String place_name, @org.jetbrains.annotations.Nullable()
    java.lang.Integer place_type, @org.jetbrains.annotations.Nullable()
    java.lang.String place_kitchen) {
    }
    
    public final void setMapPoints(@org.jetbrains.annotations.Nullable()
    java.lang.Double lat, @org.jetbrains.annotations.Nullable()
    java.lang.Double lng, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhoneNum() {
        return null;
    }
    
    public final void setPhoneNum(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void setPhoneData(@org.jetbrains.annotations.Nullable()
    java.lang.String pN) {
    }
    
    public final void setMainPhoto(@org.jetbrains.annotations.Nullable()
    java.lang.String img_path) {
    }
    
    public final void setMainInfo(@org.jetbrains.annotations.Nullable()
    java.lang.Integer aveg_Price, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> workTime, @org.jetbrains.annotations.Nullable()
    java.lang.String phone_num, @org.jetbrains.annotations.Nullable()
    java.lang.String web_site, @org.jetbrains.annotations.Nullable()
    java.lang.String txt_address) {
    }
    
    public final void processDataToView(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.PlaceInfoModel.Data data) {
    }
    
    public final void init_recycler$app_debug(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.PlaceInfoModel.Datum> image_list) {
    }
    
    public final int getColorById(int id) {
        return 0;
    }
    
    private final void textGradient() {
    }
    
    public PlacesForRestActivity() {
        super();
    }
}