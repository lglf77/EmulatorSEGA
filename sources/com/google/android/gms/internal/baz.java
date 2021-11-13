package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a;

public abstract class baz extends afv implements bay {
    public baz() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        bbb bbd;
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
                a(parcel.readInt());
                break;
            case 4:
                c();
                break;
            case 5:
                d();
                break;
            case 6:
                e();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    bbd = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    bbd = queryLocalInterface instanceof bbb ? (bbb) queryLocalInterface : new bbd(readStrongBinder);
                }
                a(bbd);
                break;
            case 8:
                f();
                break;
            case 9:
                a(parcel.readString(), parcel.readString());
                break;
            case 10:
                a(awf.a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 11:
                g();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
