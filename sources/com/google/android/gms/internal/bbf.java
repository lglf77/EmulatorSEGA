package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import java.util.List;

public abstract class bbf extends afv implements bbe {
    public bbf() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
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
                double f = f();
                parcel2.writeNoException();
                parcel2.writeDouble(f);
                return true;
            case 8:
                String g = g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 9:
                String h = h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 10:
                i();
                parcel2.writeNoException();
                return true;
            case 11:
                a(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                b(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean j = j();
                parcel2.writeNoException();
                afw.a(parcel2, j);
                return true;
            case 14:
                boolean k = k();
                parcel2.writeNoException();
                afw.a(parcel2, k);
                return true;
            case 15:
                Bundle l = l();
                parcel2.writeNoException();
                afw.b(parcel2, l);
                return true;
            case 16:
                c(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 17:
                ara m = m();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) m);
                return true;
            case 18:
                a n = n();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) n);
                return true;
            case 19:
                avd o = o();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) o);
                return true;
            case 20:
                a p = p();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) p);
                return true;
            case 21:
                a q = q();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) q);
                return true;
            default:
                return false;
        }
    }
}
