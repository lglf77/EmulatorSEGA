package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.c.f;
import android.text.TextUtils;
import com.google.android.gms.ads.b.j;
import com.google.android.gms.internal.apc;
import com.google.android.gms.internal.apv;
import com.google.android.gms.internal.apy;
import com.google.android.gms.internal.aqc;
import com.google.android.gms.internal.aqs;
import com.google.android.gms.internal.auv;
import com.google.android.gms.internal.awi;
import com.google.android.gms.internal.awl;
import com.google.android.gms.internal.awo;
import com.google.android.gms.internal.awr;
import com.google.android.gms.internal.awv;
import com.google.android.gms.internal.awy;
import com.google.android.gms.internal.bar;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.jp;

@bfk
public final class k extends aqc {
    private apv a;
    private awi b;
    private awv c;
    private awl d;
    private f<String, awo> e = new f<>();
    private f<String, awr> f = new f<>();
    private awy g;
    private apc h;
    private j i;
    private auv j;
    private aqs k;
    private final Context l;
    private final bar m;
    private final String n;
    private final jp o;
    private final bq p;

    public k(Context context, String str, bar bar, jp jpVar, bq bqVar) {
        this.l = context;
        this.n = str;
        this.m = bar;
        this.o = jpVar;
        this.p = bqVar;
    }

    public final apy a() {
        return new h(this.l, this.n, this.m, this.o, this.a, this.b, this.c, this.d, this.f, this.e, this.j, this.k, this.p, this.g, this.h, this.i);
    }

    public final void a(j jVar) {
        this.i = jVar;
    }

    public final void a(apv apv) {
        this.a = apv;
    }

    public final void a(aqs aqs) {
        this.k = aqs;
    }

    public final void a(auv auv) {
        this.j = auv;
    }

    public final void a(awi awi) {
        this.b = awi;
    }

    public final void a(awl awl) {
        this.d = awl;
    }

    public final void a(awv awv) {
        this.c = awv;
    }

    public final void a(awy awy, apc apc) {
        this.g = awy;
        this.h = apc;
    }

    public final void a(String str, awr awr, awo awo) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.f.put(str, awr);
        this.e.put(str, awo);
    }
}
