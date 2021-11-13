package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.apc;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.jc;

public final class d {
    public static final d a = new d(320, 50, "320x50_mb");
    public static final d b = new d(468, 60, "468x60_as");
    public static final d c = new d(320, 100, "320x100_as");
    public static final d d = new d(728, 90, "728x90_as");
    public static final d e = new d(300, 250, "300x250_as");
    public static final d f = new d(160, 600, "160x600_as");
    public static final d g = new d(-1, -2, "smart_banner");
    public static final d h = new d(-3, -4, "fluid");
    public static final d i = new d(50, 50, "50x50_mb");
    public static final d j = new d(-3, 0, "search_v2");
    private final int k;
    private final int l;
    private final String m;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(int r6, int r7) {
        /*
            r5 = this;
            r0 = -1
            if (r6 != r0) goto L_0x0048
            java.lang.String r0 = "FULL"
            r1 = r0
        L_0x0006:
            r0 = -2
            if (r7 != r0) goto L_0x004e
            java.lang.String r0 = "AUTO"
        L_0x000b:
            java.lang.String r2 = "_as"
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r3 = r3 + 1
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            int r3 = r3 + r4
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r3 = "x"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r5.<init>(r6, r7, r0)
            return
        L_0x0048:
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r1 = r0
            goto L_0x0006
        L_0x004e:
            java.lang.String r0 = java.lang.String.valueOf(r7)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.d.<init>(int, int):void");
    }

    d(int i2, int i3, String str) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            throw new IllegalArgumentException(new StringBuilder(37).append("Invalid width for AdSize: ").append(i2).toString());
        } else if (i3 >= 0 || i3 == -2 || i3 == -4) {
            this.k = i2;
            this.l = i3;
            this.m = str;
        } else {
            throw new IllegalArgumentException(new StringBuilder(38).append("Invalid height for AdSize: ").append(i3).toString());
        }
    }

    public final int a() {
        return this.l;
    }

    public final int a(Context context) {
        switch (this.l) {
            case -4:
            case -3:
                return -1;
            case -2:
                return apc.b(context.getResources().getDisplayMetrics());
            default:
                app.a();
                return jc.a(context, this.l);
        }
    }

    public final int b() {
        return this.k;
    }

    public final int b(Context context) {
        switch (this.k) {
            case -4:
            case -3:
                return -1;
            case -1:
                return apc.a(context.getResources().getDisplayMetrics());
            default:
                app.a();
                return jc.a(context, this.k);
        }
    }

    public final boolean c() {
        return this.k == -3 && this.l == -4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.k == dVar.k && this.l == dVar.l && this.m.equals(dVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return this.m;
    }
}
