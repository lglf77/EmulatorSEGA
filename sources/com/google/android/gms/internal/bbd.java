package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class bbd extends afu implements bbb {
    bbd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    public final int a() {
        Parcel a = a(1, i_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
