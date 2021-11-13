package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.y;

public final class rx extends pp {
    public static final Parcelable.Creator<rx> CREATOR = new ry();
    public final String a;
    public final rt b;
    public final String c;
    public final long d;

    rx(rx rxVar, long j) {
        y.a(rxVar);
        this.a = rxVar.a;
        this.b = rxVar.b;
        this.c = rxVar.c;
        this.d = j;
    }

    public rx(String str, rt rtVar, String str2, long j) {
        this.a = str;
        this.b = rtVar;
        this.c = str2;
        this.d = j;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String valueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length()).append("origin=").append(str).append(",name=").append(str2).append(",params=").append(valueOf).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, this.a, false);
        ps.a(parcel, 3, (Parcelable) this.b, i, false);
        ps.a(parcel, 4, this.c, false);
        ps.a(parcel, 5, this.d);
        ps.a(parcel, a2);
    }
}
