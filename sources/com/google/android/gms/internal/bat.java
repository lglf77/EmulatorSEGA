package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class bat extends afu implements bar {
    bat(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public final bav a(String str) {
        bav bax;
        Parcel i_ = i_();
        i_.writeString(str);
        Parcel a = a(1, i_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bax = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            bax = queryLocalInterface instanceof bav ? (bav) queryLocalInterface : new bax(readStrongBinder);
        }
        a.recycle();
        return bax;
    }

    public final boolean b(String str) {
        Parcel i_ = i_();
        i_.writeString(str);
        Parcel a = a(2, i_);
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }
}
