package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;

final class hu implements Runnable {
    private /* synthetic */ hq a;

    hu(hq hqVar) {
        this.a = hqVar;
    }

    public final void run() {
        au.n().a(this.a.a, this.a.c, this.a.d);
    }
}
