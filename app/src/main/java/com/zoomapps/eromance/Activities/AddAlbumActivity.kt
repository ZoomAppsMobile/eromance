package com.zoomapps.eromance.Activities

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.google.gson.Gson
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.API.TestKotlin
import com.zoomapps.eromance.Adapters.ImageListAdapter
import com.zoomapps.eromance.Controllers.*
import com.zoomapps.eromance.DialogFragment.DialogFragmentInteraction
import com.zoomapps.eromance.DialogFragment.EditStatusDialogFragment
import com.zoomapps.eromance.DialogFragment.PaymentDialogFragment
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Models.PaymentModel
import com.zoomapps.eromance.Models.UserPhotosModel

import com.zoomapps.eromance.R
import kotterknife.bindView
import okhttp3.MediaType
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File
import java.io.IOException
import kotlin.collections.ArrayList
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageView


class AddAlbumActivity : AppCompatActivity(), DialogFragmentInteraction {


    override fun onOkPressed(content: String?, code: Int) {
        var call = PaymentController.getInstance().makeRequest(PaymentController.PaymentTypes.PHOTO)
        call?.enqueue(object : Callback<PaymentModel.PaymentResponseData> {
            override fun onResponse(call: Call<PaymentModel.PaymentResponseData>?, response: Response<PaymentModel.PaymentResponseData>?) {
                if (response?.body()?.data?.amount != null)
                    PaymentController.getInstance().onRequestSuccess(PaymentController.PaymentTypes.PHOTO, response?.body()?.data?.amount!!)
            }

            override fun onFailure(call: Call<PaymentModel.PaymentResponseData>?, t: Throwable?) {
                var test = ""
            }

        })
    }

    var dataList: MutableList<UserPhotosModel.Data>? = null
    var mTopFilterLayoutManager: GridLayoutManager? = null
    private var mAdapter: RecyclerView.Adapter<*>? = null
    private var cropImageView: CropImageView? = null

