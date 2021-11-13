package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a.a;

public final class cr extends afu implements cp {
    cr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public final void a() {
        b(2, i_());
    }

    public final void a(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(9, i_);
    }

    public final void a(cu cuVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) cuVar);
        b(3, i_);
    }

    public final void a(da daVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) daVar);
        b(1, i_);
    }

    public final void a(String str) {
        Parcel i_ = i_();
        i_.writeString(str);
        b(13, i_);
    }

    public final void a(boolean z) {
        Parcel i_ = i_();
        afw.a(i_, z);
        b(34, i_);
    }

    public final void b(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(10, i_);
    }

    public final boolean b() {
        Parcel a = a(5, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final void c() {
        b(6, i_());
    }

    public final void c(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(11, i_);
    }

    public final void d() {
        b(7, i_());
    }

    public final void e() {
        b(8, i_());
    }

    public final String f() {
        Parcel a = a(12, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
