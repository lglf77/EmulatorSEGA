package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.c.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

final class su extends uk {
    static final Pair<String, Long> a = new Pair<>("", 0L);
    public final sz b = new sz(this, "health_monitor", Math.max(0, rz.e.b().longValue()));
    public final sy c = new sy(this, "last_upload", 0);
    public final sy d = new sy(this, "last_upload_attempt", 0);
    public final sy e = new sy(this, "backoff", 0);
    public final sy f = new sy(this, "last_delete_stale", 0);
    public final sy g = new sy(this, "midnight_offset", 0);
    public final sy h = new sy(this, "first_open_time", 0);
    public final ta i = new ta(this, "app_instance_id", (String) null);
    public final sy j = new sy(this, "time_before_start", 10000);
    public final sy k = new sy(this, "session_timeout", 1800000);
    public final sw l = new sw(this, "start_new_session", true);
    public final sy m = new sy(this, "last_pause_time", 0);
    public final sy n = new sy(this, "time_active", 0);
    public boolean o;
    private SharedPreferences q;
    private String r;
    private boolean s;
    private long t;
    private String u;
    private long v;
    private final Object w = new Object();

    su(tk tkVar) {
        super(tkVar);
    }

    /* access modifiers changed from: private */
    public final SharedPreferences D() {
        c();
        Q();
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public final Boolean A() {
        c();
        if (!D().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(D().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    public final void B() {
        boolean z = true;
        c();
        t().E().a("Clearing collection preferences.");
        boolean contains = D().contains("measurement_enabled");
        if (contains) {
            z = c(true);
        }
        SharedPreferences.Editor edit = D().edit();
        edit.clear();
        edit.apply();
        if (contains) {
            b(z);
        }
    }

    /* access modifiers changed from: protected */
    public final String C() {
        c();
        String string = D().getString("previous_os_version", (String) null);
        h().Q();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = D().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> a(String str) {
        c();
        long b2 = k().b();
        if (this.r != null && b2 < this.t) {
            return new Pair<>(this.r, Boolean.valueOf(this.s));
        }
        this.t = b2 + v().a(str, rz.d);
        a.a(true);
        try {
            a.C0015a a2 = a.a(l());
            if (a2 != null) {
                this.r = a2.a();
                this.s = a2.b();
            }
            if (this.r == null) {
                this.r = "";
            }
        } catch (Throwable th) {
            t().D().a("Unable to get advertising id", th);
            this.r = "";
        }
        a.a(false);
        return new Pair<>(this.r, Boolean.valueOf(this.s));
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        c();
        t().E().a("Setting useService", Boolean.valueOf(z));
        SharedPreferences.Editor edit = D().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final String b(String str) {
        c();
        String str2 = (String) a(str).first;
        MessageDigest g2 = wr.g("MD5");
        if (g2 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, g2.digest(str2.getBytes()))});
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        c();
        t().E().a("Setting measurementEnabled", Boolean.valueOf(z));
        SharedPreferences.Editor edit = D().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        c();
        SharedPreferences.Editor edit = D().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final boolean c(boolean z) {
        c();
        return D().getBoolean("measurement_enabled", z);
    }

    /* access modifiers changed from: package-private */
    public final void d(String str) {
        synchronized (this.w) {
            this.u = str;
            this.v = k().b();
        }
    }

    /* access modifiers changed from: protected */
    public final void h_() {
        this.q = l().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.o = this.q.getBoolean("has_been_opened", false);
        if (!this.o) {
            SharedPreferences.Editor edit = this.q.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final String y() {
        c();
        return D().getString("gmp_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    public final String z() {
        String str;
        synchronized (this.w) {
            str = Math.abs(k().b() - this.v) < 1000 ? this.u : null;
        }
        return str;
    }
}
