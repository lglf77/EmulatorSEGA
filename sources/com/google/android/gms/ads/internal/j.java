package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aoy;

final class j implements Runnable {
    private /* synthetic */ aoy a;
    private /* synthetic */ int b;
    private /* synthetic */ h c;

    j(h hVar, aoy aoy, int i) {
        this.c = hVar;
        this.a = aoy;
        this.b = i;
    }

    public final void run() {
        synchronized (this.c.s) {
            this.c.b(this.a, this.b);
        }
    }
}
