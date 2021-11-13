package com.google.android.gms.internal;

import java.util.concurrent.Executor;

final /* synthetic */ class kd implements Runnable {
    private final ks a;
    private final kh b;
    private final Class c;
    private final js d;
    private final Executor e;

    kd(ks ksVar, kh khVar, Class cls, js jsVar, Executor executor) {
        this.a = ksVar;
        this.b = khVar;
        this.c = cls;
        this.d = jsVar;
        this.e = executor;
    }

    public final void run() {
        jx.a(this.a, this.b, this.c, this.d, this.e);
    }
}
