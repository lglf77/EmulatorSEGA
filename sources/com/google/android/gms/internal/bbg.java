package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import java.util.ArrayList;
import java.util.List;

public final class bbg extends afu implements bbe {
    bbg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final String a() {
        Parcel a = a(2, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(11, i_);
    }

    public final List b() {
        Parcel a = a(3, i_());
        ArrayList b = afw.b(a);
        a.recycle();
        return b;
    }

    public final void b(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(12, i_);
    }

    public final String c() {
        Parcel a = a(4, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void c(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(16, i_);
    }

    public final avh d() {
        Parcel a = a(5, i_());
        avh a2 = avi.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final String e() {
        Parcel a = a(6, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final double f() {
        Parcel a = a(7, i_());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    public final String g() {
        Parcel a = a(8, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String h() {
        Parcel a = a(9, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void i() {
        b(10, i_());
    }

    public final boolean j() {
        Parcel a = a(13, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final boolean k() {
        Parcel a = a(14, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final Bundle l() {
        Parcel a = a(15, i_());
        Bundle bundle = (Bundle) afw.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final ara m() {
        Parcel a = a(17, i_());
        ara a2 = arb.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final a n() {
        Parcel a = a(18, i_());
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final avd o() {
        Parcel a = a(19, i_());
        avd a2 = ave.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final a p() {
        Parcel a = a(20, i_());
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final a q() {
        Parcel a = a(21, i_());
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
