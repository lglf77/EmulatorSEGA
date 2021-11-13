package com.google.android.gms.internal;

import java.util.concurrent.Future;

final /* synthetic */ class kf implements Runnable {
    private final kh a;
    private final Future b;

    kf(kh khVar, Future future) {
        this.a = khVar;
        this.b = future;
    }

    public final void run() {
        kh khVar = this.a;
        Future future = this.b;
        if (khVar.isCancelled()) {
            future.cancel(true);
        }
    }
}
