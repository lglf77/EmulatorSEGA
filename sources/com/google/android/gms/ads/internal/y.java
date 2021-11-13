package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.gw;

final class y implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ x b;

    y(x xVar, Runnable runnable) {
        this.b = xVar;
        this.a = runnable;
    }

    public final void run() {
        au.e();
        gw.a((Runnable) new z(this));
    }
}
