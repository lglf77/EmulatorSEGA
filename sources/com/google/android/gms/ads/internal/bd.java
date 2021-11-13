package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.ads.internal.gmsg.ae;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ala;
import com.google.android.gms.internal.apc;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.atj;
import com.google.android.gms.internal.atq;
import com.google.android.gms.internal.auk;
import com.google.android.gms.internal.bab;
import com.google.android.gms.internal.bae;
import com.google.android.gms.internal.bar;
import com.google.android.gms.internal.bav;
import com.google.android.gms.internal.bcp;
import com.google.android.gms.internal.bdo;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.ei;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ew;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.or;

@bfk
public class bd extends ay implements f, bcp {
    private boolean j;

    public bd(Context context, apc apc, String str, bar bar, jp jpVar, bq bqVar) {
        super(context, apc, str, bar, jpVar, bqVar);
    }

    public final void G() {
        s();
    }

    /* access modifiers changed from: protected */
    public mw a(ew ewVar, br brVar, ei eiVar) {
        View nextView = this.e.f.getNextView();
        if (nextView instanceof mw) {
            ((mw) nextView).destroy();
        }
        if (nextView != null) {
            this.e.f.removeView(nextView);
        }
        mw a = au.f().a(this.e.c, or.a(this.e.i), this.e.i.a, false, false, this.e.d, this.e.e, this.a, this, this.h, ewVar.i);
        if (this.e.i.g == null) {
            if (a == null) {
                throw null;
            }
            a((View) a);
        }
        a.w().a(this, this, this, this, false, (ae) null, brVar, this, eiVar);
        a(a);
        a.b(ewVar.a.v);
        return a;
    }

    public final void a(int i, int i2, int i3, int i4) {
        u();
    }

    public final void a(atq atq) {
        y.b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.e.z = atq;
    }

    /* access modifiers changed from: protected */
    public void a(ew ewVar, atj atj) {
        if (ewVar.e != -2) {
            gw.a.post(new bf(this, ewVar));
            return;
        }
        if (ewVar.d != null) {
            this.e.i = ewVar.d;
        }
        if (!ewVar.b.g || ewVar.b.z) {
            gw.a.post(new bg(this, ewVar, this.h.c.a(this.e.c, this.e.e, ewVar.b), atj));
            return;
        }
        this.e.F = 0;
        av avVar = this.e;
        au.d();
        avVar.h = bdo.a(this.e.c, this, ewVar, this.e.d, (mw) null, this.i, this, atj);
    }

    /* access modifiers changed from: protected */
    public final void a(mw mwVar) {
        mwVar.a("/trackActiveViewUnit", (aa<? super mw>) new be(this));
    }

    /* access modifiers changed from: protected */
    public boolean a(ev evVar, ev evVar2) {
        if (this.e.d() && this.e.f != null) {
            this.e.f.a().c(evVar2.z);
        }
        try {
            if (evVar2.b != null && !evVar2.m && evVar2.J) {
                if (((Boolean) app.f().a(asw.cP)).booleanValue()) {
                    String str = evVar2.a.q;
                    if ((str == null || "com.google.ads.mediation.AbstractAdViewAdapter".equals(str)) && !evVar2.a.c.containsKey("sdk_less_server_data")) {
                        try {
                            evVar2.b.L();
                        } catch (Throwable th) {
                            fn.a("Could not render test Ad label.");
                        }
                    }
                }
            }
        } catch (RuntimeException e) {
            fn.a("Could not render test AdLabel.");
        }
        return super.a(evVar, evVar2);
    }

    public final void a_(View view) {
        this.e.E = view;
        b(new ev(this.e.k, (mw) null, (bab) null, (bav) null, (String) null, (bae) null, (auk) null, (String) null));
    }

    /* access modifiers changed from: package-private */
    public final void b(mw mwVar) {
        if (this.e.j != null) {
            ala ala = this.g;
            apc apc = this.e.i;
            ev evVar = this.e.j;
            if (mwVar == null) {
                throw null;
            }
            ala.a(apc, evVar, (View) mwVar, mwVar);
            this.j = false;
            return;
        }
        this.j = true;
        fn.e("Request to enable ActiveView before adState is available.");
    }

    public final void b_() {
        e();
    }

    public final void c_() {
        W();
        m();
    }

    /* access modifiers changed from: protected */
    public void v() {
        super.v();
        if (this.j) {
            if (((Boolean) app.f().a(asw.bS)).booleanValue()) {
                b(this.e.j.b);
            }
        }
    }
}
