package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.pq;

public final class b implements Parcelable.Creator<c> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Intent intent = null;
        int a = pq.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str7 = pq.j(parcel, readInt);
                    break;
                case 3:
                    str6 = pq.j(parcel, readInt);
                    break;
                case 4:
                    str5 = pq.j(parcel, readInt);
                    break;
                case 5:
                    str4 = pq.j(parcel, readInt);
                    break;
                case 6:
                    str3 = pq.j(parcel, readInt);
                    break;
                case 7:
                    str2 = pq.j(parcel, readInt);
                    break;
                case 8:
                    str = pq.j(parcel, readInt);
                    break;
                case 9:
                    intent = (Intent) pq.a(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    pq.b(parcel, readInt);
                    break;
            }
        }
        pq.q(parcel, a);
        return new c(str7, str6, str5, str4, str3, str2, str, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}
