package com.zoomapps.eromance.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by User on 14.07.2017.
 */
class GameHistoryModel{
    inner class Bets {

        @SerializedName("data")
        @Expose
        var data: List<Datum_>? = null

    }

    inner class Data {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("is_played")
        @Expose
        var isPlayed: Boolean? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("bets")
        @Expose
        var bets: Bets? = null

    }

    inner class Data_ {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("username")
        @Expose
        var username: String? = null
        @SerializedName("email")
        @Expose
        var email: String? = null
        @SerializedName("phone")
        @Expose
        var phone: Any? = null
        @SerializedName("avatar")
        @Expose
        var avatar: String? = null
        @SerializedName("is_active")
        @Expose
        var isActive: Boolean? = null
        @SerializedName("is_blocked")
        @Expose
        var isBlocked: Boolean? = null
        @SerializedName("amount")
        @Expose
        var amount: Int? = null
        @SerializedName("type_id")
        @Expose
        var typeId: Int? = null
        @SerializedName("is_vip")
        @Expose
        var isVip: Boolean? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null

    }

    inner class Datum {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("bet")
        @Expose
        var bet: Int? = null
        @SerializedName("game_id")
        @Expose
        var gameId: Int? = null
        @SerializedName("thing_id")
        @Expose
        var thingId: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("status_id")
        @Expose
        var statusId: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("game")
        @Expose
        var game: Game? = null

    }

    inner class Datum_ {

        @SerializedName("id")
        @Expose
        var id: Int? = null
        @SerializedName("bet")
        @Expose
        var bet: Int? = null
        @SerializedName("game_id")
        @Expose
        var gameId: Int? = null
        @SerializedName("thing_id")
        @Expose
        var thingId: Int? = null
        @SerializedName("user_id")
        @Expose
        var userId: Int? = null
        @SerializedName("status_id")
        @Expose
        var statusId: Int? = null
        @SerializedName("created_at")
        @Expose
        var createdAt: String? = null
        @SerializedName("updated_at")
        @Expose
        var updatedAt: String? = null
        @SerializedName("user")
        @Expose
        var user: User? = null

    }

    inner class Game {

        @SerializedName("data")
        @Expose
        var data: Data? = null

    }

    inner class ResponseData {

        @SerializedName("code")
        @Expose
        var code: Int? = null
        @SerializedName("data")
        @Expose
        var data: List<Datum>? = null

    }

    inner class User {

        @SerializedName("data")
        @Expose
        var data: Data_? = null

    }
}