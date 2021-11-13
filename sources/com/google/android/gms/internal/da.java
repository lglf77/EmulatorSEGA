package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

@bfk
public final class da extends pp {
    public static final Parcelable.Creator<da> CREATOR = new db();
    public final aoy a;
    public final String b;

    public da(aoy aoy, String str) {
        this.a = aoy;
        this.b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, (Parcelable) this.a, i, false);
        ps.a(parcel, 3, this.b, false);
        ps.a(parcel, a2);
    }
}
