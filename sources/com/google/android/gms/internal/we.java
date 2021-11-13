package com.google.android.gms.internal;

final class we implements Runnable {
    private /* synthetic */ tk a;
    private /* synthetic */ Runnable b;

    we(wb wbVar, tk tkVar, Runnable runnable) {
        this.a = tkVar;
        this.b = runnable;
    }

    public final void run() {
        this.a.G();
        this.a.a(this.b);
        this.a.E();
    }
}
