package com.google.android.gms.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.ae;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class qm implements ad, ae {
    private qn a;
    private final String b;
    private final String c;
    private final LinkedBlockingQueue<pb> d;
    private final HandlerThread e = new HandlerThread("GassClient");

    public qm(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        this.e.start();
        this.a = new qn(context, this.e.getLooper(), this, this);
        this.d = new LinkedBlockingQueue<>();
        this.a.d();
    }

    private final qs a() {
        try {
            return this.a.q();
        } catch (DeadObjectException | IllegalStateException e2) {
            return null;
        }
    }

    private final void b() {
        if (this.a == null) {
            return;
        }
        if (this.a.e() || this.a.f()) {
            this.a.g();
        }
    }

    private static pb c() {
        pb pbVar = new pb();
        pbVar.k = 32768L;
        return pbVar;
    }

    public final void a(int i) {
        try {
            this.d.put(c());
        } catch (InterruptedException e2) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        b();
        r4.e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0038 A[ExcHandler:  FINALLY, Splitter:B:2:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Bundle r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.qs r0 = r4.a()
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.qo r1 = new com.google.android.gms.internal.qo     // Catch:{ Throwable -> 0x0025, all -> 0x0038 }
            java.lang.String r2 = r4.b     // Catch:{ Throwable -> 0x0025, all -> 0x0038 }
            java.lang.String r3 = r4.c     // Catch:{ Throwable -> 0x0025, all -> 0x0038 }
            r1.<init>(r2, r3)     // Catch:{ Throwable -> 0x0025, all -> 0x0038 }
            com.google.android.gms.internal.qq r0 = r0.a(r1)     // Catch:{ Throwable -> 0x0025, all -> 0x0038 }
            com.google.android.gms.internal.pb r0 = r0.a()     // Catch:{ Throwable -> 0x0025, all -> 0x0038 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.pb> r1 = r4.d     // Catch:{ Throwable -> 0x0025, all -> 0x0038 }
            r1.put(r0)     // Catch:{ Throwable -> 0x0025, all -> 0x0038 }
            r4.b()
            android.os.HandlerThread r0 = r4.e
            r0.quit()
        L_0x0024:
            return
        L_0x0025:
            r0 = move-exception
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.pb> r0 = r4.d     // Catch:{ InterruptedException -> 0x0042, all -> 0x0038 }
            com.google.android.gms.internal.pb r1 = c()     // Catch:{ InterruptedException -> 0x0042, all -> 0x0038 }
            r0.put(r1)     // Catch:{ InterruptedException -> 0x0042, all -> 0x0038 }
        L_0x002f:
            r4.b()
            android.os.HandlerThread r0 = r4.e
            r0.quit()
            goto L_0x0024
        L_0x0038:
            r0 = move-exception
            r4.b()
            android.os.HandlerThread r1 = r4.e
            r1.quit()
            throw r0
        L_0x0042:
            r0 = move-exception
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.qm.a(android.os.Bundle):void");
    }

    public final void a(a aVar) {
        try {
            this.d.put(c());
        } catch (InterruptedException e2) {
        }
    }

    public final pb b(int i) {
        pb pbVar;
        try {
            pbVar = this.d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            pbVar = null;
        }
        return pbVar == null ? c() : pbVar;
    }
}
