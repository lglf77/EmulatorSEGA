package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.ab;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.ae;

@bfk
public final class u extends ab<ae> {
    private int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(Context context, Looper looper, ad adVar, ae aeVar, int i) {
        super(context.getApplicationContext() != null ? context.getApplicationContext() : context, looper, 8, adVar, aeVar, (String) null);
        this.d = i;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof ae ? (ae) queryLocalInterface : new ag(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return "com.google.android.gms.ads.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final ae q() {
        return (ae) super.m();
    }
}
