package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.a.c;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.aoy;
import com.google.android.gms.internal.apc;
import com.google.android.gms.internal.ara;
import com.google.android.gms.internal.atj;
import com.google.android.gms.internal.atq;
import com.google.android.gms.internal.atw;
import com.google.android.gms.internal.atz;
import com.google.android.gms.internal.aub;
import com.google.android.gms.internal.aug;
import com.google.android.gms.internal.auh;
import com.google.android.gms.internal.aui;
import com.google.android.gms.internal.auj;
import com.google.android.gms.internal.auk;
import com.google.android.gms.internal.awe;
import com.google.android.gms.internal.awo;
import com.google.android.gms.internal.bab;
import com.google.android.gms.internal.bac;
import com.google.android.gms.internal.bae;
import com.google.android.gms.internal.bar;
import com.google.android.gms.internal.bav;
import com.google.android.gms.internal.bbe;
import com.google.android.gms.internal.bbh;
import com.google.android.gms.internal.bdo;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ew;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.mw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@bfk
public final class bl extends ay implements auj {
    private boolean j;
    /* access modifiers changed from: private */
    public ev k;
    private boolean l = false;

    public bl(Context context, bq bqVar, apc apc, String str, bar bar, jp jpVar) {
        super(context, apc, str, bar, jpVar, bqVar);
    }

    private final bac E() {
        if (this.e.j == null || !this.e.j.m) {
            return null;
        }
        return this.e.j.q;
    }

    private static ev a(ew ewVar, int i) {
        return new ev(ewVar.a.c, (mw) null, ewVar.b.c, i, ewVar.b.e, ewVar.b.i, ewVar.b.k, ewVar.b.j, ewVar.a.i, ewVar.b.g, (bab) null, (bav) null, (String) null, ewVar.c, (bae) null, ewVar.b.h, ewVar.d, ewVar.b.f, ewVar.f, ewVar.g, ewVar.b.n, ewVar.h, (auk) null, ewVar.b.A, ewVar.b.B, ewVar.b.B, ewVar.b.D, ewVar.b.E, (String) null, ewVar.b.H, ewVar.b.L, ewVar.i, ewVar.b.O, ewVar.j);
    }

    private final boolean b(ev evVar, ev evVar2) {
        b((List<String>) null);
        if (!this.e.d()) {
            fn.e("Native ad does not have custom rendering mode.");
            a(0);
            return false;
        }
        try {
            bbe h = evVar2.o != null ? evVar2.o.h() : null;
            bbh i = evVar2.o != null ? evVar2.o.i() : null;
            awe n = evVar2.o != null ? evVar2.o.n() : null;
            String c = c(evVar2);
            if (h == null || this.e.q == null) {
                if (i != null) {
                    if (this.e.r != null) {
                        aub aub = new aub(i.a(), i.b(), i.c(), i.d() != null ? i.d() : null, i.e(), i.f(), (atw) null, i.j(), i.l(), i.n() != null ? (View) c.a(i.n()) : null, i.o(), c);
                        aub.a((aui) new auh(this.e.c, (auj) this, this.e.d, i, (auk) aub));
                        gw.a.post(new bo(this, aub));
                    }
                }
                if (n != null) {
                    if (!(this.e.t == null || this.e.t.get(n.l()) == null)) {
                        gw.a.post(new bp(this, n));
                    }
                }
                fn.e("No matching mapper/listener for retrieved native ad template.");
                a(0);
                return false;
            }
            atz atz = new atz(h.a(), h.b(), h.c(), h.d() != null ? h.d() : null, h.e(), h.f(), h.g(), h.h(), (atw) null, h.l(), h.m(), h.p() != null ? (View) c.a(h.p()) : null, h.q(), c);
            atz.a((aui) new auh(this.e.c, (auj) this, this.e.d, h, (auk) atz));
            gw.a.post(new bn(this, atz));
            return super.a(evVar, evVar2);
        } catch (RemoteException e) {
            fn.c("Failed to get native ad mapper", e);
            a(0);
            return false;
        }
    }

    private final boolean c(ev evVar, ev evVar2) {
        View a = r.a(evVar2);
        if (a == null) {
            return false;
        }
        View nextView = this.e.f.getNextView();
        if (nextView != null) {
            if (nextView instanceof mw) {
                ((mw) nextView).destroy();
            }
            this.e.f.removeView(nextView);
        }
        if (!r.b(evVar2)) {
            try {
                a(a);
            } catch (Throwable th) {
                au.i().a(th, "AdLoaderManager.swapBannerViews");
                fn.c("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.e.f.getChildCount() > 1) {
            this.e.f.showNext();
        }
        if (evVar != null) {
            View nextView2 = this.e.f.getNextView();
            if (nextView2 != null) {
                this.e.f.removeView(nextView2);
            }
            this.e.c();
        }
        this.e.f.setMinimumWidth(k().f);
        this.e.f.setMinimumHeight(k().c);
        this.e.f.requestLayout();
        this.e.f.setVisibility(0);
        return true;
    }

    public final void D() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    public final void K() {
        fn.e("Unexpected call to AdLoaderManager method");
    }

    public final boolean M() {
        if (E() != null) {
            return E().o;
        }
        return false;
    }

    public final boolean N() {
        if (E() != null) {
            return E().p;
        }
        return false;
    }

    public final void O() {
        if (this.e.j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.j.p) || this.e.j.n == null || !this.e.j.n.b()) {
            super.O();
        } else {
            x();
        }
    }

    public final void P() {
        if (this.e.j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.j.p) || this.e.j.n == null || !this.e.j.n.b()) {
            super.P();
        } else {
            w();
        }
    }

