package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.a;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.c;
import com.google.ads.mediation.d;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;

@bfk
public final class bbs<NETWORK_EXTRAS extends f, SERVER_PARAMETERS extends e> implements c, d {
    /* access modifiers changed from: private */
    public final bay a;

    public bbs(bay bay) {
        this.a = bay;
    }

    public final void a(MediationBannerAdapter<?, ?> mediationBannerAdapter, a.C0012a aVar) {
        String valueOf = String.valueOf(aVar);
        jn.b(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error. ").append(valueOf).toString());
        app.a();
        if (!jc.b()) {
            jn.e("onFailedToReceiveAd must be called on the main UI thread.");
            jc.a.post(new bbu(this, aVar));
            return;
        }
        try {
            this.a.a(bbw.a(aVar));
        } catch (RemoteException e) {
            jn.c("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void a(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, a.C0012a aVar) {
        String valueOf = String.valueOf(aVar);
        jn.b(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Adapter called onFailedToReceiveAd with error ").append(valueOf).append(".").toString());
        app.a();
        if (!jc.b()) {
            jn.e("onFailedToReceiveAd must be called on the main UI thread.");
            jc.a.post(new bbv(this, aVar));
            return;
        }
        try {
            this.a.a(bbw.a(aVar));
        } catch (RemoteException e) {
            jn.c("Could not call onAdFailedToLoad.", e);
        }
    }
}
