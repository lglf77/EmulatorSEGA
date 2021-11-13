package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.pp;
import com.google.android.gms.internal.ps;

@bfk
public final class p extends pp {
    public static final Parcelable.Creator<p> CREATOR = new q();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final float d;
    public final int e;
    public final boolean f;
    public final boolean g;
    private String h;

    p(boolean z, boolean z2, String str, boolean z3, float f2, int i, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.h = str;
        this.c = z3;
        this.d = f2;
        this.e = i;
        this.f = z4;
        this.g = z5;
    }

    public p(boolean z, boolean z2, boolean z3, float f2, int i, boolean z4, boolean z5) {
        this(z, z2, (String) null, z3, f2, i, z4, z5);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, this.a);
        ps.a(parcel, 3, this.b);
        ps.a(parcel, 4, this.h, false);
        ps.a(parcel, 5, this.c);
        ps.a(parcel, 6, this.d);
        ps.a(parcel, 7, this.e);
        ps.a(parcel, 8, this.f);
        ps.a(parcel, 9, this.g);
        ps.a(parcel, a2);
    }
}
