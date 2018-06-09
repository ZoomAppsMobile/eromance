package com.zoomapps.eromance.Activities

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.zoomapps.eromance.Adapters.ReviewListAdapter
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Helpers.UserReviewPresenter
import com.zoomapps.eromance.Interfaces.IUserReviewsView
import com.zoomapps.eromance.Models.ReviewModel

import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView
import kotterknife.bindView
import java.util.*

class UserReviewActivity : AppCompatActivity(),IUserReviewsView {
    override fun <T> onReviewSend(out: T) {
        showPreparedToast(this,getString(R.string.success))
        val data = (out as ReviewModel.SendReviewResponse)
        if(data!=null && data?.data!=null)
              addDataToRV(data?.data!!)
    }

    override fun onReviewSendError() {
        showPreparedToast(this,getString(R.string.error))
    }

    override fun onReviewLoadError() {
        showPreparedToast(this,getString(R.string.error))
    }

    override fun <T> onReviewsLoaded(out: T) {
        if(listLoaded==false) listLoaded = true
        var data = out as ReviewModel.GetReviewResponse;
        if(data.data!=null)
            setRV(data.data!!)
    }
    fun addDataToRV(item_data:ReviewModel.GetReviewResponseDatum){
        if(data_list==null || mAdapter==null)
            return
        data_list?.add(item_data)
        mAdapter?.notifyDataSetChanged()
    }
    fun setRV(datalist:List<ReviewModel.GetReviewResponseDatum> ){
        if(data_list == null)
            data_list = ArrayList<ReviewModel.GetReviewResponseDatum>()
        data_list?.addAll(datalist)
        if(mAdapter==null) {
            mAdapter = ReviewListAdapter(data_list, this)
            user_reviews_RV.adapter = mAdapter
        }
        else{
            mAdapter?.notifyDataSetChanged()
        }
    }


    val presenter = UserReviewPresenter(this,this)
    var currentEntitiyId:String?=""
    var mAdapter: RecyclerView.Adapter<*>?=null
    var data_list:MutableList<ReviewModel.GetReviewResponseDatum>?=null

    val main_user_CIV : CircleImageView by bindView(R.id.main_user_CIV)
    val main_username_TV : TextView by bindView(R.id.main_username_TV)
    val user_rating_IV : ImageView by bindView(R.id.user_rating_IV)
    val user_reviews_RV : RecyclerView by bindView(R.id.user_reviews_RV)
    val send_review_IV : ImageView by bindView(R.id.send_review_IV)
    val send_review_ET : EditText by bindView(R.id.send_review_ET)
    var listLoaded : Boolean = false
    var isPlace = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_review)
        setToolbar(this ,
                "Отзывы",
                findViewById<TextView>(R.id.tv_map) as TextView,
                findViewById<ImageView>(R.id.custom_toolbar_home_btn) as ImageView ,
                true)
        currentEntitiyId = intent.getStringExtra("user_profile_id")
        if(currentEntitiyId ==null || currentEntitiyId ==""){
            currentEntitiyId  = intent.getStringExtra("place_id")
            isPlace = true
        }
        if(currentEntitiyId ==null || currentEntitiyId ==""){
            showPreparedToast(this,getString(R.string.error))
            finish()
            return
        }
        val fab = findViewById<FloatingActionButton>(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        user_reviews_RV.layoutManager = LinearLayoutManager(this)
        presenter.setUserDataToView(main_user_CIV,main_username_TV,user_rating_IV,intent)
        presenter.loadReviews(currentEntitiyId!!,isPlace)

        send_review_IV.setOnClickListener {
            if(listLoaded){
                var content_text = send_review_ET.text.toString()
                presenter.sendReview(content_text, currentEntitiyId!!,isPlace)
                runOnUiThread {
                    send_review_ET.text=null
                }
            }
            else{
                showPreparedToast(this,"Wait")
            }
        }
    }

}
