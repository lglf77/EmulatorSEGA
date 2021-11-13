package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.pw;

public final class c {
    public static boolean a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            return (pw.a(context).a(str, 0).flags & 2097152) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
