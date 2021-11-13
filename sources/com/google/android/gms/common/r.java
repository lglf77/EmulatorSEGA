package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;
import com.google.android.gms.internal.pq;

public final class r implements Parcelable.Creator<q> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        int a = pq.a(parcel);
        boolean z = false;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    str = pq.j(parcel, readInt);
                    break;
                case 2:
                    iBinder = pq.k(parcel, readInt);
                    break;
                case 3:
                    z = pq.c(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new q(str, iBinder, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new q[i];
    }
}
