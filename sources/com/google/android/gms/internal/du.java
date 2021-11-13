package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a.a;

public final class du extends afu implements ds {
    du(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public final void a(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(1, i_);
    }

    public final void a(a aVar, int i) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        i_.writeInt(i);
        b(2, i_);
    }

    public final void a(a aVar, dw dwVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (Parcelable) dwVar);
        b(7, i_);
    }

    public final void b(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(3, i_);
    }

    public final void b(a aVar, int i) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        i_.writeInt(i);
        b(9, i_);
    }

    public final void c(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(4, i_);
    }

    public final void d(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(5, i_);
    }

    public final void e(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(6, i_);
    }

    public final void f(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(8, i_);
    }

    public final void g(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(10, i_);
    }
}
