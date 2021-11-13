package com.google.android.gms.b;

final class k implements Runnable {
    private /* synthetic */ d a;
    private /* synthetic */ j b;

    k(j jVar, d dVar) {
        this.b = jVar;
        this.a = dVar;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.a(this.a.c());
            }
        }
    }
}
