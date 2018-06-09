package com.zoomapps.eromance.Adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.ViewGroup
import com.zoomapps.eromance.R.id.textView
import android.widget.TextView
import android.view.LayoutInflater
import android.support.v4.view.PagerAdapter
import com.zoomapps.eromance.Fragments.AllGamesFragment
import com.zoomapps.eromance.Fragments.GameHistoryFragment
import com.zoomapps.eromance.R


/**
 * Created by User on 14.07.2017.
 */
class ScreenSlidePagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    var all_games_fragment:AllGamesFragment?=null;
    var history_games_fragment:GameHistoryFragment?=null;
    override fun getItem(position: Int): Fragment {
        when(position){
            0-> {
                all_games_fragment = AllGamesFragment()
                return all_games_fragment!!
            }
            1->{
                history_games_fragment = GameHistoryFragment()
                return history_games_fragment!!
            }
        }
        return Fragment()
    }

    override fun getCount(): Int {
        return 2
    }
}





