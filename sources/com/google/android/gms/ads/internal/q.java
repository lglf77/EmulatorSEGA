package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.pq;

public final class q implements Parcelable.Creator<p> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = pq.a(parcel);
        String str = null;
        float f = 0.0f;
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    z5 = pq.c(parcel, readInt);
                    break;
                case 3:
                    z4 = pq.c(parcel, readInt);
                    break;
                case 4:
                    str = pq.j(parcel, readInt);
                    break;
                case 5:
                    z3 = pq.c(parcel, readInt);
                    break;
                case 6:
                    f = pq.g(parcel, readInt);
                    break;
                case 7:
                    i = pq.d(parcel, readInt);
                    break;
                case 8:
                    z2 = pq.c(parcel, readInt);
                    break;
                case 9:
                    z = pq.c(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new p(z5, z4, str, z3, f, i, z2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new p[i];
    }
}
