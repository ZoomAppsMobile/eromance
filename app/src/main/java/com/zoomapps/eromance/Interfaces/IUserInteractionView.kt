package com.zoomapps.eromance.Interfaces

/**
 * Created by User on 12.06.2017.
 */
interface IUserInteractionView{

    fun onLiked()
    fun onDisliked()
    fun onRemoved()

    fun onFavoritesChecked(isFav:Boolean? , fav_id:Int?=null)
    fun onFavorited(fav_id:Int?=null)
    fun onUnfavorited()
    fun onFavoriteError()
}