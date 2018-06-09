package com.zoomapps.eromance.DialogFragment;

import java.lang.System;

/**
 * * Created by User on 05.09.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/zoomapps/eromance/DialogFragment/DialogFragmentInteraction;", "", "onOkPressed", "", "content", "", "code", "", "app_debug"})
public abstract interface DialogFragmentInteraction {
    
    public abstract void onOkPressed(@org.jetbrains.annotations.Nullable()
    java.lang.String content, int code);
}