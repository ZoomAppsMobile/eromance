package com.zoomapps.eromance.Adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u00032\u00020\u0004:\u0002MNB5\u0012\u0012\u0010\u0005\u001a\u000e\u0012\b\u0012\u00060\u0007R\u00020\b\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u000eJ\u0018\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u00020#J\b\u00109\u001a\u00020\u001aH\u0016J\u001c\u0010:\u001a\u0002052\n\u0010;\u001a\u00060\u0002R\u00020\u00002\u0006\u0010<\u001a\u00020\u001aH\u0016J\u0017\u0010=\u001a\u0002052\b\u0010>\u001a\u0004\u0018\u00010#H\u0016\u00a2\u0006\u0002\u0010?J\u001c\u0010@\u001a\u00060\u0002R\u00020\u00002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u001aH\u0016J\u001d\u0010D\u001a\u000205\"\u0004\b\u0000\u0010E2\b\u0010F\u001a\u0004\u0018\u0001HEH\u0016\u00a2\u0006\u0002\u0010GJ\b\u0010H\u001a\u000205H\u0016J\u001b\u0010I\u001a\u000205\"\u0004\b\u0000\u0010E2\u0006\u0010F\u001a\u0002HEH\u0016\u00a2\u0006\u0002\u0010GJ\u0012\u0010J\u001a\u0002052\b\u0010K\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010L\u001a\u000205H\u0016R\u0019\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n \u0011*\u0004\u0018\u00010\u00150\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\b\u0018\u00010\u0007R\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\b\u0012\u00060\u0007R\u00020\b\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\'\u001a\u00020(\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0082.\u00a2\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0019\u0010/\u001a\n \u0011*\u0004\u0018\u00010000\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010.\u00a8\u0006O"}, d2 = {"Lcom/zoomapps/eromance/Adapters/Connection_ResultList_Adapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/zoomapps/eromance/Adapters/Connection_ResultList_Adapter$ViewHolder;", "Lcom/zoomapps/eromance/Interfaces/RequestMakerListener;", "Lcom/zoomapps/eromance/Interfaces/IMeetDetailsView;", "mDataset", "", "Lcom/zoomapps/eromance/Models/MeetsModel$Datum;", "Lcom/zoomapps/eromance/Models/MeetsModel;", "mContext", "Landroid/content/Context;", "type", "", "test", "(Ljava/util/List;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "apiService", "Lcom/zoomapps/eromance/API/API_Interface;", "kotlin.jvm.PlatformType", "getApiService", "()Lcom/zoomapps/eromance/API/API_Interface;", "cal_now", "Ljava/util/Calendar;", "getCal_now", "()Ljava/util/Calendar;", "clickedItems", "Ljava/util/ArrayList;", "", "getClickedItems", "()Ljava/util/ArrayList;", "setClickedItems", "(Ljava/util/ArrayList;)V", "details", "interaction_id", "Ljava/lang/Integer;", "isConnectionCheck", "", "()Z", "setConnectionCheck", "(Z)V", "rqst_mkr", "Lcom/zoomapps/eromance/Controllers/RequestMaker;", "getRqst_mkr", "()Lcom/zoomapps/eromance/Controllers/RequestMaker;", "send_btn", "Landroid/widget/Button;", "getTest", "()Ljava/lang/String;", "timeZone", "Ljava/util/TimeZone;", "getTimeZone", "()Ljava/util/TimeZone;", "getType", "changeBgOfBtn", "", "btn_view", "Landroid/widget/LinearLayout;", "isClicked", "getItemCount", "onBindViewHolder", "holder", "position", "onConnectedToMeet", "isBlocked", "(Ljava/lang/Boolean;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onError", "T", "out", "(Ljava/lang/Object;)V", "onRequestError", "onRequestSuccess", "onShowToast", "message", "onUnconnectedToMeet", "ViewHolder", "selectedItemsObj", "app_debug"})
public final class Connection_ResultList_Adapter extends android.support.v7.widget.RecyclerView.Adapter<com.zoomapps.eromance.Adapters.Connection_ResultList_Adapter.ViewHolder> implements com.zoomapps.eromance.Interfaces.RequestMakerListener, com.zoomapps.eromance.Interfaces.IMeetDetailsView {
    private java.lang.Integer interaction_id;
    private boolean isConnectionCheck;
    private com.zoomapps.eromance.Models.MeetsModel.Datum details;
    private android.widget.Button send_btn;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Controllers.RequestMaker rqst_mkr = null;
    private final com.zoomapps.eromance.API.API_Interface apiService = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Integer> clickedItems;
    private final java.util.TimeZone timeZone = null;
    private final java.util.Calendar cal_now = null;
    private final java.util.List<com.zoomapps.eromance.Models.MeetsModel.Datum> mDataset = null;
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String test = null;
    
