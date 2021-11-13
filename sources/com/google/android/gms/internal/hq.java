package com.google.android.gms.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.au;
import java.util.ArrayList;
import java.util.List;

@bfk
public final class hq {
    /* access modifiers changed from: private */
    public final Context a;
    private String b;
    /* access modifiers changed from: private */
    public String c;
    /* access modifiers changed from: private */
    public String d;
    /* access modifiers changed from: private */
    public String e;
    private final float f;
    private float g;
    private float h;
    private float i;
    private int j;

    public hq(Context context) {
        this.j = 0;
        this.a = context;
        this.f = context.getResources().getDisplayMetrics().density;
    }

    public hq(Context context, String str) {
        this(context);
        this.b = str;
    }

    private static int a(List<String> list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    private final void a(int i2, float f2, float f3) {
        if (i2 == 0) {
            this.j = 0;
            this.g = f2;
            this.h = f3;
            this.i = f3;
        } else if (this.j == -1) {
        } else {
            if (i2 == 2) {
                if (f3 > this.h) {
                    this.h = f3;
                } else if (f3 < this.i) {
                    this.i = f3;
                }
                if (this.h - this.i > 30.0f * this.f) {
                    this.j = -1;
                    return;
                }
                if (this.j == 0 || this.j == 2) {
                    if (f2 - this.g >= 50.0f * this.f) {
                        this.g = f2;
                        this.j++;
                    }
                } else if ((this.j == 1 || this.j == 3) && f2 - this.g <= -50.0f * this.f) {
                    this.g = f2;
                    this.j++;
                }
                if (this.j == 1 || this.j == 3) {
                    if (f2 > this.g) {
                        this.g = f2;
                    }
                } else if (this.j == 2 && f2 < this.g) {
                    this.g = f2;
                }
            } else if (i2 == 1 && this.j == 4) {
                a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006f, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r6 = this;
            android.content.Context r0 = r6.a
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.fn.d(r0)
        L_0x000b:
            return
        L_0x000c:
            java.lang.String r0 = r6.b
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x009d
            java.lang.String r1 = "\\+"
            java.lang.String r2 = "%20"
            java.lang.String r0 = r0.replaceAll(r1, r2)
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            android.net.Uri$Builder r0 = r1.encodedQuery(r0)
            android.net.Uri r0 = r0.build()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.google.android.gms.ads.internal.au.e()
            java.util.Map r2 = com.google.android.gms.internal.gw.a((android.net.Uri) r0)
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x003d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r4 = r1.append(r0)
            java.lang.String r5 = " = "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r4 = "\n\n"
            r0.append(r4)
            goto L_0x003d
        L_0x0063:
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x009d
        L_0x0071:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            android.content.Context r2 = r6.a
            r1.<init>(r2)
            r1.setMessage(r0)
            java.lang.String r2 = "Ad Information"
            r1.setTitle(r2)
            java.lang.String r2 = "Share"
            com.google.android.gms.internal.hs r3 = new com.google.android.gms.internal.hs
            r3.<init>(r6, r0)
            r1.setPositiveButton(r2, r3)
            java.lang.String r0 = "Close"
            com.google.android.gms.internal.ht r2 = new com.google.android.gms.internal.ht
            r2.<init>(r6)
            r1.setNegativeButton(r0, r2)
            android.app.AlertDialog r0 = r1.create()
            r0.show()
            goto L_0x000b
        L_0x009d:
            java.lang.String r0 = "No debug information"
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.hq.b():void");
    }

    /* access modifiers changed from: private */
    public final void c() {
        fn.b("Debug mode [Creative Preview] selected.");
        gq.a((Runnable) new hu(this));
    }

    /* access modifiers changed from: private */
    public final void d() {
        fn.b("Debug mode [Troubleshooting] selected.");
        gq.a((Runnable) new hv(this));
    }

    public final void a() {
        if (!((Boolean) app.f().a(asw.cz)).booleanValue()) {
            if (!((Boolean) app.f().a(asw.cy)).booleanValue()) {
                b();
                return;
            }
        }
        if (!(this.a instanceof Activity)) {
            fn.d("Can not create dialog without Activity Context");
            return;
        }
        String str = !TextUtils.isEmpty(au.n().a()) ? "Creative Preview (Enabled)" : "Creative Preview";
        String str2 = au.n().b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
        ArrayList arrayList = new ArrayList();
        int a2 = a((List<String>) arrayList, "Ad Information", true);
        int a3 = a((List<String>) arrayList, str, ((Boolean) app.f().a(asw.cy)).booleanValue());
        int a4 = a((List<String>) arrayList, str2, ((Boolean) app.f().a(asw.cz)).booleanValue());
        AlertDialog.Builder builder = new AlertDialog.Builder(this.a, au.g().f());
        builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new hr(this, a2, a3, a4));
        builder.create().show();
    }

    public final void a(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i2 = 0; i2 < historySize; i2++) {
            a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2));
        }
        a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    public final void a(String str) {
        this.c = str;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void c(String str) {
        this.b = str;
    }

    public final void d(String str) {
        this.e = str;
    }
}
