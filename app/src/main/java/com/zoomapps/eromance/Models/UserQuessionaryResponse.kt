package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 31.07.2017.
 */
class UserQuessionaryResponse {
    class ResponseData {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<Datum>? = null

    }

    inner class Datum {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("group_id")
        @Expose
        var groupId: Int? = null
        @SerializedName("questionnaire_id")
        @Expose
        var questionnaireId: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }
}