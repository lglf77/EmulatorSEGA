package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.nf;

final class bu implements nf {
    private /* synthetic */ ev a;
    private /* synthetic */ Runnable b;

    bu(bs bsVar, ev evVar, Runnable runnable) {
        this.a = evVar;
        this.b = runnable;
    }

    public final void a() {
        if (!this.a.l) {
            au.e();
            gw.b(this.b);
        }
    }
}
