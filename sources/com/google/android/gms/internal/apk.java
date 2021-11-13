package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.a.c;
import com.google.android.gms.internal.apg;

final class apk extends apg.a<aqb> {
    private /* synthetic */ Context a;
    private /* synthetic */ String b;
    private /* synthetic */ bar c;
    private /* synthetic */ apg d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    apk(apg apg, Context context, String str, bar bar) {
        super();
        this.d = apg;
        this.a = context;
        this.b = str;
        this.c = bar;
    }

    public final /* synthetic */ Object a() {
        aqb a2 = this.d.d.a(this.a, this.b, this.c);
        if (a2 != null) {
            return a2;
        }
        apg.a(this.a, "native_ad");
        return new ars();
    }

    public final /* synthetic */ Object a(aqp aqp) {
        return aqp.createAdLoaderBuilder(c.a(this.a), this.b, this.c, 11910000);
    }
}
