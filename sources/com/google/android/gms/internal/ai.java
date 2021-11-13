package com.google.android.gms.internal;

import android.os.Parcel;

public abstract class ai extends afv implements ah {
    public ai() {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        a((z) afw.a(parcel, z.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
