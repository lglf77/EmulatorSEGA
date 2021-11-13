package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

public final class anx implements Parcelable.Creator<anw> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) pq.a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new anw(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new anw[i];
    }
}
