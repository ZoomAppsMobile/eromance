package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 23.05.2017.
 */
class UserPhotosModel{
    inner class Data {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("image")
        @Expose
        var image: String? = null
        @SerializedName("position")
        @Expose
        var position: Any? = null
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


    inner class UserPhotosResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: Data? = null
        @SerializedName("errors")
        @Expose
        var errors: Errors? = null

    }
    inner class UserGetPhotosResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<Data>? = null
        @SerializedName("errors")
        @Expose
        var errors: Errors? = null

    }

    inner class Errors {

        @SerializedName("user_id")
        @Expose
        var userId: List<String>? = null
        @SerializedName("image")
        @Expose
        var image: List<String>? = null

    }
}