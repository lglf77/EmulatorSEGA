package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a;
import com.google.android.gms.a.a;

public abstract class bcs extends afv implements bcr {
    public bcs() {
        attachInterface(this, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static bcr a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof bcr ? (bcr) queryLocalInterface : new bct(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                a((Bundle) afw.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                f();
                parcel2.writeNoException();
                break;
            case 3:
                g();
                parcel2.writeNoException();
                break;
            case 4:
                h();
                parcel2.writeNoException();
                break;
            case 5:
                i();
                parcel2.writeNoException();
                break;
            case 6:
                Bundle bundle = (Bundle) afw.a(parcel, Bundle.CREATOR);
                b(bundle);
                parcel2.writeNoException();
                afw.b(parcel2, bundle);
                break;
            case 7:
                j();
                parcel2.writeNoException();
                break;
            case 8:
                k();
                parcel2.writeNoException();
                break;
            case 9:
                l();
                parcel2.writeNoException();
                break;
            case 10:
                d();
                parcel2.writeNoException();
                break;
            case 11:
                boolean e = e();
                parcel2.writeNoException();
                afw.a(parcel2, e);
                break;
            case 12:
                a(parcel.readInt(), parcel.readInt(), (Intent) afw.a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                a(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
