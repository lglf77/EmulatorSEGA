package com.google.android.gms.internal;

final /* synthetic */ class jz implements Runnable {
    private final ks a;
    private final jt b;
    private final kh c;

    jz(ks ksVar, jt jtVar, kh khVar) {
        this.a = ksVar;
        this.b = jtVar;
        this.c = khVar;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            com.google.android.gms.internal.ks r2 = r3.a
            com.google.android.gms.internal.jt r0 = r3.b
            com.google.android.gms.internal.kh r1 = r3.c
            java.lang.Object r1 = r1.get()     // Catch:{ CancellationException -> 0x0012, ExecutionException -> 0x0018, InterruptedException -> 0x0025, Exception -> 0x0031 }
            java.lang.Object r0 = r0.a(r1)     // Catch:{ CancellationException -> 0x0012, ExecutionException -> 0x0018, InterruptedException -> 0x0025, Exception -> 0x0031 }
            r2.b(r0)     // Catch:{ CancellationException -> 0x0012, ExecutionException -> 0x0018, InterruptedException -> 0x0025, Exception -> 0x0031 }
        L_0x0011:
            return
        L_0x0012:
            r0 = move-exception
            r0 = 1
            r2.cancel(r0)
            goto L_0x0011
        L_0x0018:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 != 0) goto L_0x0023
        L_0x001f:
            r2.a(r0)
            goto L_0x0011
        L_0x0023:
            r0 = r1
            goto L_0x001f
        L_0x0025:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            r2.a(r0)
            goto L_0x0011
        L_0x0031:
            r0 = move-exception
            r2.a(r0)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jz.run():void");
    }
}
