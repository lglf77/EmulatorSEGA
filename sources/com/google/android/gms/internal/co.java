package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class co extends afu implements cm {
    co(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public final String a() {
        Parcel a = a(1, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final int b() {
        Parcel a = a(2, i_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
