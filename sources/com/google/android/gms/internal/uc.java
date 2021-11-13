package com.google.android.gms.internal;

final class uc implements Runnable {
    private /* synthetic */ rx a;
    private /* synthetic */ String b;
    private /* synthetic */ tp c;

    uc(tp tpVar, rx rxVar, String str) {
        this.c = tpVar;
        this.a = rxVar;
        this.b = str;
    }

    public final void run() {
        this.c.a.G();
        this.c.a.a(this.a, this.b);
    }
}
