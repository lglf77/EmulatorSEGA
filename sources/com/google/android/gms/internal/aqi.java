package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a.a;

public final class aqi extends afu implements aqg {
    aqi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final String A() {
        Parcel a = a(31, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final aql B() {
        aql aqn;
        Parcel a = a(32, i_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aqn = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            aqn = queryLocalInterface instanceof aql ? (aql) queryLocalInterface : new aqn(readStrongBinder);
        }
        a.recycle();
        return aqn;
    }

    public final apv C() {
        apv apx;
        Parcel a = a(33, i_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            apx = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            apx = queryLocalInterface instanceof apv ? (apv) queryLocalInterface : new apx(readStrongBinder);
        }
        a.recycle();
        return apx;
    }

    public final void D() {
        b(9, i_());
    }

    public final String a() {
        Parcel a = a(18, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(apc apc) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) apc);
        b(13, i_);
    }

    public final void a(aps aps) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aps);
        b(20, i_);
    }

    public final void a(apv apv) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) apv);
        b(7, i_);
    }

    public final void a(aql aql) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aql);
        b(8, i_);
    }

    public final void a(aqs aqs) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aqs);
        b(21, i_);
    }

    public final void a(arg arg) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) arg);
        b(30, i_);
    }

    public final void a(asf asf) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) asf);
        b(29, i_);
    }

    public final void a(atq atq) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) atq);
        b(19, i_);
    }

    public final void a(bcy bcy) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) bcy);
        b(14, i_);
    }

    public final void a(bde bde, String str) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) bde);
        i_.writeString(str);
        b(15, i_);
    }

    public final void a(cu cuVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) cuVar);
        b(24, i_);
    }

    public final void a(String str) {
        Parcel i_ = i_();
        i_.writeString(str);
        b(25, i_);
    }

    public final void b(boolean z) {
        Parcel i_ = i_();
        afw.a(i_, z);
        b(22, i_);
    }

    public final boolean b(aoy aoy) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) aoy);
        Parcel a = a(4, i_);
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final void c(boolean z) {
        Parcel i_ = i_();
        afw.a(i_, z);
        b(34, i_);
    }

    public final String d_() {
        Parcel a = a(35, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void i() {
        b(2, i_());
    }

    public final a j() {
        Parcel a = a(1, i_());
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final apc k() {
        Parcel a = a(12, i_());
        apc apc = (apc) afw.a(a, apc.CREATOR);
        a.recycle();
        return apc;
    }

    public final boolean l() {
        Parcel a = a(3, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final void m() {
        b(11, i_());
    }

    public final void n() {
        b(5, i_());
    }

    public final void o() {
        b(6, i_());
    }

    public final void p() {
        b(10, i_());
    }

    public final boolean q() {
        Parcel a = a(23, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final ara r() {
        ara arc;
        Parcel a = a(26, i_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            arc = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            arc = queryLocalInterface instanceof ara ? (ara) queryLocalInterface : new arc(readStrongBinder);
        }
        a.recycle();
        return arc;
    }
}
