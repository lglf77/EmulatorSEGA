package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class ats extends afu implements atq {
    ats(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void a(atm atm) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) atm);
        b(1, i_);
    }
}
