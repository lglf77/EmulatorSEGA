package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.a.c;
import com.google.android.gms.a.d;
import com.google.android.gms.a.e;

@bfk
public final class cy extends d<cs> {
    public cy() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    public final cp a(Context context, bar bar) {
        try {
            IBinder a = ((cs) a(context)).a(c.a(context), bar, 11910000);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return queryLocalInterface instanceof cp ? (cp) queryLocalInterface : new cr(a);
        } catch (RemoteException | e e) {
            jn.c("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof cs ? (cs) queryLocalInterface : new ct(iBinder);
    }
}
