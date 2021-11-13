package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;

public final class wp implements Parcelable.Creator<wo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Double d = null;
        int a = pq.a(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        Float f = null;
        Long l = null;
        String str3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    i = pq.d(parcel, readInt);
                    break;
                case 2:
                    str3 = pq.j(parcel, readInt);
                    break;
                case 3:
                    j = pq.e(parcel, readInt);
                    break;
                case 4:
                    l = pq.f(parcel, readInt);
                    break;
                case 5:
                    f = pq.h(parcel, readInt);
                    break;
                case 6:
                    str2 = pq.j(parcel, readInt);
                    break;
                case 7:
                    str = pq.j(parcel, readInt);
                    break;
                case 8:
                    d = pq.i(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new wo(i, str3, j, l, f, str2, str, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new wo[i];
    }
}
