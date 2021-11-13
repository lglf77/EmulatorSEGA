package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.j;

public final class pu {
    private static Context a;
    private static Boolean b;

    public static synchronized boolean a(Context context) {
        boolean booleanValue;
        synchronized (pu.class) {
            Context applicationContext = context.getApplicationContext();
            if (a == null || b == null || a != applicationContext) {
                b = null;
                if (j.i()) {
                    b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        b = true;
                    } catch (ClassNotFoundException e) {
                        b = false;
                    }
                }
                a = applicationContext;
                booleanValue = b.booleanValue();
            } else {
                booleanValue = b.booleanValue();
            }
        }
        return booleanValue;
    }
}
