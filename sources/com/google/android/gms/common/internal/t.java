package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.a.a;
import com.google.android.gms.common.q;
import com.google.android.gms.internal.afu;
import com.google.android.gms.internal.afw;

public final class t extends afu implements r {
    t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean a(q qVar, a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) qVar);
        afw.a(i_, (IInterface) aVar);
        Parcel a = a(5, i_);
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }
}
