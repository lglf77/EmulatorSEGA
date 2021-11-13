package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.a.c;
import com.google.android.gms.internal.apg;

final class apo extends apg.a<bcr> {
    private /* synthetic */ Activity a;
    private /* synthetic */ apg b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    apo(apg apg, Activity activity) {
        super();
        this.b = apg;
        this.a = activity;
    }

    public final /* synthetic */ Object a() {
        bcr a2 = this.b.h.a(this.a);
        if (a2 != null) {
            return a2;
        }
        apg.a(this.a, "ad_overlay");
        return null;
    }

    public final /* synthetic */ Object a(aqp aqp) {
        return aqp.createAdOverlay(c.a(this.a));
    }
}
