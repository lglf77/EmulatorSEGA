package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.a;

public final class qj extends afu implements qg {
    qj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    public final boolean getBooleanFlagValue(String str, boolean z, int i) {
        Parcel i_ = i_();
        i_.writeString(str);
        afw.a(i_, z);
        i_.writeInt(i);
        Parcel a = a(2, i_);
        boolean a2 = afw.a(a);
        a.recycle();
        return a2;
    }

    public final int getIntFlagValue(String str, int i, int i2) {
        Parcel i_ = i_();
        i_.writeString(str);
        i_.writeInt(i);
        i_.writeInt(i2);
        Parcel a = a(3, i_);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final long getLongFlagValue(String str, long j, int i) {
        Parcel i_ = i_();
        i_.writeString(str);
        i_.writeLong(j);
        i_.writeInt(i);
        Parcel a = a(4, i_);
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }

    public final String getStringFlagValue(String str, String str2, int i) {
        Parcel i_ = i_();
        i_.writeString(str);
        i_.writeString(str2);
        i_.writeInt(i);
        Parcel a = a(5, i_);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void init(a aVar) {
        Parcel i_ = i_();
        afw.a(i_, (IInterface) aVar);
        b(1, i_);
    }
}
