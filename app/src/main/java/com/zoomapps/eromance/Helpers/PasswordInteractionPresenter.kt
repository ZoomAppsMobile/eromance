package com.zoomapps.eromance.Helpers

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Controllers.RequestMaker
import com.zoomapps.eromance.Controllers.setTranslations
import com.zoomapps.eromance.Interfaces.IPasswordInteractionView
import com.zoomapps.eromance.Interfaces.RequestMakerListener
import com.zoomapps.eromance.Models.PasswordModel
import java.text.Normalizer


/**
 * Created by User on 19.06.2017.
 */
class PasswordInteractionPresenter (val mContext: Context, val viewInteraction : IPasswordInteractionView) :RequestMakerListener
{
    override fun <T> onError(out: T?) {
        when(view_type){
            1->{
                viewInteraction.cp_OnError()
            }
            2->{
                viewInteraction.rp_OnError()
            }

        }  }


    override fun <T> onRequestSuccess(out: T) {
        when(view_type){
            1->{
                var response = out as PasswordModel.ChangePasswordResponse;
                GlobalStaticVariables.isUser_Twenty_One_Provider = response.data?.profile?.data?.isAdult;
                GlobalStaticVariables.myData = response.data!!
                GlobalStaticVariables.myId =response.data!!.id;
                viewInteraction.cp_OnSuccess()
            }
            2->{
                viewInteraction.rp_OnSuccess()
            }

        }
    }
    var view_type = -1;
    fun makeAction(type:Int , data:String?){
        view_type=type
        when(type){
            1->{
                changePassword(data)
            }
            2->{
                restorePassword(data)
            }
        }
    }
    val requestMaker  = RequestMaker(this)
    fun changePassword(new_password:String?){
//        /api/v1/ru/users/1?username={1}&email={2}}&type_id={3}&password={password}
        if(!checking_status){
            viewInteraction.on_CheckError("Пароли не совпадают")
            return
        }
        if(!isStringContainsLatinCharactersOnly(new_password)){
            viewInteraction.on_CheckError("Пароль должен содержать из латинские букв")
            return
        }
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.changePassword(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId.toString() ,
                GlobalStaticVariables.myData?.username!! , GlobalStaticVariables.myData?.email!!,
                GlobalStaticVariables.myData?.typeId ,new_password!!)

        requestMaker.makeRequest(call)
    }

    fun isStringContainsLatinCharactersOnly(iStringToCheck: String?): Boolean {
        if(iStringToCheck !=null)
            return iStringToCheck.matches("^[a-zA-Z0-9.]+$".toRegex())
        else
            return false
    }
    fun restorePassword(user_email:String?){
        if(user_email==null || user_email=="")
            viewInteraction.on_CheckError("Email не может быть пустым")
        else{

        }
    }

    var checking_status:Boolean=false;

    inner class checkPasswordTypes(val new_password_ED:EditText,val obserable_ED:EditText):TextWatcher{
        override fun afterTextChanged(p0: Editable?) {
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            if(new_password_ED.text.toString() != p0.toString()){
                obserable_ED.setError("Пароли не совпадают")
                checking_status = false
            }
            else {
                obserable_ED.setError(null)
                checking_status = true
            }
        }

    }
}

