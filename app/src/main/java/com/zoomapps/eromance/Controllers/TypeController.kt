package com.zoomapps.eromance.Controllers

import android.content.Context
import android.content.Intent
import android.util.Log
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Helpers.DB_Helper
import com.zoomapps.eromance.Helpers.DB_Helper.getSavedData
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.QuessionariesValues
import com.zoomapps.eromance.Models.Types.PlaceTypes
import com.zoomapps.eromance.Models.Types.PlaceTypesDatum
import com.zoomapps.eromance.Models.Types.UserServiceTypes
import com.zoomapps.eromance.Models.UserRateModel
import io.realm.Realm
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by User on 15.06.2017.
 */

class TypeController(val ctx: Context ) {
    init {
        Realm.init(ctx)
    }

    fun<T> getTypes(className:Class<T>):List<*>?
    {
        when(className){
            PlaceTypes::class.java->{
                if(GlobalStaticVariables.placeTypes_LIST!=null){
                    return GlobalStaticVariables.placeTypes_LIST!!
                }
                else{
                    return getSavedData(className)?.data
                }
            }
            UserServiceTypes::class.java->{
                if(GlobalStaticVariables.userServicesTypes_LIST!=null){
                    return GlobalStaticVariables.userServicesTypes_LIST!!
                }
                else{
                    return getSavedData(className)?.data
                }
            }
            QuessionariesValues::class.java->{
                if(GlobalStaticVariables.quessionaryValues_List!=null){
                    return GlobalStaticVariables.quessionaryValues_List!!
                }
                else{
                    return getSavedData(className)?.data
                }
            }
        }
        return null
    }

    fun setTypes():Boolean{
        var status = false;
        Log.e("LOGIC TEST" , "START CHECK")
        if(getSavedData(PlaceTypes::class.java)==null){
            loadPlacesTypes()
        }
        else{
            status = true
        }
        if(getSavedData(UserServiceTypes::class.java) == null){
            loadServiceTypes()
        }
        else{
            status = true
        }
        //
        if(getSavedData(QuessionariesValues::class.java) == null){
            loadQuessionariesValues()
        }
        else{
            status = true
        }
        return status
    }
    fun loadQuessionariesValues(){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getQuessionaryVariants()
        makeRequest(call)
    }

    fun loadServiceTypes(){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getTwentyOneServiceTypes()
        makeRequest(call)
    }

    fun loadPlacesTypes(){
        Log.e("LOGIC TEST" , "Start loading PLaceTYPES")
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getPlaceTypes()
        makeRequest(call)
    }

    fun<T> makeRequest(call:Call<T>) {
        Log.e("LOGIC TEST" , "Start REQUEST ")
        call.enqueue(object : Callback<T> {
            override fun onResponse(call: Call<T>,
                                    response: Response<T>) {
                val test = response.body()
                if(test != null ) {
                    val mainPageDataList = response.body()
                    if(mainPageDataList!=null) {
                        Log.e("LOGIC TEST" , " REQUEST is SUCCESSFULL ")
                        requestResultProcess<T>(response.body())
                    }
                }
                else {

                }
            }
            override fun onFailure(call: Call<T>, t: Throwable) {
                // Log error here since request failed{

            }
        })
    }

    fun<T> requestResultProcess(data:T ){
        when(data){
            is PlaceTypes ->{
                var test = data as PlaceTypes;
                Log.e("LOGIC TEST" , " START SAVE PLACETYPES ")
                DB_Helper.saveTypes(PlaceTypes::class.java, data )
            }
            is UserServiceTypes->{
                Log.e("LOGIC TEST" , " START SAVE UserServiceTypes ")
                DB_Helper.saveTypes(UserServiceTypes::class.java, data)
            }
            is QuessionariesValues ->{
                Log.e("LOGIC TEST" , " START SAVE QuessionariesValues ")
                DB_Helper.saveTypes(QuessionariesValues::class.java, data)
            }
        //    is UserServiceTypes ->setUserServiceData(data)
            else-> Log.e("[TYPE Controller]","T is not data instanse")
        }

    }

}
