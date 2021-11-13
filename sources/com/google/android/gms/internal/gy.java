package com.google.android.gms.internal;

import android.content.Context;

final class gy implements Runnable {
    private /* synthetic */ Context a;
    private /* synthetic */ gw b;

    gy(gw gwVar, Context context) {
        this.b = gwVar;
        this.a = context;
    }

    public final void run() {
        synchronized (this.b.b) {
            String unused = this.b.d = gw.d(this.a);
            this.b.b.notifyAll();
        }
    }
}
