package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey


/**
 * Created by User on 11.05.2017.
 */
class DictionaryModel{

    inner class _Datum {
        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("key")
        @Expose
        var key: String? = null
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

    inner class MeetsPaymentResponse
    {
        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<_Datum>? = null
    }

}

open class EveningTypesResponse :RealmObject()  {
    @SerializedName("code")
    @Expose
    var code: Int? = null
    @SerializedName("data")
    @Expose
    var data: RealmList<EveningTypesDatum>? = null
}
open class MeetTypesResponse :RealmObject()  {
    @SerializedName("code")
    @Expose
    var code: Int? = null
    @SerializedName("data")
    @Expose
    var data: RealmList<MeetTypesDatum>? = null
}

open class MeetTypesDatum : RealmObject() {
   /* @SerializedName("type_id")
    @Expose
    @PrimaryKey
    var type_id : Int?=null*/
   @PrimaryKey
    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("key")
    @Expose
    var key: String? = null
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
open class EveningTypesDatum : RealmObject() {
    /* @SerializedName("type_id")
     @Expose
     @PrimaryKey
     var type_id : Int?=null*/
    @PrimaryKey
    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("key")
    @Expose
    var key: String? = null
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
 class SimpleTypeDatum  {
    /* @SerializedName("type_id")
     @Expose
     @PrimaryKey
     var type_id : Int?=null*/
    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("key")
    @Expose
    var key: String? = null
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