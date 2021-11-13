package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a;
import com.google.android.gms.a.a;
import java.util.List;

public abstract class baw extends afv implements bav {
    public baw() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        bay bba;
        bay bba2;
        bay bba3;
        bay bay = null;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case a.b.AdsAttrs_adSizes:
                com.google.android.gms.a.a a = a.C0014a.a(parcel.readStrongBinder());
                apc apc = (apc) afw.a(parcel, apc.CREATOR);
                aoy aoy = (aoy) afw.a(parcel, aoy.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    bba3 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    bba3 = queryLocalInterface instanceof bay ? (bay) queryLocalInterface : new bba(readStrongBinder);
                }
                a(a, apc, aoy, readString, bba3);
                parcel2.writeNoException();
                break;
            case 2:
                com.google.android.gms.a.a a2 = a();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) a2);
                break;
            case 3:
                com.google.android.gms.a.a a3 = a.C0014a.a(parcel.readStrongBinder());
                aoy aoy2 = (aoy) afw.a(parcel, aoy.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    bay = queryLocalInterface2 instanceof bay ? (bay) queryLocalInterface2 : new bba(readStrongBinder2);
                }
                a(a3, aoy2, readString2, bay);
                parcel2.writeNoException();
                break;
            case 4:
                b();
                parcel2.writeNoException();
                break;
            case 5:
                c();
                parcel2.writeNoException();
                break;
            case 6:
                com.google.android.gms.a.a a4 = a.C0014a.a(parcel.readStrongBinder());
                apc apc2 = (apc) afw.a(parcel, apc.CREATOR);
                aoy aoy3 = (aoy) afw.a(parcel, aoy.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    bay = queryLocalInterface3 instanceof bay ? (bay) queryLocalInterface3 : new bba(readStrongBinder3);
                }
                a(a4, apc2, aoy3, readString3, readString4, bay);
                parcel2.writeNoException();
                break;
            case 7:
                com.google.android.gms.a.a a5 = a.C0014a.a(parcel.readStrongBinder());
                aoy aoy4 = (aoy) afw.a(parcel, aoy.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    bba2 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    bba2 = queryLocalInterface4 instanceof bay ? (bay) queryLocalInterface4 : new bba(readStrongBinder4);
                }
                a(a5, aoy4, readString5, readString6, bba2);
                parcel2.writeNoException();
                break;
            case 8:
                d();
                parcel2.writeNoException();
                break;
            case 9:
                e();
                parcel2.writeNoException();
                break;
            case 10:
                a(a.C0014a.a(parcel.readStrongBinder()), (aoy) afw.a(parcel, aoy.CREATOR), parcel.readString(), dt.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                a((aoy) afw.a(parcel, aoy.CREATOR), parcel.readString());
                parcel2.writeNoException();
                break;
            case 12:
                f();
                parcel2.writeNoException();
                break;
            case 13:
                boolean g = g();
                parcel2.writeNoException();
                afw.a(parcel2, g);
                break;
            case 14:
                com.google.android.gms.a.a a6 = a.C0014a.a(parcel.readStrongBinder());
                aoy aoy5 = (aoy) afw.a(parcel, aoy.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    bba = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    bba = queryLocalInterface5 instanceof bay ? (bay) queryLocalInterface5 : new bba(readStrongBinder5);
                }
                a(a6, aoy5, readString7, readString8, bba, (auv) afw.a(parcel, auv.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                break;
            case 15:
                bbe h = h();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) h);
                break;
            case 16:
                bbh i3 = i();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) i3);
                break;
            case 17:
                Bundle j = j();
                parcel2.writeNoException();
                afw.b(parcel2, j);
                break;
            case 18:
                Bundle k = k();
                parcel2.writeNoException();
                afw.b(parcel2, k);
                break;
            case 19:
                Bundle l = l();
                parcel2.writeNoException();
                afw.b(parcel2, l);
                break;
            case 20:
                a((aoy) afw.a(parcel, aoy.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 21:
                a(a.C0014a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 22:
                boolean m = m();
                parcel2.writeNoException();
                afw.a(parcel2, m);
                break;
            case 23:
                a(a.C0014a.a(parcel.readStrongBinder()), dt.a(parcel.readStrongBinder()), (List<String>) parcel.createStringArrayList());
                parcel2.writeNoException();
                break;
            case 24:
                awe n = n();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) n);
                break;
            case 25:
                a(afw.a(parcel));
                parcel2.writeNoException();
                break;
            case 26:
                ara o = o();
                parcel2.writeNoException();
                afw.a(parcel2, (IInterface) o);
                break;
            default:
                return false;
        }
        return true;
    }
}
