package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.support.v4.c.f;
import android.util.Log;
import android.view.View;
import com.google.android.gms.a.c;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.ala;
import com.google.android.gms.internal.alg;
import com.google.android.gms.internal.amq;
import com.google.android.gms.internal.aoy;
import com.google.android.gms.internal.apc;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.ara;
import com.google.android.gms.internal.ard;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.atj;
import com.google.android.gms.internal.atq;
import com.google.android.gms.internal.atw;
import com.google.android.gms.internal.atz;
import com.google.android.gms.internal.aub;
import com.google.android.gms.internal.aud;
import com.google.android.gms.internal.aug;
import com.google.android.gms.internal.auh;
import com.google.android.gms.internal.aui;
import com.google.android.gms.internal.auj;
import com.google.android.gms.internal.auk;
import com.google.android.gms.internal.awe;
import com.google.android.gms.internal.awo;
import com.google.android.gms.internal.awr;
import com.google.android.gms.internal.bac;
import com.google.android.gms.internal.bar;
import com.google.android.gms.internal.bav;
import com.google.android.gms.internal.bbe;
import com.google.android.gms.internal.bbh;
import com.google.android.gms.internal.bcy;
import com.google.android.gms.internal.bdo;
import com.google.android.gms.internal.beq;
import com.google.android.gms.internal.beu;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ew;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.jn;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.kh;
import com.google.android.gms.internal.ks;
import com.google.android.gms.internal.mw;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class ac extends ay implements auj {
    private final Object j;
    private boolean k;
    private ks<auk> l;
    private mw m;
    private boolean n;
    private int o;
    private beq p;
    private final String q;

    public ac(Context context, bq bqVar, apc apc, String str, bar bar, jp jpVar) {
        this(context, bqVar, apc, str, bar, jpVar, false);
    }

    public ac(Context context, bq bqVar, apc apc, String str, bar bar, jp jpVar, boolean z) {
        super(context, apc, str, bar, jpVar, bqVar);
        this.j = new Object();
        this.l = new ks<>();
        this.o = 1;
        this.q = UUID.randomUUID().toString();
        this.k = z;
    }

    private final bac X() {
        if (this.e.j == null || !this.e.j.m) {
            return null;
        }
        return this.e.j.q;
    }

    private final void Y() {
        beq F = F();
        if (F != null) {
            F.a();
        }
    }

    /* access modifiers changed from: private */
    public static void a(av avVar, av avVar2) {
        if (avVar2.q == null) {
            avVar2.q = avVar.q;
        }
        if (avVar2.r == null) {
            avVar2.r = avVar.r;
        }
        if (avVar2.s == null) {
            avVar2.s = avVar.s;
        }
        if (avVar2.t == null) {
            avVar2.t = avVar.t;
        }
        if (avVar2.v == null) {
            avVar2.v = avVar.v;
        }
        if (avVar2.u == null) {
            avVar2.u = avVar.u;
        }
        if (avVar2.C == null) {
            avVar2.C = avVar.C;
        }
        if (avVar2.l == null) {
            avVar2.l = avVar.l;
        }
        if (avVar2.D == null) {
            avVar2.D = avVar.D;
        }
        if (avVar2.m == null) {
            avVar2.m = avVar.m;
        }
        if (avVar2.n == null) {
            avVar2.n = avVar.n;
        }
        if (avVar2.i == null) {
            avVar2.i = avVar.i;
        }
        if (avVar2.j == null) {
            avVar2.j = avVar.j;
        }
        if (avVar2.k == null) {
            avVar2.k = avVar.k;
        }
    }

    private final void a(atz atz) {
        gw.a.post(new ag(this, atz));
    }

    private final void a(aub aub) {
        gw.a.post(new ah(this, aub));
    }

    public final String A() {
        return this.e.b;
    }

    public final void D() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    /* access modifiers changed from: package-private */
    public final void E() {
        synchronized (this.j) {
            fn.a("Initializing webview native ads utills");
            this.p = new beu(this.e.c, this, this.q, this.e.d, this.e.e);
        }
    }

    public final beq F() {
        beq beq;
        synchronized (this.j) {
            beq = this.p;
        }
        return beq;
    }

    /* access modifiers changed from: protected */
    public final Future<auk> G() {
        return this.l;
    }

    public final void H() {
        if (this.e.j == null || this.m == null) {
            this.n = true;
            fn.e("Request to enable ActiveView before adState is available.");
            return;
        }
        ala u = au.i().u();
        apc apc = this.e.i;
        ev evVar = this.e.j;
        mw mwVar = this.m;
        if (mwVar == null) {
            throw null;
        }
        u.a(apc, evVar, (View) mwVar, this.m);
        this.n = false;
    }

    public final void I() {
        this.n = false;
        if (this.e.j == null || this.m == null) {
            fn.e("Request to enable ActiveView before adState is available.");
        } else {
            au.i().u().a(this.e.j);
        }
    }

    public final f<String, awr> J() {
        y.b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.e.t;
    }

    public final void K() {
        if (this.m != null) {
            this.m.destroy();
            this.m = null;
        }
    }

    public final void L() {
        if (this.m != null && this.m.b() != null && this.e.u != null && this.e.u.f != null) {
            this.m.b().a(this.e.u.f);
        }
    }

    public final boolean M() {
        if (X() != null) {
            return X().o;
        }
        return false;
    }

    public final boolean N() {
        if (X() != null) {
            return X().p;
        }
        return false;
    }

    public final void O() {
        if (this.e.j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.j.p)) {
            super.O();
        } else {
            x();
        }
    }

    public final void P() {
        if (this.e.j == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(this.e.j.p)) {
            super.P();
        } else {
            w();
        }
    }

    public final void Q() {
        ard h;
        ev evVar = this.e.j;
        if (evVar.o == null) {
            super.Q();
            return;
        }
        try {
            bav bav = evVar.o;
            ara ara = null;
            bbe h2 = bav.h();
            if (h2 != null) {
                ara = h2.m();
            } else {
                bbh i = bav.i();
                if (i != null) {
                    ara = i.l();
                } else {
                    awe n2 = bav.n();
                    if (n2 != null) {
                        ara = n2.c();
                    }
                }
            }
            if (ara != null && (h = ara.h()) != null) {
                h.d();
            }
        } catch (RemoteException e) {
            fn.c("Unable to call onVideoEnd()", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        a(i, false);
    }

    /* access modifiers changed from: protected */
    public final void a(int i, boolean z) {
        Y();
        super.a(i, z);
    }

    public final void a(atq atq) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public final void a(aug aug) {
        if (this.m != null) {
            this.m.a(aug);
        }
    }

    public final void a(aui aui) {
        if (this.e.j.j != null) {
            au.i().u().a(this.e.i, this.e.j, (amq) new alg(aui), (mw) null);
        }
    }

    public final void a(bcy bcy) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public final void a(ew ewVar, atj atj) {
        if (ewVar.d != null) {
            this.e.i = ewVar.d;
        }
        if (ewVar.e != -2) {
            gw.a.post(new ad(this, ewVar));
            return;
        }
        int i = ewVar.a.Y;
        if (i == 1) {
            this.e.F = 0;
            av avVar = this.e;
            au.d();
            avVar.h = bdo.a(this.e.c, this, ewVar, this.e.d, (mw) null, this.i, this, atj);
            String valueOf = String.valueOf(this.e.h.getClass().getName());
            fn.b(valueOf.length() != 0 ? "AdRenderer: ".concat(valueOf) : new String("AdRenderer: "));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(ewVar.b.b).getJSONArray("slots");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i2).getJSONArray("ads");
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    jSONArray.put(jSONArray3.get(i3));
                }
            }
            Y();
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(i);
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i; i4++) {
                arrayList.add(gq.a(newFixedThreadPool, new ae(this, i4, jSONArray, i, ewVar)));
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                try {
                    gw.a.post(new af(this, (auk) ((kh) arrayList.get(i5)).get(((Long) app.f().a(asw.bn)).longValue(), TimeUnit.MILLISECONDS), i5, arrayList));
                } catch (InterruptedException e) {
                    fn.c("Exception occurred while getting an ad response", e);
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException | TimeoutException e2) {
                    fn.c("Exception occurred while getting an ad response", e2);
                }
            }
        } catch (JSONException e3) {
            fn.c("Malformed native ad response", e3);
            a(0);
        }
    }

    public final void a(mw mwVar) {
        this.m = mwVar;
    }

    public final boolean a(aoy aoy, atj atj) {
        try {
            E();
            return super.a(aoy, atj, this.o);
        } catch (Exception e) {
            if (jn.a(4)) {
                Log.i("Ads", "Error initializing webview.", e);
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(aoy aoy, ev evVar, boolean z) {
        return this.d.d();
    }

    /* access modifiers changed from: protected */
    public final boolean a(ev evVar, ev evVar2) {
        b((List<String>) null);
        if (!this.e.d()) {
            throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
        }
        if (evVar2.m) {
            Y();
            try {
                bbe h = evVar2.o != null ? evVar2.o.h() : null;
                bbh i = evVar2.o != null ? evVar2.o.i() : null;
                awe n2 = evVar2.o != null ? evVar2.o.n() : null;
                String c = c(evVar2);
                if (h == null || this.e.q == null) {
                    if (i != null) {
                        if (this.e.r != null) {
                            aub aub = new aub(i.a(), i.b(), i.c(), i.d() != null ? i.d() : null, i.e(), i.f(), (atw) null, i.j(), i.l(), i.n() != null ? (View) c.a(i.n()) : null, i.o(), c);
                            aub.a((aui) new auh(this.e.c, (auj) this, this.e.d, i, (auk) aub));
                            a(aub);
                        }
                    }
                    if (n2 != null) {
                        if (!(this.e.t == null || this.e.t.get(n2.l()) == null)) {
                            gw.a.post(new aj(this, n2));
                        }
                    }
                    fn.e("No matching mapper/listener for retrieved native ad template.");
                    a(0);
                    return false;
                }
                atz atz = new atz(h.a(), h.b(), h.c(), h.d() != null ? h.d() : null, h.e(), h.f(), h.g(), h.h(), (atw) null, h.l(), h.m(), h.p() != null ? (View) c.a(h.p()) : null, h.q(), c);
                atz.a((aui) new auh(this.e.c, (auj) this, this.e.d, h, (auk) atz));
                a(atz);
            } catch (RemoteException e) {
                fn.c("Failed to get native ad mapper", e);
            }
        } else {
            auk auk = evVar2.B;
            if (this.k) {
                this.l.b(auk);
            } else if ((auk instanceof aub) && this.e.r != null) {
                a((aub) evVar2.B);
            } else if ((auk instanceof atz) && this.e.q != null) {
                a((atz) evVar2.B);
            } else if (!(auk instanceof aud) || this.e.t == null || this.e.t.get(((aud) auk).l()) == null) {
                fn.e("No matching listener for retrieved native ad template.");
                a(0);
                return false;
            } else {
                gw.a.post(new ai(this, ((aud) auk).l(), evVar2));
            }
        }
        return super.a(evVar, evVar2);
    }

    public final awo b(String str) {
        y.b("getOnCustomClickListener must be called on the main UI thread.");
        if (this.e.s == null) {
            return null;
        }
        return this.e.s.get(str);
    }

    public final void b(int i) {
        y.b("setMaxNumberOfAds must be called on the main UI thread.");
        this.o = i;
    }

    public final void b(List<String> list) {
        y.b("setNativeTemplates must be called on the main UI thread.");
        this.e.C = list;
    }

    /* access modifiers changed from: protected */
    public final void d(boolean z) {
        super.d(z);
        if (this.n) {
            if (((Boolean) app.f().a(asw.bS)).booleanValue()) {
                H();
            }
        }
    }

    public final String g_() {
        return this.q;
    }

    public final void n() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public final void o() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    /* access modifiers changed from: protected */
    public final void v() {
        d(false);
    }
}
