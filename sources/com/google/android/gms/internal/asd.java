package com.google.android.gms.internal;

import android.os.Parcel;

@bfk
public final class asd extends apc {
    public asd(apc apc) {
        super(apc.a, apc.b, apc.c, apc.d, apc.e, apc.f, apc.g, apc.h, apc.i, apc.j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = ps.a(parcel);
        ps.a(parcel, 2, this.a, false);
        ps.a(parcel, 3, this.b);
        ps.a(parcel, 6, this.e);
        ps.a(parcel, a);
    }
}
