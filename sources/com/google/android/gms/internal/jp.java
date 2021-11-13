package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

@bfk
public final class jp extends pp {
    public static final Parcelable.Creator<jp> CREATOR = new jq();
    public String a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public jp(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public jp(int i, int i2, boolean z, boolean z2) {
        this(11910000, i2, true, false, z2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private jp(int r7, int r8, boolean r9, boolean r10, boolean r11) {
        /*
            r6 = this;
            java.lang.String r1 = "afma-sdk-a-v"
            if (r9 == 0) goto L_0x0047
            java.lang.String r0 = "0"
        L_0x0006:
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            int r2 = r2 + 24
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r11
            r0.<init>((java.lang.String) r1, (int) r2, (int) r3, (boolean) r4, (boolean) r5)
            return
        L_0x0047:
            java.lang.String r0 = "1"
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jp.<init>(int, int, boolean, boolean, boolean):void");
    }

    jp(String str, int i, int i2, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public static jp a() {
        return new jp(11910208, 11910208, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, this.a, false);
        ps.a(parcel, 3, this.b);
        ps.a(parcel, 4, this.c);
        ps.a(parcel, 5, this.d);
        ps.a(parcel, 6, this.e);
        ps.a(parcel, a2);
    }
}
