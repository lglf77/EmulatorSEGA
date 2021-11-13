package com.google.android.gms.internal;

final class ban implements Runnable {
    private /* synthetic */ kh a;
    private /* synthetic */ bal b;

    ban(bal bal, kh khVar) {
        this.b = bal;
        this.a = khVar;
    }

    public final void run() {
        for (kh khVar : this.b.k.keySet()) {
            if (khVar != this.a) {
                ((baf) this.b.k.get(khVar)).a();
            }
        }
    }
}
