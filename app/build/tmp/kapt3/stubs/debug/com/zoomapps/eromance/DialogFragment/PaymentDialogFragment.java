package com.zoomapps.eromance.DialogFragment;

import java.lang.System;

/**
 * * Created by User on 07.09.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001a\u0010\u001c\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018\u00a8\u0006("}, d2 = {"Lcom/zoomapps/eromance/DialogFragment/PaymentDialogFragment;", "Lcom/zoomapps/eromance/DialogFragment/BaseDialogFragment;", "()V", "cancel_btn", "Landroid/widget/Button;", "getCancel_btn", "()Landroid/widget/Button;", "setCancel_btn", "(Landroid/widget/Button;)V", "defaultClickAction", "Landroid/view/View$OnClickListener;", "getDefaultClickAction", "()Landroid/view/View$OnClickListener;", "setDefaultClickAction", "(Landroid/view/View$OnClickListener;)V", "dialog_text", "", "getDialog_text", "()Ljava/lang/String;", "payment_text_TV", "Landroid/widget/TextView;", "getPayment_text_TV", "()Landroid/widget/TextView;", "setPayment_text_TV", "(Landroid/widget/TextView;)V", "send_btn", "getSend_btn", "setSend_btn", "title_TV", "getTitle_TV", "setTitle_TV", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class PaymentDialogFragment extends com.zoomapps.eromance.DialogFragment.BaseDialogFragment {
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView title_TV;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView payment_text_TV;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button cancel_btn;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button send_btn;
    @org.jetbrains.annotations.NotNull()
    private android.view.View.OnClickListener defaultClickAction;
    private static final java.lang.String ARG_PARAM1 = "dialog_text";
    public static final com.zoomapps.eromance.DialogFragment.PaymentDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTitle_TV() {
        return null;
    }
    
    public final void setTitle_TV(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getPayment_text_TV() {
        return null;
    }
    
    public final void setPayment_text_TV(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getCancel_btn() {
        return null;
    }
    
    public final void setCancel_btn(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getSend_btn() {
        return null;
    }
    
    public final void setSend_btn(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    private final java.lang.String getDialog_text() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View.OnClickListener getDefaultClickAction() {
        return null;
    }
    
    public final void setDefaultClickAction(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public PaymentDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/DialogFragment/PaymentDialogFragment$Companion;", "", "()V", "ARG_PARAM1", "", "getARG_PARAM1", "()Ljava/lang/String;", "newInstance", "Lcom/zoomapps/eromance/DialogFragment/PaymentDialogFragment;", "dialog_text", "app_debug"})
    public static final class Companion {
        
        private final java.lang.String getARG_PARAM1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.zoomapps.eromance.DialogFragment.PaymentDialogFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.lang.String dialog_text) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}