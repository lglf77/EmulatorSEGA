package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a;
import com.google.android.gms.a.a;

public abstract class cq extends afv implements cp {
    public cq() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public static cp a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return queryLocalInterface instanceof cp ? (cp) queryLocalInterface : new cr(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        cu cwVar;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                a((da) afw.a(parcel, da.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                a();
                parcel2.writeNoException();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    cwVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    cwVar = queryLocalInterface instanceof cu ? (cu) queryLocalInterface : new cw(readStrongBinder);
                }
                a(cwVar);
                parcel2.writeNoException();
                break;
            case 5:
                boolean b = b();
                parcel2.writeNoException();
                afw.a(parcel2, b);
                break;
            case 6:
                c();
                parcel2.writeNoException();
                break;
            case 7:
                d();
                parcel2.writeNoException();
                break;
            case 8:
                e();
                parcel2.writeNoException();
                break;
            case 9:
                a(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 10:
                b(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 11:
                c(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 12:
                String f = f();
                parcel2.writeNoException();
                parcel2.writeString(f);
                break;
            case 13:
                a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 34:
                a(afw.a(parcel));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
