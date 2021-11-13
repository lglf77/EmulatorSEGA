package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.a;
import com.google.android.gms.a.a;

public abstract class atn extends afv implements atm {
    public atn() {
        attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                String a = a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 2:
                String b = b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case 3:
                a(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                c();
                parcel2.writeNoException();
                return true;
            case 5:
                d();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
