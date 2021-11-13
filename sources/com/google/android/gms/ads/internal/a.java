package com.google.android.gms.ads.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.internal.gmsg.i;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.g;
import com.google.android.gms.internal.ala;
import com.google.android.gms.internal.aoh;
import com.google.android.gms.internal.aoi;
import com.google.android.gms.internal.aot;
import com.google.android.gms.internal.aoy;
import com.google.android.gms.internal.aoz;
import com.google.android.gms.internal.apc;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.aps;
import com.google.android.gms.internal.apv;
import com.google.android.gms.internal.aqh;
import com.google.android.gms.internal.aql;
import com.google.android.gms.internal.aqs;
import com.google.android.gms.internal.ara;
import com.google.android.gms.internal.arg;
import com.google.android.gms.internal.asd;
import com.google.android.gms.internal.asf;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.ath;
import com.google.android.gms.internal.atj;
import com.google.android.gms.internal.atq;
import com.google.android.gms.internal.bcy;
import com.google.android.gms.internal.bde;
import com.google.android.gms.internal.bdp;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.bfm;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cu;
import com.google.android.gms.internal.dw;
import com.google.android.gms.internal.ep;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ew;
import com.google.android.gms.internal.ex;
import com.google.android.gms.internal.ff;
import com.google.android.gms.internal.fg;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.jc;
import com.google.android.gms.internal.or;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;

@bfk
public abstract class a extends aqh implements i, q, aot, bdp, bfm, ff {
    protected atj a;
    protected ath b;
    protected boolean c = false;
    protected final ak d;
    protected final av e;
    protected transient aoy f;
    protected final ala g;
    protected final bq h;
    private ath i;

    a(av avVar, ak akVar, bq bqVar) {
        this.e = avVar;
        this.d = new ak(this);
        this.h = bqVar;
        au.e().b(this.e.c);
        au.e().c(this.e.c);
        fl.a(this.e.c);
        au.A().a(this.e.c);
        au.i().a(this.e.c, this.e.e);
        au.j().a(this.e.c);
        this.g = au.i().u();
        au.h().a(this.e.c);
        au.C().a(this.e.c);
        if (((Boolean) app.f().a(asw.bX)).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(new ab(this, new CountDownLatch(((Integer) app.f().a(asw.bZ)).intValue()), timer), 0, ((Long) app.f().a(asw.bY)).longValue());
        }
    }

    protected static boolean a(aoy aoy) {
        Bundle bundle = aoy.m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    private static long b(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException e2) {
            fn.e("Invalid index for Url fetch time in CSI latency info.");
        } catch (NumberFormatException e3) {
            fn.e("Cannot find valid format of Url fetch time in CSI latency info.");
        }
        return -1;
    }

    public String A() {
        return this.e.b;
    }

    public final aql B() {
        return this.e.o;
    }

    public final apv C() {
        return this.e.n;
    }

