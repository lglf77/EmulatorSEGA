package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;

final class hv implements Runnable {
    private /* synthetic */ hq a;

    hv(hq hqVar) {
        this.a = hqVar;
    }

    public final void run() {
        au.n().a(this.a.a, this.a.c, this.a.d, this.a.e);
    }
}
