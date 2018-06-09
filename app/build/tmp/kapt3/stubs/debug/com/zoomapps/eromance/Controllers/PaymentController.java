package com.zoomapps.eromance.Controllers;

import java.lang.System;

/**
 * * Created by User on 05.09.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0002%&B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u001bJ\u0012\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u001f\u001a\u000e\u0012\b\u0012\u00060!R\u00020\"\u0018\u00010 2\u0006\u0010\u001e\u001a\u00020\nJ\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\'"}, d2 = {"Lcom/zoomapps/eromance/Controllers/PaymentController;", "", "()V", "isInitailized", "", "()Z", "setInitailized", "(Z)V", "keys", "", "", "", "getKeys", "()Ljava/util/Map;", "mData", "Ljava/util/ArrayList;", "Lcom/zoomapps/eromance/Models/paymentTypes/Datum;", "Lkotlin/collections/ArrayList;", "getMData", "()Ljava/util/ArrayList;", "setMData", "(Ljava/util/ArrayList;)V", "getIdByKey", "key", "(Ljava/lang/String;)Ljava/lang/Integer;", "getPaymentAmount", "paymentID", "(Ljava/lang/Integer;)I", "init_payment", "", "type", "makeRequest", "Lretrofit2/Call;", "Lcom/zoomapps/eromance/Models/PaymentModel$PaymentResponseData;", "Lcom/zoomapps/eromance/Models/PaymentModel;", "onRequestSuccess", "amount", "Companion", "PaymentTypes", "app_debug"})
public final class PaymentController {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.Integer> keys = null;
    private boolean isInitailized;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.zoomapps.eromance.Models.paymentTypes.Datum> mData;
    private static com.zoomapps.eromance.Controllers.PaymentController mInstance;
    public static final com.zoomapps.eromance.Controllers.PaymentController.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIdByKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Integer> getKeys() {
        return null;
    }
    
    public final boolean isInitailized() {
        return false;
    }
    
    public final void setInitailized(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.zoomapps.eromance.Models.paymentTypes.Datum> getMData() {
        return null;
    }
    
    public final void setMData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.zoomapps.eromance.Models.paymentTypes.Datum> p0) {
    }
    
    public final int getPaymentAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer paymentID) {
        return 0;
    }
    
    public final void init_payment(@org.jetbrains.annotations.Nullable()
    java.lang.String type) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Call<com.zoomapps.eromance.Models.PaymentModel.PaymentResponseData> makeRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    public final void onRequestSuccess(@org.jetbrains.annotations.NotNull()
    java.lang.String type, int amount) {
    }
    
    public PaymentController() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/zoomapps/eromance/Controllers/PaymentController$PaymentTypes;", "", "()V", "GIFY", "", "getGIFY", "()Ljava/lang/String;", "PHOTO", "getPHOTO", "PLACE", "getPLACE", "PLACE_VIP", "getPLACE_VIP", "PROFILE_VIP", "getPROFILE_VIP", "app_debug"})
    public static final class PaymentTypes {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String PROFILE_VIP = "profile_vip";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String PLACE = "places";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String PLACE_VIP = "place_vip";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String PHOTO = "photo";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String GIFY = "gift";
        public static final com.zoomapps.eromance.Controllers.PaymentController.PaymentTypes INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPROFILE_VIP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPLACE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPLACE_VIP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPHOTO() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGIFY() {
            return null;
        }
        
        private PaymentTypes() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/Controllers/PaymentController$Companion;", "", "()V", "mInstance", "Lcom/zoomapps/eromance/Controllers/PaymentController;", "getMInstance", "()Lcom/zoomapps/eromance/Controllers/PaymentController;", "setMInstance", "(Lcom/zoomapps/eromance/Controllers/PaymentController;)V", "getInstance", "app_debug"})
    public static final class Companion {
        
        private final com.zoomapps.eromance.Controllers.PaymentController getMInstance() {
            return null;
        }
        
        private final void setMInstance(com.zoomapps.eromance.Controllers.PaymentController p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.zoomapps.eromance.Controllers.PaymentController getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}