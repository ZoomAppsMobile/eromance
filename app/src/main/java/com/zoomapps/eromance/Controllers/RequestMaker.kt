package com.zoomapps.eromance.Controllers

import android.util.Log
import com.zoomapps.eromance.Interfaces.RequestMakerListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by User on 16.06.2017.
 */
class RequestMaker(val listener : RequestMakerListener){
    fun<T> makeRequest(call:Call<T>){
        call.enqueue(object : Callback<T> {
            override fun onResponse(call: Call<T>,
                                    response: Response<T>) {
                val test = response.body()
                if(test != null ) {
                    val mainPageDataList = response.body()
                    if(mainPageDataList!=null) {
                        Log.e("LOGIC TEST" , " REQUEST is SUCCESSFULL ")
                        listener.onRequestSuccess<T>(response.body())
                    }
                }
                else {
                    listener.onError<T>(response.body())
                }
            }
            override fun onFailure(call: Call<T>, t: Throwable) {
                listener.onError<T>()
            }
        })
    }
}