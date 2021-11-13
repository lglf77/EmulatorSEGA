package com.google.android.gms.internal;

import java.lang.Thread;

final class bff implements Thread.UncaughtExceptionHandler {
    private /* synthetic */ Thread.UncaughtExceptionHandler a;
    private /* synthetic */ bfe b;

    bff(bfe bfe, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = bfe;
        this.a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.b.a(thread, th);
            if (this.a != null) {
                this.a.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            if (this.a != null) {
                this.a.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
