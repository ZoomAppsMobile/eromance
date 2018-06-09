package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 18.05.2017.
 */
class DeviceTokenModel{
    inner class Data {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("type_id")
        @Expose
        var typeId: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("token")
        @Expose
        var token: String? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class UserDeviceResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null

    }
}