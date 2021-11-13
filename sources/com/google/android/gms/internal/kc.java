package com.google.android.gms.internal;

import java.util.concurrent.Future;

final /* synthetic */ class kc implements Runnable {
    private final Future a;

    kc(Future future) {
        this.a = future;
    }

    public final void run() {
        Future future = this.a;
        if (!future.isDone()) {
            future.cancel(true);
        }
    }
}
