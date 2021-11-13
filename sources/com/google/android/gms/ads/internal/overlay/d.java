package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.a;
import com.google.android.gms.a.c;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.common.util.j;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.bco;
import com.google.android.gms.internal.bcs;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.mw;
import java.util.Collections;
import java.util.Map;

@bfk
public final class d extends bcs implements t {
    private static int b = Color.argb(0, 0, 0, 0);
    AdOverlayInfoParcel a;
    /* access modifiers changed from: private */
    public final Activity c;
    private mw d;
    private i e;
    private o f;
    private boolean g = false;
    private FrameLayout h;
    private WebChromeClient.CustomViewCallback i;
    private boolean j = false;
    private boolean k = false;
    private h l;
    private boolean m = false;
    private int n = 0;
    private final Object o = new Object();
    private Runnable p;
    private boolean q;
    private boolean r;
    private boolean s = false;
    private boolean t = false;
    private boolean u = true;

    public d(Activity activity) {
        this.c = activity;
    }

    private final void a(boolean z) {
        int intValue = ((Integer) app.f().a(asw.cI)).intValue();
        p pVar = new p();
        pVar.e = 50;
        pVar.a = z ? intValue : 0;
        pVar.b = z ? 0 : intValue;
        pVar.c = 0;
        pVar.d = intValue;
        this.f = new o(this.c, pVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        a(z, this.a.g);
        this.l.addView(this.f, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0143 A[SYNTHETIC, Splitter:B:51:0x0143] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x025c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(boolean r18) {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = r0.r
            if (r1 != 0) goto L_0x000e
            r0 = r17
            android.app.Activity r1 = r0.c
            r2 = 1
            r1.requestWindowFeature(r2)
        L_0x000e:
            r0 = r17
            android.app.Activity r1 = r0.c
            android.view.Window r3 = r1.getWindow()
            if (r3 != 0) goto L_0x0020
            com.google.android.gms.ads.internal.overlay.g r1 = new com.google.android.gms.ads.internal.overlay.g
            java.lang.String r2 = "Invalid activity, no window available."
            r1.<init>(r2)
            throw r1
        L_0x0020:
            r2 = 1
            boolean r1 = com.google.android.gms.common.util.j.h()
            if (r1 == 0) goto L_0x0308
            com.google.android.gms.internal.asl<java.lang.Boolean> r1 = com.google.android.gms.internal.asw.cG
            com.google.android.gms.internal.asu r4 = com.google.android.gms.internal.app.f()
            java.lang.Object r1 = r4.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0308
            com.google.android.gms.ads.internal.au.e()
            r0 = r17
            android.app.Activity r1 = r0.c
            r0 = r17
            android.app.Activity r2 = r0.c
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            boolean r1 = com.google.android.gms.internal.gw.a((android.app.Activity) r1, (android.content.res.Configuration) r2)
        L_0x0050:
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r0.a
            com.google.android.gms.ads.internal.p r2 = r2.o
            if (r2 == 0) goto L_0x0226
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r0.a
            com.google.android.gms.ads.internal.p r2 = r2.o
            boolean r2 = r2.b
            if (r2 == 0) goto L_0x0226
            r2 = 1
        L_0x0063:
            r0 = r17
            boolean r4 = r0.k
            if (r4 == 0) goto L_0x006b
            if (r2 == 0) goto L_0x00a7
        L_0x006b:
            if (r1 == 0) goto L_0x00a7
            r1 = 1024(0x400, float:1.435E-42)
            r2 = 1024(0x400, float:1.435E-42)
            r3.setFlags(r1, r2)
            com.google.android.gms.internal.asl<java.lang.Boolean> r1 = com.google.android.gms.internal.asw.aD
            com.google.android.gms.internal.asu r2 = com.google.android.gms.internal.app.f()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00a7
            boolean r1 = com.google.android.gms.common.util.j.e()
            if (r1 == 0) goto L_0x00a7
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            com.google.android.gms.ads.internal.p r1 = r1.o
            if (r1 == 0) goto L_0x00a7
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            com.google.android.gms.ads.internal.p r1 = r1.o
            boolean r1 = r1.f
            if (r1 == 0) goto L_0x00a7
            android.view.View r1 = r3.getDecorView()
            r2 = 4098(0x1002, float:5.743E-42)
            r1.setSystemUiVisibility(r2)
        L_0x00a7:
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            com.google.android.gms.internal.mw r1 = r1.d
            if (r1 == 0) goto L_0x0229
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            com.google.android.gms.internal.mw r1 = r1.d
            com.google.android.gms.internal.mx r1 = r1.w()
        L_0x00b9:
            if (r1 == 0) goto L_0x022c
            boolean r6 = r1.b()
        L_0x00bf:
            r1 = 0
            r0 = r17
            r0.m = r1
            if (r6 == 0) goto L_0x00ec
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            int r1 = r1.j
            com.google.android.gms.internal.hc r2 = com.google.android.gms.ads.internal.au.g()
            int r2 = r2.a()
            if (r1 != r2) goto L_0x0232
            r0 = r17
            android.app.Activity r1 = r0.c
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r2 = 1
            if (r1 != r2) goto L_0x022f
            r1 = 1
        L_0x00e8:
            r0 = r17
            r0.m = r1
        L_0x00ec:
            r0 = r17
            boolean r1 = r0.m
            r2 = 46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.String r2 = "Delay onShow to next orientation change: "
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.fn.b(r1)
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            int r1 = r1.j
            r0 = r17
            r0.a((int) r1)
            com.google.android.gms.internal.hc r1 = com.google.android.gms.ads.internal.au.g()
            boolean r1 = r1.a((android.view.Window) r3)
            if (r1 == 0) goto L_0x0122
            java.lang.String r1 = "Hardware acceleration on the AdActivity window enabled."
            com.google.android.gms.internal.fn.b(r1)
        L_0x0122:
            r0 = r17
            boolean r1 = r0.k
            if (r1 != 0) goto L_0x025c
            r0 = r17
            com.google.android.gms.ads.internal.overlay.h r1 = r0.l
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setBackgroundColor(r2)
        L_0x0131:
            r0 = r17
            android.app.Activity r1 = r0.c
            r0 = r17
            com.google.android.gms.ads.internal.overlay.h r2 = r0.l
            r1.setContentView(r2)
            r1 = 1
            r0 = r17
            r0.r = r1
            if (r18 == 0) goto L_0x02ab
            com.google.android.gms.internal.ng r1 = com.google.android.gms.ads.internal.au.f()     // Catch:{ Exception -> 0x0270 }
            r0 = r17
            android.app.Activity r2 = r0.c     // Catch:{ Exception -> 0x0270 }
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r0.a     // Catch:{ Exception -> 0x0270 }
            com.google.android.gms.internal.mw r3 = r3.d     // Catch:{ Exception -> 0x0270 }
            if (r3 == 0) goto L_0x0267
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r0.a     // Catch:{ Exception -> 0x0270 }
            com.google.android.gms.internal.mw r3 = r3.d     // Catch:{ Exception -> 0x0270 }
            com.google.android.gms.internal.or r3 = r3.u()     // Catch:{ Exception -> 0x0270 }
        L_0x015d:
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r0.a     // Catch:{ Exception -> 0x0270 }
            com.google.android.gms.internal.mw r4 = r4.d     // Catch:{ Exception -> 0x0270 }
            if (r4 == 0) goto L_0x026a
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r0.a     // Catch:{ Exception -> 0x0270 }
            com.google.android.gms.internal.mw r4 = r4.d     // Catch:{ Exception -> 0x0270 }
            java.lang.String r4 = r4.v()     // Catch:{ Exception -> 0x0270 }
        L_0x016f:
            r5 = 1
            r7 = 0
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r8 = r0.a     // Catch:{ Exception -> 0x0270 }
            com.google.android.gms.internal.jp r8 = r8.m     // Catch:{ Exception -> 0x0270 }
            r9 = 0
            r10 = 0
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r11 = r0.a     // Catch:{ Exception -> 0x0270 }
            com.google.android.gms.internal.mw r11 = r11.d     // Catch:{ Exception -> 0x0270 }
            if (r11 == 0) goto L_0x026d
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r11 = r0.a     // Catch:{ Exception -> 0x0270 }
            com.google.android.gms.internal.mw r11 = r11.d     // Catch:{ Exception -> 0x0270 }
            com.google.android.gms.ads.internal.bq r11 = r11.e()     // Catch:{ Exception -> 0x0270 }
        L_0x018b:
            com.google.android.gms.internal.aog r12 = com.google.android.gms.internal.aog.a()     // Catch:{ Exception -> 0x0270 }
            com.google.android.gms.internal.mw r1 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0270 }
            r0 = r17
            r0.d = r1     // Catch:{ Exception -> 0x0270 }
            r0 = r17
            com.google.android.gms.internal.mw r1 = r0.d
            com.google.android.gms.internal.mx r7 = r1.w()
            r8 = 0
            r9 = 0
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            com.google.android.gms.ads.internal.gmsg.i r10 = r1.e
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            com.google.android.gms.ads.internal.overlay.q r11 = r1.i
            r12 = 1
            r13 = 0
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            com.google.android.gms.internal.mw r1 = r1.d
            if (r1 == 0) goto L_0x027e
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            com.google.android.gms.internal.mw r1 = r1.d
            com.google.android.gms.internal.mx r1 = r1.w()
            com.google.android.gms.ads.internal.br r14 = r1.a()
        L_0x01c5:
            r15 = 0
            r16 = 0
            r7.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = r17
            com.google.android.gms.internal.mw r1 = r0.d
            com.google.android.gms.internal.mx r1 = r1.w()
            com.google.android.gms.ads.internal.overlay.e r2 = new com.google.android.gms.ads.internal.overlay.e
            r0 = r17
            r2.<init>(r0)
            r1.a((com.google.android.gms.internal.nb) r2)
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            java.lang.String r1 = r1.l
            if (r1 == 0) goto L_0x0281
            r0 = r17
            com.google.android.gms.internal.mw r1 = r0.d
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = r0.a
            java.lang.String r2 = r2.l
            r1.loadUrl(r2)
        L_0x01f2:
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            com.google.android.gms.internal.mw r1 = r1.d
            if (r1 == 0) goto L_0x0205
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            com.google.android.gms.internal.mw r1 = r1.d
            r0 = r17
            r1.b((com.google.android.gms.ads.internal.overlay.d) r0)
        L_0x0205:
            r0 = r17
            com.google.android.gms.internal.mw r1 = r0.d
            r0 = r17
            r1.a((com.google.android.gms.ads.internal.overlay.d) r0)
            r0 = r17
            com.google.android.gms.internal.mw r1 = r0.d
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L_0x02c7
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x02c7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = r17
            com.google.android.gms.internal.mw r2 = r0.d
            if (r2 != 0) goto L_0x02c2
            r1 = 0
            throw r1
        L_0x0226:
            r2 = 0
            goto L_0x0063
        L_0x0229:
            r1 = 0
            goto L_0x00b9
        L_0x022c:
            r6 = 0
            goto L_0x00bf
        L_0x022f:
            r1 = 0
            goto L_0x00e8
        L_0x0232:
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            int r1 = r1.j
            com.google.android.gms.internal.hc r2 = com.google.android.gms.ads.internal.au.g()
            int r2 = r2.b()
            if (r1 != r2) goto L_0x00ec
            r0 = r17
            android.app.Activity r1 = r0.c
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r2 = 2
            if (r1 != r2) goto L_0x025a
            r1 = 1
        L_0x0254:
            r0 = r17
            r0.m = r1
            goto L_0x00ec
        L_0x025a:
            r1 = 0
            goto L_0x0254
        L_0x025c:
            r0 = r17
            com.google.android.gms.ads.internal.overlay.h r1 = r0.l
            int r2 = b
            r1.setBackgroundColor(r2)
            goto L_0x0131
        L_0x0267:
            r3 = 0
            goto L_0x015d
        L_0x026a:
            r4 = 0
            goto L_0x016f
        L_0x026d:
            r11 = 0
            goto L_0x018b
        L_0x0270:
            r1 = move-exception
            java.lang.String r2 = "Error obtaining webview."
            com.google.android.gms.internal.fn.b(r2, r1)
            com.google.android.gms.ads.internal.overlay.g r1 = new com.google.android.gms.ads.internal.overlay.g
            java.lang.String r2 = "Could not obtain webview for the overlay."
            r1.<init>(r2)
            throw r1
        L_0x027e:
            r14 = 0
            goto L_0x01c5
        L_0x0281:
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            java.lang.String r1 = r1.h
            if (r1 == 0) goto L_0x02a3
            r0 = r17
            com.google.android.gms.internal.mw r7 = r0.d
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            java.lang.String r8 = r1.f
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            java.lang.String r9 = r1.h
            java.lang.String r10 = "text/html"
            java.lang.String r11 = "UTF-8"
            r12 = 0
            r7.loadDataWithBaseURL(r8, r9, r10, r11, r12)
            goto L_0x01f2
        L_0x02a3:
            com.google.android.gms.ads.internal.overlay.g r1 = new com.google.android.gms.ads.internal.overlay.g
            java.lang.String r2 = "No URL or HTML to display in ad overlay."
            r1.<init>(r2)
            throw r1
        L_0x02ab:
            r0 = r17
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r1 = r0.a
            com.google.android.gms.internal.mw r1 = r1.d
            r0 = r17
            r0.d = r1
            r0 = r17
            com.google.android.gms.internal.mw r1 = r0.d
            r0 = r17
            android.app.Activity r2 = r0.c
            r1.a((android.content.Context) r2)
            goto L_0x0205
        L_0x02c2:
            android.view.View r2 = (android.view.View) r2
            r1.removeView(r2)
        L_0x02c7:
            r0 = r17
            boolean r1 = r0.k
            if (r1 == 0) goto L_0x02d4
            r0 = r17
            com.google.android.gms.internal.mw r1 = r0.d
            r1.K()
        L_0x02d4:
            r0 = r17
            com.google.android.gms.ads.internal.overlay.h r2 = r0.l
            r0 = r17
            com.google.android.gms.internal.mw r1 = r0.d
            if (r1 != 0) goto L_0x02e0
            r1 = 0
            throw r1
        L_0x02e0:
            android.view.View r1 = (android.view.View) r1
            r3 = -1
            r4 = -1
            r2.addView(r1, r3, r4)
            if (r18 != 0) goto L_0x02f2
            r0 = r17
            boolean r1 = r0.m
            if (r1 != 0) goto L_0x02f2
            r17.s()
        L_0x02f2:
            r0 = r17
            r0.a((boolean) r6)
            r0 = r17
            com.google.android.gms.internal.mw r1 = r0.d
            boolean r1 = r1.x()
            if (r1 == 0) goto L_0x0307
            r1 = 1
            r0 = r17
            r0.a((boolean) r6, (boolean) r1)
        L_0x0307:
            return
        L_0x0308:
            r1 = r2
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.d.b(boolean):void");
    }

    private final void r() {
        if (this.c.isFinishing() && !this.s) {
            this.s = true;
            if (this.d != null) {
                this.d.a(this.n);
                synchronized (this.o) {
                    if (!this.q && this.d.F()) {
                        this.p = new f(this);
                        gw.a.postDelayed(this.p, ((Long) app.f().a(asw.aC)).longValue());
                        return;
                    }
                }
            }
            n();
        }
    }

    private final void s() {
        this.d.p();
    }

    public final void a() {
        this.n = 2;
        this.c.finish();
    }

    public final void a(int i2) {
        this.c.setRequestedOrientation(i2);
    }

    public final void a(int i2, int i3, Intent intent) {
    }

    public final void a(Bundle bundle) {
        boolean z = false;
        this.c.requestWindowFeature(1);
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        this.j = z;
        try {
            this.a = AdOverlayInfoParcel.a(this.c.getIntent());
            if (this.a == null) {
                throw new g("Could not get info for ad overlay.");
            }
            if (this.a.m.c > 7500000) {
                this.n = 3;
            }
            if (this.c.getIntent() != null) {
                this.u = this.c.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.a.o != null) {
                this.k = this.a.o.a;
            } else {
                this.k = false;
            }
            if (((Boolean) app.f().a(asw.bE)).booleanValue() && this.k && this.a.o.e != -1) {
                new j(this, (e) null).h();
            }
            if (bundle == null) {
                if (this.a.c != null && this.u) {
                    this.a.c.f();
                }
                if (!(this.a.k == 1 || this.a.b == null)) {
                    this.a.b.e();
                }
            }
            this.l = new h(this.c, this.a.n, this.a.m.a);
            this.l.setId(1000);
            switch (this.a.k) {
                case a.b.AdsAttrs_adSizes:
                    b(false);
                    return;
                case 2:
                    this.e = new i(this.a.d);
                    b(false);
                    return;
                case 3:
                    b(true);
                    return;
                case 4:
                    if (this.j) {
                        this.n = 3;
                        this.c.finish();
                        return;
                    }
                    au.b();
                    if (!a.a((Context) this.c, this.a.a, this.a.i)) {
                        this.n = 3;
                        this.c.finish();
                        return;
                    }
                    return;
                default:
                    throw new g("Could not determine ad overlay type.");
            }
        } catch (g e2) {
            fn.e(e2.getMessage());
            this.n = 3;
            this.c.finish();
        }
    }

    public final void a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.h = new FrameLayout(this.c);
        this.h.setBackgroundColor(-16777216);
        this.h.addView(view, -1, -1);
        this.c.setContentView(this.h);
        this.r = true;
        this.i = customViewCallback;
        this.g = true;
    }

    public final void a(com.google.android.gms.a.a aVar) {
        if (((Boolean) app.f().a(asw.cG)).booleanValue() && j.h()) {
            au.e();
            if (gw.a(this.c, (Configuration) c.a(aVar))) {
                this.c.getWindow().addFlags(1024);
                this.c.getWindow().clearFlags(2048);
                return;
            }
            this.c.getWindow().addFlags(2048);
            this.c.getWindow().clearFlags(1024);
        }
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = ((Boolean) app.f().a(asw.aE)).booleanValue() && this.a != null && this.a.o != null && this.a.o.g;
        if (z && z2 && z3) {
            new bco(this.d, "useCustomClose").a("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        if (this.f != null) {
            this.f.a(z, z2 && !z3);
        }
    }

    public final void b() {
        if (this.a != null && this.g) {
            a(this.a.j);
        }
        if (this.h != null) {
            this.c.setContentView(this.l);
            this.r = true;
            this.h.removeAllViews();
            this.h = null;
        }
        if (this.i != null) {
            this.i.onCustomViewHidden();
            this.i = null;
        }
        this.g = false;
    }

    public final void b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.j);
    }

