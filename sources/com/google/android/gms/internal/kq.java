package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class kq extends jr {
    private final Executor a;

    private kq(Executor executor) {
        this.a = executor;
    }

    /* synthetic */ kq(Executor executor, ko koVar) {
        this(executor);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
