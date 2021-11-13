package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class aj extends afu implements ah {
    aj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    public final void a(z zVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) zVar);
        b(1, i_);
    }
}
