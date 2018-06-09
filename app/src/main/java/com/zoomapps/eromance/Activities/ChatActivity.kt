package com.zoomapps.eromance.Activities

import android.app.Activity
import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.google.gson.Gson
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageView
import com.vanniktech.emoji.EmojiEditText
import com.zoomapps.eromance.Adapters.ChatMessageAdapter
import com.zoomapps.eromance.R
import kotterknife.bindView
import com.vanniktech.emoji.EmojiPopup
import com.vanniktech.emoji.listeners.OnSoftKeyboardCloseListener
import com.vanniktech.emoji.listeners.OnEmojiPopupDismissListener
import com.vanniktech.emoji.listeners.OnSoftKeyboardOpenListener
import com.vanniktech.emoji.listeners.OnEmojiPopupShownListener
import com.vanniktech.emoji.emoji.Emoji
import com.vanniktech.emoji.listeners.OnEmojiClickedListener
import com.vanniktech.emoji.listeners.OnEmojiBackspaceClickListener
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.MessagePresenter
import com.zoomapps.eromance.Helpers.OpenTypesBy
import com.zoomapps.eromance.Interfaces.IChatView
import com.zoomapps.eromance.Models.ChatMessageModel
import com.zoomapps.eromance.Models.DialogsModel
import com.zoomapps.eromance.Models.UserProfileModel
import java.util.*

class ChatActivity : AppCompatActivity(), IChatView {
    override fun userProfileDataLoaded(joinedUserData: UserProfileModel.Datum?) {
        setUserDataToView(joinedUserData)
    }

    override fun onMessageReceived(messageData: ChatMessageModel.Datum_) {
        datalist?.add(messageData);
        update_RV_UI(true)
    }

    override fun userDataLoaded(joinedUserData: DialogsModel.Data?) {
        //Todo: Set UserData
        if (joinedUserData != null && !isDataSet) {
            loadImageToIV(this, profileImageView, joinedUserData.avatar)
            nameAgeTV.text = joinedUserData.username
            profileCountryTV.text = TypeConvertor.staticFuns.getCustomTranslations(joinedUserData?.profile?.data?.countryId, Custom_Translation_Types.country)
            profileCityTV.text = TypeConvertor.staticFuns.getCustomTranslations(joinedUserData?.profile?.data?.cityId, Custom_Translation_Types.city)
            user_info_container.setOnClickListener {
                if (joinedUserData?.id != null)
                    openUserProfile(this@ChatActivity, joinedUserData?.id.toString())
            }
        } else if (!isDataSet && joinedUserData == null) {
            messageHelper.getDataBy_UID(intercular_id!!)
        }
    }

    var sending_ids = ArrayList<Int>()
    override fun messageLoaded(loadedMessageList: List<ChatMessageModel.Datum_>?) {
        if (loadedMessageList != null) {
            datalist = loadedMessageList?.toMutableList();
        } else {
            datalist = ArrayList<ChatMessageModel.Datum_>()
        }
        mAdapter = ChatMessageAdapter(datalist, this)
        profileRecyclerView.adapter = mAdapter;
        update_RV_UI(false)
        setBtns()
    }

    fun setBtns() {
        sendButton_IB.setOnClickListener {
            sendMessaage(true)
        }
        attachImage_IV.setOnClickListener {
            // var start_intent = Intent(this@ChatActivity,ImageCropActivity::class.java).putExtra("needToCrop",false);
            //  startActivityForResult(start_intent,178)

            CropImage.activity()
                    .setGuidelines(CropImageView.Guidelines.ON)
                    .start(this);
        }
    }

    override fun sendContentIsEmpty() {
        showPreparedToast(this, "Send_Data_Empty")
    }

    override fun messageSendSuccessfully(messageData: ChatMessageModel.Datum_) {
        datalist?.add(messageData);
        update_RV_UI(true)
    }

    override fun messageSendError() {
        //TODO: MARK PREVIEW MESSAGE AS ERROR
        showPreparedToast(this, "Error")
    }

    override fun imageMessageSendError() {
        //TODO: MARK PREVIEW MESSAGE AS ERROR
        showPreparedToast(this, "Error")
    }

    fun update_RV_UI(isUpdate: Boolean) {
        runOnUiThread {
            if (isUpdate)
                mAdapter?.notifyDataSetChanged()
            if (datalist?.size!! > 2)
                profileRecyclerView?.scrollToPosition(datalist?.size?.minus(1)!!)
        }
    }

    var mAdapter: RecyclerView.Adapter<*>? = null
    val profileRecyclerView: RecyclerView by bindView(R.id.profileRecyclerView)
    var mLL_manager: LinearLayoutManager = LinearLayoutManager(this)
    val btn_emoticon: ImageButton by bindView(R.id.btn_emoticon)
    val chatMessageEditText: EmojiEditText by bindView(R.id.chatMessageEditText)
    val sendButton_IB: ImageButton by bindView(R.id.sendButton_IB)
    val attachImage_IV: ImageView by bindView(R.id.attachImage_IV)
    var emojiPopup: EmojiPopup? = null
    var datalist: MutableList<ChatMessageModel.Datum_>? = null
    val messageHelper = MessagePresenter(this, this)
    var intercular_id: String? = ""
    var progress_dialog: ProgressDialog? = null

