package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;
import java.util.Map;

@bfk
public final class bcf {
    private final mw a;
    private final boolean b;
    private final String c;

    public bcf(mw mwVar, Map<String, String> map) {
        this.a = mwVar;
        this.c = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.b = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.b = true;
        }
    }

    public final void a() {
        if (this.a == null) {
            fn.e("AdWebView is null");
        } else {
            this.a.b("portrait".equalsIgnoreCase(this.c) ? au.g().b() : "landscape".equalsIgnoreCase(this.c) ? au.g().a() : this.b ? -1 : au.g().c());
        }
    }
}
