package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.a.c;
import com.google.android.gms.internal.apg;

final class apm extends apg.a<cp> {
    private /* synthetic */ Context a;
    private /* synthetic */ bar b;
    private /* synthetic */ apg c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    apm(apg apg, Context context, bar bar) {
        super();
        this.c = apg;
        this.a = context;
        this.b = bar;
    }

    public final /* synthetic */ Object a() {
        cp a2 = this.c.g.a(this.a, this.b);
        if (a2 != null) {
            return a2;
        }
        apg.a(this.a, "rewarded_video");
        return new arz();
    }

    public final /* synthetic */ Object a(aqp aqp) {
        return aqp.createRewardedVideoAd(c.a(this.a), this.b, 11910000);
    }
}
