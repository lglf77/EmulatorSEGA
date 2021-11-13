package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.ab;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.ae;

public final class si extends ab<sb> {
    public si(Context context, Looper looper, ad adVar, ae aeVar) {
        super(context, looper, 93, adVar, aeVar, (String) null);
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof sb ? (sb) queryLocalInterface : new sd(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return "com.google.android.gms.measurement.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }
}
