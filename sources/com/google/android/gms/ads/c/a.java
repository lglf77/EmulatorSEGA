package com.google.android.gms.ads.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.a;
import com.google.android.gms.common.e;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.akw;
import com.google.android.gms.internal.akx;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class a {
    private e a;
    private akw b;
    private boolean c;
    private Object d;
    private b e;
    private final Context f;
    private boolean g;
    private long h;

    /* renamed from: com.google.android.gms.ads.c.a$a  reason: collision with other inner class name */
    public static final class C0015a {
        private final String a;
        private final boolean b;

        public C0015a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final String toString() {
            String str = this.a;
            return new StringBuilder(String.valueOf(str).length() + 7).append("{").append(str).append("}").append(this.b).toString();
        }
    }

    static class b extends Thread {
        CountDownLatch a = new CountDownLatch(1);
        boolean b = false;
        private WeakReference<a> c;
        private long d;

        public b(a aVar, long j) {
            this.c = new WeakReference<>(aVar);
            this.d = j;
            start();
        }

        private final void a() {
            a aVar = (a) this.c.get();
            if (aVar != null) {
                aVar.d();
                this.b = true;
            }
        }

        public final void run() {
            try {
                if (!this.a.await(this.d, TimeUnit.MILLISECONDS)) {
                    a();
                }
            } catch (InterruptedException e) {
                a();
            }
        }
    }

    public a(Context context) {
        this(context, 30000, false, false);
    }

    public a(Context context, long j, boolean z, boolean z2) {
        this.d = new Object();
        y.a(context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            this.f = applicationContext != null ? applicationContext : context;
        } else {
            this.f = context;
        }
        this.c = false;
        this.h = j;
        this.g = z2;
    }

    public static C0015a a(Context context) {
        c cVar = new c(context);
        boolean a2 = cVar.a("gads:ad_id_app_context:enabled", false);
        float a3 = cVar.a("gads:ad_id_app_context:ping_ratio", 0.0f);
        String a4 = cVar.a("gads:ad_id_use_shared_preference:experiment_id", "");
        a aVar = new a(context, -1, a2, cVar.a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.b(false);
            C0015a b2 = aVar.b();
            aVar.a(b2, a2, a3, SystemClock.elapsedRealtime() - elapsedRealtime, a4, (Throwable) null);
            aVar.d();
            return b2;
        } catch (Throwable th) {
            aVar.d();
            throw th;
        }
    }

    private static e a(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            switch (i.a().a(context)) {
                case a.b.AdsAttrs_adSize:
                case 2:
                    String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                    e eVar = new e();
                    Intent intent = new Intent(str);
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (com.google.android.gms.common.a.a.a().a(context, intent, eVar, 1)) {
                            return eVar;
                        }
                        throw new IOException("Connection failure");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                default:
                    throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new com.google.android.gms.common.b(9);
        }
    }

    private static akw a(Context context, e eVar) {
        try {
            return akx.a(eVar.a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e2) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static void a(boolean z) {
    }

    private final boolean a(C0015a aVar, boolean z, float f2, long j, String str, Throwable th) {
        if (Math.random() > ((double) f2)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", z ? "1" : "0");
        if (aVar != null) {
            hashMap.put("limit_ad_tracking", aVar.b() ? "1" : "0");
        }
        if (!(aVar == null || aVar.a() == null)) {
            hashMap.put("ad_id_size", Integer.toString(aVar.a().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new b(this, hashMap).start();
        return true;
    }

    private final void b(boolean z) {
        y.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                d();
            }
            this.a = a(this.f, this.g);
            this.b = a(this.f, this.a);
            this.c = true;
            if (z) {
                e();
            }
        }
    }

    public static boolean b(Context context) {
        c cVar = new c(context);
        a aVar = new a(context, -1, cVar.a("gads:ad_id_app_context:enabled", false), cVar.a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            aVar.b(false);
            return aVar.c();
        } finally {
            aVar.d();
        }
    }

    private final void e() {
        synchronized (this.d) {
            if (this.e != null) {
                this.e.a.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException e2) {
                }
            }
            if (this.h > 0) {
                this.e = new b(this, this.h);
            }
        }
    }

    public void a() {
        b(true);
    }

    public C0015a b() {
        C0015a aVar;
        y.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.c) {
                synchronized (this.d) {
                    if (this.e == null || !this.e.b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    b(false);
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
            y.a(this.a);
            y.a(this.b);
            aVar = new C0015a(this.b.a(), this.b.a(true));
        }
        e();
        return aVar;
    }

    public boolean c() {
        boolean b2;
        y.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.c) {
                synchronized (this.d) {
                    if (this.e == null || !this.e.b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    b(false);
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
            y.a(this.a);
            y.a(this.b);
            b2 = this.b.b();
        }
        e();
        return b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.y.c(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x000e
            com.google.android.gms.common.e r0 = r3.a     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
        L_0x000f:
            return
        L_0x0010:
            boolean r0 = r3.c     // Catch:{ Throwable -> 0x002c }
            if (r0 == 0) goto L_0x001e
            com.google.android.gms.common.a.a.a()     // Catch:{ Throwable -> 0x002c }
            android.content.Context r0 = r3.f     // Catch:{ Throwable -> 0x002c }
            com.google.android.gms.common.e r1 = r3.a     // Catch:{ Throwable -> 0x002c }
            r0.unbindService(r1)     // Catch:{ Throwable -> 0x002c }
        L_0x001e:
            r0 = 0
            r3.c = r0     // Catch:{ all -> 0x0029 }
            r0 = 0
            r3.b = r0     // Catch:{ all -> 0x0029 }
            r0 = 0
            r3.a = r0     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            goto L_0x000f
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            throw r0
        L_0x002c:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0029 }
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.c.a.d():void");
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        d();
        super.finalize();
    }
}
