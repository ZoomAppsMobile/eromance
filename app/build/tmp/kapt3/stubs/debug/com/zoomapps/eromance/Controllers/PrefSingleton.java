package com.zoomapps.eromance.Controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000bJ\u0016\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/zoomapps/eromance/Controllers/PrefSingleton;", "", "()V", "mContext", "Landroid/content/Context;", "mMyPreferences", "Landroid/content/SharedPreferences;", "Initialize", "", "ctxt", "getBooleanPreference", "", "key", "", "getPref", "getPreference", "writeBooleanPreference", "value", "writePreference", "Companion", "app_debug"})
public final class PrefSingleton {
    private android.content.Context mContext;
    private android.content.SharedPreferences mMyPreferences;
    private static com.zoomapps.eromance.Controllers.PrefSingleton mInstance;
    public static final com.zoomapps.eromance.Controllers.PrefSingleton.Companion Companion = null;
    
    public final void Initialize(@org.jetbrains.annotations.NotNull()
    android.content.Context ctxt) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences getPref() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPreference(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final boolean getBooleanPreference(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    public final void writePreference(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void writeBooleanPreference(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    private PrefSingleton() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/zoomapps/eromance/Controllers/PrefSingleton$Companion;", "", "()V", "instance", "Lcom/zoomapps/eromance/Controllers/PrefSingleton;", "getInstance", "()Lcom/zoomapps/eromance/Controllers/PrefSingleton;", "mInstance", "getMInstance", "setMInstance", "(Lcom/zoomapps/eromance/Controllers/PrefSingleton;)V", "app_debug"})
    public static final class Companion {
        
        private final com.zoomapps.eromance.Controllers.PrefSingleton getMInstance() {
            return null;
        }
        
        private final void setMInstance(com.zoomapps.eromance.Controllers.PrefSingleton p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.zoomapps.eromance.Controllers.PrefSingleton getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}