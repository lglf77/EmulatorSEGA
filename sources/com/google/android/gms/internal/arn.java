package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.reward.b;

@bfk
public final class arn {
    private static arn a;
    private static final Object b = new Object();
    private aqv c;
    private b d;

    private arn() {
    }

    public static arn a() {
        arn arn;
        synchronized (b) {
            if (a == null) {
                a = new arn();
            }
            arn = a;
        }
        return arn;
    }

    public final b a(Context context) {
        b bVar;
        synchronized (b) {
            if (this.d != null) {
                bVar = this.d;
            } else {
                this.d = new dc(context, (cp) apg.a(context, false, new apm(app.b(), context, new baq())));
                bVar = this.d;
            }
        }
        return bVar;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r4, java.lang.String r5, com.google.android.gms.internal.arq r6) {
        /*
            r3 = this;
            java.lang.Object r1 = b
            monitor-enter(r1)
            com.google.android.gms.internal.aqv r0 = r3.c     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
        L_0x0008:
            return
        L_0x0009:
            if (r4 != 0) goto L_0x0016
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0013 }
            java.lang.String r2 = "Context cannot be null."
            r0.<init>(r2)     // Catch:{ all -> 0x0013 }
            throw r0     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r0
        L_0x0016:
            com.google.android.gms.internal.apg r0 = com.google.android.gms.internal.app.b()     // Catch:{ RemoteException -> 0x003f }
            com.google.android.gms.internal.apl r2 = new com.google.android.gms.internal.apl     // Catch:{ RemoteException -> 0x003f }
            r2.<init>(r0, r4)     // Catch:{ RemoteException -> 0x003f }
            r0 = 0
            java.lang.Object r0 = com.google.android.gms.internal.apg.a((android.content.Context) r4, (boolean) r0, r2)     // Catch:{ RemoteException -> 0x003f }
            com.google.android.gms.internal.aqv r0 = (com.google.android.gms.internal.aqv) r0     // Catch:{ RemoteException -> 0x003f }
            r3.c = r0     // Catch:{ RemoteException -> 0x003f }
            com.google.android.gms.internal.aqv r0 = r3.c     // Catch:{ RemoteException -> 0x003f }
            r0.a()     // Catch:{ RemoteException -> 0x003f }
            if (r5 == 0) goto L_0x003d
            com.google.android.gms.internal.aqv r0 = r3.c     // Catch:{ RemoteException -> 0x003f }
            com.google.android.gms.internal.aro r2 = new com.google.android.gms.internal.aro     // Catch:{ RemoteException -> 0x003f }
            r2.<init>(r3, r4)     // Catch:{ RemoteException -> 0x003f }
            com.google.android.gms.a.a r2 = com.google.android.gms.a.c.a(r2)     // Catch:{ RemoteException -> 0x003f }
            r0.a((java.lang.String) r5, (com.google.android.gms.a.a) r2)     // Catch:{ RemoteException -> 0x003f }
        L_0x003d:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0008
        L_0x003f:
            r0 = move-exception
            java.lang.String r2 = "MobileAdsSettingManager initialization failed"
            com.google.android.gms.internal.jn.c(r2, r0)     // Catch:{ all -> 0x0013 }
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.arn.a(android.content.Context, java.lang.String, com.google.android.gms.internal.arq):void");
    }
}
