package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class dx implements Parcelable.Creator<dw> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = pq.j(parcel, readInt);
                    break;
                case 3:
                    i = pq.d(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new dw(str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new dw[i];
    }
}
