package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.afu;
import com.google.android.gms.internal.afw;

public final class b extends afu implements a {
    b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    public final void a(Message message) {
        Parcel i_ = i_();
        afw.a(i_, (Parcelable) message);
        c(1, i_);
    }
}
