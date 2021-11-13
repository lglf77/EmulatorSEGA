package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class ct extends afu implements cs {
    ct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    public final IBinder a(a aVar, bar bar, int i) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (IInterface) bar);
        i_.writeInt(11910000);
        Parcel a = a(1, i_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
