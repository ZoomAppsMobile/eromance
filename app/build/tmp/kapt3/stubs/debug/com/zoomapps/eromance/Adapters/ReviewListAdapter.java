package com.zoomapps.eromance.Adapters;

import java.lang.System;

/**
 * * Created by User on 03.07.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B#\u0012\u0012\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/zoomapps/eromance/Adapters/ReviewListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/zoomapps/eromance/Adapters/ReviewListAdapter$ViewHolder;", "mDataset", "", "Lcom/zoomapps/eromance/Models/ReviewModel$GetReviewResponseDatum;", "Lcom/zoomapps/eromance/Models/ReviewModel;", "mContext", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "h", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "openUserProfile", "uid", "", "ViewHolder", "app_debug"})
public final class ReviewListAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.zoomapps.eromance.Adapters.ReviewListAdapter.ViewHolder> {
    private final java.util.List<com.zoomapps.eromance.Models.ReviewModel.GetReviewResponseDatum> mDataset = null;
    private final android.content.Context mContext = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zoomapps.eromance.Adapters.ReviewListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Adapters.ReviewListAdapter.ViewHolder h, int position) {
    }
    
    public final void openUserProfile(@org.jetbrains.annotations.Nullable()
    java.lang.String uid) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public ReviewListAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.ReviewModel.GetReviewResponseDatum> mDataset, @org.jetbrains.annotations.Nullable()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010\u00a8\u0006!"}, d2 = {"Lcom/zoomapps/eromance/Adapters/ReviewListAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "myView", "Landroid/view/View;", "(Lcom/zoomapps/eromance/Adapters/ReviewListAdapter;Landroid/view/View;)V", "item_user_avatar_CIV", "Lde/hdodenhof/circleimageview/CircleImageView;", "getItem_user_avatar_CIV", "()Lde/hdodenhof/circleimageview/CircleImageView;", "setItem_user_avatar_CIV", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "item_username_TV", "Landroid/widget/TextView;", "getItem_username_TV", "()Landroid/widget/TextView;", "setItem_username_TV", "(Landroid/widget/TextView;)V", "main_container_CV", "Landroid/support/v7/widget/CardView;", "getMain_container_CV", "()Landroid/support/v7/widget/CardView;", "setMain_container_CV", "(Landroid/support/v7/widget/CardView;)V", "getMyView", "()Landroid/view/View;", "setMyView", "(Landroid/view/View;)V", "review_content_TV", "getReview_content_TV", "setReview_content_TV", "review_date_TV", "getReview_date_TV", "setReview_date_TV", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private android.support.v7.widget.CardView main_container_CV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView item_username_TV;
        @org.jetbrains.annotations.Nullable()
        private de.hdodenhof.circleimageview.CircleImageView item_user_avatar_CIV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView review_content_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView review_date_TV;
        @org.jetbrains.annotations.NotNull()
        private android.view.View myView;
        
        @org.jetbrains.annotations.Nullable()
        public final android.support.v7.widget.CardView getMain_container_CV() {
            return null;
        }
        
        public final void setMain_container_CV(@org.jetbrains.annotations.Nullable()
        android.support.v7.widget.CardView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getItem_username_TV() {
            return null;
        }
        
        public final void setItem_username_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final de.hdodenhof.circleimageview.CircleImageView getItem_user_avatar_CIV() {
            return null;
        }
        
        public final void setItem_user_avatar_CIV(@org.jetbrains.annotations.Nullable()
        de.hdodenhof.circleimageview.CircleImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getReview_content_TV() {
            return null;
        }
        
        public final void setReview_content_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getReview_date_TV() {
            return null;
        }
        
        public final void setReview_date_TV(@org.jetbrains.annotations.Nullable()
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