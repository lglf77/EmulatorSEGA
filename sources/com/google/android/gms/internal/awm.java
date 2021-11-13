package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class awm extends afv implements awl {
    public awm() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public static awl a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return queryLocalInterface instanceof awl ? (awl) queryLocalInterface : new awn(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        awa awc;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            awc = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            awc = queryLocalInterface instanceof awa ? (awa) queryLocalInterface : new awc(readStrongBinder);
        }
        a(awc);
        parcel2.writeNoException();
        return true;
    }
}
