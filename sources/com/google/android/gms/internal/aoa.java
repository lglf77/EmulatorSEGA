package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class aoa implements Parcelable.Creator<anz> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        Bundle bundle = null;
        int a = pq.a(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j2 = 0;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str4 = pq.j(parcel, readInt);
                    break;
                case 3:
                    j2 = pq.e(parcel, readInt);
                    break;
                case 4:
                    str3 = pq.j(parcel, readInt);
                    break;
                case 5:
                    str2 = pq.j(parcel, readInt);
                    break;
                case 6:
                    str = pq.j(parcel, readInt);
                    break;
                case 7:
                    bundle = pq.l(parcel, readInt);
                    break;
                case 8:
                    z = pq.c(parcel, readInt);
                    break;
                case 9:
                    j = pq.e(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new anz(str4, j2, str3, str2, str, bundle, z, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new anz[i];
    }
}
