package com.google.android.gms.internal;

@bfk
public final class bae extends baz {
    private final Object a = new Object();
    private baj b;
    private bad c;

    public final void a() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.O();
            }
        }
    }

    public final void a(int i) {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.a(i == 3 ? 1 : 2);
                this.b = null;
            }
        }
    }

    public final void a(awe awe, String str) {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.a(awe, str);
            }
        }
    }

    public final void a(bad bad) {
        synchronized (this.a) {
            this.c = bad;
        }
    }

    public final void a(baj baj) {
        synchronized (this.a) {
            this.b = baj;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.internal.bbb r4) {
        /*
            r3 = this;
            java.lang.Object r1 = r3.a
            monitor-enter(r1)
            com.google.android.gms.internal.baj r0 = r3.b     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.baj r0 = r3.b     // Catch:{ all -> 0x001d }
            r2 = 0
            r0.a(r2, r4)     // Catch:{ all -> 0x001d }
            r0 = 0
            r3.b = r0     // Catch:{ all -> 0x001d }
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x0011:
            return
        L_0x0012:
            com.google.android.gms.internal.bad r0 = r3.c     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001b
            com.google.android.gms.internal.bad r0 = r3.c     // Catch:{ all -> 0x001d }
            r0.V()     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x0011
        L_0x001d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bae.a(com.google.android.gms.internal.bbb):void");
    }

    public final void a(String str, String str2) {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.b(str, str2);
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.S();
            }
        }
    }

    public final void c() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.T();
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.U();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r1 = r3.a
            monitor-enter(r1)
            com.google.android.gms.internal.baj r0 = r3.b     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.baj r0 = r3.b     // Catch:{ all -> 0x001d }
            r2 = 0
            r0.a(r2)     // Catch:{ all -> 0x001d }
            r0 = 0
            r3.b = r0     // Catch:{ all -> 0x001d }
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
        L_0x0011:
            return
        L_0x0012:
            com.google.android.gms.internal.bad r0 = r3.c     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001b
            com.google.android.gms.internal.bad r0 = r3.c     // Catch:{ all -> 0x001d }
            r0.V()     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            goto L_0x0011
        L_0x001d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bae.e():void");
    }

    public final void f() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.P();
            }
        }
    }

    public final void g() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.Q();
            }
        }
    }
}
