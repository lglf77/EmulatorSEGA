package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class awn extends afu implements awl {
    awn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void a(awa awa) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) awa);
        b(1, i_);
    }
}
