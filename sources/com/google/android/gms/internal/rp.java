package com.google.android.gms.internal;

import android.os.Looper;

final class rp implements Runnable {
    private /* synthetic */ ro a;

    rp(ro roVar) {
        this.a = roVar;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.a.h().a((Runnable) this);
            return;
        }
        boolean b = this.a.b();
        long unused = this.a.d = 0;
        if (b && this.a.e) {
            this.a.a();
        }
    }
}
