package com.zoomapps.eromance.API

import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Asus on 27.02.2018.
 */
object TestKotlin {
    //   val BASE_URL = "http://139.59.136.183:8002/api/v1/"
//    http://185.146.1.72:8080/api/v1/
    val BASE_URL =  "http://185.146.1.72:8080/api/v1/ru/"
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
                        .baseUrl(BASE_URL+ GlobalStaticVariables.language_type)
                        .client(okHttpClient)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            }
            return retrofit
        }
}