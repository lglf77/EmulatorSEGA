package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.bq;
import com.google.android.gms.ads.internal.l;

@bfk
public final class axv {
    private final Context a;
    private final bar b;
    private final jp c;
    private final bq d;

    axv(Context context, bar bar, jp jpVar, bq bqVar) {
        this.a = context;
        this.b = bar;
        this.c = jpVar;
        this.d = bqVar;
    }

    public final Context a() {
        return this.a.getApplicationContext();
    }

    public final l a(String str) {
        return new l(this.a, new apc(), str, this.b, this.c, this.d);
    }

    public final l b(String str) {
        return new l(this.a.getApplicationContext(), new apc(), str, this.b, this.c, this.d);
    }

    public final axv b() {
        return new axv(this.a.getApplicationContext(), this.b, this.c, this.d);
    }
}