    public final boolean isConnectionCheck() {
        return false;
    }
    
    public final void setConnectionCheck(boolean p0) {
    }
    
    @java.lang.Override()
    public void onRequestError() {
    }
    
    @java.lang.Override()
    public void onShowToast(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onUnconnectedToMeet() {
    }
    
    @java.lang.Override()
    public void onConnectedToMeet(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean isBlocked) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Controllers.RequestMaker getRqst_mkr() {
        return null;
    }
    
    public final com.zoomapps.eromance.API.API_Interface getApiService() {
        return null;
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onError(@org.jetbrains.annotations.Nullable()
    T out) {
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onRequestSuccess(T out) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zoomapps.eromance.Adapters.Connection_ResultList_Adapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getClickedItems() {
        return null;
    }
    
    public final void setClickedItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    public final java.util.TimeZone getTimeZone() {
        return null;
    }
    
    public final java.util.Calendar getCal_now() {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Adapters.Connection_ResultList_Adapter.ViewHolder holder, int position) {
    }
    
    public final void changeBgOfBtn(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout btn_view, boolean isClicked) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTest() {
        return null;
    }
    
    public Connection_ResultList_Adapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.MeetsModel.Datum> mDataset, @org.jetbrains.annotations.Nullable()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String test) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010#\"\u0004\b(\u0010%R\u001c\u0010)\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\b\"\u0004\b4\u0010\nR\u001c\u00105\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u000e\"\u0004\b7\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010B\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u000e\"\u0004\bD\u0010\u0010R\u001c\u0010E\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\b\"\u0004\bG\u0010\nR\u001c\u0010H\u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010#\"\u0004\bJ\u0010%\u00a8\u0006K"}, d2 = {"Lcom/zoomapps/eromance/Adapters/Connection_ResultList_Adapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "myView", "Landroid/view/View;", "(Lcom/zoomapps/eromance/Adapters/Connection_ResultList_Adapter;Landroid/view/View;)V", "click_layout", "Landroid/widget/LinearLayout;", "getClick_layout", "()Landroid/widget/LinearLayout;", "setClick_layout", "(Landroid/widget/LinearLayout;)V", "days_left_TV", "Landroid/widget/TextView;", "getDays_left_TV", "()Landroid/widget/TextView;", "setDays_left_TV", "(Landroid/widget/TextView;)V", "hour_left_TV", "getHour_left_TV", "setHour_left_TV", "item_connect_btn", "Landroid/widget/Button;", "getItem_connect_btn", "()Landroid/widget/Button;", "setItem_connect_btn", "(Landroid/widget/Button;)V", "item_joined_user_TV", "getItem_joined_user_TV", "setItem_joined_user_TV", "item_payment_type_TV", "getItem_payment_type_TV", "setItem_payment_type_TV", "item_profile_image_IV", "Landroid/widget/ImageView;", "getItem_profile_image_IV", "()Landroid/widget/ImageView;", "setItem_profile_image_IV", "(Landroid/widget/ImageView;)V", "item_stars_IV", "getItem_stars_IV", "setItem_stars_IV", "item_status_IV", "getItem_status_IV", "setItem_status_IV", "item_user_status_container", "Landroid/widget/RelativeLayout;", "getItem_user_status_container", "()Landroid/widget/RelativeLayout;", "setItem_user_status_container", "(Landroid/widget/RelativeLayout;)V", "left_time_container", "getLeft_time_container", "setLeft_time_container", "minutes_left_TV", "getMinutes_left_TV", "setMinutes_left_TV", "getMyView", "()Landroid/view/View;", "setMyView", "(Landroid/view/View;)V", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "getRecyclerView", "()Landroid/support/v7/widget/RecyclerView;", "setRecyclerView", "(Landroid/support/v7/widget/RecyclerView;)V", "tv_target", "getTv_target", "setTv_target", "user_info_container", "getUser_info_container", "setUser_info_container", "vip_IV", "getVip_IV", "setVip_IV", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView item_profile_image_IV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView item_payment_type_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.LinearLayout left_time_container;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView days_left_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView hour_left_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView minutes_left_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.Button item_connect_btn;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView tv_target;
        @org.jetbrains.annotations.Nullable()
        private android.support.v7.widget.RecyclerView recyclerView;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView item_stars_IV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView item_status_IV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.RelativeLayout item_user_status_container;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView vip_IV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView item_joined_user_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.LinearLayout user_info_container;
        @org.jetbrains.annotations.Nullable()
        private android.widget.LinearLayout click_layout;
        @org.jetbrains.annotations.NotNull()
        private android.view.View myView;
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getItem_profile_image_IV() {
            return null;
        }
        
        public final void setItem_profile_image_IV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getItem_payment_type_TV() {
            return null;
        }
        
        public final void setItem_payment_type_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.LinearLayout getLeft_time_container() {
            return null;
        }
        
        public final void setLeft_time_container(@org.jetbrains.annotations.Nullable()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getDays_left_TV() {
            return null;
        }
        
        public final void setDays_left_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getHour_left_TV() {
            return null;
        }
        
        public final void setHour_left_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMinutes_left_TV() {
            return null;
        }
        
        public final void setMinutes_left_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.Button getItem_connect_btn() {
            return null;
        }
        
        public final void setItem_connect_btn(@org.jetbrains.annotations.Nullable()
        android.widget.Button p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getTv_target() {
            return null;
        }
        
        public final void setTv_target(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.support.v7.widget.RecyclerView getRecyclerView() {
            return null;
        }
        
        public final void setRecyclerView(@org.jetbrains.annotations.Nullable()
        android.support.v7.widget.RecyclerView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getItem_stars_IV() {
            return null;
        }
        
        public final void setItem_stars_IV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getItem_status_IV() {
            return null;
        }
        
        public final void setItem_status_IV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.RelativeLayout getItem_user_status_container() {
            return null;
        }
        
        public final void setItem_user_status_container(@org.jetbrains.annotations.Nullable()
        android.widget.RelativeLayout p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getVip_IV() {
            return null;
        }
        
        public final void setVip_IV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getItem_joined_user_TV() {
            return null;
        }
        
        public final void setItem_joined_user_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.LinearLayout getUser_info_container() {
            return null;
        }
        
        public final void setUser_info_container(@org.jetbrains.annotations.Nullable()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.LinearLayout getClick_layout() {
            return null;
        }
        
        public final void setClick_layout(@org.jetbrains.annotations.Nullable()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getMyView() {
            return null;
        }
        
        public final void setMyView(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View myView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/Adapters/Connection_ResultList_Adapter$selectedItemsObj;", "", "()V", "selectedItems", "", "", "getSelectedItems", "()Ljava/util/List;", "setSelectedItems", "(Ljava/util/List;)V", "app_debug"})
    public static final class selectedItemsObj {
        @org.jetbrains.annotations.Nullable()
        private static java.util.List<java.lang.Integer> selectedItems;
        public static final com.zoomapps.eromance.Adapters.Connection_ResultList_Adapter.selectedItemsObj INSTANCE = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.Integer> getSelectedItems() {
            return null;
        }
        
        public final void setSelectedItems(@org.jetbrains.annotations.Nullable()
        java.util.List<java.lang.Integer> p0) {
        }
        
        private selectedItemsObj() {
            super();
        }
    }
}