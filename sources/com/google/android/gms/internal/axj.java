package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;

public final class axj implements Parcelable.Creator<axi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String[] strArr = null;
        int a = pq.a(parcel);
        String[] strArr2 = null;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    str = pq.j(parcel, readInt);
                    break;
                case 2:
                    strArr2 = pq.n(parcel, readInt);
                    break;
                case 3:
                    strArr = pq.n(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new axi(str, strArr2, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new axi[i];
    }
}
