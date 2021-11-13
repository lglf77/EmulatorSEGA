package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.b;

final class as implements Runnable {
    private /* synthetic */ ew a;
    private /* synthetic */ ar b;

    as(ar arVar, ew ewVar) {
        this.b = arVar;
        this.a = ewVar;
    }

    public final void run() {
        this.b.h.a(this.a);
        if (this.b.l != null) {
            this.b.l.a();
            b unused = this.b.l = null;
        }
    }
}
