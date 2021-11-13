package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.a;

public abstract class apz extends afv implements apy {
    public apz() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                a((aoy) afw.a(parcel, aoy.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                String a = a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 3:
                boolean c = c();
                parcel2.writeNoException();
                afw.a(parcel2, c);
                break;
            case 4:
                String b = b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                break;
            case 5:
                a((aoy) afw.a(parcel, aoy.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