    public final void c() {
        this.n = 1;
        this.c.finish();
    }

    public final void d() {
        this.n = 0;
    }

    public final boolean e() {
        this.n = 0;
        if (this.d == null) {
            return true;
        }
        boolean D = this.d.D();
        if (D) {
            return D;
        }
        this.d.a("onbackblocked", (Map<String, ?>) Collections.emptyMap());
        return D;
    }

    public final void f() {
    }

    public final void g() {
        if (!((Boolean) app.f().a(asw.cH)).booleanValue()) {
            return;
        }
        if (this.d == null || this.d.B()) {
            fn.e("The webview does not exist. Ignoring action.");
            return;
        }
        au.g();
        hc.b(this.d);
    }

    public final void h() {
        if (this.a != null && this.a.k == 4) {
            if (this.j) {
                this.n = 3;
                this.c.finish();
            } else {
                this.j = true;
            }
        }
        if (this.a.c != null) {
            this.a.c.d();
        }
        if (((Boolean) app.f().a(asw.cH)).booleanValue()) {
            return;
        }
        if (this.d == null || this.d.B()) {
            fn.e("The webview does not exist. Ignoring action.");
            return;
        }
        au.g();
        hc.b(this.d);
    }

    public final void i() {
        b();
        if (this.a.c != null) {
            this.a.c.c();
        }
        if (!((Boolean) app.f().a(asw.cH)).booleanValue() && this.d != null && (!this.c.isFinishing() || this.e == null)) {
            au.g();
            hc.a(this.d);
        }
        r();
    }

