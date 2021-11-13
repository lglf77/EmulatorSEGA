package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import java.util.List;

public abstract class awb extends afv implements awa {
    public awb() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
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
                String e = e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                break;
            case 6:
                avh f = f();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) f);
                break;
            case 7:
                String g = g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                break;
            case 8:
                String h = h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                break;
            case 9:
                Bundle n = n();
                parcel2.writeNoException();
                afw.b(parcel2, n);
                break;
            case 10:
                q();
                parcel2.writeNoException();
                break;
            case 11:
                ara i3 = i();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) i3);
                break;
            case 12:
                a((Bundle) afw.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                boolean b2 = b((Bundle) afw.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                afw.a(parcel2, b2);
                break;
            case 14:
                c((Bundle) afw.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                avd p = p();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) p);
                break;
            case 16:
                a c = c();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) c);
                break;
            case 17:
                String d = d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                break;
            default:
                return false;
        }
        return true;
    }
}
