package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.util.g;

final class m implements o {
    private /* synthetic */ Context a;

    m(Context context) {
        this.a = context;
    }

    public final boolean a(jp jpVar) {
        app.a();
        boolean c = jc.c(this.a);
        boolean z = ((Boolean) app.f().a(asw.cK)).booleanValue() && jpVar.d;
        if (l.b(this.a, jpVar.d) && c && !z) {
            if (!g.c(this.a)) {
                return false;
            }
            if (((Boolean) app.f().a(asw.D)).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
