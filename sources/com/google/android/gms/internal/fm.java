package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.common.b;
import com.google.android.gms.common.c;
import java.io.IOException;

final class fm extends fj {
    private Context a;

    fm(Context context) {
        this.a = context;
    }

    public final void a() {
        boolean z;
        try {
            z = a.b(this.a);
        } catch (b | c | IOException | IllegalStateException e) {
            fn.b("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        jg.a(z);
        fn.e(new StringBuilder(43).append("Update ad debug logging enablement as ").append(z).toString());
    }

    public final void b() {
    }
}
