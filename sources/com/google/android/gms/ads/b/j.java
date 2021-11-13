package com.google.android.gms.ads.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.aql;
import com.google.android.gms.internal.aqm;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.pp;
import com.google.android.gms.internal.ps;

@bfk
public final class j extends pp {
    public static final Parcelable.Creator<j> CREATOR = new l();
    private final boolean a;
    private final aql b;

    j(boolean z, IBinder iBinder) {
        this.a = z;
        this.b = iBinder != null ? aqm.a(iBinder) : null;
    }

    public final boolean a() {
        return this.a;
    }

    public final aql b() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, a());
        ps.a(parcel, 2, this.b == null ? null : this.b.asBinder(), false);
        ps.a(parcel, a2);
    }
}
