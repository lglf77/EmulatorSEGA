package com.google.android.gms.internal;

import android.os.Parcel;

public abstract class apt extends afv implements aps {
    public apt() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        a();
        parcel2.writeNoException();
        return true;
    }
}
