package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.b.j;

public final class aqd extends afu implements aqb {
    aqd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public final apy a() {
        apy aqa;
        Parcel a = a(1, i_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aqa = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            aqa = queryLocalInterface instanceof apy ? (apy) queryLocalInterface : new aqa(readStrongBinder);
        }
        a.recycle();
        return aqa;
    }

    public final void a(j jVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) jVar);
        b(9, i_);
    }

    public final void a(apv apv) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) apv);
        b(2, i_);
    }

    public final void a(aqs aqs) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aqs);
        b(7, i_);
    }

    public final void a(auv auv) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) auv);
        b(6, i_);
    }

    public final void a(awi awi) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) awi);
        b(3, i_);
    }

    public final void a(awl awl) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) awl);
        b(4, i_);
    }

    public final void a(awv awv) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) awv);
        b(10, i_);
    }

    public final void a(awy awy, apc apc) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) awy);
        afw.a(i_, (Parcelable) apc);
        b(8, i_);
    }

    public final void a(String str, awr awr, awo awo) {
        Parcel i_ = i_();
        i_.writeString(str);
        afw.a(i_, (IInterface) awr);
        afw.a(i_, (IInterface) awo);
        b(5, i_);
    }
}
