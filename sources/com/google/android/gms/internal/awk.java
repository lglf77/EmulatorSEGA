package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class awk extends afu implements awi {
    awk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void a(avw avw) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) avw);
        b(1, i_);
    }
}
