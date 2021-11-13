package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a;
import com.google.android.gms.a.a;

public abstract class avm extends afv implements avl {
    public avm() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static avl a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof avl ? (avl) queryLocalInterface : new avn(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                a(parcel.readString(), a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.a.a a = a(parcel.readString());
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) a);
                return true;
            case 3:
                a(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                a();
                parcel2.writeNoException();
                return true;
            case 5:
                a(a.C0014a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
