package com.google.android.gms.internal;

final class st implements Runnable {
    private /* synthetic */ boolean a;
    private /* synthetic */ ss b;

    st(ss ssVar, boolean z) {
        this.b = ssVar;
        this.a = z;
    }

    public final void run() {
        this.b.b.a(this.a);
    }
}
