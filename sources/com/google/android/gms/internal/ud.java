package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class ud implements Callable<byte[]> {
    private /* synthetic */ rx a;
    private /* synthetic */ String b;
    private /* synthetic */ tp c;

    ud(tp tpVar, rx rxVar, String str) {
        this.c = tpVar;
        this.a = rxVar;
        this.b = str;
    }

    public final /* synthetic */ Object call() {
        this.c.a.G();
        return this.c.a.b(this.a, this.b);
    }
}
