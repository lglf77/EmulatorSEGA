package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class akv extends afu implements akt {
    akv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    public final void a() {
        b(3, i_());
    }

    public final void a(int i) {
        Parcel i_ = i_();
        i_.writeInt(i);
        b(6, i_);
    }

    public final void a(a aVar, String str) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        i_.writeString(str);
        b(2, i_);
    }

    public final void a(a aVar, String str, String str2) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        i_.writeString(str);
        i_.writeString((String) null);
        b(8, i_);
    }

    public final void a(byte[] bArr) {
        Parcel i_ = i_();
        i_.writeByteArray(bArr);
        b(5, i_);
    }

    public final void a(int[] iArr) {
        Parcel i_ = i_();
        i_.writeIntArray((int[]) null);
        b(4, i_);
    }

    public final void b(int i) {
        Parcel i_ = i_();
        i_.writeInt(i);
        b(7, i_);
    }
}
