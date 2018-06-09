package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 12.06.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0019\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a2\u0006\u0002\u0010\bJ#\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&\u00a8\u0006\u0010"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/IUserInteractionView;", "", "onDisliked", "", "onFavoriteError", "onFavorited", "fav_id", "", "(Ljava/lang/Integer;)V", "onFavoritesChecked", "isFav", "", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "onLiked", "onRemoved", "onUnfavorited", "app_debug"})
public abstract interface IUserInteractionView {
    
    public abstract void onLiked();
    
    public abstract void onDisliked();
    
    public abstract void onRemoved();
    
    public abstract void onFavoritesChecked(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFav, @org.jetbrains.annotations.Nullable()
    java.lang.Integer fav_id);
    
    public abstract void onFavorited(@org.jetbrains.annotations.Nullable()
    java.lang.Integer fav_id);
    
    public abstract void onUnfavorited();
    
    public abstract void onFavoriteError();
    
    /**
     * * Created by User on 12.06.2017.
     */
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}