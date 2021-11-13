package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;
import java.util.ArrayList;

public final class aa implements Parcelable.Creator<z> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        int i2 = 0;
        ArrayList<String> arrayList2 = null;
        long j = 0;
        boolean z = false;
        long j2 = 0;
        ArrayList<String> arrayList3 = null;
        long j3 = 0;
        int i3 = 0;
        String str3 = null;
        long j4 = 0;
        String str4 = null;
        boolean z2 = false;
        String str5 = null;
        String str6 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        am amVar = null;
        String str7 = null;
        String str8 = null;
        boolean z8 = false;
        boolean z9 = false;
        dw dwVar = null;
        ArrayList<String> arrayList4 = null;
        ArrayList<String> arrayList5 = null;
        boolean z10 = false;
        ab abVar = null;
        boolean z11 = false;
        String str9 = null;
        ArrayList<String> arrayList6 = null;
        boolean z12 = false;
        String str10 = null;
        ee eeVar = null;
        String str11 = null;
        boolean z13 = false;
        boolean z14 = false;
        Bundle bundle = null;
        boolean z15 = false;
        int i4 = 0;
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
                    str2 = pq.j(parcel, readInt);
                    break;
                case 4:
                    arrayList = pq.p(parcel, readInt);
                    break;
                case 5:
                    i2 = pq.d(parcel, readInt);
                    break;
                case 6:
                    arrayList2 = pq.p(parcel, readInt);
                    break;
                case 7:
                    j = pq.e(parcel, readInt);
                    break;
                case 8:
                    z = pq.c(parcel, readInt);
                    break;
                case 9:
                    j2 = pq.e(parcel, readInt);
                    break;
                case 10:
                    arrayList3 = pq.p(parcel, readInt);
                    break;
                case 11:
                    j3 = pq.e(parcel, readInt);
                    break;
                case 12:
                    i3 = pq.d(parcel, readInt);
                    break;
                case 13:
                    str3 = pq.j(parcel, readInt);
                    break;
                case 14:
                    j4 = pq.e(parcel, readInt);
                    break;
                case 15:
                    str4 = pq.j(parcel, readInt);
                    break;
                case 18:
                    z2 = pq.c(parcel, readInt);
                    break;
                case 19:
                    str5 = pq.j(parcel, readInt);
                    break;
                case 21:
                    str6 = pq.j(parcel, readInt);
                    break;
                case 22:
                    z3 = pq.c(parcel, readInt);
                    break;
                case 23:
                    z4 = pq.c(parcel, readInt);
                    break;
                case 24:
                    z5 = pq.c(parcel, readInt);
                    break;
                case 25:
                    z6 = pq.c(parcel, readInt);
                    break;
                case 26:
                    z7 = pq.c(parcel, readInt);
                    break;
                case 28:
                    amVar = (am) pq.a(parcel, readInt, am.CREATOR);
                    break;
                case 29:
                    str7 = pq.j(parcel, readInt);
                    break;
                case 30:
                    str8 = pq.j(parcel, readInt);
                    break;
                case 31:
                    z8 = pq.c(parcel, readInt);
                    break;
                case 32:
                    z9 = pq.c(parcel, readInt);
                    break;
                case 33:
                    dwVar = (dw) pq.a(parcel, readInt, dw.CREATOR);
                    break;
                case 34:
                    arrayList4 = pq.p(parcel, readInt);
                    break;
                case 35:
                    arrayList5 = pq.p(parcel, readInt);
                    break;
                case 36:
                    z10 = pq.c(parcel, readInt);
                    break;
                case 37:
                    abVar = (ab) pq.a(parcel, readInt, ab.CREATOR);
                    break;
                case 38:
                    z11 = pq.c(parcel, readInt);
                    break;
                case 39:
                    str9 = pq.j(parcel, readInt);
                    break;
                case 40:
                    arrayList6 = pq.p(parcel, readInt);
                    break;
                case 42:
                    z12 = pq.c(parcel, readInt);
                    break;
                case 43:
                    str10 = pq.j(parcel, readInt);
                    break;
                case 44:
                    eeVar = (ee) pq.a(parcel, readInt, ee.CREATOR);
                    break;
                case 45:
                    str11 = pq.j(parcel, readInt);
                    break;
                case 46:
                    z13 = pq.c(parcel, readInt);
                    break;
                case 47:
                    z14 = pq.c(parcel, readInt);
                    break;
                case 48:
                    bundle = pq.l(parcel, readInt);
                    break;
                case 49:
                    z15 = pq.c(parcel, readInt);
                    break;
                case 50:
                    i4 = pq.d(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new z(i, str, str2, arrayList, i2, arrayList2, j, z, j2, arrayList3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, amVar, str7, str8, z8, z9, dwVar, arrayList4, arrayList5, z10, abVar, z11, str9, arrayList6, z12, str10, eeVar, str11, z13, z14, bundle, z15, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new z[i];
    }
}
