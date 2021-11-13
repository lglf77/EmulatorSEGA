package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.kv;

final class aj implements kv {
    private /* synthetic */ f a;
    private /* synthetic */ z b;

    aj(z zVar, f fVar) {
        this.b = zVar;
        this.a = fVar;
    }

    public final void a() {
        synchronized (this.b.a) {
            int unused = this.b.h = 1;
            fn.a("Failed loading new engine. Marking new engine destroyable.");
            this.a.c();
        }
    }
}
