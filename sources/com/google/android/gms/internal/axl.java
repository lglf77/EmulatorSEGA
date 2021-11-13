package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;

public final class axl implements Parcelable.Creator<axk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        String[] strArr = null;
        int a = pq.a(parcel);
        long j = 0;
        String[] strArr2 = null;
        byte[] bArr = null;
        int i = 0;
        String str = null;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    z2 = pq.c(parcel, readInt);
                    break;
                case 2:
                    str = pq.j(parcel, readInt);
                    break;
                case 3:
                    i = pq.d(parcel, readInt);
                    break;
                case 4:
                    bArr = pq.m(parcel, readInt);
                    break;
                case 5:
                    strArr2 = pq.n(parcel, readInt);
                    break;
                case 6:
                    strArr = pq.n(parcel, readInt);
                    break;
                case 7:
                    z = pq.c(parcel, readInt);
                    break;
                case 8:
                    j = pq.e(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new axk(z2, str, i, bArr, strArr2, strArr, z, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new axk[i];
    }
}
