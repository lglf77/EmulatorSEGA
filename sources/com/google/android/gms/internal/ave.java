package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class ave extends afv implements avd {
    public ave() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static avd a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof avd ? (avd) queryLocalInterface : new avf(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 2:
                String a = a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 3:
                List<avh> b = b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            default:
                return false;
        }
    }
}