    val album_images_RV: RecyclerView by bindView(R.id.album_images_RV)
    val feedBack_result_TV: TextView by bindView(R.id.feedBack_result_TV)
    val loading_PG: ProgressBar by bindView(R.id.loading_PG)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_album)
        setToolbar(this,
                getString(R.string.photo_album),
                findViewById<TextView>(R.id.tv_map),
                findViewById<ImageView>(R.id.custom_toolbar_home_btn),
                true)

        feedBack_result_TV.visibility = ViewGroup.GONE
        album_images_RV.visibility = ViewGroup.GONE
        loading_PG.visibility = ViewGroup.GONE
        cropImageView = findViewById(R.id.cropImageView)
        album_images_RV!!.isNestedScrollingEnabled = false
        mTopFilterLayoutManager = GridLayoutManager(this@AddAlbumActivity, 2)
        album_images_RV!!.layoutManager = mTopFilterLayoutManager!!
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { view ->
            if (dataList != null) {
//                startActivityForResult(Intent(this@AddAlbumActivity, ImageCropActivity::class.java), 178)


                CropImage.activity()
                        .setGuidelines(CropImageView.Guidelines.ON)
                        .start(this);


            } else if (dataList == null) {
                CropImage.activity()
                        .setGuidelines(CropImageView.Guidelines.ON)
                        .start(this);
            }
            // Раскоментировать
            else if (dataList?.size!! >= GlobalStaticVariables.myData?.profile?.data?.photos_count!!) {
                var dialogFrag =
                        PaymentDialogFragment
                                .newInstance(getString(R.string.upload_albul_payment)
                                        + "\nЦена:" + PaymentController.getInstance()
                                        .getPaymentAmount(PaymentController.getInstance().getIdByKey(PaymentController.PaymentTypes.PHOTO)).toString() + " " + getString(R.string.money))
                dialogFrag.show(supportFragmentManager, "dialogFragmentChangePassword")
//                showToast(this@AddAlbumActivity , "Вы не можете загрузить больше 3 картинок в альбом")
            }
        }
        getData()

    }

    fun processViews(dataList: List<UserPhotosModel.Data>? = null, status: String? = "Success") {
        var isNotEmpty = dataList?.isNotEmpty()
        var statusLoc = status
        if (status == "Success")
            statusLoc = if (dataList?.isNotEmpty()!!) status else "Empty"
        loading_PG.visibility = ViewGroup.GONE
        when (statusLoc) {
            "Failed" -> {
                feedBack_result_TV.visibility = ViewGroup.VISIBLE
                feedBack_result_TV.text = getString(R.string.error_upload_image)
            }
            "Empty" -> {
                // this.dataList = Array
                // List<UserPhotosModel.Data>();
                feedBack_result_TV.visibility = ViewGroup.VISIBLE
                feedBack_result_TV.text = getString(R.string.no_upload_image)
            }
            "Success" -> {
                if (dataList != null) {
                    init_rv(dataList);
                    feedBack_result_TV.visibility = ViewGroup.GONE
                }
            }
        }
    }

    fun init_rv(dataForList: List<UserPhotosModel.Data>) {
        album_images_RV.visibility = ViewGroup.VISIBLE
        dataList = dataForList.toMutableList()
        mAdapter = ImageListAdapter(dataList, this, prepareImageList(dataForList))
        album_images_RV!!.adapter = mAdapter
    }

    fun prepareImageList(dataForList: List<UserPhotosModel.Data>?): Array<String> {
        if (dataForList == null)
            return Array<String>(0, init = { index -> "" })
        val tmpImages = ArrayList<String>()
        for (tmp_data in dataForList) {
            tmpImages.add(GlobalVariables.server_url + tmp_data.image)
        }
        return Array<String>(tmpImages.size, init = { index -> tmpImages.get(index) })
    }

    var isStopped = false;
    override fun onStop() {
        super.onStop()
        isStopped = true
    }

    override fun onResume() {
        super.onResume()
        if (isStopped) {
            getData()
            isStopped = false;
        }
    }

    fun getData() {
        loading_PG.visibility = ViewGroup.VISIBLE
        val apiService = API_Client.client!!.create(API_Interface::class.java)
//        val call = apiService.getUserPhotos(GlobalStaticVariables.myId.toString())
        val call = apiService.getUserPhotos(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId.toString())
        call.enqueue(object : Callback<UserPhotosModel.UserGetPhotosResponse> {
            override fun onResponse(call: Call<UserPhotosModel.UserGetPhotosResponse>,
                                    response: Response<UserPhotosModel.UserGetPhotosResponse>) {
                val mainPageDataList = response.body().data
                if (mainPageDataList != null) {
                    val statusCode = response.code()
                    var listData = mainPageDataList;
                    processViews(listData);
                } else {
                    processViews(mainPageDataList)
                    Toast.makeText(this@AddAlbumActivity, getString(R.string.no_get_data), Toast.LENGTH_SHORT).show()
                    loading_PG.visibility = ViewGroup.GONE;

                }
            }

            override fun onFailure(call: Call<UserPhotosModel.UserGetPhotosResponse>, t: Throwable) {
                // Log error here since request failed
                processViews(status = "Failed")
                Toast.makeText(this@AddAlbumActivity, "Error", Toast.LENGTH_SHORT).show();
                loading_PG.visibility = ViewGroup.GONE;
            }

        })

    }


    fun processImage(image_uri: Uri) {
        //   var new_bmp_image = MediaStore.Images.Media.getBitmap(getContentResolver() , image_uri);
        showPreparedToast(this@AddAlbumActivity, "Loading");
        loading_PG.visibility = View.VISIBLE;
        uploadAvatar(image_uri)
    }

    fun uploadAvatar(imageUri: Uri) {
        val file = File(getPath(this, imageUri))
        val fbody = RequestBody.create(MediaType.parse("image/*"), file)

        MyProfileActivity.UploadService()?.uploadImage(file, file.name, "http://185.146.1.72:8080/api/v1/ru/user_photos?user_id=" + GlobalStaticVariables.myId?.toString(), object : okhttp3.Callback {
            override fun onFailure(call: okhttp3.Call?, e: IOException?) {
                loading_PG.visibility = View.GONE;
                var error = ""
            }

            override fun onResponse(call: okhttp3.Call?, response: okhttp3.Response?) {
//                loading_PG.visibility = View.GONE;
                if (response != null && response.isSuccessful) {
                    val responseStr = response.body()?.string()
                    val container2 = Gson().fromJson(responseStr, UserPhotosModel.UserPhotosResponse::class.java)
                    if (container2 == null || container2.code != 1) {
                        runOnUiThread {
                            showPreparedToast(this@AddAlbumActivity, "Error")
                            loading_PG.visibility = View.GONE;
                        }
                    } else {
                        runOnUiThread {
                            if (dataList == null)
                                dataList = ArrayList<UserPhotosModel.Data>()
                            dataList?.add(container2.data!!)
                            if (mAdapter == null) {
                                mAdapter = ImageListAdapter(dataList, this@AddAlbumActivity, prepareImageList(dataList))
                                album_images_RV!!.adapter = mAdapter
                            } else
                                mAdapter?.notifyDataSetChanged()
                            showPreparedToast(this@AddAlbumActivity, "Success");
                            loading_PG.visibility = ViewGroup.GONE;
                            getData()
                        }
                    }
                    // Do what you want to do with the response.
                } else {
                    try {
                        val responseStr = response!!.body()?.string()
                    } catch (ex: Exception) {

                    }
                    // Request not successful
                }
            }
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        //if (resultCode == Activity.RESULT_OK) {

        // }
//            val selectedImageUri = data?.getStringExtra("result");
//            if (data == null || selectedImageUri == null)
//                showPreparedToast(this, "Response");
//            else {
//                isStopped = false;
//                Log.e("selectedImageUri", Uri.parse(selectedImageUri.toString()).toString())
//                processImage(Uri.parse(selectedImageUri))
//            }
//
//
//        }
        //}


        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            val result = CropImage.getActivityResult(data)
            if (resultCode == Activity.RESULT_OK) {
                val resultUri = result.uri
                isStopped = false;
                Log.e("selectedImageUri", resultUri.toString())
                processImage(resultUri);


            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                val error = result.error
            }
        }


    }


}
