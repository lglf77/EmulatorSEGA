package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.ads.internal.gmsg.ae;
import com.google.android.gms.ads.internal.gmsg.g;
import com.google.android.gms.ads.internal.gmsg.h;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.amb;
import com.google.android.gms.internal.amf;
import com.google.android.gms.internal.aoy;
import com.google.android.gms.internal.apc;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.atj;
import com.google.android.gms.internal.bab;
import com.google.android.gms.internal.bac;
import com.google.android.gms.internal.bar;
import com.google.android.gms.internal.bcp;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.bk;
import com.google.android.gms.internal.dw;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ei;
import com.google.android.gms.internal.el;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ew;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.mx;
import com.google.android.gms.internal.nd;
import com.google.android.gms.internal.or;
import com.google.android.gms.internal.z;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class l extends bd implements ae, h {
    private transient boolean j = false;
    private int k = -1;
    /* access modifiers changed from: private */
    public boolean l;
    /* access modifiers changed from: private */
    public float m;
    /* access modifiers changed from: private */
    public boolean n;
    private el o;
    private String p;
    private final String q;

    public l(Context context, apc apc, String str, bar bar, jp jpVar, bq bqVar) {
        super(context, apc, str, bar, jpVar, bqVar);
        this.q = (apc == null || !"reward_mb".equals(apc.a)) ? "/Interstitial" : "/Rewarded";
    }

    private final void a(Bundle bundle) {
        au.e().b(this.e.c, this.e.e.a, "gmob-apps", bundle, false);
    }

    private static ew b(ew ewVar) {
        try {
            String jSONObject = bk.a(ewVar.b).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ewVar.a.e);
            bab bab = new bab(jSONObject, (String) null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), (String) null, (String) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), (String) null, Collections.emptyList(), Collections.emptyList(), (String) null, (String) null, (String) null, (List<String>) null, (String) null, Collections.emptyList(), (String) null, -1);
            z zVar = ewVar.b;
            bac bac = new bac(Collections.singletonList(bab), ((Long) app.f().a(asw.bn)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zVar.H, zVar.I, "", -1, 0, 1, (String) null, 0, -1, -1, false);
            return new ew(ewVar.a, new z(ewVar.a, zVar.a, zVar.b, Collections.emptyList(), Collections.emptyList(), zVar.f, true, zVar.h, Collections.emptyList(), zVar.j, zVar.k, zVar.l, zVar.m, zVar.n, zVar.o, zVar.p, (String) null, zVar.r, zVar.s, zVar.t, zVar.u, zVar.v, zVar.x, zVar.y, zVar.z, (dw) null, Collections.emptyList(), Collections.emptyList(), zVar.D, zVar.E, zVar.F, zVar.G, zVar.H, zVar.I, zVar.J, (ee) null, zVar.L, zVar.M, zVar.N, zVar.O, 0), bac, ewVar.d, ewVar.e, ewVar.f, ewVar.g, (JSONObject) null, ewVar.i, (Boolean) null);
        } catch (JSONException e) {
            fn.b("Unable to generate ad state for an interstitial ad with pooling.", e);
            return ewVar;
        }
    }

    public final void D() {
        Bitmap bitmap = null;
        y.b("showInterstitial must be called on the main UI thread.");
        if (au.z().d(this.e.c)) {
            this.p = au.z().f(this.e.c);
            String valueOf = String.valueOf(this.p);
            String valueOf2 = String.valueOf(this.q);
            this.p = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.e.j == null) {
            fn.e("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) app.f().a(asw.bd)).booleanValue()) {
            String packageName = this.e.c.getApplicationContext() != null ? this.e.c.getApplicationContext().getPackageName() : this.e.c.getPackageName();
            if (!this.j) {
                fn.e("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_before_load_finish");
                a(bundle);
            }
            au.e();
            if (!gw.g(this.e.c)) {
                fn.e("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle2 = new Bundle();
                bundle2.putString("appid", packageName);
                bundle2.putString("action", "show_interstitial_app_not_in_foreground");
                a(bundle2);
            }
        }
        if (this.e.e()) {
            return;
        }
        if (this.e.j.m && this.e.j.o != null) {
            try {
                if (((Boolean) app.f().a(asw.aD)).booleanValue()) {
                    this.e.j.o.a(this.n);
                }
                this.e.j.o.b();
            } catch (RemoteException e) {
                fn.c("Could not show interstitial.", e);
                F();
            }
        } else if (this.e.j.b == null) {
            fn.e("The interstitial failed to load.");
        } else if (this.e.j.b.z()) {
            fn.e("The interstitial is already showing.");
        } else {
            this.e.j.b.b(true);
            av avVar = this.e;
            mw mwVar = this.e.j.b;
            if (mwVar == null) {
                throw null;
            }
            avVar.a((View) mwVar);
            if (this.e.j.j != null) {
                this.g.a(this.e.i, this.e.j);
            }
            ev evVar = this.e.j;
            if (evVar.a()) {
                Context context = this.e.c;
                mw mwVar2 = evVar.b;
                if (mwVar2 == null) {
                    throw null;
                }
                new amb(context, (View) mwVar2).a((amf) evVar.b);
            } else {
                evVar.b.w().a((nd) new m(this, evVar));
            }
            if (this.e.G) {
                au.e();
                bitmap = gw.h(this.e.c);
            }
            this.k = au.w().a(bitmap);
            if (!((Boolean) app.f().a(asw.bE)).booleanValue() || bitmap == null) {
                p pVar = new p(this.e.G, E(), false, 0.0f, -1, this.n, this.e.j.I);
                int A = this.e.j.b.A();
                if (A == -1) {
                    A = this.e.j.g;
                }
                AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.e.j.b, A, this.e.e, this.e.j.z, pVar);
                au.c();
                com.google.android.gms.ads.internal.overlay.l.a(this.e.c, adOverlayInfoParcel, true);
                return;
            }
            new n(this, this.k).h();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean E() {
        if (!(this.e.c instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.e.c).getWindow();
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        return (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
    }

    public final void F() {
        au.w().b(Integer.valueOf(this.k));
        if (this.e.d()) {
            this.e.b();
            this.e.j = null;
            this.e.G = false;
            this.j = false;
        }
    }

    /* access modifiers changed from: protected */
    public final mw a(ew ewVar, br brVar, ei eiVar) {
        mw a = au.f().a(this.e.c, or.a(this.e.i), this.e.i.a, false, false, this.e.d, this.e.e, this.a, this, this.h, ewVar.i);
        a.w().a(this, (n) null, this, this, ((Boolean) app.f().a(asw.ac)).booleanValue(), this, brVar, (bcp) null, eiVar);
        a(a);
        a.b(ewVar.a.v);
        a.w().a("/reward", (aa<? super mw>) new g(this));
        return a;
    }

    public final void a(dw dwVar) {
        if (this.e.j != null) {
            if (this.e.j.w != null) {
                au.e();
                gw.a(this.e.c, this.e.e.a, this.e.j.w);
            }
            if (this.e.j.u != null) {
                dwVar = this.e.j.u;
            }
        }
        b(dwVar);
    }

    public final void a(ew ewVar, atj atj) {
        if (!((Boolean) app.f().a(asw.aF)).booleanValue()) {
            super.a(ewVar, atj);
        } else if (ewVar.e != -2) {
            super.a(ewVar, atj);
        } else {
            boolean z = !ewVar.b.g;
            if (a(ewVar.a.c) && z) {
                this.e.k = b(ewVar);
            }
            super.a(this.e.k, atj);
        }
    }

    public final void a(boolean z) {
        this.e.G = z;
    }

    public final void a(boolean z, float f) {
        this.l = z;
        this.m = f;
    }

    public final boolean a(aoy aoy, atj atj) {
        if (this.e.j != null) {
            fn.e("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.o == null && a(aoy) && au.z().d(this.e.c) && !TextUtils.isEmpty(this.e.b)) {
            this.o = new el(this.e.c, this.e.b);
        }
        return super.a(aoy, atj);
    }

    /* access modifiers changed from: protected */
    public final boolean a(aoy aoy, ev evVar, boolean z) {
        if (this.e.d() && evVar.b != null) {
            au.g();
            hc.a(evVar.b);
        }
        return this.d.d();
    }

    public final boolean a(ev evVar, ev evVar2) {
        if (!super.a(evVar, evVar2)) {
            return false;
        }
        if (!(this.e.d() || this.e.E == null || evVar2.j == null)) {
            this.g.a(this.e.i, evVar2, this.e.E);
        }
        return true;
    }

    public final void a_() {
        if (!(this.e.j == null || this.e.j.v == null)) {
            au.e();
            gw.a(this.e.c, this.e.e.a, this.e.j.v);
        }
        y();
    }

    public final void b() {
        super.b();
        this.g.a(this.e.j);
        if (this.o != null) {
            this.o.a(false);
        }
    }

    public final void c(boolean z) {
        y.b("setImmersiveMode must be called on the main UI thread.");
        this.n = z;
    }

    public final void f() {
        mx w;
        W();
        super.f();
        if (!(this.e.j == null || this.e.j.b == null || (w = this.e.j.b.w()) == null)) {
            w.h();
        }
        if (!(!au.z().d(this.e.c) || this.e.j == null || this.e.j.b == null)) {
            au.z().c(this.e.j.b.getContext(), this.p);
        }
        if (this.o != null) {
            this.o.a(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void s() {
        F();
        super.s();
    }

    /* access modifiers changed from: protected */
    public final void v() {
        super.v();
        this.j = true;
    }
}
