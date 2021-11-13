package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.a.c;
import com.google.android.gms.a.d;
import com.google.android.gms.a.e;

@bfk
public final class bcq extends d<bcu> {
    public bcq() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final bcr a(Activity activity) {
        try {
            IBinder a = ((bcu) a((Context) activity)).a(c.a(activity));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof bcr ? (bcr) queryLocalInterface : new bct(a);
        } catch (RemoteException e) {
            jn.c("Could not create remote AdOverlay.", e);
            return null;
        } catch (e e2) {
            jn.c("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof bcu ? (bcu) queryLocalInterface : new bcv(iBinder);
    }
}
