package com.google.android.gms.internal;

final /* synthetic */ class ka implements Runnable {
    private final ks a;
    private final js b;
    private final kh c;

    ka(ks ksVar, js jsVar, kh khVar) {
        this.a = ksVar;
        this.b = jsVar;
        this.c = khVar;
    }

    public final void run() {
        jx.a(this.a, this.b, this.c);
    }
}
