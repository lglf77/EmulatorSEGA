package com.google.android.gms.ads.internal.js;

final class j implements Runnable {
    private /* synthetic */ o a;
    private /* synthetic */ i b;

    j(i iVar, o oVar) {
        this.b = iVar;
        this.a = oVar;
    }

    public final void run() {
        this.b.a.b.a(this.a);
        this.a.a();
    }
}
