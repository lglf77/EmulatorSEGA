package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

@bfk
public final class axk extends pp {
    public static final Parcelable.Creator<axk> CREATOR = new axl();
    public final boolean a;
    public final String b;
    public final int c;
    public final byte[] d;
    public final String[] e;
    public final String[] f;
    public final boolean g;
    public final long h;

    axk(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = bArr;
        this.e = strArr;
        this.f = strArr2;
        this.g = z2;
        this.h = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.a);
        ps.a(parcel, 2, this.b, false);
        ps.a(parcel, 3, this.c);
        ps.a(parcel, 4, this.d, false);
        ps.a(parcel, 5, this.e, false);
        ps.a(parcel, 6, this.f, false);
        ps.a(parcel, 7, this.g);
        ps.a(parcel, 8, this.h);
        ps.a(parcel, a2);
    }
}
