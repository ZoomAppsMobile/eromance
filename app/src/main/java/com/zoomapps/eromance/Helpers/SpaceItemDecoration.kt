package com.zoomapps.eromance.Helpers

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by User on 04.09.2017.
 */
class SpaceItemDecoration(private val size: Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
            outRect.right += size
            outRect.left += size
    }
}