package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.l;
import java.lang.reflect.InvocationTargetException;

public final class rj extends uj {
    private Boolean a;

    rj(tk tkVar) {
        super(tkVar);
    }

    public static boolean B() {
        return rz.a.b().booleanValue();
    }

    public static long y() {
        return rz.F.b().longValue();
    }

    public static long z() {
        return rz.f.b().longValue();
    }

    public final String A() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{"debug.firebase.analytics.app", ""});
        } catch (ClassNotFoundException e) {
            t().y().a("Could not find SystemProperties class", e);
        } catch (NoSuchMethodException e2) {
            t().y().a("Could not find SystemProperties.get() method", e2);
        } catch (IllegalAccessException e3) {
            t().y().a("Could not access SystemProperties.get()", e3);
        } catch (InvocationTargetException e4) {
            t().y().a("SystemProperties.get() threw an exception", e4);
        }
        return "";
    }

    public final int a(String str) {
        return b(str, rz.q);
    }

    public final long a(String str, sa<Long> saVar) {
        if (str == null) {
            return saVar.b().longValue();
        }
        String a2 = q().a(str, saVar.a());
        if (TextUtils.isEmpty(a2)) {
            return saVar.b().longValue();
        }
        try {
            return saVar.a(Long.valueOf(Long.valueOf(a2).longValue())).longValue();
        } catch (NumberFormatException e) {
            return saVar.b().longValue();
        }
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final int b(String str, sa<Integer> saVar) {
        if (str == null) {
            return saVar.b().intValue();
        }
        String a2 = q().a(str, saVar.a());
        if (TextUtils.isEmpty(a2)) {
            return saVar.b().intValue();
        }
        try {
            return saVar.a(Integer.valueOf(Integer.valueOf(a2).intValue())).intValue();
        } catch (NumberFormatException e) {
            return saVar.b().intValue();
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean b(String str) {
        y.a(str);
        try {
            if (l().getPackageManager() == null) {
                t().y().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a2 = pw.a(l()).a(l().getPackageName(), 128);
            if (a2 == null) {
                t().y().a("Failed to load metadata: ApplicationInfo is null");
                return null;
            } else if (a2.metaData == null) {
                t().y().a("Failed to load metadata: Metadata bundle is null");
                return null;
            } else if (a2.metaData.containsKey(str)) {
                return Boolean.valueOf(a2.metaData.getBoolean(str));
            } else {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            t().y().a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final boolean c(String str) {
        return "1".equals(q().a(str, "gaia_collection_enabled"));
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

    public final boolean w() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    ApplicationInfo applicationInfo = l().getApplicationInfo();
                    String a2 = l.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.a = Boolean.valueOf(str != null && str.equals(a2));
                    }
                    if (this.a == null) {
                        this.a = Boolean.TRUE;
                        t().y().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.a.booleanValue();
    }

    public final boolean x() {
        Boolean b = b("firebase_analytics_collection_deactivated");
        return b != null && b.booleanValue();
    }
}
