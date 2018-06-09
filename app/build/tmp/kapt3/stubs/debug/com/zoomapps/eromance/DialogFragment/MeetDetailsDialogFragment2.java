package com.zoomapps.eromance.DialogFragment;

import java.lang.System;

/**
 * * Created by User on 12.09.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u0002:\u0002\u008a\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\f\u0010p\u001a\u000604R\u000205H\u0002J\u0006\u0010q\u001a\u00020rJ\u0006\u0010s\u001a\u00020rJ\u0010\u0010t\u001a\u00020r2\b\u0010u\u001a\u0004\u0018\u00010vJ\u0017\u0010w\u001a\u00020r2\b\u0010x\u001a\u0004\u0018\u00010yH\u0016\u00a2\u0006\u0002\u0010zJ(\u0010{\u001a\u0004\u0018\u00010v2\u0006\u0010|\u001a\u00020}2\b\u0010~\u001a\u0004\u0018\u00010\u007f2\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0016J\t\u0010\u0082\u0001\u001a\u00020rH\u0016J\t\u0010\u0083\u0001\u001a\u00020rH\u0016J\u0014\u0010\u0084\u0001\u001a\u00020r2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010dH\u0016J\t\u0010\u0086\u0001\u001a\u00020rH\u0016J\u0007\u0010\u0087\u0001\u001a\u00020rJ\u0007\u0010\u0088\u0001\u001a\u00020rJ\u0007\u0010\u0089\u0001\u001a\u00020rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u0019\u0010\u001f\u001a\n !*\u0004\u0018\u00010 0 \u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00103\u001a\b\u0018\u000104R\u000205X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u00106\u001a\u000604R\u0002058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\tR\u001a\u0010<\u001a\u00020=X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0013\"\u0004\bC\u0010\u0015R\u001a\u0010D\u001a\u00020EX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0013\"\u0004\bL\u0010\u0015R\u001a\u0010M\u001a\u00020NX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001c\u0010S\u001a\u0004\u0018\u00010TX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010Y\u001a\u00020%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\'\"\u0004\b[\u0010)R\u0019\u0010\\\u001a\n !*\u0004\u0018\u00010]0]\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u001a\u0010`\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0013\"\u0004\bb\u0010\u0015R\u0016\u0010c\u001a\u0004\u0018\u00010d8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\be\u0010fR\u001a\u0010g\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0019\"\u0004\bi\u0010\u001bR\u001a\u0010j\u001a\u00020=X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010>\"\u0004\bl\u0010@R\u001a\u0010m\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0013\"\u0004\bo\u0010\u0015\u00a8\u0006\u008b\u0001"}, d2 = {"Lcom/zoomapps/eromance/DialogFragment/MeetDetailsDialogFragment2;", "Lcom/zoomapps/eromance/DialogFragment/BaseDialogFragment;", "Lcom/zoomapps/eromance/Interfaces/IMeetDetailsView;", "()V", "additional_LL", "Landroid/widget/LinearLayout;", "getAdditional_LL", "()Landroid/widget/LinearLayout;", "setAdditional_LL", "(Landroid/widget/LinearLayout;)V", "be_with_LL", "Landroid/widget/RelativeLayout;", "getBe_with_LL", "()Landroid/widget/RelativeLayout;", "setBe_with_LL", "(Landroid/widget/RelativeLayout;)V", "be_with_TV", "Landroid/widget/TextView;", "getBe_with_TV", "()Landroid/widget/TextView;", "setBe_with_TV", "(Landroid/widget/TextView;)V", "be_with_avatar_CIV", "Lde/hdodenhof/circleimageview/CircleImageView;", "getBe_with_avatar_CIV", "()Lde/hdodenhof/circleimageview/CircleImageView;", "setBe_with_avatar_CIV", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "be_with_username_TV", "getBe_with_username_TV", "setBe_with_username_TV", "cal_now", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getCal_now", "()Ljava/util/Calendar;", "cancel_btn", "Landroid/widget/Button;", "getCancel_btn", "()Landroid/widget/Button;", "setCancel_btn", "(Landroid/widget/Button;)V", "content_LL", "getContent_LL", "setContent_LL", "defaultClickAction", "Landroid/view/View$OnClickListener;", "getDefaultClickAction", "()Landroid/view/View$OnClickListener;", "setDefaultClickAction", "(Landroid/view/View$OnClickListener;)V", "details", "Lcom/zoomapps/eromance/Models/MeetsModel$Datum;", "Lcom/zoomapps/eromance/Models/MeetsModel;", "detailsData", "getDetailsData", "()Lcom/zoomapps/eromance/Models/MeetsModel$Datum;", "dynamic_user_meet", "getDynamic_user_meet", "setDynamic_user_meet", "is_vip_IV", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "set_vip_IV", "(Landroid/widget/ImageView;)V", "left_time_TV", "getLeft_time_TV", "setLeft_time_TV", "meets_list_RV", "Landroid/support/v7/widget/RecyclerView;", "getMeets_list_RV", "()Landroid/support/v7/widget/RecyclerView;", "setMeets_list_RV", "(Landroid/support/v7/widget/RecyclerView;)V", "payment_type_TV", "getPayment_type_TV", "setPayment_type_TV", "presenter", "Lcom/zoomapps/eromance/Helpers/MeetDetailsPresenter2;", "getPresenter", "()Lcom/zoomapps/eromance/Helpers/MeetDetailsPresenter2;", "setPresenter", "(Lcom/zoomapps/eromance/Helpers/MeetDetailsPresenter2;)V", "responsef", "", "getResponsef", "()Ljava/lang/Void;", "setResponsef", "(Ljava/lang/Void;)V", "send_btn", "getSend_btn", "setSend_btn", "timeZone", "Ljava/util/TimeZone;", "getTimeZone", "()Ljava/util/TimeZone;", "title_TV", "getTitle_TV", "setTitle_TV", "type", "", "getType", "()Ljava/lang/String;", "user_avatar_CIV", "getUser_avatar_CIV", "setUser_avatar_CIV", "user_rating_IV", "getUser_rating_IV", "setUser_rating_IV", "username_TV", "getUsername_TV", "setUsername_TV", "getDetailsInfo", "getIfUserConnected", "", "initRV", "initViews", "v", "Landroid/view/View;", "onConnectedToMeet", "isBlocked", "", "(Ljava/lang/Boolean;)V", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onRequestError", "onShowToast", "message", "onUnconnectedToMeet", "setBtnActions", "setDate", "setViewData", "Companion", "app_debug"})
public final class MeetDetailsDialogFragment2 extends com.zoomapps.eromance.DialogFragment.BaseDialogFragment implements com.zoomapps.eromance.Interfaces.IMeetDetailsView {
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView title_TV;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Void responsef;
    @org.jetbrains.annotations.NotNull()
    public android.widget.LinearLayout content_LL;
    @org.jetbrains.annotations.NotNull()
    public de.hdodenhof.circleimageview.CircleImageView user_avatar_CIV;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView username_TV;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView user_rating_IV;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView is_vip_IV;
    @org.jetbrains.annotations.NotNull()
    public android.widget.LinearLayout additional_LL;
    @org.jetbrains.annotations.NotNull()
    public android.support.v7.widget.RecyclerView meets_list_RV;
    @org.jetbrains.annotations.NotNull()
    public android.widget.RelativeLayout be_with_LL;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView be_with_TV;
    @org.jetbrains.annotations.NotNull()
    public de.hdodenhof.circleimageview.CircleImageView be_with_avatar_CIV;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView be_with_username_TV;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView payment_type_TV;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView left_time_TV;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button cancel_btn;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button send_btn;
    @org.jetbrains.annotations.NotNull()
    public android.widget.LinearLayout dynamic_user_meet;
    @org.jetbrains.annotations.NotNull()
    public com.zoomapps.eromance.Helpers.MeetDetailsPresenter2 presenter;
    private com.zoomapps.eromance.Models.MeetsModel.Datum details;
    @org.jetbrains.annotations.NotNull()
    private android.view.View.OnClickListener defaultClickAction;
    private final java.util.TimeZone timeZone = null;
    private final java.util.Calendar cal_now = null;
    private static final java.lang.String ARG_PARAM1 = "details";
    private static final java.lang.String ARG_PARAM2 = "type";
    public static final com.zoomapps.eromance.DialogFragment.MeetDetailsDialogFragment2.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onRequestError() {
    }
    
    @java.lang.Override()
    public void onConnectedToMeet(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean isBlocked) {
    }
    
    @java.lang.Override()
    public void onUnconnectedToMeet() {
    }
    
    @java.lang.Override()
    public void onShowToast(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTitle_TV() {
        return null;
    }
    
    public final void setTitle_TV(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Void getResponsef() {
        return null;
    }
    
    public final void setResponsef(@org.jetbrains.annotations.Nullable()
    java.lang.Void p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getContent_LL() {
        return null;
    }
    
    public final void setContent_LL(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.hdodenhof.circleimageview.CircleImageView getUser_avatar_CIV() {
        return null;
    }
    
    public final void setUser_avatar_CIV(@org.jetbrains.annotations.NotNull()
    de.hdodenhof.circleimageview.CircleImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getUsername_TV() {
        return null;
    }
    
    public final void setUsername_TV(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getUser_rating_IV() {
        return null;
    }
    
    public final void setUser_rating_IV(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView is_vip_IV() {
        return null;
    }
    
    public final void set_vip_IV(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getAdditional_LL() {
        return null;
    }
    
    public final void setAdditional_LL(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.RecyclerView getMeets_list_RV() {
        return null;
    }
    
    public final void setMeets_list_RV(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getBe_with_LL() {
        return null;
    }
    
    public final void setBe_with_LL(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getBe_with_TV() {
        return null;
    }
    
    public final void setBe_with_TV(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final de.hdodenhof.circleimageview.CircleImageView getBe_with_avatar_CIV() {
        return null;
    }
    
    public final void setBe_with_avatar_CIV(@org.jetbrains.annotations.NotNull()
    de.hdodenhof.circleimageview.CircleImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getBe_with_username_TV() {
        return null;
    }
    
    public final void setBe_with_username_TV(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getPayment_type_TV() {
        return null;
    }
    
    public final void setPayment_type_TV(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getLeft_time_TV() {
        return null;
    }
    
    public final void setLeft_time_TV(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getCancel_btn() {
        return null;
    }
    
    public final void setCancel_btn(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getSend_btn() {
        return null;
    }
    
    public final void setSend_btn(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getDynamic_user_meet() {
        return null;
    }
    
    public final void setDynamic_user_meet(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Helpers.MeetDetailsPresenter2 getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Helpers.MeetDetailsPresenter2 p0) {
    }
    
    private final com.zoomapps.eromance.Models.MeetsModel.Datum getDetailsData() {
        return null;
    }
    
    private final com.zoomapps.eromance.Models.MeetsModel.Datum getDetailsInfo() {
        return null;
    }
    
    private final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View.OnClickListener getDefaultClickAction() {
        return null;
    }
    
    public final void setDefaultClickAction(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener p0) {
    }
    
    public final void initViews(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void getIfUserConnected() {
    }
    
    public final void setViewData() {
    }
    
    public final java.util.TimeZone getTimeZone() {
        return null;
    }
    
    public final java.util.Calendar getCal_now() {
        return null;
    }
    
    public final void setDate() {
    }
    
    public final void setBtnActions() {
    }
    
    public final void initRV() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public MeetDetailsDialogFragment2() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/zoomapps/eromance/DialogFragment/MeetDetailsDialogFragment2$Companion;", "", "()V", "ARG_PARAM1", "", "getARG_PARAM1", "()Ljava/lang/String;", "ARG_PARAM2", "getARG_PARAM2", "newInstance", "Lcom/zoomapps/eromance/DialogFragment/MeetDetailsDialogFragment2;", "details", "type", "app_debug"})
    public static final class Companion {
        
        private final java.lang.String getARG_PARAM1() {
            return null;
        }
        
        private final java.lang.String getARG_PARAM2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.zoomapps.eromance.DialogFragment.MeetDetailsDialogFragment2 newInstance(@org.jetbrains.annotations.Nullable()
        java.lang.String details, @org.jetbrains.annotations.Nullable()
        java.lang.String type) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}