package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class ad implements Parcelable.Creator<ab> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    z = pq.c(parcel, readInt);
                    break;
                case 3:
                    arrayList = pq.p(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new ab(z, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ab[i];
    }
}
