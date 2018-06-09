package com.zoomapps.eromance.Activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010(\n\u0002\b\u0003\u0018\u0000 \u00a1\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u00a1\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010c\u001a\u00020+J\u000e\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020gJ\b\u0010h\u001a\u00020iH\u0002J\u0006\u0010j\u001a\u00020kJ\u000e\u0010l\u001a\u00020e2\u0006\u0010m\u001a\u00020nJ\b\u0010o\u001a\u00020eH\u0002J\"\u0010p\u001a\u00020e2\u0006\u0010q\u001a\u00020\u00072\u0006\u0010r\u001a\u00020\u00072\b\u0010s\u001a\u0004\u0018\u00010tH\u0014J\u0010\u0010u\u001a\u00020e2\u0006\u0010v\u001a\u00020wH\u0016J\u0012\u0010x\u001a\u00020e2\b\u0010y\u001a\u0004\u0018\u00010zH\u0014J\u001d\u0010{\u001a\u00020e\"\u0004\b\u0000\u0010|2\b\u0010}\u001a\u0004\u0018\u0001H|H\u0016\u00a2\u0006\u0002\u0010~J\b\u0010\u007f\u001a\u00020eH\u0014J\u001c\u0010\u0080\u0001\u001a\u00020e\"\u0004\b\u0000\u0010|2\u0006\u0010}\u001a\u0002H|H\u0016\u00a2\u0006\u0002\u0010~J\t\u0010\u0081\u0001\u001a\u00020eH\u0014J#\u0010\u0082\u0001\u001a\u00020e2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010>2\u0007\u0010\u0084\u0001\u001a\u00020+2\u0006\u0010s\u001a\u00020gJ%\u0010\u0085\u0001\u001a\u0004\u0018\u00010>2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00072\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010>\u00a2\u0006\u0003\u0010\u0088\u0001J\u0017\u0010\u0089\u0001\u001a\u00020e2\u000e\u0010s\u001a\n\u0018\u00010\u008a\u0001R\u00030\u008b\u0001Jn\u0010\u008c\u0001\u001a\u00020g2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00072\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010>2\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010>2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010>2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010>2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010>2\u0012\u0010\u0092\u0001\u001a\r\u0012\u0006\u0012\u0004\u0018\u00010>\u0018\u00010\u0093\u00012\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010>\u00a2\u0006\u0003\u0010\u0095\u0001J\u0007\u0010\u0096\u0001\u001a\u00020+J\u0007\u0010\u0097\u0001\u001a\u00020eJ\u0007\u0010\u0098\u0001\u001a\u00020eJ\u0007\u0010\u0099\u0001\u001a\u00020eJ\u0007\u0010\u009a\u0001\u001a\u00020eJ\u0007\u0010\u009b\u0001\u001a\u00020eJ\u000f\u0010\u009c\u0001\u001a\u00020e2\u0006\u0010s\u001a\u00020gJ\u0007\u0010\u009d\u0001\u001a\u00020eJ\u001b\u0010\u009e\u0001\u001a\u00020+*\t\u0012\u0004\u0012\u00020>0\u009f\u00012\u0007\u0010\u00a0\u0001\u001a\u00020>R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010!\u001a\u00020\u001d8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b\"\u0010\u001fR\u001b\u0010$\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b%\u0010\u000bR\u001b\u0010\'\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b(\u0010\u000bR\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u000108X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010=\u001a\u0004\u0018\u00010>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001b\u0010C\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bE\u0010\r\u001a\u0004\bD\u0010\u000bR\u001a\u0010F\u001a\u00020GX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u001c\u0010O\u001a\u0004\u0018\u00010PX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0011\u0010U\u001a\u00020V\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u001b\u0010Y\u001a\u00020Z8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b]\u0010\r\u001a\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010NR\u001b\u0010`\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bb\u0010\r\u001a\u0004\ba\u0010\u000b\u00a8\u0006\u00a2\u0001"}, d2 = {"Lcom/zoomapps/eromance/Activities/AuthActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/zoomapps/eromance/Interfaces/ISocialLoginView;", "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;", "Lcom/zoomapps/eromance/Interfaces/RequestMakerListener;", "()V", "RC_SIGN_IN", "", "btn_login", "Landroid/widget/Button;", "getBtn_login", "()Landroid/widget/Button;", "btn_login$delegate", "Lkotlin/properties/ReadOnlyProperty;", "btn_reg", "getBtn_reg", "btn_reg$delegate", "callbackManager", "Lcom/facebook/CallbackManager;", "getCallbackManager", "()Lcom/facebook/CallbackManager;", "setCallbackManager", "(Lcom/facebook/CallbackManager;)V", "cbAcceptRG", "Landroid/widget/CheckBox;", "getCbAcceptRG", "()Landroid/widget/CheckBox;", "cbAcceptRG$delegate", "et_login", "Landroid/widget/EditText;", "getEt_login", "()Landroid/widget/EditText;", "et_login$delegate", "et_password", "getEt_password", "et_password$delegate", "facebook_btn", "getFacebook_btn", "facebook_btn$delegate", "google_btn", "getGoogle_btn", "google_btn$delegate", "isActivityResumed", "", "()Z", "setActivityResumed", "(Z)V", "isLoginstate", "setLoginstate", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mGoogleApiClient", "Lcom/google/android/gms/common/api/GoogleApiClient;", "getMGoogleApiClient", "()Lcom/google/android/gms/common/api/GoogleApiClient;", "setMGoogleApiClient", "(Lcom/google/android/gms/common/api/GoogleApiClient;)V", "myValue", "", "getMyValue", "()Ljava/lang/String;", "setMyValue", "(Ljava/lang/String;)V", "odnok_btn", "getOdnok_btn", "odnok_btn$delegate", "odnoklassniki", "Lru/ok/android/sdk/Odnoklassniki;", "getOdnoklassniki", "()Lru/ok/android/sdk/Odnoklassniki;", "setOdnoklassniki", "(Lru/ok/android/sdk/Odnoklassniki;)V", "okResCode", "getOkResCode", "()I", "pd_loading", "Landroid/app/ProgressDialog;", "getPd_loading", "()Landroid/app/ProgressDialog;", "setPd_loading", "(Landroid/app/ProgressDialog;)V", "presenter", "Lcom/zoomapps/eromance/Helpers/SocialLoginPresenter;", "getPresenter", "()Lcom/zoomapps/eromance/Helpers/SocialLoginPresenter;", "tvRequestActivation", "Landroid/widget/TextView;", "getTvRequestActivation", "()Landroid/widget/TextView;", "tvRequestActivation$delegate", "vkReqCode", "getVkReqCode", "vk_BTN", "getVk_BTN", "vk_BTN$delegate", "checkLoginFields", "checkSocial", "", "social_data", "Lcom/zoomapps/eromance/Models/SocialDataModel;", "getAuthListener", "Lru/ok/android/sdk/OkAuthListener;", "getToastListener", "Lru/ok/android/sdk/OkListener;", "handleSignInResult", "result", "Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;", "init_btns", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onConnectionFailed", "p0", "Lcom/google/android/gms/common/ConnectionResult;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onError", "T", "out", "(Ljava/lang/Object;)V", "onPause", "onRequestSuccess", "onResume", "onSocialChecked", "uid", "isRegistered", "parseGender", "type", "value", "(Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "processLogin", "Lcom/zoomapps/eromance/Models/AccountModel/LoginModel$Datum;", "Lcom/zoomapps/eromance/Models/AccountModel/LoginModel;", "setDataToModel", "id", "username", "email_str", "birthday_str", "phone", "locale", "", "gender", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lcom/zoomapps/eromance/Models/SocialDataModel;", "setupDictionary", "setupFb", "setupGoo", "setupOk", "setupSocial", "setupVk", "startSocial", "vkGetInfo", "containsKey", "", "key", "Companion", "app_debug"})
public final class AuthActivity extends android.support.v7.app.AppCompatActivity implements com.zoomapps.eromance.Interfaces.ISocialLoginView, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.zoomapps.eromance.Interfaces.RequestMakerListener {
    private final int okResCode = 22890;
    private final int vkReqCode = 10485;
    private final int RC_SIGN_IN = 9001;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context mContext;
    @org.jetbrains.annotations.Nullable()
    private com.facebook.CallbackManager callbackManager;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.common.api.GoogleApiClient mGoogleApiClient;
    private boolean isActivityResumed;
    private boolean isLoginstate;
    @org.jetbrains.annotations.NotNull()
    public ru.ok.android.sdk.Odnoklassniki odnoklassniki;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btn_reg$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btn_login$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty et_login$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty et_password$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.app.ProgressDialog pd_loading;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty cbAcceptRG$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tvRequestActivation$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.zoomapps.eromance.Helpers.SocialLoginPresenter presenter = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty vk_BTN$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty facebook_btn$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty google_btn$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty odnok_btn$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String myValue;
    @org.jetbrains.annotations.NotNull()
    public static com.zoomapps.eromance.Activities.AuthActivity instance;
    public static final com.zoomapps.eromance.Activities.AuthActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onError(@org.jetbrains.annotations.Nullable()
    T out) {
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onRequestSuccess(T out) {
    }
    
    @java.lang.Override()
    public void onConnectionFailed(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.common.ConnectionResult p0) {
    }
    
    public final int getOkResCode() {
        return 0;
    }
    
    public final int getVkReqCode() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void handleSignInResult(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.auth.api.signin.GoogleSignInResult result) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Models.SocialDataModel setDataToModel(@org.jetbrains.annotations.Nullable()
    java.lang.Integer type, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String email_str, @org.jetbrains.annotations.Nullable()
    java.lang.String birthday_str, @org.jetbrains.annotations.Nullable()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    java.lang.String[] locale, @org.jetbrains.annotations.Nullable()
    java.lang.String gender) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String parseGender(@org.jetbrains.annotations.Nullable()
    java.lang.Integer type, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.facebook.CallbackManager getCallbackManager() {
        return null;
    }
    
    public final void setCallbackManager(@org.jetbrains.annotations.Nullable()
    com.facebook.CallbackManager p0) {
    }
    
    public final void startSocial(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.SocialDataModel data) {
    }
    
    public final void checkSocial(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.SocialDataModel social_data) {
    }
    
    public final void onSocialChecked(@org.jetbrains.annotations.Nullable()
    java.lang.String uid, boolean isRegistered, @org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.SocialDataModel data) {
    }
    
    public final void setupFb() {
    }
    
    public final boolean containsKey(@org.jetbrains.annotations.NotNull()
    java.util.Iterator<java.lang.String> $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.common.api.GoogleApiClient getMGoogleApiClient() {
        return null;
    }
    
    public final void setMGoogleApiClient(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.common.api.GoogleApiClient p0) {
    }
    
    public final void setupGoo() {
    }
    
    public final boolean isActivityResumed() {
        return false;
    }
    
    public final void setActivityResumed(boolean p0) {
    }
    
    public final boolean isLoginstate() {
        return false;
    }
    
    public final void setLoginstate(boolean p0) {
    }
    
    public final void setupVk() {
    }
    
    public final void vkGetInfo() {
    }
    
    public final void setupSocial() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.ok.android.sdk.Odnoklassniki getOdnoklassniki() {
        return null;
    }
    
    public final void setOdnoklassniki(@org.jetbrains.annotations.NotNull()
    ru.ok.android.sdk.Odnoklassniki p0) {
    }
    
    public final void setupOk() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtn_reg() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtn_login() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEt_login() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEt_password() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.ProgressDialog getPd_loading() {
        return null;
    }
    
    public final void setPd_loading(@org.jetbrains.annotations.Nullable()
    android.app.ProgressDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.CheckBox getCbAcceptRG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvRequestActivation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zoomapps.eromance.Helpers.SocialLoginPresenter getPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getVk_BTN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getFacebook_btn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getGoogle_btn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getOdnok_btn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMyValue() {
        return null;
    }
    
    public final void setMyValue(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final boolean setupDictionary() {
        return false;
    }
    
    private final void init_btns() {
    }
    
    public final void processLogin(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.AccountModel.LoginModel.Datum data) {
    }
    
    public final boolean checkLoginFields() {
        return false;
    }
    
    private final ru.ok.android.sdk.OkAuthListener getAuthListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.ok.android.sdk.OkListener getToastListener() {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public AuthActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/zoomapps/eromance/Activities/AuthActivity$Companion;", "", "()V", "instance", "Lcom/zoomapps/eromance/Activities/AuthActivity;", "getInstance", "()Lcom/zoomapps/eromance/Activities/AuthActivity;", "setInstance", "(Lcom/zoomapps/eromance/Activities/AuthActivity;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.zoomapps.eromance.Activities.AuthActivity getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        com.zoomapps.eromance.Activities.AuthActivity p0) {
        }
        
        private Companion() {
            super();
        }
    }
}