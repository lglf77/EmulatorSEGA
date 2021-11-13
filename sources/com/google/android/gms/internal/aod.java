package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class aod extends afu implements aoc {
    aod(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final anw a(anz anz) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) anz);
        Parcel a = a(1, i_);
        anw anw = (anw) afw.a(a, anw.CREATOR);
        a.recycle();
        return anw;
    }
}
