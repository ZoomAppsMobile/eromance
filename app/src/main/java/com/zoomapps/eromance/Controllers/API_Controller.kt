package com.zoomapps.eromance.Controllers

import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.ReportModel
import com.zoomapps.eromance.Models.ReviewModel
import retrofit2.Call

/**
 * Created by User on 05.09.2017.
 */
class API_Controller {
    val PHOTO : String = "photo";
    val USER : String = "user";
    val PLACE : String = "place";

    fun report(type:String , entity_id:String,comment:String?=null): Call<ReportModel.ReportCheckResponseData>? {
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        when(type){
            PHOTO->{
                return apiService.postReport(Server_Entities.Photo,entity_id,comment, GlobalStaticVariables.myId.toString());
            }
            USER->{
                return apiService.postReport(Server_Entities.Profile,entity_id,comment, GlobalStaticVariables.myId.toString());
            }
            PLACE->{
                return apiService.postReport(Server_Entities.Place,entity_id,comment, GlobalStaticVariables.myId.toString());
            }
        }
        return null;
    }


}