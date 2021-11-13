package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;

public final class auw implements Parcelable.Creator<auv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = pq.a(parcel);
        asf asf = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    i3 = pq.d(parcel, readInt);
                    break;
                case 2:
                    z2 = pq.c(parcel, readInt);
                    break;
                case 3:
                    i2 = pq.d(parcel, readInt);
                    break;
                case 4:
                    z = pq.c(parcel, readInt);
                    break;
                case 5:
                    i = pq.d(parcel, readInt);
                    break;
                case 6:
                    asf = (asf) pq.a(parcel, readInt, asf.CREATOR);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new auv(i3, z2, i2, z, i, asf);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new auv[i];
    }
}
