package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class asg implements Parcelable.Creator<asf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = pq.a(parcel);
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    z3 = pq.c(parcel, readInt);
                    break;
                case 3:
                    z2 = pq.c(parcel, readInt);
                    break;
                case 4:
                    z = pq.c(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new asf(z3, z2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new asf[i];
    }
}