    public final void a(atq atq) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    public final void a(aug aug) {
        fn.e("Unexpected call to AdLoaderManager method");
    }

    public final void a(aui aui) {
        fn.e("Unexpected call to AdLoaderManager method");
    }

    public final void a(ew ewVar, atj atj) {
        this.k = null;
        if (ewVar.e != -2) {
            this.k = a(ewVar, ewVar.e);
        } else if (!ewVar.b.g) {
            fn.e("partialAdState is not mediation");
            this.k = a(ewVar, 0);
        }
        if (this.k != null) {
            gw.a.post(new bm(this));
            return;
        }
        if (ewVar.d != null) {
            this.e.i = ewVar.d;
        }
        this.e.F = 0;
        av avVar = this.e;
        au.d();
        avVar.h = bdo.a(this.e.c, this, ewVar, this.e.d, (mw) null, this.i, this, atj);
    }

    /* access modifiers changed from: protected */
    public final boolean a(aoy aoy, ev evVar, boolean z) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean a(ev evVar, ev evVar2) {
        boolean z;
        if (!this.e.d()) {
            throw new IllegalStateException("AdLoader API does not support custom rendering.");
        } else if (!evVar2.m) {
            a(0);
            fn.e("newState is not mediation.");
            return false;
        } else {
            if (evVar2.n != null && evVar2.n.a()) {
                if (this.e.d() && this.e.f != null) {
                    this.e.f.a().c(evVar2.z);
                }
                if (!super.a(evVar, evVar2)) {
                    z = false;
                } else if (!this.e.d() || c(evVar, evVar2)) {
                    if (!this.e.e()) {
                        super.a(evVar2, false);
                    }
                    z = true;
                } else {
                    a(0);
                    z = false;
                }
                if (!z) {
                    return false;
                }
                this.l = true;
            } else if (evVar2.n == null || !evVar2.n.b()) {
                a(0);
                fn.e("Response is neither banner nor native.");
                return false;
            } else if (!b(evVar, evVar2)) {
                return false;
            }
            c(new ArrayList(Arrays.asList(new Integer[]{2})));
            return true;
        }
    }

    public final awo b(String str) {
        y.b("getOnCustomClickListener must be called on the main UI thread.");
        return this.e.s.get(str);
    }

    public final void b(List<String> list) {
        y.b("setNativeTemplates must be called on the main UI thread.");
        this.e.C = list;
    }

    public final void b(boolean z) {
        y.b("setManualImpressionsEnabled must be called from the main thread.");
        this.j = z;
    }

    public final boolean b(aoy aoy) {
        if (this.e.y != null && this.e.y.size() == 1 && this.e.y.get(0).intValue() == 2) {
            fn.c("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            a(0);
            return false;
        } else if (this.e.x == null) {
            return super.b(aoy);
        } else {
            if (aoy.h != this.j) {
                aoy = new aoy(aoy.a, aoy.b, aoy.c, aoy.d, aoy.e, aoy.f, aoy.g, aoy.h || this.j, aoy.i, aoy.j, aoy.k, aoy.l, aoy.m, aoy.n, aoy.o, aoy.p, aoy.q, aoy.r);
            }
            return super.b(aoy);
        }
    }

    public final void c(List<Integer> list) {
        y.b("setAllowedAdTypes must be called on the main UI thread.");
        this.e.y = list;
    }

    public final void n() {
        if (!this.l) {
            throw new IllegalStateException("Native Ad does not support pause().");
        }
        super.n();
    }

    public final void o() {
        if (!this.l) {
            throw new IllegalStateException("Native Ad does not support resume().");
        }
        super.o();
    }

    public final ara r() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final void v() {
        super.v();
        ev evVar = this.e.j;
        if (evVar != null && evVar.n != null && evVar.n.a() && this.e.x != null) {
            try {
                this.e.x.a(this, c.a(this.e.c));
            } catch (RemoteException e) {
                fn.c("Could not call PublisherAdViewLoadedListener.onPublisherAdViewLoaded().", e);
            }
        }
    }
}
