package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a;
import java.util.ArrayList;

public final class aq implements Parcelable.Creator<ap> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = pq.a(parcel);
        boolean z = false;
        String str2 = null;
        PackageInfo packageInfo = null;
        ArrayList<String> arrayList = null;
        String str3 = null;
        ApplicationInfo applicationInfo = null;
        jp jpVar = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case a.b.AdsAttrs_adSizes:
                    bundle = pq.l(parcel, readInt);
                    break;
                case 2:
                    jpVar = (jp) pq.a(parcel, readInt, jp.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) pq.a(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str3 = pq.j(parcel, readInt);
                    break;
                case 5:
                    arrayList = pq.p(parcel, readInt);
                    break;
                case 6:
                    packageInfo = (PackageInfo) pq.a(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = pq.j(parcel, readInt);
                    break;
                case 8:
                    z = pq.c(parcel, readInt);
                    break;
                case 9:
                    str = pq.j(parcel, readInt);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new ap(bundle, jpVar, applicationInfo, str3, arrayList, packageInfo, str2, z, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ap[i];
    }
}
