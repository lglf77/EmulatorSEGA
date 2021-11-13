package com.google.android.gms.internal;

import java.util.concurrent.Executor;

final /* synthetic */ class kj implements Runnable {
    private final Executor a;
    private final Runnable b;

    kj(Executor executor, Runnable runnable) {
        this.a = executor;
        this.b = runnable;
    }

    public final void run() {
        this.a.execute(this.b);
    }
}
