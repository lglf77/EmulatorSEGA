package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.a;
import com.google.android.gms.common.internal.y;

@bfk
public final class dv implements a {
    private final ds a;

    public dv(ds dsVar) {
        this.a = dsVar;
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        y.b("onInitializationSucceeded must be called on the main UI thread.");
        jn.b("Adapter called onInitializationSucceeded.");
        try {
            this.a.a(c.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            jn.c("Could not call onInitializationSucceeded.", e);
        }
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        y.b("onAdFailedToLoad must be called on the main UI thread.");
        jn.b("Adapter called onAdFailedToLoad.");
        try {
            this.a.b(c.a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            jn.c("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, com.google.android.gms.ads.reward.a aVar) {
        y.b("onRewarded must be called on the main UI thread.");
        jn.b("Adapter called onRewarded.");
        if (aVar != null) {
            try {
                this.a.a(c.a(mediationRewardedVideoAdAdapter), new dw(aVar));
            } catch (RemoteException e) {
                jn.c("Could not call onRewarded.", e);
            }
        } else {
            this.a.a(c.a(mediationRewardedVideoAdAdapter), new dw("", 1));
        }
    }

    public final void b(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        y.b("onAdLoaded must be called on the main UI thread.");
        jn.b("Adapter called onAdLoaded.");
        try {
            this.a.b(c.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            jn.c("Could not call onAdLoaded.", e);
        }
    }

    public final void c(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        y.b("onAdOpened must be called on the main UI thread.");
        jn.b("Adapter called onAdOpened.");
        try {
            this.a.c(c.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            jn.c("Could not call onAdOpened.", e);
        }
    }

    public final void d(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        y.b("onVideoStarted must be called on the main UI thread.");
        jn.b("Adapter called onVideoStarted.");
        try {
            this.a.d(c.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            jn.c("Could not call onVideoStarted.", e);
        }
    }

    public final void e(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        y.b("onAdClosed must be called on the main UI thread.");
        jn.b("Adapter called onAdClosed.");
        try {
            this.a.e(c.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            jn.c("Could not call onAdClosed.", e);
        }
    }

    public final void f(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        y.b("onAdLeftApplication must be called on the main UI thread.");
        jn.b("Adapter called onAdLeftApplication.");
        try {
            this.a.g(c.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            jn.c("Could not call onAdLeftApplication.", e);
        }
    }
}
