package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.a;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.common.util.e;
import java.util.Set;

@bfk
public final class bcd extends bco {
    private static Set<String> a = e.a("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String b = "top-right";
    private boolean c = true;
    private int d = 0;
    private int e = 0;
    private int f = -1;
    private int g = 0;
    private int h = 0;
    private int i = -1;
    private final Object j = new Object();
    private final mw k;
    private final Activity l;
    private or m;
    private ImageView n;
    private LinearLayout o;
    private bcp p;
    private PopupWindow q;
    private RelativeLayout r;
    private ViewGroup s;

    public bcd(mw mwVar, bcp bcp) {
        super(mwVar, "resize");
        this.k = mwVar;
        this.l = mwVar.d();
        this.p = bcp;
    }

    private final void b(int i2, int i3) {
        a(i2, i3 - au.e().c(this.l)[0], this.i, this.f);
    }

    private final int[] b() {
        boolean z;
        int i2;
        int i3;
        int[] b2 = au.e().b(this.l);
        int[] c2 = au.e().c(this.l);
        int i4 = b2[0];
        int i5 = b2[1];
        if (this.i < 50 || this.i > i4) {
            fn.e("Width is too small or too large.");
            z = false;
        } else if (this.f < 50 || this.f > i5) {
            fn.e("Height is too small or too large.");
            z = false;
        } else if (this.f == i5 && this.i == i4) {
            fn.e("Cannot resize to a full-screen ad.");
            z = false;
        } else {
            if (this.c) {
                String str = this.b;
                char c3 = 65535;
                switch (str.hashCode()) {
                    case -1364013995:
                        if (str.equals("center")) {
                            c3 = 2;
                            break;
                        }
                        break;
                    case -1012429441:
                        if (str.equals("top-left")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case -655373719:
                        if (str.equals("bottom-left")) {
                            c3 = 3;
                            break;
                        }
                        break;
                    case 1163912186:
                        if (str.equals("bottom-right")) {
                            c3 = 5;
                            break;
                        }
                        break;
                    case 1288627767:
                        if (str.equals("bottom-center")) {
                            c3 = 4;
                            break;
                        }
                        break;
                    case 1755462605:
                        if (str.equals("top-center")) {
                            c3 = 1;
                            break;
                        }
                        break;
                }
                switch (c3) {
                    case a.b.AdsAttrs_adSize:
                        i2 = this.g + this.d;
                        i3 = this.e + this.h;
                        break;
                    case a.b.AdsAttrs_adSizes:
                        i2 = ((this.d + this.g) + (this.i / 2)) - 25;
                        i3 = this.e + this.h;
                        break;
                    case 2:
                        i2 = ((this.d + this.g) + (this.i / 2)) - 25;
                        i3 = ((this.e + this.h) + (this.f / 2)) - 25;
                        break;
                    case 3:
                        i2 = this.g + this.d;
                        i3 = ((this.e + this.h) + this.f) - 50;
                        break;
                    case 4:
                        i2 = ((this.d + this.g) + (this.i / 2)) - 25;
                        i3 = ((this.e + this.h) + this.f) - 50;
                        break;
                    case 5:
                        i2 = ((this.d + this.g) + this.i) - 50;
                        i3 = ((this.e + this.h) + this.f) - 50;
                        break;
                    default:
                        i2 = ((this.d + this.g) + this.i) - 50;
                        i3 = this.e + this.h;
                        break;
                }
                if (i2 < 0 || i2 + 50 > i4 || i3 < c2[0] || i3 + 50 > c2[1]) {
                    z = false;
                }
            }
            z = true;
        }
        if (!z) {
            return null;
        }
        if (this.c) {
            return new int[]{this.d + this.g, this.e + this.h};
        }
        int[] b3 = au.e().b(this.l);
        int[] c4 = au.e().c(this.l);
        int i6 = b3[0];
        int i7 = this.d + this.g;
        int i8 = this.e + this.h;
        if (i7 < 0) {
            i7 = 0;
        } else if (this.i + i7 > i6) {
            i7 = i6 - this.i;
        }
        if (i8 < c4[0]) {
            i8 = c4[0];
        } else if (this.f + i8 > c4[1]) {
            i8 = c4[1] - this.f;
        }
        return new int[]{i7, i8};
    }

    public final void a(int i2, int i3) {
        this.d = i2;
        this.e = i3;
    }

    public final void a(int i2, int i3, boolean z) {
        synchronized (this.j) {
            this.d = i2;
            this.e = i3;
            if (this.q != null && z) {
                int[] b2 = b();
                if (b2 != null) {
                    PopupWindow popupWindow = this.q;
                    app.a();
                    int a2 = jc.a((Context) this.l, b2[0]);
                    app.a();
                    popupWindow.update(a2, jc.a((Context) this.l, b2[1]), this.q.getWidth(), this.q.getHeight());
                    b(b2[0], b2[1]);
                } else {
                    a(true);
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map<java.lang.String, java.lang.String> r15) {
        /*
            r14 = this;
            r5 = -1
            r13 = 0
            r6 = 1
            r4 = 0
            java.lang.Object r7 = r14.j
            monitor-enter(r7)
            android.app.Activity r1 = r14.l     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0012
            java.lang.String r1 = "Not an activity context. Cannot resize."
            r14.a(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r7)     // Catch:{ all -> 0x0021 }
        L_0x0011:
            return
        L_0x0012:
            com.google.android.gms.internal.mw r1 = r14.k     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.or r1 = r1.u()     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0024
            java.lang.String r1 = "Webview is not yet available, size is not set."
            r14.a(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r7)     // Catch:{ all -> 0x0021 }
            goto L_0x0011
        L_0x0021:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0021 }
            throw r1
        L_0x0024:
            com.google.android.gms.internal.mw r1 = r14.k     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.or r1 = r1.u()     // Catch:{ all -> 0x0021 }
            boolean r1 = r1.d()     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0037
            java.lang.String r1 = "Is interstitial. Cannot resize an interstitial."
            r14.a(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r7)     // Catch:{ all -> 0x0021 }
            goto L_0x0011
        L_0x0037:
            com.google.android.gms.internal.mw r1 = r14.k     // Catch:{ all -> 0x0021 }
            boolean r1 = r1.z()     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0046
            java.lang.String r1 = "Cannot resize an expanded banner."
            r14.a(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r7)     // Catch:{ all -> 0x0021 }
            goto L_0x0011
        L_0x0046:
            java.lang.String r1 = "width"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x0021 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0021 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0065
            com.google.android.gms.ads.internal.au.e()     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = "width"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0021 }
            int r1 = com.google.android.gms.internal.gw.b((java.lang.String) r1)     // Catch:{ all -> 0x0021 }
            r14.i = r1     // Catch:{ all -> 0x0021 }
        L_0x0065:
            java.lang.String r1 = "height"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x0021 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0021 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0084
            com.google.android.gms.ads.internal.au.e()     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = "height"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0021 }
            int r1 = com.google.android.gms.internal.gw.b((java.lang.String) r1)     // Catch:{ all -> 0x0021 }
            r14.f = r1     // Catch:{ all -> 0x0021 }
        L_0x0084:
            java.lang.String r1 = "offsetX"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x0021 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0021 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x00a3
            com.google.android.gms.ads.internal.au.e()     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = "offsetX"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0021 }
            int r1 = com.google.android.gms.internal.gw.b((java.lang.String) r1)     // Catch:{ all -> 0x0021 }
            r14.g = r1     // Catch:{ all -> 0x0021 }
        L_0x00a3:
            java.lang.String r1 = "offsetY"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x0021 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0021 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x00c2
            com.google.android.gms.ads.internal.au.e()     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = "offsetY"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0021 }
            int r1 = com.google.android.gms.internal.gw.b((java.lang.String) r1)     // Catch:{ all -> 0x0021 }
            r14.h = r1     // Catch:{ all -> 0x0021 }
        L_0x00c2:
            java.lang.String r1 = "allowOffscreen"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x0021 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0021 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x00de
            java.lang.String r1 = "allowOffscreen"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0021 }
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ all -> 0x0021 }
            r14.c = r1     // Catch:{ all -> 0x0021 }
        L_0x00de:
            java.lang.String r1 = "customClosePosition"
            java.lang.Object r1 = r15.get(r1)     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0021 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0021 }
            if (r2 != 0) goto L_0x00ee
            r14.b = r1     // Catch:{ all -> 0x0021 }
        L_0x00ee:
            int r1 = r14.i     // Catch:{ all -> 0x0021 }
            if (r1 < 0) goto L_0x0101
            int r1 = r14.f     // Catch:{ all -> 0x0021 }
            if (r1 < 0) goto L_0x0101
            r1 = r6
        L_0x00f7:
            if (r1 != 0) goto L_0x0103
            java.lang.String r1 = "Invalid width and height options. Cannot resize."
            r14.a(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r7)     // Catch:{ all -> 0x0021 }
            goto L_0x0011
        L_0x0101:
            r1 = r4
            goto L_0x00f7
        L_0x0103:
            android.app.Activity r1 = r14.l     // Catch:{ all -> 0x0021 }
            android.view.Window r8 = r1.getWindow()     // Catch:{ all -> 0x0021 }
            if (r8 == 0) goto L_0x0111
            android.view.View r1 = r8.getDecorView()     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0119
        L_0x0111:
            java.lang.String r1 = "Activity context is not ready, cannot get window or decor view."
            r14.a(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r7)     // Catch:{ all -> 0x0021 }
            goto L_0x0011
        L_0x0119:
            int[] r9 = r14.b()     // Catch:{ all -> 0x0021 }
            if (r9 != 0) goto L_0x0127
            java.lang.String r1 = "Resize location out of screen or close button is not visible."
            r14.a(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r7)     // Catch:{ all -> 0x0021 }
            goto L_0x0011
        L_0x0127:
            com.google.android.gms.internal.app.a()     // Catch:{ all -> 0x0021 }
            android.app.Activity r1 = r14.l     // Catch:{ all -> 0x0021 }
            int r2 = r14.i     // Catch:{ all -> 0x0021 }
            int r10 = com.google.android.gms.internal.jc.a((android.content.Context) r1, (int) r2)     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.app.a()     // Catch:{ all -> 0x0021 }
            android.app.Activity r1 = r14.l     // Catch:{ all -> 0x0021 }
            int r2 = r14.f     // Catch:{ all -> 0x0021 }
            int r11 = com.google.android.gms.internal.jc.a((android.content.Context) r1, (int) r2)     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.mw r1 = r14.k     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0142
            throw r13     // Catch:{ all -> 0x0021 }
        L_0x0142:
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0021 }
            android.view.ViewParent r2 = r1.getParent()     // Catch:{ all -> 0x0021 }
            if (r2 == 0) goto L_0x01d7
            boolean r1 = r2 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x01d7
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x0021 }
            r1 = r0
            com.google.android.gms.internal.mw r3 = r14.k     // Catch:{ all -> 0x0021 }
            if (r3 != 0) goto L_0x0157
            throw r13     // Catch:{ all -> 0x0021 }
        L_0x0157:
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x0021 }
            r1.removeView(r3)     // Catch:{ all -> 0x0021 }
            android.widget.PopupWindow r1 = r14.q     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x01d1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ all -> 0x0021 }
            r14.s = r2     // Catch:{ all -> 0x0021 }
            com.google.android.gms.ads.internal.au.e()     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.mw r1 = r14.k     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x016c
            throw r13     // Catch:{ all -> 0x0021 }
        L_0x016c:
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0021 }
            android.graphics.Bitmap r1 = com.google.android.gms.internal.gw.a((android.view.View) r1)     // Catch:{ all -> 0x0021 }
            android.widget.ImageView r2 = new android.widget.ImageView     // Catch:{ all -> 0x0021 }
            android.app.Activity r3 = r14.l     // Catch:{ all -> 0x0021 }
            r2.<init>(r3)     // Catch:{ all -> 0x0021 }
            r14.n = r2     // Catch:{ all -> 0x0021 }
            android.widget.ImageView r2 = r14.n     // Catch:{ all -> 0x0021 }
            r2.setImageBitmap(r1)     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.mw r1 = r14.k     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.or r1 = r1.u()     // Catch:{ all -> 0x0021 }
            r14.m = r1     // Catch:{ all -> 0x0021 }
            android.view.ViewGroup r1 = r14.s     // Catch:{ all -> 0x0021 }
            android.widget.ImageView r2 = r14.n     // Catch:{ all -> 0x0021 }
            r1.addView(r2)     // Catch:{ all -> 0x0021 }
        L_0x018f:
            android.widget.RelativeLayout r1 = new android.widget.RelativeLayout     // Catch:{ all -> 0x0021 }
            android.app.Activity r2 = r14.l     // Catch:{ all -> 0x0021 }
            r1.<init>(r2)     // Catch:{ all -> 0x0021 }
            r14.r = r1     // Catch:{ all -> 0x0021 }
            android.widget.RelativeLayout r1 = r14.r     // Catch:{ all -> 0x0021 }
            r2 = 0
            r1.setBackgroundColor(r2)     // Catch:{ all -> 0x0021 }
            android.widget.RelativeLayout r1 = r14.r     // Catch:{ all -> 0x0021 }
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x0021 }
            r2.<init>(r10, r11)     // Catch:{ all -> 0x0021 }
            r1.setLayoutParams(r2)     // Catch:{ all -> 0x0021 }
            com.google.android.gms.ads.internal.au.e()     // Catch:{ all -> 0x0021 }
            android.widget.RelativeLayout r1 = r14.r     // Catch:{ all -> 0x0021 }
            r2 = 0
            android.widget.PopupWindow r1 = com.google.android.gms.internal.gw.a((android.view.View) r1, (int) r10, (int) r11, (boolean) r2)     // Catch:{ all -> 0x0021 }
            r14.q = r1     // Catch:{ all -> 0x0021 }
            android.widget.PopupWindow r1 = r14.q     // Catch:{ all -> 0x0021 }
            r2 = 1
            r1.setOutsideTouchable(r2)     // Catch:{ all -> 0x0021 }
            android.widget.PopupWindow r1 = r14.q     // Catch:{ all -> 0x0021 }
            r2 = 1
            r1.setTouchable(r2)     // Catch:{ all -> 0x0021 }
            android.widget.PopupWindow r2 = r14.q     // Catch:{ all -> 0x0021 }
            boolean r1 = r14.c     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x01df
            r1 = r6
        L_0x01c7:
            r2.setClippingEnabled(r1)     // Catch:{ all -> 0x0021 }
            android.widget.RelativeLayout r2 = r14.r     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.mw r1 = r14.k     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x01e1
            throw r13     // Catch:{ all -> 0x0021 }
        L_0x01d1:
            android.widget.PopupWindow r1 = r14.q     // Catch:{ all -> 0x0021 }
            r1.dismiss()     // Catch:{ all -> 0x0021 }
            goto L_0x018f
        L_0x01d7:
            java.lang.String r1 = "Webview is detached, probably in the middle of a resize or expand."
            r14.a(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r7)     // Catch:{ all -> 0x0021 }
            goto L_0x0011
        L_0x01df:
            r1 = r4
            goto L_0x01c7
        L_0x01e1:
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0021 }
            r3 = -1
            r12 = -1
            r2.addView(r1, r3, r12)     // Catch:{ all -> 0x0021 }
            android.widget.LinearLayout r1 = new android.widget.LinearLayout     // Catch:{ all -> 0x0021 }
            android.app.Activity r2 = r14.l     // Catch:{ all -> 0x0021 }
            r1.<init>(r2)     // Catch:{ all -> 0x0021 }
            r14.o = r1     // Catch:{ all -> 0x0021 }
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.app.a()     // Catch:{ all -> 0x0021 }
            android.app.Activity r1 = r14.l     // Catch:{ all -> 0x0021 }
            r3 = 50
            int r1 = com.google.android.gms.internal.jc.a((android.content.Context) r1, (int) r3)     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.app.a()     // Catch:{ all -> 0x0021 }
            android.app.Activity r3 = r14.l     // Catch:{ all -> 0x0021 }
            r12 = 50
            int r3 = com.google.android.gms.internal.jc.a((android.content.Context) r3, (int) r12)     // Catch:{ all -> 0x0021 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = r14.b     // Catch:{ all -> 0x0021 }
            int r3 = r1.hashCode()     // Catch:{ all -> 0x0021 }
            switch(r3) {
                case -1364013995: goto L_0x029f;
                case -1012429441: goto L_0x028a;
                case -655373719: goto L_0x02aa;
                case 1163912186: goto L_0x02c0;
                case 1288627767: goto L_0x02b5;
                case 1755462605: goto L_0x0294;
                default: goto L_0x0215;
            }     // Catch:{ all -> 0x0021 }
        L_0x0215:
            r1 = r5
        L_0x0216:
            switch(r1) {
                case 0: goto L_0x02cb;
                case 1: goto L_0x02d7;
                case 2: goto L_0x02e3;
                case 3: goto L_0x02ea;
                case 4: goto L_0x02f6;
                case 5: goto L_0x0302;
                default: goto L_0x0219;
            }     // Catch:{ all -> 0x0021 }
        L_0x0219:
            r1 = 10
            r2.addRule(r1)     // Catch:{ all -> 0x0021 }
            r1 = 11
            r2.addRule(r1)     // Catch:{ all -> 0x0021 }
        L_0x0223:
            android.widget.LinearLayout r1 = r14.o     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.bce r3 = new com.google.android.gms.internal.bce     // Catch:{ all -> 0x0021 }
            r3.<init>(r14)     // Catch:{ all -> 0x0021 }
            r1.setOnClickListener(r3)     // Catch:{ all -> 0x0021 }
            android.widget.LinearLayout r1 = r14.o     // Catch:{ all -> 0x0021 }
            java.lang.String r3 = "Close button"
            r1.setContentDescription(r3)     // Catch:{ all -> 0x0021 }
            android.widget.RelativeLayout r1 = r14.r     // Catch:{ all -> 0x0021 }
            android.widget.LinearLayout r3 = r14.o     // Catch:{ all -> 0x0021 }
            r1.addView(r3, r2)     // Catch:{ all -> 0x0021 }
            android.widget.PopupWindow r1 = r14.q     // Catch:{ RuntimeException -> 0x030e }
            android.view.View r2 = r8.getDecorView()     // Catch:{ RuntimeException -> 0x030e }
            r3 = 0
            com.google.android.gms.internal.app.a()     // Catch:{ RuntimeException -> 0x030e }
            android.app.Activity r4 = r14.l     // Catch:{ RuntimeException -> 0x030e }
            r5 = 0
            r5 = r9[r5]     // Catch:{ RuntimeException -> 0x030e }
            int r4 = com.google.android.gms.internal.jc.a((android.content.Context) r4, (int) r5)     // Catch:{ RuntimeException -> 0x030e }
            com.google.android.gms.internal.app.a()     // Catch:{ RuntimeException -> 0x030e }
            android.app.Activity r5 = r14.l     // Catch:{ RuntimeException -> 0x030e }
            r6 = 1
            r6 = r9[r6]     // Catch:{ RuntimeException -> 0x030e }
            int r5 = com.google.android.gms.internal.jc.a((android.content.Context) r5, (int) r6)     // Catch:{ RuntimeException -> 0x030e }
            r1.showAtLocation(r2, r3, r4, r5)     // Catch:{ RuntimeException -> 0x030e }
            r1 = 0
            r1 = r9[r1]     // Catch:{ all -> 0x0021 }
            r2 = 1
            r2 = r9[r2]     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.bcp r3 = r14.p     // Catch:{ all -> 0x0021 }
            if (r3 == 0) goto L_0x0270
            com.google.android.gms.internal.bcp r3 = r14.p     // Catch:{ all -> 0x0021 }
            int r4 = r14.i     // Catch:{ all -> 0x0021 }
            int r5 = r14.f     // Catch:{ all -> 0x0021 }
            r3.a(r1, r2, r4, r5)     // Catch:{ all -> 0x0021 }
        L_0x0270:
            com.google.android.gms.internal.mw r1 = r14.k     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.or r2 = com.google.android.gms.internal.or.a(r10, r11)     // Catch:{ all -> 0x0021 }
            r1.a((com.google.android.gms.internal.or) r2)     // Catch:{ all -> 0x0021 }
            r1 = 0
            r1 = r9[r1]     // Catch:{ all -> 0x0021 }
            r2 = 1
            r2 = r9[r2]     // Catch:{ all -> 0x0021 }
            r14.b(r1, r2)     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = "resized"
            r14.c(r1)     // Catch:{ all -> 0x0021 }
            monitor-exit(r7)     // Catch:{ all -> 0x0021 }
            goto L_0x0011
        L_0x028a:
            java.lang.String r3 = "top-left"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0215
            r1 = r4
            goto L_0x0216
        L_0x0294:
            java.lang.String r3 = "top-center"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0215
            r1 = r6
            goto L_0x0216
        L_0x029f:
            java.lang.String r3 = "center"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0215
            r1 = 2
            goto L_0x0216
        L_0x02aa:
            java.lang.String r3 = "bottom-left"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0215
            r1 = 3
            goto L_0x0216
        L_0x02b5:
            java.lang.String r3 = "bottom-center"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0215
            r1 = 4
            goto L_0x0216
        L_0x02c0:
            java.lang.String r3 = "bottom-right"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0215
            r1 = 5
            goto L_0x0216
        L_0x02cb:
            r1 = 10
            r2.addRule(r1)     // Catch:{ all -> 0x0021 }
            r1 = 9
            r2.addRule(r1)     // Catch:{ all -> 0x0021 }
            goto L_0x0223
        L_0x02d7:
            r1 = 10
            r2.addRule(r1)     // Catch:{ all -> 0x0021 }
            r1 = 14
            r2.addRule(r1)     // Catch:{ all -> 0x0021 }
            goto L_0x0223
        L_0x02e3:
            r1 = 13
            r2.addRule(r1)     // Catch:{ all -> 0x0021 }
            goto L_0x0223
        L_0x02ea:
            r1 = 12
            r2.addRule(r1)     // Catch:{ all -> 0x0021 }
            r1 = 9
            r2.addRule(r1)     // Catch:{ all -> 0x0021 }
            goto L_0x0223
        L_0x02f6:
            r1 = 12
            r2.addRule(r1)     // Catch:{ all -> 0x0021 }
            r1 = 14
            r2.addRule(r1)     // Catch:{ all -> 0x0021 }
            goto L_0x0223
        L_0x0302:
            r1 = 12
            r2.addRule(r1)     // Catch:{ all -> 0x0021 }
            r1 = 11
            r2.addRule(r1)     // Catch:{ all -> 0x0021 }
            goto L_0x0223
        L_0x030e:
            r1 = move-exception
            java.lang.String r2 = "Cannot show popup window: "
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0021 }
            int r3 = r1.length()     // Catch:{ all -> 0x0021 }
            if (r3 == 0) goto L_0x032d
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x0021 }
        L_0x0323:
            r14.a(r1)     // Catch:{ all -> 0x0021 }
            android.widget.RelativeLayout r2 = r14.r     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.mw r1 = r14.k     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0333
            throw r13     // Catch:{ all -> 0x0021 }
        L_0x032d:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0021 }
            r1.<init>(r2)     // Catch:{ all -> 0x0021 }
            goto L_0x0323
        L_0x0333:
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0021 }
            r2.removeView(r1)     // Catch:{ all -> 0x0021 }
            android.view.ViewGroup r1 = r14.s     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x0356
            android.view.ViewGroup r1 = r14.s     // Catch:{ all -> 0x0021 }
            android.widget.ImageView r2 = r14.n     // Catch:{ all -> 0x0021 }
            r1.removeView(r2)     // Catch:{ all -> 0x0021 }
            android.view.ViewGroup r2 = r14.s     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.mw r1 = r14.k     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x034a
            throw r13     // Catch:{ all -> 0x0021 }
        L_0x034a:
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0021 }
            r2.addView(r1)     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.mw r1 = r14.k     // Catch:{ all -> 0x0021 }
            com.google.android.gms.internal.or r2 = r14.m     // Catch:{ all -> 0x0021 }
            r1.a((com.google.android.gms.internal.or) r2)     // Catch:{ all -> 0x0021 }
        L_0x0356:
            monitor-exit(r7)     // Catch:{ all -> 0x0021 }
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bcd.a(java.util.Map):void");
    }

    public final void a(boolean z) {
        synchronized (this.j) {
            if (this.q != null) {
                this.q.dismiss();
                RelativeLayout relativeLayout = this.r;
                mw mwVar = this.k;
                if (mwVar == null) {
                    throw null;
                }
                relativeLayout.removeView((View) mwVar);
                if (this.s != null) {
                    this.s.removeView(this.n);
                    ViewGroup viewGroup = this.s;
                    mw mwVar2 = this.k;
                    if (mwVar2 == null) {
                        throw null;
                    }
                    viewGroup.addView((View) mwVar2);
                    this.k.a(this.m);
                }
                if (z) {
                    c("default");
                    if (this.p != null) {
                        this.p.G();
                    }
                }
                this.q = null;
                this.r = null;
                this.s = null;
                this.o = null;
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.j) {
            z = this.q != null;
        }
        return z;
    }
}
