package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

final class b implements Runnable {
    private final long a;
    private final PowerManager.WakeLock b = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
    private final FirebaseInstanceId c;
    private final v d;

    b(FirebaseInstanceId firebaseInstanceId, v vVar, long j) {
        this.c = firebaseInstanceId;
        this.d = vVar;
        this.a = j;
        this.b.setReferenceCounted(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "!"
            java.lang.String[] r2 = r7.split(r2)
            int r3 = r2.length
            r4 = 2
            if (r3 != r4) goto L_0x001b
            r3 = r2[r1]
            r4 = r2[r0]
            r2 = -1
            int r5 = r3.hashCode()     // Catch:{ IOException -> 0x0043 }
            switch(r5) {
                case 83: goto L_0x001c;
                case 84: goto L_0x0018;
                case 85: goto L_0x0026;
                default: goto L_0x0018;
            }     // Catch:{ IOException -> 0x0043 }
        L_0x0018:
            switch(r2) {
                case 0: goto L_0x0030;
                case 1: goto L_0x005f;
                default: goto L_0x001b;
            }     // Catch:{ IOException -> 0x0043 }
        L_0x001b:
            return r0
        L_0x001c:
            java.lang.String r5 = "S"
            boolean r3 = r3.equals(r5)     // Catch:{ IOException -> 0x0043 }
            if (r3 == 0) goto L_0x0018
            r2 = r1
            goto L_0x0018
        L_0x0026:
            java.lang.String r5 = "U"
            boolean r3 = r3.equals(r5)     // Catch:{ IOException -> 0x0043 }
            if (r3 == 0) goto L_0x0018
            r2 = r0
            goto L_0x0018
        L_0x0030:
            com.google.firebase.iid.FirebaseInstanceId r2 = r6.c     // Catch:{ IOException -> 0x0043 }
            r2.a((java.lang.String) r4)     // Catch:{ IOException -> 0x0043 }
            boolean r2 = com.google.firebase.iid.FirebaseInstanceId.g()     // Catch:{ IOException -> 0x0043 }
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r3 = "subscribe operation succeeded"
            android.util.Log.d(r2, r3)     // Catch:{ IOException -> 0x0043 }
            goto L_0x001b
        L_0x0043:
            r0 = move-exception
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r3 = "Topic sync failed: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r4 = r0.length()
            if (r4 == 0) goto L_0x0072
            java.lang.String r0 = r3.concat(r0)
        L_0x005a:
            android.util.Log.e(r2, r0)
            r0 = r1
            goto L_0x001b
        L_0x005f:
            com.google.firebase.iid.FirebaseInstanceId r2 = r6.c     // Catch:{ IOException -> 0x0043 }
            r2.b(r4)     // Catch:{ IOException -> 0x0043 }
            boolean r2 = com.google.firebase.iid.FirebaseInstanceId.g()     // Catch:{ IOException -> 0x0043 }
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r3 = "unsubscribe operation succeeded"
            android.util.Log.d(r2, r3)     // Catch:{ IOException -> 0x0043 }
            goto L_0x001b
        L_0x0072:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.b.a(java.lang.String):boolean");
    }

    private final boolean c() {
        aa d2 = this.c.d();
        if (d2 != null && !d2.b(this.d.b())) {
            return true;
        }
        try {
            String e = this.c.e();
            if (e == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (d2 != null && (d2 == null || e.equals(d2.a))) {
                return true;
            }
            Context a2 = a();
            Intent intent = new Intent("com.google.firebase.iid.TOKEN_REFRESH");
            Intent intent2 = new Intent("com.google.firebase.INSTANCE_ID_EVENT");
            intent2.setClass(a2, FirebaseInstanceIdReceiver.class);
            intent2.putExtra("wrapped_intent", intent);
            a2.sendBroadcast(intent2);
            return true;
        } catch (IOException | SecurityException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Token retrieval failed: ".concat(valueOf) : new String("Token retrieval failed: "));
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (a(r0) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean d() {
        /*
            r3 = this;
        L_0x0000:
            com.google.firebase.iid.FirebaseInstanceId r1 = r3.c
            monitor-enter(r1)
            com.google.firebase.iid.z r0 = com.google.firebase.iid.FirebaseInstanceId.f()     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = r0.a()     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "topic sync succeeded"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x0020 }
            r0 = 1
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
        L_0x0016:
            return r0
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            boolean r1 = r3.a(r0)
            if (r1 != 0) goto L_0x0023
            r0 = 0
            goto L_0x0016
        L_0x0020:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r0
        L_0x0023:
            com.google.firebase.iid.z r1 = com.google.firebase.iid.FirebaseInstanceId.f()
            r1.a(r0)
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.b.d():boolean");
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.c.b().a();
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void run() {
        boolean z = true;
        this.b.acquire();
        try {
            this.c.a(true);
            if (this.d.a() == 0) {
                z = false;
            }
            if (!z) {
                this.c.a(false);
            } else if (!b()) {
                new c(this).a();
                this.b.release();
            } else {
                if (!c() || !d()) {
                    this.c.a(this.a);
                } else {
                    this.c.a(false);
                }
                this.b.release();
            }
        } finally {
            this.b.release();
        }
    }
}
