package com.google.android.gms.internal;

final class axx extends apw {
    private /* synthetic */ axw a;

    axx(axw axw) {
        this.a = axw;
    }

    public final void a() {
        this.a.a.add(new axy(this));
    }

    public final void a(int i) {
        this.a.a.add(new axz(this, i));
        fn.a("Pooled interstitial failed to load.");
    }

    public final void b() {
        this.a.a.add(new aya(this));
    }

    public final void c() {
        this.a.a.add(new ayb(this));
        fn.a("Pooled interstitial loaded.");
    }

    public final void d() {
        this.a.a.add(new ayc(this));
    }

    public final void e() {
        this.a.a.add(new aye(this));
    }

    public final void f() {
        this.a.a.add(new ayd(this));
    }
}
