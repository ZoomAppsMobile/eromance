package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 24.08.2017.
 */
class SocialAuthModel{
    inner class Data {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("uid")
        @Expose
        var uid: String? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("type_id")
        @Expose
        var typeId: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class SocialResponseData {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null

    }

    inner class CheckSocialResponseData {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<Data>? = null

    }
}