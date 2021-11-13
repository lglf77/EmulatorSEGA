package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class awu extends afu implements awr {
    awu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void a(awe awe) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) awe);
        b(1, i_);
    }
}