    public final void j() {
        if (((Boolean) app.f().a(asw.cH)).booleanValue() && this.d != null && (!this.c.isFinishing() || this.e == null)) {
            au.g();
            hc.a(this.d);
        }
        r();
    }

    public final void k() {
        if (this.d != null) {
            h hVar = this.l;
            mw mwVar = this.d;
            if (mwVar == null) {
                throw null;
            }
            hVar.removeView((View) mwVar);
        }
        r();
    }

    public final void l() {
        this.r = true;
    }

    public final void m() {
        this.l.removeView(this.f);
        a(true);
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        if (!this.t) {
            this.t = true;
            if (this.d != null) {
                h hVar = this.l;
                mw mwVar = this.d;
                if (mwVar == null) {
                    throw null;
                }
                hVar.removeView((View) mwVar);
                if (this.e != null) {
                    this.d.a(this.e.d);
                    this.d.b(false);
                    ViewGroup viewGroup = this.e.c;
                    mw mwVar2 = this.d;
                    if (mwVar2 == null) {
                        throw null;
                    }
                    viewGroup.addView((View) mwVar2, this.e.a, this.e.b);
                    this.e = null;
                } else if (this.c.getApplicationContext() != null) {
                    this.d.a(this.c.getApplicationContext());
                }
                this.d = null;
            }
            if (this.a != null && this.a.c != null) {
                this.a.c.b();
            }
        }
    }

    public final void o() {
        if (this.m) {
            this.m = false;
            s();
        }
    }

    public final void p() {
        this.l.a = true;
    }

    public final void q() {
        synchronized (this.o) {
            this.q = true;
            if (this.p != null) {
                gw.a.removeCallbacks(this.p);
                gw.a.post(this.p);
            }
        }
    }
}
