package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.c.a;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.d;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class vc extends uk {
    protected vf a;
    private volatile AppMeasurement.g b;
    private AppMeasurement.g c;
    private long d;
    private final Map<Activity, vf> e = new a();
    private final CopyOnWriteArrayList<AppMeasurement.f> f = new CopyOnWriteArrayList<>();
    private boolean g;
    private AppMeasurement.g h;
    private String i;

    public vc(tk tkVar) {
        super(tkVar);
    }

    private static String a(String str) {
        String[] split = str.split("\\.");
        if (split.length == 0) {
            return str.substring(0, 36);
        }
        String str2 = split[split.length - 1];
        return str2.length() > 36 ? str2.substring(0, 36) : str2;
    }

    private final void a(Activity activity, vf vfVar, boolean z) {
        boolean z2;
        boolean z3 = true;
        AppMeasurement.g gVar = this.b != null ? this.b : (this.c == null || Math.abs(k().b() - this.d) >= 1000) ? null : this.c;
        AppMeasurement.g gVar2 = gVar != null ? new AppMeasurement.g(gVar) : null;
        this.g = true;
        try {
            Iterator<AppMeasurement.f> it = this.f.iterator();
            while (it.hasNext()) {
                try {
                    z3 &= it.next().a(gVar2, vfVar);
                } catch (Exception e2) {
                    t().y().a("onScreenChangeCallback threw exception", e2);
                }
            }
            this.g = false;
            z2 = z3;
        } catch (Exception e3) {
            Exception exc = e3;
            z2 = z3;
            t().y().a("onScreenChangeCallback loop threw exception", exc);
            this.g = false;
        } catch (Throwable th) {
            this.g = false;
            throw th;
        }
        AppMeasurement.g gVar3 = this.b == null ? this.c : this.b;
        if (z2) {
            if (vfVar.c == null) {
                vfVar.c = a(activity.getClass().getCanonicalName());
            }
            vf vfVar2 = new vf(vfVar);
            this.c = this.b;
            this.d = k().b();
            this.b = vfVar2;
            s().a((Runnable) new vd(this, z, gVar3, vfVar2));
        }
    }

    /* access modifiers changed from: private */
    public final void a(vf vfVar) {
        d().a(k().b());
        if (r().a(vfVar.a)) {
            vfVar.a = false;
        }
    }

    public static void a(AppMeasurement.g gVar, Bundle bundle) {
        if (bundle != null && gVar != null && !bundle.containsKey("_sc")) {
            if (gVar.b != null) {
                bundle.putString("_sn", gVar.b);
            }
            bundle.putString("_sc", gVar.c);
            bundle.putLong("_si", gVar.d);
        }
    }

    /* access modifiers changed from: package-private */
    public final vf a(Activity activity) {
        y.a(activity);
        vf vfVar = this.e.get(activity);
        if (vfVar != null) {
            return vfVar;
        }
        vf vfVar2 = new vf((String) null, a(activity.getClass().getCanonicalName()), p().y());
        this.e.put(activity, vfVar2);
        return vfVar2;
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(Activity activity, Bundle bundle) {
        vf vfVar;
        if (bundle != null && (vfVar = this.e.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", vfVar.d);
            bundle2.putString("name", vfVar.b);
            bundle2.putString("referrer_name", vfVar.c);
            bundle.putBundle("com.google.firebase.analytics.screen_service", bundle2);
        }
    }

    public final void a(Activity activity, String str, String str2) {
        if (activity == null) {
            t().A().a("setCurrentScreen must be called with a non-null activity");
            return;
        }
        s();
        if (!tf.y()) {
            t().A().a("setCurrentScreen must be called from the main thread");
        } else if (this.g) {
            t().A().a("Cannot call setCurrentScreen from onScreenChangeCallback");
        } else if (this.b == null) {
            t().A().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.e.get(activity) == null) {
            t().A().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = a(activity.getClass().getCanonicalName());
            }
            boolean equals = this.b.c.equals(str2);
            boolean a2 = wr.a(this.b.b, str);
            if (equals && a2) {
                t().B().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                t().A().a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                t().E().a("Setting current screen to name, class", str == null ? "null" : str, str2);
                vf vfVar = new vf(str, str2, p().y());
                this.e.put(activity, vfVar);
                a(activity, vfVar, true);
            } else {
                t().A().a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    public final void a(AppMeasurement.f fVar) {
        if (fVar == null) {
            t().A().a("Attempting to register null OnScreenChangeCallback");
            return;
        }
        this.f.remove(fVar);
        this.f.add(fVar);
    }

    public final void a(String str, AppMeasurement.g gVar) {
        c();
        synchronized (this) {
            if (this.i == null || this.i.equals(str) || gVar != null) {
                this.i = str;
                this.h = gVar;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final void b(Activity activity) {
        a(activity, a(activity), false);
        qz d2 = d();
        d2.s().a((Runnable) new rc(d2, d2.k().b()));
    }

    public final void b(AppMeasurement.f fVar) {
        this.f.remove(fVar);
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final void c(Activity activity) {
        vf a2 = a(activity);
        this.c = this.b;
        this.d = k().b();
        this.b = null;
        s().a((Runnable) new ve(this, a2));
    }

    public final /* bridge */ /* synthetic */ qz d() {
        return super.d();
    }

    public final void d(Activity activity) {
        this.e.remove(activity);
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

    /* access modifiers changed from: protected */
    public final boolean w() {
        return false;
    }

    public final vf y() {
        Q();
        c();
        return this.a;
    }

    public final AppMeasurement.g z() {
        AppMeasurement.g gVar = this.b;
        if (gVar == null) {
            return null;
        }
        return new AppMeasurement.g(gVar);
    }
}
