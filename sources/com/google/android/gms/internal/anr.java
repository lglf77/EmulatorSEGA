package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.au;

@bfk
public final class anr {
    private final Runnable a = new ans(this);
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public any c;
    private Context d;
    /* access modifiers changed from: private */
    public aoc e;

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r6 = this;
            java.lang.Object r1 = r6.b
            monitor-enter(r1)
            android.content.Context r0 = r6.d     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x000b
            com.google.android.gms.internal.any r0 = r6.c     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x000d
        L_0x000b:
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
        L_0x000c:
            return
        L_0x000d:
            com.google.android.gms.internal.anu r0 = new com.google.android.gms.internal.anu     // Catch:{ all -> 0x002f }
            r0.<init>(r6)     // Catch:{ all -> 0x002f }
            com.google.android.gms.internal.anv r2 = new com.google.android.gms.internal.anv     // Catch:{ all -> 0x002f }
            r2.<init>(r6)     // Catch:{ all -> 0x002f }
            com.google.android.gms.internal.any r3 = new com.google.android.gms.internal.any     // Catch:{ all -> 0x002f }
            android.content.Context r4 = r6.d     // Catch:{ all -> 0x002f }
            com.google.android.gms.internal.iq r5 = com.google.android.gms.ads.internal.au.s()     // Catch:{ all -> 0x002f }
            android.os.Looper r5 = r5.a()     // Catch:{ all -> 0x002f }
            r3.<init>(r4, r5, r0, r2)     // Catch:{ all -> 0x002f }
            r6.c = r3     // Catch:{ all -> 0x002f }
            com.google.android.gms.internal.any r0 = r6.c     // Catch:{ all -> 0x002f }
            r0.d()     // Catch:{ all -> 0x002f }
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            goto L_0x000c
        L_0x002f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.anr.b():void");
    }

    /* access modifiers changed from: private */
    public final void c() {
        synchronized (this.b) {
            if (this.c != null) {
                if (this.c.e() || this.c.f()) {
                    this.c.g();
                }
                this.c = null;
                this.e = null;
                Binder.flushPendingCommands();
            }
        }
    }

    public final anw a(anz anz) {
        anw anw;
        synchronized (this.b) {
            if (this.e == null) {
                anw = new anw();
            } else {
                try {
                    anw = this.e.a(anz);
                } catch (RemoteException e2) {
                    fn.b("Unable to call into cache service.", e2);
                    anw = new anw();
                }
            }
        }
        return anw;
    }

    public final void a() {
        if (((Boolean) app.f().a(asw.cp)).booleanValue()) {
            synchronized (this.b) {
                b();
                au.e();
                gw.a.removeCallbacks(this.a);
                au.e();
                gw.a.postDelayed(this.a, ((Long) app.f().a(asw.cq)).longValue());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
        L_0x0002:
            return
        L_0x0003:
            java.lang.Object r1 = r3.b
            monitor-enter(r1)
            android.content.Context r0 = r3.d     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            goto L_0x0002
        L_0x000c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            throw r0
        L_0x000f:
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ all -> 0x000c }
            r3.d = r0     // Catch:{ all -> 0x000c }
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.co     // Catch:{ all -> 0x000c }
            com.google.android.gms.internal.asu r2 = com.google.android.gms.internal.app.f()     // Catch:{ all -> 0x000c }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x000c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x000c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x002c
            r3.b()     // Catch:{ all -> 0x000c }
        L_0x002a:
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            goto L_0x0002
        L_0x002c:
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.cn     // Catch:{ all -> 0x000c }
            com.google.android.gms.internal.asu r2 = com.google.android.gms.internal.app.f()     // Catch:{ all -> 0x000c }
            java.lang.Object r0 = r2.a(r0)     // Catch:{ all -> 0x000c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x000c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x002a
            com.google.android.gms.internal.ant r0 = new com.google.android.gms.internal.ant     // Catch:{ all -> 0x000c }
            r0.<init>(r3)     // Catch:{ all -> 0x000c }
            com.google.android.gms.internal.amt r2 = com.google.android.gms.ads.internal.au.h()     // Catch:{ all -> 0x000c }
            r2.a((com.google.android.gms.internal.amw) r0)     // Catch:{ all -> 0x000c }
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.anr.a(android.content.Context):void");
    }
}
