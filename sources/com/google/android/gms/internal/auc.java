package com.google.android.gms.internal;

final class auc implements Runnable {
    private /* synthetic */ aub a;

    auc(aub aub) {
        this.a = aub;
    }

    public final void run() {
        if (this.a.n != null) {
            this.a.n.g();
            this.a.n.f();
        }
        aui unused = this.a.n = null;
    }
}
