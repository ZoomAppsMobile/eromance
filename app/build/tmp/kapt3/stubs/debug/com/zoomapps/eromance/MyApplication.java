package com.zoomapps.eromance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/zoomapps/eromance/MyApplication;", "Landroid/app/Application;", "()V", "vkAccessTokenTracker", "Lcom/vk/sdk/VKAccessTokenTracker;", "getVkAccessTokenTracker", "()Lcom/vk/sdk/VKAccessTokenTracker;", "setVkAccessTokenTracker", "(Lcom/vk/sdk/VKAccessTokenTracker;)V", "onCreate", "", "Companion", "app_debug"})
public final class MyApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private com.vk.sdk.VKAccessTokenTracker vkAccessTokenTracker;
    private static com.zoomapps.eromance.MyApplication instance;
    public static final com.zoomapps.eromance.MyApplication.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vk.sdk.VKAccessTokenTracker getVkAccessTokenTracker() {
        return null;
    }
    
    public final void setVkAccessTokenTracker(@org.jetbrains.annotations.NotNull()
    com.vk.sdk.VKAccessTokenTracker p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public MyApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/zoomapps/eromance/MyApplication$Companion;", "", "()V", "instance", "Lcom/zoomapps/eromance/MyApplication;", "getInstance", "()Lcom/zoomapps/eromance/MyApplication;", "setInstance", "(Lcom/zoomapps/eromance/MyApplication;)V", "applicationContext", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private final com.zoomapps.eromance.MyApplication getInstance() {
            return null;
        }
        
        private final void setInstance(com.zoomapps.eromance.MyApplication p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context applicationContext() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}