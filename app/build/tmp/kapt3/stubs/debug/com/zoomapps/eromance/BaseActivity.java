package com.zoomapps.eromance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/zoomapps/eromance/BaseActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "THRESHOLD", "", "getTHRESHOLD", "()J", "doubleBackToExitPressedOnce", "", "getDoubleBackToExitPressedOnce", "()Z", "setDoubleBackToExitPressedOnce", "(Z)V", "onBackPressed", "", "app_debug"})
public class BaseActivity extends android.support.v7.app.AppCompatActivity {
    private final long THRESHOLD = 2000L;
    private boolean doubleBackToExitPressedOnce;
    private java.util.HashMap _$_findViewCache;
    
    public final long getTHRESHOLD() {
        return 0L;
    }
    
    public final boolean getDoubleBackToExitPressedOnce() {
        return false;
    }
    
    public final void setDoubleBackToExitPressedOnce(boolean p0) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public BaseActivity() {
        super();
    }
}