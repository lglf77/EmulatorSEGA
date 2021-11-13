package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class ag extends afu implements ae {
    ag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final z a(v vVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) vVar);
        Parcel a = a(1, i_);
        z zVar = (z) afw.a(a, z.CREATOR);
        a.recycle();
        return zVar;
    }

    public final void a(ap apVar, ak akVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) apVar);
        afw.a(i_, (IInterface) akVar);
        b(4, i_);
    }

    public final void a(v vVar, ah ahVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) vVar);
        afw.a(i_, (IInterface) ahVar);
        b(2, i_);
    }
}
