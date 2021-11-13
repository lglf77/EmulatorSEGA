package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.b.i;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.common.internal.y;

@bfk
public final class bbn implements c, d, e {
    private final bay a;
    private f b;
    private i c;

    public bbn(bay bay) {
        this.a = bay;
    }

    public final f a() {
        return this.b;
    }

    public final void a(MediationBannerAdapter mediationBannerAdapter) {
        y.b("onAdLoaded must be called on the main UI thread.");
        jn.b("Adapter called onAdLoaded.");
        try {
            this.a.e();
        } catch (RemoteException e) {
            jn.c("Could not call onAdLoaded.", e);
        }
    }

    public final void a(MediationBannerAdapter mediationBannerAdapter, int i) {
        y.b("onAdFailedToLoad must be called on the main UI thread.");
        jn.b(new StringBuilder(55).append("Adapter called onAdFailedToLoad with error. ").append(i).toString());
        try {
            this.a.a(i);
        } catch (RemoteException e) {
            jn.c("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void a(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        y.b("onAppEvent must be called on the main UI thread.");
        jn.b("Adapter called onAppEvent.");
        try {
            this.a.a(str, str2);
        } catch (RemoteException e) {
            jn.c("Could not call onAppEvent.", e);
        }
    }

    public final void a(MediationInterstitialAdapter mediationInterstitialAdapter) {
        y.b("onAdLoaded must be called on the main UI thread.");
        jn.b("Adapter called onAdLoaded.");
        try {
            this.a.e();
        } catch (RemoteException e) {
            jn.c("Could not call onAdLoaded.", e);
        }
    }

    public final void a(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        y.b("onAdFailedToLoad must be called on the main UI thread.");
        jn.b(new StringBuilder(55).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try {
            this.a.a(i);
        } catch (RemoteException e) {
            jn.c("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter) {
        y.b("onAdOpened must be called on the main UI thread.");
        jn.b("Adapter called onAdOpened.");
        try {
            this.a.d();
        } catch (RemoteException e) {
            jn.c("Could not call onAdOpened.", e);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, int i) {
        y.b("onAdFailedToLoad must be called on the main UI thread.");
        jn.b(new StringBuilder(55).append("Adapter called onAdFailedToLoad with error ").append(i).append(".").toString());
        try {
            this.a.a(i);
        } catch (RemoteException e) {
            jn.c("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, i iVar) {
        y.b("onAdLoaded must be called on the main UI thread.");
        String valueOf = String.valueOf(iVar.a());
        jn.b(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.c = iVar;
        try {
            this.a.e();
        } catch (RemoteException e) {
            jn.c("Could not call onAdLoaded.", e);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, i iVar, String str) {
        if (iVar instanceof awh) {
            try {
                this.a.a(((awh) iVar).b(), str);
            } catch (RemoteException e) {
                jn.c("Could not call onCustomClick.", e);
            }
        } else {
            jn.e("Unexpected native custom template ad type.");
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, f fVar) {
        y.b("onAdLoaded must be called on the main UI thread.");
        jn.b("Adapter called onAdLoaded.");
        this.b = fVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter) && fVar.h()) {
            com.google.android.gms.ads.i iVar = new com.google.android.gms.ads.i();
            iVar.a((ara) new bbk());
            this.b.a(iVar);
        }
        try {
            this.a.e();
        } catch (RemoteException e) {
            jn.c("Could not call onAdLoaded.", e);
        }
    }

    public final i b() {
        return this.c;
    }

    public final void b(MediationBannerAdapter mediationBannerAdapter) {
        y.b("onAdOpened must be called on the main UI thread.");
        jn.b("Adapter called onAdOpened.");
        try {
            this.a.d();
        } catch (RemoteException e) {
            jn.c("Could not call onAdOpened.", e);
        }
    }

    public final void b(MediationInterstitialAdapter mediationInterstitialAdapter) {
        y.b("onAdOpened must be called on the main UI thread.");
        jn.b("Adapter called onAdOpened.");
        try {
            this.a.d();
        } catch (RemoteException e) {
            jn.c("Could not call onAdOpened.", e);
        }
    }

    public final void b(MediationNativeAdapter mediationNativeAdapter) {
        y.b("onAdClosed must be called on the main UI thread.");
        jn.b("Adapter called onAdClosed.");
        try {
            this.a.b();
        } catch (RemoteException e) {
            jn.c("Could not call onAdClosed.", e);
        }
    }

    public final void c(MediationBannerAdapter mediationBannerAdapter) {
        y.b("onAdClosed must be called on the main UI thread.");
        jn.b("Adapter called onAdClosed.");
        try {
            this.a.b();
        } catch (RemoteException e) {
            jn.c("Could not call onAdClosed.", e);
        }
    }

    public final void c(MediationInterstitialAdapter mediationInterstitialAdapter) {
        y.b("onAdClosed must be called on the main UI thread.");
        jn.b("Adapter called onAdClosed.");
        try {
            this.a.b();
        } catch (RemoteException e) {
            jn.c("Could not call onAdClosed.", e);
        }
    }

    public final void c(MediationNativeAdapter mediationNativeAdapter) {
        y.b("onAdLeftApplication must be called on the main UI thread.");
        jn.b("Adapter called onAdLeftApplication.");
        try {
            this.a.c();
        } catch (RemoteException e) {
            jn.c("Could not call onAdLeftApplication.", e);
        }
    }

    public final void d(MediationBannerAdapter mediationBannerAdapter) {
        y.b("onAdLeftApplication must be called on the main UI thread.");
        jn.b("Adapter called onAdLeftApplication.");
        try {
            this.a.c();
        } catch (RemoteException e) {
            jn.c("Could not call onAdLeftApplication.", e);
        }
    }

    public final void d(MediationInterstitialAdapter mediationInterstitialAdapter) {
        y.b("onAdLeftApplication must be called on the main UI thread.");
        jn.b("Adapter called onAdLeftApplication.");
        try {
            this.a.c();
        } catch (RemoteException e) {
            jn.c("Could not call onAdLeftApplication.", e);
        }
    }

    public final void d(MediationNativeAdapter mediationNativeAdapter) {
        y.b("onAdClicked must be called on the main UI thread.");
        f fVar = this.b;
        if (this.c == null) {
            if (fVar == null) {
                jn.e("Could not call onAdClicked since NativeAdMapper is null.");
                return;
            } else if (!fVar.b()) {
                jn.b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        jn.b("Adapter called onAdClicked.");
        try {
            this.a.a();
        } catch (RemoteException e) {
            jn.c("Could not call onAdClicked.", e);
        }
    }

    public final void e(MediationBannerAdapter mediationBannerAdapter) {
        y.b("onAdClicked must be called on the main UI thread.");
        jn.b("Adapter called onAdClicked.");
        try {
            this.a.a();
        } catch (RemoteException e) {
            jn.c("Could not call onAdClicked.", e);
        }
    }

    public final void e(MediationInterstitialAdapter mediationInterstitialAdapter) {
        y.b("onAdClicked must be called on the main UI thread.");
        jn.b("Adapter called onAdClicked.");
        try {
            this.a.a();
        } catch (RemoteException e) {
            jn.c("Could not call onAdClicked.", e);
        }
    }

    public final void e(MediationNativeAdapter mediationNativeAdapter) {
        y.b("onAdImpression must be called on the main UI thread.");
        f fVar = this.b;
        if (this.c == null) {
            if (fVar == null) {
                jn.e("Could not call onAdImpression since NativeAdMapper is null. ");
                return;
            } else if (!fVar.a()) {
                jn.b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        jn.b("Adapter called onAdImpression.");
        try {
            this.a.f();
        } catch (RemoteException e) {
            jn.c("Could not call onAdImpression.", e);
        }
    }
}
