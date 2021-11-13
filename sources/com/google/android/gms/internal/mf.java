package com.google.android.gms.internal;

@bfk
final class mf implements Runnable {
    private lr a;
    private boolean b = false;

    mf(lr lrVar) {
        this.a = lrVar;
    }

    private final void c() {
        gw.a.removeCallbacks(this);
        gw.a.postDelayed(this, 250);
    }

    public final void a() {
        this.b = true;
    }

    public final void b() {
        this.b = false;
        c();
    }

    public final void run() {
        if (!this.b) {
            this.a.o();
            c();
        }
    }
}
