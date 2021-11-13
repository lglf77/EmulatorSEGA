package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.a.c;
import com.google.android.gms.internal.apg;

final class apl extends apg.a<aqv> {
    private /* synthetic */ Context a;
    private /* synthetic */ apg b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    apl(apg apg, Context context) {
        super();
        this.b = apg;
        this.a = context;
    }

    public final /* synthetic */ Object a() {
        aqv b2 = this.b.e.b(this.a);
        if (b2 != null) {
            return b2;
        }
        apg.a(this.a, "mobile_ads_settings");
        return new ary();
    }

    public final /* synthetic */ Object a(aqp aqp) {
        return aqp.getMobileAdsSettingsManagerWithClientJarVersion(c.a(this.a), 11910000);
    }
}
