package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class awq extends afu implements awo {
    awq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void a(awe awe, String str) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) awe);
        i_.writeString(str);
        b(1, i_);
    }
}
