package com.zoomapps.eromance.Interfaces;

/**
 * Created by User on 14.09.2017.
 */

public interface IMeetDetailsView {
    public void onConnectedToMeet(Boolean isBlocked);
    public void onUnconnectedToMeet();
    public void onRequestError();

    public void onShowToast(String message);
}
