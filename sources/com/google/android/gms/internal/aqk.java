package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a.a;

public final class aqk extends afu implements aqj {
    aqk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder a(a aVar, apc apc, String str, bar bar, int i, int i2) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (Parcelable) apc);
        i_.writeString(str);
        afw.a(i_, (IInterface) bar);
        i_.writeInt(11910000);
        i_.writeInt(i2);
        Parcel a = a(2, i_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
