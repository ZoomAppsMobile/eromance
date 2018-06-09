package com.zoomapps.eromance.API

import android.util.Log
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.language_type
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import okhttp3.logging.HttpLoggingInterceptor

object API_Client {
//   val BASE_URL = "http://139.59.136.183:8002/api/v1/"
//    http://185.146.1.72:8080/api/v1/
    val BASE_URL =  "http://185.146.1.72:8080/api/v1/"
    private var retrofit: Retrofit? = null
    var apiService :API_Interface? = null
    var okHttpClient : OkHttpClient?=null
    init {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        this.okHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()
        this.apiService = API_Client.client!!.create(API_Interface::class.java)
    }



    val client: Retrofit?
        get() {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .client(okHttpClient)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                Log.e("retrofitUrl", GlobalStaticVariables.language_type)
            }
            return retrofit
        }

}