package com.google.android.gms.ads.internal.js;

final class v implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ q b;

    v(q qVar, String str) {
        this.b = qVar;
        this.a = str;
    }

    public final void run() {
        this.b.a.loadUrl(this.a);
    }
}
