package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class aqz extends afu implements aqy {
    aqz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder a(a aVar, int i) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        i_.writeInt(11910000);
        Parcel a = a(1, i_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
