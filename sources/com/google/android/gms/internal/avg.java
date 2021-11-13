package com.google.android.gms.internal;

import com.google.android.gms.ads.b.c;
import java.util.ArrayList;
import java.util.List;

@bfk
public final class avg extends c.a {
    private final avd a;
    private final List<c.b> b = new ArrayList();
    private String c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.google.android.gms.internal.avj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.google.android.gms.internal.avj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.google.android.gms.internal.avj} */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public avg(com.google.android.gms.internal.avd r6) {
        /*
            r5 = this;
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.b = r1
            r5.a = r6
            com.google.android.gms.internal.avd r1 = r5.a     // Catch:{ RemoteException -> 0x0050 }
            java.lang.String r1 = r1.a()     // Catch:{ RemoteException -> 0x0050 }
            r5.c = r1     // Catch:{ RemoteException -> 0x0050 }
        L_0x0014:
            java.util.List r1 = r6.b()     // Catch:{ RemoteException -> 0x0049 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ RemoteException -> 0x0049 }
        L_0x001c:
            boolean r1 = r3.hasNext()     // Catch:{ RemoteException -> 0x0049 }
            if (r1 == 0) goto L_0x004f
            java.lang.Object r1 = r3.next()     // Catch:{ RemoteException -> 0x0049 }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0049 }
            if (r2 == 0) goto L_0x0062
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x0049 }
            if (r1 == 0) goto L_0x0062
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x0049 }
            boolean r4 = r2 instanceof com.google.android.gms.internal.avh     // Catch:{ RemoteException -> 0x0049 }
            if (r4 == 0) goto L_0x005b
            r0 = r2
            com.google.android.gms.internal.avh r0 = (com.google.android.gms.internal.avh) r0     // Catch:{ RemoteException -> 0x0049 }
            r1 = r0
        L_0x003c:
            if (r1 == 0) goto L_0x001c
            java.util.List<com.google.android.gms.ads.b.c$b> r2 = r5.b     // Catch:{ RemoteException -> 0x0049 }
            com.google.android.gms.internal.avk r4 = new com.google.android.gms.internal.avk     // Catch:{ RemoteException -> 0x0049 }
            r4.<init>(r1)     // Catch:{ RemoteException -> 0x0049 }
            r2.add(r4)     // Catch:{ RemoteException -> 0x0049 }
            goto L_0x001c
        L_0x0049:
            r1 = move-exception
            java.lang.String r2 = "Error while obtaining image."
            com.google.android.gms.internal.jn.b(r2, r1)
        L_0x004f:
            return
        L_0x0050:
            r1 = move-exception
            java.lang.String r2 = "Error while obtaining attribution text."
            com.google.android.gms.internal.jn.b(r2, r1)
            java.lang.String r1 = ""
            r5.c = r1
            goto L_0x0014
        L_0x005b:
            com.google.android.gms.internal.avj r2 = new com.google.android.gms.internal.avj     // Catch:{ RemoteException -> 0x0049 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0049 }
            r1 = r2
            goto L_0x003c
        L_0x0062:
            r1 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.avg.<init>(com.google.android.gms.internal.avd):void");
    }
}
