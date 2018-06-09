package com.zoomapps.eromance.Models

import com.zoomapps.eromance.Models.UserProfileEditModel.Errors
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.zoomapps.eromance.Models.GameModel.GamesListModel.Bets







/**
 * Created by User on 02.05.2017.
 */
class GameModel{

    class GameActivateModel{
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

        }

        inner class GamePlayRequest {

            @SerializedName("code")
            @Expose
            var code: Int? = null
            @SerializedName("data")
            @Expose
            var data: Data? = null

        }
    }
    class GamesListModel{
        inner class Bets {

            @SerializedName("data")
            @Expose
            var data: List<Datum_>? = null

        }

        inner class Datum {

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

        }

        inner class GameListResponse {

            @SerializedName("code")
            @Expose
            var code: Int? = null
            @SerializedName("data")
            @Expose
            var data: List<Datum>? = null

        }
    }
    class GamesModel{
        inner class Data {

            @SerializedName("id")
            @Expose
            var id: Int? = null
            @SerializedName("status_id")
            @Expose
            var statusId: Int? = null
            @SerializedName("created_at")
            @Expose
            var createdAt: String? = null
            @SerializedName("updated_at")
            @Expose
            var updatedAt: String? = null
            @SerializedName("errors")
            @Expose
            var errors: Errors ? = null

        }

        inner class GamesCreateResponse {

            @SerializedName("code")
            @Expose
            var code: Int? = null
            @SerializedName("data")
            @Expose
            var data: Data? = null

        }

        inner class Errors {

            @SerializedName("status_id")
            @Expose
            var statusId: List<String>? = null

        }
    }
    class GameBetModel {

        inner class Data {

            @SerializedName("errors")
            @Expose
            var errors: Errors? = null
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
            var statusId: Any? = null
            @SerializedName("created_at")
            @Expose
            var createdAt: String? = null
            @SerializedName("updated_at")
            @Expose
            var updatedAt: String? = null

        }
        inner class Errors {

            @SerializedName("bet")
            @Expose
            var bet: List<String>? = null
            @SerializedName("thing_id")
            @Expose
            var thingId: List<String>? = null
            @SerializedName("user_id")
            @Expose
            var userId: List<String>? = null

        }

        inner class GameAnswerRequest {
            @SerializedName("code")
            @Expose
            var code: Int? = null
            @SerializedName("data")
            @Expose
            var data: Data? = null
        }

    }

}