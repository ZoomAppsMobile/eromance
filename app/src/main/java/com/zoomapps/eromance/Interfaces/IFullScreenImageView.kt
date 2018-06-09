package com.zoomapps.eromance.Interfaces

import android.graphics.Bitmap
import android.widget.ProgressBar
import com.zoomapps.eromance.CustomViews.TouchImageView

/**
 * Created by User on 04.09.2017.
 */
interface IFullScreenImageView {
    fun onImageLoaded(result: Bitmap?, imgDisplay : TouchImageView, loading_PB : ProgressBar, pos:Int)
}