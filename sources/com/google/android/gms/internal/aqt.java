package com.google.android.gms.internal;

import android.os.Parcel;

public abstract class aqt extends afv implements aqs {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        long a = a();
        parcel2.writeNoException();
        parcel2.writeLong(a);
        return true;
    }
}
