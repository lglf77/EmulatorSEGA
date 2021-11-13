package com.google.android.gms.internal;

final class i implements Runnable {
    private /* synthetic */ bfn a;

    i(bfn bfn) {
        this.a = bfn;
    }

    public final void run() {
        synchronized (this.a.d) {
            if (this.a.a != null) {
                this.a.b();
                this.a.a(2, "Timed out waiting for ad response.");
            }
        }
    }
}
