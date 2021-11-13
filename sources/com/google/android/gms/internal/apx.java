package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class apx extends afu implements apv {
    apx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void a() {
        b(1, i_());
    }

    public final void a(int i) {
        Parcel i_ = i_();
        i_.writeInt(i);
        b(2, i_);
    }

    public final void b() {
        b(3, i_());
    }

    public final void c() {
        b(4, i_());
    }

    public final void d() {
        b(5, i_());
    }

    public final void e() {
        b(6, i_());
    }

    public final void f() {
        b(7, i_());
    }
}
