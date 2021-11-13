package com.google.android.gms.internal;

import java.util.concurrent.Future;

final class gu implements Runnable {
    private /* synthetic */ ks a;
    private /* synthetic */ Future b;

    gu(ks ksVar, Future future) {
        this.a = ksVar;
        this.b = future;
    }

    public final void run() {
        if (this.a.isCancelled()) {
            this.b.cancel(true);
        }
    }
}
