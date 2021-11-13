package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import java.util.List;

public abstract class avx extends afv implements avw {
    public avx() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 2:
                a j = j();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) j);
                break;
            case 3:
                String a = a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 4:
                List b = b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                break;
            case 5:
                String c = c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 6:
                avh d = d();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) d);
                break;
            case 7:
                String e = e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 8:
                double f = f();
                parcel2.writeNoException();
                parcel2.writeDouble(f);
                break;
            case 9:
                String g = g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                break;
            case 10:
                String h = h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                break;
            case 11:
                Bundle n = n();
                parcel2.writeNoException();
                afw.b(parcel2, n);
                break;
            case 12:
                s();
                parcel2.writeNoException();
                break;
            case 13:
                ara i3 = i();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) i3);
                break;
            case 14:
                a((Bundle) afw.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                boolean b2 = b((Bundle) afw.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                afw.a(parcel2, b2);
                break;
            case 16:
                c((Bundle) afw.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 17:
                avd r = r();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) r);
                break;
            case 18:
                a p = p();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) p);
                break;
            case 19:
                String q = q();
                parcel2.writeNoException();
                parcel2.writeString(q);
                break;
            default:
                return false;
        }
        return true;
    }
}
