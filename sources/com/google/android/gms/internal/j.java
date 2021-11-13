package com.google.android.gms.internal;

final class j implements Runnable {
    private /* synthetic */ ku a;
    private /* synthetic */ bfn b;

    j(bfn bfn, ku kuVar) {
        this.b = bfn;
        this.a = kuVar;
    }

    public final void run() {
        synchronized (this.b.d) {
            this.b.a = this.b.a(this.b.c.j, (ku<v>) this.a);
            if (this.b.a == null) {
                this.b.a(0, "Could not start the ad request service.");
                gw.a.removeCallbacks(this.b.i);
            }
        }
    }
}
