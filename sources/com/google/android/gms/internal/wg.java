package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.d;
import com.google.android.gms.measurement.AppMeasurement;

public final class wg extends uk {
    private Handler a;
    private long b = k().b();
    private final ro c = new wh(this, this.p);
    private final ro d = new wi(this, this.p);

    wg(tk tkVar) {
        super(tkVar);
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        c();
        y();
        this.c.c();
        this.d.c();
        t().E().a("Activity resumed, time", Long.valueOf(j));
        this.b = j;
        if (k().a() - u().k.a() > u().m.a()) {
            u().l.a(true);
            u().n.a(0);
        }
        if (u().l.a()) {
            this.c.a(Math.max(0, u().j.a() - u().n.a()));
        } else {
            this.d.a(Math.max(0, 3600000 - u().n.a()));
        }
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        c();
        y();
        this.c.c();
        this.d.c();
        t().E().a("Activity paused, time", Long.valueOf(j));
        if (this.b != 0) {
            u().n.a(u().n.a() + (j - this.b));
        }
    }

    private final void y() {
        synchronized (this) {
            if (this.a == null) {
                this.a = new Handler(Looper.getMainLooper());
            }
        }
    }

    /* access modifiers changed from: private */
    public final void z() {
        c();
        a(false);
        d().a(k().b());
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final boolean a(boolean z) {
        c();
        Q();
        long b2 = k().b();
        u().m.a(k().a());
        long j = b2 - this.b;
        if (z || j >= 1000) {
            u().n.a(j);
            t().E().a("Recording user engagement, ms", Long.valueOf(j));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j);
            vc.a((AppMeasurement.g) j().y(), bundle);
            f().a("auto", "_e", bundle);
            this.b = b2;
            this.d.c();
            this.d.a(Math.max(0, 3600000 - u().n.a()));
            return true;
        }
        t().E().a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
        return false;
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
}
