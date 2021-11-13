package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class aky extends afu implements akw {
    aky(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String a() {
        Parcel a = a(1, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean a(boolean z) {
        Parcel i_ = i_();
        afw.a(i_, true);
        Parcel a = a(2, i_);
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final boolean b() {
        Parcel a = a(6, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }
}
