package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.a.c;
import com.google.android.gms.a.d;
import com.google.android.gms.a.e;

@bfk
public final class arr extends d<aqy> {
    public arr() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof aqy ? (aqy) queryLocalInterface : new aqz(iBinder);
    }

    public final aqv b(Context context) {
        try {
            IBinder a = ((aqy) a(context)).a(c.a(context), 11910000);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof aqv ? (aqv) queryLocalInterface : new aqx(a);
        } catch (RemoteException e) {
            jn.c("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (e e2) {
            jn.c("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }
}
