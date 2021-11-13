package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.xq;
import com.google.android.gms.internal.xr;
import java.util.concurrent.Callable;

final class ar implements Callable<xr> {
    private /* synthetic */ ao a;

    ar(ao aoVar) {
        this.a = aoVar;
    }

    public final /* synthetic */ Object call() {
        return new xr(xq.a(this.a.a.a, this.a.d, false));
    }
}
