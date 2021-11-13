package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import java.util.List;

public abstract class bbi extends afv implements bbh {
    public bbi() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
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
                List b = b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            case 4:
                String c = c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 5:
                avh d = d();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) d);
                return true;
            case 6:
                String e = e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 7:
                String f = f();
                parcel2.writeNoException();
                parcel2.writeString(f);
                return true;
            case 8:
                g();
                parcel2.writeNoException();
                return true;
            case 9:
                a(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                b(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                boolean h = h();
                parcel2.writeNoException();
                afw.a(parcel2, h);
                return true;
            case 12:
                boolean i3 = i();
                parcel2.writeNoException();
                afw.a(parcel2, i3);
                return true;
            case 13:
                Bundle j = j();
                parcel2.writeNoException();
                afw.b(parcel2, j);
                return true;
            case 14:
                c(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                a k = k();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) k);
                return true;
            case 16:
                ara l = l();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) l);
                return true;
            case 19:
                avd m = m();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) m);
                return true;
            case 20:
                a n = n();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) n);
                return true;
            case 21:
                a o = o();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) o);
                return true;
            default:
                return false;
        }
    }
}
