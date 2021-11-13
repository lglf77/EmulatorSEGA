package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class eo implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    eo(em emVar) {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, new StringBuilder(42).append("AdWorker(SCION_TASK_EXECUTOR) #").append(this.a.getAndIncrement()).toString());
    }
}
