package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.a;
import java.util.List;

public abstract class sc extends afv implements sb {
    public sc() {
        attachInterface(this, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                a((rx) afw.a(parcel, rx.CREATOR), (re) afw.a(parcel, re.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                a((wo) afw.a(parcel, wo.CREATOR), (re) afw.a(parcel, re.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                a((re) afw.a(parcel, re.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                a((rx) afw.a(parcel, rx.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                b((re) afw.a(parcel, re.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                List<wo> a = a((re) afw.a(parcel, re.CREATOR), afw.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                break;
            case 9:
                byte[] a2 = a((rx) afw.a(parcel, rx.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                break;
            case 10:
                a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String c = c((re) afw.a(parcel, re.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 12:
                a((rh) afw.a(parcel, rh.CREATOR), (re) afw.a(parcel, re.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                a((rh) afw.a(parcel, rh.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                List<wo> a3 = a(parcel.readString(), parcel.readString(), afw.a(parcel), (re) afw.a(parcel, re.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a3);
                break;
            case 15:
                List<wo> a4 = a(parcel.readString(), parcel.readString(), parcel.readString(), afw.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                break;
            case 16:
                List<rh> a5 = a(parcel.readString(), parcel.readString(), (re) afw.a(parcel, re.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a5);
                break;
            case 17:
                List<rh> a6 = a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a6);
                break;
            case 18:
                d((re) afw.a(parcel, re.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
