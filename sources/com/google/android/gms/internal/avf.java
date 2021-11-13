package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class avf extends afu implements avd {
    avf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public final String a() {
        Parcel a = a(2, i_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final List<avh> b() {
        Parcel a = a(3, i_());
        ArrayList b = afw.b(a);
        a.recycle();
        return b;
    }
}
