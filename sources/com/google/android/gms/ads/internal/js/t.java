package com.google.android.gms.ads.internal.js;

final class t implements Runnable {
    private /* synthetic */ String a;
    private /* synthetic */ q b;

    t(q qVar, String str) {
        this.b = qVar;
        this.a = str;
    }

    public final void run() {
        this.b.a.loadData(this.a, "text/html", "UTF-8");
    }
}
