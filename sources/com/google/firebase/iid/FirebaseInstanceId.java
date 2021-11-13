package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.Keep;
import android.support.v4.c.a;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseInstanceId {
    private static final long a = TimeUnit.HOURS.toSeconds(8);
    private static Map<String, FirebaseInstanceId> b = new a();
    private static z c;
    private static ScheduledThreadPoolExecutor d;
    private final com.google.firebase.a e;
    private final v f;
    private final w g;
    private KeyPair h;
    private boolean i = false;

    private FirebaseInstanceId(com.google.firebase.a aVar) {
        this.e = aVar;
        if (v.a(aVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        this.f = new v(aVar.a());
        this.g = new w(aVar.a(), this.f);
        aa d2 = d();
        if (d2 == null || d2.b(this.f.b()) || c.a() != null) {
            j();
        }
    }

    public static FirebaseInstanceId a() {
        return getInstance(com.google.firebase.a.d());
    }

    private final String a(String str, String str2, Bundle bundle) {
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("appid", c());
        bundle.putString("gmp_app_id", this.e.c().a());
        bundle.putString("gmsv", Integer.toString(this.f.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f.b());
        bundle.putString("app_ver_name", this.f.c());
        bundle.putString("cliv", "fiid-11910000");
        Bundle a2 = this.g.a(bundle);
        if (a2 == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = a2.getString("registration_id");
        if (string == null && (string = a2.getString("unregistered")) == null) {
            String string2 = a2.getString("error");
            if (string2 != null) {
                throw new IOException(string2);
            }
            String valueOf = String.valueOf(a2);
            Log.w("FirebaseInstanceId", new StringBuilder(String.valueOf(valueOf).length() + 20).append("Unexpected response ").append(valueOf).toString(), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } else if (!"RST".equals(string) && !string.startsWith("RST|")) {
            return string;
        } else {
            h();
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static void a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (d == null) {
                d = new ScheduledThreadPoolExecutor(1);
            }
            d.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    static z f() {
        return c;
    }

    static boolean g() {
        return Log.isLoggable("FirebaseInstanceId", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3));
    }

    @Keep
    public static synchronized FirebaseInstanceId getInstance(com.google.firebase.a aVar) {
        FirebaseInstanceId firebaseInstanceId;
        synchronized (FirebaseInstanceId.class) {
            firebaseInstanceId = b.get(aVar.c().a());
            if (firebaseInstanceId == null) {
                if (c == null) {
                    c = new z(aVar.a());
                }
                firebaseInstanceId = new FirebaseInstanceId(aVar);
                b.put(aVar.c().a(), firebaseInstanceId);
            }
        }
        return firebaseInstanceId;
    }

    private final synchronized void j() {
        if (!this.i) {
            a(0);
        }
    }

    private final void k() {
        c.c("");
        this.h = null;
    }

    public String a(String str, String str2) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        aa a2 = c.a("", str, str2);
        if (a2 != null && !a2.b(this.f.b())) {
            return a2.a;
        }
        String a3 = a(str, str2, new Bundle());
        if (a3 == null) {
            return a3;
        }
        c.a("", str, str2, a3, this.f.b());
        return a3;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(long j) {
        a((Runnable) new b(this, this.f, Math.min(Math.max(30, j << 1), a)), j);
        this.i = true;
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        aa d2 = d();
        if (d2 == null || d2.b(this.f.b())) {
            throw new IOException("token not available");
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str);
        bundle.putString("gcm.topic", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        String str2 = d2.a;
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str);
        a(str2, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(boolean z) {
        this.i = z;
    }

    /* access modifiers changed from: package-private */
    public final com.google.firebase.a b() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        aa d2 = d();
        if (d2 == null || d2.b(this.f.b())) {
            throw new IOException("token not available");
        }
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str);
        bundle.putString("gcm.topic", valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        bundle.putString("delete", "1");
        String str2 = d2.a;
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str);
        a(str2, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle);
    }

    public String c() {
        if (this.h == null) {
            this.h = c.e("");
        }
        if (this.h == null) {
            this.h = c.b("");
        }
        return v.a(this.h);
    }

    /* access modifiers changed from: package-private */
    public final aa d() {
        return c.a("", v.a(this.e), "*");
    }

    /* access modifiers changed from: package-private */
    public final String e() {
        return a(v.a(this.e), "*");
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        c.b();
        k();
        j();
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        c.d("");
        j();
    }
}
