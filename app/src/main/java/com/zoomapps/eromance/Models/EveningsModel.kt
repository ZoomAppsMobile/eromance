package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 18.05.2017.
 */
class EveningsModel{
    inner class Data {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("types_id")
        @Expose
        var typesId: List<String>? = null
        @SerializedName("payment_id")
        @Expose
        var paymentId: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("joined_user_id")
        @Expose
        var joinedUserId: Any? = null
        @SerializedName("started_at")
        @Expose
        var startedAt: String? = null
        @SerializedName("finished_at")
        @Expose
        var finishedAt: String? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class EveningCreateResponse{

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null

    }
    inner class EveningListResponse{

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<MeetsModel.Datum>? = null

    }
    inner class EveningResponse{

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: MeetsModel.Datum? = null

    }
}