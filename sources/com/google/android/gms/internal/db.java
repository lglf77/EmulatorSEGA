package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class db implements Parcelable.Creator<da> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        String str = null;
        aoy aoy = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    aoy = (aoy) pq.a(parcel, readInt, aoy.CREATOR);
                    break;
                case 3:
                    str = pq.j(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new da(aoy, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new da[i];
    }
}
