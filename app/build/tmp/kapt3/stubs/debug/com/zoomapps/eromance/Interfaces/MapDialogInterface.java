package com.zoomapps.eromance.Interfaces;

import java.lang.System;

/**
 * * Created by User on 29.05.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lcom/zoomapps/eromance/Interfaces/MapDialogInterface;", "", "checkType", "", "type", "", "removeSex", "", "removeType", "setDialogResult", "setSex", "setType", "app_debug"})
public abstract interface MapDialogInterface {
    
    public abstract void setSex(int type);
    
    public abstract void removeSex(int type);
    
    public abstract void setType(int type);
    
    public abstract void removeType(int type);
    
    public abstract boolean checkType(int type);
    
    public abstract void setDialogResult();
}