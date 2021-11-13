package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;
import com.google.android.gms.internal.pq;

public final class c implements Parcelable.Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int a = pq.a(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    i = pq.d(parcel, readInt);
                    break;
                case 2:
                    str = pq.j(parcel, readInt);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) pq.a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 1000:
                    i2 = pq.d(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new Status(i2, i, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
