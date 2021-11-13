package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.pw;

public class t {
    private static t a;
    private final Context b;

    private t(Context context) {
        this.b = context.getApplicationContext();
    }

    static k a(PackageInfo packageInfo, k... kVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        l lVar = new l(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < kVarArr.length; i++) {
            if (kVarArr[i].equals(lVar)) {
                return kVarArr[i];
            }
        }
        return null;
    }

    public static t a(Context context) {
        y.a(context);
        synchronized (t.class) {
            if (a == null) {
                j.a(context);
                a = new t(context);
            }
        }
        return a;
    }

    private static boolean a(PackageInfo packageInfo, boolean z) {
        k a2;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                a2 = a(packageInfo, n.a);
            } else {
                a2 = a(packageInfo, n.a[0]);
            }
            if (a2 != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean a(String str) {
        try {
            PackageInfo b2 = pw.a(this.b).b(str, 64);
            if (b2 == null) {
                return false;
            }
            if (s.b(this.b)) {
                return b(b2, true);
            }
            boolean b3 = b(b2, false);
            if (!b3 && b(b2, true)) {
                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
            }
            return b3;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    private static boolean b(PackageInfo packageInfo, boolean z) {
        boolean z2 = false;
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
        } else {
            l lVar = new l(packageInfo.signatures[0].toByteArray());
            String str = packageInfo.packageName;
            z2 = z ? j.b(str, lVar) : j.a(str, lVar);
            if (!z2) {
                Log.d("GoogleSignatureVerifier", new StringBuilder(27).append("Cert not in list. atk=").append(z).toString());
            }
        }
        return z2;
    }

    public final boolean a(int i) {
        String[] a2 = pw.a(this.b).a(i);
        if (a2 == null || a2.length == 0) {
            return false;
        }
        for (String a3 : a2) {
            if (a(a3)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (a(packageInfo, false)) {
            return true;
        }
        if (!a(packageInfo, true)) {
            return false;
        }
        if (s.b(this.b)) {
            return true;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return false;
    }
}
