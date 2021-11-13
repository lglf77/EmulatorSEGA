package com.google.android.gms.internal;

final class yl implements Runnable {
    private /* synthetic */ int a;
    private /* synthetic */ boolean b;
    private /* synthetic */ yj c;

    yl(yj yjVar, int i, boolean z) {
        this.c = yjVar;
        this.a = i;
        this.b = z;
    }

    public final void run() {
        pb b2 = this.c.b(this.a, this.b);
        pb unused = this.c.k = b2;
        if (yj.b(this.a, b2)) {
            this.c.a(this.a + 1, this.b);
        }
    }
}
