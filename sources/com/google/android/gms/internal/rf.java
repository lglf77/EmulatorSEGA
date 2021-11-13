package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class rf implements Parcelable.Creator<re> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        String str5 = null;
        boolean z = true;
        boolean z2 = false;
        long j3 = -2147483648L;
        String str6 = null;
        long j4 = 0;
        long j5 = 0;
        int i = 0;
        boolean z3 = true;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = pq.j(parcel, readInt);
                    break;
                case 3:
                    str2 = pq.j(parcel, readInt);
                    break;
                case 4:
                    str3 = pq.j(parcel, readInt);
                    break;
                case 5:
                    str4 = pq.j(parcel, readInt);
                    break;
                case 6:
                    j = pq.e(parcel, readInt);
                    break;
                case 7:
                    j2 = pq.e(parcel, readInt);
                    break;
                case 8:
                    str5 = pq.j(parcel, readInt);
                    break;
                case 9:
                    z = pq.c(parcel, readInt);
                    break;
                case 10:
                    z2 = pq.c(parcel, readInt);
                    break;
                case 11:
                    j3 = pq.e(parcel, readInt);
                    break;
                case 12:
                    str6 = pq.j(parcel, readInt);
                    break;
                case 13:
                    j4 = pq.e(parcel, readInt);
                    break;
                case 14:
                    j5 = pq.e(parcel, readInt);
                    break;
                case 15:
                    i = pq.d(parcel, readInt);
                    break;
                case 16:
                    z3 = pq.c(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new re(str, str2, str3, str4, j, j2, str5, z, z2, j3, str6, j4, j5, i, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new re[i];
    }
}
