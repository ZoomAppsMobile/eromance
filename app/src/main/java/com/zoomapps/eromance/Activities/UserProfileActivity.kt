package com.zoomapps.eromance.Activities

import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.NestedScrollView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Helpers.GlobalStaticVariables.myData
import com.zoomapps.eromance.Models.AccountModel.LoginModel
import com.zoomapps.eromance.R
import kotterknife.bindView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.zoomapps.eromance.R.id.imageView
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import android.support.v4.graphics.drawable.RoundedBitmapDrawable
import android.graphics.Bitmap
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.support.v7.widget.SnapHelper
import android.util.Log
import android.view.Gravity
import android.widget.*
import com.bumptech.glide.request.target.BitmapImageViewTarget
import com.bumptech.glide.load.resource.bitmap.TransformationUtils.centerCrop
import com.zoomapps.eromance.Adapters.*
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.CustomViews.PaddingItemDecoration
import com.zoomapps.eromance.DialogFragment.ReportDialogFragment
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.OpenTypesBy
import com.zoomapps.eromance.Helpers.UserInteractionHelper
import com.zoomapps.eromance.Helpers.UserProfilePresenter
import com.zoomapps.eromance.Interfaces.IUserInteractionView
import com.zoomapps.eromance.Interfaces.IUserProfileView
import com.zoomapps.eromance.Models.*
import de.hdodenhof.circleimageview.CircleImageView


class UserProfileActivity : AppCompatActivity(), IUserInteractionView, IUserProfileView {
    override fun onUserGiftsLoaded2(out: List<GiftsModel.Datum>) {
        if (out.isNotEmpty()) {
            user_gifts_RV.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
            user_gifts_RV.visibility = View.VISIBLE
            user_gifts_RV.adapter = GiftsAdapter2(out, this, false)
        }
    }

    override fun onUserAreBlocked() {
        runOnUiThread {
            more_btns_container.visibility = View.GONE
            user_social_actions.visibility = View.GONE
            like_container.visibility = View.INVISIBLE
            cancel_container.visibility = View.INVISIBLE
            body_LL.visibility = View.GONE
            me_blocked_LL.visibility = View.VISIBLE
        }

    }

    override fun onUserGiftsLoaded(out: List<GiftsModel.Data>) {
      Log.e("out", out[0].image)
    }

    override fun onGiftSendSuccesfully() {
        showToast(this, getString(R.string.send_success_gift))
    }

    override fun onGiftSendError() {
        showToast(this, getString(R.string.error))
    }

    var mPhotosAdapter: RecyclerView.Adapter<*>? = null
    override fun onUserPhotosLoaded(out: List<UserPhotosModel.Data>) {
        if (out.isNotEmpty()) {
            mPhotosAdapter = UserPhotosAdapter(out, this, Array<String>(out.size, { i -> (GlobalVariables.server_url + out.get(i).image) }))
            user_photoalbum_RV.adapter = mPhotosAdapter
        }
    }

    override fun onUserProfileDataLoaded(out: UserProfileModel.Datum?) {
        if (out != null) {
            setUserProfileData(out)
            cur_profile_id = out.id.toString()
        }
    }


    override fun onFavoriteError() {
        isFavProcessing = false;
        showPreparedToast(this, "Error")
    }

    override fun onFavoritesChecked(isFav: Boolean?, fav_id: Int?) {
        favStatus = if (isFav!!) 1 else 0;
        this.fav_id = if (isFav!!) fav_id!! else -1;
        favorite_IV.isClickable = true;
        updateFavUI(isFav!!)
    }

    override fun onFavorited(fav_id: Int?) {
        favStatus = 1;
        this.fav_id = fav_id!!
        updateFavUI(true)
    }

