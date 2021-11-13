package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.n;

final class bby implements n {
    private /* synthetic */ zzwl a;

    bby(zzwl zzwl) {
        this.a = zzwl;
    }

    public final void b() {
        jn.b("AdMobCustomTabsAdapter overlay is closed.");
        this.a.b.c(this.a);
    }

    public final void c() {
        jn.b("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void d() {
        jn.b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void f() {
        jn.b("Opening AdMobCustomTabsAdapter overlay.");
        this.a.b.b(this.a);
    }
}
