package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;

public final class ri implements Parcelable.Creator<rh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        wo woVar = null;
        long j = 0;
        boolean z = false;
        String str3 = null;
        rx rxVar = null;
        long j2 = 0;
        rx rxVar2 = null;
        long j3 = 0;
        rx rxVar3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    i = pq.d(parcel, readInt);
                    break;
                case 2:
                    str = pq.j(parcel, readInt);
                    break;
                case 3:
                    str2 = pq.j(parcel, readInt);
                    break;
                case 4:
                    woVar = (wo) pq.a(parcel, readInt, wo.CREATOR);
                    break;
                case 5:
                    j = pq.e(parcel, readInt);
                    break;
                case 6:
                    z = pq.c(parcel, readInt);
                    break;
                case 7:
                    str3 = pq.j(parcel, readInt);
                    break;
                case 8:
                    rxVar = (rx) pq.a(parcel, readInt, rx.CREATOR);
                    break;
                case 9:
                    j2 = pq.e(parcel, readInt);
                    break;
                case 10:
                    rxVar2 = (rx) pq.a(parcel, readInt, rx.CREATOR);
                    break;
                case 11:
                    j3 = pq.e(parcel, readInt);
                    break;
                case 12:
                    rxVar3 = (rx) pq.a(parcel, readInt, rx.CREATOR);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new rh(i, str, str2, woVar, j, z, str3, rxVar, j2, rxVar2, j3, rxVar3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new rh[i];
    }
}
