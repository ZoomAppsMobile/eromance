package com.zoomapps.eromance.Adapters;

import java.lang.System;

/**
 * * Created by User on 14.07.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B#\u0012\u0012\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/zoomapps/eromance/Adapters/GameHistoryAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/zoomapps/eromance/Adapters/GameHistoryAdapter$ViewHolder;", "mDataset", "", "Lcom/zoomapps/eromance/Models/GameHistoryModel$Datum;", "Lcom/zoomapps/eromance/Models/GameHistoryModel;", "mContext", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class GameHistoryAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.zoomapps.eromance.Adapters.GameHistoryAdapter.ViewHolder> {
    private final java.util.List<com.zoomapps.eromance.Models.GameHistoryModel.Datum> mDataset = null;
    private final android.content.Context mContext = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zoomapps.eromance.Adapters.GameHistoryAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Adapters.GameHistoryAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public GameHistoryAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.GameHistoryModel.Datum> mDataset, @org.jetbrains.annotations.Nullable()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\b\"\u0004\b,\u0010\nR\u001c\u0010-\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\b\"\u0004\b/\u0010\nR\u001c\u00100\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\b\"\u0004\b2\u0010\n\u00a8\u00063"}, d2 = {"Lcom/zoomapps/eromance/Adapters/GameHistoryAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "myView", "Landroid/view/View;", "(Lcom/zoomapps/eromance/Adapters/GameHistoryAdapter;Landroid/view/View;)V", "cu_paper_pick", "Landroid/widget/ImageView;", "getCu_paper_pick", "()Landroid/widget/ImageView;", "setCu_paper_pick", "(Landroid/widget/ImageView;)V", "cu_rock_pick", "getCu_rock_pick", "setCu_rock_pick", "cu_scissors_pick", "getCu_scissors_pick", "setCu_scissors_pick", "game_date_TV", "Landroid/widget/TextView;", "getGame_date_TV", "()Landroid/widget/TextView;", "setGame_date_TV", "(Landroid/widget/TextView;)V", "game_item_bet_TV", "getGame_item_bet_TV", "setGame_item_bet_TV", "game_result_TV", "getGame_result_TV", "setGame_result_TV", "game_rival_name_TV", "getGame_rival_name_TV", "setGame_rival_name_TV", "main_item_container", "Landroid/widget/LinearLayout;", "getMain_item_container", "()Landroid/widget/LinearLayout;", "setMain_item_container", "(Landroid/widget/LinearLayout;)V", "getMyView", "()Landroid/view/View;", "setMyView", "(Landroid/view/View;)V", "ou_paper_pick", "getOu_paper_pick", "setOu_paper_pick", "ou_rock_pick", "getOu_rock_pick", "setOu_rock_pick", "ou_scissors_pick", "getOu_scissors_pick", "setOu_scissors_pick", "app_debug"})
    public final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private android.widget.LinearLayout main_item_container;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView cu_rock_pick;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView cu_scissors_pick;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView cu_paper_pick;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView ou_rock_pick;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView ou_scissors_pick;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView ou_paper_pick;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView game_result_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView game_item_bet_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView game_rival_name_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView game_date_TV;
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
        public final android.widget.ImageView getCu_rock_pick() {
            return null;
        }
        
        public final void setCu_rock_pick(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getCu_scissors_pick() {
            return null;
        }
        
        public final void setCu_scissors_pick(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getCu_paper_pick() {
            return null;
        }
        
        public final void setCu_paper_pick(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getOu_rock_pick() {
            return null;
        }
        
        public final void setOu_rock_pick(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getOu_scissors_pick() {
            return null;
        }
        
        public final void setOu_scissors_pick(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getOu_paper_pick() {
            return null;
        }
        
        public final void setOu_paper_pick(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getGame_result_TV() {
            return null;
        }
        
        public final void setGame_result_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getGame_item_bet_TV() {
            return null;
        }
        
        public final void setGame_item_bet_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getGame_rival_name_TV() {
            return null;
        }
        
        public final void setGame_rival_name_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getGame_date_TV() {
            return null;
        }
        
        public final void setGame_date_TV(@org.jetbrains.annotations.Nullable()
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