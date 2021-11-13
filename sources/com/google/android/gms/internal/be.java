package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.au;

@bfk
public final class be {
    public final bq a = null;
    public final aob b;
    public final eq c;
    public final ask d;
    public final bz e;
    public final azy f;
    public final cb g;
    public final bcx h;
    public final eu i;
    public final boolean j;
    public final bj k;
    private ca l;

    private be(bq bqVar, aob aob, eq eqVar, ask ask, bz bzVar, azy azy, ca caVar, cb cbVar, bcx bcx, eu euVar, boolean z, bj bjVar) {
        this.b = aob;
        this.c = eqVar;
        this.d = ask;
        this.e = bzVar;
        this.f = azy;
        this.l = caVar;
        this.g = cbVar;
        this.h = bcx;
        this.i = euVar;
        this.j = true;
        this.k = bjVar;
    }

    public static be a(Context context) {
        au.A().a(context);
        cg cgVar = new cg(context);
        return new be((bq) null, new aoe(), new er(), new asj(), new bx(context, cgVar.b()), new azz(), new cd(), new cf(), new bcw(), new es(), true, cgVar);
    }
}
