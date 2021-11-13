package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.j;

@bfk
public final class asf extends pp {
    public static final Parcelable.Creator<asf> CREATOR = new asg();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public asf(j jVar) {
        this(jVar.a(), jVar.b(), jVar.c());
    }

    public asf(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 2, this.a);
        ps.a(parcel, 3, this.b);
        ps.a(parcel, 4, this.c);
        ps.a(parcel, a2);
    }
}
