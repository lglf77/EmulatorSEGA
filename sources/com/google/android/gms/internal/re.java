package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.y;

public final class re extends pp {
    public static final Parcelable.Creator<re> CREATOR = new rf();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final long m;
    public final int n;
    public final boolean o;

    re(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z, boolean z2, String str6, long j5, long j6, int i2, boolean z3) {
        y.a(str);
        this.a = str;
        this.b = TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j2;
        this.d = str4;
        this.e = j3;
        this.f = j4;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j5;
        this.m = j6;
        this.n = i2;
        this.o = z3;
    }

    re(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z, boolean z2, long j4, String str6, long j5, long j6, int i2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j4;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j5;
        this.m = j6;
        this.n = i2;
        this.o = z3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, this.a, false);
        ps.a(parcel, 3, this.b, false);
        ps.a(parcel, 4, this.c, false);
        ps.a(parcel, 5, this.d, false);
        ps.a(parcel, 6, this.e);
        ps.a(parcel, 7, this.f);
        ps.a(parcel, 8, this.g, false);
        ps.a(parcel, 9, this.h);
        ps.a(parcel, 10, this.i);
        ps.a(parcel, 11, this.j);
        ps.a(parcel, 12, this.k, false);
        ps.a(parcel, 13, this.l);
        ps.a(parcel, 14, this.m);
        ps.a(parcel, 15, this.n);
        ps.a(parcel, 16, this.o);
        ps.a(parcel, a2);
    }
}
