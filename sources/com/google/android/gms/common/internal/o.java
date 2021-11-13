package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.a;
import com.google.android.gms.internal.afv;
import com.google.android.gms.internal.afw;

public abstract class o extends afv implements n {
    public o() {
        attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) afw.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                a(parcel.readInt(), (Bundle) afw.a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
