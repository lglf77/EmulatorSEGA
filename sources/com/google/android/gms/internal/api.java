package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.a.c;
import com.google.android.gms.internal.apg;

final class api extends apg.a<aqg> {
    private /* synthetic */ Context a;
    private /* synthetic */ apc b;
    private /* synthetic */ String c;
    private /* synthetic */ apg d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    api(apg apg, Context context, apc apc, String str) {
        super();
        this.d = apg;
        this.a = context;
        this.b = apc;
        this.c = str;
    }

    public final /* synthetic */ Object a() {
        aqg a2 = this.d.c.a(this.a, this.b, this.c, (bar) null, 3);
        if (a2 != null) {
            return a2;
        }
        apg.a(this.a, "search");
        return new arw();
    }

    public final /* synthetic */ Object a(aqp aqp) {
        return aqp.createSearchAdManager(c.a(this.a), this.b, this.c, 11910000);
    }
}
