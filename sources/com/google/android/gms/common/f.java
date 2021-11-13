package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;
import com.google.android.gms.internal.pq;

public final class f implements Parcelable.Creator<a> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    i2 = pq.d(parcel, readInt);
                    break;
                case 2:
                    i = pq.d(parcel, readInt);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) pq.a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 4:
                    str = pq.j(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new a(i2, i, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new a[i];
    }
}
