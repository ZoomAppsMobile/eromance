package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 15.06.2017.
 */
class TwentyOneModel{


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
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class UserBecomeProviderResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null
    }

    inner class UserProvidingServiceResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<Data>? = null

    }


}