package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.t;
import com.google.android.gms.internal.pw;

public final class p {
    public static boolean a(Context context, int i) {
        if (!a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return t.a(context).a(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException e) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    @TargetApi(19)
    public static boolean a(Context context, int i, String str) {
        return pw.a(context).a(i, str);
    }
}
