package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.RemoteException;
import com.google.android.gms.a;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.d;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class vg extends uk {
    /* access modifiers changed from: private */
    public final vu a;
    /* access modifiers changed from: private */
    public sb b;
    private volatile Boolean c;
    private final ro d;
    private final wl e;
    private final List<Runnable> f = new ArrayList();
    private final ro g;

    protected vg(tk tkVar) {
        super(tkVar);
        this.e = new wl(tkVar.u());
        this.a = new vu(this);
        this.d = new vh(this, tkVar);
        this.g = new vm(this, tkVar);
    }

    /* access modifiers changed from: private */
    public final void F() {
        c();
        this.e.a();
        this.d.a(rz.I.b().longValue());
    }

    /* access modifiers changed from: private */
    public final void G() {
        c();
        if (y()) {
            t().E().a("Inactivity, disconnecting from the service");
            E();
        }
    }

    /* access modifiers changed from: private */
    public final void H() {
        c();
        t().E().a("Processing queued up service tasks", Integer.valueOf(this.f.size()));
        for (Runnable run : this.f) {
            try {
                run.run();
            } catch (Throwable th) {
                t().y().a("Task exception while flushing queue", th);
            }
        }
        this.f.clear();
        this.g.c();
    }

    private final re a(boolean z) {
        return g().a(z ? t().F() : null);
    }

    /* access modifiers changed from: private */
    public final void a(ComponentName componentName) {
        c();
        if (this.b != null) {
            this.b = null;
            t().E().a("Disconnected from device MeasurementService", componentName);
            c();
            C();
        }
    }

    private final void a(Runnable runnable) {
        c();
        if (y()) {
            runnable.run();
        } else if (((long) this.f.size()) >= 1000) {
            t().y().a("Discarding data. Max runnable queue size reached");
        } else {
            this.f.add(runnable);
            this.g.a(60000);
            C();
        }
    }

    /* access modifiers changed from: protected */
    public final void A() {
        c();
        Q();
        re a2 = a(false);
        m().y();
        a((Runnable) new vi(this, a2));
    }

    /* access modifiers changed from: protected */
    public final void B() {
        c();
        Q();
        a((Runnable) new vk(this, a(true)));
    }

    /* access modifiers changed from: package-private */
    public final void C() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        c();
        Q();
        if (!y()) {
            if (this.c == null) {
                c();
                Q();
                Boolean A = u().A();
                if (A == null || !A.booleanValue()) {
                    if (g().C() != 1) {
                        t().E().a("Checking service availability");
                        int a2 = i.a().a(p().l());
                        switch (a2) {
                            case a.b.AdsAttrs_adSize:
                                t().E().a("Service available");
                                z = true;
                                z2 = true;
                                break;
                            case a.b.AdsAttrs_adSizes:
                                t().E().a("Service missing");
                                z = true;
                                z2 = false;
                                break;
                            case 2:
                                t().D().a("Service container out of date");
                                wr p = p();
                                i.a();
                                if (i.b(p.l()) >= 11400) {
                                    Boolean A2 = u().A();
                                    z2 = A2 == null || A2.booleanValue();
                                    z = false;
                                    break;
                                } else {
                                    z = true;
                                    z2 = false;
                                    break;
                                }
                                break;
                            case 3:
                                t().A().a("Service disabled");
                                z = false;
                                z2 = false;
                                break;
                            case 9:
                                t().A().a("Service invalid");
                                z = false;
                                z2 = false;
                                break;
                            case 18:
                                t().A().a("Service updating");
                                z = true;
                                z2 = true;
                                break;
                            default:
                                t().A().a("Unexpected service status", Integer.valueOf(a2));
                                z = false;
                                z2 = false;
                                break;
                        }
                    } else {
                        z = true;
                        z2 = true;
                    }
                    if (z) {
                        u().a(z2);
                    }
                } else {
                    z2 = true;
                }
                this.c = Boolean.valueOf(z2);
            }
            if (this.c.booleanValue()) {
                this.a.a();
                return;
            }
            List<ResolveInfo> queryIntentServices = l().getPackageManager().queryIntentServices(new Intent().setClassName(l(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                z3 = false;
            }
            if (z3) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(l(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.a.a(intent);
                return;
            }
            t().y().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean D() {
        return this.c;
    }

    public final void E() {
        c();
        Q();
        try {
            com.google.android.gms.common.a.a.a();
            l().unbindService(this.a);
        } catch (IllegalArgumentException | IllegalStateException e2) {
        }
        this.b = null;
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    /* access modifiers changed from: protected */
    public final void a(rh rhVar) {
        y.a(rhVar);
        c();
        Q();
        a((Runnable) new vp(this, true, m().a(rhVar), new rh(rhVar), a(true), rhVar));
    }

    /* access modifiers changed from: protected */
    public final void a(rx rxVar, String str) {
        y.a(rxVar);
        c();
        Q();
        a((Runnable) new vo(this, true, m().a(rxVar), rxVar, a(true), str));
    }

    /* access modifiers changed from: protected */
    public final void a(sb sbVar) {
        c();
        y.a(sbVar);
        this.b = sbVar;
        F();
        H();
    }

    /* access modifiers changed from: package-private */
    public final void a(sb sbVar, pp ppVar, re reVar) {
        c();
        Q();
        int i = 100;
        for (int i2 = 0; i2 < 1001 && i == 100; i2++) {
            ArrayList arrayList = new ArrayList();
            List<pp> a2 = m().a(100);
            if (a2 != null) {
                arrayList.addAll(a2);
                i = a2.size();
            } else {
                i = 0;
            }
            if (ppVar != null && i < 100) {
                arrayList.add(ppVar);
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                pp ppVar2 = (pp) obj;
                if (ppVar2 instanceof rx) {
                    try {
                        sbVar.a((rx) ppVar2, reVar);
                    } catch (RemoteException e2) {
                        t().y().a("Failed to send event to the service", e2);
                    }
                } else if (ppVar2 instanceof wo) {
                    try {
                        sbVar.a((wo) ppVar2, reVar);
                    } catch (RemoteException e3) {
                        t().y().a("Failed to send attribute to the service", e3);
                    }
                } else if (ppVar2 instanceof rh) {
                    try {
                        sbVar.a((rh) ppVar2, reVar);
                    } catch (RemoteException e4) {
                        t().y().a("Failed to send conditional property to the service", e4);
                    }
                } else {
                    t().y().a("Discarding data. Unrecognized parcel type.");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(wo woVar) {
        c();
        Q();
        a((Runnable) new vs(this, m().a(woVar), woVar, a(true)));
    }

    /* access modifiers changed from: protected */
    public final void a(AppMeasurement.g gVar) {
        c();
        Q();
        a((Runnable) new vl(this, gVar));
    }

    public final void a(AtomicReference<String> atomicReference) {
        c();
        Q();
        a((Runnable) new vj(this, atomicReference, a(false)));
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<rh>> atomicReference, String str, String str2, String str3) {
        c();
        Q();
        a((Runnable) new vq(this, atomicReference, str, str2, str3, a(false)));
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<wo>> atomicReference, String str, String str2, String str3, boolean z) {
        c();
        Q();
        a((Runnable) new vr(this, atomicReference, str, str2, str3, z, a(false)));
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<wo>> atomicReference, boolean z) {
        c();
        Q();
        a((Runnable) new vt(this, atomicReference, a(false), z));
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

    public final boolean y() {
        c();
        Q();
        return this.b != null;
    }

    /* access modifiers changed from: protected */
    public final void z() {
        c();
        Q();
        a((Runnable) new vn(this, a(true)));
    }
}
