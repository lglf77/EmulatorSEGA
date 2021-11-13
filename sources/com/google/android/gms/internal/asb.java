package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.d.a;

@bfk
public final class asb extends pp {
    public static final Parcelable.Creator<asb> CREATOR = new asc();
    public final String a;

    public asb(a aVar) {
        this.a = aVar.a();
    }

    asb(String str) {
        this.a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 15, this.a, false);
        ps.a(parcel, a2);
    }
}
