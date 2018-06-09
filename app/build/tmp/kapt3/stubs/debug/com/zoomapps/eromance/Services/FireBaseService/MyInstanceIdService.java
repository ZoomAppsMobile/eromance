package com.zoomapps.eromance.Services.FireBaseService;

import java.lang.System;

/**
 * * Created by User on 18.05.2017.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u00a8\u0006\t"}, d2 = {"Lcom/zoomapps/eromance/Services/FireBaseService/MyInstanceIdService;", "Lcom/google/firebase/iid/FirebaseInstanceIdService;", "()V", "onTokenRefresh", "", "sendRegistrationToServer", "token", "", "Companion", "app_debug"})
public final class MyInstanceIdService extends com.google.firebase.iid.FirebaseInstanceIdService {
    private static final java.lang.String TAG = "MyFirebaseIIDService";
    public static final com.zoomapps.eromance.Services.FireBaseService.MyInstanceIdService.Companion Companion = null;
    
    /**
     * * Called if InstanceID token is updated. This may occur if the security of
     *     * the previous token had been compromised. Note that this is called when the InstanceID token
     *     * is initially generated so this is where you would retrieve the token.
     */
    @java.lang.Override()
    public void onTokenRefresh() {
    }
    
    /**
     * * Persist token to third-party servers.
     *
     *     * Modify this method to associate the user's FCM InstanceID token with any server-side account
     *     * maintained by your application.
     *
     *     * @param token The new token.
     */
    private final void sendRegistrationToServer(java.lang.String token) {
    }
    
    public MyInstanceIdService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/zoomapps/eromance/Services/FireBaseService/MyInstanceIdService$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}