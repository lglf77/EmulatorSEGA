package com.google.android.gms.internal;

final class de implements Runnable {
    private /* synthetic */ aoy a;
    private /* synthetic */ bav b;
    private /* synthetic */ dd c;

    de(dd ddVar, aoy aoy, bav bav) {
        this.c = ddVar;
        this.a = aoy;
        this.b = bav;
    }

    public final void run() {
        this.c.a(this.a, this.b);
    }
}