    override fun onUnfavorited() {
        favStatus = 0;
        this.fav_id = -1
        updateFavUI(false)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        //super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 204) {
            if (resultCode == Activity.RESULT_OK) {
                var result = data?.getIntExtra("giftId", -1);
                if (result != -1) {
                    user_info_presenter.sendGift(result!!, cur_user_id!!);
                }
                //TODO:SEND GIFT AFTER
            } else if (resultCode == Activity.RESULT_CANCELED) {
                // some stuff that will happen if there's no result
            }
        }
    }

    var isFavProcessing = false;
    fun updateFavUI(isFav: Boolean?) {
        isFavProcessing = false;
        if (isFav!!) {
            favorite_IV.setImageResource(R.drawable.remove_to_favorite_btn_icon)
        } else {
            favorite_IV.setImageResource(R.drawable.add_to_favorite_btn_icon)
        }
    }

    override fun onLiked() {
        likeState = 1;
        upDateUI(likeImage = R.drawable.liked_btn)
    }

    override fun onDisliked() {
        likeState = 0;
        upDateUI(cancel_image = R.drawable.canceled_btn)
    }

    override fun onRemoved() {
        likeState = -1;
        upDateUI()
    }

    fun upDateUI(likeImage: Int = R.drawable.like_btn, cancel_image: Int = R.drawable.cancel_btn) {
        runOnUiThread {
            like_IV.setImageResource(likeImage);
            //cancel_IV.setImageResource(cancel_image);
            setBts(true)
        }
    }

    fun setBts(state: Boolean) {
        like_IV.isClickable = state;
        cancel_IV.isClickable = state;
    }

    val main_container: LinearLayout by bindView(R.id.main_container)
    val user_avatar_n_actions_container: LinearLayout by bindView(R.id.user_avatar_n_actions_container)
    val user_avatar_container: LinearLayout by bindView(R.id.user_avatar_container)
    val share_container: LinearLayout by bindView(R.id.share_container)
    val chat_container: LinearLayout by bindView(R.id.chat_container)
    val like_container: LinearLayout by bindView(R.id.like_container)
    val rating_container: LinearLayout by bindView(R.id.rating_container)
    val cancel_container: LinearLayout by bindView(R.id.cancel_container)
    val more_btns_container: LinearLayout by bindView(R.id.more_btns_container)
    val gift_btn_container: LinearLayout by bindView(R.id.gift_btn_container)
    val chat_btn_container: LinearLayout by bindView(R.id.chat_btn_container)
    val add_favorities_btn_container: LinearLayout by bindView(R.id.add_favorities_btn_container)
    val user_location_container: LinearLayout by bindView(R.id.user_location_container)
    val user_pictures_container: LinearLayout by bindView(R.id.user_pictures_container)
    val user_gift_container: LinearLayout by bindView(R.id.user_gift_container)
    val user_interests_container: LinearLayout by bindView(R.id.user_interests_container)
    val user_rating_container: LinearLayout by bindView(R.id.user_rating_container)
    val user_aboutyourself_container: LinearLayout by bindView(R.id.user_aboutyourself_container)
    val user_languages_container: LinearLayout by bindView(R.id.user_languages_container)
    val additional_Container: LinearLayout by bindView(R.id.additional_Container)
    val additional_RV_container: LinearLayout by bindView(R.id.additional_RV_container)

    //LL

    val header_LL: LinearLayout by bindView(R.id.header_LL)
    val hide_user_avatar_LL: LinearLayout by bindView(R.id.hide_user_avatar_LL)
    val user_additional_actions_LL: LinearLayout by bindView(R.id.user_additional_actions_LL)
    val body_LL: LinearLayout by bindView(R.id.body_LL)
    val user_status_LL: LinearLayout by bindView(R.id.user_status_LL)
    val additional_LL: LinearLayout by bindView(R.id.additional_LL)
    val show_reviews_btn_LL: LinearLayout by bindView(R.id.show_reviews_btn_LL)

    //--------------------Images----------------------

    val share_IV: ImageView by bindView(R.id.share_IV)
    val chat_IV: ImageView by bindView(R.id.chat_IV)
    val LU_avatar_IV: CircleImageView by bindView(R.id.LU_avatar_IV)
    val like_IV: ImageView by bindView(R.id.like_IV)
    val LU_stars_IV: ImageView by bindView(R.id.LU_stars_IV)
    val cancel_IV: ImageView by bindView(R.id.cancel_IV)
    val set_image_IV: ImageView by bindView(R.id.set_image_IV)

    val sendMessage_IV: ImageView by bindView(R.id.sendMessage_IV)
    val favorite_IV: ImageView by bindView(R.id.favorite_IV)
    val sendGift_IV: ImageView by bindView(R.id.sendGift_IV)

    //-----------------------TextViews------------------------

    val username_n_age_TV: TextView by bindView(R.id.username_n_age_TV)
    val user_status_TV: TextView by bindView(R.id.user_status_TV)
    val userlocation_TV: TextView by bindView(R.id.userlocation_TV)
    val userinterests_TV: TextView by bindView(R.id.userinterests_TV)
    val userrating_TV: TextView by bindView(R.id.userrating_TV)
    val useraboutyourself_TV: TextView by bindView(R.id.useraboutyourself_TV)
    val userlanguages_TV: TextView by bindView(R.id.userlanguages_TV)

    //----------------------RecyclerViews-----------------------

    val user_photoalbum_RV: RecyclerView by bindView(R.id.user_photoalbum_RV)
    val user_gifts_RV: RecyclerView by bindView(R.id.user_gifts_RV)
    val additional_RV: RecyclerView by bindView(R.id.additional_RV)
    val user_VIP_IV: ImageView by bindView(R.id.user_VIP_IV)
    //--------------------NestedScrollView----------------

    val main_NSV: NestedScrollView by bindView(R.id.main_NSV)

    private var mAdapter: RecyclerView.Adapter<*>? = null
    private var mLayoutManager: RecyclerView.LayoutManager? = null
    fun setUserQuessionaryData(qlist: List<UserQuessionary.Datum>) {
        mAdapter = QuessionaryAdapter(qlist, this)
        additional_RV!!.adapter = mAdapter
    }

    fun getQuessionary(uid: String) {
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.getUserQuesionnaries(GlobalStaticVariables.language_type!!,uid)
        call.enqueue(object : Callback<UserQuessionary.UserAdditionalResponse> {
            override fun onResponse(call: Call<UserQuessionary.UserAdditionalResponse>,
                                    response: Response<UserQuessionary.UserAdditionalResponse>) {
                val test = response.body()
                if (test != null) {
                    val mainPageDataList = response.body().data
                    val statusCode = response.code()
                    var listData = mainPageDataList;
                    if (mainPageDataList != null) {
                        setUserQuessionaryData(mainPageDataList)
                    }
                } else {
                    Toast.makeText(this@UserProfileActivity, "Не удалось получить данные", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<UserQuessionary.UserAdditionalResponse>, t: Throwable) {
                // Log error here since request failed
                Toast.makeText(this@UserProfileActivity, "Error", Toast.LENGTH_SHORT).show();
            }
        })
    }

    fun setGuestToCurrentUser(uid: String) {
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.setGuest(GlobalStaticVariables.language_type!!,uid)
        call.enqueue(object : Callback<UserRateModel.UserLikeResponse> {
            override fun onResponse(call: Call<UserRateModel.UserLikeResponse>,
                                    response: Response<UserRateModel.UserLikeResponse>) {
                val test = response.body()
                if (test != null && test.code == 1) {
                    val mainPageDataList = response.body().data
                } else {

                }
            }

            override fun onFailure(call: Call<UserRateModel.UserLikeResponse>, t: Throwable) {

            }
        })
    }

    val net_status_IV: ImageView by bindView(R.id.net_status_IV)
    val avatar_frame_corner_IV: ImageView by bindView(R.id.avatar_frame_corner_IV)
    val typeConvertor = TypeConvertor(this)
    fun setUserProfileData(user_profile: UserProfileModel.Datum) {
        getQuessionary(user_profile?.userId?.toString()!!)
        user_info_presenter.getUserPhotos(user_profile?.userId?.toString()!!)
        user_info_presenter.getUserGifts(user_profile?.userId?.toString()!!)
        user_name = user_profile.user?.data?.username.toString()
        var userLocationText = String.format("%s, %s", TypeConvertor.staticFuns.getCustomTranslations(user_profile.cityId, Custom_Translation_Types.city),
                TypeConvertor.staticFuns.getCustomTranslations(user_profile.countryId, Custom_Translation_Types.country))
        userlocation_TV.text = userLocationText;

        if (checkUserImage(user_profile.user?.data?.avatar)) {
            net_status_IV.visibility = View.VISIBLE
            if (user_profile?.user?.data?.is_online != null && user_profile?.user?.data?.is_online!!) {
                net_status_IV.setImageResource(R.drawable.icon_online_medium)
            } else {
                net_status_IV.setImageResource(R.drawable.icon_offline_medium)
            }
        } else {
            avatar_frame_corner_IV.visibility = View.GONE
        }

        LU_stars_IV.setImageResource(viewIniter.getUserRatingImage(user_profile.rating?.toInt()))
        var user_age = ""
        username_n_age_TV.text = user_profile.realName

        try {
            user_age = convertDateToAge(user_profile.bornAt!!)
        } catch (ex: Exception) {

        }

        var setUsername = if (user_profile.realName == "") user_name else user_profile.realName

        username_n_age_TV.text = setUsername + ", " + user_age
        //userinterests_TV.text = user_profile.aboutInterests
        //isVip
        userinterests_TV.text = if (user_profile.searchFor == 1) getString(R.string.man) else getString(R.string.girl)
        userrating_TV.text = user_profile?.rating?.toString()
        //useraboutyourself_TV.text = user_profile?.
        try {
            userlanguages_TV.text = typeConvertor.getKeyById(QuessionariesValues::class.java, user_profile.languageId)
        } catch (ex: Exception) {

        }
        if (user_profile.user?.data?.isVip != null && user_profile.user?.data?.isVip!!) {
            user_VIP_IV.visibility = View.VISIBLE
        }

        show_reviews_btn_LL.setOnClickListener {
            var reviewIntent = Intent(this@UserProfileActivity, UserReviewActivity::class.java)
            reviewIntent.putExtra("user_avatar", user_profile.user?.data?.avatar)
            reviewIntent.putExtra("user_real_name", setUsername)
            reviewIntent.putExtra("user_rating", user_profile?.rating?.toDouble())
            reviewIntent.putExtra("user_profile_id", user_profile?.id?.toString())
            startActivity(reviewIntent)
        }
    }

    fun setUserPhotos() {

    }

    var user_name = ""
    var cur_user_id = ""
    var cur_profile_id = ""
    val questions_with_keys_group_id_list = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val user_info_presenter = UserProfilePresenter(this, this)
    fun openData(type: String) {
        if (intent.getStringExtra("user_data") == null)
            return
        when (type) {
            OpenTypesBy.all_data -> {
                var data_str = intent.getStringExtra("user_data");
                var container_data = Gson().fromJson(data_str, UserProfileModel.Datum::class.java)
                setUserProfileData(container_data)
                cur_user_id = container_data.userId.toString()
                cur_profile_id = container_data.id.toString()

            }
            OpenTypesBy.profile_id -> {

            }
            OpenTypesBy.user_id -> {
                cur_user_id = intent.getStringExtra("user_data");
                user_info_presenter.getDataBy_UID(cur_user_id);
            }
        }
        user_info_presenter.checkIfThisUserBlocedMe(cur_user_id)
        btnsInit(cur_user_id);
        setGuestToCurrentUser(cur_user_id)
        userInteractionHelper.checkFavorites(cur_user_id) // TODO:CHECK profile or User ID
        sendMessage_IV.setOnClickListener {
            startActivity(Intent(this@UserProfileActivity, ChatActivity::class.java).putExtra("intercular_id", cur_user_id))
        }
        share_IV.setOnClickListener {
            showPreparedToast(this, "Soon")
            // shareUserAcc(container_data.realName, container_data.bornAt,"")
            //TODO:SHARE LINK
        }
        sendGift_IV.setOnClickListener {
            startActivityForResult(Intent(this@UserProfileActivity, GiftsActivity::class.java)
                    .putExtra("type", "select"), 204)
        }
        getUserStatus()
    }

    val me_blocked_LL: LinearLayout by bindView(R.id.me_blocked_LL)
    val user_social_actions: LinearLayout by bindView(R.id.user_social_actions)
    val image_view_wrapper: LinearLayout by bindView(R.id.image_view_wrapper)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)
        setToolbar(this,
                getString(R.string.my_profile),
                findViewById<TextView>(R.id.tv_map) as TextView,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView,
                true)

        API_Client.apiService!!.cheUserBands().enqueue(object : Callback<CheckUserBands> {
            override fun onFailure(call: Call<CheckUserBands>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<CheckUserBands>?, response: Response<CheckUserBands>?) {
                var data_str = intent.getStringExtra("user_data");
                var container_data = Gson().fromJson(data_str, UserProfileModel.Datum::class.java)
                if (response != null) {




                    try {
                        var checkUserBands: CheckUserBands = response.body()
                        for (i in response.body().data.indices)
                            if (GlobalStaticVariables.myId == checkUserBands.data[i].acted_user_id &&
                                    container_data?.userId == checkUserBands.data[i].owner_user_id
                            ) {

                                cancel_IV.setImageResource(R.drawable.canceled_btn)
                            } else {
                                cancel_IV.setImageResource(R.drawable.cancel_btn)
                            }
                    }catch (ex:Exception){

                    }
















                    }
                }

        })



        additional_RV!!.isNestedScrollingEnabled = false
        mLayoutManager = LinearLayoutManager(this@UserProfileActivity)
        additional_RV!!.layoutManager = mLayoutManager
        var snapHelper = LinearSnapHelper();
        snapHelper.attachToRecyclerView(user_photoalbum_RV);
        user_photoalbum_RV.addItemDecoration(PaddingItemDecoration(dpToPx(50)));
        user_photoalbum_RV.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL, false)
        var opentype = intent.getStringExtra("open_type")
        openData(opentype);

        findViewById<ImageView>(R.id.report_IV).setOnClickListener {
            showReportDialog();
        }
        //user_testData.text = container_data.email + "/ " + container_data.phone + " / "+ container_data.username + " / "+ container_data.updatedAt;
        // init_raw_data(container_data)
        // getData(container_data.id.toString());

    }

    fun showReportDialog() {
        val dialogFrag = ReportDialogFragment.newInstance(cur_user_id, "user")
        dialogFrag.show(supportFragmentManager, "dialogFragmentChangePassword")
    }

    fun getUserStatus() {
        val apiService = API_Client.client!!.create(API_Interface::class.java)

        val call = apiService.getUserStatus(GlobalStaticVariables.language_type!!,cur_user_id.toString())
        call.enqueue(object : Callback<UserStatusModel.GetUserStatusResponse> {
            override fun onFailure(call: Call<UserStatusModel.GetUserStatusResponse>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<UserStatusModel.GetUserStatusResponse>?, response: Response<UserStatusModel.GetUserStatusResponse>?) {
                if (response?.body() != null && response.body()?.data != null && response.body()?.data?.isNotEmpty()!!) {
                    user_status_TV.text = String.format(getString(R.string.status) + ": %s", response?.body()?.data?.firstOrNull()?.content);
                }
            }

        })

    }

    fun shareUserAcc(UserName: String?, BornDate: String?, LinkToUser: String) {
        try {
            var user_age = ""
            try {
                user_age = convertDateToAge(BornDate!!)
            } catch (ex: Exception) {

            }
            val i = Intent(Intent.ACTION_SEND)
            i.type = "text/plain"
            i.putExtra(Intent.EXTRA_SUBJECT, "Eromance")
            var sAux = "\n " + UserName + ", " + user_age + "\n\n"
            sAux = sAux + LinkToUser + "\n\n"
            i.putExtra(Intent.EXTRA_TEXT, sAux)
            startActivity(Intent.createChooser(i, getString(R.string.select)))
        } catch (e: Exception) {
            //e.toString();
        }
    }

    var favStatus: Int? = 0;
    var fav_id = -1;
    fun btnsInit(uid: String?) {
        favorite_IV.isClickable = false;
        favorite_IV.setOnClickListener {
            if (isFavProcessing) {
                showPreparedToast(this, "Wait")
                return@setOnClickListener
            } else {
                isFavProcessing = true;
            }
            if (favStatus == 0) {
                userInteractionHelper.favorite_action(uid!!, false)
            } else {
                if (fav_id != -1)
                    userInteractionHelper.favorite_action(fav_id = fav_id.toString(), isNeedToRemove = true)
            }
        }
        userRate_Init(uid)
    }

    val userInteractionHelper = UserInteractionHelper(this, this);
    var likeState = -1;
    var isLikeProcessing = false;
    fun userRate_Init(uid: String?) {
        setBts(false)
        like_IV.tag = 1;
        cancel_IV.tag = 0;
        checkLikeState(uid)
        var likeClickListener = View.OnClickListener { v ->
            var rate_type = v.tag.toString();
            if (isLikeProcessing) {
                showPreparedToast(this, "Wait")
            } else {
                if (likeState != -1 && likeState == rate_type.toInt()) {
                    userInteractionHelper.setRateToUser(uid!!, true, rate_type)
                } else {
                    userInteractionHelper.setRateToUser(uid!!, false, rate_type)
                }
            }
        }
        var blockClickListener = View.OnClickListener { v ->

            API_Client.apiService!!.cheUserBands().enqueue(object : Callback<CheckUserBands> {
                override fun onFailure(call: Call<CheckUserBands>?, t: Throwable?) {

                }

                override fun onResponse(call: Call<CheckUserBands>?, response: Response<CheckUserBands>?) {
                    var data_str = intent.getStringExtra("user_data");
                    var container_data = Gson().fromJson(data_str, UserProfileModel.Datum::class.java)
                    var checkUserBands: CheckUserBands = response!!.body()
                    if (response != null) {
                        for (i in response.body().data!!.indices)
                            if (GlobalStaticVariables.myId == checkUserBands.data[i].acted_user_id &&
                                    container_data?.userId == checkUserBands.data[i].owner_user_id
                            ) {

                                cancel_IV.setImageResource(R.drawable.canceled_btn)
                            } else {
                                cancel_IV.setImageResource(R.drawable.cancel_btn)
                            }

                    }
                }

            })



            var data_str = intent.getStringExtra("user_data");
            var container_data = Gson().fromJson(data_str, UserProfileModel.Datum::class.java)
            API_Client.apiService!!.blockUser(container_data.userId!!, GlobalStaticVariables.myId!!).enqueue(object : Callback<Code> {
                override fun onFailure(call: Call<Code>?, t: Throwable?) {

                    Toast.makeText(this@UserProfileActivity, getString(R.string.error), Toast.LENGTH_LONG).show()
                }

                override fun onResponse(call: Call<Code>?, response: Response<Code>?) {


                    Toast.makeText(this@UserProfileActivity, getString(R.string.success), Toast.LENGTH_LONG).show()


                }

            })


//            var rate_type = v.tag.toString()
//
//
//              var titleStr ="";
//
//            if(likeState==0){
//
//
//                titleStr= getString(R.string.block_user)
//            }
//            else{
//                titleStr= getString(R.string.block_user)
//
//            }
//
//
//            AlertDialog.Builder(this)
//            .setTitle(getString(R.string.block))
//            .setMessage(titleStr)
//            .setPositiveButton(getString(R.string.yes), DialogInterface.OnClickListener { dialogInterface, i ->
//                if(isLikeProcessing)
//                {
//                    showPreparedToast(this,"Wait")
//                }
//                else {
//                    if (likeState != -1 && likeState == rate_type.toInt()) {
//                        userInteractionHelper.setRateToUser(uid!!, true, rate_type)
//                    } else {
//                        userInteractionHelper.setRateToUser(uid!!, false, rate_type)
//                    }
//                }
//            }).setNegativeButton("Нет", null).show();
        }
        like_IV.setOnClickListener(likeClickListener)
        cancel_IV.setOnClickListener(blockClickListener)

    }

    fun checkLikeState(uid: String?) {
        isLikeProcessing = true;
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.checkIfLiked(GlobalStaticVariables.language_type!!,uid, GlobalStaticVariables.myId.toString())
        call.enqueue(object : Callback<UserRateModel.UserLikeCheckResponse> {
            override fun onResponse(call: Call<UserRateModel.UserLikeCheckResponse>,
                                    response: Response<UserRateModel.UserLikeCheckResponse>) {
                val test = response.body()
                isLikeProcessing = false;
                if (test != null) {
                    val mainPageDataList = response.body().data
                    if (mainPageDataList != null && mainPageDataList.isNotEmpty()) {
                        var lastAction = mainPageDataList.lastOrNull();
                        if (lastAction?.isLiked != null) {
                            likeState = if (lastAction?.isLiked == false) 0 else 1
                            if (lastAction?.isLiked == false) {
                                onDisliked()
                            } else
                                onLiked()
                        }
                    } else {
                        onRemoved()
                    }
                } else {
                    finish()
                    Toast.makeText(this@UserProfileActivity, getString(R.string.error_data), Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<UserRateModel.UserLikeCheckResponse>, t: Throwable) {
                // Log error here since request failed
                Toast.makeText(this@UserProfileActivity, getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })
    }

    fun setImage(imagePath: String? = null) {
        Glide.with(this).load(if (imagePath != null) imagePath else R.drawable.noavatar2).asBitmap().centerCrop().into(object : BitmapImageViewTarget(LU_avatar_IV) {
            override fun setResource(resource: Bitmap) {
                val circularBitmapDrawable = RoundedBitmapDrawableFactory.create(resources, resource)
                circularBitmapDrawable.isCircular = true
                LU_avatar_IV.setImageDrawable(circularBitmapDrawable)
            }
        })

    }

    fun checkUserImage(userAvatar: String?): Boolean {
        LU_avatar_IV.visibility = ViewGroup.GONE
        hide_user_avatar_LL.visibility = ViewGroup.GONE

        if (myData?.avatar != null) {
            if (userAvatar != null && checkImage(userAvatar)) {
                setImage(GlobalVariables.server_url + userAvatar);
            } else {
                setImage();
            }
            LU_avatar_IV.visibility = ViewGroup.VISIBLE
            image_view_wrapper.setOnClickListener {
                openImageViewer(this, GlobalVariables.server_url + userAvatar)
            }
            return true
        } else {
            hide_user_avatar_LL.visibility = ViewGroup.VISIBLE
            set_image_IV.setOnClickListener {
                startActivity(Intent(this@UserProfileActivity, AddAlbumActivity::class.java))
            }
            return false
        }
    }

    fun init_raw_data(userData: UserProfileModel.Datum) {
        username_n_age_TV.text = userData.user?.data?.username
        user_name = userData.user?.data?.username.toString()
        checkUserImage(userData.user?.data?.avatar)
    }
}
