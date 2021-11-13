package com.google.android.gms.ads.internal;

import java.util.concurrent.Callable;

final class az implements Callable<String> {
    private /* synthetic */ ay a;

    az(ay ayVar) {
        this.a = ayVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r0 = com.google.android.gms.ads.internal.au.g().c(r3.a.e.c);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object call() {
        /*
            r3 = this;
            java.lang.String r1 = ""
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.cm
            com.google.android.gms.internal.asu r2 = com.google.android.gms.internal.app.f()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002b
            com.google.android.gms.internal.hc r0 = com.google.android.gms.ads.internal.au.g()
            com.google.android.gms.ads.internal.ay r2 = r3.a
            com.google.android.gms.ads.internal.av r2 = r2.e
            android.content.Context r2 = r2.c
            android.webkit.CookieManager r0 = r0.c((android.content.Context) r2)
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = "googleads.g.doubleclick.net"
            java.lang.String r0 = r0.getCookie(r1)
        L_0x002a:
            return r0
        L_0x002b:
            r0 = r1
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.az.call():java.lang.Object");
    }
}
