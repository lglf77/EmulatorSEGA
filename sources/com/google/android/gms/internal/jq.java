package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class jq implements Parcelable.Creator<jp> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = pq.a(parcel);
        String str = null;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = pq.j(parcel, readInt);
                    break;
                case 3:
                    i2 = pq.d(parcel, readInt);
                    break;
                case 4:
                    i = pq.d(parcel, readInt);
                    break;
                case 5:
                    z2 = pq.c(parcel, readInt);
                    break;
                case 6:
                    z = pq.c(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new jp(str, i2, i, z2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new jp[i];
    }
}
