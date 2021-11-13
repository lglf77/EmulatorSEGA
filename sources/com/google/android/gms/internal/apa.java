package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;
import java.util.ArrayList;

public final class apa implements Parcelable.Creator<aoy> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        ArrayList<String> arrayList = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        asb asb = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    i = pq.d(parcel, readInt);
                    break;
                case 2:
                    j = pq.e(parcel, readInt);
                    break;
                case 3:
                    bundle = pq.l(parcel, readInt);
                    break;
                case 4:
                    i2 = pq.d(parcel, readInt);
                    break;
                case 5:
                    arrayList = pq.p(parcel, readInt);
                    break;
                case 6:
                    z = pq.c(parcel, readInt);
                    break;
                case 7:
                    i3 = pq.d(parcel, readInt);
                    break;
                case 8:
                    z2 = pq.c(parcel, readInt);
                    break;
                case 9:
                    str = pq.j(parcel, readInt);
                    break;
                case 10:
                    asb = (asb) pq.a(parcel, readInt, asb.CREATOR);
                    break;
                case 11:
                    location = (Location) pq.a(parcel, readInt, Location.CREATOR);
                    break;
                case 12:
                    str2 = pq.j(parcel, readInt);
                    break;
                case 13:
                    bundle2 = pq.l(parcel, readInt);
                    break;
                case 14:
                    bundle3 = pq.l(parcel, readInt);
                    break;
                case 15:
                    arrayList2 = pq.p(parcel, readInt);
                    break;
                case 16:
                    str3 = pq.j(parcel, readInt);
                    break;
                case 17:
                    str4 = pq.j(parcel, readInt);
                    break;
                case 18:
                    z3 = pq.c(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new aoy(i, j, bundle, i2, arrayList, z, i3, z2, str, asb, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new aoy[i];
    }
}
