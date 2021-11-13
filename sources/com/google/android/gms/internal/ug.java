package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class ug implements Callable<List<wq>> {
    private /* synthetic */ re a;
    private /* synthetic */ tp b;

    ug(tp tpVar, re reVar) {
        this.b = tpVar;
        this.a = reVar;
    }

    public final /* synthetic */ Object call() {
        this.b.a.G();
        return this.b.a.q().a(this.a.a);
    }
}
