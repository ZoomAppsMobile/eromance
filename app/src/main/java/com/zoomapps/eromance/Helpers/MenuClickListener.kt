package com.zoomapps.eromance.Helpers

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import com.zoomapps.eromance.Activities.*
import com.zoomapps.eromance.Controllers.GlobalVariables
import com.zoomapps.eromance.Controllers.checkIfAgreementRead
import com.zoomapps.eromance.Controllers.convertDateToAge
import com.zoomapps.eromance.Controllers.showToast
import com.zoomapps.eromance.R

/**
 * Created by User on 05.06.2017.
 */
class MenuClickListener(val _ctx: Context): View.OnClickListener{
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.myProfile_NAV_LL->{
                startAct(MyProfileActivity::class.java,true)
            }
            R.id.searchPair_NAV_LL->{
                startAct( SearchPairActivity::class.java,true)
            }
            R.id.momentMeets_NAV_LL->{
                startAct(MomentalMeetsActivity::class.java)
            }
            R.id.placesForRest_NAV_LL->{
                startAct( PlacesForRestListActivity::class.java)
            }
            R.id.eveningPlans_NAV_LL->{
                startAct( EveningsListActivity::class.java)
            }
            R.id.map_NAV_LL->{
                startAct( MapsActivity::class.java)
            }
            R.id.games_NAV_LL->{
                startAct( GameListActivity::class.java)
            }
            R.id.twentyOne_NAV_LL-> {
                var brnDate = GlobalStaticVariables.myData?.profile?.data?.bornAt;
                if (brnDate!=null&&brnDate!=""&& convertDateToAge(brnDate).toInt() < 21) {
                    showToast(_ctx,"Вам должно быть 21, чтобы посетить данный раздел ")
                } else {
                    if (!checkIfAgreementRead())
                        startAct(TwentyOneLicenseAgreementActivity::class.java, true)
                    else
                        startAct(TwentyOneStartActivty::class.java, true)
                }
            }
            R.id.settings_NAV_LL->{
                startAct( SettingLanguageActivity::class.java,false)
            }
            R.id.twentyOne_Requests_NAV_LL->{
                startAct(TwentyOneRequestsActivity::class.java,false)
            }
            R.id.home_21_NAV_LL->{
                startAct(TwentyOneUsersMainActivity::class.java)
            }
            R.id.home_NAV_LL->{
                startAct(MainActivity::class.java)
            }

        }
    }
    fun startAct(className:Class<*> , isSubPage:Boolean = false){
        if(!isSubPage)
            (_ctx as Activity).finish()
        (_ctx as Activity).startActivity(Intent(_ctx, className))
    }
}