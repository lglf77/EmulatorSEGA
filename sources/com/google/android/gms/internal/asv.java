package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class asv implements Callable<T> {
    private /* synthetic */ asl a;
    private /* synthetic */ asu b;

    asv(asu asu, asl asl) {
        this.b = asu;
        this.a = asl;
    }

    public final T call() {
        return this.a.a(this.b.d);
    }
}
