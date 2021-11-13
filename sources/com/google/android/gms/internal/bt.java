package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.common.util.g;
import com.google.android.gms.common.util.j;
import java.util.Locale;

public final class bt {
    private String A;
    private boolean B;
    private int a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private String g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private double m;
    private boolean n;
    private String o;
    private String p;
    private boolean q;
    private boolean r;
    private String s;
    private boolean t;
    private boolean u;
    private String v;
    private String w;
    private float x;
    private int y;
    private int z;

    public bt(Context context) {
        DisplayMetrics displayMetrics;
        boolean z2 = true;
        PackageManager packageManager = context.getPackageManager();
        a(context);
        b(context);
        c(context);
        Locale locale = Locale.getDefault();
        this.q = a(packageManager, "geo:0,0?q=donuts") != null;
        this.r = a(packageManager, "http://www.google.com") == null ? false : z2;
        this.s = locale.getCountry();
        app.a();
        this.t = jc.a();
        this.u = g.c(context);
        this.v = locale.getLanguage();
        this.w = b(context, packageManager);
        this.A = a(context, packageManager);
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.x = displayMetrics.density;
            this.y = displayMetrics.widthPixels;
            this.z = displayMetrics.heightPixels;
        }
    }

    public bt(Context context, bs bsVar) {
        context.getPackageManager();
        a(context);
        b(context);
        c(context);
        this.o = Build.FINGERPRINT;
        this.p = Build.DEVICE;
        this.B = j.a() && atu.a(context);
        this.q = bsVar.b;
        this.r = bsVar.c;
        this.s = bsVar.e;
        this.t = bsVar.f;
        this.u = bsVar.g;
        this.v = bsVar.j;
        this.w = bsVar.k;
        this.A = bsVar.l;
        this.x = bsVar.s;
        this.y = bsVar.t;
        this.z = bsVar.u;
    }

    private static ResolveInfo a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            au.i().a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private static String a(Context context, PackageManager packageManager) {
        try {
            PackageInfo b2 = pw.a(context).b("com.android.vending", 128);
            if (b2 == null) {
                return null;
            }
            int i2 = b2.versionCode;
            String str = b2.packageName;
            return new StringBuilder(String.valueOf(str).length() + 12).append(i2).append(".").append(str).toString();
        } catch (Exception e2) {
            return null;
        }
    }

    private final void a(Context context) {
        au.e();
        AudioManager i2 = gw.i(context);
        if (i2 != null) {
            try {
                this.a = i2.getMode();
                this.b = i2.isMusicActive();
                this.c = i2.isSpeakerphoneOn();
                this.d = i2.getStreamVolume(3);
                this.e = i2.getRingerMode();
                this.f = i2.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                au.i().a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.a = -2;
        this.b = false;
        this.c = false;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    private static String b(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo a2 = a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a2 == null || (activityInfo = a2.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo b2 = pw.a(context).b(activityInfo.packageName, 0);
            if (b2 == null) {
                return null;
            }
            int i2 = b2.versionCode;
            String str = activityInfo.packageName;
            return new StringBuilder(String.valueOf(str).length() + 12).append(i2).append(".").append(str).toString();
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    @TargetApi(16)
    private final void b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.g = telephonyManager.getNetworkOperator();
        this.i = telephonyManager.getNetworkType();
        this.j = telephonyManager.getPhoneType();
        this.h = -2;
        this.k = false;
        this.l = -1;
        au.e();
        if (gw.a(context, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.h = activeNetworkInfo.getType();
                this.l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.h = -1;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                this.k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    private final void c(Context context) {
        boolean z2 = false;
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z2 = true;
            }
            this.n = z2;
            return;
        }
        this.m = -1.0d;
        this.n = false;
    }

    public final bs a() {
        return new bs(this.a, this.q, this.r, this.g, this.s, this.t, this.u, this.b, this.c, this.v, this.w, this.A, this.d, this.h, this.i, this.j, this.e, this.f, this.x, this.y, this.z, this.m, this.n, this.k, this.l, this.o, this.B, this.p);
    }
}
