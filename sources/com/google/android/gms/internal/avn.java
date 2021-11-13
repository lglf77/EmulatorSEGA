package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class avn extends afu implements avl {
    avn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public final a a(String str) {
        Parcel i_ = i_();
        i_.writeString(str);
        Parcel a = a(2, i_);
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void a() {
        b(4, i_());
    }

    public final void a(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(3, i_);
    }

    public final void a(a aVar, int i) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        i_.writeInt(i);
        b(5, i_);
    }

    public final void a(String str, a aVar) {
        Parcel i_ = i_();
        i_.writeString(str);
        afw.a(i_, (IInterface) aVar);
        b(1, i_);
    }
}
