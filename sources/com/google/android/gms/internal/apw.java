package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.a;

public abstract class apw extends afv implements apv {
    public apw() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                a();
                break;
            case 2:
                a(parcel.readInt());
                break;
            case 3:
                b();
                break;
            case 4:
                c();
                break;
            case 5:
                d();
                break;
            case 6:
                e();
                break;
            case 7:
                f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
