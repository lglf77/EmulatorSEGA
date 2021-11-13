package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class qt extends afu implements qs {
    qt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final qq a(qo qoVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) qoVar);
        Parcel a = a(1, i_);
        qq qqVar = (qq) afw.a(a, qq.CREATOR);
        a.recycle();
        return qqVar;
    }
}
