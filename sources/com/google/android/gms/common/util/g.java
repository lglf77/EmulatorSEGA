package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;

public final class g {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;

    @TargetApi(20)
    public static boolean a(Context context) {
        if (a == null) {
            a = Boolean.valueOf(j.f() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return a.booleanValue();
    }

    @TargetApi(24)
    public static boolean b(Context context) {
        return (!j.h() || c(context)) && a(context);
    }

    @TargetApi(21)
    public static boolean c(Context context) {
        if (b == null) {
            b = Boolean.valueOf(j.g() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return b.booleanValue();
    }

    public static boolean d(Context context) {
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return c.booleanValue();
    }
}
