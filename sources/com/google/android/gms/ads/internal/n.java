package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fj;
import com.google.android.gms.internal.gw;

@bfk
final class n extends fj {
    final /* synthetic */ l a;
    private final int b;

    public n(l lVar, int i) {
        this.a = lVar;
        this.b = i;
    }

    public final void a() {
        p pVar = new p(this.a.e.G, this.a.E(), this.a.l, this.a.m, this.a.e.G ? this.b : -1, this.a.n, this.a.e.j.I);
        int A = this.a.e.j.b.A();
        if (A == -1) {
            A = this.a.e.j.g;
        }
        gw.a.post(new o(this, new AdOverlayInfoParcel(this.a, this.a, this.a, this.a.e.j.b, A, this.a.e.e, this.a.e.j.z, pVar)));
    }

    public final void b() {
    }
}
