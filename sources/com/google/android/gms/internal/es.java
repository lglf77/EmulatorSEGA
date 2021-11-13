package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.c.a;

@bfk
public final class es implements eu {
    public final kh<a.C0015a> a(Context context) {
        ks ksVar = new ks();
        app.a();
        if (jc.f(context)) {
            gq.a((Runnable) new et(this, context, ksVar));
        }
        return ksVar;
    }

    public final kh<String> a(String str, PackageInfo packageInfo) {
        return jx.a(str);
    }
}
