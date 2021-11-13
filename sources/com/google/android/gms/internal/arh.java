package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class arh implements Parcelable.Creator<arg> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = pq.d(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new arg(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new arg[i];
    }
}
