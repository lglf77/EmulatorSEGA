package com.google.android.gms.internal;

final class bfh implements Runnable {
    private /* synthetic */ jo a;
    private /* synthetic */ String b;

    bfh(bfe bfe, jo joVar, String str) {
        this.a = joVar;
        this.b = str;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
