package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.a;

@bfk
public final class cx implements a {
    private final cm a;

    public cx(cm cmVar) {
        this.a = cmVar;
    }

    public final String a() {
        if (this.a == null) {
            return null;
        }
        try {
            return this.a.a();
        } catch (RemoteException e) {
            jn.c("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    public final int b() {
        if (this.a == null) {
            return 0;
        }
        try {
            return this.a.b();
        } catch (RemoteException e) {
            jn.c("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
