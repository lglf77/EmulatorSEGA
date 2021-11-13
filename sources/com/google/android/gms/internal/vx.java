package com.google.android.gms.internal;

final class vx implements Runnable {
    private /* synthetic */ sb a;
    private /* synthetic */ vu b;

    vx(vu vuVar, sb sbVar) {
        this.b = vuVar;
        this.a = sbVar;
    }

    public final void run() {
        synchronized (this.b) {
            boolean unused = this.b.b = false;
            if (!this.b.a.y()) {
                this.b.a.t().D().a("Connected to remote service");
                this.b.a.a(this.a);
            }
        }
    }
}
