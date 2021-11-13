package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.l;

final class bbz implements Runnable {
    private /* synthetic */ AdOverlayInfoParcel a;
    private /* synthetic */ zzwl b;

    bbz(zzwl zzwl, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.b = zzwl;
        this.a = adOverlayInfoParcel;
    }

    public final void run() {
        au.c();
        l.a(this.b.a, this.a, true);
    }
}
