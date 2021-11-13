package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;
import com.google.android.gms.internal.pq;

public final class h implements Parcelable.Creator<g> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    str = pq.j(parcel, readInt);
                    break;
                case 2:
                    i = pq.d(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new g(str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new g[i];
    }
}
