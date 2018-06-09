package com.zoomapps.eromance.Activities

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import com.zoomapps.eromance.R
import com.steelkiwi.cropiwa.CropIwaView
import kotterknife.bindView
import java.net.URI
import android.graphics.Bitmap
import android.util.Log
import android.widget.Toast
import com.steelkiwi.cropiwa.AspectRatio
import com.steelkiwi.cropiwa.config.CropIwaSaveConfig
import com.steelkiwi.cropiwa.config.InitialPosition
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageView
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.MyApplication
import java.io.File
import java.io.File.separatorChar
import java.text.DateFormat
import java.util.*
import java.text.SimpleDateFormat


class ImageCropActivity : AppCompatActivity() {

    lateinit var cropImageView : CropImageView


    val cropView: CropIwaView by bindView(R.id.crop_view)
    var needToCrop = true;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_crop)
        cropImageView = this.findViewById(R.id.cropImageView);

        CropImage.activity()
                .setGuidelines(CropImageView.Guidelines.ON)
                .start(this);









//        needToCrop = intent.getBooleanExtra("needToCrop", true)
//        val toolbar = findViewById<Toolbar>(R.id.toolbar)
//        setSupportActionBar(toolbar)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true);
//        supportActionBar?.setDisplayShowHomeEnabled(true);
//        cropView.configureOverlay()
//                .setAspectRatio(AspectRatio(1, 1))
//                // .setAspectRatio(AspectRatio.IMG_SRC)
//                .setDynamicCrop(false)
//                .apply();
//        cropView.configureImage()
//                .setImageInitialPosition(InitialPosition.CENTER_CROP)
//                .setImageTranslationEnabled(true)
//                .setImageScaleEnabled(true)
//                .apply();
//        cropViewListenerSet();
//        openGallery(this, 502);
//    }
//
//
//    fun setImageToCrop(image_uri: Uri) {
//        runOnUiThread {
//            cropView.setImageUri(image_uri)
//        }
//    }
//
//
//    fun cropViewListenerSet() {
//        cropView.setCropSaveCompleteListener { bitmapUri ->
//            //Do something
//            var test = "tet"
//            runOnUiThread {
//                showPreparedToast(this, "Success");
//                val returnIntent = Intent()
//                returnIntent.putExtra("result", bitmapUri.toString())
//                Log.e("bitmapUri", bitmapUri.toString());
//                setResult(Activity.RESULT_OK, returnIntent)
//                finish()
//            }
//        }
//
//        cropView.setErrorListener { error ->
//            //Do something
//            var test = "tet"
//            runOnUiThread {
//                showPreparedToast(this, "Error");
//            }
//        }
//    }
//
//
//
//    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
//        when (item?.getItemId()) {
//            android.R.id.home -> onBackPressed()
//            R.id.action_confirm -> saveImage()
//        }
//        return super.onOptionsItemSelected(item)
//    }
//
//    fun saveImage() {
//        val date = SimpleDateFormat("yyyy_MM_dd_HHmmss").format(Calendar.getInstance().time)
//        val destinationFilename = android.os.Environment.getExternalStorageDirectory().path + File.separatorChar + date;
//
//        /*  cropView.crop(CropIwaSaveConfig.Builder(Uri.parse(destinationFilename))
//                    .setCompressFormat(Bitmap.CompressFormat.PNG)
//                    .setQuality(100) //Hint for lossy compression formats
//                    .build())*/
//        var builderCV = CropIwaSaveConfig.Builder(createNewEmptyFile()).build();
//        cropView.crop(builderCV);
//        /*cropView.crop(CropIwaSaveConfig.Builder(Uri.parse(destinationFilename))
//                .setCompressFormat(Bitmap.CompressFormat.PNG)
//                .setQuality(100) //Hint for lossy compression formats
//                .build())
//*/
//        //finish()
//    }
//
//    fun createNewEmptyFile(): Uri {
//        return Uri.fromFile(File(GlobalStaticVariables.mAppInstance?.getFilesDir(),
//                System.currentTimeMillis().toString() + ".png"))
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        getMenuInflater().inflate(R.menu.crop_menu, menu);
//        return true;
//    }
//
//    fun openGallery(mContext: Context, req_code: Int, show_text: String? = "Выберите картинку") {
//        val intent = Intent()
//        intent.type = "image/*"
//        intent.action = Intent.ACTION_PICK
//        //intent.action = Intent.ACTION_GET_CONTENT
//        (mContext as Activity).startActivityForResult(Intent.createChooser(intent, show_text), req_code)
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        if (resultCode == Activity.RESULT_OK) {
//            val selectedImageUri = data?.data
//            if (data == null || selectedImageUri == null)
//                return
//            if (needToCrop) {
//                setImageToCrop(selectedImageUri)
//                Log.e("selectedImageBitmap", selectedImageUri.toString());
//
//            } else {
//                Log.e("selectedImageBitmap", selectedImageUri.toString());
//                val returnIntent = Intent()
//                returnIntent.putExtra("result", selectedImageUri.toString())
//                setResult(Activity.RESULT_OK, returnIntent)
//                finish()
//            }
//        }
//    }
//
//    override fun onBackPressed() {
//        val returnIntent = Intent()
//        setResult(Activity.RESULT_CANCELED, returnIntent)
//        finish()
//    }


    }


    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            val result = CropImage.getActivityResult(data)
            if (resultCode == Activity.RESULT_OK) {
                val resultUri = result.uri


                Log.e("resultUri", resultUri.toString());
            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                val error = result.error
            }
        }
    }
}
