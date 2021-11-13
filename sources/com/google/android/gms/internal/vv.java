package com.google.android.gms.internal;

final class vv implements Runnable {
    private /* synthetic */ sb a;
    private /* synthetic */ vu b;

    vv(vu vuVar, sb sbVar) {
        this.b = vuVar;
        this.a = sbVar;
    }

    public final void run() {
        synchronized (this.b) {
            boolean unused = this.b.b = false;
            if (!this.b.a.y()) {
                this.b.a.t().E().a("Connected to service");
                this.b.a.a(this.a);
            }
        }
    }
}
