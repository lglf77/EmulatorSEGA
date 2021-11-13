package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.b;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@bfk
public final class bbr<NETWORK_EXTRAS extends f, SERVER_PARAMETERS extends e> extends baw {
    private final b<NETWORK_EXTRAS, SERVER_PARAMETERS> a;
    private final NETWORK_EXTRAS b;

    public bbr(b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.a = bVar;
        this.b = network_extras;
    }

    private final SERVER_PARAMETERS a(String str, int i, String str2) {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                jn.c("Could not get MediationServerParameters.", th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (e) serverParametersType.newInstance();
        server_parameters.a(hashMap);
        return server_parameters;
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
    }

    public final void a(a aVar, aoy aoy, String str, bay bay) {
        a(aVar, aoy, str, (String) null, bay);
    }

    public final void a(a aVar, aoy aoy, String str, ds dsVar, String str2) {
    }

    public final void a(a aVar, aoy aoy, String str, String str2, bay bay) {
        if (!(this.a instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(this.a.getClass().getCanonicalName());
            jn.e(valueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        jn.b("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.a).requestInterstitialAd(new bbs(bay), (Activity) c.a(aVar), a(str, aoy.g, str2), bbw.a(aoy, a(aoy)), this.b);
        } catch (Throwable th) {
            jn.c("Could not request interstitial ad from adapter.", th);
            throw new RemoteException();
        }
    }

    public final void a(a aVar, aoy aoy, String str, String str2, bay bay, auv auv, List<String> list) {
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
            ((MediationBannerAdapter) this.a).requestBannerAd(new bbs(bay), (Activity) c.a(aVar), a(str, aoy.g, str2), bbw.a(apc), bbw.a(aoy, a(aoy)), this.b);
        } catch (Throwable th) {
            jn.c("Could not request banner ad from adapter.", th);
            throw new RemoteException();
        }
    }

    public final void a(a aVar, ds dsVar, List<String> list) {
    }

    public final void a(aoy aoy, String str) {
    }

    public final void a(aoy aoy, String str, String str2) {
    }

    public final void a(boolean z) {
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
            this.a.destroy();
        } catch (Throwable th) {
            jn.c("Could not destroy adapter.", th);
            throw new RemoteException();
        }
    }

    public final void d() {
        throw new RemoteException();
    }

    public final void e() {
        throw new RemoteException();
    }

    public final void f() {
    }

    public final boolean g() {
        return true;
    }

    public final bbe h() {
        return null;
    }

    public final bbh i() {
        return null;
    }

    public final Bundle j() {
        return new Bundle();
    }

    public final Bundle k() {
        return new Bundle();
    }

    public final Bundle l() {
        return new Bundle();
    }

    public final boolean m() {
        return false;
    }

    public final awe n() {
        return null;
    }

    public final ara o() {
        return null;
    }
}
