package com.google.android.gms.internal;

final class vs implements Runnable {
    private /* synthetic */ boolean a;
    private /* synthetic */ wo b;
    private /* synthetic */ re c;
    private /* synthetic */ vg d;

    vs(vg vgVar, boolean z, wo woVar, re reVar) {
        this.d = vgVar;
        this.a = z;
        this.b = woVar;
        this.c = reVar;
    }

    public final void run() {
        sb d2 = this.d.b;
        if (d2 == null) {
            this.d.t().y().a("Discarding data. Failed to set user attribute");
            return;
        }
        this.d.a(d2, this.a ? null : this.b, this.c);
        this.d.F();
    }
}
