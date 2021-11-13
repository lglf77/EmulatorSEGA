package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.au;

@TargetApi(21)
public final class hn extends hm {
    public final mx a(mw mwVar, boolean z) {
        return new oj(mwVar, z);
    }

    public final CookieManager c(Context context) {
        if (e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            fn.b("Failed to obtain CookieManager.", th);
            au.i().a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final int f() {
        return 16974374;
    }
}
