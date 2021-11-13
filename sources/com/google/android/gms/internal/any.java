package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.ab;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.ae;

@bfk
public final class any extends ab<aoc> {
    any(Context context, Looper looper, ad adVar, ae aeVar) {
        super(context, looper, 123, adVar, aeVar, (String) null);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof aoc ? (aoc) queryLocalInterface : new aod(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String a() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    public final aoc q() {
        return (aoc) super.m();
    }
}
