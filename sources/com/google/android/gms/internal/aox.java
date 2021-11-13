package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.a.c;
import com.google.android.gms.a.d;
import com.google.android.gms.a.e;

@bfk
public final class aox extends d<aqj> {
    public aox() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final aqg a(Context context, apc apc, String str, bar bar, int i) {
        try {
            IBinder a = ((aqj) a(context)).a(c.a(context), apc, str, bar, 11910000, i);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface instanceof aqg ? (aqg) queryLocalInterface : new aqi(a);
        } catch (RemoteException | e e) {
            jn.a("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof aqj ? (aqj) queryLocalInterface : new aqk(iBinder);
    }
}
