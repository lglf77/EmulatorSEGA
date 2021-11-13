package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class cw extends afu implements cu {
    cw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void a() {
        b(1, i_());
    }

    public final void a(int i) {
        Parcel i_ = i_();
        i_.writeInt(i);
        b(7, i_);
    }

    public final void a(cm cmVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) cmVar);
        b(5, i_);
    }

    public final void b() {
        b(2, i_());
    }

    public final void c() {
        b(3, i_());
    }

    public final void d() {
        b(4, i_());
    }

    public final void e() {
        b(6, i_());
    }
}
