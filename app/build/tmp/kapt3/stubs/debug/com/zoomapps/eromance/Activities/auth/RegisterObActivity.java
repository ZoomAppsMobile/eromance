package com.zoomapps.eromance.Activities.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001J\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001J\b\u0010\u0089\u0001\u001a\u00030\u0087\u0001J\b\u0010\u008a\u0001\u001a\u00030\u0087\u0001J\u001b\u0010\u008b\u0001\u001a\u00030\u0087\u00012\u000b\b\u0002\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0003\u0010\u008d\u0001J\b\u0010\u008e\u0001\u001a\u00030\u0087\u0001J\b\u0010\u008f\u0001\u001a\u00030\u0087\u0001J\u0010\u0010\u0090\u0001\u001a\u0002072\u0007\u0010\u0091\u0001\u001a\u000207J\b\u0010\u0092\u0001\u001a\u00030\u0087\u0001J\u0016\u0010\u0093\u0001\u001a\u00030\u0087\u00012\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0014J\b\u0010\u0096\u0001\u001a\u00030\u0087\u0001J$\u0010\u0097\u0001\u001a\u00020)2\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\u000b\b\u0002\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0003\u0010\u009a\u0001J\u001b\u0010\u009b\u0001\u001a\u00030\u0087\u00012\u000b\b\u0002\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0003\u0010\u008d\u0001J\u0011\u0010\u009c\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u0005J\u0007\u0010v\u001a\u00030\u0087\u0001J\u001b\u0010\u009e\u0001\u001a\u00030\u0087\u00012\u000b\b\u0002\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0003\u0010\u008d\u0001J\u0016\u0010\u009f\u0001\u001a\u0002072\r\u0010\u00a0\u0001\u001a\b0\u00a1\u0001R\u00030\u00a2\u0001J\b\u0010\u00a3\u0001\u001a\u00030\u0087\u0001J\u0011\u0010\u00a4\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u00a5\u0001\u001a\u000207J\b\u0010\u00a6\u0001\u001a\u00030\u0087\u0001R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001b\u0010\"\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\'\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001b\u0010.\u001a\u00020/8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u0010\'\u001a\u0004\b0\u00101R\u001b\u00103\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b5\u0010\'\u001a\u0004\b4\u0010%R\"\u00106\u001a\n 8*\u0004\u0018\u00010707X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001b\u0010=\u001a\u00020>8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010\'\u001a\u0004\b?\u0010@R\u001b\u0010B\u001a\u00020>8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bD\u0010\'\u001a\u0004\bC\u0010@R\u001b\u0010E\u001a\u00020>8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bG\u0010\'\u001a\u0004\bF\u0010@R\u001b\u0010H\u001a\u00020>8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bJ\u0010\'\u001a\u0004\bI\u0010@R\u001b\u0010K\u001a\u00020>8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bM\u0010\'\u001a\u0004\bL\u0010@R\u001b\u0010N\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bP\u0010\'\u001a\u0004\bO\u0010%R\u001a\u0010Q\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010+\"\u0004\bR\u0010-R\u001a\u0010S\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010+\"\u0004\bT\u0010-R\u001a\u0010U\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR \u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00050[X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010`\u001a\u0004\u0018\u00010aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001c\u0010f\u001a\u0004\u0018\u00010gX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010l\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010W\"\u0004\bn\u0010YR\"\u0010o\u001a\n 8*\u0004\u0018\u00010707X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010:\"\u0004\bq\u0010<R\u001c\u0010r\u001a\u0004\u0018\u00010sX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001a\u0010x\u001a\u00020yX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001e\u0010~\u001a\u00020\u007f8FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u0082\u0001\u0010\'\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u0010\u0083\u0001\u001a\u0004\u0018\u000107X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010:\"\u0005\b\u0085\u0001\u0010<\u00a8\u0006\u00a7\u0001"}, d2 = {"Lcom/zoomapps/eromance/Activities/auth/RegisterObActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "arrayAdapterAppearanceSpinner", "Landroid/widget/ArrayAdapter;", "", "getArrayAdapterAppearanceSpinner", "()Landroid/widget/ArrayAdapter;", "setArrayAdapterAppearanceSpinner", "(Landroid/widget/ArrayAdapter;)V", "arrayAdapterCarSpinner", "getArrayAdapterCarSpinner", "setArrayAdapterCarSpinner", "arrayAdapterCitySpinner", "getArrayAdapterCitySpinner", "setArrayAdapterCitySpinner", "arrayAdapterCountySpinner", "getArrayAdapterCountySpinner", "setArrayAdapterCountySpinner", "arrayAdapterDateOfBirthSpinner", "getArrayAdapterDateOfBirthSpinner", "setArrayAdapterDateOfBirthSpinner", "arrayAdapterLookForSpinner", "getArrayAdapterLookForSpinner", "setArrayAdapterLookForSpinner", "arrayAdapterNickSpinner", "getArrayAdapterNickSpinner", "setArrayAdapterNickSpinner", "arrayAdapterSexSpinner", "getArrayAdapterSexSpinner", "setArrayAdapterSexSpinner", "arrayAdapterTargetSpinner", "getArrayAdapterTargetSpinner", "setArrayAdapterTargetSpinner", "basic_fields_LL", "Landroid/widget/LinearLayout;", "getBasic_fields_LL", "()Landroid/widget/LinearLayout;", "basic_fields_LL$delegate", "Lkotlin/properties/ReadOnlyProperty;", "block_ask_key_btn", "", "getBlock_ask_key_btn", "()Z", "setBlock_ask_key_btn", "(Z)V", "btn_confirm_key", "Landroid/widget/Button;", "getBtn_confirm_key", "()Landroid/widget/Button;", "btn_confirm_key$delegate", "btn_next_LL", "getBtn_next_LL", "btn_next_LL$delegate", "default_ask_key_text", "", "kotlin.jvm.PlatformType", "getDefault_ask_key_text", "()Ljava/lang/String;", "setDefault_ask_key_text", "(Ljava/lang/String;)V", "etEmail", "Landroid/widget/EditText;", "getEtEmail", "()Landroid/widget/EditText;", "etEmail$delegate", "etKey", "getEtKey", "etKey$delegate", "etPass", "getEtPass", "etPass$delegate", "etPhone", "getEtPhone", "etPhone$delegate", "etUsername", "getEtUsername", "etUsername$delegate", "fields_forKey_LL", "getFields_forKey_LL", "fields_forKey_LL$delegate", "isSocial", "setSocial", "is_timer_active", "set_timer_active", "key_request_timeout", "getKey_request_timeout", "()I", "setKey_request_timeout", "(I)V", "list", "", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "maskText", "Lcom/github/pinball83/maskededittext/MaskedEditText;", "getMaskText", "()Lcom/github/pinball83/maskededittext/MaskedEditText;", "setMaskText", "(Lcom/github/pinball83/maskededittext/MaskedEditText;)V", "pd_loading", "Landroid/app/ProgressDialog;", "getPd_loading", "()Landroid/app/ProgressDialog;", "setPd_loading", "(Landroid/app/ProgressDialog;)V", "reg_state", "getReg_state", "setReg_state", "salt_for_ask_key_timer", "getSalt_for_ask_key_timer", "setSalt_for_ask_key_timer", "socialData", "Lcom/zoomapps/eromance/Models/SocialDataModel;", "getSocialData", "()Lcom/zoomapps/eromance/Models/SocialDataModel;", "setSocialData", "(Lcom/zoomapps/eromance/Models/SocialDataModel;)V", "timer", "Ljava/util/Timer;", "getTimer", "()Ljava/util/Timer;", "setTimer", "(Ljava/util/Timer;)V", "tvRequestActivation", "Landroid/widget/TextView;", "getTvRequestActivation", "()Landroid/widget/TextView;", "tvRequestActivation$delegate", "user_email", "getUser_email", "setUser_email", "askAuth_Key", "", "clearViews", "endRegistration", "initDialog", "initState", "type", "(Ljava/lang/Integer;)V", "init_activiationKeyText", "init_timer", "md5", "password", "nextStep", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "sendAuthKey", "sendData", "data", "Lcom/zoomapps/eromance/Models/AccountModel/RegisterModel$RegisterRequestData;", "(Lcom/zoomapps/eromance/Models/AccountModel/RegisterModel$RegisterRequestData;Ljava/lang/Integer;)Z", "sendRegData", "sendSocialData", "user_id", "showBasicReg", "showError", "errorObj", "Lcom/zoomapps/eromance/Models/AccountModel/RegisterModel$RegisterErrors;", "Lcom/zoomapps/eromance/Models/AccountModel/RegisterModel;", "showFieldForKey", "showLoadingDialog", "request_Type", "showMoreReg", "app_debug"})
public final class RegisterObActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private android.app.ProgressDialog pd_loading;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> list;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.Integer> arrayAdapterCountySpinner;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.Integer> arrayAdapterCitySpinner;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.Integer> arrayAdapterDateOfBirthSpinner;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.Integer> arrayAdapterNickSpinner;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.Integer> arrayAdapterSexSpinner;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.Integer> arrayAdapterTargetSpinner;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.Integer> arrayAdapterLookForSpinner;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.Integer> arrayAdapterAppearanceSpinner;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.Integer> arrayAdapterCarSpinner;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty basic_fields_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty fields_forKey_LL$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btn_next_LL$delegate = null;
    private int reg_state;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty etUsername$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty etEmail$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty etPhone$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty etPass$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty etKey$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty btn_confirm_key$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadOnlyProperty tvRequestActivation$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.zoomapps.eromance.Models.SocialDataModel socialData;
    private boolean isSocial;
    @org.jetbrains.annotations.Nullable()
    private com.github.pinball83.maskededittext.MaskedEditText maskText;
    private java.lang.String default_ask_key_text;
    private java.lang.String salt_for_ask_key_timer;
    private int key_request_timeout;
    private boolean is_timer_active;
    @org.jetbrains.annotations.NotNull()
    private java.util.Timer timer;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user_email;
    private boolean block_ask_key_btn;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.ProgressDialog getPd_loading() {
        return null;
    }
    
    public final void setPd_loading(@org.jetbrains.annotations.Nullable()
    android.app.ProgressDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.Integer> getArrayAdapterCountySpinner() {
        return null;
    }
    
    public final void setArrayAdapterCountySpinner(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.Integer> getArrayAdapterCitySpinner() {
        return null;
    }
    
    public final void setArrayAdapterCitySpinner(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.Integer> getArrayAdapterDateOfBirthSpinner() {
        return null;
    }
    
    public final void setArrayAdapterDateOfBirthSpinner(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.Integer> getArrayAdapterNickSpinner() {
        return null;
    }
    
    public final void setArrayAdapterNickSpinner(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.Integer> getArrayAdapterSexSpinner() {
        return null;
    }
    
    public final void setArrayAdapterSexSpinner(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.Integer> getArrayAdapterTargetSpinner() {
        return null;
    }
    
    public final void setArrayAdapterTargetSpinner(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.Integer> getArrayAdapterLookForSpinner() {
        return null;
    }
    
    public final void setArrayAdapterLookForSpinner(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.Integer> getArrayAdapterAppearanceSpinner() {
        return null;
    }
    
    public final void setArrayAdapterAppearanceSpinner(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.Integer> getArrayAdapterCarSpinner() {
        return null;
    }
    
    public final void setArrayAdapterCarSpinner(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getBasic_fields_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getFields_forKey_LL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getBtn_next_LL() {
        return null;
    }
    
    public final int getReg_state() {
        return 0;
    }
    
    public final void setReg_state(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtPass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtn_confirm_key() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvRequestActivation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.zoomapps.eromance.Models.SocialDataModel getSocialData() {
        return null;
    }
    
    public final void setSocialData(@org.jetbrains.annotations.Nullable()
    com.zoomapps.eromance.Models.SocialDataModel p0) {
    }
    
    public final boolean isSocial() {
        return false;
    }
    
    public final void setSocial(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.github.pinball83.maskededittext.MaskedEditText getMaskText() {
        return null;
    }
    
    public final void setMaskText(@org.jetbrains.annotations.Nullable()
    com.github.pinball83.maskededittext.MaskedEditText p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setSocialData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String md5(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    public final void initDialog() {
    }
    
    public final void initState(@org.jetbrains.annotations.Nullable()
    java.lang.Integer type) {
    }
    
    public final void showLoadingDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String request_Type) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String showError(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.AccountModel.RegisterModel.RegisterErrors errorObj) {
        return null;
    }
    
    public final java.lang.String getDefault_ask_key_text() {
        return null;
    }
    
    public final void setDefault_ask_key_text(java.lang.String p0) {
    }
    
    public final java.lang.String getSalt_for_ask_key_timer() {
        return null;
    }
    
    public final void setSalt_for_ask_key_timer(java.lang.String p0) {
    }
    
    public final int getKey_request_timeout() {
        return 0;
    }
    
    public final void setKey_request_timeout(int p0) {
    }
    
    public final boolean is_timer_active() {
        return false;
    }
    
    public final void set_timer_active(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Timer getTimer() {
        return null;
    }
    
    public final void setTimer(@org.jetbrains.annotations.NotNull()
    java.util.Timer p0) {
    }
    
    public final void init_timer() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_email() {
        return null;
    }
    
    public final void setUser_email(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void askAuth_Key() {
    }
    
    public final boolean getBlock_ask_key_btn() {
        return false;
    }
    
    public final void setBlock_ask_key_btn(boolean p0) {
    }
    
    public final void init_activiationKeyText() {
    }
    
    public final void nextStep() {
    }
    
    public final void sendSocialData(int user_id) {
    }
    
    public final boolean sendData(@org.jetbrains.annotations.NotNull()
    com.zoomapps.eromance.Models.AccountModel.RegisterModel.RegisterRequestData data, @org.jetbrains.annotations.Nullable()
    java.lang.Integer type) {
        return false;
    }
    
    public final void clearViews() {
    }
    
    public final void sendRegData(@org.jetbrains.annotations.Nullable()
    java.lang.Integer type) {
    }
    
    public final void sendAuthKey() {
    }
    
    public final void showBasicReg(@org.jetbrains.annotations.Nullable()
    java.lang.Integer type) {
    }
    
    public final void showFieldForKey() {
    }
    
    public final void showMoreReg() {
    }
    
    public final void endRegistration() {
    }
    
    public RegisterObActivity() {
        super();
    }
}