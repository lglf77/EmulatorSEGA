package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.a;
import com.google.android.gms.a.a;

public abstract class aqw extends afv implements aqv {
    public aqw() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                a();
                parcel2.writeNoException();
                return true;
            case 2:
                a(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                a(afw.a(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                a(a.C0014a.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                a(parcel.readString(), a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float b = b();
                parcel2.writeNoException();
                parcel2.writeFloat(b);
                return true;
            case 8:
                boolean c = c();
                parcel2.writeNoException();
                afw.a(parcel2, c);
                return true;
            default:
                return false;
        }
    }
}
