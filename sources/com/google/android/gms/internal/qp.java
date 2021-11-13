package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;

public final class qp implements Parcelable.Creator<qo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = pq.a(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    i = pq.d(parcel, readInt);
                    break;
                case 2:
                    str2 = pq.j(parcel, readInt);
                    break;
                case 3:
                    str = pq.j(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new qo(i, str2, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new qo[i];
    }
}
