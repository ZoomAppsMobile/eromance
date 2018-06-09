package com.zoomapps.eromance.Activities


import android.Manifest
import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.Application
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.VectorDrawable
import android.location.Location
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.support.annotation.StringRes
import android.support.design.widget.BottomSheetBehavior
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.ActivityCompat
import android.support.v4.app.FragmentManager
import android.support.v4.content.ContextCompat
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.*
import com.bumptech.glide.Glide

import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.GooglePlayServicesUtil
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.location.LocationListener
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.zoomapps.eromance.API.API_Client
import com.zoomapps.eromance.API.API_Interface
import com.zoomapps.eromance.Adapters.MapBottomUserListAdapter
import com.zoomapps.eromance.Adapters.Map_Bottom_SetPoints_Adapter
import com.zoomapps.eromance.Adapters.RecyclerViewToolbar
import com.zoomapps.eromance.Adapters.TopFilterAdapter
import com.zoomapps.eromance.BaseActivity
import com.zoomapps.eromance.Controllers.setToolbar
import com.zoomapps.eromance.Controllers.showPreparedToast
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.Fragments.FilterDialogFragment
import com.zoomapps.eromance.Helpers.CustomRecyclerView
import com.zoomapps.eromance.Helpers.GlobalStaticVariables
import com.zoomapps.eromance.Helpers.MenuClickListener
import com.zoomapps.eromance.Helpers.MenuData_Setter
import com.zoomapps.eromance.Interfaces.MapDialogInterface
import com.zoomapps.eromance.Models.*
import com.zoomapps.eromance.MyApplication
import com.zoomapps.eromance.R
import de.hdodenhof.circleimageview.CircleImageView
import kotterknife.bindView
import permissions.dispatcher.*

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.net.URLEncoder

import java.util.ArrayList

