package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.an;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.bq;

final /* synthetic */ class nh implements js {
    private final Context a;
    private final xr b;
    private final jp c;
    private final bq d;
    private final String e;

    nh(Context context, xr xrVar, jp jpVar, bq bqVar, String str) {
        this.a = context;
        this.b = xrVar;
        this.c = jpVar;
        this.d = bqVar;
        this.e = str;
    }

    public final kh a(Object obj) {
        Context context = this.a;
        xr xrVar = this.b;
        jp jpVar = this.c;
        bq bqVar = this.d;
        String str = this.e;
        mw a2 = au.f().a(context, or.a(), "", false, false, xrVar, jpVar, (atj) null, (an) null, bqVar, aog.a());
        kr a3 = kr.a(a2);
        a2.w().a((nb) new ni(a3));
        a2.loadUrl(str);
        return a3;
    }
}
