package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.a.a;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.bq;
import com.google.android.gms.ads.internal.l;

@bfk
public final class aze extends aqh {
    private final String a;
    private boolean b;
    private final axv c;
    private l d;
    private final ayw e;

    public aze(Context context, String str, bar bar, jp jpVar, bq bqVar) {
        this(str, new axv(context, bar, jpVar, bqVar));
    }

    private aze(String str, axv axv) {
        this.a = str;
        this.c = axv;
        this.e = new ayw();
        au.q().a(axv);
    }

    private final void c() {
        if (this.d == null) {
            this.d = this.c.a(this.a);
            this.e.a(this.d);
        }
    }

    public final String A() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final aql B() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final apv C() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final void D() {
        if (this.d != null) {
            this.d.c(this.b);
            this.d.D();
            return;
        }
        fn.e("Interstitial ad must be loaded before showInterstitial().");
    }

    public final String a() {
        if (this.d != null) {
            return this.d.a();
        }
        return null;
    }

    public final void a(apc apc) {
        if (this.d != null) {
            this.d.a(apc);
        }
    }

    public final void a(aps aps) {
        this.e.d = aps;
        if (this.d != null) {
            this.e.a(this.d);
        }
    }

    public final void a(apv apv) {
        this.e.a = apv;
        if (this.d != null) {
            this.e.a(this.d);
        }
    }

    public final void a(aql aql) {
        this.e.b = aql;
        if (this.d != null) {
            this.e.a(this.d);
        }
    }

    public final void a(aqs aqs) {
        c();
        if (this.d != null) {
            this.d.a(aqs);
        }
    }

    public final void a(arg arg) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(asf asf) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final void a(atq atq) {
        this.e.c = atq;
        if (this.d != null) {
            this.e.a(this.d);
        }
    }

    public final void a(bcy bcy) {
        fn.e("setInAppPurchaseListener is deprecated and should not be called.");
    }

    public final void a(bde bde, String str) {
        fn.e("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    public final void a(cu cuVar) {
        this.e.e = cuVar;
        if (this.d != null) {
            this.e.a(this.d);
        }
    }

    public final void a(String str) {
    }

    public final void b(boolean z) {
        c();
        if (this.d != null) {
            this.d.b(z);
        }
    }

    public final boolean b(aoy aoy) {
        if (!ayz.a(aoy).contains("gw")) {
            c();
        }
        if (ayz.a(aoy).contains("_skipMediation")) {
            c();
        }
        if (aoy.j != null) {
            c();
        }
        if (this.d != null) {
            return this.d.b(aoy);
        }
        ayz q = au.q();
        if (ayz.a(aoy).contains("_ad")) {
            q.b(aoy, this.a);
        }
        azc a2 = q.a(aoy, this.a);
        if (a2 != null) {
            if (!a2.e) {
                a2.a();
                azd.a().e();
            } else {
                azd.a().d();
            }
            this.d = a2.a;
            a2.c.a(this.e);
            this.e.a(this.d);
            return a2.f;
        }
        c();
        azd.a().e();
        return this.d.b(aoy);
    }

    public final void c(boolean z) {
        this.b = z;
    }

    public final String d_() {
        if (this.d != null) {
            return this.d.d_();
        }
        return null;
    }

    public final void i() {
        if (this.d != null) {
            this.d.i();
        }
    }

    public final a j() {
        if (this.d != null) {
            return this.d.j();
        }
        return null;
    }

    public final apc k() {
        if (this.d != null) {
            return this.d.k();
        }
        return null;
    }

    public final boolean l() {
        return this.d != null && this.d.l();
    }

    public final void m() {
        if (this.d != null) {
            this.d.m();
        } else {
            fn.e("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    public final void n() {
        if (this.d != null) {
            this.d.n();
        }
    }

    public final void o() {
        if (this.d != null) {
            this.d.o();
        }
    }

    public final void p() {
        if (this.d != null) {
            this.d.p();
        }
    }

    public final boolean q() {
        return this.d != null && this.d.q();
    }

    public final ara r() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }
}
