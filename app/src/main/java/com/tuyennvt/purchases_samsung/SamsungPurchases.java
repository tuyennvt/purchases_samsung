package com.tuyennvt.purchases_samsung;

import android.content.Context;
import android.util.Log;

import com.samsung.android.sdk.iap.lib.helper.IapHelper;

public class SamsungPurchases {
    public static final String TAG = "SamsungPurchases";

    private IapHelper iapHelper;

    private static SamsungPurchases instance;

    private SamsungPurchases(Context context) {
        iapHelper = IapHelper.getInstance(context);
    }

    public static SamsungPurchases getInstance(Context context) {
        if (instance == null) {
            instance = new SamsungPurchases(context);
        }
        return instance;
    }

    public void log() {
        Log.d(TAG, "log: vao day");
    }
}
