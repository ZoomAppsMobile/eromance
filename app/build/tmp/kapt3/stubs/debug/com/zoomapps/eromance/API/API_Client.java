package com.zoomapps.eromance.API;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/zoomapps/eromance/API/API_Client;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "apiService", "Lcom/zoomapps/eromance/API/API_Interface;", "getApiService", "()Lcom/zoomapps/eromance/API/API_Interface;", "setApiService", "(Lcom/zoomapps/eromance/API/API_Interface;)V", "client", "Lretrofit2/Retrofit;", "getClient", "()Lretrofit2/Retrofit;", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "setOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "retrofit", "app_debug"})
public final class API_Client {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "http://185.146.1.72:8080/api/v1/";
    private static retrofit2.Retrofit retrofit;
    @org.jetbrains.annotations.Nullable()
    private static com.zoomapps.eromance.API.API_Interface apiService;
    @org.jetbrains.annotations.Nullable()
    private static okhttp3.OkHttpClient okHttpClient;
    public static final com.zoomapps.eromance.API.API_Client INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBASE_URL() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.zoomapps.eromance.API.API_Interface getApiService() {
        return null;
    }
    
    public final void setApiService(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.API.API_Interface p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    public final void setOkHttpClient(@org.jetbrains.annotations.Nullable()
    okhttp3.OkHttpClient p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Retrofit getClient() {
        return null;
    }
    
    private API_Client() {
        super();
    }
}