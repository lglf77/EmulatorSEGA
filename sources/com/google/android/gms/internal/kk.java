package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

@bfk
final class kk<V> extends FutureTask<V> implements kh<V> {
    private final ki a = new ki();

    kk(Runnable runnable, V v) {
        super(runnable, v);
    }

    kk(Callable<V> callable) {
        super(callable);
    }

    public final void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.a.a();
    }
}
