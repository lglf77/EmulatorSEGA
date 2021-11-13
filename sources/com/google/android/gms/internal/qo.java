package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class qo extends pp {
    public static final Parcelable.Creator<qo> CREATOR = new qp();
    private int a;
    private String b;
    private String c;

    qo(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public qo(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.a);
        ps.a(parcel, 2, this.b, false);
        ps.a(parcel, 3, this.c, false);
        ps.a(parcel, a2);
    }
}
