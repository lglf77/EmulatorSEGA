package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v;
import java.util.Arrays;
import java.util.List;

@bfk
public final class aoy extends pp {
    public static final Parcelable.Creator<aoy> CREATOR = new apa();
    public final int a;
    public final long b;
    public final Bundle c;
    public final int d;
    public final List<String> e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final asb j;
    public final Location k;
    public final String l;
    public final Bundle m;
    public final Bundle n;
    public final List<String> o;
    public final String p;
    public final String q;
    public final boolean r;

    public aoy(int i2, long j2, Bundle bundle, int i3, List<String> list, boolean z, int i4, boolean z2, String str, asb asb, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.a = i2;
        this.b = j2;
        this.c = bundle == null ? new Bundle() : bundle;
        this.d = i3;
        this.e = list;
        this.f = z;
        this.g = i4;
        this.h = z2;
        this.i = str;
        this.j = asb;
        this.k = location;
        this.l = str2;
        this.m = bundle2 == null ? new Bundle() : bundle2;
        this.n = bundle3;
        this.o = list2;
        this.p = str3;
        this.q = str4;
        this.r = z3;
    }

    public static void a(aoy aoy) {
        aoy.m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", aoy.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aoy)) {
            return false;
        }
        aoy aoy = (aoy) obj;
        return this.a == aoy.a && this.b == aoy.b && v.a(this.c, aoy.c) && this.d == aoy.d && v.a(this.e, aoy.e) && this.f == aoy.f && this.g == aoy.g && this.h == aoy.h && v.a(this.i, aoy.i) && v.a(this.j, aoy.j) && v.a(this.k, aoy.k) && v.a(this.l, aoy.l) && v.a(this.m, aoy.m) && v.a(this.n, aoy.n) && v.a(this.o, aoy.o) && v.a(this.p, aoy.p) && v.a(this.q, aoy.q) && this.r == aoy.r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.a);
        ps.a(parcel, 2, this.b);
        ps.a(parcel, 3, this.c, false);
        ps.a(parcel, 4, this.d);
        ps.b(parcel, 5, this.e, false);
        ps.a(parcel, 6, this.f);
        ps.a(parcel, 7, this.g);
        ps.a(parcel, 8, this.h);
        ps.a(parcel, 9, this.i, false);
        ps.a(parcel, 10, (Parcelable) this.j, i2, false);
        ps.a(parcel, 11, (Parcelable) this.k, i2, false);
        ps.a(parcel, 12, this.l, false);
        ps.a(parcel, 13, this.m, false);
        ps.a(parcel, 14, this.n, false);
        ps.b(parcel, 15, this.o, false);
        ps.a(parcel, 16, this.p, false);
        ps.a(parcel, 17, this.q, false);
        ps.a(parcel, 18, this.r);
        ps.a(parcel, a2);
    }
}
