package com.google.android.gms.internal;

final class lh implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ le c;

    lh(le leVar, String str, String str2) {
        this.c = leVar;
        this.a = str;
        this.b = str2;
    }

    public final void run() {
        if (this.c.r != null) {
            this.c.r.a(this.a, this.b);
        }
    }
}
