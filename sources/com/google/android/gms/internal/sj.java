package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.d;
import com.google.android.gms.measurement.AppMeasurement;

public final class sj extends uk {
    private final String a = rz.c.b();
    private final char b;
    private final long c = 11910;
    private final sl d;
    private final sl e;
    private final sl f;
    private final sl g;
    private final sl h;
    private final sl i;
    private final sl j;
    private final sl k;
    private final sl l;

    sj(tk tkVar) {
        super(tkVar);
        if (v().w()) {
            this.b = 'C';
        } else {
            this.b = 'c';
        }
        this.d = new sl(this, 6, false, false);
        this.e = new sl(this, 6, true, false);
        this.f = new sl(this, 6, false, true);
        this.g = new sl(this, 5, false, false);
        this.h = new sl(this, 5, true, false);
        this.i = new sl(this, 5, false, true);
        this.j = new sl(this, 4, false, false);
        this.k = new sl(this, 3, false, false);
        this.l = new sl(this, 2, false, false);
    }

    protected static Object a(String str) {
        if (str == null) {
            return null;
        }
        return new sm(str);
    }

    private static String a(boolean z, Object obj) {
        StackTraceElement stackTraceElement;
        String className;
        if (obj == null) {
            return "";
        }
        Object valueOf = obj instanceof Integer ? Long.valueOf((long) ((Integer) obj).intValue()) : obj;
        if (valueOf instanceof Long) {
            if (!z) {
                return String.valueOf(valueOf);
            }
            if (Math.abs(((Long) valueOf).longValue()) < 100) {
                return String.valueOf(valueOf);
            }
            String str = String.valueOf(valueOf).charAt(0) == '-' ? "-" : "";
            String valueOf2 = String.valueOf(Math.abs(((Long) valueOf).longValue()));
            return new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(str).length()).append(str).append(Math.round(Math.pow(10.0d, (double) (valueOf2.length() - 1)))).append("...").append(str).append(Math.round(Math.pow(10.0d, (double) valueOf2.length()) - 1.0d)).toString();
        } else if (valueOf instanceof Boolean) {
            return String.valueOf(valueOf);
        } else {
            if (!(valueOf instanceof Throwable)) {
                return valueOf instanceof sm ? ((sm) valueOf).a : z ? "-" : String.valueOf(valueOf);
            }
            Throwable th = (Throwable) valueOf;
            StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String b2 = b(AppMeasurement.class.getCanonicalName());
            String b3 = b(tk.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                stackTraceElement = stackTrace[i2];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                    String b4 = b(className);
                    if (b4.equals(b2) || b4.equals(b3)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                    }
                }
                i2++;
            }
            sb.append(": ");
            sb.append(stackTraceElement);
            return sb.toString();
        }
    }

    private static String a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String a2 = a(z, obj);
        String a3 = a(z, obj2);
        String a4 = a(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a4)) {
            sb.append(str2);
            sb.append(a4);
        }
        return sb.toString();
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    public final sl A() {
        return this.g;
    }

    public final sl B() {
        return this.i;
    }

    public final sl C() {
        return this.j;
    }

    public final sl D() {
        return this.k;
    }

    public final sl E() {
        return this.l;
    }

    public final String F() {
        Pair<String, Long> a2 = u().b.a();
        if (a2 == null || a2 == su.a) {
            return null;
        }
        String valueOf = String.valueOf(a2.second);
        String str = (String) a2.first;
        return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length()).append(valueOf).append(":").append(str).toString();
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, String str) {
        Log.println(i2, this.a, str);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && a(i2)) {
            a(i2, a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            y.a(str);
            tf k2 = this.p.k();
            if (k2 == null) {
                a(6, "Scheduler not set. Not logging error/warn");
            } else if (!k2.P()) {
                a(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                int i3 = i2 < 0 ? 0 : i2;
                if (i3 >= 9) {
                    i3 = 8;
                }
                char charAt = "01VDIWEA?".charAt(i3);
                char c2 = this.b;
                long j2 = this.c;
                String a2 = a(true, str, obj, obj2, obj3);
                String sb = new StringBuilder(String.valueOf("2").length() + 23 + String.valueOf(a2).length()).append("2").append(charAt).append(c2).append(j2).append(":").append(a2).toString();
                if (sb.length() > 1024) {
                    sb = str.substring(0, 1024);
                }
                k2.a((Runnable) new sk(this, sb));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2) {
        return Log.isLoggable(this.a, i2);
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ qz d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ rg e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ um f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ se g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ rq h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ vg i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ vc j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ d k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Context l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ sf m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ rk n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ sh o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ wr p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ te q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ wg r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ tf s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ sj t() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ su u() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ rj v() {
        return super.v();
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return false;
    }

    public final sl y() {
        return this.d;
    }

    public final sl z() {
        return this.e;
    }
}
