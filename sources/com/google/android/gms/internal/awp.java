package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class awp extends afv implements awo {
    public awp() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static awo a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return queryLocalInterface instanceof awo ? (awo) queryLocalInterface : new awq(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        awe awg;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            awg = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            awg = queryLocalInterface instanceof awe ? (awe) queryLocalInterface : new awg(readStrongBinder);
        }
        a(awg, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
