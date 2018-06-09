package com.zoomapps.eromance.Adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B#\u0012\u0012\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/zoomapps/eromance/Adapters/DialogsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/zoomapps/eromance/Adapters/DialogsAdapter$ViewHolder;", "mDataset", "", "Lcom/zoomapps/eromance/Models/DialogsModel$Datum;", "Lcom/zoomapps/eromance/Models/DialogsModel;", "mContext", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class DialogsAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.zoomapps.eromance.Adapters.DialogsAdapter.ViewHolder> {
    private final java.util.List<com.zoomapps.eromance.Models.DialogsModel.Datum> mDataset = null;
    private final android.content.Context mContext = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zoomapps.eromance.Adapters.DialogsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Adapters.DialogsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public DialogsAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.DialogsModel.Datum> mDataset, @org.jetbrains.annotations.Nullable()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006$"}, d2 = {"Lcom/zoomapps/eromance/Adapters/DialogsAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "myView", "Landroid/view/View;", "(Lcom/zoomapps/eromance/Adapters/DialogsAdapter;Landroid/view/View;)V", "item_dialog_info_container", "Landroid/widget/LinearLayout;", "getItem_dialog_info_container", "()Landroid/widget/LinearLayout;", "setItem_dialog_info_container", "(Landroid/widget/LinearLayout;)V", "item_message_count_TV", "Landroid/widget/TextView;", "getItem_message_count_TV", "()Landroid/widget/TextView;", "setItem_message_count_TV", "(Landroid/widget/TextView;)V", "item_user_avatar_IV", "Landroid/widget/ImageView;", "getItem_user_avatar_IV", "()Landroid/widget/ImageView;", "setItem_user_avatar_IV", "(Landroid/widget/ImageView;)V", "item_user_name_TV", "getItem_user_name_TV", "setItem_user_name_TV", "item_user_status_frame_IV", "getItem_user_status_frame_IV", "setItem_user_status_frame_IV", "main_item_container", "getMain_item_container", "setMain_item_container", "getMyView", "()Landroid/view/View;", "setMyView", "(Landroid/view/View;)V", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private android.widget.LinearLayout main_item_container;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView item_user_avatar_IV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView item_user_status_frame_IV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView item_user_name_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.LinearLayout item_dialog_info_container;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView item_message_count_TV;
        @org.jetbrains.annotations.NotNull()
        private android.view.View myView;
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.LinearLayout getMain_item_container() {
            return null;
        }
        
        public final void setMain_item_container(@org.jetbrains.annotations.Nullable()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getItem_user_avatar_IV() {
            return null;
        }
        
        public final void setItem_user_avatar_IV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getItem_user_status_frame_IV() {
            return null;
        }
        
        public final void setItem_user_status_frame_IV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getItem_user_name_TV() {
            return null;
        }
        
        public final void setItem_user_name_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.LinearLayout getItem_dialog_info_container() {
            return null;
        }
        
        public final void setItem_dialog_info_container(@org.jetbrains.annotations.Nullable()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getItem_message_count_TV() {
            return null;
        }
        
        public final void setItem_message_count_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
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
}