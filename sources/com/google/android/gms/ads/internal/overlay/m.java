package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.pq;

public final class m implements Parcelable.Creator<AdOverlayInfoParcel> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        c cVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        IBinder iBinder5 = null;
        int i = 0;
        int i2 = 0;
        String str3 = null;
        jp jpVar = null;
        String str4 = null;
        p pVar = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    cVar = (c) pq.a(parcel, readInt, c.CREATOR);
                    break;
                case 3:
                    iBinder = pq.k(parcel, readInt);
                    break;
                case 4:
                    iBinder2 = pq.k(parcel, readInt);
                    break;
                case 5:
                    iBinder3 = pq.k(parcel, readInt);
                    break;
                case 6:
                    iBinder4 = pq.k(parcel, readInt);
                    break;
                case 7:
                    str = pq.j(parcel, readInt);
                    break;
                case 8:
                    z = pq.c(parcel, readInt);
                    break;
                case 9:
                    str2 = pq.j(parcel, readInt);
                    break;
                case 10:
                    iBinder5 = pq.k(parcel, readInt);
                    break;
                case 11:
                    i = pq.d(parcel, readInt);
                    break;
                case 12:
                    i2 = pq.d(parcel, readInt);
                    break;
                case 13:
                    str3 = pq.j(parcel, readInt);
                    break;
                case 14:
                    jpVar = (jp) pq.a(parcel, readInt, jp.CREATOR);
                    break;
                case 16:
                    str4 = pq.j(parcel, readInt);
                    break;
                case 17:
                    pVar = (p) pq.a(parcel, readInt, p.CREATOR);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new AdOverlayInfoParcel(cVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, jpVar, str4, pVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
