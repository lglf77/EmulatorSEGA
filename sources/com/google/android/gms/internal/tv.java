package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class tv implements Callable<List<wq>> {
    private /* synthetic */ re a;
    private /* synthetic */ String b;
    private /* synthetic */ String c;
    private /* synthetic */ tp d;

    tv(tp tpVar, re reVar, String str, String str2) {
        this.d = tpVar;
        this.a = reVar;
        this.b = str;
        this.c = str2;
    }

    public final /* synthetic */ Object call() {
        this.d.a.G();
        return this.d.a.q().a(this.a.a, this.b, this.c);
    }
}
