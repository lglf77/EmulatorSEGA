package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a;
import com.google.android.gms.a.a;

public abstract class avs extends afv implements avq {
    public avs() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static avq a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return queryLocalInterface instanceof avq ? (avq) queryLocalInterface : new avt(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                a(a.C0014a.a(parcel.readStrongBinder()));
                break;
            case 2:
                a();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
