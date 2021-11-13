package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class aqn extends afu implements aql {
    aqn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public final void a(String str, String str2) {
        Parcel i_ = i_();
        i_.writeString(str);
        i_.writeString(str2);
        b(1, i_);
    }
}
