package com.zoomapps.eromance.CustomViews;

import java.lang.System;

/**
 * * Created by User on 07.06.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u0000 ]2\u00020\u0001:\u0002]^B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\r\u0010J\u001a\u00020KH\u0000\u00a2\u0006\u0002\bLJ%\u0010M\u001a\u00020$2\u0006\u0010N\u001a\u00020$2\u0006\u0010O\u001a\u00020$2\u0006\u0010P\u001a\u00020$H\u0000\u00a2\u0006\u0002\bQJ%\u0010R\u001a\u00020$2\u0006\u0010S\u001a\u00020$2\u0006\u0010O\u001a\u00020$2\u0006\u0010P\u001a\u00020$H\u0000\u00a2\u0006\u0002\bTJ\u0018\u0010U\u001a\u00020K2\u0006\u0010V\u001a\u00020-2\u0006\u0010W\u001a\u00020-H\u0014J\u000e\u0010X\u001a\u00020K2\u0006\u0010Y\u001a\u00020$J\u0010\u0010Z\u001a\u00020K2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010[\u001a\u00020KH\u0002J\b\u0010\\\u001a\u00020KH\u0002R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020$X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001a\u0010,\u001a\u00020-X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020-X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u001a\u00105\u001a\u00020-X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\u001a\u00108\u001a\u00020$X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R\u001a\u0010;\u001a\u00020$X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010&\"\u0004\b=\u0010(R\u001a\u0010>\u001a\u00020$X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010&\"\u0004\b@\u0010(R\u001a\u0010A\u001a\u00020\fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000e\"\u0004\bC\u0010\u0010R\u001a\u0010D\u001a\u00020-X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010/\"\u0004\bF\u00101R\u001a\u0010G\u001a\u00020-X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010/\"\u0004\bI\u00101\u00a8\u0006_"}, d2 = {"Lcom/zoomapps/eromance/CustomViews/TouchImageView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getContext$app_debug", "()Landroid/content/Context;", "setContext$app_debug", "last", "Landroid/graphics/PointF;", "getLast$app_debug", "()Landroid/graphics/PointF;", "setLast$app_debug", "(Landroid/graphics/PointF;)V", "m", "", "getM$app_debug", "()[F", "setM$app_debug", "([F)V", "mScaleDetector", "Landroid/view/ScaleGestureDetector;", "getMScaleDetector$app_debug", "()Landroid/view/ScaleGestureDetector;", "setMScaleDetector$app_debug", "(Landroid/view/ScaleGestureDetector;)V", "matrix", "Landroid/graphics/Matrix;", "getMatrix$app_debug", "()Landroid/graphics/Matrix;", "setMatrix$app_debug", "(Landroid/graphics/Matrix;)V", "maxScale", "", "getMaxScale$app_debug", "()F", "setMaxScale$app_debug", "(F)V", "minScale", "getMinScale$app_debug", "setMinScale$app_debug", "mode", "", "getMode$app_debug", "()I", "setMode$app_debug", "(I)V", "oldMeasuredHeight", "getOldMeasuredHeight$app_debug", "setOldMeasuredHeight$app_debug", "oldMeasuredWidth", "getOldMeasuredWidth$app_debug", "setOldMeasuredWidth$app_debug", "origHeight", "getOrigHeight", "setOrigHeight", "origWidth", "getOrigWidth", "setOrigWidth", "saveScale", "getSaveScale$app_debug", "setSaveScale$app_debug", "start", "getStart$app_debug", "setStart$app_debug", "viewHeight", "getViewHeight$app_debug", "setViewHeight$app_debug", "viewWidth", "getViewWidth$app_debug", "setViewWidth$app_debug", "fixTrans", "", "fixTrans$app_debug", "getFixDragTrans", "delta", "viewSize", "contentSize", "getFixDragTrans$app_debug", "getFixTrans", "trans", "getFixTrans$app_debug", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setMaxZoom", "x", "sharedConstructing", "startInterceptEvent", "stopInterceptEvent", "Companion", "ScaleListener", "app_debug"})
public final class TouchImageView extends android.widget.ImageView {
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Matrix matrix;
    private int mode;
    @org.jetbrains.annotations.NotNull()
    private android.graphics.PointF last;
    @org.jetbrains.annotations.NotNull()
    private android.graphics.PointF start;
    private float minScale;
    private float maxScale;
    @org.jetbrains.annotations.Nullable()
    private float[] m;
    private int viewWidth;
    private int viewHeight;
    private float saveScale;
    private float origWidth;
    private float origHeight;
    private int oldMeasuredWidth;
    private int oldMeasuredHeight;
    @org.jetbrains.annotations.Nullable()
    private android.view.ScaleGestureDetector mScaleDetector;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    private static final int NONE = 0;
    private static final int DRAG = 1;
    private static final int ZOOM = 2;
    private static final int CLICK = 3;
    public static final com.zoomapps.eromance.CustomViews.TouchImageView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Matrix getMatrix$app_debug() {
        return null;
    }
    
    public final void setMatrix$app_debug(@org.jetbrains.annotations.Nullable()
    android.graphics.Matrix p0) {
    }
    
    public final int getMode$app_debug() {
        return 0;
    }
    
    public final void setMode$app_debug(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.PointF getLast$app_debug() {
        return null;
    }
    
    public final void setLast$app_debug(@org.jetbrains.annotations.NotNull()
    android.graphics.PointF p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.PointF getStart$app_debug() {
        return null;
    }
    
    public final void setStart$app_debug(@org.jetbrains.annotations.NotNull()
    android.graphics.PointF p0) {
    }
    
    public final float getMinScale$app_debug() {
        return 0.0F;
    }
    
    public final void setMinScale$app_debug(float p0) {
    }
    
    public final float getMaxScale$app_debug() {
        return 0.0F;
    }
    
    public final void setMaxScale$app_debug(float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final float[] getM$app_debug() {
        return null;
    }
    
    public final void setM$app_debug(@org.jetbrains.annotations.Nullable()
    float[] p0) {
    }
    
    public final int getViewWidth$app_debug() {
        return 0;
    }
    
    public final void setViewWidth$app_debug(int p0) {
    }
    
    public final int getViewHeight$app_debug() {
        return 0;
    }
    
    public final void setViewHeight$app_debug(int p0) {
    }
    
    public final float getSaveScale$app_debug() {
        return 0.0F;
    }
    
    public final void setSaveScale$app_debug(float p0) {
    }
    
    protected final float getOrigWidth() {
        return 0.0F;
    }
    
    protected final void setOrigWidth(float p0) {
    }
    
    protected final float getOrigHeight() {
        return 0.0F;
    }
    
    protected final void setOrigHeight(float p0) {
    }
    
    public final int getOldMeasuredWidth$app_debug() {
        return 0;
    }
    
    public final void setOldMeasuredWidth$app_debug(int p0) {
    }
    
    public final int getOldMeasuredHeight$app_debug() {
        return 0;
    }
    
    public final void setOldMeasuredHeight$app_debug(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.ScaleGestureDetector getMScaleDetector$app_debug() {
        return null;
    }
    
    public final void setMScaleDetector$app_debug(@org.jetbrains.annotations.Nullable()
    android.view.ScaleGestureDetector p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext$app_debug() {
        return null;
    }
    
    public final void setContext$app_debug(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    private final void stopInterceptEvent() {
    }
    
    private final void startInterceptEvent() {
    }
    
    private final void sharedConstructing(android.content.Context context) {
    }
    
    public final void setMaxZoom(float x) {
    }
    
    public final void fixTrans$app_debug() {
    }
    
    public final float getFixTrans$app_debug(float trans, float viewSize, float contentSize) {
        return 0.0F;
    }
    
    public final float getFixDragTrans$app_debug(float delta, float viewSize, float contentSize) {
        return 0.0F;
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    public TouchImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public TouchImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/zoomapps/eromance/CustomViews/TouchImageView$ScaleListener;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "(Lcom/zoomapps/eromance/CustomViews/TouchImageView;)V", "onScale", "", "detector", "Landroid/view/ScaleGestureDetector;", "onScaleBegin", "app_debug"})
    final class ScaleListener extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener {
        
        @java.lang.Override()
        public boolean onScaleBegin(@org.jetbrains.annotations.NotNull()
        android.view.ScaleGestureDetector detector) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onScale(@org.jetbrains.annotations.NotNull()
        android.view.ScaleGestureDetector detector) {
            return false;
        }
        
        public ScaleListener() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/zoomapps/eromance/CustomViews/TouchImageView$Companion;", "", "()V", "CLICK", "", "getCLICK$app_debug", "()I", "DRAG", "getDRAG$app_debug", "NONE", "getNONE$app_debug", "ZOOM", "getZOOM$app_debug", "app_debug"})
    public static final class Companion {
        
        public final int getNONE$app_debug() {
            return 0;
        }
        
        public final int getDRAG$app_debug() {
            return 0;
        }
        
        public final int getZOOM$app_debug() {
            return 0;
        }
        
        public final int getCLICK$app_debug() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}