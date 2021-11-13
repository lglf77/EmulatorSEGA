package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.a.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.dynamite.DynamiteModule;

final class j {
    private static r a;
    private static final Object b = new Object();
    private static Context c;

    static synchronized void a(Context context) {
        synchronized (j.class) {
            if (c != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                c = context.getApplicationContext();
            }
        }
    }

    private static boolean a() {
        boolean z = true;
        if (a == null) {
            y.a(c);
            synchronized (b) {
                if (a == null) {
                    try {
                        a = s.a(DynamiteModule.a(c, DynamiteModule.c, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    } catch (DynamiteModule.c e) {
                        Log.e("GoogleCertificates", "Failed to load com.google.android.gms.googlecertificates", e);
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    static boolean a(String str, k kVar) {
        return a(str, kVar, false);
    }

    private static boolean a(String str, k kVar, boolean z) {
        if (!a()) {
            return false;
        }
        y.a(c);
        try {
            return a.a(new q(str, kVar, z), c.a(c.getPackageManager()));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    static boolean b(String str, k kVar) {
        return a(str, kVar, true);
    }
}
