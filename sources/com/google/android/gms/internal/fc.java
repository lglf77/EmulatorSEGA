package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.au;

final class fc {
    private final Object a;
    private volatile int b;
    private volatile long c;

    private fc() {
        this.a = new Object();
        this.b = fd.a;
        this.c = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(int r6, int r7) {
        /*
            r5 = this;
            r5.d()
            com.google.android.gms.common.util.d r0 = com.google.android.gms.ads.internal.au.k()
            long r0 = r0.a()
            java.lang.Object r2 = r5.a
            monitor-enter(r2)
            int r3 = r5.b     // Catch:{ all -> 0x0020 }
            if (r3 == r6) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
        L_0x0013:
            return
        L_0x0014:
            r5.b = r7     // Catch:{ all -> 0x0020 }
            int r3 = r5.b     // Catch:{ all -> 0x0020 }
            int r4 = com.google.android.gms.internal.fd.c     // Catch:{ all -> 0x0020 }
            if (r3 != r4) goto L_0x001e
            r5.c = r0     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            goto L_0x0013
        L_0x0020:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fc.a(int, int):void");
    }

    private final void d() {
        long a2 = au.k().a();
        synchronized (this.a) {
            if (this.b == fd.c) {
                if (this.c + ((Long) app.f().a(asw.cM)).longValue() <= a2) {
                    this.b = fd.a;
                }
            }
        }
    }

    public final void a(boolean z) {
        if (z) {
            a(fd.a, fd.b);
        } else {
            a(fd.b, fd.a);
        }
    }

    public final boolean a() {
        d();
        return this.b == fd.b;
    }

    public final boolean b() {
        d();
        return this.b == fd.c;
    }

    public final void c() {
        a(fd.b, fd.c);
    }
}
