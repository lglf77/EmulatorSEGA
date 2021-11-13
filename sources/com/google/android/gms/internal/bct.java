package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a.a;

public final class bct extends afu implements bcr {
    bct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void a(int i, int i2, Intent intent) {
        Parcel i_ = i_();
        i_.writeInt(i);
        i_.writeInt(i2);
        afw.a(i_, (Parcelable) intent);
        b(12, i_);
    }

    public final void a(Bundle bundle) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) bundle);
        b(1, i_);
    }

    public final void a(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(13, i_);
    }

    public final void b(Bundle bundle) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) bundle);
        Parcel a = a(6, i_);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    public final void d() {
        b(10, i_());
    }

    public final boolean e() {
        Parcel a = a(11, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final void f() {
        b(2, i_());
    }

    public final void g() {
        b(3, i_());
    }

    public final void h() {
        b(4, i_());
    }

    public final void i() {
        b(5, i_());
    }

    public final void j() {
        b(7, i_());
    }

    public final void k() {
        b(8, i_());
    }

    public final void l() {
        b(9, i_());
    }
}
