package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.an;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.bq;
import java.util.concurrent.Callable;

final class nj implements Callable<mw> {
    private /* synthetic */ Context a;
    private /* synthetic */ or b;
    private /* synthetic */ String c;
    private /* synthetic */ boolean d;
    private /* synthetic */ boolean e;
    private /* synthetic */ xr f;
    private /* synthetic */ jp g;
    private /* synthetic */ atj h;
    private /* synthetic */ an i;
    private /* synthetic */ bq j;
    private /* synthetic */ aog k;

    nj(ng ngVar, Context context, or orVar, String str, boolean z, boolean z2, xr xrVar, jp jpVar, atj atj, an anVar, bq bqVar, aog aog) {
        this.a = context;
        this.b = orVar;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = xrVar;
        this.g = jpVar;
        this.h = atj;
        this.i = anVar;
        this.j = bqVar;
        this.k = aog;
    }

    public final /* synthetic */ Object call() {
        nl nlVar = new nl(nm.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k));
        nlVar.setWebViewClient(au.g().a((mw) nlVar, this.e));
        nlVar.setWebChromeClient(au.g().c((mw) nlVar));
        return nlVar;
    }
}
