package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 30.06.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/ITwentyOneSendRequestView;", "", "onRequestSendError", "", "err_msg", "", "onRequestSendSuccessfully", "app_debug"})
public abstract interface ITwentyOneSendRequestView {
    
    public abstract void onRequestSendSuccessfully();
    
    public abstract void onRequestSendError(@org.jetbrains.annotations.Nullable()
    java.lang.String err_msg);
    
    /**
     * * Created by User on 30.06.2017.
     */
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}