package com.zoomapps.eromance.Adapters;

import java.lang.System;

/**
 * * Created by User on 06.06.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000212B#\u0012\u0012\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J&\u0010\u001d\u001a\u00020\u00172\n\u0010\u001e\u001a\u00060\u0005R\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\"J:\u0010#\u001a\u00020\u00172\n\u0010$\u001a\u00060\u0005R\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010&2\b\u0010*\u001a\u0004\u0018\u00010 J$\u0010+\u001a\u00020\u00172\b\u0010,\u001a\u0004\u0018\u00010\u000b2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010!\u001a\u00020\"J\u001a\u0010-\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010&J\u001a\u0010/\u001a\u00020\u00172\b\u00100\u001a\u0004\u0018\u00010\u000b2\b\u0010%\u001a\u0004\u0018\u00010&R\u0014\u0010\n\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/zoomapps/eromance/Adapters/ChatMessageAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "mDataset", "", "Lcom/zoomapps/eromance/Models/ChatMessageModel$Datum_;", "Lcom/zoomapps/eromance/Models/ChatMessageModel;", "mContext", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "ImageMessageTag_Type", "", "getImageMessageTag_Type", "()Ljava/lang/String;", "ServerImageMessageTag_Type", "getServerImageMessageTag_Type", "TextMessageTag_Type", "getTextMessageTag_Type", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClick", "msg_data", "buggbleview", "Landroid/widget/LinearLayout;", "from_network", "", "setData", "data", "msg_TV", "Landroid/widget/TextView;", "msg_IV", "Landroid/widget/ImageView;", "msg_date_TV", "container_LL", "setImageMessage", "image_path", "setMessageDate", "date_str", "setTextMessage", "message_text", "ViewHolderInterlocutorMessage", "ViewHolderMyMessage", "app_debug"})
public final class ChatMessageAdapter extends android.support.v7.widget.RecyclerView.Adapter<android.support.v7.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ServerImageMessageTag_Type = "Server_Img-";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ImageMessageTag_Type = "Img-";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TextMessageTag_Type = "Text-";
    private final java.util.List<com.zoomapps.eromance.Models.ChatMessageModel.Datum_> mDataset = null;
    private final android.content.Context mContext = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.ChatMessageModel.Datum_ data, @org.jetbrains.annotations.Nullable()
    android.widget.TextView msg_TV, @org.jetbrains.annotations.Nullable()
    android.widget.ImageView msg_IV, @org.jetbrains.annotations.Nullable()
    android.widget.TextView msg_date_TV, @org.jetbrains.annotations.Nullable()
    android.widget.LinearLayout container_LL) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServerImageMessageTag_Type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageMessageTag_Type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTextMessageTag_Type() {
        return null;
    }
    
    public final void setClick(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.ChatMessageModel.Datum_ msg_data, @org.jetbrains.annotations.Nullable()
    android.widget.LinearLayout buggbleview, boolean from_network) {
    }
    
    public final void setMessageDate(@org.jetbrains.annotations.Nullable()
    java.lang.String date_str, @org.jetbrains.annotations.Nullable()
    android.widget.TextView msg_date_TV) {
    }
    
    public final void setTextMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String message_text, @org.jetbrains.annotations.Nullable()
    android.widget.TextView msg_TV) {
    }
    
    public final void setImageMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String image_path, @org.jetbrains.annotations.Nullable()
    android.widget.ImageView msg_IV, boolean from_network) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public ChatMessageAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<com.zoomapps.eromance.Models.ChatMessageModel.Datum_> mDataset, @org.jetbrains.annotations.Nullable()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006!"}, d2 = {"Lcom/zoomapps/eromance/Adapters/ChatMessageAdapter$ViewHolderMyMessage;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "myView", "Landroid/view/View;", "(Lcom/zoomapps/eromance/Adapters/ChatMessageAdapter;Landroid/view/View;)V", "message_IV", "Landroid/widget/ImageView;", "getMessage_IV", "()Landroid/widget/ImageView;", "setMessage_IV", "(Landroid/widget/ImageView;)V", "message_TV", "Lcom/vanniktech/emoji/EmojiTextView;", "getMessage_TV", "()Lcom/vanniktech/emoji/EmojiTextView;", "setMessage_TV", "(Lcom/vanniktech/emoji/EmojiTextView;)V", "message_bubble_LL", "Landroid/widget/LinearLayout;", "getMessage_bubble_LL", "()Landroid/widget/LinearLayout;", "setMessage_bubble_LL", "(Landroid/widget/LinearLayout;)V", "message_date_TV", "Landroid/widget/TextView;", "getMessage_date_TV", "()Landroid/widget/TextView;", "setMessage_date_TV", "(Landroid/widget/TextView;)V", "getMyView", "()Landroid/view/View;", "setMyView", "(Landroid/view/View;)V", "app_debug"})
    public final class ViewHolderMyMessage extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private android.widget.LinearLayout message_bubble_LL;
        @org.jetbrains.annotations.Nullable()
        private com.vanniktech.emoji.EmojiTextView message_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView message_IV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView message_date_TV;
        @org.jetbrains.annotations.NotNull()
        private android.view.View myView;
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.LinearLayout getMessage_bubble_LL() {
            return null;
        }
        
        public final void setMessage_bubble_LL(@org.jetbrains.annotations.Nullable()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.vanniktech.emoji.EmojiTextView getMessage_TV() {
            return null;
        }
        
        public final void setMessage_TV(@org.jetbrains.annotations.Nullable()
        com.vanniktech.emoji.EmojiTextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getMessage_IV() {
            return null;
        }
        
        public final void setMessage_IV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMessage_date_TV() {
            return null;
        }
        
        public final void setMessage_date_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getMyView() {
            return null;
        }
        
        public final void setMyView(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public ViewHolderMyMessage(@org.jetbrains.annotations.NotNull()
        android.view.View myView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006!"}, d2 = {"Lcom/zoomapps/eromance/Adapters/ChatMessageAdapter$ViewHolderInterlocutorMessage;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "myView", "Landroid/view/View;", "(Lcom/zoomapps/eromance/Adapters/ChatMessageAdapter;Landroid/view/View;)V", "message_IV", "Landroid/widget/ImageView;", "getMessage_IV", "()Landroid/widget/ImageView;", "setMessage_IV", "(Landroid/widget/ImageView;)V", "message_TV", "Lcom/vanniktech/emoji/EmojiTextView;", "getMessage_TV", "()Lcom/vanniktech/emoji/EmojiTextView;", "setMessage_TV", "(Lcom/vanniktech/emoji/EmojiTextView;)V", "message_bubble_LL", "Landroid/widget/LinearLayout;", "getMessage_bubble_LL", "()Landroid/widget/LinearLayout;", "setMessage_bubble_LL", "(Landroid/widget/LinearLayout;)V", "message_date_TV", "Landroid/widget/TextView;", "getMessage_date_TV", "()Landroid/widget/TextView;", "setMessage_date_TV", "(Landroid/widget/TextView;)V", "getMyView", "()Landroid/view/View;", "setMyView", "(Landroid/view/View;)V", "app_debug"})
    public final class ViewHolderInterlocutorMessage extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        private android.widget.LinearLayout message_bubble_LL;
        @org.jetbrains.annotations.Nullable()
        private com.vanniktech.emoji.EmojiTextView message_TV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView message_IV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView message_date_TV;
        @org.jetbrains.annotations.NotNull()
        private android.view.View myView;
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.LinearLayout getMessage_bubble_LL() {
            return null;
        }
        
        public final void setMessage_bubble_LL(@org.jetbrains.annotations.Nullable()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.vanniktech.emoji.EmojiTextView getMessage_TV() {
            return null;
        }
        
        public final void setMessage_TV(@org.jetbrains.annotations.Nullable()
        com.vanniktech.emoji.EmojiTextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getMessage_IV() {
            return null;
        }
        
        public final void setMessage_IV(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getMessage_date_TV() {
            return null;
        }
        
        public final void setMessage_date_TV(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getMyView() {
            return null;
        }
        
        public final void setMyView(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public ViewHolderInterlocutorMessage(@org.jetbrains.annotations.NotNull()
        android.view.View myView) {
            super(null);
        }
    }
}