    /* access modifiers changed from: protected */
    public final List<String> a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String a2 : list) {
            arrayList.add(ep.a(a2, this.e.c));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void a(int i2) {
        a(i2, false);
    }

    /* access modifiers changed from: protected */
    public void a(int i2, boolean z) {
        fn.e(new StringBuilder(30).append("Failed to load ad: ").append(i2).toString());
        this.c = z;
        if (this.e.n != null) {
            try {
                this.e.n.a(i2);
            } catch (RemoteException e2) {
                fn.c("Could not call AdListener.onAdFailedToLoad().", e2);
            }
        }
        if (this.e.A != null) {
            try {
                this.e.A.a(i2);
            } catch (RemoteException e3) {
                fn.c("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(View view) {
        aw awVar = this.e.f;
        if (awVar != null) {
            awVar.addView(view, au.g().d());
        }
    }

    public final void a(apc apc) {
        y.b("setAdSize must be called on the main UI thread.");
        this.e.i = apc;
        if (!(this.e.j == null || this.e.j.b == null || this.e.F != 0)) {
            this.e.j.b.a(or.a(apc));
        }
        if (this.e.f != null) {
            if (this.e.f.getChildCount() > 1) {
                this.e.f.removeView(this.e.f.getNextView());
            }
            this.e.f.setMinimumWidth(apc.f);
            this.e.f.setMinimumHeight(apc.c);
            this.e.f.requestLayout();
        }
    }

    public final void a(aps aps) {
        y.b("setAdListener must be called on the main UI thread.");
        this.e.m = aps;
    }

    public final void a(apv apv) {
        y.b("setAdListener must be called on the main UI thread.");
        this.e.n = apv;
    }

    public final void a(aql aql) {
        y.b("setAppEventListener must be called on the main UI thread.");
        this.e.o = aql;
    }

    public final void a(aqs aqs) {
        y.b("setCorrelationIdProvider must be called on the main UI thread");
        this.e.p = aqs;
    }

    public final void a(arg arg) {
        y.b("setIconAdOptions must be called on the main UI thread.");
        this.e.w = arg;
    }

    public final void a(asf asf) {
        y.b("setVideoOptions must be called on the main UI thread.");
        this.e.v = asf;
    }

    public final void a(ath ath) {
        this.a = new atj(((Boolean) app.f().a(asw.H)).booleanValue(), "load_ad", this.e.i.a);
        this.i = new ath(-1, (String) null, (ath) null);
        if (ath == null) {
            this.b = new ath(-1, (String) null, (ath) null);
        } else {
            this.b = new ath(ath.a(), ath.b(), ath.c());
        }
    }

    public void a(atq atq) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void a(bcy bcy) {
        fn.e("setInAppPurchaseListener is deprecated and should not be called.");
    }

    public final void a(bde bde, String str) {
        fn.e("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    public final void a(cu cuVar) {
        y.b("setRewardedVideoAdListener can only be called from the UI thread.");
        this.e.A = cuVar;
    }

    public final void a(ew ewVar) {
        if (ewVar.b.m != -1 && !TextUtils.isEmpty(ewVar.b.w)) {
            long b2 = b(ewVar.b.w);
            if (b2 != -1) {
                ath a2 = this.a.a(b2 + ewVar.b.m);
                this.a.a(a2, "stc");
            }
        }
        this.a.a(ewVar.b.w);
        this.a.a(this.b, "arf");
        this.i = this.a.a();
        this.a.a("gqi", ewVar.b.x);
        this.e.g = null;
        this.e.k = ewVar;
        ewVar.i.a((aoh) new ax(this, ewVar));
        ewVar.i.a(aoi.a.b.AD_LOADED);
        a(ewVar, this.a);
    }

    /* access modifiers changed from: protected */
    public abstract void a(ew ewVar, atj atj);

    public final void a(String str) {
        y.b("setUserId must be called on the main UI thread.");
        this.e.B = str;
    }

    public final void a(String str, String str2) {
        if (this.e.o != null) {
            try {
                this.e.o.a(str, str2);
            } catch (RemoteException e2) {
                fn.c("Could not call the AppEventListener.", e2);
            }
        }
    }

    public final void a(HashSet<ex> hashSet) {
        this.e.a(hashSet);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(aoy aoy, atj atj);

    /* access modifiers changed from: package-private */
    public boolean a(ev evVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(ev evVar, ev evVar2);

    /* access modifiers changed from: protected */
    public final void b(dw dwVar) {
        if (this.e.A != null) {
            String str = "";
            int i2 = 1;
            if (dwVar != null) {
                try {
                    str = dwVar.a;
                    i2 = dwVar.b;
                } catch (RemoteException e2) {
                    fn.c("Could not call RewardedVideoAdListener.onRewarded().", e2);
                    return;
                }
            }
            this.e.A.a((cm) new ch(str, i2));
        }
    }

    public void b(ev evVar) {
        this.a.a(this.i, "awr");
        this.e.h = null;
        if (!(evVar.d == -2 || evVar.d == 3 || this.e.a() == null)) {
            au.i().a(this.e.a());
        }
        if (evVar.d == -1) {
            this.c = false;
            return;
        }
        if (a(evVar)) {
            fn.b("Ad refresh scheduled.");
        }
        if (evVar.d != -2) {
            if (evVar.d == 3) {
                evVar.H.a(aoi.a.b.AD_FAILED_TO_LOAD_NO_FILL);
            } else {
                evVar.H.a(aoi.a.b.AD_FAILED_TO_LOAD);
            }
            a(evVar.d);
            return;
        }
        if (this.e.D == null) {
            this.e.D = new fg(this.e.b);
        }
        if (this.e.f != null) {
            this.e.f.a().d(evVar.A);
        }
        this.g.a(this.e.j);
        if (a(this.e.j, evVar)) {
            this.e.j = evVar;
            av avVar = this.e;
            if (avVar.l != null) {
                if (avVar.j != null) {
                    avVar.l.a(avVar.j.x);
                    avVar.l.b(avVar.j.y);
                    avVar.l.b(avVar.j.m);
                }
                avVar.l.a(avVar.i.d);
            }
            this.a.a("is_mraid", this.e.j.a() ? "1" : "0");
            this.a.a("is_mediation", this.e.j.m ? "1" : "0");
            if (!(this.e.j.b == null || this.e.j.b.w() == null)) {
                this.a.a("is_delay_pl", this.e.j.b.w().f() ? "1" : "0");
            }
            this.a.a(this.b, "ttc");
            if (au.i().e() != null) {
                au.i().e().a(this.a);
            }
            z();
            if (this.e.d()) {
                v();
            }
        }
        if (evVar.G != null) {
            au.e().a(this.e.c, evVar.G);
        }
    }

    public void b(boolean z) {
        fn.e("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public boolean b(aoy aoy) {
        y.b("loadAd must be called on the main UI thread.");
        au.j().a();
        if (((Boolean) app.f().a(asw.aB)).booleanValue()) {
            aoy.a(aoy);
        }
        if (g.c(this.e.c) && aoy.k != null) {
            aoy = new aoz(aoy).a((Location) null).a();
        }
        if (this.e.g == null && this.e.h == null) {
            fn.d("Starting ad request.");
            a((ath) null);
            this.b = this.a.a();
            if (aoy.f) {
                fn.d("This request is sent from a test device.");
            } else {
                app.a();
                String a2 = jc.a(this.e.c);
                fn.d(new StringBuilder(String.valueOf(a2).length() + 71).append("Use AdRequest.Builder.addTestDevice(\"").append(a2).append("\") to get test ads on this device.").toString());
            }
            this.d.a(aoy);
            this.c = a(aoy, this.a);
            return this.c;
        }
        if (this.f != null) {
            fn.e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
        } else {
            fn.e("Loading already in progress, saving this object for future refreshes.");
        }
        this.f = aoy;
        return false;
    }

    public void c(boolean z) {
        throw new IllegalStateException("onImmersiveModeUpdated is not supported for current ad type");
    }

    /* access modifiers changed from: protected */
    public boolean c(aoy aoy) {
        if (this.e.f == null) {
            return false;
        }
        ViewParent parent = this.e.f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return au.e().a(view, view.getContext());
    }

    /* access modifiers changed from: protected */
    public void d(boolean z) {
        fn.d("Ad finished loading.");
        this.c = z;
        if (this.e.n != null) {
            try {
                this.e.n.c();
            } catch (RemoteException e2) {
                fn.c("Could not call AdListener.onAdLoaded().", e2);
            }
        }
        if (this.e.A != null) {
            try {
                this.e.A.a();
            } catch (RemoteException e3) {
                fn.c("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", e3);
            }
        }
    }

    public void e() {
        if (this.e.j == null) {
            fn.e("Ad state was null when trying to ping click URLs.");
            return;
        }
        fn.b("Pinging click URLs.");
        if (this.e.l != null) {
            this.e.l.b();
        }
        if (this.e.j.c != null) {
            au.e();
            gw.a(this.e.c, this.e.e.a, a(this.e.j.c));
        }
        if (this.e.m != null) {
            try {
                this.e.m.a();
            } catch (RemoteException e2) {
                fn.c("Could not notify onAdClicked event.", e2);
            }
        }
    }

    public final void g() {
        t();
    }

    public final bq h() {
        return this.h;
    }

    public void i() {
        y.b("destroy must be called on the main UI thread.");
        this.d.a();
        this.g.b(this.e.j);
        av avVar = this.e;
        if (avVar.f != null) {
            avVar.f.b();
        }
        avVar.n = null;
        avVar.o = null;
        avVar.z = null;
        avVar.p = null;
        avVar.a(false);
        if (avVar.f != null) {
            avVar.f.removeAllViews();
        }
        avVar.b();
        avVar.c();
        avVar.j = null;
    }

    public final com.google.android.gms.a.a j() {
        y.b("getAdFrame must be called on the main UI thread.");
        return c.a(this.e.f);
    }

    public final apc k() {
        y.b("getAdSize must be called on the main UI thread.");
        if (this.e.i == null) {
            return null;
        }
        return new asd(this.e.i);
    }

    public final boolean l() {
        y.b("isLoaded must be called on the main UI thread.");
        return this.e.g == null && this.e.h == null && this.e.j != null;
    }

    public final void m() {
        y.b("recordManualImpression must be called on the main UI thread.");
        if (this.e.j == null) {
            fn.e("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        fn.b("Pinging manual tracking URLs.");
        if (!this.e.j.E) {
            ArrayList arrayList = new ArrayList();
            if (this.e.j.f != null) {
                arrayList.addAll(this.e.j.f);
            }
            if (!(this.e.j.n == null || this.e.j.n.h == null)) {
                arrayList.addAll(this.e.j.n.h);
            }
            if (!arrayList.isEmpty()) {
                au.e();
                gw.a(this.e.c, this.e.e.a, (List<String>) arrayList);
                this.e.j.E = true;
            }
        }
    }

    public void n() {
        y.b("pause must be called on the main UI thread.");
    }

    public void o() {
        y.b("resume must be called on the main UI thread.");
    }

    public final void p() {
        y.b("stopLoading must be called on the main UI thread.");
        this.c = false;
        this.e.a(true);
    }

    public final boolean q() {
        return this.c;
    }

    public ara r() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void s() {
        fn.d("Ad closing.");
        if (this.e.n != null) {
            try {
                this.e.n.a();
            } catch (RemoteException e2) {
                fn.c("Could not call AdListener.onAdClosed().", e2);
            }
        }
        if (this.e.A != null) {
            try {
                this.e.A.d();
            } catch (RemoteException e3) {
                fn.c("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void t() {
        fn.d("Ad leaving application.");
        if (this.e.n != null) {
            try {
                this.e.n.b();
            } catch (RemoteException e2) {
                fn.c("Could not call AdListener.onAdLeftApplication().", e2);
            }
        }
        if (this.e.A != null) {
            try {
                this.e.A.e();
            } catch (RemoteException e3) {
                fn.c("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void u() {
        fn.d("Ad opening.");
        if (this.e.n != null) {
            try {
                this.e.n.d();
            } catch (RemoteException e2) {
                fn.c("Could not call AdListener.onAdOpened().", e2);
            }
        }
        if (this.e.A != null) {
            try {
                this.e.A.b();
            } catch (RemoteException e3) {
                fn.c("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void v() {
        d(false);
    }

    public final void w() {
        fn.d("Ad impression.");
        if (this.e.n != null) {
            try {
                this.e.n.f();
            } catch (RemoteException e2) {
                fn.c("Could not call AdListener.onAdImpression().", e2);
            }
        }
    }

    public final void x() {
        fn.d("Ad clicked.");
        if (this.e.n != null) {
            try {
                this.e.n.e();
            } catch (RemoteException e2) {
                fn.c("Could not call AdListener.onAdClicked().", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void y() {
        if (this.e.A != null) {
            try {
                this.e.A.c();
            } catch (RemoteException e2) {
                fn.c("Could not call RewardedVideoAdListener.onVideoStarted().", e2);
            }
        }
    }

    public final void z() {
        ev evVar = this.e.j;
        if (evVar != null && !TextUtils.isEmpty(evVar.A) && !evVar.F && au.n().b()) {
            fn.b("Sending troubleshooting signals to the server.");
            au.n().b(this.e.c, this.e.e.a, evVar.A, this.e.b);
            evVar.F = true;
        }
    }
}
