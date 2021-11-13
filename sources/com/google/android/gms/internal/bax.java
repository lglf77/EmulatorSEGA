package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a.a;
import java.util.List;

public final class bax extends afu implements bav {
    bax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final a a() {
        Parcel a = a(2, i_());
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void a(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(21, i_);
    }

    public final void a(a aVar, aoy aoy, String str, bay bay) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (Parcelable) aoy);
        i_.writeString(str);
        afw.a(i_, (IInterface) bay);
        b(3, i_);
    }

    public final void a(a aVar, aoy aoy, String str, ds dsVar, String str2) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (Parcelable) aoy);
        i_.writeString(str);
        afw.a(i_, (IInterface) dsVar);
        i_.writeString(str2);
        b(10, i_);
    }

    public final void a(a aVar, aoy aoy, String str, String str2, bay bay) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (Parcelable) aoy);
        i_.writeString(str);
        i_.writeString(str2);
        afw.a(i_, (IInterface) bay);
        b(7, i_);
    }

    public final void a(a aVar, aoy aoy, String str, String str2, bay bay, auv auv, List<String> list) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (Parcelable) aoy);
        i_.writeString(str);
        i_.writeString(str2);
        afw.a(i_, (IInterface) bay);
        afw.a(i_, (Parcelable) auv);
        i_.writeStringList(list);
        b(14, i_);
    }

    public final void a(a aVar, apc apc, aoy aoy, String str, bay bay) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (Parcelable) apc);
        afw.a(i_, (Parcelable) aoy);
        i_.writeString(str);
        afw.a(i_, (IInterface) bay);
        b(1, i_);
    }

    public final void a(a aVar, apc apc, aoy aoy, String str, String str2, bay bay) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (Parcelable) apc);
        afw.a(i_, (Parcelable) aoy);
        i_.writeString(str);
        i_.writeString(str2);
        afw.a(i_, (IInterface) bay);
        b(6, i_);
    }

    public final void a(a aVar, ds dsVar, List<String> list) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        afw.a(i_, (IInterface) dsVar);
        i_.writeStringList(list);
        b(23, i_);
    }

    public final void a(aoy aoy, String str) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) aoy);
        i_.writeString(str);
        b(11, i_);
    }

    public final void a(aoy aoy, String str, String str2) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) aoy);
        i_.writeString(str);
        i_.writeString(str2);
        b(20, i_);
    }

    public final void a(boolean z) {
        Parcel i_ = i_();
        afw.a(i_, z);
        b(25, i_);
    }

    public final void b() {
        b(4, i_());
    }

    public final void c() {
        b(5, i_());
    }

    public final void d() {
        b(8, i_());
    }

    public final void e() {
        b(9, i_());
    }

    public final void f() {
        b(12, i_());
    }

    public final boolean g() {
        Parcel a = a(13, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final bbe h() {
        bbe bbg;
        Parcel a = a(15, i_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bbg = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            bbg = queryLocalInterface instanceof bbe ? (bbe) queryLocalInterface : new bbg(readStrongBinder);
        }
        a.recycle();
        return bbg;
    }

    public final bbh i() {
        bbh bbj;
        Parcel a = a(16, i_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bbj = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            bbj = queryLocalInterface instanceof bbh ? (bbh) queryLocalInterface : new bbj(readStrongBinder);
        }
        a.recycle();
        return bbj;
    }

    public final Bundle j() {
        Parcel a = a(17, i_());
        Bundle bundle = (Bundle) afw.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final Bundle k() {
        Parcel a = a(18, i_());
        Bundle bundle = (Bundle) afw.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final Bundle l() {
        Parcel a = a(19, i_());
        Bundle bundle = (Bundle) afw.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final boolean m() {
        Parcel a = a(22, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final awe n() {
        Parcel a = a(24, i_());
        awe a2 = awf.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final ara o() {
        Parcel a = a(26, i_());
        ara a2 = arb.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
