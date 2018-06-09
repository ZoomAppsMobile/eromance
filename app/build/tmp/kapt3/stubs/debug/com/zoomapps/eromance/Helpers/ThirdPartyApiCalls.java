package com.zoomapps.eromance.Helpers;

import java.lang.System;

/**
 * * Created by User on 17.08.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/zoomapps/eromance/Helpers/ThirdPartyApiCalls;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getMContext", "()Landroid/content/Context;", "mRequestListener", "Lcom/vk/sdk/api/VKRequest$VKRequestListener;", "getMRequestListener$app_debug", "()Lcom/vk/sdk/api/VKRequest$VKRequestListener;", "setMRequestListener$app_debug", "(Lcom/vk/sdk/api/VKRequest$VKRequestListener;)V", "myRequest", "Lcom/vk/sdk/api/VKRequest;", "getOkUserInfo", "", "odnoklassniki", "Lru/ok/android/sdk/Odnoklassniki;", "startVkApiCall", "request", "vkMethods", "methodName", "", "app_debug"})
public final class ThirdPartyApiCalls {
    private com.vk.sdk.api.VKRequest myRequest;
    @org.jetbrains.annotations.NotNull()
    private com.vk.sdk.api.VKRequest.VKRequestListener mRequestListener;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    
    public final void vkMethods(@org.jetbrains.annotations.NotNull()
    java.lang.String methodName) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vk.sdk.api.VKRequest.VKRequestListener getMRequestListener$app_debug() {
        return null;
    }
    
    public final void setMRequestListener$app_debug(@org.jetbrains.annotations.NotNull()
    com.vk.sdk.api.VKRequest.VKRequestListener p0) {
    }
    
    private final void startVkApiCall(com.vk.sdk.api.VKRequest request) {
    }
    
    public final void getOkUserInfo(@org.jetbrains.annotations.NotNull()
    ru.ok.android.sdk.Odnoklassniki odnoklassniki) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public ThirdPartyApiCalls(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
}