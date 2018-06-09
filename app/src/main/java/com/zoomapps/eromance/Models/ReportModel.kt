package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 05.09.2017.
 */
class ReportModel {
    inner class Data {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("entity_class")
        @Expose
        var entityClass: String? = null
        @SerializedName("entity_id")
        @Expose
        var entityId: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("comment")
        @Expose
        var comment: Any? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class ReportCheckResponseData {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null

    }
}