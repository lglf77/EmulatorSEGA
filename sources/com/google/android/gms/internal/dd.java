package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.au;

@bfk
public final class dd extends fj implements dk, dn {
    private final ew a;
    /* access modifiers changed from: private */
    public final Context b;
    private final dr c;
    private final dn d;
    private final Object e;
    /* access modifiers changed from: private */
    public final String f;
    /* access modifiers changed from: private */
    public final String g;
    private final bab h;
    private final long i;
    private int j = 0;
    private int k = 3;
    private dh l;

    public dd(Context context, String str, String str2, bab bab, ew ewVar, dr drVar, dn dnVar, long j2) {
        this.b = context;
        this.f = str;
        this.g = str2;
        this.h = bab;
        this.a = ewVar;
        this.c = drVar;
        this.e = new Object();
        this.d = dnVar;
        this.i = j2;
    }

    /* access modifiers changed from: private */
    public final void a(aoy aoy, bav bav) {
        this.c.b().a((dn) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f)) {
                bav.a(aoy, this.g, this.h.a);
            } else {
                bav.a(aoy, this.g);
            }
        } catch (RemoteException e2) {
            fn.c("Fail to load ad from adapter.", e2);
            a(this.f, 0);
        }
    }

    private final boolean a(long j2) {
        long b2 = this.i - (au.k().b() - j2);
        if (b2 <= 0) {
            this.k = 4;
            return false;
        }
        try {
            this.e.wait(b2);
            return true;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            this.k = 5;
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r2 = new com.google.android.gms.internal.dj().a(com.google.android.gms.ads.internal.au.k().b() - r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        if (1 != r10.j) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        r0 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        r10.l = r2.a(r0).a(r10.f).b(r10.h.d).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0 = r10.k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r10 = this;
            r9 = 1
            r8 = 0
            com.google.android.gms.internal.dr r0 = r10.c
            if (r0 == 0) goto L_0x0016
            com.google.android.gms.internal.dr r0 = r10.c
            com.google.android.gms.internal.dm r0 = r0.b()
            if (r0 == 0) goto L_0x0016
            com.google.android.gms.internal.dr r0 = r10.c
            com.google.android.gms.internal.bav r0 = r0.a()
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            return
        L_0x0017:
            com.google.android.gms.internal.dr r0 = r10.c
            com.google.android.gms.internal.dm r1 = r0.b()
            r1.a((com.google.android.gms.internal.dn) r8)
            r1.a((com.google.android.gms.internal.dk) r10)
            com.google.android.gms.internal.ew r0 = r10.a
            com.google.android.gms.internal.v r0 = r0.a
            com.google.android.gms.internal.aoy r0 = r0.c
            com.google.android.gms.internal.dr r2 = r10.c
            com.google.android.gms.internal.bav r2 = r2.a()
            boolean r3 = r2.g()     // Catch:{ RemoteException -> 0x009c }
            if (r3 == 0) goto L_0x0091
            android.os.Handler r3 = com.google.android.gms.internal.jc.a     // Catch:{ RemoteException -> 0x009c }
            com.google.android.gms.internal.de r4 = new com.google.android.gms.internal.de     // Catch:{ RemoteException -> 0x009c }
            r4.<init>(r10, r0, r2)     // Catch:{ RemoteException -> 0x009c }
            r3.post(r4)     // Catch:{ RemoteException -> 0x009c }
        L_0x003f:
            com.google.android.gms.common.util.d r0 = com.google.android.gms.ads.internal.au.k()
            long r2 = r0.b()
        L_0x0047:
            java.lang.Object r4 = r10.e
            monitor-enter(r4)
            int r0 = r10.j     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00ac
            com.google.android.gms.internal.dj r0 = new com.google.android.gms.internal.dj     // Catch:{ all -> 0x00e1 }
            r0.<init>()     // Catch:{ all -> 0x00e1 }
            com.google.android.gms.common.util.d r5 = com.google.android.gms.ads.internal.au.k()     // Catch:{ all -> 0x00e1 }
            long r6 = r5.b()     // Catch:{ all -> 0x00e1 }
            long r2 = r6 - r2
            com.google.android.gms.internal.dj r2 = r0.a((long) r2)     // Catch:{ all -> 0x00e1 }
            int r0 = r10.j     // Catch:{ all -> 0x00e1 }
            if (r9 != r0) goto L_0x00a9
            r0 = 6
        L_0x0066:
            com.google.android.gms.internal.dj r0 = r2.a((int) r0)     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = r10.f     // Catch:{ all -> 0x00e1 }
            com.google.android.gms.internal.dj r0 = r0.a((java.lang.String) r2)     // Catch:{ all -> 0x00e1 }
            com.google.android.gms.internal.bab r2 = r10.h     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = r2.d     // Catch:{ all -> 0x00e1 }
            com.google.android.gms.internal.dj r0 = r0.b((java.lang.String) r2)     // Catch:{ all -> 0x00e1 }
            com.google.android.gms.internal.dh r0 = r0.a()     // Catch:{ all -> 0x00e1 }
            r10.l = r0     // Catch:{ all -> 0x00e1 }
            monitor-exit(r4)     // Catch:{ all -> 0x00e1 }
        L_0x007f:
            r1.a((com.google.android.gms.internal.dn) r8)
            r1.a((com.google.android.gms.internal.dk) r8)
            int r0 = r10.j
            if (r0 != r9) goto L_0x00e7
            com.google.android.gms.internal.dn r0 = r10.d
            java.lang.String r1 = r10.f
            r0.a(r1)
            goto L_0x0016
        L_0x0091:
            android.os.Handler r3 = com.google.android.gms.internal.jc.a     // Catch:{ RemoteException -> 0x009c }
            com.google.android.gms.internal.dg r4 = new com.google.android.gms.internal.dg     // Catch:{ RemoteException -> 0x009c }
            r4.<init>(r10, r2, r0, r1)     // Catch:{ RemoteException -> 0x009c }
            r3.post(r4)     // Catch:{ RemoteException -> 0x009c }
            goto L_0x003f
        L_0x009c:
            r0 = move-exception
            java.lang.String r2 = "Fail to check if adapter is initialized."
            com.google.android.gms.internal.fn.c(r2, r0)
            java.lang.String r0 = r10.f
            r2 = 0
            r10.a((java.lang.String) r0, (int) r2)
            goto L_0x003f
        L_0x00a9:
            int r0 = r10.k     // Catch:{ all -> 0x00e1 }
            goto L_0x0066
        L_0x00ac:
            boolean r0 = r10.a((long) r2)     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x00e4
            com.google.android.gms.internal.dj r0 = new com.google.android.gms.internal.dj     // Catch:{ all -> 0x00e1 }
            r0.<init>()     // Catch:{ all -> 0x00e1 }
            int r5 = r10.k     // Catch:{ all -> 0x00e1 }
            com.google.android.gms.internal.dj r0 = r0.a((int) r5)     // Catch:{ all -> 0x00e1 }
            com.google.android.gms.common.util.d r5 = com.google.android.gms.ads.internal.au.k()     // Catch:{ all -> 0x00e1 }
            long r6 = r5.b()     // Catch:{ all -> 0x00e1 }
            long r2 = r6 - r2
            com.google.android.gms.internal.dj r0 = r0.a((long) r2)     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = r10.f     // Catch:{ all -> 0x00e1 }
            com.google.android.gms.internal.dj r0 = r0.a((java.lang.String) r2)     // Catch:{ all -> 0x00e1 }
            com.google.android.gms.internal.bab r2 = r10.h     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = r2.d     // Catch:{ all -> 0x00e1 }
            com.google.android.gms.internal.dj r0 = r0.b((java.lang.String) r2)     // Catch:{ all -> 0x00e1 }
            com.google.android.gms.internal.dh r0 = r0.a()     // Catch:{ all -> 0x00e1 }
            r10.l = r0     // Catch:{ all -> 0x00e1 }
            monitor-exit(r4)     // Catch:{ all -> 0x00e1 }
            goto L_0x007f
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e1 }
            throw r0
        L_0x00e4:
            monitor-exit(r4)     // Catch:{ all -> 0x00e1 }
            goto L_0x0047
        L_0x00e7:
            com.google.android.gms.internal.dn r0 = r10.d
            java.lang.String r1 = r10.f
            int r2 = r10.k
            r0.a(r1, r2)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.dd.a():void");
    }

    public final void a(int i2) {
        a(this.f, 0);
    }

    public final void a(String str) {
        synchronized (this.e) {
            this.j = 1;
            this.e.notify();
        }
    }

    public final void a(String str, int i2) {
        synchronized (this.e) {
            this.j = 2;
            this.k = i2;
            this.e.notify();
        }
    }

    public final void b() {
    }

    public final dh e() {
        dh dhVar;
        synchronized (this.e) {
            dhVar = this.l;
        }
        return dhVar;
    }

    public final bab f() {
        return this.h;
    }

    public final void g() {
        a(this.a.a.c, this.c.a());
    }
}
