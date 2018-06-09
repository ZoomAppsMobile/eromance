package com.zoomapps.eromance.Controllers

import android.util.SparseArray
import java.util.*


object GlobalVariables{
    val user_login="USER_LOGIN"
    val user_password = "USER_PASSWORD"
    val empty_string = ""
    val push_token = "PUSH_TOKEN"
    var default_language="ru"
    //val server_url = "http://eromance.life"
    val server_url = "http://185.146.1.72:8080/"
    val isUserReadAgreement_key = "is_agreement_read"
    val settings_notification_key = "IsNotifActive"
    val settings_lang_key = "Language_TYPE"
    val user_type_key = "user_type"
    val is_becomeprovider_request_send_key = "is_becomeprovider_request_send"

    val vkontakte = 1
    val facebook = 2
    val google_plus = 3
    val mail_ru = 4
    val odnoklassniki = 5
    //TYPE_CONTAINERS
    //TODO:FILL
}
object Constants{
    val MeetPayments = ArrayList<String>().apply {
        "50/50"
        "За мой счет"
        "За вас счет"
        "Буду с пользователем"
    }
}

object Server_Entities{
    val Rating = "App\\Member\\Rating"
    val Message = "App\\Conversation\\Message\\Message"
    val Evening = "App\\Evening\\Evening"
    val Meet = "App\\Meet\\Meet"
    val Review ="App\\Review"
    val Game = "App\\Game\\Game"
    val AdultRequest = "App\\Member\\AdultRequest"
    val Gift = "App\\Member\\Gift"
    val Guest = "App\\Member\\Guest"
    val Interaction = "App\\Member\\Interaction"
    val Photo = "App\\Member\\Photo"
    val Profile = "App\\Member\\Profile\\Profile"
    val Place = "App\\Place\\Place"
}

object Acception_TYPES{
    val UN_REVIEWED = 1;
    val ACCEPTED = 2
    val DECLINED = 3
}


object Custom_Translation_Types{
    val country = 1
    val city = 2
    val sex = 3
}