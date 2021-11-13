package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

@bfk
public final class axi extends pp {
    public static final Parcelable.Creator<axi> CREATOR = new axj();
    private String a;
    private String[] b;
    private String[] c;

    axi(String str, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
    }

    public static axi a(aws aws) {
        Map<String, String> b2 = aws.b();
        int size = b2.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        Iterator<Map.Entry<String, String>> it = b2.entrySet().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return new axi(aws.e(), strArr, strArr2);
            }
            Map.Entry next = it.next();
            strArr[i2] = (String) next.getKey();
            strArr2[i2] = (String) next.getValue();
            i = i2 + 1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ps.a(parcel);
        ps.a(parcel, 1, this.a, false);
        ps.a(parcel, 2, this.b, false);
        ps.a(parcel, 3, this.c, false);
        ps.a(parcel, a2);
    }
}
