package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

@bfk
public final class ba extends pp {
    public static final Parcelable.Creator<ba> CREATOR = new bb();
    String a;

    public ba(String str) {
        this.a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, this.a, false);
        ps.a(parcel, a2);
    }
}
