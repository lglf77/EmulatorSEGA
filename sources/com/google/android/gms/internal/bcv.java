package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class bcv extends afu implements bcu {
    bcv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    public final IBinder a(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        Parcel a = a(1, i_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
