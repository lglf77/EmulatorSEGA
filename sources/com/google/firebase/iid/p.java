package com.google.firebase.iid;

final /* synthetic */ class p implements Runnable {
    private final m a;

    p(m mVar) {
        this.a = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r3 = java.lang.String.valueOf(r0);
        android.util.Log.d("MessengerIpcClient", new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 8).append("Sending ").append(r3).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        r2 = r1.f.b;
        r3 = r1.b;
        r4 = android.os.Message.obtain();
        r4.what = r0.c;
        r4.arg1 = r0.a;
        r4.replyTo = r3;
        r3 = new android.os.Bundle();
        r3.putBoolean("oneWay", r0.a());
        r3.putString("pkg", r2.getPackageName());
        r3.putBundle("data", r0.d);
        r4.setData(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1.c.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00aa, code lost:
        r1.a(2, r0.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            r7 = 2
            com.google.firebase.iid.m r1 = r8.a
        L_0x0003:
            monitor-enter(r1)
            int r0 = r1.a     // Catch:{ all -> 0x0017 }
            if (r0 == r7) goto L_0x000a
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
        L_0x0009:
            return
        L_0x000a:
            java.util.Queue<com.google.firebase.iid.s<?>> r0 = r1.d     // Catch:{ all -> 0x0017 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x001a
            r1.a()     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x0009
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r0
        L_0x001a:
            java.util.Queue<com.google.firebase.iid.s<?>> r0 = r1.d     // Catch:{ all -> 0x0017 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0017 }
            com.google.firebase.iid.s r0 = (com.google.firebase.iid.s) r0     // Catch:{ all -> 0x0017 }
            android.util.SparseArray<com.google.firebase.iid.s<?>> r2 = r1.e     // Catch:{ all -> 0x0017 }
            int r3 = r0.a     // Catch:{ all -> 0x0017 }
            r2.put(r3, r0)     // Catch:{ all -> 0x0017 }
            com.google.firebase.iid.k r2 = r1.f     // Catch:{ all -> 0x0017 }
            java.util.concurrent.ScheduledExecutorService r2 = r2.c     // Catch:{ all -> 0x0017 }
            com.google.firebase.iid.q r3 = new com.google.firebase.iid.q     // Catch:{ all -> 0x0017 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0017 }
            r4 = 30
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0017 }
            r2.schedule(r3, r4, r6)     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "MessengerIpcClient"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L_0x006b
            java.lang.String r2 = "MessengerIpcClient"
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Sending "
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r2, r3)
        L_0x006b:
            com.google.firebase.iid.k r2 = r1.f
            android.content.Context r2 = r2.b
            android.os.Messenger r3 = r1.b
            android.os.Message r4 = android.os.Message.obtain()
            int r5 = r0.c
            r4.what = r5
            int r5 = r0.a
            r4.arg1 = r5
            r4.replyTo = r3
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r5 = "oneWay"
            boolean r6 = r0.a()
            r3.putBoolean(r5, r6)
            java.lang.String r5 = "pkg"
            java.lang.String r2 = r2.getPackageName()
            r3.putString(r5, r2)
            java.lang.String r2 = "data"
            android.os.Bundle r0 = r0.d
            r3.putBundle(r2, r0)
            r4.setData(r3)
            com.google.firebase.iid.r r0 = r1.c     // Catch:{ RemoteException -> 0x00a9 }
            r0.a(r4)     // Catch:{ RemoteException -> 0x00a9 }
            goto L_0x0003
        L_0x00a9:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r1.a(r7, r0)
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.p.run():void");
    }
}
