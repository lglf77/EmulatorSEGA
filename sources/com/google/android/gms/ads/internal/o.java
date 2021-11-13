package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.l;

final class o implements Runnable {
    private /* synthetic */ AdOverlayInfoParcel a;
    private /* synthetic */ n b;

    o(n nVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.b = nVar;
        this.a = adOverlayInfoParcel;
    }

    public final void run() {
        au.c();
        l.a(this.b.a.e.c, this.a, true);
    }
}