@RuntimePermissions
class MapsActivity : BaseActivity(), GoogleMap.OnMapClickListener,
        OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        LocationListener, MapDialogInterface, GoogleMap.OnMarkerClickListener {
    var checkedSex:Int? = null

    override fun setDialogResult() {
       getMarkers(true, checkedTypesList, checkedSex)
    }


    // Go
    @NeedsPermission(Manifest.permission.ACCESS_FINE_LOCATION)
    fun showCamera() {
        mGoogleApiClient = GoogleApiClient.Builder(this)
                .addApi(LocationServices.API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build();
    }


    // Пользователь разришил
    @OnPermissionDenied(Manifest.permission.ACCESS_FINE_LOCATION)
    fun onCameraDenied() {
        mGoogleApiClient = GoogleApiClient.Builder(this)
                .addApi(LocationServices.API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build()
    }


    // Почему требуеться разришение
    @OnShowRationale(Manifest.permission.ACCESS_FINE_LOCATION)
    fun showRationaleForCamera(request: PermissionRequest) {
        showRationaleDialog("101", request)
    }


    // никогда не спрашивает снова
    @OnNeverAskAgain(Manifest.permission.ACCESS_FINE_LOCATION)
    fun onCameraNeverAskAgain() {
        mGoogleApiClient = GoogleApiClient.Builder(this)
                .addApi(LocationServices.API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build();
    }


    private fun showRationaleDialog(messageResId: String, request: PermissionRequest) {
        AlertDialog.Builder(this)
                .setPositiveButton(getString(R.string.allow)) { _, _ -> request.proceed() }
                .setNegativeButton(getString(R.string.dont_allow)) { _, _ -> request.cancel() }
                .setCancelable(false)
                .setMessage(messageResId)
                .show()
    }


    var checkedTypesList = ArrayList<Int>()

    override fun setType(type: Int) {
        checkedTypesList.add(type)
        Log.e("checkedSex", "${type}")
    }

    override fun removeType(type: Int) {
        checkedTypesList.remove(type)
    }

    override fun checkType(type: Int): Boolean {
        return checkedTypesList.contains(type)
    }


    override fun setSex(type: Int) {
       // checkedSex.add(type)
        if(type != null)
              checkedSex = type
        else
            checkedSex = null
    }

    override fun removeSex(type: Int) {
        //checkedSex.remove(type)
    }

//    override fun checkSex(type: Int): Boolean {
//        return null //checkedSex.contains(type)
//    }

   // var checkedSex = ArrayList<Int>()

    var locationUpdateDelayPast = true
    var isZoomedToMyLocationOnce = false

    fun zoomToMyLocation(p0: LatLng) {
        myMap?.animateCamera(CameraUpdateFactory.newLatLngZoom(p0, 13f));
    }

    val myLastLoc: LatLng? = null
    var isTaskActive: Boolean = false
    var isTrackEnabled = false
    override fun onLocationChanged(p0: Location?) {
        var latlng = LatLng(p0?.latitude!!, p0?.longitude!!)
        if (!isZoomedToMyLocationOnce) {
            isZoomedToMyLocationOnce = true;
            zoomToMyLocation(latlng);
        }
        setMyPointMarker(latlng)
        if (!isTaskActive && isTrackEnabled) {
            startRepeatingTask()
        }
    }

    private val mInterval = 60 * 1000 // 5 seconds by default, can be changed later
    private var mHandler: Handler? = null
    val locationUpdateHandler = LocationUpdateHandler();

    inner class LocationUpdateHandler : Runnable {
        override fun run() {
            try {
                if (isPointSet && userSetMarker != null && userSetMarker?.position != null) {
                    postMarkerPoint(userSetMarker?.position?.latitude.toString(),
                            userSetMarker?.position?.longitude.toString(), true)
                }
            } finally {
                mHandler?.postDelayed(locationUpdateHandler, mInterval.toLong());
            }
//            else if(isPointSet&&!locationUpdateDelayPast){
//                locationUpdateDelayHandler()
//            }
        }


    }

//    fun locationUpdateDelayHandler(){
//        Handler().postDelayed(Runnable {
//            locationUpdateDelayPast = true
//        },60*1000)
//    }

    fun setMyPointMarker(latlng: LatLng) {
        if ((mSelectedMarker == null) || (mSelectedMarker != userSetMarker)) {
            userSetMarker?.remove()
            userSetMarker = myMap!!.addMarker(MarkerOptions()
                    .position(latlng)
                    .title(getString(R.string.you_here))
                    .icon(getImageRes(MARKER_ME)))
            userSetMarker?.tag = GlobalStaticVariables.myId
        }
    }


    @SuppressLint("MissingPermission")
    override fun onConnected(p0: Bundle?) {
        mLocationRequest = LocationRequest.create();
        mLocationRequest?.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        mLocationRequest?.setInterval(1000); // Update location every second


        LocationServices.FusedLocationApi.requestLocationUpdates(
                mGoogleApiClient, mLocationRequest, this);

    }

    override fun onConnectionSuspended(p0: Int) {
    }

    override fun onConnectionFailed(p0: ConnectionResult) {
    }


    internal var asked_once = false
    internal val RQS_GooglePlayServices = 1
    private var myMap: GoogleMap? = null
    internal var menu_btn_sbsed = false
    private var permissionIsGranted = false
    internal var dataSet: ArrayList<String>? = null
    val drawer_layout: DrawerLayout by bindView(R.id.drawer_layout)
    internal var provider: String? = null
    val btnOpenDrawer: RelativeLayout by bindView(R.id.btnOpenDrawer)
    val tv_map: TextView by bindView(R.id.tv_map)

    val types_RV: RecyclerView by bindView(R.id.types_RV)
    val address_ED: EditText by bindView(R.id.address_ED)
    val set_point_btn: Button by bindView(R.id.set_point_btn)
    /* val bottom_view_container : LinearLayout by bindView(R.id.bottom_view_container)
     val bottom_view_LL : LinearLayout by bindView(R.id.bottom_view_LL)
     val make_point_LL : LinearLayout by bindView(R.id.make_point_LL)
     val point_info_RV: RecyclerView by bindView(R.id.point_info_RV)
     val point_info_container: LinearLayout by bindView(R.id.point_info_container)*/
    val filter_container: LinearLayout by bindView(R.id.filter_container)
    val men_CB: CheckBox by bindView(R.id.men_CB)
    val woman_CB: CheckBox by bindView(R.id.woman_CB)
    //val top_filter_RV : RecyclerView by bindView(R.id.top_filter_RV)
    val filter_IV: ImageView by bindView(R.id.filter_IV)

    val send_btn: Button by bindView(R.id.send_btn)
    val cancel_btn: Button by bindView(R.id.cancel_btn)
    var ifFilterOpen = false

    var mTopFilterAdapter: RecyclerView.Adapter<*>? = null
    private var mTopFilterLayoutManager: RecyclerView.LayoutManager? = null
    val myProfile_NAV_LL: LinearLayout by bindView(R.id.myProfile_NAV_LL)
    val searchPair_NAV_LL: LinearLayout by bindView(R.id.searchPair_NAV_LL)
    val momentMeets_NAV_LL: LinearLayout by bindView(R.id.momentMeets_NAV_LL)
    val placesForRest_NAV_LL: LinearLayout by bindView(R.id.placesForRest_NAV_LL)
    val eveningPlans_NAV_LL: LinearLayout by bindView(R.id.eveningPlans_NAV_LL)
    val map_NAV_LL: LinearLayout by bindView(R.id.map_NAV_LL)
    val games_NAV_LL: LinearLayout by bindView(R.id.games_NAV_LL)
    val twentyOne_NAV_LL: LinearLayout by bindView(R.id.twentyOne_NAV_LL)
    val settings_NAV_LL: LinearLayout by bindView(R.id.settings_NAV_LL)
    val cur_username_NAV_TV: TextView by bindView(R.id.cur_username_NAV_TV)
    val cur_country_NAV_TV: TextView by bindView(R.id.cur_country_NAV_TV)
    val cur_city_NAV_TV: TextView by bindView(R.id.cur_city_NAV_TV)
    val cur_coins_NAV_TV: TextView by bindView(R.id.cur_coins_NAV_TV)
    val nav_recyclerView: RecyclerView by bindView(R.id.nav_recyclerView)
    val profile_image_CIV: CircleImageView by bindView(R.id.profile_image_CIV)


    fun setMenuClicks() {
        myProfile_NAV_LL.setOnClickListener(MenuClickListener(this))
        searchPair_NAV_LL.setOnClickListener(MenuClickListener(this));
        momentMeets_NAV_LL.setOnClickListener(MenuClickListener(this));
        placesForRest_NAV_LL.setOnClickListener(MenuClickListener(this));
        eveningPlans_NAV_LL.setOnClickListener(MenuClickListener(this));
        map_NAV_LL.setOnClickListener(MenuClickListener(this));
        games_NAV_LL.setOnClickListener(MenuClickListener(this));
        twentyOne_NAV_LL.setOnClickListener(MenuClickListener(this));
        settings_NAV_LL.setOnClickListener(MenuClickListener(this));
    }

    //--------------------------------


    fun createMarker(latitude: Double, longitude: Double, title: String, snippet: String? = "", sex_id: Int? = 0, user_id: Int?): Marker? {
//         var markerColor = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN);
//         if(sex_id==1) {
//             markerColor = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE);
//         }
//         else if (sex_id==2){
//             markerColor = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED);
//         }
//         if(user_id == GlobalStaticVariables.myId)
//             markerColor = BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW);
//
        var tmpMarker = myMap?.addMarker(MarkerOptions()
                .position(LatLng(latitude, longitude))
                .anchor(0.5f, 0.5f)
                .title(title)
                .snippet(snippet)
                .icon(getImageRes(getTypeByInfo(getSexById(user_id!!), false)!!)))

        tmpMarker?.tag = user_id;

        return tmpMarker
    }

    var allRawMarkerData: List<MapModels.Datum>? = null
    fun getMarkers(isNeedFind: Boolean? = false, filter_types: List<Int>? = null, filter_sex: Int? = null) {
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        var call: Call<MapModels.MapPointsResponse>? = null
        if (!isNeedFind!!) {
            call = apiService.getMapPoints()
        } else {
            if (filter_types == null)
                return
            call = apiService.filterPoints(GlobalStaticVariables.language_type!!,filter_types!!,filter_sex)
        }
        call.enqueue(object : Callback<MapModels.MapPointsResponse> {
            override fun onResponse(call: Call<MapModels.MapPointsResponse>,
                                    response: Response<MapModels.MapPointsResponse>) {
                myMap?.clear()
                if (response.body() == null || response.body().data == null)
                    return
                val mainPageDataList = response.body().data
                if (mainPageDataList != null) {
                    allRawMarkerData = mainPageDataList
                    val statusCode = response.code()
                    for (vmp in mainPageDataList) {
                        try {
                            if (vmp?.user?.data?.id == GlobalStaticVariables.myId) {
                                setMyPointMarker(LatLng(vmp?.latitude?.toDouble()!!,
                                        vmp.longitude?.toDouble()!!))
                                isTrackEnabled = true;
                            } else {
                                createMarker(vmp?.latitude?.toDouble()!!,
                                        vmp.longitude?.toDouble()!!,
                                        vmp.user?.data?.username.toString(),
                                        "",
                                        vmp.user?.data?.profile?.data?.sexId?.toInt(),
                                        vmp.user?.data?.id);
                            }
                        } catch (ex: Exception) {
                        }

                    }
                } else {
                    Toast.makeText(this@MapsActivity, getString(R.string.error_data), Toast.LENGTH_SHORT).show()

                }
            }

            override fun onFailure(call: Call<MapModels.MapPointsResponse>, t: Throwable) {
                // Log error here since request failed
                Toast.makeText(this@MapsActivity, getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })
    }

    val removePoint_BTN: Button by bindView(R.id.removePoint_BTN)
    val create_fab_btn: FloatingActionButton by bindView(R.id.create_fab_btn)
    var bottomUserListData = ArrayList<MapModels.Datum>()
    val mAdapter = MapBottomUserListAdapter(bottomUserListData, this@MapsActivity)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        showCameraWithPermissionCheck()
        //showCameraWithPermissionCheck()



        setToolbar(this,
                getString(R.string.maps),
                findViewById<TextView>(R.id.tv_map),
                findViewById<ImageView>(R.id.custom_toolbar_home_btn),
                false,
                findViewById<DrawerLayout>(R.id.drawer_layout) as DrawerLayout)
        isZoomedToMyLocationOnce = false;

        setMenuClicks()
        mHandler = Handler()
        MenuData_Setter(this).setMenuData(cur_username_NAV_TV, cur_country_NAV_TV,
                cur_city_NAV_TV, cur_coins_NAV_TV, profile_image_CIV,
                (findViewById<RatingBar>(R.id.go_rating) as RatingBar),
                (findViewById<TextView>(R.id.rating_value_TV) as TextView), findViewById<RelativeLayout>(R.id.network_status_container) as RelativeLayout)

        point_users_RV.layoutManager = LinearLayoutManager(this@MapsActivity)
        point_users_RV.adapter = mAdapter
        val myFragmentManager = supportFragmentManager
        val mySupportMapFragment = myFragmentManager.findFragmentById(R.id.google_maps) as SupportMapFragment
        mySupportMapFragment.getMapAsync(this)
        recyclerViewArray()
        init_menu()
        textGradient()
        //bottom_view_LL.visibility = ViewGroup.GONE
        init_bottom_view()
        checkMyPoints()

    }


    fun filterList(): MutableList<MapsModels.FilterItems> {
        var dataList = ArrayList<MapsModels.FilterItems>()
        val indexList = listOf(0, 1, 2, 3, 4, 5)
        val resourceIndex = listOf(R.drawable.icon_driving,
                R.drawable.icon_walking, R.drawable.icon_relaxing,
                R.drawable.icon_bored, R.drawable.icon_dancing,
                R.drawable.icon_movie)

        val textIndex =  MyApplication.applicationContext().resources!!.getStringArray(R.array.textIndex) //listOf(resources.getString(R.string.skating).toString(), resources.getString(R.string.walking).toString(),resources.getString(R.string.rest).toString(), resources.getString(R.string.miss).toString(), resources.getString(R.string.dancing).toString(), resources.getString(R.string.film).toString())
        val resourceIndex2 = listOf(R.drawable.icon_driving_checked,
                R.drawable.icon_walking_checked, R.drawable.icon_relaxing_checked,
                R.drawable.icon_bored_checked, R.drawable.icon_dancing_checked,
                R.drawable.icon_movie_checked)
        for (tmp in indexList) {
            var data_item = MapsModels.FilterItems()
            data_item.filter_item_id = tmp.toString()
            data_item.filter_item_text = textIndex!!.get(tmp)
            data_item.image_int = resourceIndex.get(tmp)
            data_item.image_active_int = resourceIndex2.get(tmp)
            dataList.add(data_item)
        }
        return dataList
    }

    fun startRepeatingTask() {
        isTaskActive = true
        locationUpdateHandler.run()
    }

    fun stopRepeatingTask() {
        isTaskActive = false
        mHandler?.removeCallbacks(locationUpdateHandler)
    }

    fun closeTopView() {
        ifFilterOpen = false
        filter_container.visibility = ViewGroup.GONE
    }

    fun openTopView() {
        ifFilterOpen = true
        filter_container.visibility = ViewGroup.VISIBLE
    }

    /*  fun init_top_filter_view(){
          top_filter_RV!!.isNestedScrollingEnabled = false
          mTopFilterLayoutManager = LinearLayoutManager(this@MapsActivity)
          top_filter_RV!!.layoutManager = mTopFilterLayoutManager

          var filterData = filterList()
          mTopFilterAdapter = TopFilterAdapter(filterData,this)
          top_filter_RV!!.adapter = mTopFilterAdapter

          send_btn.setOnClickListener {
              getFilterIds()
              getMarkers(true , getFilterIds())
              closeTopView()
          }
          cancel_btn.setOnClickListener {
              closeTopView()
          }
          filter_IV.setOnClickListener {
             /* when(ifFilterOpen){
                  true->
                  {
                      closeTopView()
                  }
                  false->
                  {
                      openTopView()
                  }
              }*/
              showFilterDialog();
          }
      }*/
    fun showFilterDialog() {
        var fm = getSupportFragmentManager();
        var filterDialogFragment = FilterDialogFragment.newInstance(getString(R.string.filtr));
        filterDialogFragment.show(fm, "fragment_edit_name");
    }

    var lastState = BottomSheetBehavior.STATE_COLLAPSED;
    var maxBottomSheetHeight = 0;
    val bottomSheet: View by bindView(R.id.bottom_sheet)
    var mBottomSheetBehavior: BottomSheetBehavior<View>? = null
    val user_list_container: LinearLayout by bindView(R.id.user_list_container)
    val point_users_RV: CustomRecyclerView by bindView(R.id.point_users_RV)
    val bottom_RL: RelativeLayout by bindView(R.id.bottom_RL)

    fun init_fab_btn() {
        create_fab_btn.setOnClickListener {
            hideKeyBoard();
            showBottomView(sheetIsActive)
        }
    }

    fun showBottomView(show: Boolean, type: Int = 0) {
        if (show) {
            runOnUiThread {
                mBottomSheetBehavior?.setPeekHeight(maxBottomSheetHeight);

                create_fab_btn.animate().rotation(135f).setDuration(0).start()
                setBottomViewType(type)
                bottomSheet.requestLayout()
            }
        } else {
            runOnUiThread {
                mBottomSheetBehavior?.setPeekHeight(0);
                create_fab_btn.animate().rotation(0f).setDuration(0).start()
                //  user_list_container.visibility = View.GONE
                user_list_container.visibility = View.GONE
                bottom_RL.visibility = View.GONE
                bottomSheet.requestLayout()
            }
        }

        sheetIsActive = !show;

    }

    val setMarkerView = 0
    val userListView = 1
    fun setBottomViewType(viewType: Int) {
        runOnUiThread {
            when (viewType) {
                setMarkerView -> {
                    user_list_container.visibility = View.GONE
                    bottom_RL.visibility = View.VISIBLE
                }
                userListView -> {
                    bottom_RL.visibility = View.GONE
                    user_list_container.visibility = View.VISIBLE
                }
            }
        }
    }

    val REMOVED_UI = 0
    val ADDED_UI = 1
    var bottomUI_type = REMOVED_UI; // 0- add , 1- added
    fun updateBottomUI(newType: Int) {
        runOnUiThread {
            when (newType) {
                REMOVED_UI -> {
                    set_point_btn.text = getString(R.string.add)
                    removePoint_BTN.isClickable = false
                }
                ADDED_UI -> {
                    set_point_btn.text = getString(R.string.update)
                    removePoint_BTN.isClickable = true
                }
            }
        }
        bottomUI_type = newType
    }

    fun hideKeyBoard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    fun init_bottom_view() {

        mBottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)

        mBottomSheetBehavior?.state = lastState;
        maxBottomSheetHeight = mBottomSheetBehavior?.peekHeight!!;
        mBottomSheetBehavior?.setPeekHeight(0);

        mBottomSheetBehavior?.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                //  create_fab_btn.animate().rotation(135f).setDuration(0).start()
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                /*  if (newState == BottomSheetBehavior.STATE_COLLAPSED) {
                      mBottomSheetBehavior?.setPeekHeight(0);
                  }
                  else{
                      mBottomSheetBehavior?.setPeekHeight(350);
                  }*/
            }

        })

        init_TypesRVforSetPoint()
        init_fab_btn();
        set_point_btn.setOnClickListener {
            hideKeyBoard();
            if (filterData.filter { it -> it.filter_item_state == true }.isEmpty()) {
                showToast(this, getString(R.string.select_type))
            } else if (userSetMarker == null) {
                showToast(this, getString(R.string.no_search_current_location))

                // postMarkerPoint("49.80",
                //       "73.10")

            } else {
                showBottomView(false)
                postMarkerPoint(userSetMarker?.position?.latitude.toString(),
                        userSetMarker?.position?.longitude.toString())

            }
        }
        removePoint_BTN.setOnClickListener {
            hideKeyBoard();
           if (isPointSet && mylastPoint_id != "") {
                showBottomView(false)
                removePoint()
            }
        }
    }

    var selectedTypeList = ArrayList<Int>()
    var sheetIsActive = false;
    var mLayoutManagerForSetPointTypes: LinearLayoutManager? = null
    var mBottomTypesAdapter: RecyclerView.Adapter<*>? = null
    var filterData = filterList()

    fun removePoint() {
        if (mylastPoint_id == "")
            return
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.removeMapPoint(mylastPoint_id!!)
        call.enqueue(object : Callback<Code> {
            override fun onResponse(call: Call<Code>,
                                    response: Response<Code>) {
                val mainPageDataList = response.body()
                if (mainPageDataList != null && mainPageDataList.code == 1) {
                    updateBottomUI(REMOVED_UI)
                    isPointSet = false
                    mylastPoint_id = ""
                    forse_set = true
                }
            }

            override fun onFailure(call: Call<Code>, t: Throwable) {
               // updateBottomUI(REMOVED_UI)
                Toast.makeText(this@MapsActivity, getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })

    }

    fun init_TypesRVforSetPoint() {
        mLayoutManagerForSetPointTypes = LinearLayoutManager(this@MapsActivity, LinearLayoutManager.HORIZONTAL, false)
        types_RV!!.isNestedScrollingEnabled = false
        types_RV!!.layoutManager = mLayoutManagerForSetPointTypes
        mBottomTypesAdapter = Map_Bottom_SetPoints_Adapter(filterData, this)
        types_RV!!.adapter = mBottomTypesAdapter

    }

    fun setBottomUserList(userId: String): Boolean {
        var uid = userId.toInt()
        if (uid == GlobalStaticVariables.myId) {
            Toast.makeText(this@MapsActivity, getString(R.string.current_location), Toast.LENGTH_LONG).show()
            return false
        } else {
            var tmpData = allRawMarkerData?.firstOrNull { it -> it.userId == uid }
            if (tmpData != null) {
                bottomUserListData.clear()
                bottomUserListData.add(tmpData)
                mAdapter.notifyDataSetChanged()
                return true
            }
        }
        return false
    }

    val MARKER_SELECTED_MALE = 0
    val MARKER_SELECTED_FEMALE = 1
    val MARKER_SELECTED_ME = 2
    val MARKER_MALE = 3
    val MARKER_FEMALE = 4
    val MARKER_ME = 5


    fun getImageRes(type: Int): BitmapDescriptor {
        var bitmap: Bitmap? = null
        when (type) {
            MARKER_SELECTED_MALE -> {
                //  BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_male_selected)
                bitmap = getBitmap(this@MapsActivity, R.drawable.ic_marker_male_selected);
            }
            MARKER_SELECTED_FEMALE -> {
                //marker_female_selected
                // BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_female_selected)
                bitmap = getBitmap(this@MapsActivity, R.drawable.ic_marker_female_selected);
            }
            MARKER_SELECTED_ME -> {
//                BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_me_selected)
                // BitmapDescriptorFactory.fromResource(R.drawable.selected_marker_test)
                bitmap = getBitmap(this@MapsActivity, R.drawable.ic_marker_me_selected);

            }
            MARKER_MALE -> {
                // BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_male)
                bitmap = getBitmap(this@MapsActivity, R.drawable.marker_male_point);
            }
            MARKER_FEMALE -> {
                //BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_female)
                bitmap = getBitmap(this@MapsActivity, R.drawable.marker_female_point);
            }
            MARKER_ME -> {
//                BitmapDescriptorFactory.fromResource(R.drawable.ic_marker_me)
                // BitmapDescriptorFactory.fromResource(R.drawable.point_marker_test)
                bitmap = getBitmap(this@MapsActivity, R.drawable.marker_me_point);

            }
            else -> {
                throw Exception("UNKNOWN TYPE")
            }
        }
        return BitmapDescriptorFactory.fromBitmap(bitmap)
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private fun getBitmap(vectorDrawable: VectorDrawable): Bitmap {
        var bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(),
                vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        var canvas = Canvas(bitmap);
        vectorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        vectorDrawable.draw(canvas);
        return bitmap;
    }

    private fun getBitmap(context: Context, drawableId: Int): Bitmap {
        var drawable = ContextCompat.getDrawable(context, drawableId);
        if (drawable is BitmapDrawable) {
            return BitmapFactory.decodeResource(context.getResources(), drawableId);
        } else if (drawable is VectorDrawable) {
            return getBitmap(drawable as (VectorDrawable));
        } else {
            throw  IllegalArgumentException("unsupported drawable type");
        }
    }

    fun setMarkerIcon(type: Int, p1: Marker) {
        p1.setIcon(getImageRes(type));
    }

    fun getSexById(uid: Int): Int {
        if (uid == GlobalStaticVariables.myId?.toInt())
            return 0
        var tmpData = allRawMarkerData?.firstOrNull { it -> it.userId == uid }
        if (tmpData != null) {
            return tmpData?.user?.data?.profile?.data?.sexId!!
        }
        return -1
    }

    fun getTypeByInfo(sex_id: Int?, isSelected: Boolean): Int? {
        return when (sex_id) {
            -1 -> {
                throw Exception("NONE")
            }
            0 -> {
                if (isSelected) MARKER_SELECTED_ME else MARKER_ME
            }
            1 -> {
                if (isSelected) MARKER_SELECTED_MALE else MARKER_MALE
            }
            2 -> {
                if (isSelected) MARKER_SELECTED_FEMALE else MARKER_FEMALE
            }
            else -> {
                throw Exception("NONE")
            }
        }

    }

    private var mSelectedMarker: Marker? = null
    override fun onMarkerClick(p0: Marker?): Boolean {
        if (mSelectedMarker != null) {
            var uid = mSelectedMarker?.tag.toString()
            setMarkerIcon(getTypeByInfo(getSexById(uid.toInt()), false)!!, mSelectedMarker!!)
        }

        mSelectedMarker = p0;
        var zoomValue = myMap?.cameraPosition?.zoom;
        if (zoomValue == null || zoomValue < 13f)
            zoomValue = 13f
        myMap?.moveCamera(CameraUpdateFactory.newLatLngZoom(p0?.position, zoomValue));
        try {
            var clicked_markers_user_ID = p0?.tag.toString()
            if (clicked_markers_user_ID != null) {
                setMarkerIcon(getTypeByInfo(getSexById(clicked_markers_user_ID.toInt()), true)!!, mSelectedMarker!!)
                if (setBottomUserList(clicked_markers_user_ID))
                    showBottomView(true, 1)
            }
        } catch (ex: Exception) {

        }
        return true
    }

    override fun onMapReady(map: GoogleMap) {
        this.myMap = map
        myMap?.setOnMarkerClickListener(this)
        subscribe_to_location_update()

    }

    fun init_filter_action() {
        filter_IV.setOnClickListener {
            hideKeyBoard();
            showFilterDialog()
        }
    }

    override fun onResume() {
        super.onResume()

        val resultCode = GooglePlayServicesUtil
                .isGooglePlayServicesAvailable(applicationContext)

        if (resultCode == ConnectionResult.SUCCESS) {
            Toast.makeText(applicationContext,
                    "isGooglePlayServicesAvailable SUCCESS", Toast.LENGTH_LONG)
                    .show()
        } else {
            GooglePlayServicesUtil.getErrorDialog(resultCode, this,
                    RQS_GooglePlayServices)
        }
    }


    override fun onMapClick(point: LatLng) {
        if (mSelectedMarker != null) {
            var clicked_markers_user_ID = mSelectedMarker?.tag.toString()
            setMarkerIcon(getTypeByInfo(getSexById(clicked_markers_user_ID.toInt()), false)!!, mSelectedMarker!!)
            showBottomView(false)
        }
        myMap!!.animateCamera(CameraUpdateFactory.newLatLng(point))
    }

    var isPointSet = false
    var mylastPoint_id: String? = null
    var forse_set: Boolean = false
    fun preparePoints() {
        checkMyPoints()
    }

    fun checkMyPoints() {
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        val call = apiService.checkMyPoints(GlobalStaticVariables.language_type!!,GlobalStaticVariables.myId?.toInt()!!)
        call.enqueue(object : Callback<MapModels.MapPointsResponse> {
            override fun onResponse(call: Call<MapModels.MapPointsResponse>,
                                    response: Response<MapModels.MapPointsResponse>) {
                val mainPageDataList = response.body().data
                if (mainPageDataList != null && mainPageDataList.isNotEmpty()) {
                    mylastPoint_id = mainPageDataList.lastOrNull()?.id.toString()
                    isPointSet = true;
                    forse_set = false
                    updateBottomUI(ADDED_UI)
                } else {
                    forse_set = true
                    isPointSet = false;
                    mylastPoint_id = ""
                    updateBottomUI(REMOVED_UI)
                }
            }

            override fun onFailure(call: Call<MapModels.MapPointsResponse>, t: Throwable) {
                // Log error here since request failed
                Toast.makeText(this@MapsActivity, getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })
    }
    //longitude=72.8512&latitude=43.222&types_id%5B%5D=0&types_id%5B%5D=1&types_id%5B%5D=2&types_id%5B%5D=3&types_id%5B%5D=4&types_id%5B%5D=5&user_id=85

    fun postMarkerPoint(lat: String, lng: String, isUpdate: Boolean = false) {
        if (!isUpdate)
            Toast.makeText(this@MapsActivity, getString(R.string.go_dispatch), Toast.LENGTH_SHORT).show()
        val apiService = API_Client.client!!.create(API_Interface::class.java)
        var selectedItems = ArrayList<Int>()
        var index:Int? = 1
        //var testArrat = listOf(1,2,3,4)
        filterData.forEach {
            if (it.filter_item_state == true && it.filter_item_id != null) {
               // selectedItems.add(it.filter_item_id!!.toInt())
                when(it.filter_item_id!!.toInt()){
                    0 -> index = 1
                    1 -> index = 2
                    2 -> index = 3
                    3 -> index = 4
                    4 -> index = 5
                    5 -> index = 6
                }
                selectedItems.add(index!!)
            }
        }


        var call: Call<MapModels.MapAddModel.MapAddPointsResponse>? = null
        if (isPointSet == false) {

            call = apiService.postMapPoint(GlobalStaticVariables.language_type!!,lng, lat, selectedItems, GlobalStaticVariables.myId.toString())
        }
        else if (isPointSet) {
//            if (mylastPoint_id == null || mylastPoint_id == "")
//                return
            call = apiService.updateMapPoint(mylastPoint_id!!, lng, lat, selectedItems, GlobalStaticVariables.myId.toString())
        }
        call?.enqueue(object : Callback<MapModels.MapAddModel.MapAddPointsResponse> {
            override fun onResponse(call: Call<MapModels.MapAddModel.MapAddPointsResponse>,
                                    response: Response<MapModels.MapAddModel.MapAddPointsResponse>) {
                val mainPageDataList = response.body().data
                if (mainPageDataList != null && mainPageDataList.errors == null) {
                    if (forse_set) {
                        if (!isUpdate)
                            showPreparedToast(this@MapsActivity, "Success")
                        updateBottomUI(ADDED_UI)
                        forse_set = false;
                        isPointSet = true;
                        mylastPoint_id = mainPageDataList!!.id.toString()
                        isTrackEnabled = true;
                    }
                } else {
                }
            }

            override fun onFailure(call: Call<MapModels.MapAddModel.MapAddPointsResponse>, t: Throwable) {
                // Log error here since request failed
                Toast.makeText(this@MapsActivity, getString(R.string.error), Toast.LENGTH_SHORT).show();
            }
        })


        Log.e("isPointSet", "${isPointSet}")
        Log.e("isUpdate", "${isUpdate}")
    }

    fun clearMarker() {
        if (userSetMarker != null) {
            userSetMarker?.remove()
        }
    }

    var userSetMarker: Marker? = null;


    private fun init_menu() {
        val dataSet = ArrayList<String>()
        val recyclerView = findViewById<RecyclerView>(R.id.nav_recyclerView)
        recyclerView.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adapter = RecyclerViewToolbar(dataSet)
        recyclerView.adapter = adapter
        initButtonToolbar()
    }

    private fun initButtonToolbar() {
        if (!menu_btn_sbsed) {
            menu_btn_sbsed = true
            btnOpenDrawer.setOnClickListener {
                hideKeyBoard();
                drawer_layout.openDrawer(GravityCompat.START)
            }
        }
    }

    private fun subscribe_to_location_update() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                //                askToTurnOnGps();
                if (!asked_once)
                    requestPermissions(arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION), MY_PERMISSON_REQUEST_FINE_LOCATION)
                asked_once = true
            }
        } else {
            myMap!!.isMyLocationEnabled = true
            turnGPSOn()
            init_map_actions()
            getMarkers()
            init_filter_action();
        }
    }

    private fun init_map_actions() {
        myMap!!.mapType = GoogleMap.MAP_TYPE_TERRAIN
        myMap!!.setOnMapClickListener(this)

    }


    fun turnGPSOn() {
        if (provider == null) {
            provider = Settings.Secure.getString(applicationContext.contentResolver, Settings.Secure.LOCATION_PROVIDERS_ALLOWED)
            if (!provider!!.contains("gps")) { //if gps is disabled
                val itn_new = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                startActivity(itn_new)
                listenPosition()
            }
        }

    }

    fun listenPosition() {
    }

    fun getColorById(id: Int): Int {
        val version = Build.VERSION.SDK_INT
        if (version >= 23) {
            return ContextCompat.getColor(this, id)
        } else {
            return resources.getColor(id)
        }
    }

    private fun textGradient() {
        tv_map.measure(0, 0)       //must call measure!
        val x_end = tv_map.measuredWidth.toFloat()  //get width
        val y_end = tv_map.measuredHeight.toFloat() //get height
        val test = tv_map.width
        val textShader = LinearGradient(0f, 0f, 0f, y_end,
                intArrayOf(getColorById(R.color.golden_gradient3), getColorById(R.color.golden_gradient4), getColorById(R.color.golden_gradient3)),
                floatArrayOf(0.43f, 0.65f, 0.75f),
                Shader.TileMode.MIRROR)

        tv_map.paint.shader = textShader
    }


    private fun recyclerViewArray() {
        dataSet = ArrayList<String>()
        run {
            for (i in 0..9) {
                dataSet!!.add(resources.getDrawable(R.color.golden).toString())
            }
        }
    }

    var mGoogleApiClient: GoogleApiClient? = null;
    var mLocationRequest: LocationRequest? = null
    override fun onStart() {
        super.onStart()
        mGoogleApiClient?.connect()
    }

    override fun onStop() {
        mGoogleApiClient?.disconnect()
        super.onStop()
    }

    override fun onDestroy() {
        stopRepeatingTask();
        super.onDestroy()
    }

    companion object {
        private val MY_PERMISSON_REQUEST_FINE_LOCATION = 101
        private val MY_PERMISSON_REQUEST_COARSE_LOCATION = 102
    }
}


