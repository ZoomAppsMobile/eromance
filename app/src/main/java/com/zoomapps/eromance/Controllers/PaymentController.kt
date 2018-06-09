package com.zoomapps.eromance.Controllers

import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.PaymentModel
import com.zoomapps.eromance.Models.paymentTypes.Datum
import com.zoomapps.eromance.Models.paymentTypes.PaymentTypesModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by User on 05.09.2017.
 */
class PaymentController {
    object PaymentTypes{
        val PROFILE_VIP = "profile_vip"
        val PLACE  = "places"
        val PLACE_VIP = "place_vip"
        val PHOTO  = "photo"
        val GIFY = "gift"
    }
    fun getIdByKey(key:String):Int?{
        return keys.get(key);
    }
    val keys = mapOf("profile_vip" to 4,
            "places" to  5,
            "place_vip" to 6,
            "photo" to 7,
            "gift" to 9);

    companion object {
        private var mInstance:PaymentController?=null
        public fun getInstance() : PaymentController{
            if(mInstance==null)
                mInstance = PaymentController()
            return mInstance!!;
        }
    }
    var isInitailized = false
    var mData = ArrayList<Datum>()
    fun getPaymentAmount(paymentID:Int?):Int{
        if(!isInitailized || paymentID==null)
            return 0
        var tmp_data = mData.firstOrNull{i->i.id == paymentID}
        if(tmp_data!=null){
            return tmp_data.amount
        }
        return 0
    }
    fun init_payment(type:String?=null){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        apiService.getPaymentsData().enqueue(object: Callback<PaymentTypesModel>{
            override fun onResponse(call: Call<PaymentTypesModel>?, response: Response<PaymentTypesModel>?) {
                if(response== null || response.body()==null || response.body().data==null){
                    isInitailized = false;return;}
                isInitailized = true;
                mData.clear()
                mData.addAll(response.body().data)
                if(type!=null){
                    makeRequest(type)
                }
            }

            override fun onFailure(call: Call<PaymentTypesModel>?, t: Throwable?) {

            }

        })
    }

    fun makeRequest(type:String): Call<PaymentModel.PaymentResponseData>? {
        if(!isInitailized)
        {
            init_payment(type)
        }
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        when(type){
            PaymentTypes.PROFILE_VIP->{
                return apiService.makePayment(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId.toString(),keys.get(PaymentTypes.PROFILE_VIP)!!)
            }
            PaymentTypes.PLACE->{
                return apiService.makePayment(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId.toString(),keys.get(PaymentTypes.PLACE)!!)
            }
//            PaymentTypes.PLACE_VIP->{
//                return apiService.makePayment(GlobalStaticVariables.myId.toString(),keys.get(PaymentTypes.PLACE_VIP)!!)
//            }
            PaymentTypes.PHOTO->{
                return apiService.makePayment(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId.toString(),keys.get(PaymentTypes.PHOTO)!!)
            }
            PaymentTypes.GIFY->{
                return apiService.makePayment(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId.toString(),keys.get(PaymentTypes.GIFY)!!)
            }
        }
        return null
    }
    fun onRequestSuccess(type:String , amount:Int=0) {
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        when(type){
            PaymentTypes.PROFILE_VIP->{
                GlobalStaticVariables.myData?.isVip=true;
                GlobalStaticVariables.myData?.amount = GlobalStaticVariables.myData?.amount!! - amount;
                //GlobalStaticVariables.myData?.
            }
            PaymentTypes.PLACE->{

            }
//            PaymentTypes.PLACE_VIP->{
//                return apiService.makePayment(GlobalStaticVariables.myId.toString(),keys.get(PaymentTypes.PLACE_VIP)!!)
//            }
            PaymentTypes.PHOTO->{
                GlobalStaticVariables.myData?.profile?.data?.photos_count=+3;
            }
            PaymentTypes.GIFY->{

            }
        }
    }
}