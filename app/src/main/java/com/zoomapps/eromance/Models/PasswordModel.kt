package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zoomapps.eromance.Models.AccountModel.LoginModel


/**
 * Created by User on 19.06.2017.
 */
class PasswordModel{

    inner class RestorePasswordData {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("password")
        @Expose
        var password: String? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("is_used")
        @Expose
        var isUsed: Any? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class RestorePasswordResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data:  RestorePasswordData? = null

    }

    inner class ChangePasswordResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: LoginModel.Datum? = null

    }
}