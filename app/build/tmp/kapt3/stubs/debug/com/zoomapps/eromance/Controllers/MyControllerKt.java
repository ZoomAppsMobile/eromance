package com.zoomapps.eromance.Controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\n\u001a\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u001a\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002\u001a\u0006\u0010\u0017\u001a\u00020\u0012\u001a\u0010\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u001a\u0006\u0010\u001a\u001a\u00020\u0012\u001a\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002\u001a\'\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u001f\u001a\u00020\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001e0!\u00a2\u0006\u0002\u0010\"\u001a\u000e\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b\u001a\u0016\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020\b\u001a\u0016\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\b\u001a \u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.H\u0002\u001a\u0015\u0010/\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u00101\u001a\u000e\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\u0015\u001a\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020705\u001a\u000e\u00108\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u000e\u001a\"\u0010:\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\b2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0002\u001a=\u0010=\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010?\u001a\u00020\b2\u0010\b\u0002\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\u00a2\u0006\u0002\u0010A\u001a\"\u0010=\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u00022\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0002\u001a&\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u0002\u001a\u0016\u0010J\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u0002\u001a\u0016\u0010L\u001a\u00020\u00022\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020N\u001a\u000e\u0010P\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\b\u001a\u0010\u0010R\u001a\u00020\f2\b\u0010S\u001a\u0004\u0018\u00010\u0002\u001a\u0018\u0010T\u001a\u00020\f2\b\u0010U\u001a\u0004\u0018\u00010\u00022\u0006\u0010V\u001a\u00020\u000e\u001a\u0019\u0010W\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u001e2\u0006\u0010X\u001a\u0002H\u001e\u00a2\u0006\u0002\u0010Y\u001a<\u0010Z\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00152\u0006\u0010[\u001a\u00020\u00022\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\b\b\u0002\u0010`\u001a\u00020\u00122\n\b\u0002\u0010a\u001a\u0004\u0018\u00010b\u001a\u0017\u0010c\u001a\u00020\u00122\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010e\u001a.\u0010f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010g\u001a\u00020\u00022\u0006\u0010h\u001a\u00020\u00022\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020j\u001a\u0016\u0010l\u001a\u00020\f2\u0006\u0010m\u001a\u00020\u000e2\u0006\u0010n\u001a\u00020\u0002\u001a\u0018\u0010o\u001a\u00020\f2\u0006\u0010m\u001a\u00020\u000e2\b\u0010p\u001a\u0004\u0018\u00010\u0002\u001a\u0018\u0010q\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u00152\u0006\u0010r\u001a\u00020]H\u0002\"\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006s"}, d2 = {"image_formats", "", "", "getImage_formats", "()[Ljava/lang/String;", "[Ljava/lang/String;", "calculateGameOutcome", "your_thing_id", "", "opponent_thing_id", "(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;", "callToPhone", "", "mContext", "Landroid/content/Context;", "phoneNum", "changeNotifStatus", "newStatus", "", "checkAndRequestPermissions", "act", "Landroid/app/Activity;", "permissionID", "checkIfAgreementRead", "checkImage", "image_url", "checkNotificationStatus", "convertDateToAge", "str_Date", "deSerializeToJson", "T", "myJson", "modelType", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "dpToPx", "dp", "getColorById", "ctx", "id", "getDateDiff", "", "date1", "Ljava/util/Date;", "date2", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "getPaymentValue", "pid", "(Ljava/lang/Integer;)Ljava/lang/String;", "getScreenWidth", "activity", "getStrList", "", "data", "Lcom/zoomapps/eromance/Models/TranslationModel$IdValueModel;", "isOnline", "context", "openGallery", "req_code", "show_text", "openImageViewer", "ImageArr", "position", "imageIdsArr", "(Landroid/content/Context;[Ljava/lang/String;I[Ljava/lang/String;)V", "image", "imageId", "openMaps", "_ctx", "latitude", "", "longitude", "text", "openUserProfile", "user_id", "printDifference", "startDate", "Ljava/util/Calendar;", "endDate", "pxToDp", "px", "savePushToken", "push_token", "sendPushTokenToServer", "fcm_token", "mcontext", "serializeToJson", "myClass", "(Ljava/lang/Object;)Ljava/lang/String;", "setToolbar", "tb_title", "title_TV", "Landroid/widget/TextView;", "home_btn", "Landroid/widget/ImageView;", "isIconBack", "dr_lay", "Landroid/support/v4/widget/DrawerLayout;", "setTranslations", "forseUpd", "(Ljava/lang/Boolean;)Z", "showDialog", "title", "message", "positiveClick", "Landroid/content/DialogInterface$OnClickListener;", "negativeClick", "showPreparedToast", "_context", "_type", "showToast", "_text", "textGradient", "changeing_tv", "app_debug"})
public final class MyControllerKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] image_formats = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getPaymentValue(@org.jetbrains.annotations.Nullable()
    java.lang.Integer pid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String printDifference(@org.jetbrains.annotations.NotNull()
    java.util.Calendar startDate, @org.jetbrains.annotations.NotNull()
    java.util.Calendar endDate) {
        return null;
    }
    
    public static final int getScreenWidth(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return 0;
    }
    
    public static final void sendPushTokenToServer(@org.jetbrains.annotations.Nullable()
    java.lang.String fcm_token, @org.jetbrains.annotations.NotNull()
    android.content.Context mcontext) {
    }
    
    public static final void savePushToken(@org.jetbrains.annotations.Nullable()
    java.lang.String push_token) {
    }
    
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context _context, @org.jetbrains.annotations.Nullable()
    java.lang.String _text) {
    }
    
    public static final void showDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.content.DialogInterface.OnClickListener positiveClick, @org.jetbrains.annotations.NotNull()
    android.content.DialogInterface.OnClickListener negativeClick) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>java.lang.String serializeToJson(T myClass) {
        return null;
    }
    
    public static final <T extends java.lang.Object>T deSerializeToJson(@org.jetbrains.annotations.NotNull()
    java.lang.String myJson, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelType) {
        return null;
    }
    
    public static final void showPreparedToast(@org.jetbrains.annotations.NotNull()
    android.content.Context _context, @org.jetbrains.annotations.NotNull()
    java.lang.String _type) {
    }
    
    public static final int pxToDp(int px) {
        return 0;
    }
    
    public static final int dpToPx(int dp) {
        return 0;
    }
    
    public static final void openGallery(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, int req_code, @org.jetbrains.annotations.Nullable()
    java.lang.String show_text) {
    }
    
    public static final boolean checkAndRequestPermissions(@org.jetbrains.annotations.NotNull()
    android.app.Activity act, @org.jetbrains.annotations.NotNull()
    java.lang.String permissionID) {
        return false;
    }
    
    public static final void callToPhone(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneNum) {
    }
    
    public static final boolean setTranslations(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean forseUpd) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String calculateGameOutcome(@org.jetbrains.annotations.Nullable()
    java.lang.Integer your_thing_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer opponent_thing_id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<java.lang.String> getStrList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zoomapps.eromance.Models.TranslationModel.IdValueModel> data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String convertDateToAge(@org.jetbrains.annotations.NotNull()
    java.lang.String str_Date) {
        return null;
    }
    
    private static final long getDateDiff(java.util.Date date1, java.util.Date date2, java.util.concurrent.TimeUnit timeUnit) {
        return 0L;
    }
    
    public static final int getColorById(@org.jetbrains.annotations.NotNull()
    android.app.Activity ctx, int id) {
        return 0;
    }
    
    public static final int getColorById(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, int id) {
        return 0;
    }
    
    private static final void textGradient(android.app.Activity _ctx, android.widget.TextView changeing_tv) {
    }
    
    public static final void openImageViewer(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.Nullable()
    java.lang.String[] ImageArr, int position, @org.jetbrains.annotations.Nullable()
    java.lang.String[] imageIdsArr) {
    }
    
    public static final void openImageViewer(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.lang.String image, @org.jetbrains.annotations.Nullable()
    java.lang.String imageId) {
    }
    
    public static final void setToolbar(@org.jetbrains.annotations.NotNull()
    android.app.Activity ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String tb_title, @org.jetbrains.annotations.NotNull()
    android.widget.TextView title_TV, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView home_btn, boolean isIconBack, @org.jetbrains.annotations.Nullable()
    android.support.v4.widget.DrawerLayout dr_lay) {
    }
    
    public static final void openUserProfile(@org.jetbrains.annotations.NotNull()
    android.content.Context _ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String user_id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String[] getImage_formats() {
        return null;
    }
    
    public static final boolean checkImage(@org.jetbrains.annotations.Nullable()
    java.lang.String image_url) {
        return false;
    }
    
    public static final boolean isOnline(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public static final boolean checkIfAgreementRead() {
        return false;
    }
    
    public static final boolean checkNotificationStatus() {
        return false;
    }
    
    public static final void changeNotifStatus(boolean newStatus) {
    }
    
    public static final void openMaps(@org.jetbrains.annotations.NotNull()
    android.content.Context _ctx, double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
}