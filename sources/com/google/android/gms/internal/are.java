package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.a;

public abstract class are extends afv implements ard {
    public are() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                a();
                break;
            case 2:
                b();
                break;
            case 3:
                c();
                break;
            case 4:
                d();
                break;
            case 5:
                a(afw.a(parcel));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
