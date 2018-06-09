package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 30.06.2017.
 */
class TwentyOneRequestModel{
    inner class Data {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: String? = null
        @SerializedName("services_id")
        @Expose
        var servicesId: List<String>? = null
        @SerializedName("description")
        @Expose
        var description: Any? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class RequestToTwentyProvidersResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null

    }
}
