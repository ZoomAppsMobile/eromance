package com.zoomapps.eromance.Helpers

import com.zoomapps.eromance.R
import ru.ok.android.sdk.Odnoklassniki

/**
 * Created by User on 18.08.2017.
 */
class SocialInstancesHolder private constructor() {
    companion object {
        private var mInstance: SocialInstancesHolder? = null
        val instance: SocialInstancesHolder
            get() {
                if (mInstance == null) mInstance = SocialInstancesHolder()
                return mInstance!!
            }
    }


}