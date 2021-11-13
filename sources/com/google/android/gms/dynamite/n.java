package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.internal.afu;
import com.google.android.gms.internal.afw;

public final class n extends afu implements m {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final a a(a aVar, String str, int i, a aVar2) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        i_.writeString(str);
        i_.writeInt(i);
        afw.a(i_, (IInterface) aVar2);
        Parcel a = a(2, i_);
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
