package com.google.android.gms.internal;

import java.util.concurrent.Future;

final class bi implements Runnable {
    private /* synthetic */ Future a;

    bi(bf bfVar, Future future) {
        this.a = future;
    }

    public final void run() {
        if (!this.a.isDone()) {
            this.a.cancel(true);
        }
    }
}
