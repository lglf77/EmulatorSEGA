package com.google.android.gms.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a;

public abstract class avi extends afv implements avh {
    public avi() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static avh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof avh ? (avh) queryLocalInterface : new avj(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                com.google.android.gms.a.a a = a();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) a);
                return true;
            case 2:
                Uri b = b();
                parcel2.writeNoException();
                afw.b(parcel2, b);
                return true;
            case 3:
                double c = c();
                parcel2.writeNoException();
                parcel2.writeDouble(c);
                return true;
            default:
                return false;
        }
    }
}
