package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.b.h;
import com.google.android.gms.ads.i;
import java.util.ArrayList;
import java.util.List;

@bfk
public final class awd extends h {
    private final awa a;
    private final List<c.b> b = new ArrayList();
    private final avk c;
    private final i d = new i();
    private final c.a e;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.google.android.gms.internal.avj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.google.android.gms.internal.avj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: com.google.android.gms.internal.avj} */
    /* JADX WARNING: type inference failed for: r2v9, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public awd(com.google.android.gms.internal.awa r7) {
        /*
            r6 = this;
            r3 = 0
            r6.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.b = r1
            com.google.android.gms.ads.i r1 = new com.google.android.gms.ads.i
            r1.<init>()
            r6.d = r1
            r6.a = r7
            com.google.android.gms.internal.awa r1 = r6.a     // Catch:{ RemoteException -> 0x004d }
            java.util.List r1 = r1.b()     // Catch:{ RemoteException -> 0x004d }
            if (r1 == 0) goto L_0x0053
            java.util.Iterator r4 = r1.iterator()     // Catch:{ RemoteException -> 0x004d }
        L_0x0020:
            boolean r1 = r4.hasNext()     // Catch:{ RemoteException -> 0x004d }
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r4.next()     // Catch:{ RemoteException -> 0x004d }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x004d }
            if (r2 == 0) goto L_0x0080
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x004d }
            if (r1 == 0) goto L_0x0080
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x004d }
            boolean r5 = r2 instanceof com.google.android.gms.internal.avh     // Catch:{ RemoteException -> 0x004d }
            if (r5 == 0) goto L_0x0079
            r0 = r2
            com.google.android.gms.internal.avh r0 = (com.google.android.gms.internal.avh) r0     // Catch:{ RemoteException -> 0x004d }
            r1 = r0
        L_0x0040:
            if (r1 == 0) goto L_0x0020
            java.util.List<com.google.android.gms.ads.b.c$b> r2 = r6.b     // Catch:{ RemoteException -> 0x004d }
            com.google.android.gms.internal.avk r5 = new com.google.android.gms.internal.avk     // Catch:{ RemoteException -> 0x004d }
            r5.<init>(r1)     // Catch:{ RemoteException -> 0x004d }
            r2.add(r5)     // Catch:{ RemoteException -> 0x004d }
            goto L_0x0020
        L_0x004d:
            r1 = move-exception
            java.lang.String r2 = "Failed to get image."
            com.google.android.gms.internal.jn.b(r2, r1)
        L_0x0053:
            com.google.android.gms.internal.awa r1 = r6.a     // Catch:{ RemoteException -> 0x0084 }
            com.google.android.gms.internal.avh r2 = r1.f()     // Catch:{ RemoteException -> 0x0084 }
            if (r2 == 0) goto L_0x0082
            com.google.android.gms.internal.avk r1 = new com.google.android.gms.internal.avk     // Catch:{ RemoteException -> 0x0084 }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x0084 }
        L_0x0060:
            r6.c = r1
            com.google.android.gms.internal.awa r1 = r6.a     // Catch:{ RemoteException -> 0x008c }
            com.google.android.gms.internal.avd r1 = r1.p()     // Catch:{ RemoteException -> 0x008c }
            if (r1 == 0) goto L_0x0076
            com.google.android.gms.internal.avg r1 = new com.google.android.gms.internal.avg     // Catch:{ RemoteException -> 0x008c }
            com.google.android.gms.internal.awa r2 = r6.a     // Catch:{ RemoteException -> 0x008c }
            com.google.android.gms.internal.avd r2 = r2.p()     // Catch:{ RemoteException -> 0x008c }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x008c }
            r3 = r1
        L_0x0076:
            r6.e = r3
            return
        L_0x0079:
            com.google.android.gms.internal.avj r2 = new com.google.android.gms.internal.avj     // Catch:{ RemoteException -> 0x004d }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x004d }
            r1 = r2
            goto L_0x0040
        L_0x0080:
            r1 = r3
            goto L_0x0040
        L_0x0082:
            r1 = r3
            goto L_0x0060
        L_0x0084:
            r1 = move-exception
            java.lang.String r2 = "Failed to get image."
            com.google.android.gms.internal.jn.b(r2, r1)
            r1 = r3
            goto L_0x0060
        L_0x008c:
            r1 = move-exception
            java.lang.String r2 = "Failed to get attribution info."
            com.google.android.gms.internal.jn.b(r2, r1)
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.awd.<init>(com.google.android.gms.internal.awa):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final a a() {
        try {
            return this.a.j();
        } catch (RemoteException e2) {
            jn.b("Failed to retrieve native ad engine.", e2);
            return null;
        }
    }

    public final CharSequence b() {
        try {
            return this.a.a();
        } catch (RemoteException e2) {
            jn.b("Failed to get headline.", e2);
            return null;
        }
    }

    public final List<c.b> c() {
        return this.b;
    }

    public final CharSequence d() {
        try {
            return this.a.e();
        } catch (RemoteException e2) {
            jn.b("Failed to get body.", e2);
            return null;
        }
    }

    public final c.b e() {
        return this.c;
    }

    public final CharSequence f() {
        try {
            return this.a.g();
        } catch (RemoteException e2) {
            jn.b("Failed to get call to action.", e2);
            return null;
        }
    }

    public final CharSequence g() {
        try {
            return this.a.h();
        } catch (RemoteException e2) {
            jn.b("Failed to get attribution.", e2);
            return null;
        }
    }

    public final i h() {
        try {
            if (this.a.i() != null) {
                this.d.a(this.a.i());
            }
        } catch (RemoteException e2) {
            jn.b("Exception occurred while getting video controller", e2);
        }
        return this.d;
    }
}
