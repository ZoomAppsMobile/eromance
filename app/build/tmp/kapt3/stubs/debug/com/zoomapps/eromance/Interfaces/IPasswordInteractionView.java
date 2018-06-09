package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 19.06.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/IPasswordInteractionView;", "", "cp_OnError", "", "cp_OnSuccess", "on_CheckError", "msg", "", "rp_OnError", "rp_OnSuccess", "app_debug"})
public abstract interface IPasswordInteractionView {
    
    public abstract void cp_OnSuccess();
    
    public abstract void cp_OnError();
    
    public abstract void on_CheckError(@org.jetbrains.annotations.Nullable()
    java.lang.String msg);
    
    public abstract void rp_OnSuccess();
    
    public abstract void rp_OnError();
}