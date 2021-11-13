package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.internal.afu;
import com.google.android.gms.internal.afw;

public final class l extends afu implements k {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int a(a aVar, String str, boolean z) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        i_.writeString(str);
        afw.a(i_, z);
        Parcel a = a(3, i_);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final a a(a aVar, String str, int i) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        i_.writeString(str);
        i_.writeInt(i);
        Parcel a = a(2, i_);
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
