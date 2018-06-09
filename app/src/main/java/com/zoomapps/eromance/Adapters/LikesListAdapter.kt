package com.zoomapps.eromance.Adapters

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.Activities.ChatActivity
import com.zoomapps.eromance.Activities.UserProfileActivity
import com.zoomapps.eromance.Controllers.loadImageToIV
import com.zoomapps.eromance.Helpers.OpenTypesBy
import com.zoomapps.eromance.Models.UserRateModel
import com.zoomapps.eromance.R
import retrofit2.Call
import retrofit2.Response

/**
 * Created by User on 13.06.2017.
 */
class LikesListAdapter
(private val mDataset: List<UserRateModel.Datum>?,
 private val mContext: Context?, val type: Int, val view_type: String? = "") : RecyclerView.Adapter<LikesListAdapter.ViewHolder>() {

    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var main_element_container: LinearLayout? = null
        var username_TV: TextView? = null
        var actiontext_TV: TextView? = null
        var date_TV: TextView? = null
        var action_image_IV: ImageView? = null
        var user_avatar_IV: ImageView? = null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_likes_element, parent, false)
        val vh = ViewHolder(v)

        vh.main_element_container = v.findViewById<LinearLayout>(R.id.main_element_container) as LinearLayout
        vh.username_TV = v.findViewById<TextView>(R.id.username_TV) as TextView
        vh.actiontext_TV = v.findViewById<TextView>(R.id.actiontext_TV) as TextView
        vh.date_TV = v.findViewById<TextView>(R.id.date_TV) as TextView
        vh.action_image_IV = v.findViewById<ImageView>(R.id.action_image_IV) as ImageView
        vh.user_avatar_IV = v.findViewById<ImageView>(R.id.user_avatar_IV) as ImageView

        return vh
    }

    fun getActionType() {

    }

    fun setData(data: UserRateModel.Datum, act_TV: TextView, act_IV: ImageView) {
        if (type == 0) {
            if (data.isLiked!!) {
                act_TV.text = "Вам " + "понравилось"
                act_IV.setImageResource(R.drawable.liked_btn)
            } else {
                //   act_TV.text = "Вас " + "заблокировали"
                //  act_IV.setImageResource(R.drawable.canceled_btn)
            }
        } else if (type == 1) {
            act_TV.text = "Вы добавили в " + "избранное"
            act_IV.setImageResource(R.drawable.star)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (mDataset?.get(position) != null) {
            var cd = mDataset?.get(position);
            holder.username_TV?.text = cd?.owner?.data?.profile?.data?.realName;
            loadImageToIV(mContext!!, holder.user_avatar_IV!!, cd?.owner?.data?.avatar)
            setData(cd!!, holder.actiontext_TV!!, holder.action_image_IV!!)

            holder.user_avatar_IV!!.setOnClickListener({
                mContext?.startActivity(Intent(mContext!!, UserProfileActivity::class.java)
                        .putExtra("user_data", mDataset?.get(position)?.ownerUserId?.toString())
                        .putExtra("open_type", OpenTypesBy.user_id));
            })

            if(type == 1){
                holder.action_image_IV!!.setOnClickListener({
                    var call = API_Client.apiService!!.removeFromFavorites(mDataset?.get(position)?.id.toString())
                    call.enqueue(object : retrofit2.Callback<UserRateModel.LikesListResponse> {
                        override fun onResponse(_call: Call<UserRateModel.LikesListResponse>?, response: Response<UserRateModel.LikesListResponse>?) {
                            var data = response?.body();
                            Toast.makeText(mContext,mContext.getString(R.string.success_delete) , Toast.LENGTH_LONG).show()
                            notifyDataSetChanged();
                        }
                        override fun onFailure(_call: Call<UserRateModel.LikesListResponse>?, t: Throwable?) {

                        }

                    })

                })
            }


        }

    }

    override fun getItemCount(): Int {
        return mDataset?.size!!
    }


}
/**
 * Created by User on 28.02.2017.
 */
