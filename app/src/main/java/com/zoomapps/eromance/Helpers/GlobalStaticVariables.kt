package com.zoomapps.eromance.Helpers

import android.app.Application
import android.content.Context
import android.preference.PreferenceManager
import com.zoomapps.eromance.Activities.SplashActivity
import com.zoomapps.eromance.Models.*
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.Models.Types.PlaceTypesDatum
import com.zoomapps.eromance.Models.Types.UserServiceTypesDatum
import com.zoomapps.eromance.MyApplication

/**
 * Created by User on 27.04.2017.
 */

object GlobalStaticVariables {
    var myData: LoginModel.Datum? = null
    var allTranslations: TranslationModel.Data? = null
    @JvmField
    var myId: Int? = null
    var sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MyApplication.applicationContext())
    var meetTypes_LIST: List<MeetTypesDatum>? = null
    var eveningTypes_LIST: List<EveningTypesDatum>? = null
    var placeTypes_LIST: List<PlaceTypesDatum>? = null
    var userServicesTypes_LIST: List<UserServiceTypesDatum>? = null
    var quessionaryValues_List: List<QuessionariesValuesDatum>? = null
    var mAppInstance: MyApplication? = null
    var maxUserWeight: Int = 300;
    var maxUserHeight: Int = 300;
    var testVirablies: String? = sharedPreferences.getString("language", "ru") + "/"
    var isMessageIsSubscribed: Boolean = false
    var current_intercular_id: Int? = -1;
    var isUser_Twenty_One_Provider: Boolean? = false
    //    var language_type: String = sharedPreferences.getString("language", "ru") + "/"
     var language_type: String? = null
    var providing_service_id: Int? = -1
    val questions_with_keys_group_id_list = hashMapOf<Int, String>(
            1 to "languages",
            2 to "family",
            3 to "childs",
            4 to "сharacter",
            5 to "complection",
            6 to "smoking",
            7 to "drinking",
            8 to "activity",
            9 to "car",
            10 to "hair_color",
            11 to "weight",
            12 to "height",
            13 to "person",
            14 to "interests")

    @JvmField
    var isSocketServiceActive: Boolean = false
}

object OpenTypesBy {
    val all_data = "all_data"
    val user_data = "user_data"
    val profile_data = "profile_data"
    val user_id = "user_id"
    val profile_id = "profile_id"
}
