package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class aqa extends afu implements apy {
    aqa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final String a() {
        Parcel a = a(2, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(aoy aoy) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) aoy);
        b(1, i_);
    }

    public final void a(aoy aoy, int i) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) aoy);
        i_.writeInt(i);
        b(5, i_);
    }

    public final String b() {
        Parcel a = a(4, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean c() {
        Parcel a = a(3, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }
}
