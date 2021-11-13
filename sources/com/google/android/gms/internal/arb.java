package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a;

public abstract class arb extends afv implements ara {
    public arb() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static ara a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof ara ? (ara) queryLocalInterface : new arc(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ard arf;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                a();
                parcel2.writeNoException();
                break;
            case 2:
                b();
                parcel2.writeNoException();
                break;
            case 3:
                a(afw.a(parcel));
                parcel2.writeNoException();
                break;
            case 4:
                boolean c = c();
                parcel2.writeNoException();
                afw.a(parcel2, c);
                break;
            case 5:
                int d = d();
                parcel2.writeNoException();
                parcel2.writeInt(d);
                break;
            case 6:
                float f = f();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                break;
            case 7:
                float g = g();
                parcel2.writeNoException();
                parcel2.writeFloat(g);
                break;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    arf = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    arf = queryLocalInterface instanceof ard ? (ard) queryLocalInterface : new arf(readStrongBinder);
                }
                a(arf);
                parcel2.writeNoException();
                break;
            case 9:
                float e = e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                break;
            case 10:
                boolean i3 = i();
                parcel2.writeNoException();
                afw.a(parcel2, i3);
                break;
            case 11:
                ard h = h();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) h);
                break;
            case 12:
                boolean j = j();
                parcel2.writeNoException();
                afw.a(parcel2, j);
                break;
            default:
                return false;
        }
        return true;
    }
}
