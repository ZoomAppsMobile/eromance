package com.zoomapps.eromance.Controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lcom/zoomapps/eromance/Controllers/GlobalVariables;", "", "()V", "default_language", "", "getDefault_language", "()Ljava/lang/String;", "setDefault_language", "(Ljava/lang/String;)V", "empty_string", "getEmpty_string", "facebook", "", "getFacebook", "()I", "google_plus", "getGoogle_plus", "isUserReadAgreement_key", "is_becomeprovider_request_send_key", "mail_ru", "getMail_ru", "odnoklassniki", "getOdnoklassniki", "push_token", "getPush_token", "server_url", "getServer_url", "settings_lang_key", "getSettings_lang_key", "settings_notification_key", "getSettings_notification_key", "user_login", "getUser_login", "user_password", "getUser_password", "user_type_key", "getUser_type_key", "vkontakte", "getVkontakte", "app_debug"})
public final class GlobalVariables {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String user_login = "USER_LOGIN";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String user_password = "USER_PASSWORD";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String empty_string = "";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String push_token = "PUSH_TOKEN";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String default_language;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String server_url = "http://185.146.1.72:8080/";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String isUserReadAgreement_key = "is_agreement_read";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String settings_notification_key = "IsNotifActive";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String settings_lang_key = "Language_TYPE";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String user_type_key = "user_type";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String is_becomeprovider_request_send_key = "is_becomeprovider_request_send";
    private static final int vkontakte = 1;
    private static final int facebook = 2;
    private static final int google_plus = 3;
    private static final int mail_ru = 4;
    private static final int odnoklassniki = 5;
    public static final com.zoomapps.eromance.Controllers.GlobalVariables INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser_login() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser_password() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmpty_string() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPush_token() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDefault_language() {
        return null;
    }
    
    public final void setDefault_language(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServer_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String isUserReadAgreement_key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSettings_notification_key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSettings_lang_key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser_type_key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String is_becomeprovider_request_send_key() {
        return null;
    }
    
    public final int getVkontakte() {
        return 0;
    }
    
    public final int getFacebook() {
        return 0;
    }
    
    public final int getGoogle_plus() {
        return 0;
    }
    
    public final int getMail_ru() {
        return 0;
    }
    
    public final int getOdnoklassniki() {
        return 0;
    }
    
    private GlobalVariables() {
        super();
    }
}