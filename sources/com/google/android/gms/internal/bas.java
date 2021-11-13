package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a;

public abstract class bas extends afv implements bar {
    public bas() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static bar a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof bar ? (bar) queryLocalInterface : new bat(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                bav a = a(parcel.readString());
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) a);
                return true;
            case 2:
                boolean b = b(parcel.readString());
                parcel2.writeNoException();
                afw.a(parcel2, b);
                return true;
            default:
                return false;
        }
    }
}
