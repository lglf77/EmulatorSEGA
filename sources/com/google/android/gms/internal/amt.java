package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;

@bfk
public final class amt {
    private final Object a = new Object();
    private amu b = null;
    private boolean c = false;

    public final Activity a() {
        Activity a2;
        synchronized (this.a) {
            a2 = this.b != null ? this.b.a() : null;
        }
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.Object r2 = r4.a
            monitor-enter(r2)
            boolean r0 = r4.c     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x0048
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.au     // Catch:{ all -> 0x0032 }
            com.google.android.gms.internal.asu r1 = com.google.android.gms.internal.app.f()     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x0032 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0032 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x001b
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
        L_0x001a:
            return
        L_0x001b:
            r1 = 0
            android.content.Context r0 = r5.getApplicationContext()     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x0023
            r0 = r5
        L_0x0023:
            boolean r3 = r0 instanceof android.app.Application     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x004a
            android.app.Application r0 = (android.app.Application) r0     // Catch:{ all -> 0x0032 }
        L_0x0029:
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "Can not cast Context to Application"
            com.google.android.gms.internal.fn.e(r0)     // Catch:{ all -> 0x0032 }
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            goto L_0x001a
        L_0x0032:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            throw r0
        L_0x0035:
            com.google.android.gms.internal.amu r1 = r4.b     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0040
            com.google.android.gms.internal.amu r1 = new com.google.android.gms.internal.amu     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            r4.b = r1     // Catch:{ all -> 0x0032 }
        L_0x0040:
            com.google.android.gms.internal.amu r1 = r4.b     // Catch:{ all -> 0x0032 }
            r1.a((android.app.Application) r0, (android.content.Context) r5)     // Catch:{ all -> 0x0032 }
            r0 = 1
            r4.c = r0     // Catch:{ all -> 0x0032 }
        L_0x0048:
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            goto L_0x001a
        L_0x004a:
            r0 = r1
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.amt.a(android.content.Context):void");
    }

    public final void a(amw amw) {
        synchronized (this.a) {
            if (((Boolean) app.f().a(asw.au)).booleanValue()) {
                if (this.b == null) {
                    this.b = new amu();
                }
                this.b.a(amw);
            }
        }
    }

    public final Context b() {
        Context b2;
        synchronized (this.a) {
            b2 = this.b != null ? this.b.b() : null;
        }
        return b2;
    }
}
