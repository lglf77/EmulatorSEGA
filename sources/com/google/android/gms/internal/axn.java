package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

public final class axn extends afu implements axm {
    axn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final ParcelFileDescriptor a(axi axi) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) axi);
        Parcel a = a(1, i_);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) afw.a(a, ParcelFileDescriptor.CREATOR);
        a.recycle();
        return parcelFileDescriptor;
    }
}
