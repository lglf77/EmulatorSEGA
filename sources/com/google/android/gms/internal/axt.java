package com.google.android.gms.internal;

import java.util.concurrent.Future;

final /* synthetic */ class axt implements Runnable {
    private final ks a;
    private final Future b;

    axt(ks ksVar, Future future) {
        this.a = ksVar;
        this.b = future;
    }

    public final void run() {
        ks ksVar = this.a;
        Future future = this.b;
        if (ksVar.isCancelled()) {
            future.cancel(true);
        }
    }
}
