package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.a.c;
import com.google.android.gms.a.d;
import com.google.android.gms.a.e;

@bfk
public final class aow extends d<aqe> {
    public aow() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final aqb a(Context context, String str, bar bar) {
        try {
            IBinder a = ((aqe) a(context)).a(c.a(context), str, bar, 11910000);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof aqb ? (aqb) queryLocalInterface : new aqd(a);
        } catch (RemoteException e) {
            jn.c("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (e e2) {
            jn.c("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof aqe ? (aqe) queryLocalInterface : new aqf(iBinder);
    }
}
