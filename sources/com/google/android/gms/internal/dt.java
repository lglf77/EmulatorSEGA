package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a;
import com.google.android.gms.a.a;

public abstract class dt extends afv implements ds {
    public dt() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static ds a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof ds ? (ds) queryLocalInterface : new du(iBinder);
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
                a(a.C0014a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                b(a.C0014a.a(parcel.readStrongBinder()));
                break;
            case 4:
                c(a.C0014a.a(parcel.readStrongBinder()));
                break;
            case 5:
                d(a.C0014a.a(parcel.readStrongBinder()));
                break;
            case 6:
                e(a.C0014a.a(parcel.readStrongBinder()));
                break;
            case 7:
                a(a.C0014a.a(parcel.readStrongBinder()), (dw) afw.a(parcel, dw.CREATOR));
                break;
            case 8:
                f(a.C0014a.a(parcel.readStrongBinder()));
                break;
            case 9:
                b(a.C0014a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                g(a.C0014a.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
