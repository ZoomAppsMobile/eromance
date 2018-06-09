package com.zoomapps.eromance.DialogFragment;

import java.lang.System;

/**
 * * Created by User on 14.09.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u008d\u00012\u00020\u00012\u00020\u0002:\u0002\u008d\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010m\u001a\u00020nH\u0016J\u0006\u0010o\u001a\u00020nJ\n\u0010p\u001a\u000608R\u000209J\u0006\u0010q\u001a\u00020nJ\u0010\u0010r\u001a\u00020n2\b\u0010s\u001a\u0004\u0018\u00010tJ\b\u0010u\u001a\u00020nH\u0016J&\u0010v\u001a\u0004\u0018\u00010t2\u0006\u0010w\u001a\u00020x2\b\u0010y\u001a\u0004\u0018\u00010z2\b\u0010{\u001a\u0004\u0018\u00010|H\u0016J\b\u0010}\u001a\u00020nH\u0016J\b\u0010~\u001a\u00020nH\u0016J\u0019\u0010\u007f\u001a\u00020n2\u000f\u0010\u0080\u0001\u001a\n\u0018\u00010\u0081\u0001R\u00030\u0082\u0001H\u0016J\u0018\u0010\u0083\u0001\u001a\u00020n2\r\u0010\u0084\u0001\u001a\b\u0018\u000108R\u000209H\u0016J\t\u0010\u0085\u0001\u001a\u00020nH\u0016J\u0012\u0010\u0086\u0001\u001a\u00020n2\u0007\u0010\u0087\u0001\u001a\u000204H\u0016J\u0007\u0010\u0088\u0001\u001a\u00020nJ\u0007\u0010\u0089\u0001\u001a\u00020nJ\u0018\u0010\u008a\u0001\u001a\u00020n2\u000f\u0010\u008b\u0001\u001a\n\u0018\u00010\u0081\u0001R\u00030\u0082\u0001J\u0015\u0010\u008c\u0001\u001a\u00020n2\f\u00107\u001a\b\u0018\u000108R\u000209R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u0019\u0010\u001f\u001a\n !*\u0004\u0018\u00010 0 \u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00103\u001a\u0002048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\b\u0018\u000108R\u000209X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u0002048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b;\u00106R\u0014\u0010<\u001a\u0002048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b=\u00106R\u001a\u0010>\u001a\u00020?X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010@\"\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0013\"\u0004\bE\u0010\u0015R \u0010F\u001a\b\u0018\u000108R\u000209X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020LX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010Q\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0013\"\u0004\bS\u0010\u0015R\u001a\u0010T\u001a\u00020UX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010Z\u001a\u00020%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\'\"\u0004\b\\\u0010)R\u0019\u0010]\u001a\n !*\u0004\u0018\u00010^0^\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u001a\u0010a\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0013\"\u0004\bc\u0010\u0015R\u001a\u0010d\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0019\"\u0004\bf\u0010\u001bR\u001a\u0010g\u001a\u00020?X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010@\"\u0004\bi\u0010BR\u001a\u0010j\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0013\"\u0004\bl\u0010\u0015\u00a8\u0006\u008e\u0001"}, d2 = {"Lcom/zoomapps/eromance/DialogFragment/MeetNotificationDetailsDialog;", "Lcom/zoomapps/eromance/DialogFragment/BaseDialogFragment;", "Lcom/zoomapps/eromance/Interfaces/IMeetNotificationDetailsView;", "()V", "additional_LL", "Landroid/widget/LinearLayout;", "getAdditional_LL", "()Landroid/widget/LinearLayout;", "setAdditional_LL", "(Landroid/widget/LinearLayout;)V", "be_with_LL", "Landroid/widget/RelativeLayout;", "getBe_with_LL", "()Landroid/widget/RelativeLayout;", "setBe_with_LL", "(Landroid/widget/RelativeLayout;)V", "be_with_TV", "Landroid/widget/TextView;", "getBe_with_TV", "()Landroid/widget/TextView;", "setBe_with_TV", "(Landroid/widget/TextView;)V", "be_with_avatar_CIV", "Lde/hdodenhof/circleimageview/CircleImageView;", "getBe_with_avatar_CIV", "()Lde/hdodenhof/circleimageview/CircleImageView;", "setBe_with_avatar_CIV", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "be_with_username_TV", "getBe_with_username_TV", "setBe_with_username_TV", "cal_now", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getCal_now", "()Ljava/util/Calendar;", "cancel_btn", "Landroid/widget/Button;", "getCancel_btn", "()Landroid/widget/Button;", "setCancel_btn", "(Landroid/widget/Button;)V", "content_LL", "getContent_LL", "setContent_LL", "defaultClickAction", "Landroid/view/View$OnClickListener;", "getDefaultClickAction", "()Landroid/view/View$OnClickListener;", "setDefaultClickAction", "(Landroid/view/View$OnClickListener;)V", "desiredToConnectUserId", "", "getDesiredToConnectUserId", "()Ljava/lang/String;", "details", "Lcom/zoomapps/eromance/Models/MeetsModel$Datum;", "Lcom/zoomapps/eromance/Models/MeetsModel;", "entityClass", "getEntityClass", "interaction_ID", "getInteraction_ID", "is_vip_IV", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "set_vip_IV", "(Landroid/widget/ImageView;)V", "left_time_TV", "getLeft_time_TV", "setLeft_time_TV", "mMeetDetails", "getMMeetDetails", "()Lcom/zoomapps/eromance/Models/MeetsModel$Datum;", "setMMeetDetails", "(Lcom/zoomapps/eromance/Models/MeetsModel$Datum;)V", "meets_list_RV", "Landroid/support/v7/widget/RecyclerView;", "getMeets_list_RV", "()Landroid/support/v7/widget/RecyclerView;", "setMeets_list_RV", "(Landroid/support/v7/widget/RecyclerView;)V", "payment_type_TV", "getPayment_type_TV", "setPayment_type_TV", "presenter", "Lcom/zoomapps/eromance/Helpers/NotificationMeetDetailsPresenter;", "getPresenter", "()Lcom/zoomapps/eromance/Helpers/NotificationMeetDetailsPresenter;", "setPresenter", "(Lcom/zoomapps/eromance/Helpers/NotificationMeetDetailsPresenter;)V", "send_btn", "getSend_btn", "setSend_btn", "timeZone", "Ljava/util/TimeZone;", "getTimeZone", "()Ljava/util/TimeZone;", "title_TV", "getTitle_TV", "setTitle_TV", "user_avatar_CIV", "getUser_avatar_CIV", "setUser_avatar_CIV", "user_rating_IV", "getUser_rating_IV", "setUser_rating_IV", "username_TV", "getUsername_TV", "setUsername_TV", "close", "", "getData", "getDetailsInfo", "initRV", "initViews", "v", "Landroid/view/View;", "onAcceptedUserToMeet", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeclinedUserFromMeet", "onDestroy", "onLoadDesiredUserData", "_userData", "Lcom/zoomapps/eromance/Models/AccountModel/LoginModel$Datum;", "Lcom/zoomapps/eromance/Models/AccountModel/LoginModel;", "onLoadMeetData", "_meetData", "onRequestError", "onShowToast", "message", "setBtnActions", "setDate", "setDesiredUserData", "userData", "setViewData", "Companion", "app_debug"})
public final class MeetNotificationDetailsDialog extends com.zoomapps.eromance.DialogFragment.BaseDialogFragment implements com.zoomapps.eromance.Interfaces.IMeetNotificationDetailsView {
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView title_TV;
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
    public com.zoomapps.eromance.Helpers.NotificationMeetDetailsPresenter presenter;
    private com.zoomapps.eromance.Models.MeetsModel.Datum details;
    @org.jetbrains.annotations.NotNull()
    private android.view.View.OnClickListener defaultClickAction;
    @org.jetbrains.annotations.Nullable()
    private com.zoomapps.eromance.Models.MeetsModel.Datum mMeetDetails;
    private final java.util.TimeZone timeZone = null;
    private final java.util.Calendar cal_now = null;
    private static final java.lang.String ARG_PARAM1 = "interaction_id";
    private static final java.lang.String ARG_PARAM2 = "desiredToConnectUserId";
    private static final java.lang.String ARG_PARAM3 = "entityClass";
    public static final com.zoomapps.eromance.DialogFragment.MeetNotificationDetailsDialog.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void close() {
    }
    
    @java.lang.Override()
    public void onLoadMeetData(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.MeetsModel.Datum _meetData) {
    }
    
    @java.lang.Override()
    public void onLoadDesiredUserData(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.AccountModel.LoginModel.Datum _userData) {
    }
    
    @java.lang.Override()
    public void onAcceptedUserToMeet() {
    }
    
    @java.lang.Override()
    public void onDeclinedUserFromMeet() {
    }
    
    @java.lang.Override()
    public void onShowToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onRequestError() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTitle_TV() {
        return null;
    }
    
    public final void setTitle_TV(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
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
    public final com.zoomapps.eromance.Helpers.NotificationMeetDetailsPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Helpers.NotificationMeetDetailsPresenter p0) {
    }
    
    private final java.lang.String getInteraction_ID() {
        return null;
    }
    
    private final java.lang.String getDesiredToConnectUserId() {
        return null;
    }
    
    private final java.lang.String getEntityClass() {
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
    
    public final void getData() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.zoomapps.eromance.Models.MeetsModel.Datum getMMeetDetails() {
        return null;
    }
    
    public final void setMMeetDetails(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.MeetsModel.Datum p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Models.MeetsModel.Datum getDetailsInfo() {
        return null;
    }
    
    public final void setDesiredUserData(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.AccountModel.LoginModel.Datum userData) {
    }
    
    public final void setViewData(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.MeetsModel.Datum details) {
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
    
    public MeetNotificationDetailsDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/zoomapps/eromance/DialogFragment/MeetNotificationDetailsDialog$Companion;", "", "()V", "ARG_PARAM1", "", "getARG_PARAM1", "()Ljava/lang/String;", "ARG_PARAM2", "getARG_PARAM2", "ARG_PARAM3", "getARG_PARAM3", "newInstance", "Lcom/zoomapps/eromance/DialogFragment/MeetNotificationDetailsDialog;", "interaction_id", "desiredToConnectUserId", "entityClass", "app_debug"})
    public static final class Companion {
        
        private final java.lang.String getARG_PARAM1() {
            return null;
        }
        
        private final java.lang.String getARG_PARAM2() {
            return null;
        }
        
        private final java.lang.String getARG_PARAM3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.zoomapps.eromance.DialogFragment.MeetNotificationDetailsDialog newInstance(@org.jetbrains.annotations.Nullable()
        java.lang.String interaction_id, @org.jetbrains.annotations.Nullable()
        java.lang.String desiredToConnectUserId, @org.jetbrains.annotations.Nullable()
        java.lang.String entityClass) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}