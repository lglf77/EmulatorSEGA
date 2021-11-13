package com.google.android.gms.internal;

final class un implements Runnable {
    private /* synthetic */ boolean a;
    private /* synthetic */ um b;

    un(um umVar, boolean z) {
        this.b = umVar;
        this.a = z;
    }

    public final void run() {
        this.b.c(this.a);
    }
}
