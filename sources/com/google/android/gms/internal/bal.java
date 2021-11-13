package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@bfk
public final class bal implements baa {
    private final v a;
    private final bar b;
    private final Context c;
    private final bac d;
    private final boolean e;
    /* access modifiers changed from: private */
    public final long f;
    /* access modifiers changed from: private */
    public final long g;
    private final int h;
    /* access modifiers changed from: private */
    public final Object i = new Object();
    /* access modifiers changed from: private */
    public boolean j = false;
    /* access modifiers changed from: private */
    public final Map<kh<bai>, baf> k = new HashMap();
    private final boolean l;
    private final String m;
    private List<bai> n = new ArrayList();
    private final boolean o;

    public bal(Context context, v vVar, bar bar, bac bac, boolean z, boolean z2, String str, long j2, long j3, int i2, boolean z3) {
        this.c = context;
        this.a = vVar;
        this.b = bar;
        this.d = bac;
        this.e = z;
        this.l = z2;
        this.m = str;
        this.f = j2;
        this.g = j3;
        this.h = 2;
        this.o = z3;
    }

    private final void a(kh<bai> khVar) {
        gw.a.post(new ban(this, khVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r2.hasNext() == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r0 = r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1 = (com.google.android.gms.internal.bai) r0.get();
        r4.n.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r1.a != 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        a((com.google.android.gms.internal.kh<com.google.android.gms.internal.bai>) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        com.google.android.gms.internal.fn.c("Exception while processing an adapter; continuing with other adapters", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        a((com.google.android.gms.internal.kh<com.google.android.gms.internal.bai>) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return new com.google.android.gms.internal.bai(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r2 = r5.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.bai b(java.util.List<com.google.android.gms.internal.kh<com.google.android.gms.internal.bai>> r5) {
        /*
            r4 = this;
            java.lang.Object r2 = r4.i
            monitor-enter(r2)
            boolean r0 = r4.j     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.bai r1 = new com.google.android.gms.internal.bai     // Catch:{ all -> 0x003c }
            r0 = -1
            r1.<init>(r0)     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
        L_0x000e:
            return r1
        L_0x000f:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            java.util.Iterator r2 = r5.iterator()
        L_0x0014:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r2.next()
            com.google.android.gms.internal.kh r0 = (com.google.android.gms.internal.kh) r0
            java.lang.Object r1 = r0.get()     // Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
            com.google.android.gms.internal.bai r1 = (com.google.android.gms.internal.bai) r1     // Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
            java.util.List<com.google.android.gms.internal.bai> r3 = r4.n     // Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
            r3.add(r1)     // Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
            if (r1 == 0) goto L_0x0014
            int r3 = r1.a     // Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
            if (r3 != 0) goto L_0x0014
            r4.a((com.google.android.gms.internal.kh<com.google.android.gms.internal.bai>) r0)     // Catch:{ InterruptedException -> 0x0035, ExecutionException -> 0x004a }
            goto L_0x000e
        L_0x0035:
            r0 = move-exception
        L_0x0036:
            java.lang.String r1 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.fn.c(r1, r0)
            goto L_0x0014
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        L_0x003f:
            r0 = 0
            r4.a((com.google.android.gms.internal.kh<com.google.android.gms.internal.bai>) r0)
            com.google.android.gms.internal.bai r1 = new com.google.android.gms.internal.bai
            r0 = 1
            r1.<init>(r0)
            goto L_0x000e
        L_0x004a:
            r0 = move-exception
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bal.b(java.util.List):com.google.android.gms.internal.bai");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r0 = r15.d.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r8 = r16.iterator();
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r8.hasNext() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r0 = r8.next();
        r10 = com.google.android.gms.ads.internal.au.k().a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r6 != 0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r0.isDone() == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        r1 = (com.google.android.gms.internal.bai) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        r15.n.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r1 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r1.a != 0) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        r5 = r1.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (r5 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r5.a() <= r4) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        r2 = r5.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        r14 = r1;
        r1 = r0;
        r0 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        r6 = java.lang.Math.max(r6 - (com.google.android.gms.ads.internal.au.k().a() - r10), 0);
        r3 = r1;
        r4 = r2;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        r0 = 10000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r1 = (com.google.android.gms.internal.bai) r0.get(r6, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        com.google.android.gms.internal.fn.c("Exception while processing an adapter; continuing with other adapters", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0093, code lost:
        r6 = java.lang.Math.max(r6 - (com.google.android.gms.ads.internal.au.k().a() - r10), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a7, code lost:
        java.lang.Math.max(r6 - (com.google.android.gms.ads.internal.au.k().a() - r10), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b8, code lost:
        a((com.google.android.gms.internal.kh<com.google.android.gms.internal.bai>) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bb, code lost:
        if (r2 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cb, code lost:
        r0 = r2;
        r1 = r3;
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return new com.google.android.gms.internal.bai(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r4 = -1;
        r3 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r15.d.m == -1) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.bai c(java.util.List<com.google.android.gms.internal.kh<com.google.android.gms.internal.bai>> r16) {
        /*
            r15 = this;
            java.lang.Object r1 = r15.i
            monitor-enter(r1)
            boolean r0 = r15.j     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.bai r2 = new com.google.android.gms.internal.bai     // Catch:{ all -> 0x007e }
            r0 = -1
            r2.<init>(r0)     // Catch:{ all -> 0x007e }
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
        L_0x000e:
            return r2
        L_0x000f:
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            r4 = -1
            r3 = 0
            r2 = 0
            com.google.android.gms.internal.bac r0 = r15.d
            long r0 = r0.m
            r6 = -1
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0081
            com.google.android.gms.internal.bac r0 = r15.d
            long r0 = r0.m
        L_0x0021:
            java.util.Iterator r8 = r16.iterator()
            r6 = r0
        L_0x0026:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r0 = r8.next()
            com.google.android.gms.internal.kh r0 = (com.google.android.gms.internal.kh) r0
            com.google.android.gms.common.util.d r1 = com.google.android.gms.ads.internal.au.k()
            long r10 = r1.a()
            r12 = 0
            int r1 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x0084
            boolean r1 = r0.isDone()     // Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
            if (r1 == 0) goto L_0x0084
            java.lang.Object r1 = r0.get()     // Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
            com.google.android.gms.internal.bai r1 = (com.google.android.gms.internal.bai) r1     // Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
        L_0x004c:
            java.util.List<com.google.android.gms.internal.bai> r5 = r15.n     // Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
            r5.add(r1)     // Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
            if (r1 == 0) goto L_0x00cb
            int r5 = r1.a     // Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
            if (r5 != 0) goto L_0x00cb
            com.google.android.gms.internal.bbb r5 = r1.f     // Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
            if (r5 == 0) goto L_0x00cb
            int r9 = r5.a()     // Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
            if (r9 <= r4) goto L_0x00cb
            int r2 = r5.a()     // Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
            r14 = r1
            r1 = r0
            r0 = r14
        L_0x0068:
            com.google.android.gms.common.util.d r3 = com.google.android.gms.ads.internal.au.k()
            long r4 = r3.a()
            long r4 = r4 - r10
            long r4 = r6 - r4
            r6 = 0
            long r4 = java.lang.Math.max(r4, r6)
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            goto L_0x0026
        L_0x007e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            throw r0
        L_0x0081:
            r0 = 10000(0x2710, double:4.9407E-320)
            goto L_0x0021
        L_0x0084:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
            java.lang.Object r1 = r0.get(r6, r1)     // Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
            com.google.android.gms.internal.bai r1 = (com.google.android.gms.internal.bai) r1     // Catch:{ InterruptedException -> 0x00c5, ExecutionException -> 0x00c7, RemoteException -> 0x008d, TimeoutException -> 0x00c9 }
            goto L_0x004c
        L_0x008d:
            r0 = move-exception
        L_0x008e:
            java.lang.String r1 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.fn.c(r1, r0)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.common.util.d r0 = com.google.android.gms.ads.internal.au.k()
            long r0 = r0.a()
            long r0 = r0 - r10
            long r0 = r6 - r0
            r6 = 0
            long r0 = java.lang.Math.max(r0, r6)
            r6 = r0
            goto L_0x0026
        L_0x00a6:
            r0 = move-exception
            com.google.android.gms.common.util.d r1 = com.google.android.gms.ads.internal.au.k()
            long r2 = r1.a()
            long r2 = r2 - r10
            long r2 = r6 - r2
            r4 = 0
            java.lang.Math.max(r2, r4)
            throw r0
        L_0x00b8:
            r15.a((com.google.android.gms.internal.kh<com.google.android.gms.internal.bai>) r3)
            if (r2 != 0) goto L_0x000e
            com.google.android.gms.internal.bai r2 = new com.google.android.gms.internal.bai
            r0 = 1
            r2.<init>(r0)
            goto L_0x000e
        L_0x00c5:
            r0 = move-exception
            goto L_0x008e
        L_0x00c7:
            r0 = move-exception
            goto L_0x008e
        L_0x00c9:
            r0 = move-exception
            goto L_0x008e
        L_0x00cb:
            r0 = r2
            r1 = r3
            r2 = r4
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bal.c(java.util.List):com.google.android.gms.internal.bai");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.bai a(java.util.List<com.google.android.gms.internal.bab> r23) {
        /*
            r22 = this;
            java.lang.String r2 = "Starting mediation."
            com.google.android.gms.internal.fn.b(r2)
            java.util.concurrent.ExecutorService r18 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            r0 = r22
            com.google.android.gms.internal.v r2 = r0.a
            com.google.android.gms.internal.apc r2 = r2.d
            r3 = 2
            int[] r3 = new int[r3]
            com.google.android.gms.internal.apc[] r4 = r2.g
            if (r4 == 0) goto L_0x00fc
            com.google.android.gms.ads.internal.au.v()
            r0 = r22
            java.lang.String r4 = r0.m
            boolean r4 = com.google.android.gms.internal.bak.a((java.lang.String) r4, (int[]) r3)
            if (r4 == 0) goto L_0x00fc
            r4 = 0
            r4 = r3[r4]
            r5 = 1
            r5 = r3[r5]
            com.google.android.gms.internal.apc[] r6 = r2.g
            int r7 = r6.length
            r3 = 0
        L_0x0032:
            if (r3 >= r7) goto L_0x00fc
            r9 = r6[r3]
            int r8 = r9.e
            if (r4 != r8) goto L_0x00d8
            int r8 = r9.b
            if (r5 != r8) goto L_0x00d8
        L_0x003e:
            java.util.Iterator r20 = r23.iterator()
        L_0x0042:
            boolean r2 = r20.hasNext()
            if (r2 == 0) goto L_0x00e3
            java.lang.Object r7 = r20.next()
            com.google.android.gms.internal.bab r7 = (com.google.android.gms.internal.bab) r7
            java.lang.String r3 = "Trying mediation network: "
            java.lang.String r2 = r7.b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            if (r4 == 0) goto L_0x00dc
            java.lang.String r2 = r3.concat(r2)
        L_0x0060:
            com.google.android.gms.internal.fn.d(r2)
            java.util.List<java.lang.String> r2 = r7.c
            java.util.Iterator r21 = r2.iterator()
        L_0x0069:
            boolean r2 = r21.hasNext()
            if (r2 == 0) goto L_0x0042
            java.lang.Object r4 = r21.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.internal.baf r2 = new com.google.android.gms.internal.baf
            r0 = r22
            android.content.Context r3 = r0.c
            r0 = r22
            com.google.android.gms.internal.bar r5 = r0.b
            r0 = r22
            com.google.android.gms.internal.bac r6 = r0.d
            r0 = r22
            com.google.android.gms.internal.v r8 = r0.a
            com.google.android.gms.internal.aoy r8 = r8.c
            r0 = r22
            com.google.android.gms.internal.v r10 = r0.a
            com.google.android.gms.internal.jp r10 = r10.k
            r0 = r22
            boolean r11 = r0.e
            r0 = r22
            boolean r12 = r0.l
            r0 = r22
            com.google.android.gms.internal.v r13 = r0.a
            com.google.android.gms.internal.auv r13 = r13.y
            r0 = r22
            com.google.android.gms.internal.v r14 = r0.a
            java.util.List<java.lang.String> r14 = r14.n
            r0 = r22
            com.google.android.gms.internal.v r15 = r0.a
            java.util.List<java.lang.String> r15 = r15.z
            r0 = r22
            com.google.android.gms.internal.v r0 = r0.a
            r16 = r0
            r0 = r16
            java.util.List<java.lang.String> r0 = r0.X
            r16 = r0
            r0 = r22
            boolean r0 = r0.o
            r17 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.google.android.gms.internal.bam r3 = new com.google.android.gms.internal.bam
            r0 = r22
            r3.<init>(r0, r2)
            r0 = r18
            com.google.android.gms.internal.kh r3 = com.google.android.gms.internal.gq.a((java.util.concurrent.ExecutorService) r0, r3)
            r0 = r22
            java.util.Map<com.google.android.gms.internal.kh<com.google.android.gms.internal.bai>, com.google.android.gms.internal.baf> r4 = r0.k
            r4.put(r3, r2)
            r0 = r19
            r0.add(r3)
            goto L_0x0069
        L_0x00d8:
            int r3 = r3 + 1
            goto L_0x0032
        L_0x00dc:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x0060
        L_0x00e3:
            r0 = r22
            int r2 = r0.h
            switch(r2) {
                case 2: goto L_0x00f3;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            r0 = r22
            r1 = r19
            com.google.android.gms.internal.bai r2 = r0.b((java.util.List<com.google.android.gms.internal.kh<com.google.android.gms.internal.bai>>) r1)
        L_0x00f2:
            return r2
        L_0x00f3:
            r0 = r22
            r1 = r19
            com.google.android.gms.internal.bai r2 = r0.c((java.util.List<com.google.android.gms.internal.kh<com.google.android.gms.internal.bai>>) r1)
            goto L_0x00f2
        L_0x00fc:
            r9 = r2
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.bal.a(java.util.List):com.google.android.gms.internal.bai");
    }

    public final void a() {
        synchronized (this.i) {
            this.j = true;
            for (baf a2 : this.k.values()) {
                a2.a();
            }
        }
    }

    public final List<bai> b() {
        return this.n;
    }
}
