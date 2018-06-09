package com.zoomapps.eromance.Helpers

import android.util.Log
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.eveningTypes_LIST
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.meetTypes_LIST
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.placeTypes_LIST
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.quessionaryValues_List
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.userServicesTypes_LIST
import com.zoomapps.eromance.Models.*
import com.zoomapps.eromance.Models.Types.PlaceTypes
import com.zoomapps.eromance.Models.Types.PlaceTypesDatum
import com.zoomapps.eromance.Models.Types.UserServiceTypes
import io.realm.Realm
import io.realm.RealmModel
import io.realm.RealmObject
import io.realm.annotations.RealmClass
import java.io.File.separator
import java.io.IOException
import java.util.*


/**
 * Created by User on 25.05.2017.
 */
object DB_Helper {

    //Meet Types
    fun  mapMeetToSimple(mD:List<MeetTypesDatum> ): ArrayList<SimpleTypeDatum> {
      var retData = ArrayList<SimpleTypeDatum>()
        for(tmp in mD){
            retData.add(SimpleTypeDatum().apply {
                id = tmp.id
                key = tmp.key
                value = tmp.value
                createdAt = tmp.createdAt
                updatedAt = tmp.updatedAt
            })
        }
        return  retData
    }

    fun  mapEveningToSimple(mD:List<EveningTypesDatum> ): ArrayList<SimpleTypeDatum>{
        var retData = ArrayList<SimpleTypeDatum>()
        for(tmp in mD){
            retData.add(SimpleTypeDatum().apply {
                id = tmp.id
                key = tmp.key
                value = tmp.value
                createdAt = tmp.createdAt
                updatedAt = tmp.updatedAt
            })
        }
        return  retData
    }
    fun  mapPlacesToSimple(mD:List<PlaceTypesDatum> ): ArrayList<SimpleTypeDatum>{
        var retData = ArrayList<SimpleTypeDatum>()
        for(tmp in mD){
            retData.add(SimpleTypeDatum().apply {
                id = tmp.id
                key = tmp.key
                value = tmp.value
                createdAt = tmp.createdAt
                updatedAt = tmp.updatedAt
            })
        }
        return  retData
    }
    //MeetTypes
    fun getMeetTypes(_rlm : Realm):List<MeetTypesDatum>?{
        if(meetTypes_LIST==null|| meetTypes_LIST?.size==0){
            return getSavedMeetTypes(_rlm)
        }
        else{
            return meetTypes_LIST!!
        }
    }
    fun getSavedMeetTypes(rlm : Realm):List<MeetTypesDatum>? {
        val retData = rlm.where(MeetTypesResponse::class.java)?.findAll() ;
        if(retData == null|| retData?.size == 0){
            return null
        }
        else{
            val result = (retData.get(0) as MeetTypesResponse).data
            meetTypes_LIST = result
            return result
        }
    }
    fun saveMeetTypes(rlm: Realm , saveData: MeetTypesResponse){
        rlm.beginTransaction()
        val data = rlm.copyToRealm(saveData) // Persist unmanaged objects
        val table = rlm.createObject(MeetTypesResponse::class.java) // Create managed objects directly
        table.code = data.code;
        table.data = data.data;
        rlm.commitTransaction()
    }
    //Evening Types
    fun getEveningsTypes(_rlm : Realm):List<EveningTypesDatum>?{
        if(eveningTypes_LIST==null|| eveningTypes_LIST?.size==0){
            return getSavedEveningTypes(_rlm)
        }
        else{
            return eveningTypes_LIST!!
        }
    }

    fun getSavedEveningTypes(rlm : Realm):List<EveningTypesDatum>? {
        val retData = rlm.where(EveningTypesResponse::class.java)?.findAll() ;
        if(retData == null|| retData?.size == 0){
            return null
        }
        else{
            val result = (retData.get(0) as EveningTypesResponse).data
            eveningTypes_LIST = result
            return result
        }
    }

