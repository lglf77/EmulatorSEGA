package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.b;

final class aw implements Runnable {
    private /* synthetic */ ar a;

    aw(ar arVar) {
        this.a = arVar;
    }

    public final void run() {
        if (this.a.l != null) {
            this.a.l.a();
            b unused = this.a.l = null;
        }
    }
}
