package com.zoomapps.eromance.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vk.sdk.util.VKUtil;
import com.zoomapps.eromance.R;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AuthActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth2);

        String[] fingPrints= VKUtil.getCertificateFingerprint(this, this.getPackageName());
        System.out.println("FSFSFDSFS"+Arrays.asList(fingPrints));
        System.out.println(Arrays.asList(fingPrints));
    }
}
