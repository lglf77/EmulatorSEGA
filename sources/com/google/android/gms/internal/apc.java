package com.google.android.gms.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.l;

@bfk
public class apc extends pp {
    public static final Parcelable.Creator<apc> CREATOR = new apd();
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public final apc[] g;
    public final boolean h;
    public final boolean i;
    public boolean j;

    public apc() {
        this("interstitial_mb", 0, 0, true, 0, 0, (apc[]) null, false, false, false);
    }

    public apc(Context context, d dVar) {
        this(context, new d[]{dVar});
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public apc(android.content.Context r13, com.google.android.gms.ads.d[] r14) {
        /*
            r12 = this;
            r1 = 1
            r2 = 0
            r12.<init>()
            r6 = r14[r2]
            r12.d = r2
            boolean r0 = r6.c()
            r12.i = r0
            boolean r0 = r12.i
            if (r0 == 0) goto L_0x00bc
            com.google.android.gms.ads.d r0 = com.google.android.gms.ads.d.a
            int r0 = r0.b()
            r12.e = r0
            com.google.android.gms.ads.d r0 = com.google.android.gms.ads.d.a
            int r0 = r0.a()
            r12.b = r0
        L_0x0023:
            int r0 = r12.e
            r3 = -1
            if (r0 != r3) goto L_0x00ca
            r0 = r1
        L_0x0029:
            int r3 = r12.b
            r4 = -2
            if (r3 != r4) goto L_0x00cd
            r3 = r1
        L_0x002f:
            android.content.res.Resources r4 = r13.getResources()
            android.util.DisplayMetrics r7 = r4.getDisplayMetrics()
            if (r0 == 0) goto L_0x00d5
            com.google.android.gms.internal.app.a()
            boolean r4 = com.google.android.gms.internal.jc.g(r13)
            if (r4 == 0) goto L_0x00d0
            com.google.android.gms.internal.app.a()
            boolean r4 = com.google.android.gms.internal.jc.h(r13)
            if (r4 == 0) goto L_0x00d0
            int r4 = r7.widthPixels
            com.google.android.gms.internal.app.a()
            int r5 = com.google.android.gms.internal.jc.i(r13)
            int r4 = r4 - r5
            r12.f = r4
        L_0x0057:
            int r4 = r12.f
            float r4 = (float) r4
            float r5 = r7.density
            float r4 = r4 / r5
            double r8 = (double) r4
            int r4 = (int) r8
            int r5 = (int) r8
            double r10 = (double) r5
            double r8 = r8 - r10
            r10 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 < 0) goto L_0x006d
            int r4 = r4 + 1
        L_0x006d:
            r5 = r4
        L_0x006e:
            if (r3 == 0) goto L_0x00e4
            int r4 = c(r7)
        L_0x0074:
            com.google.android.gms.internal.app.a()
            int r7 = com.google.android.gms.internal.jc.a((android.util.DisplayMetrics) r7, (int) r4)
            r12.c = r7
            if (r0 != 0) goto L_0x0081
            if (r3 == 0) goto L_0x00e7
        L_0x0081:
            r0 = 26
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.StringBuilder r0 = r3.append(r5)
            java.lang.String r3 = "x"
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r3 = "_as"
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r12.a = r0
        L_0x00a2:
            int r0 = r14.length
            if (r0 <= r1) goto L_0x00f7
            int r0 = r14.length
            com.google.android.gms.internal.apc[] r0 = new com.google.android.gms.internal.apc[r0]
            r12.g = r0
            r0 = r2
        L_0x00ab:
            int r1 = r14.length
            if (r0 >= r1) goto L_0x00fa
            com.google.android.gms.internal.apc[] r1 = r12.g
            com.google.android.gms.internal.apc r3 = new com.google.android.gms.internal.apc
            r4 = r14[r0]
            r3.<init>((android.content.Context) r13, (com.google.android.gms.ads.d) r4)
            r1[r0] = r3
            int r0 = r0 + 1
            goto L_0x00ab
        L_0x00bc:
            int r0 = r6.b()
            r12.e = r0
            int r0 = r6.a()
            r12.b = r0
            goto L_0x0023
        L_0x00ca:
            r0 = r2
            goto L_0x0029
        L_0x00cd:
            r3 = r2
            goto L_0x002f
        L_0x00d0:
            int r4 = r7.widthPixels
            r12.f = r4
            goto L_0x0057
        L_0x00d5:
            int r4 = r12.e
            com.google.android.gms.internal.app.a()
            int r5 = r12.e
            int r5 = com.google.android.gms.internal.jc.a((android.util.DisplayMetrics) r7, (int) r5)
            r12.f = r5
            r5 = r4
            goto L_0x006e
        L_0x00e4:
            int r4 = r12.b
            goto L_0x0074
        L_0x00e7:
            boolean r0 = r12.i
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "320x50_mb"
            r12.a = r0
            goto L_0x00a2
        L_0x00f0:
            java.lang.String r0 = r6.toString()
            r12.a = r0
            goto L_0x00a2
        L_0x00f7:
            r0 = 0
            r12.g = r0
        L_0x00fa:
            r12.h = r2
            r12.j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.apc.<init>(android.content.Context, com.google.android.gms.ads.d[]):void");
    }

    public apc(apc apc, apc[] apcArr) {
        this(apc.a, apc.b, apc.c, apc.d, apc.e, apc.f, apcArr, apc.h, apc.i, apc.j);
    }

    apc(String str, int i2, int i3, boolean z, int i4, int i5, apc[] apcArr, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = i4;
        this.f = i5;
        this.g = apcArr;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public static int a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static apc a() {
        return new apc("reward_mb", 0, 0, true, 0, 0, (apc[]) null, false, false, false);
    }

    public static apc a(Context context) {
        return new apc("320x50_mb", 0, 0, false, 0, 0, (apc[]) null, true, false, false);
    }

    public static int b(DisplayMetrics displayMetrics) {
        return (int) (((float) c(displayMetrics)) * displayMetrics.density);
    }

    private static int c(DisplayMetrics displayMetrics) {
        int i2 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i2 <= 400) {
            return 32;
        }
        return i2 <= 720 ? 50 : 90;
    }

    public final d b() {
        return l.a(this.e, this.b, this.a);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, this.a, false);
        ps.a(parcel, 3, this.b);
        ps.a(parcel, 4, this.c);
        ps.a(parcel, 5, this.d);
        ps.a(parcel, 6, this.e);
        ps.a(parcel, 7, this.f);
        ps.a(parcel, 8, (T[]) this.g, i2, false);
        ps.a(parcel, 9, this.h);
        ps.a(parcel, 10, this.i);
        ps.a(parcel, 11, this.j);
        ps.a(parcel, a2);
    }
}
