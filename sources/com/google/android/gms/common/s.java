package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.a;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.g;
import com.google.android.gms.common.util.p;
import com.google.android.gms.internal.pw;
import java.util.concurrent.atomic.AtomicBoolean;

public class s {
    @Deprecated
    public static final int a = 11910000;
    static final AtomicBoolean b = new AtomicBoolean();
    private static boolean c = false;
    private static boolean d = false;
    private static boolean e = false;
    private static boolean f = false;
    private static final AtomicBoolean g = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(a.C0013a.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !g.get()) {
            int b2 = u.b(context);
            if (b2 == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (b2 != a) {
                throw new IllegalStateException(new StringBuilder(String.valueOf("com.google.android.gms.version").length() + 290).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ").append(a).append(" but found ").append(b2).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"").append("com.google.android.gms.version").append("\" android:value=\"@integer/google_play_services_version\" />").toString());
            }
        }
        boolean z = !g.b(context) && !g.d(context);
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            t.a(context);
            if (z) {
                k a2 = t.a(packageInfo, n.a);
                if (a2 == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                    return 9;
                }
                if (t.a(packageInfo2, a2) == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            } else if (t.a(packageInfo2, n.a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (packageInfo2.versionCode / 1000 < a / 1000) {
                Log.w("GooglePlayServicesUtil", new StringBuilder(77).append("Google Play services out of date.  Requires ").append(a).append(" but found ").append(packageInfo2.versionCode).toString());
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e3) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e3);
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    public static boolean a(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return a(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean a(Context context, int i, String str) {
        return p.a(context, i, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r0 = ((android.os.UserManager) r5.getSystemService("user")).getApplicationRestrictions(r5.getPackageName());
     */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(android.content.Context r5, java.lang.String r6) {
        /*
            r1 = 1
            r2 = 0
            java.lang.String r0 = "com.google.android.gms"
            boolean r3 = r6.equals(r0)
            boolean r0 = com.google.android.gms.common.util.j.g()
            if (r0 == 0) goto L_0x0039
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ Exception -> 0x0036 }
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch:{ Exception -> 0x0036 }
            java.util.List r0 = r0.getAllSessions()     // Catch:{ Exception -> 0x0036 }
            java.util.Iterator r4 = r0.iterator()
        L_0x001e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r4.next()
            android.content.pm.PackageInstaller$SessionInfo r0 = (android.content.pm.PackageInstaller.SessionInfo) r0
            java.lang.String r0 = r0.getAppPackageName()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001e
            r0 = r1
        L_0x0035:
            return r0
        L_0x0036:
            r0 = move-exception
            r0 = r2
            goto L_0x0035
        L_0x0039:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r4 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r6, r4)     // Catch:{ NameNotFoundException -> 0x007b }
            if (r3 == 0) goto L_0x0048
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x007b }
            goto L_0x0035
        L_0x0048:
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x007b }
            if (r0 == 0) goto L_0x0079
            boolean r0 = com.google.android.gms.common.util.j.d()     // Catch:{ NameNotFoundException -> 0x007b }
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "user"
            java.lang.Object r0 = r5.getSystemService(r0)     // Catch:{ NameNotFoundException -> 0x007b }
            android.os.UserManager r0 = (android.os.UserManager) r0     // Catch:{ NameNotFoundException -> 0x007b }
            java.lang.String r3 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x007b }
            android.os.Bundle r0 = r0.getApplicationRestrictions(r3)     // Catch:{ NameNotFoundException -> 0x007b }
            if (r0 == 0) goto L_0x0077
            java.lang.String r3 = "true"
            java.lang.String r4 = "restricted_profile"
            java.lang.String r0 = r0.getString(r4)     // Catch:{ NameNotFoundException -> 0x007b }
            boolean r0 = r3.equals(r0)     // Catch:{ NameNotFoundException -> 0x007b }
            if (r0 == 0) goto L_0x0077
            r0 = r1
        L_0x0073:
            if (r0 != 0) goto L_0x0079
            r0 = r1
            goto L_0x0035
        L_0x0077:
            r0 = r2
            goto L_0x0073
        L_0x0079:
            r0 = r2
            goto L_0x0035
        L_0x007b:
            r0 = move-exception
            r0 = r2
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.s.a(android.content.Context, java.lang.String):boolean");
    }

    public static boolean b(Context context) {
        if (!f) {
            try {
                PackageInfo b2 = pw.a(context).b("com.google.android.gms", 64);
                if (b2 != null) {
                    t.a(context);
                    if (t.a(b2, n.a[1]) != null) {
                        e = true;
                    }
                }
                e = false;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
            } finally {
                f = true;
            }
        }
        return e || !"user".equals(Build.TYPE);
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    @Deprecated
    public static int d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }
}
