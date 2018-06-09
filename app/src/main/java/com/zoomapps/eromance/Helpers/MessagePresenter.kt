package com.zoomapps.eromance.Helpers

import android.app.Activity
import android.content.Context
import android.net.Uri
import com.google.gson.Gson
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Activities.MyProfileActivity
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Interfaces.IChatView
import com.zoomapps.eromance.Models.ChatMessageModel
import com.zoomapps.eromance.Models.UserPhotosModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File
import java.io.IOException
import android.provider.MediaStore
import com.google.gson.JsonObject
import com.zoomapps.eromance.API.API_Client.BASE_URL
import com.zoomapps.eromance.Controllers.checkImage
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.current_intercular_id
import com.zoomapps.eromance.Models.PushModels.MessageModel
import com.zoomapps.eromance.Models.UserProfileModel
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode



/**
 * Created by User on 13.06.2017.
 */

class MessagePresenter(val mContext: Context,var viewInterface: IChatView) {
    init {

    }

    val textMessage = 10;
    val imageMessage = 11
    fun getData(interocular_id : String?){
        current_intercular_id = interocular_id?.toInt()!!;
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getMessagesByUserIds(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId.toString(),interocular_id!!)
        call.enqueue(object : Callback<ChatMessageModel.DialogWithChatResponse> {
            override fun onResponse(call: Call<ChatMessageModel.DialogWithChatResponse>,
                                    response: Response<ChatMessageModel.DialogWithChatResponse>) {
                val test = response.body()
                if(test != null ) {
                    val mainPageDataList = response.body().data
                    if(mainPageDataList!=null) {
                        var messageData = mainPageDataList?.firstOrNull();
                        if(messageData!=null){
                            if(messageData.joined!=null && messageData.joined?.data!=null)
                                  viewInterface.userDataLoaded(messageData?.joined?.data)
                            else{
                                viewInterface.userDataLoaded(null)
                            }
                            if(messageData?.messages!=null&&messageData?.messages?.data!=null)
                                  viewInterface.messageLoaded(messageData?.messages?.data)
                            else{
                                viewInterface.messageLoaded(null)
                            }
                            return
                        }
                        viewInterface.userDataLoaded(null)
                        viewInterface.messageLoaded(null)
                    }

                }
                else {
                    viewInterface.messageSendError()
                }
            }
            override fun onFailure(call: Call<ChatMessageModel.DialogWithChatResponse>, t: Throwable) {
                // Log error here since request failed{
                viewInterface.messageSendError()
            }
        })
    }

    private fun getType( content:String?=null , image:String?=null) :Int? {
        if(content!=null  ){
            return textMessage;
        }
        else if(image!=null ){
            return imageMessage;
        }
        else{
            return null
        }

    }

    fun sendMessage(to_user:String , content:String?=null , image: Uri?=null){
        if(content==null && image==null){
            viewInterface.sendContentIsEmpty()
            return
        }
        when(getType(content,image.toString())){
            textMessage->{
                sendTextMessage(to_user , content!!)
            }
            imageMessage->{
                sendImageMessage(File(getRealPathFromURI(image!!)),to_user )
            }
            else->return
        }
    }

    fun getDataBy_UID(uid:String){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getUserProfile_By_UID(GlobalStaticVariables.language_type!!,uid)
        call.enqueue(object : Callback<UserProfileModel.ProfileFindResponse> {
            override fun onResponse(call: Call<UserProfileModel.ProfileFindResponse>,
                                    response: Response<UserProfileModel.ProfileFindResponse>) {
                val test = response.body()
                if(test != null ) {
                    val mainPageDataList = response.body().data
                    val statusCode = response.code()
                    var listData =  mainPageDataList;
                    if(mainPageDataList!=null) {
                        //setUserProfileData(mainPageDataList)
                        viewInterface.userProfileDataLoaded(mainPageDataList?.firstOrNull())
                    }
                }
                else {
                    showToast(mContext ,"Не удалось получить данные")
                }
            }
            override fun onFailure(call: Call<UserProfileModel.ProfileFindResponse>, t: Throwable) {
                // Log error here since request failed
                showPreparedToast(mContext ,"Error")
            }
        })
    }

