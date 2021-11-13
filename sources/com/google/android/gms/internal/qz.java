package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.c.a;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.d;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Map;

public final class qz extends uj {
    private final Map<String, Long> a = new a();
    private final Map<String, Integer> b = new a();
    private long c;

    public qz(tk tkVar) {
        super(tkVar);
    }

    private final void a(long j, AppMeasurement.g gVar) {
        if (gVar == null) {
            t().E().a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            t().E().a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            vc.a(gVar, bundle);
            f().a("am", "_xa", bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void a(String str, long j) {
        c();
        y.a(str);
        if (this.b.isEmpty()) {
            this.c = j;
        }
        Integer num = this.b.get(str);
        if (num != null) {
            this.b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.b.size() >= 100) {
            t().A().a("Too many ads visible");
        } else {
            this.b.put(str, 1);
            this.a.put(str, Long.valueOf(j));
        }
    }

    private final void a(String str, long j, AppMeasurement.g gVar) {
        if (gVar == null) {
            t().E().a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            t().E().a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            vc.a(gVar, bundle);
            f().a("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        for (String put : this.a.keySet()) {
            this.a.put(put, Long.valueOf(j));
        }
        if (!this.a.isEmpty()) {
            this.c = j;
        }
    }

    /* access modifiers changed from: private */
    public final void b(String str, long j) {
        c();
        y.a(str);
        Integer num = this.b.get(str);
        if (num != null) {
            vf y = j().y();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.b.remove(str);
                Long l = this.a.get(str);
                if (l == null) {
                    t().y().a("First ad unit exposure time was never set");
                } else {
                    this.a.remove(str);
                    a(str, j - l.longValue(), (AppMeasurement.g) y);
                }
                if (!this.b.isEmpty()) {
                    return;
                }
                if (this.c == 0) {
                    t().y().a("First ad exposure time was never set");
                    return;
                }
                a(j - this.c, (AppMeasurement.g) y);
                this.c = 0;
                return;
            }
            this.b.put(str, Integer.valueOf(intValue));
            return;
        }
        t().y().a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a(long j) {
        vf y = j().y();
        for (String next : this.a.keySet()) {
            a(next, j - this.a.get(next).longValue(), (AppMeasurement.g) y);
        }
        if (!this.a.isEmpty()) {
            a(j - this.c, (AppMeasurement.g) y);
        }
        b(j);
    }

    public final void a(String str) {
        if (str == null || str.length() == 0) {
            t().y().a("Ad unit id must be a non-empty string");
            return;
        }
        s().a((Runnable) new ra(this, str, k().b()));
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final void b(String str) {
        if (str == null || str.length() == 0) {
            t().y().a("Ad unit id must be a non-empty string");
            return;
        }
        s().a((Runnable) new rb(this, str, k().b()));
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
}
