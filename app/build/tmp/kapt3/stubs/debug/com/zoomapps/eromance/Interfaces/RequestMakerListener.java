package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 16.06.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u0001H\u0004H&\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0004H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/RequestMakerListener;", "", "onError", "", "T", "out", "(Ljava/lang/Object;)V", "onRequestSuccess", "app_debug"})
public abstract interface RequestMakerListener {
    
    public abstract <T extends java.lang.Object>void onError(@org.jetbrains.annotations.Nullable()
    T out);
    
    public abstract <T extends java.lang.Object>void onRequestSuccess(T out);
    
    /**
     * * Created by User on 16.06.2017.
     */
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}