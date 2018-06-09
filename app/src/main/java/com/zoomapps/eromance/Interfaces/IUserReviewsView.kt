package com.zoomapps.eromance.Interfaces

/**
 * Created by User on 03.07.2017.
 */
interface IUserReviewsView {
    fun<T> onReviewsLoaded(out:T)
    fun onReviewLoadError()

    fun<T> onReviewSend(out:T)
    fun onReviewSendError()
}