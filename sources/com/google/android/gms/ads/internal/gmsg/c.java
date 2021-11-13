package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.br;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.internal.aot;
import com.google.android.gms.internal.bcd;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.nw;
import com.google.android.gms.internal.nx;
import com.google.android.gms.internal.ok;
import com.google.android.gms.internal.om;
import com.google.android.gms.internal.oo;
import com.google.android.gms.internal.xr;
import java.util.Map;

@bfk
public final class c<T extends nw & nx & ok & om & oo> implements aa<T> {
    private final Context a;
    private final xr b;
    private jp c;
    private q d;
    private aot e;
    private n f;
    private i g;
    private br h;
    private bcd i;
    private mw j = null;

    public c(Context context, jp jpVar, xr xrVar, q qVar, aot aot, i iVar, n nVar, br brVar, bcd bcd) {
        this.a = context;
        this.c = jpVar;
        this.b = xrVar;
        this.d = qVar;
        this.e = aot;
        this.g = iVar;
        this.h = brVar;
        this.i = bcd;
        this.f = nVar;
    }

    private final void a(boolean z) {
        if (this.i != null) {
            this.i.a(z);
        }
    }

    private static boolean a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int b(Map<String, String> map) {
        String str = map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return au.g().b();
            }
            if ("l".equalsIgnoreCase(str)) {
                return au.g().a();
            }
            if ("c".equalsIgnoreCase(str)) {
                return au.g().c();
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0122 A[SYNTHETIC, Splitter:B:46:0x0122] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zza(java.lang.Object r11, java.util.Map r12) {
        /*
            r10 = this;
            r5 = 1
            r4 = 0
            r6 = 0
            com.google.android.gms.internal.nw r11 = (com.google.android.gms.internal.nw) r11
            java.lang.String r1 = "u"
            java.lang.Object r1 = r12.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            android.content.Context r2 = r11.getContext()
            java.lang.String r3 = com.google.android.gms.internal.ep.a(r1, r2)
            java.lang.String r1 = "a"
            java.lang.Object r1 = r12.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = "Action missing from an open GMSG."
            com.google.android.gms.internal.fn.e(r1)
        L_0x0024:
            return
        L_0x0025:
            com.google.android.gms.ads.internal.br r2 = r10.h
            if (r2 == 0) goto L_0x0037
            com.google.android.gms.ads.internal.br r2 = r10.h
            boolean r2 = r2.b()
            if (r2 != 0) goto L_0x0037
            com.google.android.gms.ads.internal.br r1 = r10.h
            r1.a(r3)
            goto L_0x0024
        L_0x0037:
            java.lang.String r2 = "expand"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x005f
            r1 = r11
            com.google.android.gms.internal.nx r1 = (com.google.android.gms.internal.nx) r1
            boolean r1 = r1.z()
            if (r1 == 0) goto L_0x004e
            java.lang.String r1 = "Cannot expand WebView that is already expanded."
            com.google.android.gms.internal.fn.e(r1)
            goto L_0x0024
        L_0x004e:
            r10.a((boolean) r4)
            com.google.android.gms.internal.ok r11 = (com.google.android.gms.internal.ok) r11
            boolean r1 = a((java.util.Map<java.lang.String, java.lang.String>) r12)
            int r2 = b(r12)
            r11.a(r1, r2)
            goto L_0x0024
        L_0x005f:
            java.lang.String r2 = "webapp"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x0098
            r10.a((boolean) r4)
            if (r3 == 0) goto L_0x007a
            com.google.android.gms.internal.ok r11 = (com.google.android.gms.internal.ok) r11
            boolean r1 = a((java.util.Map<java.lang.String, java.lang.String>) r12)
            int r2 = b(r12)
            r11.a(r1, r2, r3)
            goto L_0x0024
        L_0x007a:
            com.google.android.gms.internal.ok r11 = (com.google.android.gms.internal.ok) r11
            boolean r3 = a((java.util.Map<java.lang.String, java.lang.String>) r12)
            int r4 = b(r12)
            java.lang.String r1 = "html"
            java.lang.Object r1 = r12.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "baseurl"
            java.lang.Object r2 = r12.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r11.a(r3, r4, r1, r2)
            goto L_0x0024
        L_0x0098:
            java.lang.String r2 = "app"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r2 = "true"
            java.lang.String r1 = "system_browser"
            java.lang.Object r1 = r12.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00f5
            r10.a((boolean) r5)
            r11.getContext()
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L_0x00c3
            java.lang.String r1 = "Destination url cannot be empty."
            com.google.android.gms.internal.fn.e(r1)
            goto L_0x0024
        L_0x00c3:
            com.google.android.gms.ads.internal.gmsg.d r2 = new com.google.android.gms.ads.internal.gmsg.d
            android.content.Context r3 = r11.getContext()
            r1 = r11
            com.google.android.gms.internal.om r1 = (com.google.android.gms.internal.om) r1
            com.google.android.gms.internal.xr r4 = r1.y()
            r1 = r11
            com.google.android.gms.internal.oo r1 = (com.google.android.gms.internal.oo) r1
            if (r1 != 0) goto L_0x00d6
            throw r6
        L_0x00d6:
            android.view.View r1 = (android.view.View) r1
            r2.<init>(r3, r4, r1)
            android.content.Intent r1 = r2.a((java.util.Map<java.lang.String, java.lang.String>) r12)
            com.google.android.gms.internal.ok r11 = (com.google.android.gms.internal.ok) r11     // Catch:{ ActivityNotFoundException -> 0x00eb }
            com.google.android.gms.ads.internal.overlay.c r2 = new com.google.android.gms.ads.internal.overlay.c     // Catch:{ ActivityNotFoundException -> 0x00eb }
            r2.<init>(r1)     // Catch:{ ActivityNotFoundException -> 0x00eb }
            r11.a(r2)     // Catch:{ ActivityNotFoundException -> 0x00eb }
            goto L_0x0024
        L_0x00eb:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            com.google.android.gms.internal.fn.e(r1)
            goto L_0x0024
        L_0x00f5:
            r10.a((boolean) r5)
            java.lang.String r1 = "intent_url"
            java.lang.Object r1 = r12.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0171
            r2 = 0
            android.content.Intent r1 = android.content.Intent.parseUri(r1, r2)     // Catch:{ URISyntaxException -> 0x015d }
            r5 = r1
        L_0x010c:
            if (r5 == 0) goto L_0x014f
            android.net.Uri r1 = r5.getData()
            if (r1 == 0) goto L_0x014f
            android.net.Uri r2 = r5.getData()
            java.lang.String r4 = r2.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x01a1
            com.google.android.gms.ads.internal.au.e()     // Catch:{ Exception -> 0x0138 }
            android.content.Context r7 = r11.getContext()     // Catch:{ Exception -> 0x0138 }
            r0 = r11
            com.google.android.gms.internal.om r0 = (com.google.android.gms.internal.om) r0     // Catch:{ Exception -> 0x0138 }
            r1 = r0
            com.google.android.gms.internal.xr r8 = r1.y()     // Catch:{ Exception -> 0x0138 }
            r0 = r11
            com.google.android.gms.internal.oo r0 = (com.google.android.gms.internal.oo) r0     // Catch:{ Exception -> 0x0138 }
            r1 = r0
            if (r1 != 0) goto L_0x0179
            throw r6     // Catch:{ Exception -> 0x0138 }
        L_0x0138:
            r1 = move-exception
            java.lang.String r7 = "Error occurred while adding signals."
            com.google.android.gms.internal.fn.b(r7, r1)
            com.google.android.gms.internal.fa r7 = com.google.android.gms.ads.internal.au.i()
            java.lang.String r8 = "OpenGmsgHandler.onGmsg"
            r7.a((java.lang.Throwable) r1, (java.lang.String) r8)
            r1 = r4
        L_0x0148:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0184 }
        L_0x014c:
            r5.setData(r1)
        L_0x014f:
            if (r5 == 0) goto L_0x01a9
            com.google.android.gms.internal.ok r11 = (com.google.android.gms.internal.ok) r11
            com.google.android.gms.ads.internal.overlay.c r1 = new com.google.android.gms.ads.internal.overlay.c
            r1.<init>(r5)
            r11.a(r1)
            goto L_0x0024
        L_0x015d:
            r2 = move-exception
            java.lang.String r4 = "Error parsing the url: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r5 = r1.length()
            if (r5 == 0) goto L_0x0173
            java.lang.String r1 = r4.concat(r1)
        L_0x016e:
            com.google.android.gms.internal.fn.b(r1, r2)
        L_0x0171:
            r5 = r6
            goto L_0x010c
        L_0x0173:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
            goto L_0x016e
        L_0x0179:
            android.view.View r1 = (android.view.View) r1     // Catch:{ Exception -> 0x0138 }
            android.app.Activity r9 = r11.d()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r1 = com.google.android.gms.internal.gw.a((android.content.Context) r7, (com.google.android.gms.internal.xr) r8, (java.lang.String) r4, (android.view.View) r1, (android.app.Activity) r9)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0148
        L_0x0184:
            r4 = move-exception
            java.lang.String r7 = "Error parsing the uri: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r8 = r1.length()
            if (r8 == 0) goto L_0x01a3
            java.lang.String r1 = r7.concat(r1)
        L_0x0195:
            com.google.android.gms.internal.fn.b(r1, r4)
            com.google.android.gms.internal.fa r1 = com.google.android.gms.ads.internal.au.i()
            java.lang.String r7 = "OpenGmsgHandler.onGmsg"
            r1.a((java.lang.Throwable) r4, (java.lang.String) r7)
        L_0x01a1:
            r1 = r2
            goto L_0x014c
        L_0x01a3:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r7)
            goto L_0x0195
        L_0x01a9:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x01cd
            com.google.android.gms.ads.internal.au.e()
            android.content.Context r2 = r11.getContext()
            r1 = r11
            com.google.android.gms.internal.om r1 = (com.google.android.gms.internal.om) r1
            com.google.android.gms.internal.xr r4 = r1.y()
            r1 = r11
            com.google.android.gms.internal.oo r1 = (com.google.android.gms.internal.oo) r1
            if (r1 != 0) goto L_0x01c3
            throw r6
        L_0x01c3:
            android.view.View r1 = (android.view.View) r1
            android.app.Activity r5 = r11.d()
            java.lang.String r3 = com.google.android.gms.internal.gw.a((android.content.Context) r2, (com.google.android.gms.internal.xr) r4, (java.lang.String) r3, (android.view.View) r1, (android.app.Activity) r5)
        L_0x01cd:
            com.google.android.gms.internal.ok r11 = (com.google.android.gms.internal.ok) r11
            com.google.android.gms.ads.internal.overlay.c r1 = new com.google.android.gms.ads.internal.overlay.c
            java.lang.String r2 = "i"
            java.lang.Object r2 = r12.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "m"
            java.lang.Object r4 = r12.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "p"
            java.lang.Object r5 = r12.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "c"
            java.lang.Object r6 = r12.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "f"
            java.lang.Object r7 = r12.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "e"
            java.lang.Object r8 = r12.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r11.a(r1)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.c.zza(java.lang.Object, java.util.Map):void");
    }
}
