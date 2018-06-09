package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 03.07.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001b\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005H&\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H&J\u001b\u0010\t\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/IUserReviewsView;", "", "onReviewLoadError", "", "onReviewSend", "T", "out", "(Ljava/lang/Object;)V", "onReviewSendError", "onReviewsLoaded", "app_debug"})
public abstract interface IUserReviewsView {
    
    public abstract <T extends java.lang.Object>void onReviewsLoaded(T out);
    
    public abstract void onReviewLoadError();
    
    public abstract <T extends java.lang.Object>void onReviewSend(T out);
    
    public abstract void onReviewSendError();
}