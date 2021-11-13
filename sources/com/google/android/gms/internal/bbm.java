package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.b.i;
import com.google.android.gms.ads.l;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.b;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@bfk
public final class bbm extends baw {
    private final b a;
    private bbn b;

    public bbm(b bVar) {
        this.a = bVar;
    }

    private final Bundle a(String str, aoy aoy, String str2) {
        String valueOf = String.valueOf(str);
        jn.e(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (aoy != null) {
                    bundle.putInt("tagForChildDirectedTreatment", aoy.g);
                }
            }
            return bundle;
        } catch (Throwable th) {
            jn.c("Could not get Server Parameters Bundle.", th);
            throw new RemoteException();
        }
    }

    private static boolean a(aoy aoy) {
        if (!aoy.f) {
            app.a();
            return jc.a();
        }
    }

    public final a a() {
        if (!(this.a instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            jn.e(valueOf.length() != 0 ? "MediationAdapter is not a MediationBannerAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return c.a(((MediationBannerAdapter) this.a).getBannerView());
        } catch (Throwable th) {
            jn.c("Could not get banner view from adapter.", th);
            throw new RemoteException();
        }
    }

    public final void a(a aVar) {
        try {
            ((j) this.a).a((Context) c.a(aVar));
        } catch (Throwable th) {
            jn.a("Could not inform adapter of changed context", th);
        }
    }

    public final void a(a aVar, aoy aoy, String str, bay bay) {
        a(aVar, aoy, str, (String) null, bay);
    }

    public final void a(a aVar, aoy aoy, String str, ds dsVar, String str2) {
        Bundle bundle;
        bbl bbl;
        if (!(this.a instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            jn.e(valueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        jn.b("Initialize rewarded video adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.a;
            Bundle a2 = a(str2, aoy, (String) null);
            if (aoy != null) {
                bbl bbl2 = new bbl(aoy.b == -1 ? null : new Date(aoy.b), aoy.d, aoy.e != null ? new HashSet(aoy.e) : null, aoy.k, a(aoy), aoy.g, aoy.r);
                if (aoy.m != null) {
                    bundle = aoy.m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                    bbl = bbl2;
                } else {
                    bundle = null;
                    bbl = bbl2;
                }
            } else {
                bundle = null;
                bbl = null;
            }
            mediationRewardedVideoAdAdapter.initialize((Context) c.a(aVar), bbl, str, new dv(dsVar), a2, bundle);
        } catch (Throwable th) {
            jn.c("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    public final void a(a aVar, aoy aoy, String str, String str2, bay bay) {
        if (!(this.a instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            jn.e(valueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        jn.b("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.a;
            mediationInterstitialAdapter.requestInterstitialAd((Context) c.a(aVar), new bbn(bay), a(str, aoy, str2), new bbl(aoy.b == -1 ? null : new Date(aoy.b), aoy.d, aoy.e != null ? new HashSet(aoy.e) : null, aoy.k, a(aoy), aoy.g, aoy.r), aoy.m != null ? aoy.m.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            jn.c("Could not request interstitial ad from adapter.", th);
            throw new RemoteException();
        }
    }

    public final void a(a aVar, aoy aoy, String str, String str2, bay bay, auv auv, List<String> list) {
        if (!(this.a instanceof MediationNativeAdapter)) {
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            jn.e(valueOf.length() != 0 ? "MediationAdapter is not a MediationNativeAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationNativeAdapter: "));
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) this.a;
            bbq bbq = new bbq(aoy.b == -1 ? null : new Date(aoy.b), aoy.d, aoy.e != null ? new HashSet(aoy.e) : null, aoy.k, a(aoy), aoy.g, auv, list, aoy.r);
            Bundle bundle = aoy.m != null ? aoy.m.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.b = new bbn(bay);
            mediationNativeAdapter.requestNativeAd((Context) c.a(aVar), this.b, a(str, aoy, str2), bbq, bundle);
        } catch (Throwable th) {
            jn.c("Could not request native ad from adapter.", th);
            throw new RemoteException();
        }
    }

    public final void a(a aVar, apc apc, aoy aoy, String str, bay bay) {
        a(aVar, apc, aoy, str, (String) null, bay);
    }

    public final void a(a aVar, apc apc, aoy aoy, String str, String str2, bay bay) {
        if (!(this.a instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            jn.e(valueOf.length() != 0 ? "MediationAdapter is not a MediationBannerAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        jn.b("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.a;
            mediationBannerAdapter.requestBannerAd((Context) c.a(aVar), new bbn(bay), a(str, aoy, str2), l.a(apc.e, apc.b, apc.a), new bbl(aoy.b == -1 ? null : new Date(aoy.b), aoy.d, aoy.e != null ? new HashSet(aoy.e) : null, aoy.k, a(aoy), aoy.g, aoy.r), aoy.m != null ? aoy.m.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            jn.c("Could not request banner ad from adapter.", th);
            throw new RemoteException();
        }
    }

    public final void a(a aVar, ds dsVar, List<String> list) {
        if (!(this.a instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            jn.e(valueOf.length() != 0 ? "MediationAdapter is not an InitializableMediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("MediationAdapter is not an InitializableMediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        jn.b("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.a;
            ArrayList arrayList = new ArrayList();
            for (String a2 : list) {
                arrayList.add(a(a2, (aoy) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) c.a(aVar), new dv(dsVar), arrayList);
        } catch (Throwable th) {
            jn.c("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    public final void a(aoy aoy, String str) {
        a(aoy, str, (String) null);
    }

    public final void a(aoy aoy, String str, String str2) {
        if (!(this.a instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            jn.e(valueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        jn.b("Requesting rewarded video ad from adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.a;
            mediationRewardedVideoAdAdapter.loadAd(new bbl(aoy.b == -1 ? null : new Date(aoy.b), aoy.d, aoy.e != null ? new HashSet(aoy.e) : null, aoy.k, a(aoy), aoy.g, aoy.r), a(str, aoy, str2), aoy.m != null ? aoy.m.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            jn.c("Could not load rewarded video ad from adapter.", th);
            throw new RemoteException();
        }
    }

    public final void a(boolean z) {
        if (!(this.a instanceof k)) {
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            jn.d(valueOf.length() != 0 ? "MediationAdapter is not an OnImmersiveModeUpdatedListener: ".concat(valueOf) : new String("MediationAdapter is not an OnImmersiveModeUpdatedListener: "));
            return;
        }
        try {
            ((k) this.a).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            jn.c("Could not set immersive mode.", th);
        }
    }

    public final void b() {
        if (!(this.a instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            jn.e(valueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        jn.b("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.a).showInterstitial();
        } catch (Throwable th) {
            jn.c("Could not show interstitial from adapter.", th);
            throw new RemoteException();
        }
    }

    public final void c() {
        try {
            this.a.onDestroy();
        } catch (Throwable th) {
            jn.c("Could not destroy adapter.", th);
            throw new RemoteException();
        }
    }

    public final void d() {
        try {
            this.a.onPause();
        } catch (Throwable th) {
            jn.c("Could not pause adapter.", th);
            throw new RemoteException();
        }
    }

    public final void e() {
        try {
            this.a.onResume();
        } catch (Throwable th) {
            jn.c("Could not resume adapter.", th);
            throw new RemoteException();
        }
    }

    public final void f() {
        if (!(this.a instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            jn.e(valueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        jn.b("Show rewarded video ad from adapter.");
        try {
            ((MediationRewardedVideoAdAdapter) this.a).showVideo();
        } catch (Throwable th) {
            jn.c("Could not show rewarded video ad from adapter.", th);
            throw new RemoteException();
        }
    }

    public final boolean g() {
        if (!(this.a instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            jn.e(valueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        jn.b("Check if adapter is initialized.");
        try {
            return ((MediationRewardedVideoAdAdapter) this.a).isInitialized();
        } catch (Throwable th) {
            jn.c("Could not check if adapter is initialized.", th);
            throw new RemoteException();
        }
    }

    public final bbe h() {
        f a2 = this.b.a();
        if (a2 instanceof g) {
            return new bbo((g) a2);
        }
        return null;
    }

    public final bbh i() {
        f a2 = this.b.a();
        if (a2 instanceof h) {
            return new bbp((h) a2);
        }
        return null;
    }

    public final Bundle j() {
        if (this.a instanceof zzapb) {
            return ((zzapb) this.a).zzmg();
        }
        String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
        jn.e(valueOf.length() != 0 ? "MediationAdapter is not a v2 MediationBannerAdapter: ".concat(valueOf) : new String("MediationAdapter is not a v2 MediationBannerAdapter: "));
        return new Bundle();
    }

    public final Bundle k() {
        if (this.a instanceof zzapc) {
            return ((zzapc) this.a).getInterstitialAdapterInfo();
        }
        String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
        jn.e(valueOf.length() != 0 ? "MediationAdapter is not a v2 MediationInterstitialAdapter: ".concat(valueOf) : new String("MediationAdapter is not a v2 MediationInterstitialAdapter: "));
        return new Bundle();
    }

    public final Bundle l() {
        return new Bundle();
    }

    public final boolean m() {
        return this.a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final awe n() {
        i b2 = this.b.b();
        if (b2 instanceof awh) {
            return ((awh) b2).b();
        }
        return null;
    }

    public final ara o() {
        if (!(this.a instanceof com.google.android.gms.ads.mediation.l)) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.mediation.l) this.a).getVideoController();
        } catch (Throwable th) {
            jn.c("Could not get video controller.", th);
            return null;
        }
    }
}
