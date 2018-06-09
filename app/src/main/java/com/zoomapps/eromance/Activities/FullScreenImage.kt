package com.zoomapps.eromance.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.zoomapps.eromance.CustomViews.TouchImageView
import com.zoomapps.eromance.R
import kotterknife.bindView
import android.content.Context
import android.widget.ImageButton
import android.widget.ImageView
import android.content.Intent
import android.graphics.Bitmap
import android.os.AsyncTask
import android.support.v7.widget.*
import android.view.View
import android.widget.ProgressBar
import com.zoomapps.eromance.Adapters.FullImageViewListAdapter
import com.zoomapps.eromance.Controllers.bitmapToUriConverter
import com.zoomapps.eromance.DialogFragment.ReportDialogFragment
import java.lang.ref.WeakReference
import com.zoomapps.eromance.Controllers.dpToPx
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.CustomViews.FullScreenImageSliderRecyclerView
import com.zoomapps.eromance.CustomViews.PaddingItemDecoration
import com.zoomapps.eromance.Helpers.SpaceItemDecoration
import com.zoomapps.eromance.Interfaces.IFullScreenImageView


class FullScreenImage : AppCompatActivity() , IFullScreenImageView {
    override fun onImageLoaded(result: Bitmap?, imgDisplay : TouchImageView,loading_PB: ProgressBar ,pos:Int) {
        if(result!=null) {
            img_bmp?.put(pos,WeakReference(result));
            runOnUiThread {
                imgDisplay.visibility = View.VISIBLE
                loading_PB.visibility = View.GONE
                imgDisplay.setImageBitmap(result)
            }
        }
        else{
            finish()
        }
    }

    var image_path :ArrayList<String>?=null
    val btnClose : ImageButton by bindView(R.id.btnClose)
    val share_IV : ImageView by bindView(R.id.share_IV)
    val report_IV : ImageView by bindView(R.id.report_IV)
    var img_bmp : HashMap<Int,WeakReference<Bitmap>>?=null
   // val imgDisplay : TouchImageView by bindView(R.id.imgDisplay)
    val imageListRV : RecyclerView by bindView(R.id.imageListRV)
    var _ctx : Context = this;
    lateinit var mAdapter : RecyclerView.Adapter<*>
    var current_position = 0
    var imageIds = ArrayList<String>()
    var isImageReportable = true;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_screen_image)
        image_path = ArrayList();
        if(intent.getStringExtra("image_ids")!=null)
            imageIds.add(intent.getStringExtra("image_ids"))
        else if(intent.getStringArrayExtra("image_ids")!=null)
            imageIds.addAll(intent.getStringArrayExtra("image_ids"))
        else
            isImageReportable = false;
        var tmp_imageList =  intent.getStringArrayExtra("image_data")
        if(tmp_imageList==null || tmp_imageList?.size==0){
            image_path?.add(intent.getStringExtra("image_data")!!);
        }
        else{
            for( tmp_image in tmp_imageList){
                image_path?.add(tmp_image)
            }
            current_position = intent.getIntExtra("start_position",0)
        }
        if(image_path?.isEmpty()!!){
            return
        }
     //   AsyncLoadImage().execute(image_path)
        btnClose.setOnClickListener {
           onBackPressed()
        }
        share_IV.setOnClickListener {
            shareImage()
        }
        report_IV.setOnClickListener {
            if(isImageReportable)
                showReportDialog()
            else
                showToast(this,getString(R.string.not_compain_photo))
        }
        img_bmp = HashMap()
        var linLayManager = LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL ,false)
        if(image_path?.size == 1){
            linLayManager = object:LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL ,false){
                override fun canScrollHorizontally(): Boolean {
                    return false;
                }
            }
        }
        imageListRV.layoutManager = linLayManager
        LinearSnapHelper().attachToRecyclerView(imageListRV);
        mAdapter = FullImageViewListAdapter(image_path , this)
        imageListRV.adapter = mAdapter
        imageListRV.scrollToPosition(current_position)
        imageListRV.addOnScrollListener(object: RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val visibleItemCount = recyclerView?.layoutManager?.getChildCount()
                val totalItemCount = recyclerView?.layoutManager?.getItemCount()
                val firstVisibleItemPosition = (recyclerView?.layoutManager as LinearLayoutManager).findFirstVisibleItemPosition()
                current_position = firstVisibleItemPosition;
            }
        })
        //Glide.with(this).load(image_path).asBitmap().into(imgDisplay);
    }
    fun showReportDialog(){
        var dialogFrag= ReportDialogFragment.newInstance(imageIds.get(current_position),"photo")
        dialogFrag.show(supportFragmentManager, "dialogFragmentChangePassword")
    }
    class AsyncLoadImage(val _ctx:Context,
                         val imgDisplay: TouchImageView,val loading_PB :ProgressBar,
                         val pos:Int
                         ,val viewInterface:IFullScreenImageView)
        :AsyncTask<String,Void,Bitmap>()
    {
        override fun doInBackground(vararg p0: String?): Bitmap? {
            try {
                return Glide.with(_ctx).load(p0.get(0)).asBitmap().into(-1, -1).get()
            }
            catch (ex : Exception){
                return null
            }
        }
        override fun onPostExecute(result: Bitmap?) {
            viewInterface.onImageLoaded(result,imgDisplay,loading_PB,pos)
        }

    }


    fun shareImage(){
        if( img_bmp?.get(current_position)?.get() == null)
            return
        val i = Intent(Intent.ACTION_SEND)
        i.type = "image/*"
        var my_bmp =  img_bmp?.get(current_position)?.get()
        if(my_bmp == null)
            return
        var image_uri = bitmapToUriConverter( this , my_bmp!!)
        if(image_uri == null)
            return
        i.putExtra(Intent.EXTRA_STREAM, image_uri)
        try {
            startActivity(Intent.createChooser(i, getString(R.string.share)))
        } catch (ex: android.content.ActivityNotFoundException) {
            ex.printStackTrace()
        }
    }

    override fun onDestroy() {
        System.gc()
        super.onDestroy()
    }
}
