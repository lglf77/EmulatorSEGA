package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.aoy;

final class i implements Runnable {
    private /* synthetic */ aoy a;
    private /* synthetic */ h b;

    i(h hVar, aoy aoy) {
        this.b = hVar;
        this.a = aoy;
    }

    public final void run() {
        synchronized (this.b.s) {
            if (this.b.d()) {
                this.b.b(this.a);
            } else {
                this.b.b(this.a, 1);
            }
        }
    }
}
