package com.zoomapps.eromance.Helpers

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.vk.sdk.api.*
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.Models.ThirdPartyApiModel
import android.widget.Toast
import com.zoomapps.eromance.Activities.AuthActivity
import com.zoomapps.eromance.Models.OdnoklassnikiResponseModel
import org.json.JSONObject
import ru.ok.android.sdk.Odnoklassniki
import ru.ok.android.sdk.OkListener



/**
 * Created by User on 17.08.2017.
 */
class  ThirdPartyApiCalls(val mContext : Context) {
    private var myRequest: VKRequest? = null
    fun vkMethods(methodName:String) {
        when (methodName) {

            "profile"-> {
                val request = VKApi.users().get(VKParameters.from(VKApiConst.FIELDS,
                        "id,first_name,last_name,sex,bdate,city,country,photo_50,photo_100," +
                                "photo_200_orig,photo_200,photo_400_orig,photo_max,photo_max_orig,online," +
                                "online_mobile,lists,domain,has_mobile,contacts,connections,site,education," +
                                "universities,schools,can_post,can_see_all_posts,can_see_audio,can_write_private_message," +
                                "status,last_seen,common_count,relation,relatives,counters"))
                request.secure = true
                request.useSystemLanguage = false
                startVkApiCall(request)
            }

        }
    }


    internal var mRequestListener: VKRequest.VKRequestListener = object : VKRequest.VKRequestListener() {
        override fun onComplete(response: VKResponse?) {
            var respData = response!!.json.toString()
            var container2 = Gson().fromJson(respData, ThirdPartyApiModel.VK_Models.VkProfileResponse::class.java)
            var responseObj = container2?.response!![0]
            var apiService = API_Client.apiService;
            var user_id_str = responseObj.id.toString()
            Log.e("{USER_ID}",user_id_str);
           // var password_str = md5(responseObj.id.toString()+"vk")
         //   Log.e("{password}",password_str);
//            var sendResquest = LoginRequest().apply {
//                user_id =user_id_str
//                password =password_str
//                phone =responseObj.mobilePhone
//                name =responseObj.firstName
//                email="none"//TODO:REPLACE
//            }
            (mContext as AuthActivity).startSocial(
                    (mContext).setDataToModel(1,responseObj.id.toString(),responseObj.firstName,
                            null,null,responseObj.mobilePhone,
                            arrayOf<String?>(responseObj.country?.title,
                            responseObj.city?.title),null))
//            sendSocialAuthReg(mContext,sendResquest,user_id_str,password_str)
            var errMSg = "";

        }

        override fun onError(error: VKError?) {
            var errorData =error!!.toString()
        }

        override fun onProgress(progressType: VKRequest.VKProgressType?, bytesLoaded: Long,
                                bytesTotal: Long) {
            // you can show progress of the request if you want
        }

        override fun attemptFailed(request: VKRequest?, attemptNumber: Int, totalAttempts: Int) {
            var failData =String.format("Attempt %d/%d failed\n", attemptNumber, totalAttempts)
        }
    }
    private fun startVkApiCall(request: VKRequest) {
        var thisrequest = VKRequest.getRegisteredRequest(request.registerObject())
        thisrequest?.unregisterObject()
        if (request == null) return
        myRequest = request
        thisrequest.executeWithListener(mRequestListener)
    }

    //Odnoklassniki
    fun getOkUserInfo(odnoklassniki:Odnoklassniki){
        odnoklassniki.requestAsync("users.getCurrentUser", null, null, object : OkListener {
            override fun onSuccess(json: JSONObject) {
                var raw_data = json.toString()
                if(!raw_data.isNullOrEmpty()){
                    var data = Gson().fromJson(raw_data , OdnoklassnikiResponseModel.ResponseData::class.java);
                    (mContext as AuthActivity).startSocial(
                            (mContext).setDataToModel(5,data.uid,data.firstName,
                                    null,data.birthday,null , arrayOf<String?>(data.location?.country,data.location?.city),null ))
                }
                Toast.makeText(mContext, "Success", Toast.LENGTH_SHORT).show()
            }

            override fun onError(error: String) {
                Toast.makeText(mContext, "Get current user failed: " + error, Toast.LENGTH_SHORT).show()
            }
        })
    }
}