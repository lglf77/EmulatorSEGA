package com.google.android.gms.internal;

final class beb implements Runnable {
    private /* synthetic */ ks a;
    private /* synthetic */ String b;
    private /* synthetic */ bea c;

    beb(bea bea, ks ksVar, String str) {
        this.c = bea;
        this.a = ksVar;
        this.b = str;
    }

    public final void run() {
        this.a.b(this.c.d.J().get(this.b));
    }
}
