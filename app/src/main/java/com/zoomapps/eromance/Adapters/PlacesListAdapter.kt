package com.zoomapps.eromance.Adapters

import android.app.Activity
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zoomapps.eromance.R
import android.widget.*
import com.bumptech.glide.Glide
import com.zoomapps.eromance.Adapters.viewIniter.setUserView
import com.zoomapps.eromance.Models.DictionaryModel
import com.zoomapps.eromance.Models.MapsModels
import com.zoomapps.eromance.Models.MeetsModel
import com.zoomapps.eromance.Models.PlacesModel
import de.hdodenhof.circleimageview.CircleImageView
import java.text.SimpleDateFormat
import java.util.*
import java.text.ParseException
import android.widget.Toast
import android.content.ActivityNotFoundException
import android.support.v4.content.ContextCompat.startActivity
import android.content.Intent
import android.net.Uri
import android.support.v4.content.ContextCompat.startActivity
import com.zoomapps.eromance.Activities.PlacesForRestActivity
import com.zoomapps.eromance.Controllers.TypeConvertor
import com.zoomapps.eromance.Controllers.callToPhone
import com.zoomapps.eromance.Controllers.openMaps
import com.zoomapps.eromance.Models.Types.PlaceTypes

class PlacesListAdapter
(private val mDataset: MutableList<PlacesModel.Datum>?,
 private val mContext: Context?) : RecyclerView.Adapter<PlacesListAdapter.ViewHolder>() {
    inner class ViewHolder(var myView: View) : RecyclerView.ViewHolder(myView) {
        var main_item_container :LinearLayout ? = null
        var vip_image_container :LinearLayout ? = null
        var place_title_TV :TextView ? = null
        var place_type_TV :TextView ? = null
        var place_menu_TV :TextView ? = null
        var average_check_TV :TextView ? = null
        var opening_hourTV :TextView ? = null
        var telephoneTV :TextView ? = null
        var siteRecreationTV :TextView ? = null
        var adressRecreationTV :TextView ? = null
        var  callToPlace_IV :ImageView ? = null
        var showPlaceOnMap_IV :ImageView ? = null
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.place_item_for_list, parent, false)

        val vh = ViewHolder(v)
        vh.main_item_container = v.findViewById<LinearLayout>(R.id.main_item_container) as LinearLayout
        vh.vip_image_container = v.findViewById<LinearLayout>(R.id.vip_image_container) as LinearLayout
        vh.place_title_TV = v.findViewById<TextView>(R.id.place_title_TV) as TextView
        vh.place_type_TV = v.findViewById<TextView>(R.id.place_type_TV) as TextView
        vh.place_menu_TV = v.findViewById<TextView>(R.id.place_menu_TV) as TextView
        vh.average_check_TV = v.findViewById<TextView>(R.id.average_check_TV) as TextView
        vh.opening_hourTV = v.findViewById<TextView>(R.id.opening_hourTV) as TextView
        vh.telephoneTV = v.findViewById<TextView>(R.id.telephoneTV) as TextView
        vh.siteRecreationTV = v.findViewById<TextView>(R.id.siteRecreationTV) as TextView
        vh.adressRecreationTV = v.findViewById<TextView>(R.id.adressRecreationTV) as TextView
        vh.showPlaceOnMap_IV = v.findViewById<ImageView>(R.id.showPlaceOnMap_IV) as ImageView
        return vh
    }
   fun placeTypeConverter(type_id_val:Int?=-1):String{
       return TypeConvertor(mContext!!).getKeyById(PlaceTypes::class.java ,type_id_val)!!
   }
    fun getColorValue(ci:Int):Int
    {
        return mContext?.resources?.getColor(ci)!!
    }
    fun openPlace(place_id:String? ){
        if(place_id == null || place_id.isEmpty())
            return
        (mContext as Activity).startActivity(Intent(mContext , PlacesForRestActivity::class.java).putExtra("place_id",place_id));

    }
    override fun onBindViewHolder(h: ViewHolder, position: Int) {
        if (mDataset?.get(position) != null) {
            var cd = mDataset?.get(position);

            h.main_item_container?.tag=cd?.id;
            h.main_item_container?.setOnClickListener { v->
                var curTag = v.tag;
                openPlace(curTag.toString());
            }
            h.place_title_TV?.text = cd?.name;
//            h.place_type_TV?.text = placeTypeConverter(cd?.typeId);
            h.place_menu_TV?.text = cd?.food;

            if(cd?.isVip!!){
                //background_material_b
               h. main_item_container?.setBackgroundResource(R.drawable.bg_grad)
                h.vip_image_container?.visibility = ViewGroup.VISIBLE;
                h.place_title_TV?.setTextColor(getColorValue(R.color.white))
                h.place_type_TV?.setTextColor(getColorValue(R.color.white))
                h.place_menu_TV?.setTextColor(getColorValue(R.color.white))
            }
            else{
                h. main_item_container?.setBackgroundColor(getColorValue(R.color.white))
                h.vip_image_container?.visibility = ViewGroup.GONE;
                h.place_title_TV?.setTextColor(getColorValue(R.color.golden))
                h.place_type_TV?.setTextColor(getColorValue(R.color.golden))
                h.place_menu_TV?.setTextColor(getColorValue(R.color.background_material_b))
            }
            h.average_check_TV?.text = cd?.averegPrice.toString()
            h.opening_hourTV?.text =cd?.hourFrom.toString()+"-"+cd?.hourTo.toString()
            h.telephoneTV?.text =cd?.user?.data?.phone.toString()
            h.siteRecreationTV?.text =cd?.site.toString()
            h.adressRecreationTV?.text =cd?.address.toString()
            h.callToPlace_IV?.tag = "" //cd?.phone.toString()
            h.callToPlace_IV?.setOnClickListener {
                callToPhone(mContext!! ,cd?.user?.data?.phone)
            }
            h.showPlaceOnMap_IV?.tag = cd?.latitude.toString()+"|"+cd?.longitude.toString()+"|"



            //+    cd?.name!!+"+"+if(cd?.typeId!=null) TypeConvertor(mContext!!).getKeyById(PlaceTypes::class.java ,cd?.typeId)!! else "Не указано"; //format  999.99999999
            h.showPlaceOnMap_IV?.setOnClickListener { v->
                var tagInfo = (v as ImageView).tag.toString()
                var latlng_str = tagInfo.split('|');
                //Call
                var lat_double = latlng_str[0].toDouble()
                var lng_double = latlng_str[1].toDouble()
                var text = latlng_str[2].toString()
                openMaps(mContext!!, lat_double,lng_double,text);
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
