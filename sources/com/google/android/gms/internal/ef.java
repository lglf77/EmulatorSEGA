package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class ef implements Parcelable.Creator<ee> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList<String> arrayList = null;
        boolean z = false;
        int a = pq.a(parcel);
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str2 = pq.j(parcel, readInt);
                    break;
                case 3:
                    str = pq.j(parcel, readInt);
                    break;
                case 4:
                    z4 = pq.c(parcel, readInt);
                    break;
                case 5:
                    z3 = pq.c(parcel, readInt);
                    break;
                case 6:
                    arrayList = pq.p(parcel, readInt);
                    break;
                case 7:
                    z2 = pq.c(parcel, readInt);
                    break;
                case 8:
                    z = pq.c(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new ee(str2, str, z4, z3, arrayList, z2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ee[i];
    }
}
