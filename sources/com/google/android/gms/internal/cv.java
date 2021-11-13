package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a;

public abstract class cv extends afv implements cu {
    public cv() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public static cu a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof cu ? (cu) queryLocalInterface : new cw(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        cm coVar;
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
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    coVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    coVar = queryLocalInterface instanceof cm ? (cm) queryLocalInterface : new co(readStrongBinder);
                }
                a(coVar);
                break;
            case 6:
                e();
                break;
            case 7:
                a(parcel.readInt());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
