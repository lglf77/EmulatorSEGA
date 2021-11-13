package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public final class asc implements Parcelable.Creator<asb> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 15:
                    str = pq.j(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new asb(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new asb[i];
    }
}
