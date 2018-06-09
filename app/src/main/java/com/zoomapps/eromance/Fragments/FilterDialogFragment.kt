package com.zoomapps.eromance.Fragments
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v4.app.DialogFragment;
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.*
import android.widget.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Adapters.TopFilterAdapter
import com.zoomapps.eromance.Interfaces.MapDialogInterface
import com.zoomapps.eromance.Models.LocationTypes
import com.zoomapps.eromance.Models.MapModels
import com.zoomapps.eromance.Models.MapsModels
import com.zoomapps.eromance.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*


class FilterDialogFragment : DialogFragment() , CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        when(p0?.id){
            R.id.woman_CB->{
                if(p1)
                    (activity as MapDialogInterface).setSex(1)
                else
                    (activity as MapDialogInterface).removeSex(1)
            }
            R.id.men_CB->{
                if(p1)
                    (activity as MapDialogInterface).setSex(2)
                else
                    (activity as MapDialogInterface).removeSex(2)
            }

        }
    }

    private var men_CB: CheckBox? = null
    private var woman_CB: CheckBox? = null
    private var top_filter_RV : RecyclerView ?=null
    private var send_btn : Button ?=null
    private var cancel_btn : Button ?=null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_filter_dialog, container)
    }
    fun setCheckedSex(){
//        if((activity as MapDialogInterface).checkSex(2))
//            woman_CB?.isChecked = true
//        if((activity as MapDialogInterface).checkSex(1))
//            men_CB?.isChecked = true
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable( ColorDrawable(Color.TRANSPARENT));
        setStyle(DialogFragment.STYLE_NO_FRAME, android.R.style.Theme);
        men_CB = view?.findViewById<CheckBox>(R.id.men_CB) as CheckBox
        woman_CB = view?.findViewById<CheckBox>(R.id.woman_CB) as CheckBox
        setCheckedSex();
        men_CB?.setOnCheckedChangeListener(this)
        woman_CB?.setOnCheckedChangeListener(this)
        top_filter_RV = view?.findViewById<RecyclerView>(R.id.top_filter_RV) as  RecyclerView
        send_btn= view?.findViewById<Button>(R.id.send_btn) as  Button
        cancel_btn= view?.findViewById<Button>(R.id.cancel_btn) as  Button
        // Fetch arguments from bundle and set title
        init_top_filter_view();
        dialog.window!!.setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
    }

    var mTopFilterAdapter: RecyclerView.Adapter<*>? = null
    private var mTopFilterLayoutManager: GridLayoutManager? = null
    fun init_top_filter_view(){
        top_filter_RV!!.isNestedScrollingEnabled = false
        mTopFilterLayoutManager = GridLayoutManager(context,3)
        top_filter_RV!!.layoutManager = mTopFilterLayoutManager

        var filterData = filterList()
        mTopFilterAdapter = TopFilterAdapter(filterData,context)
        top_filter_RV!!.adapter = mTopFilterAdapter

        send_btn?.setOnClickListener{
            (activity as MapDialogInterface).setDialogResult();
            dismiss();
        }
        cancel_btn?.setOnClickListener {

            dismiss();
        }

    }
//    fun filterList(): MutableList<MapsModels.FilterItems>
//    {
//        var dataList = ArrayList<MapsModels.FilterItems>()
//        var indexList:MutableList<Int> = mutableListOf()
//        //val indexList = listOf(0,1,2,3,4,5)
//        val apiService = API_Client.client!!.create(API_Interface::class.java)
//        val call = apiService.getLocationType()
//        call.enqueue(object : Callback<LocationTypes> {
//            override fun onResponse(call: Call<LocationTypes>, response: Response<LocationTypes>) {
//                Toast.makeText(context, response.body().data[0].value, Toast.LENGTH_LONG).show()
//                repeat(response.body().data.size) { i ->
//                    indexList!!.add(response.body().data[i].id)
//                    Log.e("list", "${response.body().data[i].id}")
//                }
//            }
//            override fun onFailure(call: Call<LocationTypes>, t: Throwable) {
//            }
//        })
//        val resourceIndex = listOf(R.drawable.icon_driving ,
//                R.drawable.icon_walking,R.drawable.icon_relaxing,
//                R.drawable.icon_bored,R.drawable.icon_dancing,
//                R.drawable.icon_movie)
//        val textIndex = listOf(getString(R.string.skating),getString(R.string.walking),getString(R.string.rest),getString(R.string.miss),getString(R.string.dancing),getString(R.string.film))
//
//        for(tmp in indexList){
//            var data_item = MapsModels.FilterItems()
//            data_item.filter_item_text = textIndex.get(tmp)
//            data_item.image_int = resourceIndex.get(tmp)
//            dataList.add(data_item)
//        }
//        return dataList
//    }


    fun filterList(): MutableList<MapsModels.FilterItems>
    {
        var dataList = ArrayList<MapsModels.FilterItems>()
        //var indexList:MutableList<Int> = mutableListOf()
       val indexList = listOf(0,1,2,3,4,5)
//        val apiService = API_Client.client!!.create(API_Interface::class.java)
//        val call = apiService.getLocationType()
//        call.enqueue(object : Callback<LocationTypes> {
//            override fun onResponse(call: Call<LocationTypes>, response: Response<LocationTypes>) {
//                Toast.makeText(context, response.body().data[0].value, Toast.LENGTH_LONG).show()
//                repeat(response.body().data.size) { i ->
//                  //  indexList!!.add(response.body().data[i].id)
//                    Log.e("list", "${response.body().data[i].id}")
//                }
//            }
//            override fun onFailure(call: Call<LocationTypes>, t: Throwable) {
//            }
//        })
        val resourceIndex = listOf(R.drawable.icon_driving ,
                R.drawable.icon_walking,R.drawable.icon_relaxing,
                R.drawable.icon_bored,R.drawable.icon_dancing,
                R.drawable.icon_movie)
        val textIndex = listOf(getString(R.string.skating),getString(R.string.walking),getString(R.string.rest),getString(R.string.miss),getString(R.string.dancing),getString(R.string.film))

        for(tmp in indexList){
            var data_item = MapsModels.FilterItems()
            data_item.filter_item_text = textIndex.get(tmp)
            data_item.image_int = resourceIndex.get(tmp)
            dataList.add(data_item)
        }
        return dataList
    }

    companion object {

        fun newInstance(title: String): FilterDialogFragment {
            val frag = FilterDialogFragment()
            val args = Bundle()
            args.putString("title", title)
            frag.arguments = args
            return frag
        }
    }
}
// Empty constructor is required for DialogFragment
// Make sure not to add arguments to the constructor
// Use `newInstance` instead as shown below
