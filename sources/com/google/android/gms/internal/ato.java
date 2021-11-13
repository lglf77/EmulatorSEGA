package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class ato extends afu implements atm {
    ato(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    public final String a() {
        Parcel a = a(1, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(3, i_);
    }

    public final String b() {
        Parcel a = a(2, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void c() {
        b(4, i_());
    }

    public final void d() {
        b(5, i_());
    }
}
