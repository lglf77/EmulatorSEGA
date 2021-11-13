package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;
import java.util.ArrayList;

public final class x implements Parcelable.Creator<v> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = pq.a(parcel);
        int i = 0;
        Bundle bundle = null;
        aoy aoy = null;
        apc apc = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        jp jpVar = null;
        Bundle bundle2 = null;
        int i2 = 0;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        String str5 = null;
        long j = 0;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        auv auv = null;
        ArrayList<String> arrayList3 = null;
        long j2 = 0;
        String str8 = null;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        String str9 = null;
        String str10 = null;
        boolean z5 = false;
        int i7 = 0;
        Bundle bundle4 = null;
        String str11 = null;
        arg arg = null;
        boolean z6 = false;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z7 = false;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    i = pq.d(parcel, readInt);
                    break;
                case 2:
                    bundle = pq.l(parcel, readInt);
                    break;
                case 3:
                    aoy = (aoy) pq.a(parcel, readInt, aoy.CREATOR);
                    break;
                case 4:
                    apc = (apc) pq.a(parcel, readInt, apc.CREATOR);
                    break;
                case 5:
                    str = pq.j(parcel, readInt);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) pq.a(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) pq.a(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = pq.j(parcel, readInt);
                    break;
                case 9:
                    str3 = pq.j(parcel, readInt);
                    break;
                case 10:
                    str4 = pq.j(parcel, readInt);
                    break;
                case 11:
                    jpVar = (jp) pq.a(parcel, readInt, jp.CREATOR);
                    break;
                case 12:
                    bundle2 = pq.l(parcel, readInt);
                    break;
                case 13:
                    i2 = pq.d(parcel, readInt);
                    break;
                case 14:
                    arrayList = pq.p(parcel, readInt);
                    break;
                case 15:
                    bundle3 = pq.l(parcel, readInt);
                    break;
                case 16:
                    z = pq.c(parcel, readInt);
                    break;
                case 18:
                    i3 = pq.d(parcel, readInt);
                    break;
                case 19:
                    i4 = pq.d(parcel, readInt);
                    break;
                case 20:
                    f = pq.g(parcel, readInt);
                    break;
                case 21:
                    str5 = pq.j(parcel, readInt);
                    break;
                case 25:
                    j = pq.e(parcel, readInt);
                    break;
                case 26:
                    str6 = pq.j(parcel, readInt);
                    break;
                case 27:
                    arrayList2 = pq.p(parcel, readInt);
                    break;
                case 28:
                    str7 = pq.j(parcel, readInt);
                    break;
                case 29:
                    auv = (auv) pq.a(parcel, readInt, auv.CREATOR);
                    break;
                case 30:
                    arrayList3 = pq.p(parcel, readInt);
                    break;
                case 31:
                    j2 = pq.e(parcel, readInt);
                    break;
                case 33:
                    str8 = pq.j(parcel, readInt);
                    break;
                case 34:
                    f2 = pq.g(parcel, readInt);
                    break;
                case 35:
                    i5 = pq.d(parcel, readInt);
                    break;
                case 36:
                    i6 = pq.d(parcel, readInt);
                    break;
                case 37:
                    z3 = pq.c(parcel, readInt);
                    break;
                case 38:
                    z4 = pq.c(parcel, readInt);
                    break;
                case 39:
                    str9 = pq.j(parcel, readInt);
                    break;
                case 40:
                    z2 = pq.c(parcel, readInt);
                    break;
                case 41:
                    str10 = pq.j(parcel, readInt);
                    break;
                case 42:
                    z5 = pq.c(parcel, readInt);
                    break;
                case 43:
                    i7 = pq.d(parcel, readInt);
                    break;
                case 44:
                    bundle4 = pq.l(parcel, readInt);
                    break;
                case 45:
                    str11 = pq.j(parcel, readInt);
                    break;
                case 46:
                    arg = (arg) pq.a(parcel, readInt, arg.CREATOR);
                    break;
                case 47:
                    z6 = pq.c(parcel, readInt);
                    break;
                case 48:
                    bundle5 = pq.l(parcel, readInt);
                    break;
                case 49:
                    str12 = pq.j(parcel, readInt);
                    break;
                case 50:
                    str13 = pq.j(parcel, readInt);
                    break;
                case 51:
                    str14 = pq.j(parcel, readInt);
                    break;
                case 52:
                    z7 = pq.c(parcel, readInt);
                    break;
                case 53:
                    arrayList4 = pq.o(parcel, readInt);
                    break;
                case 54:
                    str15 = pq.j(parcel, readInt);
                    break;
                case 55:
                    arrayList5 = pq.p(parcel, readInt);
                    break;
                case 56:
                    i8 = pq.d(parcel, readInt);
                    break;
                case 57:
                    z8 = pq.c(parcel, readInt);
                    break;
                case 58:
                    z9 = pq.c(parcel, readInt);
                    break;
                case 59:
                    z10 = pq.c(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new v(i, bundle, aoy, apc, str, applicationInfo, packageInfo, str2, str3, str4, jpVar, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, auv, arrayList3, j2, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, arg, z6, bundle5, str12, str13, str14, z7, arrayList4, str15, arrayList5, i8, z8, z9, z10);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new v[i];
    }
}
