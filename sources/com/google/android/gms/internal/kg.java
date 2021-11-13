package com.google.android.gms.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@bfk
final class kg<T> implements kh<T> {
    private final T a;
    private final ki b = new ki();

    kg(T t) {
        this.a = t;
        this.b.a();
    }

    public final void a(Runnable runnable, Executor executor) {
        this.b.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        return this.a;
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
