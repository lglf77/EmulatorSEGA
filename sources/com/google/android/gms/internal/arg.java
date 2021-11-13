package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

@bfk
public final class arg extends pp {
    public static final Parcelable.Creator<arg> CREATOR = new arh();
    public final int a;

    public arg(int i) {
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, this.a);
        ps.a(parcel, a2);
    }
}
