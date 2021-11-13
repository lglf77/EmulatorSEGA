package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a;
import com.google.android.gms.a.a;
import java.util.List;

public abstract class awf extends afv implements awe {
    public awf() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static awe a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof awe ? (awe) queryLocalInterface : new awg(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                String a = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 2:
                avh b = b(parcel.readString());
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) b);
                return true;
            case 3:
                List<String> a2 = a();
                parcel2.writeNoException();
                parcel2.writeStringList(a2);
                return true;
            case 4:
                String l = l();
                parcel2.writeNoException();
                parcel2.writeString(l);
                return true;
            case 5:
                c(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                d();
                parcel2.writeNoException();
                return true;
            case 7:
                ara c = c();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) c);
                return true;
            case 8:
                f();
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.a.a e = e();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) e);
                return true;
            case 10:
                boolean a3 = a(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                afw.a(parcel2, a3);
                return true;
            case 11:
                com.google.android.gms.a.a b2 = b();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) b2);
                return true;
            default:
                return false;
        }
    }
}
