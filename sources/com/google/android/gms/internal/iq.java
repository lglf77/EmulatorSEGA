package com.google.android.gms.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.y;

@bfk
public final class iq {
    private HandlerThread a = null;
    private Handler b = null;
    private int c = 0;
    private final Object d = new Object();

    public final Looper a() {
        Looper looper;
        synchronized (this.d) {
            if (this.c != 0) {
                y.a(this.a, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.a == null) {
                fn.a("Starting the looper thread.");
                this.a = new HandlerThread("LooperProvider");
                this.a.start();
                this.b = new Handler(this.a.getLooper());
                fn.a("Looper thread started.");
            } else {
                fn.a("Resuming the looper thread");
                this.d.notifyAll();
            }
            this.c++;
            looper = this.a.getLooper();
        }
        return looper;
    }

    public final Handler b() {
        return this.b;
    }
}
