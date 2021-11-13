package com.google.android.gms.internal;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

@bfk
public abstract class jr extends AbstractExecutorService implements ExecutorService {
    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new kk(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new kk(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return (kh) super.submit(runnable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (kh) super.submit(runnable, obj);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return (kh) super.submit(callable);
    }
}
