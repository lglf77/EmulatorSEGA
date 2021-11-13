package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class arf extends afu implements ard {
    arf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void a() {
        b(1, i_());
    }

    public final void a(boolean z) {
        Parcel i_ = i_();
        afw.a(i_, z);
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
}
