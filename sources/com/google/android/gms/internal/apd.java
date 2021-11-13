package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class apd implements Parcelable.Creator<apc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        apc[] apcArr = null;
        boolean z = false;
        int a = pq.a(parcel);
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = pq.j(parcel, readInt);
                    break;
                case 3:
                    i4 = pq.d(parcel, readInt);
                    break;
                case 4:
                    i3 = pq.d(parcel, readInt);
                    break;
                case 5:
                    z4 = pq.c(parcel, readInt);
                    break;
                case 6:
                    i2 = pq.d(parcel, readInt);
                    break;
                case 7:
                    i = pq.d(parcel, readInt);
                    break;
                case 8:
                    apcArr = (apc[]) pq.b(parcel, readInt, apc.CREATOR);
                    break;
                case 9:
                    z3 = pq.c(parcel, readInt);
                    break;
                case 10:
                    z2 = pq.c(parcel, readInt);
                    break;
                case 11:
                    z = pq.c(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new apc(str, i4, i3, z4, i2, i, apcArr, z3, z2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new apc[i];
    }
}
