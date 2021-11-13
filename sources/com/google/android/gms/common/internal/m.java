package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.a;
import com.google.android.gms.internal.afu;

public final class m extends afu implements k {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final a a() {
        Parcel a = a(1, i_());
        a a2 = a.C0014a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int b() {
        Parcel a = a(2, i_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
