package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class tz implements Callable<List<rh>> {
    private /* synthetic */ String a;
    private /* synthetic */ String b;
    private /* synthetic */ String c;
    private /* synthetic */ tp d;

    tz(tp tpVar, String str, String str2, String str3) {
        this.d = tpVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final /* synthetic */ Object call() {
        this.d.a.G();
        return this.d.a.q().b(this.a, this.b, this.c);
    }
}
