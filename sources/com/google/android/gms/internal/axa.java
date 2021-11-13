package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class axa extends afu implements awy {
    axa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public final void a(aqg aqg, a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aqg);
        afw.a(i_, (IInterface) aVar);
        b(1, i_);
    }
}
