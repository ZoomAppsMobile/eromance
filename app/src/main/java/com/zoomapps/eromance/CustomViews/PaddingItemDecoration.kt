package com.zoomapps.eromance.CustomViews

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View


/**
 * Created by User on 06.07.2017.
 */
class PaddingItemDecoration(private val size: Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)

        // Apply offset only to first item
        if (parent.getChildAdapterPosition(view) == 0) {
            outRect.left += size
        }
    }
}