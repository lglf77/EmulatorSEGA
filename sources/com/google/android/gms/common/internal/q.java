package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

final class q implements p {
    private final IBinder a;

    q(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(n nVar, an anVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(nVar.asBinder());
            obtain.writeInt(1);
            anVar.writeToParcel(obtain, 0);
            this.a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }
}
