package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class gv implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);
    private /* synthetic */ String b;

    gv(String str) {
        this.b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.b;
        return new Thread(runnable, new StringBuilder(String.valueOf(str).length() + 23).append("AdWorker(").append(str).append(") #").append(this.a.getAndIncrement()).toString());
    }
}
