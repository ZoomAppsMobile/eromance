package com.zoomapps.eromance.Fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.zoomapps.eromance.Activities.GameListActivity
import com.zoomapps.eromance.Adapters.GameHistoryAdapter
import com.zoomapps.eromance.Adapters.GameListAdapter
import com.zoomapps.eromance.Models.GameHistoryModel
import com.zoomapps.eromance.Models.GameModel

import com.zoomapps.eromance.R
import java.util.*


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [GameHistoryFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [GameHistoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GameHistoryFragment : Fragment() {

    fun updateRV(data: List<GameHistoryModel.Datum> , clear:Boolean=true){
        loader_container.visibility = View.GONE
        if(clear){
            AdapterData.clear()
        }
        AdapterData.addAll(data)
        mAdapter.notifyDataSetChanged()
    }
    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = arguments!!.getString(ARG_PARAM1)
            mParam2 = arguments!!.getString(ARG_PARAM2)
        }
    }

    var AdapterData = ArrayList<GameHistoryModel.Datum>()
    lateinit var mAdapter : RecyclerView.Adapter<*>
    lateinit var main_RV: RecyclerView
    lateinit var loader_container : LinearLayout

    fun onLoadedStarted(){
        loader_container.visibility = View.VISIBLE
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater!!.inflate(R.layout.fragment_game_history, container, false)
        main_RV = view.findViewById<RecyclerView>(R.id.main_RV) as RecyclerView
        loader_container = view.findViewById<LinearLayout>(R.id.loader_container) as LinearLayout
        main_RV.layoutManager = LinearLayoutManager(context)
        mAdapter = GameHistoryAdapter(AdapterData,context)
        main_RV.adapter = mAdapter
        (context as GameListActivity).prensenter.getGameHistory()
        return view
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html) for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private val ARG_PARAM1 = "param1"
        private val ARG_PARAM2 = "param2"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.

         * @param param1 Parameter 1.
         * *
         * @param param2 Parameter 2.
         * *
         * @return A new instance of fragment GameHistoryFragment.
         */


        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String, param2: String): GameHistoryFragment {
            val fragment = GameHistoryFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }
}// Required empty public constructor
