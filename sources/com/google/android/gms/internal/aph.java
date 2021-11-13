package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.a.c;
import com.google.android.gms.internal.apg;

final class aph extends apg.a<aqg> {
    private /* synthetic */ Context a;
    private /* synthetic */ apc b;
    private /* synthetic */ String c;
    private /* synthetic */ bar d;
    private /* synthetic */ apg e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    aph(apg apg, Context context, apc apc, String str, bar bar) {
        super();
        this.e = apg;
        this.a = context;
        this.b = apc;
        this.c = str;
        this.d = bar;
    }

    public final /* synthetic */ Object a() {
        aqg a2 = this.e.c.a(this.a, this.b, this.c, this.d, 1);
        if (a2 != null) {
            return a2;
        }
        apg.a(this.a, "banner");
        return new arw();
    }

    public final /* synthetic */ Object a(aqp aqp) {
        return aqp.createBannerAdManager(c.a(this.a), this.b, this.c, this.d, 11910000);
    }
}
