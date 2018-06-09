package com.zoomapps.eromance.Interfaces

import com.zoomapps.eromance.Models.UserProfileModel

/**
 * Created by User on 04.07.2017.
 */
interface ITwentyOneUsersMain{
    fun onDataLoaded(out: UserProfileModel.ProfileFindResponse)
    fun onDataLoadError()
}