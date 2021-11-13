package com.google.android.gms.internal;

final class sk implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ sj b;

    sk(sj sjVar, String str) {
        this.b = sjVar;
        this.a = str;
    }

    public final void run() {
        su e = this.b.p.e();
        if (!e.P()) {
            this.b.a(6, "Persisted config not initialized. Not logging error/warn");
        } else {
            e.b.a(this.a, 1);
        }
    }
}
