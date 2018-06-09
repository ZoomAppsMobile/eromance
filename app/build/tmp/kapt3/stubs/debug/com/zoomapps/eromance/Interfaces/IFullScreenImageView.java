package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 04.09.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/IFullScreenImageView;", "", "onImageLoaded", "", "result", "Landroid/graphics/Bitmap;", "imgDisplay", "Lcom/zoomapps/eromance/CustomViews/TouchImageView;", "loading_PB", "Landroid/widget/ProgressBar;", "pos", "", "app_debug"})
public abstract interface IFullScreenImageView {
    
    public abstract void onImageLoaded(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap result, @org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.CustomViews.TouchImageView imgDisplay, @org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar loading_PB, int pos);
}