    private fun getRealPathFromURI(contentURI: Uri): String {
        val result: String
        val cursor = (mContext as Activity).getContentResolver().query(contentURI, null, null, null, null)
        if (cursor == null) { // Source is Dropbox or other similar local file path
            result = contentURI.path
        } else {
            cursor!!.moveToFirst()
            val idx = cursor!!.getColumnIndex(MediaStore.Images.ImageColumns.DATA)
            result = cursor!!.getString(idx)
            cursor!!.close()
        }
        return result
    }
    private fun sendImageMessage(file: File, to_user_id: String){
        MyProfileActivity.UploadService()?.uploadImage(file,file.name, BASE_URL+"ru/conversation_message/send?from_user_id="+GlobalStaticVariables.myId?.toString()+"&to_user_id="+to_user_id,object : okhttp3.Callback {
            override fun onFailure(call: okhttp3.Call?, e: IOException?) {
                var error = ""
            }

            override fun onResponse(call: okhttp3.Call?, response: okhttp3.Response?) {
                if (response!=null&& response.isSuccessful) {
                    val responseStr = response.body()?.string()
                    val container2 = Gson().fromJson(responseStr, ChatMessageModel.MessageSendResponse::class.java)
                    if (container2 == null || container2.code != 1 || container2.data==null){
                        viewInterface.imageMessageSendError()
                        return
                     }
                   else{
                        viewInterface.messageSendSuccessfully(container2?.data!!);
                        return
                    }
                }
                else {
                    viewInterface.imageMessageSendError()
                    try {
                        val responseStr = response!!.body()?.string()
                    }
                    catch (ex:Exception){

                    }
                    return
                    // Request not successful
                }
            }
        })
    }
    private fun convertParamsToJson(my_id:String,to_user:String,content:String) :JsonObject{
        val payerReg = JsonObject()
        payerReg.addProperty("from_user_id", my_id)
        payerReg.addProperty("to_user_id", to_user)
        payerReg.addProperty("content", content)
        return payerReg
    }
    private fun sendTextMessage(to_user_id:String ,content:String){
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.sendMessage(GlobalStaticVariables.language_type!!,convertParamsToJson(GlobalStaticVariables.myId.toString(),to_user_id , content))
        call.enqueue(object : Callback<ChatMessageModel.MessageSendResponse> {
            override fun onResponse(call: Call<ChatMessageModel.MessageSendResponse>,
                                    response: Response<ChatMessageModel.MessageSendResponse>) {
                val test = response.body()
                if(test != null ) {
                    val mainPageDataList = response.body().data
                    if(mainPageDataList!=null) {
                        viewInterface.messageSendSuccessfully(mainPageDataList)
                    }
                }
                else {
                    viewInterface.messageSendError()
                }
            }
            override fun onFailure(call: Call<ChatMessageModel.MessageSendResponse>, t: Throwable) {
                // Log error here since request failed{
                viewInterface.messageSendError()
            }
        })
    }

    fun onResume(){
        GlobalStaticVariables.isMessageIsSubscribed = true
        EventBus.getDefault().register(this);
    }
    fun onPause(){
        GlobalStaticVariables.isMessageIsSubscribed = false
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onMessageEvent(event: MessageModel.MessageData) {

        viewInterface.onMessageReceived(mapPushMsgToResponseMsg(event))
       // viewInterface.onMessageReceived()
    };

    fun mapPushMsgToResponseMsg(data:MessageModel.MessageData):ChatMessageModel.Datum_ {
        var sendData = ChatMessageModel().Datum_();
        sendData.id = data.data?.id;
        sendData.content = data.data?.content
        //sendData.conversationId =
        sendData.userId = data.data?.from?.id
        sendData.isAttachment = if(checkImage(data.data?.content) ) true else false
        sendData.createdAt =  data.date
        sendData.updatedAt =  data.date
        return sendData;
    }
}