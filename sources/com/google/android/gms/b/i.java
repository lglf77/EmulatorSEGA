package com.google.android.gms.b;

final class i implements Runnable {
    private /* synthetic */ d a;
    private /* synthetic */ h b;

    i(h hVar, d dVar) {
        this.b = hVar;
        this.a = dVar;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.a(this.a.d());
            }
        }
    }
}