    val profileImageView: ImageView by bindView(R.id.profileImageView)
    val nameAgeTV: TextView by bindView(R.id.nameAgeTV)
    val profileCountryTV: TextView by bindView(R.id.profileCountryTV)
    val profileCityTV: TextView by bindView(R.id.profileCityTV)
    val onlineProfileIV: ImageView by bindView(R.id.onlineProfileIV)
    val user_info_container: LinearLayout by bindView(R.id.user_info_container)
    val main_user_info_container: LinearLayout by bindView(R.id.main_user_info_container)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        intercular_id = intent.getStringExtra("intercular_id");
        if (intercular_id == null || intercular_id?.isEmpty()!!)
            return

        setToolbar(this,
                getString(R.string.chat),
                findViewById<TextView>(R.id.tv_map),
                findViewById<ImageView>(R.id.custom_toolbar_home_btn),
                true)
        setUpEmojiPopup();
        chatMessageEditText.setEmojiSize(dpToPx(16))
        btn_emoticon.setOnClickListener {
            emojiPopup?.toggle();
        }
        profileRecyclerView.layoutManager = mLL_manager;
        progress_dialog = ProgressDialog(this@ChatActivity)
        progress_dialog?.setMessage(getString(R.string.go_upload))

        var user_data = intent.getStringExtra("user_data")
        if (user_data != null && user_data != "") {
            setUserData(user_data)
        }
        messageHelper.getData(intercular_id)
        profileImageView.setOnClickListener({ v ->

            startActivity(Intent(this, UserProfileActivity::class.java)
                    .putExtra("user_data",intercular_id!!)
                    .putExtra("open_type", OpenTypesBy.user_id));
        })

    }

    var isDataSet = false
    fun setUserData(data_str: String) {
        var container_data: UserProfileModel.Datum? = null
        try {
            container_data = Gson().fromJson(data_str, UserProfileModel.Datum::class.java)
        } catch (ex: Exception) {

        }
        if (container_data == null)
            return

        isDataSet = true
        setUserDataToView(container_data)
    }

    fun setUserDataToView(container_data: UserProfileModel.Datum?) {
        loadImageToIV(this, profileImageView, container_data?.user?.data?.avatar)
        nameAgeTV.text = container_data?.user?.data?.username
        profileCountryTV.text = TypeConvertor.staticFuns.getCustomTranslations(container_data?.countryId, Custom_Translation_Types.country)
        profileCityTV.text = TypeConvertor.staticFuns.getCustomTranslations(container_data?.cityId, Custom_Translation_Types.city)
        user_info_container.setOnClickListener {
            //            startActivity(Intent(,UserProfileActivity::class.java)
//                    .putExtra("user_id", serializeToJson( c))
//                    .putExtra("open_type", OpenTypesBy.user_id))
            if (container_data?.userId != null)
                openUserProfile(this@ChatActivity, container_data?.userId.toString())
        }
    }

    fun sendMessaage(isText: Boolean = false, imageUri: Uri? = null) {
        if (isText) {
            var msg_text = chatMessageEditText.text
            messageHelper.sendMessage(intercular_id!!, content = msg_text.toString())
            chatMessageEditText.text.clear()

        } else {
            messageHelper.sendMessage(intercular_id!!, image = imageUri)
        }
        //TODO:MESSAGE PREVIEW
        //  mDataAdapter?.notifyDataSetChanged()
        //  profileRecyclerView?.scrollToPosition(datalist.size-1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            val result = CropImage.getActivityResult(data)
            if (resultCode == Activity.RESULT_OK) {
                val resultUri = result.uri
                //isStopped = false;
                Log.e("selectedImageUri", resultUri.toString())
                sendMessaage(false , resultUri)
                //processImage(resultUri);


            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                val error = result.error
            }
        } else {
            if (resultCode == Activity.RESULT_OK) {
                val selectedImageUri = data?.getStringExtra("result");

                if (data == null || selectedImageUri == null)
                    showPreparedToast(this, "Response");
                else {
                    sendMessaage(false, Uri.parse(selectedImageUri))
                }
            }
        }
    }


    fun setUpEmojiPopup() {
        emojiPopup = EmojiPopup.Builder.fromRootView((findViewById<ViewGroup>(R.id.activity_chat)))
                .setOnEmojiBackspaceClickListener(object : OnEmojiBackspaceClickListener {
                    override fun onEmojiBackspaceClicked(v: View?) {
                        chatMessageEditText.backspace()
                    }

                })
                .setOnEmojiClickedListener { emojiPopup?.toggle() }
                .setOnEmojiPopupShownListener { btn_emoticon.setImageResource(R.drawable.ic_keyboard) }
                .setOnSoftKeyboardOpenListener { }
                .setOnEmojiPopupDismissListener { btn_emoticon.setImageResource(R.drawable.icon_mr) }
                .setOnSoftKeyboardCloseListener {
                    if (!emojiPopup?.isShowing!!)
                        emojiPopup?.dismiss();
                }
                .build(chatMessageEditText)
    }

    override fun onBackPressed() {
        if (!emojiPopup?.isShowing!!)
            super.onBackPressed()
        else
            emojiPopup?.dismiss()
    }

    override fun onResume() {
        super.onResume()
        messageHelper.onResume()
    }

    override fun onPause() {
        super.onPause()
        messageHelper.onPause()
    }


}
