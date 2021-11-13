package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import java.util.ArrayList;
import java.util.List;

public final class bbj extends afu implements bbh {
    bbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
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
        b(9, i_);
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
        b(10, i_);
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
        b(14, i_);
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

    public final String f() {
        Parcel a = a(7, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void g() {
        b(8, i_());
    }

    public final boolean h() {
        Parcel a = a(11, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final boolean i() {
        Parcel a = a(12, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final Bundle j() {
        Parcel a = a(13, i_());
        Bundle bundle = (Bundle) afw.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final a k() {
        Parcel a = a(15, i_());
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final ara l() {
        Parcel a = a(16, i_());
        ara a2 = arb.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final avd m() {
        Parcel a = a(19, i_());
        avd a2 = ave.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final a n() {
        Parcel a = a(20, i_());
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final a o() {
        Parcel a = a(21, i_());
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
