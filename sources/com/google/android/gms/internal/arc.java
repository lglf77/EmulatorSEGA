package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class arc extends afu implements ara {
    arc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public final void a() {
        b(1, i_());
    }

    public final void a(ard ard) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) ard);
        b(8, i_);
    }

    public final void a(boolean z) {
        Parcel i_ = i_();
        afw.a(i_, z);
        b(3, i_);
    }

    public final void b() {
        b(2, i_());
    }

    public final boolean c() {
        Parcel a = a(4, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final int d() {
        Parcel a = a(5, i_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final float e() {
        Parcel a = a(9, i_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final float f() {
        Parcel a = a(6, i_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final float g() {
        Parcel a = a(7, i_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final ard h() {
        ard arf;
        Parcel a = a(11, i_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            arf = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            arf = queryLocalInterface instanceof ard ? (ard) queryLocalInterface : new arf(readStrongBinder);
        }
        a.recycle();
        return arf;
    }

    public final boolean i() {
        Parcel a = a(10, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final boolean j() {
        Parcel a = a(12, i_());
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }
}
