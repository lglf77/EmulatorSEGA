package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.pp;
import com.google.android.gms.internal.ps;

public final class g extends pp {
    public static final Parcelable.Creator<g> CREATOR = new h();
    private String a;
    private int b;

    public g(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.a, false);
        ps.a(parcel, 2, this.b);
        ps.a(parcel, a2);
    }
}
