package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.kx;

final class ai implements kx<o> {
    private /* synthetic */ f a;
    private /* synthetic */ z b;

    ai(z zVar, f fVar) {
        this.b = zVar;
        this.a = fVar;
    }

    public final /* synthetic */ void a(Object obj) {
        synchronized (this.b.a) {
            int unused = this.b.h = 0;
            if (!(this.b.g == null || this.a == this.b.g)) {
                fn.a("New JS engine is loaded, marking previous one as destroyable.");
                this.b.g.c();
            }
            f unused2 = this.b.g = this.a;
        }
    }
}
