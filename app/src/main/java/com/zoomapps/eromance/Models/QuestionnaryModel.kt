package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject


/**
 * Created by User on 17.05.2017.
 */
open class  QuessionariesValuesDatum :RealmObject() {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("key")
    @Expose
    var key: String? = null
    @SerializedName("value")
    @Expose
    var value: String? = null
    @SerializedName("group_id")
    @Expose
    var groupId: Int? = null
    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null
    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

}

open class QuessionariesValues:RealmObject() {

    @SerializedName("code")
    @Expose
    var code: Int? = null
    @SerializedName("data")
    @Expose
    var data: RealmList<QuessionariesValuesDatum>? = null

}
class UserQuessionary{

     class UserAdditionalRequestDatum {
         @SerializedName("group_id")
         @Expose
         var groupId: Int? = null
         @SerializedName("questionnaire_id")
         @Expose
         var questionnaireId: Int? = null
         @SerializedName("value")
         @Expose
         var str_value: String? = ""

    }

    class UserAdditionalRequest {
        @SerializedName("data")
        @Expose
        var data: List<UserAdditionalRequestDatum>? = null

    }
     class UserAdditionalResponse {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<Datum>? = null

    }

     class Datum {

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
        @SerializedName("value")
        @Expose
        var value: String? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

}