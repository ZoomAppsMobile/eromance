package com.zoomapps.eromance.Helpers

import android.content.Context
import android.content.Intent
import android.widget.ImageView
import android.widget.TextView
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Controllers.RequestMaker
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Controllers.setRating
import com.zoomapps.eromance.Interfaces.IUserReviewsView
import com.zoomapps.eromance.Interfaces.RequestMakerListener
import com.zoomapps.eromance.Models.ReviewModel
import de.hdodenhof.circleimageview.CircleImageView

/**
 * Created by User on 03.07.2017.
 */
class UserReviewPresenter (val mContext : Context, val viewInterface: IUserReviewsView):RequestMakerListener
{
    override fun <T> onError(out: T?) {
        when(out){
            is ReviewModel.GetReviewResponse->{
                viewInterface.onReviewLoadError()
            }
            is ReviewModel.SendReviewResponse->{
                viewInterface.onReviewSendError()
            }
        }
    }


    override fun <T> onRequestSuccess(out: T) {
        when(out){
            is ReviewModel.GetReviewResponse->{
                viewInterface.onReviewsLoaded(out)
            }
            is ReviewModel.SendReviewResponse->{
                viewInterface.onReviewSend(out)
            }
        }

    }

    val rqstMkr = RequestMaker(this)

    fun loadReviews(entity_id:String,isPlace:Boolean=false){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        if(isPlace){
            val call = apiService.getUserReviewList(entity_id,"App\\Place\\Place")
            rqstMkr.makeRequest(call)
        }
        else{
            val call = apiService.getUserReviewList(GlobalStaticVariables.language_type!!,entity_id)
            rqstMkr.makeRequest(call)
        }
    }

    fun setUserDataToView(avatar: CircleImageView, userName: TextView, rating:ImageView,data: Intent? ){
//        user_real_name
//        user_avatar
//        user_rating
        loadImageToIV(mContext,avatar,data?.getStringExtra("user_avatar"))
        userName.text=data?.getStringExtra("user_real_name")
        setRating(mContext, rating,data?.getDoubleExtra("user_rating",0.0)!!)
    }

    fun sendReview(content_text:String, entity_id:String, isPlace: Boolean=false){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        if(isPlace) {
            val call = apiService.sendReviewToUser(GlobalStaticVariables.myId.toString(), content_text, entity_id,"App\\Place\\Place")
            rqstMkr.makeRequest(call)
        }
        else{
            val call = apiService.sendReviewToUser(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId.toString(), content_text, entity_id)
            rqstMkr.makeRequest(call)
        }
    }
}