package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class aqx extends afu implements aqv {
    aqx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final void a() {
        b(1, i_());
    }

    public final void a(float f) {
        Parcel i_ = i_();
        i_.writeFloat(f);
        b(2, i_);
    }

    public final void a(a aVar, String str) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        i_.writeString(str);
        b(5, i_);
    }

    public final void a(String str) {
        Parcel i_ = i_();
        i_.writeString(str);
        b(3, i_);
    }

    public final void a(String str, a aVar) {
        Parcel i_ = i_();
        i_.writeString(str);
        afw.a(i_, (IInterface) aVar);
        b(6, i_);
    }

    public final void a(boolean z) {
        Parcel i_ = i_();
        afw.a(i_, z);
        b(4, i_);
    }

    public final float b() {
        Parcel a = a(7, i_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final boolean c() {
        Parcel a = a(8, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }
}