    fun saveEveningTypes(rlm: Realm , saveData: EveningTypesResponse){
        rlm.beginTransaction()
        val data = rlm.copyToRealm(saveData) // Persist unmanaged objects
        val table = rlm.createObject(EveningTypesResponse::class.java) // Create managed objects directly
        table.code = data.code;
        table.data = data.data;
        rlm.commitTransaction()
    }

    //-----------------------------------
    fun getSavedPlaceTypes(rlm: Realm  ):List<PlaceTypesDatum>? {
        val retData = rlm.where(PlaceTypes::class.java)?.findAll() ;
        if(retData == null|| retData?.size == 0){
            return null
        }
        else{
            val result = (retData.get(0) as PlaceTypes).data

            return result
        }
    }
    fun getSavedPlaceTypes( ):List<PlaceTypesDatum>? {
        var rlm = Realm.getDefaultInstance()
        val retData = rlm.where(PlaceTypes::class.java)?.findAll() ;
        if(retData == null|| retData?.size == 0){
            return null
        }
        else{
            val result = (retData.get(0) as PlaceTypes).data

            return result
        }
    }
    //TO CHECK AND GET DATA
    fun<T : RealmModel> getSavedData( modelClass : Class<T> ):T? {
        Log.e("LOGIC TEST" , "START CHECK FROM BASE")
        var rlm = Realm.getDefaultInstance()
        val retData = rlm.where(modelClass)?.findAll();
        if (retData == null || retData?.size == 0) {
            Log.e("LOGIC TEST" , "BASE empty")
            return null
        } else {
            Log.e("LOGIC TEST" , "BASE NOT empty!!!")
            val result = (retData.get(0))
            setDataToGlobal(result)
            return result
        }
    }
    fun<T> setDataToGlobal(savedData:T){
        Log.e("LOGIC TEST" , "Start make static ")
        when(savedData){
            is PlaceTypes->{
                Log.e("LOGIC TEST" , "Start make static placeTypes_LIST")
                placeTypes_LIST = savedData.data?.toList();
            }
            is UserServiceTypes->{
                Log.e("LOGIC TEST" , "Start make static userServicesTypes_LIST")
                userServicesTypes_LIST = savedData.data?.toList();
            }
            is QuessionariesValues ->{
                Log.e("LOGIC TEST" , "Start make static userServicesTypes_LIST")
                quessionaryValues_List = savedData.data?.toList();
            }
        }
    }

    fun<T : RealmModel> saveTypes(modelClass : Class<T> , saveData: T){
        var rlm = Realm.getDefaultInstance()
        rlm.beginTransaction()
        Log.e("LOGIC TEST" , " START SAVE  ")
         // Persist unmanaged objects
        val table = rlm.createObject(modelClass) // Create managed objects directly
        val data = rlm.copyToRealm(saveData)
        saveType_by_ClassName<T>(data,table);
        rlm.commitTransaction()
        Log.e("LOGIC TEST" , "   SAVE FUNCTION -- SUCCESS")
    }
    private fun<T : RealmModel> saveType_by_ClassName(saveData: T , table:T){
        Log.e("LOGIC TEST" , " START SPECIAL SAVE FUNCTION")
        when(saveData){
            is PlaceTypes ->{
                if(table is PlaceTypes) {
                    Log.e("LOGIC TEST" , " START SPECIAL SAVE FUNCTION -- PlaceTypes")
                    table.code = saveData.code;
                    table.data = saveData.data;
                }
            }
            is UserServiceTypes->{
                if(table is UserServiceTypes) {
                    Log.e("LOGIC TEST" , " START SPECIAL SAVE FUNCTION -- UserServiceTypes")
                    table.code = saveData.code;
                    table.data = saveData.data;
                }
            }
            is QuessionariesValues ->{
                if(table is QuessionariesValues) {
                    Log.e("LOGIC TEST" , " START SPECIAL SAVE FUNCTION -- UserServiceTypes")
                    table.code = saveData.code;
                    table.data = saveData.data;
                }
            }
        }
    }

}