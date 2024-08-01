package com.example.appsonaircore;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public class AppsOnAirCoreService {

    static String appId;
    private static final String TAG = "AppsOnAirCoreServices";

    public static String getAppId(Context context) {

        try {
            ApplicationInfo appInfo = context.getPackageManager().getApplicationInfo(
                    context.getPackageName(), PackageManager.GET_META_DATA);

            Bundle bundle = appInfo.metaData;
            if (bundle != null) {
                // Retrieve App id from AndroidManifest file
                AppsOnAirCoreService.appId = bundle.getString("app_id");
                Log.d(TAG, appId);
                return AppsOnAirCoreService.appId;
            } else {
                // Handle case where metadata bundle is null
                Log.d(TAG, "Set app id in android manifest file");
                return "";
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            // Handle exception
            Log.d(TAG, "Catch");
            return "";
        }

    }
}
