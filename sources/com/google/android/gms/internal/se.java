package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.util.d;
import com.google.firebase.iid.FirebaseInstanceId;
import java.math.BigInteger;
import java.util.Locale;

public final class se extends uk {
    private String a;
    private String b;
    private int c;
    private String d;
    private String e;
    private long f;
    private long g;
    private int h;
    private String i;

    se(tk tkVar) {
        super(tkVar);
    }

    private final String D() {
        c();
        try {
            return FirebaseInstanceId.a().c();
        } catch (IllegalStateException e2) {
            t().A().a("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final String A() {
        Q();
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public final int B() {
        Q();
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final int C() {
        Q();
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final re a(String str) {
        c();
        String z = z();
        String A = A();
        Q();
        String str2 = this.b;
        long B = (long) B();
        Q();
        String str3 = this.d;
        Q();
        c();
        if (this.f == 0) {
            this.f = this.p.o().b(l(), l().getPackageName());
        }
        long j = this.f;
        boolean B2 = this.p.B();
        boolean z2 = !u().o;
        String D = D();
        Q();
        long C = this.p.C();
        int C2 = C();
        Boolean b2 = v().b("google_analytics_adid_collection_enabled");
        return new re(z, A, str2, B, str3, 11910, j, str, B2, z2, D, 0, C, C2, Boolean.valueOf(b2 == null || b2.booleanValue()).booleanValue());
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ qz d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ rg e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ um f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ se g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ rq h() {
        return super.h();
    }

    /* access modifiers changed from: protected */
    public final void h_() {
        boolean z;
        int i2 = 1;
        String str = "unknown";
        String str2 = "Unknown";
        int i3 = Integer.MIN_VALUE;
        String str3 = "Unknown";
        String packageName = l().getPackageName();
        PackageManager packageManager = l().getPackageManager();
        if (packageManager == null) {
            t().y().a("PackageManager is null, app identity information might be inaccurate. appId", sj.a(packageName));
        } else {
            try {
                str = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException e2) {
                t().y().a("Error retrieving app installer package name. appId", sj.a(packageName));
            }
            if (str == null) {
                str = "manual_install";
            } else if ("com.android.vending".equals(str)) {
                str = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(l().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    if (!TextUtils.isEmpty(applicationLabel)) {
                        str3 = applicationLabel.toString();
                    }
                    str2 = packageInfo.versionName;
                    i3 = packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException e3) {
                t().y().a("Error retrieving package info. appId, appName", sj.a(packageName), str3);
            }
        }
        this.a = packageName;
        this.d = str;
        this.b = str2;
        this.c = i3;
        this.e = str3;
        this.f = 0;
        Status a2 = a.a(l());
        boolean z2 = a2 != null && a2.b();
        if (!z2) {
            if (a2 == null) {
                t().y().a("GoogleService failed to initialize (no status)");
            } else {
                t().y().a("GoogleService failed to initialize, status", Integer.valueOf(a2.c()), a2.a());
            }
        }
        if (z2) {
            Boolean b2 = v().b("firebase_analytics_collection_enabled");
            if (v().x()) {
                t().C().a("Collection disabled with firebase_analytics_collection_deactivated=1");
                z = false;
            } else if (b2 != null && !b2.booleanValue()) {
                t().C().a("Collection disabled with firebase_analytics_collection_enabled=0");
                z = false;
            } else if (b2 != null || !a.b()) {
                t().E().a("Collection enabled");
                z = true;
            } else {
                t().C().a("Collection disabled with google_app_measurement_enable=0");
                z = false;
            }
        } else {
            z = false;
        }
        this.i = "";
        this.g = 0;
        try {
            String a3 = a.a();
            if (TextUtils.isEmpty(a3)) {
                a3 = "";
            }
            this.i = a3;
            if (z) {
                t().E().a("App package, google app id", this.a, this.i);
            }
        } catch (IllegalStateException e4) {
            t().y().a("getGoogleAppId or isMeasurementEnabled failed with exception. appId", sj.a(packageName), e4);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (!pu.a(l())) {
                i2 = 0;
            }
            this.h = i2;
            return;
        }
        this.h = 0;
    }

    public final /* bridge */ /* synthetic */ vg i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ vc j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ d k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Context l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ sf m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ rk n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ sh o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ wr p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ te q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ wg r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ tf s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ sj t() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ su u() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ rj v() {
        return super.v();
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final String y() {
        byte[] bArr = new byte[16];
        p().z().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* access modifiers changed from: package-private */
    public final String z() {
        Q();
        return this.a;
    }
}
