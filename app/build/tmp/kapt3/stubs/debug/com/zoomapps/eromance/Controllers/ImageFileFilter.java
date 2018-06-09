package com.zoomapps.eromance.Controllers;

import java.lang.System;

/**
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/zoomapps/eromance/Controllers/ImageFileFilter;", "Ljava/io/FileFilter;", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "getFile$app_debug", "()Ljava/io/File;", "setFile$app_debug", "okFileExtensions", "", "", "[Ljava/lang/String;", "accept", "", "app_debug"})
public final class ImageFileFilter implements java.io.FileFilter {
    private final java.lang.String[] okFileExtensions = null;
    @org.jetbrains.annotations.NotNull()
    private java.io.File file;
    
    @java.lang.Override()
    public boolean accept(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getFile$app_debug() {
        return null;
    }
    
    public final void setFile$app_debug(@org.jetbrains.annotations.NotNull()
    java.io.File p0) {
    }
    
    public ImageFileFilter(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        super();
    }
}