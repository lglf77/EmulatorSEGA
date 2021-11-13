package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class aqu extends afu implements aqs {
    aqu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    public final long a() {
        Parcel a = a(1, i_());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
