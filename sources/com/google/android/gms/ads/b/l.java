package com.google.android.gms.ads.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;
import com.google.android.gms.internal.pq;

public final class l implements Parcelable.Creator<j> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        boolean z = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    z = pq.c(parcel, readInt);
                    break;
                case 2:
                    iBinder = pq.k(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new j(z, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new j[i];
    }
}
