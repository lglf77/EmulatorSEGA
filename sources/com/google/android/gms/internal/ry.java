package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class ry implements Parcelable.Creator<rx> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = pq.a(parcel);
        long j = 0;
        rt rtVar = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str2 = pq.j(parcel, readInt);
                    break;
                case 3:
                    rtVar = (rt) pq.a(parcel, readInt, rt.CREATOR);
                    break;
                case 4:
                    str = pq.j(parcel, readInt);
                    break;
                case 5:
                    j = pq.e(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new rx(str2, rtVar, str, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new rx[i];
    }
}
