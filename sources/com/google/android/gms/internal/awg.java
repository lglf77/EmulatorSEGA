package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import java.util.ArrayList;
import java.util.List;

public final class awg extends afu implements awe {
    awg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final String a(String str) {
        Parcel i_ = i_();
        i_.writeString(str);
        Parcel a = a(1, i_);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final List<String> a() {
        Parcel a = a(3, i_());
        ArrayList<String> createStringArrayList = a.createStringArrayList();
        a.recycle();
        return createStringArrayList;
    }

    public final boolean a(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        Parcel a = a(10, i_);
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final a b() {
        Parcel a = a(11, i_());
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final avh b(String str) {
        avh avj;
        Parcel i_ = i_();
        i_.writeString(str);
        Parcel a = a(2, i_);
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

    public final ara c() {
        Parcel a = a(7, i_());
        ara a2 = arb.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void c(String str) {
        Parcel i_ = i_();
        i_.writeString(str);
        b(5, i_);
    }

    public final void d() {
        b(6, i_());
    }

    public final a e() {
        Parcel a = a(9, i_());
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void f() {
        b(8, i_());
    }

    public final String l() {
        Parcel a = a(4, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
