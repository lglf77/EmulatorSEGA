package com.google.android.gms.internal;

final class fk implements Runnable {
    private /* synthetic */ fj a;

    fk(fj fjVar) {
        this.a = fjVar;
    }

    public final void run() {
        Thread unused = this.a.b = Thread.currentThread();
        this.a.a();
    }
}
