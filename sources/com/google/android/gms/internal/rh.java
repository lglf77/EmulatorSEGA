package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.y;

public final class rh extends pp {
    public static final Parcelable.Creator<rh> CREATOR = new ri();
    public String a;
    public String b;
    public wo c;
    public long d;
    public boolean e;
    public String f;
    public rx g;
    public long h;
    public rx i;
    public long j;
    public rx k;
    private int l;

    rh(int i2, String str, String str2, wo woVar, long j2, boolean z, String str3, rx rxVar, long j3, rx rxVar2, long j4, rx rxVar3) {
        this.l = i2;
        this.a = str;
        this.b = str2;
        this.c = woVar;
        this.d = j2;
        this.e = z;
        this.f = str3;
        this.g = rxVar;
        this.h = j3;
        this.i = rxVar2;
        this.j = j4;
        this.k = rxVar3;
    }

    rh(rh rhVar) {
        this.l = 1;
        y.a(rhVar);
        this.a = rhVar.a;
        this.b = rhVar.b;
        this.c = rhVar.c;
        this.d = rhVar.d;
        this.e = rhVar.e;
        this.f = rhVar.f;
        this.g = rhVar.g;
        this.h = rhVar.h;
        this.i = rhVar.i;
        this.j = rhVar.j;
        this.k = rhVar.k;
    }

    rh(String str, String str2, wo woVar, long j2, boolean z, String str3, rx rxVar, long j3, rx rxVar2, long j4, rx rxVar3) {
        this.l = 1;
        this.a = str;
        this.b = str2;
        this.c = woVar;
        this.d = j2;
        this.e = z;
        this.f = str3;
        this.g = rxVar;
        this.h = j3;
        this.i = rxVar2;
        this.j = j4;
        this.k = rxVar3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.l);
        ps.a(parcel, 2, this.a, false);
        ps.a(parcel, 3, this.b, false);
        ps.a(parcel, 4, (Parcelable) this.c, i2, false);
        ps.a(parcel, 5, this.d);
        ps.a(parcel, 6, this.e);
        ps.a(parcel, 7, this.f, false);
        ps.a(parcel, 8, (Parcelable) this.g, i2, false);
        ps.a(parcel, 9, this.h);
        ps.a(parcel, 10, (Parcelable) this.i, i2, false);
        ps.a(parcel, 11, this.j);
        ps.a(parcel, 12, (Parcelable) this.k, i2, false);
        ps.a(parcel, a2);
    }
}
