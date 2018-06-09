package com.zoomapps.eromance.Controllers

import android.content.Context
import android.util.Log
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.QuessionariesValues
import com.zoomapps.eromance.Models.QuessionariesValuesDatum
import com.zoomapps.eromance.Models.TranslationModel

import com.zoomapps.eromance.Models.Types.PlaceTypes
import com.zoomapps.eromance.Models.Types.PlaceTypesDatum
import com.zoomapps.eromance.Models.Types.UserServiceTypes
import com.zoomapps.eromance.Models.Types.UserServiceTypesDatum

class TypeConvertor(val _ctx: Context) {
    object staticFuns{
        fun getCustomTranslations(id:Int? , type:Int):String{
            if(id!=null&& GlobalStaticVariables.allTranslations!=null){
                var tmp_data_holder : TranslationModel.IdValueModel?=null
                when(type){
                    Custom_Translation_Types.country->{
                        tmp_data_holder = GlobalStaticVariables.allTranslations?.locationCountries?.firstOrNull{it->it.id == id}
                    }
                    Custom_Translation_Types.city->{
                        tmp_data_holder = GlobalStaticVariables.allTranslations?.locationCities?.firstOrNull{it->it.id == id}
                    }
                    Custom_Translation_Types.sex->{
                        tmp_data_holder = GlobalStaticVariables.allTranslations?.userProfileSexes?.firstOrNull{it->it.id == id}
                    }
                }
                if(tmp_data_holder!=null && tmp_data_holder.value!=null ){
                    return tmp_data_holder.value!!
                }
            }
            return id.toString()
        }
        fun getCustomTranslations(value:String? , type:Int):Int{
            if(value!=null&& GlobalStaticVariables.allTranslations!=null){
                var tmp_data_holder : TranslationModel.IdValueModel?=null
                when(type){
                    Custom_Translation_Types.country->{
                        tmp_data_holder = GlobalStaticVariables.allTranslations?.locationCountries?.firstOrNull{it->it.value == value}
                    }
                    Custom_Translation_Types.city->{
                        tmp_data_holder = GlobalStaticVariables.allTranslations?.locationCities?.firstOrNull{it->it.value == value}
                    }
                    Custom_Translation_Types.sex->{
                        tmp_data_holder = GlobalStaticVariables.allTranslations?.userProfileSexes?.firstOrNull{it->it.value == value}
                    }
                }
                if(tmp_data_holder!=null && tmp_data_holder.id!=null ){
                    return tmp_data_holder.id!!
                }
            }
            return -1
        }
    }

    fun<T> getKeyById(typeName:Class<T>, type_id: Int?):String?{
        when(typeName){

            UserServiceTypes::class.java->{
                return (TypeController(_ctx).getTypes(typeName)
                        ?.filter {  it ->(it as UserServiceTypesDatum).id == type_id }
                        ?.firstOrNull() as UserServiceTypesDatum).key
            }
            QuessionariesValues::class.java->{
                try {
                    return (TypeController(_ctx).getTypes(typeName)
                            ?.filter {  it ->(it as QuessionariesValuesDatum).id == type_id }
                            ?.firstOrNull() as QuessionariesValuesDatum).key
                }catch (ex : Exception){
                    Log.e("errorTryCatch", "TypeConvertor.kt:69")
                }

            }
        }
        return ""
    }
    fun<T> getIdByKey(typeName:Class<T>, key_name: String?):Int?{
        when(typeName){
            PlaceTypes::class.java->{
                return (TypeController(_ctx).getTypes(typeName)
                        ?.filter {  it ->(it as PlaceTypesDatum).key == key_name }
                        ?.firstOrNull() as  PlaceTypesDatum ).id
            }
            UserServiceTypes::class.java->{
                return (TypeController(_ctx).getTypes(typeName)
                        ?.filter {  it ->(it as UserServiceTypesDatum).key == key_name }
                        ?.firstOrNull() as UserServiceTypesDatum).id
            }
        }
        return -1
    }
}