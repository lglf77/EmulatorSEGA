package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.b.d;

@bfk
public final class auv extends pp {
    public static final Parcelable.Creator<auv> CREATOR = new auw();
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final asf f;

    public auv(int i, boolean z, int i2, boolean z2, int i3, asf asf) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = i3;
        this.f = asf;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public auv(d dVar) {
        this(3, dVar.a(), dVar.b(), dVar.c(), dVar.d(), dVar.e() != null ? new asf(dVar.e()) : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.a);
        ps.a(parcel, 2, this.b);
        ps.a(parcel, 3, this.c);
        ps.a(parcel, 4, this.d);
        ps.a(parcel, 5, this.e);
        ps.a(parcel, 6, (Parcelable) this.f, i, false);
        ps.a(parcel, a2);
    }
}
