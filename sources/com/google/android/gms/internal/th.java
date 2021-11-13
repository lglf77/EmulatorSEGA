package com.google.android.gms.internal;

import com.google.android.gms.common.internal.y;
import java.lang.Thread;

final class th implements Thread.UncaughtExceptionHandler {
    private final String a;
    private /* synthetic */ tf b;

    public th(tf tfVar, String str) {
        this.b = tfVar;
        y.a(str);
        this.a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.t().y().a(this.a, th);
    }
}
