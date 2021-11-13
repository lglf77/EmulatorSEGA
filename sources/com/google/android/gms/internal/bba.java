package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class bba extends afu implements bay {
    bba(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void a() {
        b(1, i_());
    }

    public final void a(int i) {
        Parcel i_ = i_();
        i_.writeInt(i);
        b(3, i_);
    }

    public final void a(awe awe, String str) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) awe);
        i_.writeString(str);
        b(10, i_);
    }

    public final void a(bbb bbb) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) bbb);
        b(7, i_);
    }

    public final void a(String str, String str2) {
        Parcel i_ = i_();
        i_.writeString(str);
        i_.writeString(str2);
        b(9, i_);
    }

    public final void b() {
        b(2, i_());
    }

    public final void c() {
        b(4, i_());
    }

    public final void d() {
        b(5, i_());
    }

    public final void e() {
        b(6, i_());
    }

    public final void f() {
        b(8, i_());
    }

    public final void g() {
        b(11, i_());
    }
}
