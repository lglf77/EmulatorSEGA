package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class aqm extends afv implements aql {
    public aqm() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static aql a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof aql ? (aql) queryLocalInterface : new aqn(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        a(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
