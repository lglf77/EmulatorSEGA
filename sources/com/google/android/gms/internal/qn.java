package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.ab;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.ae;

public final class qn extends ab<qs> {
    public qn(Context context, Looper looper, ad adVar, ae aeVar) {
        super(context, looper, 116, adVar, aeVar, (String) null);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof qs ? (qs) queryLocalInterface : new qt(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return "com.google.android.gms.gass.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    public final qs q() {
        return (qs) super.m();
    }
}
