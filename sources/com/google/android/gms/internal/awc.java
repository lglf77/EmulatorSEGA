package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a.a;
import java.util.ArrayList;
import java.util.List;

public final class awc extends afu implements awa {
    awc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    public final String a() {
        Parcel a = a(3, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(Bundle bundle) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) bundle);
        b(12, i_);
    }

    public final List b() {
        Parcel a = a(4, i_());
        ArrayList b = afw.b(a);
        a.recycle();
        return b;
    }

    public final boolean b(Bundle bundle) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) bundle);
        Parcel a = a(13, i_);
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final a c() {
        Parcel a = a(16, i_());
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void c(Bundle bundle) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) bundle);
        b(14, i_);
    }

    public final String d() {
        Parcel a = a(17, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String e() {
        Parcel a = a(5, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final avh f() {
        avh avj;
        Parcel a = a(6, i_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            avj = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            avj = queryLocalInterface instanceof avh ? (avh) queryLocalInterface : new avj(readStrongBinder);
        }
        a.recycle();
        return avj;
    }

    public final String g() {
        Parcel a = a(7, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String h() {
        Parcel a = a(8, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final ara i() {
        Parcel a = a(11, i_());
        ara a2 = arb.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final a j() {
        Parcel a = a(2, i_());
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final Bundle n() {
        Parcel a = a(9, i_());
        Bundle bundle = (Bundle) afw.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final avd p() {
        avd avf;
        Parcel a = a(15, i_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            avf = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            avf = queryLocalInterface instanceof avd ? (avd) queryLocalInterface : new avf(readStrongBinder);
        }
        a.recycle();
        return avf;
    }

    public final void q() {
        b(10, i_());
    }
}
