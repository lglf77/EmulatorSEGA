package com.google.android.gms.internal;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.f;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public class tk {
    private static volatile tk a;
    private boolean A;
    private Boolean B;
    private long C;
    private FileLock D;
    private FileChannel E;
    private List<Long> F;
    private List<Runnable> G;
    private int H;
    private int I;
    private long J;
    private long K;
    private boolean L;
    private boolean M;
    private boolean N;
    private final long O;
    private final Context b;
    private final rj c;
    private final su d;
    private final sj e;
    private final tf f;
    private final wg g;
    private final te h;
    private final AppMeasurement i;
    private final FirebaseAnalytics j;
    private final wr k;
    private final sh l;
    private final rk m;
    private final sf n;
    private final sn o;
    private final d p;
    private final vc q;
    private final vg r;
    private final rq s;
    private final um t;
    private final se u;
    private final ss v;
    private final wm w;
    private final rg x;
    private final qz y;
    private boolean z = false;

    class a implements rm {
        xg a;
        List<Long> b;
        List<xd> c;
        private long d;

        private a() {
        }

        /* synthetic */ a(tk tkVar, tl tlVar) {
            this();
        }

        private static long a(xd xdVar) {
            return ((xdVar.c.longValue() / 1000) / 60) / 60;
        }

        public final void a(xg xgVar) {
            y.a(xgVar);
            this.a = xgVar;
        }

        public final boolean a(long j, xd xdVar) {
            y.a(xdVar);
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (this.c.size() > 0 && a(this.c.get(0)) != a(xdVar)) {
                return false;
            }
            long f = this.d + ((long) xdVar.f());
            if (f >= ((long) Math.max(0, rz.k.b().intValue()))) {
                return false;
            }
            this.d = f;
            this.c.add(xdVar);
            this.b.add(Long.valueOf(j));
            return this.c.size() < Math.max(1, rz.l.b().intValue());
        }
    }

    private tk(ul ulVar) {
        y.a(ulVar);
        this.b = ulVar.a;
        this.J = -1;
        this.p = f.d();
        this.O = this.p.a();
        this.c = new rj(this);
        su suVar = new su(this);
        suVar.R();
        this.d = suVar;
        sj sjVar = new sj(this);
        sjVar.R();
        this.e = sjVar;
        wr wrVar = new wr(this);
        wrVar.R();
        this.k = wrVar;
        sh shVar = new sh(this);
        shVar.R();
        this.l = shVar;
        rq rqVar = new rq(this);
        rqVar.R();
        this.s = rqVar;
        se seVar = new se(this);
        seVar.R();
        this.u = seVar;
        rk rkVar = new rk(this);
        rkVar.R();
        this.m = rkVar;
        sf sfVar = new sf(this);
        sfVar.R();
        this.n = sfVar;
        rg rgVar = new rg(this);
        rgVar.R();
        this.x = rgVar;
        this.y = new qz(this);
        sn snVar = new sn(this);
        snVar.R();
        this.o = snVar;
        vc vcVar = new vc(this);
        vcVar.R();
        this.q = vcVar;
        vg vgVar = new vg(this);
        vgVar.R();
        this.r = vgVar;
        um umVar = new um(this);
        umVar.R();
        this.t = umVar;
        wm wmVar = new wm(this);
        wmVar.R();
        this.w = wmVar;
        this.v = new ss(this);
        this.i = new AppMeasurement(this);
        this.j = new FirebaseAnalytics(this);
        wg wgVar = new wg(this);
        wgVar.R();
        this.g = wgVar;
        te teVar = new te(this);
        teVar.R();
        this.h = teVar;
        tf tfVar = new tf(this);
        tfVar.R();
        this.f = tfVar;
        if (this.b.getApplicationContext() instanceof Application) {
            um l2 = l();
            if (l2.l().getApplicationContext() instanceof Application) {
                Application application = (Application) l2.l().getApplicationContext();
                if (l2.a == null) {
                    l2.a = new vb(l2, (un) null);
                }
                application.unregisterActivityLifecycleCallbacks(l2.a);
                application.registerActivityLifecycleCallbacks(l2.a);
                l2.t().E().a("Registered activity lifecycle callback");
            }
        } else {
            f().A().a("Application context is not an Application");
        }
        this.f.a((Runnable) new tl(this));
    }

    static void D() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: private */
    public final void H() {
        sl C2;
        String concat;
        h().c();
        this.k.S();
        this.d.S();
        this.u.S();
        f().C().a("App measurement is starting up, version", 11910L);
        f().C().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String z2 = this.u.z();
        if (o().j(z2)) {
            C2 = f().C();
            concat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
        } else {
            C2 = f().C();
            String valueOf = String.valueOf(z2);
            concat = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
        }
        C2.a(concat);
        f().D().a("Debug-level message logging enabled");
        if (this.H != this.I) {
            f().y().a("Not all components initialized", Integer.valueOf(this.H), Integer.valueOf(this.I));
        }
        this.z = true;
    }

    private final ss I() {
        if (this.v != null) {
            return this.v;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final wm J() {
        b((uk) this.w);
        return this.w;
    }

    private final boolean K() {
        h().c();
        try {
            this.E = new RandomAccessFile(new File(this.b.getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.D = this.E.tryLock();
            if (this.D != null) {
                f().E().a("Storage concurrent access okay");
                return true;
            }
            f().y().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e2) {
            f().y().a("Failed to acquire storage lock", e2);
        } catch (IOException e3) {
            f().y().a("Failed to access storage lock file", e3);
        }
    }

    private final long L() {
        long a2 = this.p.a();
        su e2 = e();
        e2.Q();
        e2.c();
        long a3 = e2.g.a();
        if (a3 == 0) {
            a3 = 1 + ((long) e2.p().z().nextInt(86400000));
            e2.g.a(a3);
        }
        return ((((a3 + a2) / 1000) / 60) / 60) / 24;
    }

    private final boolean M() {
        h().c();
        a();
        return q().G() || !TextUtils.isEmpty(q().B());
    }

    private final void N() {
        long max;
        long j2;
        h().c();
        a();
        if (O()) {
            if (this.K > 0) {
                long abs = 3600000 - Math.abs(this.p.b() - this.K);
                if (abs > 0) {
                    f().E().a("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                    I().b();
                    J().y();
                    return;
                }
                this.K = 0;
            }
            if (!b() || !M()) {
                f().E().a("Nothing to upload or uploading impossible");
                I().b();
                J().y();
                return;
            }
            long a2 = this.p.a();
            long max2 = Math.max(0, rz.C.b().longValue());
            boolean z2 = q().H() || q().C();
            if (z2) {
                String A2 = this.c.A();
                max = (TextUtils.isEmpty(A2) || ".none.".equals(A2)) ? Math.max(0, rz.w.b().longValue()) : Math.max(0, rz.x.b().longValue());
            } else {
                max = Math.max(0, rz.v.b().longValue());
            }
            long a3 = e().c.a();
            long a4 = e().d.a();
            long max3 = Math.max(q().E(), q().F());
            if (max3 == 0) {
                j2 = 0;
            } else {
                long abs2 = a2 - Math.abs(max3 - a2);
                long abs3 = a2 - Math.abs(a4 - a2);
                long max4 = Math.max(a2 - Math.abs(a3 - a2), abs3);
                j2 = abs2 + max2;
                if (z2 && max4 > 0) {
                    j2 = Math.min(abs2, max4) + max;
                }
                if (!o().a(max4, max)) {
                    j2 = max4 + max;
                }
                if (abs3 != 0 && abs3 >= abs2) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 >= Math.min(20, Math.max(0, rz.E.b().intValue()))) {
                            j2 = 0;
                            break;
                        }
                        j2 += (1 << i3) * Math.max(0, rz.D.b().longValue());
                        if (j2 > abs3) {
                            break;
                        }
                        i2 = i3 + 1;
                    }
                }
            }
            if (j2 == 0) {
                f().E().a("Next upload time is 0");
                I().b();
                J().y();
            } else if (!s().y()) {
                f().E().a("No network");
                I().a();
                J().y();
            } else {
                long a5 = e().e.a();
                long max5 = Math.max(0, rz.t.b().longValue());
                long max6 = !o().a(a5, max5) ? Math.max(j2, max5 + a5) : j2;
                I().b();
                long a6 = max6 - this.p.a();
                if (a6 <= 0) {
                    a6 = Math.max(0, rz.y.b().longValue());
                    e().c.a(this.p.a());
                }
                f().E().a("Upload scheduled in approximately ms", Long.valueOf(a6));
                J().a(a6);
            }
        }
    }

    private final boolean O() {
        h().c();
        a();
        return this.A;
    }

    private final void P() {
        h().c();
        if (this.L || this.M || this.N) {
            f().E().a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.L), Boolean.valueOf(this.M), Boolean.valueOf(this.N));
            return;
        }
        f().E().a("Stopping uploading service(s)");
        if (this.G != null) {
            for (Runnable run : this.G) {
                run.run();
            }
            this.G.clear();
        }
    }

    private final int a(FileChannel fileChannel) {
        h().c();
        if (fileChannel == null || !fileChannel.isOpen()) {
            f().y().a("Bad chanel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read == 4) {
                allocate.flip();
                return allocate.getInt();
            } else if (read == -1) {
                return 0;
            } else {
                f().A().a("Unexpected data length. Bytes read", Integer.valueOf(read));
                return 0;
            }
        } catch (IOException e2) {
            f().y().a("Failed to read from channel", e2);
            return 0;
        }
    }

    private final re a(Context context, String str, String str2, boolean z2, boolean z3) {
        String str3;
        String str4 = "Unknown";
        String str5 = "Unknown";
        int i2 = Integer.MIN_VALUE;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            f().y().a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str4 = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException e2) {
            f().y().a("Error retrieving installer package name. appId", sj.a(str));
        }
        if (str4 == null) {
            str4 = "manual_install";
        } else if ("com.android.vending".equals(str4)) {
            str4 = "";
        }
        try {
            PackageInfo b2 = pw.a(context).b(str, 0);
            if (b2 != null) {
                CharSequence b3 = pw.a(context).b(str);
                str3 = !TextUtils.isEmpty(b3) ? b3.toString() : "Unknown";
                try {
                    str5 = b2.versionName;
                    i2 = b2.versionCode;
                } catch (PackageManager.NameNotFoundException e3) {
                    f().y().a("Error retrieving newly installed package info. appId, appName", sj.a(str), str3);
                    return null;
                }
            }
            return new re(str, str2, str5, (long) i2, str4, 11910, o().b(context, str), (String) null, z2, false, "", 0, 0, 0, z3);
        } catch (PackageManager.NameNotFoundException e4) {
            str3 = "Unknown";
            f().y().a("Error retrieving newly installed package info. appId, appName", sj.a(str), str3);
            return null;
        }
    }

    public static tk a(Context context) {
        y.a(context);
        y.a(context.getApplicationContext());
        if (a == null) {
            synchronized (tk.class) {
                if (a == null) {
                    a = new tk(new ul(context));
                }
            }
        }
        return a;
    }

    private final void a(rd rdVar) {
        android.support.v4.c.a aVar;
        h().c();
        if (TextUtils.isEmpty(rdVar.d())) {
            a(rdVar.b(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        String d2 = rdVar.d();
        String c2 = rdVar.c();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder encodedAuthority = builder.scheme(rz.g.b()).encodedAuthority(rz.h.b());
        String valueOf = String.valueOf(d2);
        encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", c2).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "11910");
        String uri = builder.build().toString();
        try {
            URL url = new URL(uri);
            f().E().a("Fetching remote configuration", rdVar.b());
            wz a2 = j().a(rdVar.b());
            String b2 = j().b(rdVar.b());
            if (a2 == null || TextUtils.isEmpty(b2)) {
                aVar = null;
            } else {
                android.support.v4.c.a aVar2 = new android.support.v4.c.a();
                aVar2.put("If-Modified-Since", b2);
                aVar = aVar2;
            }
            this.L = true;
            sn s2 = s();
            String b3 = rdVar.b();
            to toVar = new to(this);
            s2.c();
            s2.Q();
            y.a(url);
            y.a(toVar);
            s2.s().b((Runnable) new sr(s2, b3, url, (byte[]) null, aVar, toVar));
        } catch (MalformedURLException e2) {
            f().y().a("Failed to parse config URL. Not fetching. appId", sj.a(rdVar.b()), uri);
        }
    }

    private static void a(uj ujVar) {
        if (ujVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private final boolean a(int i2, FileChannel fileChannel) {
        h().c();
        if (fileChannel == null || !fileChannel.isOpen()) {
            f().y().a("Bad chanel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i2);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() == 4) {
                return true;
            }
            f().y().a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            return true;
        } catch (IOException e2) {
            f().y().a("Failed to write to channel", e2);
            return false;
        }
    }

    private static boolean a(xd xdVar, String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return false;
        }
        for (xe xeVar : xdVar.a) {
            if (str.equals(xeVar.a)) {
                return ((obj instanceof Long) && obj.equals(xeVar.c)) || ((obj instanceof String) && obj.equals(xeVar.b)) || ((obj instanceof Double) && obj.equals(xeVar.d));
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x038f, code lost:
        if (com.google.android.gms.internal.wr.n(r0.c.get(r13).b) != false) goto L_0x0391;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0356 A[Catch:{ IOException -> 0x02bb, all -> 0x01be }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x035a A[Catch:{ IOException -> 0x02bb, all -> 0x01be }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093 A[Catch:{ IOException -> 0x02bb, all -> 0x01be }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0096 A[Catch:{ IOException -> 0x02bb, all -> 0x01be }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0aaa A[Catch:{ IOException -> 0x02bb, all -> 0x01be }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(java.lang.String r31, long r32) {
        /*
            r30 = this;
            com.google.android.gms.internal.rk r2 = r30.q()
            r2.x()
            com.google.android.gms.internal.tk$a r21 = new com.google.android.gms.internal.tk$a     // Catch:{ all -> 0x01be }
            r2 = 0
            r0 = r21
            r1 = r30
            r0.<init>(r1, r2)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rk r14 = r30.q()     // Catch:{ all -> 0x01be }
            r4 = 0
            r0 = r30
            long r0 = r0.J     // Catch:{ all -> 0x01be }
            r16 = r0
            com.google.android.gms.common.internal.y.a(r21)     // Catch:{ all -> 0x01be }
            r14.c()     // Catch:{ all -> 0x01be }
            r14.Q()     // Catch:{ all -> 0x01be }
            r3 = 0
            android.database.sqlite.SQLiteDatabase r2 = r14.A()     // Catch:{ SQLiteException -> 0x0abf }
            r5 = 0
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ SQLiteException -> 0x0abf }
            if (r5 == 0) goto L_0x01c7
            r6 = -1
            int r5 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0160
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0abf }
            r6 = 0
            java.lang.String r7 = java.lang.String.valueOf(r16)     // Catch:{ SQLiteException -> 0x0abf }
            r5[r6] = r7     // Catch:{ SQLiteException -> 0x0abf }
            r6 = 1
            java.lang.String r7 = java.lang.String.valueOf(r32)     // Catch:{ SQLiteException -> 0x0abf }
            r5[r6] = r7     // Catch:{ SQLiteException -> 0x0abf }
            r6 = r5
        L_0x0049:
            r8 = -1
            int r5 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x016d
            java.lang.String r5 = "rowid <= ? and "
        L_0x0051:
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0abf }
            int r7 = r7.length()     // Catch:{ SQLiteException -> 0x0abf }
            int r7 = r7 + 148
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0abf }
            r8.<init>(r7)     // Catch:{ SQLiteException -> 0x0abf }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            java.lang.StringBuilder r7 = r8.append(r7)     // Catch:{ SQLiteException -> 0x0abf }
            java.lang.StringBuilder r5 = r7.append(r5)     // Catch:{ SQLiteException -> 0x0abf }
            java.lang.String r7 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch:{ SQLiteException -> 0x0abf }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x0abf }
            android.database.Cursor r3 = r2.rawQuery(r5, r6)     // Catch:{ SQLiteException -> 0x0abf }
            boolean r5 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0abf }
            if (r5 != 0) goto L_0x0171
            if (r3 == 0) goto L_0x0083
            r3.close()     // Catch:{ all -> 0x01be }
        L_0x0083:
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x0093
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x035a
        L_0x0093:
            r2 = 1
        L_0x0094:
            if (r2 != 0) goto L_0x0aaa
            r17 = 0
            r0 = r21
            com.google.android.gms.internal.xg r0 = r0.a     // Catch:{ all -> 0x01be }
            r22 = r0
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            int r2 = r2.size()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd[] r2 = new com.google.android.gms.internal.xd[r2]     // Catch:{ all -> 0x01be }
            r0 = r22
            r0.b = r2     // Catch:{ all -> 0x01be }
            r12 = 0
            r2 = 0
            r13 = r2
        L_0x00af:
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            int r2 = r2.size()     // Catch:{ all -> 0x01be }
            if (r13 >= r2) goto L_0x0613
            com.google.android.gms.internal.te r3 = r30.j()     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r2 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r4 = r2.o     // Catch:{ all -> 0x01be }
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x01be }
            boolean r2 = r3.b(r4, r2)     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x0360
            com.google.android.gms.internal.sj r2 = r30.f()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.sl r3 = r2.A()     // Catch:{ all -> 0x01be }
            java.lang.String r4 = "Dropping blacklisted raw event. appId"
            r0 = r21
            com.google.android.gms.internal.xg r2 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r2.o     // Catch:{ all -> 0x01be }
            java.lang.Object r5 = com.google.android.gms.internal.sj.a((java.lang.String) r2)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.sh r6 = r30.p()     // Catch:{ all -> 0x01be }
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r6.a((java.lang.String) r2)     // Catch:{ all -> 0x01be }
            r3.a(r4, r5, r2)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.wr r2 = r30.o()     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r3 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r3 = r3.o     // Catch:{ all -> 0x01be }
            boolean r2 = r2.l(r3)     // Catch:{ all -> 0x01be }
            if (r2 != 0) goto L_0x0120
            com.google.android.gms.internal.wr r2 = r30.o()     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r3 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r3 = r3.o     // Catch:{ all -> 0x01be }
            boolean r2 = r2.m(r3)     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x035d
        L_0x0120:
            r2 = 1
        L_0x0121:
            if (r2 != 0) goto L_0x0adb
            java.lang.String r3 = "_err"
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x01be }
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x01be }
            if (r2 != 0) goto L_0x0adb
            com.google.android.gms.internal.wr r2 = r30.o()     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r3 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r3 = r3.o     // Catch:{ all -> 0x01be }
            r4 = 11
            java.lang.String r5 = "_ev"
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r6 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r6 = r6.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r6 = (com.google.android.gms.internal.xd) r6     // Catch:{ all -> 0x01be }
            java.lang.String r6 = r6.b     // Catch:{ all -> 0x01be }
            r7 = 0
            r2.a((java.lang.String) r3, (int) r4, (java.lang.String) r5, (java.lang.String) r6, (int) r7)     // Catch:{ all -> 0x01be }
            r2 = r12
            r3 = r17
        L_0x0158:
            int r4 = r13 + 1
            r13 = r4
            r12 = r2
            r17 = r3
            goto L_0x00af
        L_0x0160:
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0abf }
            r6 = 0
            java.lang.String r7 = java.lang.String.valueOf(r32)     // Catch:{ SQLiteException -> 0x0abf }
            r5[r6] = r7     // Catch:{ SQLiteException -> 0x0abf }
            r6 = r5
            goto L_0x0049
        L_0x016d:
            java.lang.String r5 = ""
            goto L_0x0051
        L_0x0171:
            r5 = 0
            java.lang.String r4 = r3.getString(r5)     // Catch:{ SQLiteException -> 0x0abf }
            r5 = 1
            java.lang.String r5 = r3.getString(r5)     // Catch:{ SQLiteException -> 0x0abf }
            r3.close()     // Catch:{ SQLiteException -> 0x0abf }
            r13 = r5
            r11 = r3
            r12 = r4
        L_0x0181:
            java.lang.String r3 = "raw_events_metadata"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r5 = 0
            java.lang.String r6 = "metadata"
            r4[r5] = r6     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ?"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r7 = 0
            r6[r7] = r12     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r7 = 1
            r6[r7] = r13     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "2"
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            boolean r3 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            if (r3 != 0) goto L_0x0231
            com.google.android.gms.internal.sj r2 = r14.t()     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            java.lang.String r3 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r2.a(r3, r4)     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            if (r11 == 0) goto L_0x0083
            r11.close()     // Catch:{ all -> 0x01be }
            goto L_0x0083
        L_0x01be:
            r2 = move-exception
            com.google.android.gms.internal.rk r3 = r30.q()
            r3.z()
            throw r2
        L_0x01c7:
            r6 = -1
            int r5 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0218
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0abf }
            r6 = 0
            r7 = 0
            r5[r6] = r7     // Catch:{ SQLiteException -> 0x0abf }
            r6 = 1
            java.lang.String r7 = java.lang.String.valueOf(r16)     // Catch:{ SQLiteException -> 0x0abf }
            r5[r6] = r7     // Catch:{ SQLiteException -> 0x0abf }
            r6 = r5
        L_0x01dc:
            r8 = -1
            int r5 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0221
            java.lang.String r5 = " and rowid <= ?"
        L_0x01e4:
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0abf }
            int r7 = r7.length()     // Catch:{ SQLiteException -> 0x0abf }
            int r7 = r7 + 84
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0abf }
            r8.<init>(r7)     // Catch:{ SQLiteException -> 0x0abf }
            java.lang.String r7 = "select metadata_fingerprint from raw_events where app_id = ?"
            java.lang.StringBuilder r7 = r8.append(r7)     // Catch:{ SQLiteException -> 0x0abf }
            java.lang.StringBuilder r5 = r7.append(r5)     // Catch:{ SQLiteException -> 0x0abf }
            java.lang.String r7 = " order by rowid limit 1;"
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch:{ SQLiteException -> 0x0abf }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x0abf }
            android.database.Cursor r3 = r2.rawQuery(r5, r6)     // Catch:{ SQLiteException -> 0x0abf }
            boolean r5 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0abf }
            if (r5 != 0) goto L_0x0224
            if (r3 == 0) goto L_0x0083
            r3.close()     // Catch:{ all -> 0x01be }
            goto L_0x0083
        L_0x0218:
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0abf }
            r6 = 0
            r7 = 0
            r5[r6] = r7     // Catch:{ SQLiteException -> 0x0abf }
            r6 = r5
            goto L_0x01dc
        L_0x0221:
            java.lang.String r5 = ""
            goto L_0x01e4
        L_0x0224:
            r5 = 0
            java.lang.String r5 = r3.getString(r5)     // Catch:{ SQLiteException -> 0x0abf }
            r3.close()     // Catch:{ SQLiteException -> 0x0abf }
            r13 = r5
            r11 = r3
            r12 = r4
            goto L_0x0181
        L_0x0231:
            r3 = 0
            byte[] r3 = r11.getBlob(r3)     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r4 = 0
            int r5 = r3.length     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            com.google.android.gms.internal.ajw r3 = com.google.android.gms.internal.ajw.a(r3, r4, r5)     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            com.google.android.gms.internal.xg r4 = new com.google.android.gms.internal.xg     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r4.<init>()     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r4.a((com.google.android.gms.internal.ajw) r3)     // Catch:{ IOException -> 0x02bb }
            boolean r3 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            if (r3 == 0) goto L_0x025b
            com.google.android.gms.internal.sj r3 = r14.t()     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            com.google.android.gms.internal.sl r3 = r3.A()     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            java.lang.String r5 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r6 = com.google.android.gms.internal.sj.a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r3.a(r5, r6)     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
        L_0x025b:
            r11.close()     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r0 = r21
            r0.a(r4)     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r4 = -1
            int r3 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x02d4
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r3 = 3
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r3 = 0
            r6[r3] = r12     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r3 = 1
            r6[r3] = r13     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r3 = 2
            java.lang.String r4 = java.lang.String.valueOf(r16)     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r6[r3] = r4     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
        L_0x027b:
            java.lang.String r3 = "raw_events"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r7 = 0
            java.lang.String r8 = "rowid"
            r4[r7] = r8     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r7 = 1
            java.lang.String r8 = "name"
            r4[r7] = r8     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r7 = 2
            java.lang.String r8 = "timestamp"
            r4[r7] = r8     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r7 = 3
            java.lang.String r8 = "data"
            r4[r7] = r8     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            r10 = 0
            android.database.Cursor r3 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            boolean r2 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0ac2 }
            if (r2 != 0) goto L_0x02fb
            com.google.android.gms.internal.sj r2 = r14.t()     // Catch:{ SQLiteException -> 0x0ac2 }
            com.google.android.gms.internal.sl r2 = r2.A()     // Catch:{ SQLiteException -> 0x0ac2 }
            java.lang.String r4 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r5 = com.google.android.gms.internal.sj.a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x0ac2 }
            r2.a(r4, r5)     // Catch:{ SQLiteException -> 0x0ac2 }
            if (r3 == 0) goto L_0x0083
            r3.close()     // Catch:{ all -> 0x01be }
            goto L_0x0083
        L_0x02bb:
            r2 = move-exception
            com.google.android.gms.internal.sj r3 = r14.t()     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            com.google.android.gms.internal.sl r3 = r3.y()     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.internal.sj.a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r3.a(r4, r5, r2)     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            if (r11 == 0) goto L_0x0083
            r11.close()     // Catch:{ all -> 0x01be }
            goto L_0x0083
        L_0x02d4:
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ?"
            r3 = 2
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r3 = 0
            r6[r3] = r12     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            r3 = 1
            r6[r3] = r13     // Catch:{ SQLiteException -> 0x02e0, all -> 0x0abb }
            goto L_0x027b
        L_0x02e0:
            r2 = move-exception
            r3 = r11
            r4 = r12
        L_0x02e3:
            com.google.android.gms.internal.sj r5 = r14.t()     // Catch:{ all -> 0x0353 }
            com.google.android.gms.internal.sl r5 = r5.y()     // Catch:{ all -> 0x0353 }
            java.lang.String r6 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r4)     // Catch:{ all -> 0x0353 }
            r5.a(r6, r4, r2)     // Catch:{ all -> 0x0353 }
            if (r3 == 0) goto L_0x0083
            r3.close()     // Catch:{ all -> 0x01be }
            goto L_0x0083
        L_0x02fb:
            r2 = 0
            long r4 = r3.getLong(r2)     // Catch:{ SQLiteException -> 0x0ac2 }
            r2 = 3
            byte[] r2 = r3.getBlob(r2)     // Catch:{ SQLiteException -> 0x0ac2 }
            r6 = 0
            int r7 = r2.length     // Catch:{ SQLiteException -> 0x0ac2 }
            com.google.android.gms.internal.ajw r2 = com.google.android.gms.internal.ajw.a(r2, r6, r7)     // Catch:{ SQLiteException -> 0x0ac2 }
            com.google.android.gms.internal.xd r6 = new com.google.android.gms.internal.xd     // Catch:{ SQLiteException -> 0x0ac2 }
            r6.<init>()     // Catch:{ SQLiteException -> 0x0ac2 }
            r6.a((com.google.android.gms.internal.ajw) r2)     // Catch:{ IOException -> 0x0334 }
            r2 = 1
            java.lang.String r2 = r3.getString(r2)     // Catch:{ SQLiteException -> 0x0ac2 }
            r6.b = r2     // Catch:{ SQLiteException -> 0x0ac2 }
            r2 = 2
            long r8 = r3.getLong(r2)     // Catch:{ SQLiteException -> 0x0ac2 }
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteException -> 0x0ac2 }
            r6.c = r2     // Catch:{ SQLiteException -> 0x0ac2 }
            r0 = r21
            boolean r2 = r0.a(r4, r6)     // Catch:{ SQLiteException -> 0x0ac2 }
            if (r2 != 0) goto L_0x0346
            if (r3 == 0) goto L_0x0083
            r3.close()     // Catch:{ all -> 0x01be }
            goto L_0x0083
        L_0x0334:
            r2 = move-exception
            com.google.android.gms.internal.sj r4 = r14.t()     // Catch:{ SQLiteException -> 0x0ac2 }
            com.google.android.gms.internal.sl r4 = r4.y()     // Catch:{ SQLiteException -> 0x0ac2 }
            java.lang.String r5 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r6 = com.google.android.gms.internal.sj.a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x0ac2 }
            r4.a(r5, r6, r2)     // Catch:{ SQLiteException -> 0x0ac2 }
        L_0x0346:
            boolean r2 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0ac2 }
            if (r2 != 0) goto L_0x02fb
            if (r3 == 0) goto L_0x0083
            r3.close()     // Catch:{ all -> 0x01be }
            goto L_0x0083
        L_0x0353:
            r2 = move-exception
        L_0x0354:
            if (r3 == 0) goto L_0x0359
            r3.close()     // Catch:{ all -> 0x01be }
        L_0x0359:
            throw r2     // Catch:{ all -> 0x01be }
        L_0x035a:
            r2 = 0
            goto L_0x0094
        L_0x035d:
            r2 = 0
            goto L_0x0121
        L_0x0360:
            com.google.android.gms.internal.te r3 = r30.j()     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r2 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r4 = r2.o     // Catch:{ all -> 0x01be }
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x01be }
            boolean r14 = r3.c(r4, r2)     // Catch:{ all -> 0x01be }
            if (r14 != 0) goto L_0x0391
            r30.o()     // Catch:{ all -> 0x01be }
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x01be }
            boolean r2 = com.google.android.gms.internal.wr.n(r2)     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x0610
        L_0x0391:
            r3 = 0
            r4 = 0
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe[] r2 = r2.a     // Catch:{ all -> 0x01be }
            if (r2 != 0) goto L_0x03b0
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            r5 = 0
            com.google.android.gms.internal.xe[] r5 = new com.google.android.gms.internal.xe[r5]     // Catch:{ all -> 0x01be }
            r2.a = r5     // Catch:{ all -> 0x01be }
        L_0x03b0:
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe[] r6 = r2.a     // Catch:{ all -> 0x01be }
            int r7 = r6.length     // Catch:{ all -> 0x01be }
            r2 = 0
            r5 = r2
        L_0x03bf:
            if (r5 >= r7) goto L_0x03f1
            r2 = r6[r5]     // Catch:{ all -> 0x01be }
            java.lang.String r8 = "_c"
            java.lang.String r9 = r2.a     // Catch:{ all -> 0x01be }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x01be }
            if (r8 == 0) goto L_0x03dd
            r8 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x01be }
            r2.c = r3     // Catch:{ all -> 0x01be }
            r2 = 1
            r3 = r2
            r2 = r4
        L_0x03d8:
            int r4 = r5 + 1
            r5 = r4
            r4 = r2
            goto L_0x03bf
        L_0x03dd:
            java.lang.String r8 = "_r"
            java.lang.String r9 = r2.a     // Catch:{ all -> 0x01be }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x01be }
            if (r8 == 0) goto L_0x0ad8
            r8 = 1
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x01be }
            r2.c = r4     // Catch:{ all -> 0x01be }
            r2 = 1
            goto L_0x03d8
        L_0x03f1:
            if (r3 != 0) goto L_0x0459
            if (r14 == 0) goto L_0x0459
            com.google.android.gms.internal.sj r2 = r30.f()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.sl r3 = r2.E()     // Catch:{ all -> 0x01be }
            java.lang.String r5 = "Marking event as conversion"
            com.google.android.gms.internal.sh r6 = r30.p()     // Catch:{ all -> 0x01be }
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r6.a((java.lang.String) r2)     // Catch:{ all -> 0x01be }
            r3.a(r5, r2)     // Catch:{ all -> 0x01be }
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe[] r3 = r2.a     // Catch:{ all -> 0x01be }
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe[] r2 = r2.a     // Catch:{ all -> 0x01be }
            int r2 = r2.length     // Catch:{ all -> 0x01be }
            int r2 = r2 + 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe[] r2 = (com.google.android.gms.internal.xe[]) r2     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe r3 = new com.google.android.gms.internal.xe     // Catch:{ all -> 0x01be }
            r3.<init>()     // Catch:{ all -> 0x01be }
            java.lang.String r5 = "_c"
            r3.a = r5     // Catch:{ all -> 0x01be }
            r6 = 1
            java.lang.Long r5 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01be }
            r3.c = r5     // Catch:{ all -> 0x01be }
            int r5 = r2.length     // Catch:{ all -> 0x01be }
            int r5 = r5 + -1
            r2[r5] = r3     // Catch:{ all -> 0x01be }
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r3 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r3 = r3.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r3 = (com.google.android.gms.internal.xd) r3     // Catch:{ all -> 0x01be }
            r3.a = r2     // Catch:{ all -> 0x01be }
        L_0x0459:
            if (r4 != 0) goto L_0x04bf
            com.google.android.gms.internal.sj r2 = r30.f()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.sl r3 = r2.E()     // Catch:{ all -> 0x01be }
            java.lang.String r4 = "Marking event as real-time"
            com.google.android.gms.internal.sh r5 = r30.p()     // Catch:{ all -> 0x01be }
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r5.a((java.lang.String) r2)     // Catch:{ all -> 0x01be }
            r3.a(r4, r2)     // Catch:{ all -> 0x01be }
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe[] r3 = r2.a     // Catch:{ all -> 0x01be }
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe[] r2 = r2.a     // Catch:{ all -> 0x01be }
            int r2 = r2.length     // Catch:{ all -> 0x01be }
            int r2 = r2 + 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe[] r2 = (com.google.android.gms.internal.xe[]) r2     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe r3 = new com.google.android.gms.internal.xe     // Catch:{ all -> 0x01be }
            r3.<init>()     // Catch:{ all -> 0x01be }
            java.lang.String r4 = "_r"
            r3.a = r4     // Catch:{ all -> 0x01be }
            r4 = 1
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x01be }
            r3.c = r4     // Catch:{ all -> 0x01be }
            int r4 = r2.length     // Catch:{ all -> 0x01be }
            int r4 = r4 + -1
            r2[r4] = r3     // Catch:{ all -> 0x01be }
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r3 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r3 = r3.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r3 = (com.google.android.gms.internal.xd) r3     // Catch:{ all -> 0x01be }
            r3.a = r2     // Catch:{ all -> 0x01be }
        L_0x04bf:
            r2 = 1
            com.google.android.gms.internal.rk r3 = r30.q()     // Catch:{ all -> 0x01be }
            long r4 = r30.L()     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r6 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r6 = r6.o     // Catch:{ all -> 0x01be }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            com.google.android.gms.internal.rl r3 = r3.a(r4, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x01be }
            long r4 = r3.e     // Catch:{ all -> 0x01be }
            r0 = r30
            com.google.android.gms.internal.rj r3 = r0.c     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r6 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r6 = r6.o     // Catch:{ all -> 0x01be }
            int r3 = r3.a(r6)     // Catch:{ all -> 0x01be }
            long r6 = (long) r3     // Catch:{ all -> 0x01be }
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0ad4
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            r3 = 0
        L_0x04f7:
            com.google.android.gms.internal.xe[] r4 = r2.a     // Catch:{ all -> 0x01be }
            int r4 = r4.length     // Catch:{ all -> 0x01be }
            if (r3 >= r4) goto L_0x0528
            java.lang.String r4 = "_r"
            com.google.android.gms.internal.xe[] r5 = r2.a     // Catch:{ all -> 0x01be }
            r5 = r5[r3]     // Catch:{ all -> 0x01be }
            java.lang.String r5 = r5.a     // Catch:{ all -> 0x01be }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x01be }
            if (r4 == 0) goto L_0x05a7
            com.google.android.gms.internal.xe[] r4 = r2.a     // Catch:{ all -> 0x01be }
            int r4 = r4.length     // Catch:{ all -> 0x01be }
            int r4 = r4 + -1
            com.google.android.gms.internal.xe[] r4 = new com.google.android.gms.internal.xe[r4]     // Catch:{ all -> 0x01be }
            if (r3 <= 0) goto L_0x051a
            com.google.android.gms.internal.xe[] r5 = r2.a     // Catch:{ all -> 0x01be }
            r6 = 0
            r7 = 0
            java.lang.System.arraycopy(r5, r6, r4, r7, r3)     // Catch:{ all -> 0x01be }
        L_0x051a:
            int r5 = r4.length     // Catch:{ all -> 0x01be }
            if (r3 >= r5) goto L_0x0526
            com.google.android.gms.internal.xe[] r5 = r2.a     // Catch:{ all -> 0x01be }
            int r6 = r3 + 1
            int r7 = r4.length     // Catch:{ all -> 0x01be }
            int r7 = r7 - r3
            java.lang.System.arraycopy(r5, r6, r4, r3, r7)     // Catch:{ all -> 0x01be }
        L_0x0526:
            r2.a = r4     // Catch:{ all -> 0x01be }
        L_0x0528:
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r2.b     // Catch:{ all -> 0x01be }
            boolean r2 = com.google.android.gms.internal.wr.a((java.lang.String) r2)     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x0610
            if (r14 == 0) goto L_0x0610
            com.google.android.gms.internal.rk r3 = r30.q()     // Catch:{ all -> 0x01be }
            long r4 = r30.L()     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r2 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r6 = r2.o     // Catch:{ all -> 0x01be }
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 0
            r11 = 0
            com.google.android.gms.internal.rl r2 = r3.a(r4, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x01be }
            long r2 = r2.c     // Catch:{ all -> 0x01be }
            r0 = r30
            com.google.android.gms.internal.rj r4 = r0.c     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r5 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r5 = r5.o     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.sa<java.lang.Integer> r6 = com.google.android.gms.internal.rz.p     // Catch:{ all -> 0x01be }
            int r4 = r4.b(r5, r6)     // Catch:{ all -> 0x01be }
            long r4 = (long) r4     // Catch:{ all -> 0x01be }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0610
            com.google.android.gms.internal.sj r2 = r30.f()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.sl r2 = r2.A()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            r0 = r21
            com.google.android.gms.internal.xg r4 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r4 = r4.o     // Catch:{ all -> 0x01be }
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r4)     // Catch:{ all -> 0x01be }
            r2.a(r3, r4)     // Catch:{ all -> 0x01be }
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            r5 = 0
            r4 = 0
            com.google.android.gms.internal.xe[] r7 = r2.a     // Catch:{ all -> 0x01be }
            int r8 = r7.length     // Catch:{ all -> 0x01be }
            r3 = 0
            r6 = r3
        L_0x0592:
            if (r6 >= r8) goto L_0x05bc
            r3 = r7[r6]     // Catch:{ all -> 0x01be }
            java.lang.String r9 = "_c"
            java.lang.String r10 = r3.a     // Catch:{ all -> 0x01be }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x01be }
            if (r9 == 0) goto L_0x05ab
            r4 = r5
        L_0x05a1:
            int r5 = r6 + 1
            r6 = r5
            r5 = r4
            r4 = r3
            goto L_0x0592
        L_0x05a7:
            int r3 = r3 + 1
            goto L_0x04f7
        L_0x05ab:
            java.lang.String r9 = "_err"
            java.lang.String r3 = r3.a     // Catch:{ all -> 0x01be }
            boolean r3 = r9.equals(r3)     // Catch:{ all -> 0x01be }
            if (r3 == 0) goto L_0x0ad0
            r3 = 1
            r29 = r4
            r4 = r3
            r3 = r29
            goto L_0x05a1
        L_0x05bc:
            if (r5 == 0) goto L_0x05e8
            if (r4 == 0) goto L_0x05e8
            com.google.android.gms.internal.xe[] r3 = r2.a     // Catch:{ all -> 0x01be }
            r5 = 1
            com.google.android.gms.internal.xe[] r5 = new com.google.android.gms.internal.xe[r5]     // Catch:{ all -> 0x01be }
            r6 = 0
            r5[r6] = r4     // Catch:{ all -> 0x01be }
            java.lang.Object[] r3 = com.google.android.gms.common.util.a.a(r3, r5)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe[] r3 = (com.google.android.gms.internal.xe[]) r3     // Catch:{ all -> 0x01be }
            r2.a = r3     // Catch:{ all -> 0x01be }
            r4 = r17
        L_0x05d2:
            r0 = r22
            com.google.android.gms.internal.xd[] r5 = r0.b     // Catch:{ all -> 0x01be }
            int r3 = r12 + 1
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd r2 = (com.google.android.gms.internal.xd) r2     // Catch:{ all -> 0x01be }
            r5[r12] = r2     // Catch:{ all -> 0x01be }
            r2 = r3
            r3 = r4
            goto L_0x0158
        L_0x05e8:
            if (r4 == 0) goto L_0x05f9
            java.lang.String r2 = "_err"
            r4.a = r2     // Catch:{ all -> 0x01be }
            r2 = 10
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01be }
            r4.c = r2     // Catch:{ all -> 0x01be }
            r4 = r17
            goto L_0x05d2
        L_0x05f9:
            com.google.android.gms.internal.sj r2 = r30.f()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "Did not find conversion parameter. appId"
            r0 = r21
            com.google.android.gms.internal.xg r4 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r4 = r4.o     // Catch:{ all -> 0x01be }
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r4)     // Catch:{ all -> 0x01be }
            r2.a(r3, r4)     // Catch:{ all -> 0x01be }
        L_0x0610:
            r4 = r17
            goto L_0x05d2
        L_0x0613:
            r0 = r21
            java.util.List<com.google.android.gms.internal.xd> r2 = r0.c     // Catch:{ all -> 0x01be }
            int r2 = r2.size()     // Catch:{ all -> 0x01be }
            if (r12 >= r2) goto L_0x062b
            r0 = r22
            com.google.android.gms.internal.xd[] r2 = r0.b     // Catch:{ all -> 0x01be }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r12)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd[] r2 = (com.google.android.gms.internal.xd[]) r2     // Catch:{ all -> 0x01be }
            r0 = r22
            r0.b = r2     // Catch:{ all -> 0x01be }
        L_0x062b:
            r0 = r21
            com.google.android.gms.internal.xg r2 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r2.o     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r3 = r0.a     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xi[] r3 = r3.c     // Catch:{ all -> 0x01be }
            r0 = r22
            com.google.android.gms.internal.xd[] r4 = r0.b     // Catch:{ all -> 0x01be }
            r0 = r30
            com.google.android.gms.internal.xc[] r2 = r0.a((java.lang.String) r2, (com.google.android.gms.internal.xi[]) r3, (com.google.android.gms.internal.xd[]) r4)     // Catch:{ all -> 0x01be }
            r0 = r22
            r0.A = r2     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.sa<java.lang.Boolean> r2 = com.google.android.gms.internal.rz.b     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.b()     // Catch:{ all -> 0x01be }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x01be }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x091d
            r0 = r30
            com.google.android.gms.internal.rj r2 = r0.c     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r3 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r3 = r3.o     // Catch:{ all -> 0x01be }
            java.lang.String r4 = "1"
            com.google.android.gms.internal.te r2 = r2.q()     // Catch:{ all -> 0x01be }
            java.lang.String r5 = "measurement.event_sampling_enabled"
            java.lang.String r2 = r2.a((java.lang.String) r3, (java.lang.String) r5)     // Catch:{ all -> 0x01be }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x091d
            java.util.HashMap r23 = new java.util.HashMap     // Catch:{ all -> 0x01be }
            r23.<init>()     // Catch:{ all -> 0x01be }
            r0 = r22
            com.google.android.gms.internal.xd[] r2 = r0.b     // Catch:{ all -> 0x01be }
            int r2 = r2.length     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd[] r0 = new com.google.android.gms.internal.xd[r2]     // Catch:{ all -> 0x01be }
            r24 = r0
            r18 = 0
            com.google.android.gms.internal.wr r2 = r30.o()     // Catch:{ all -> 0x01be }
            java.security.SecureRandom r25 = r2.z()     // Catch:{ all -> 0x01be }
            r0 = r22
            com.google.android.gms.internal.xd[] r0 = r0.b     // Catch:{ all -> 0x01be }
            r26 = r0
            r0 = r26
            int r0 = r0.length     // Catch:{ all -> 0x01be }
            r27 = r0
            r2 = 0
            r20 = r2
        L_0x0695:
            r0 = r20
            r1 = r27
            if (r0 >= r1) goto L_0x08e4
            r28 = r26[r20]     // Catch:{ all -> 0x01be }
            r0 = r28
            java.lang.String r2 = r0.b     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "_ep"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x0725
            r30.o()     // Catch:{ all -> 0x01be }
            java.lang.String r2 = "_en"
            r0 = r28
            java.lang.Object r2 = com.google.android.gms.internal.wr.a((com.google.android.gms.internal.xd) r0, (java.lang.String) r2)     // Catch:{ all -> 0x01be }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01be }
            r0 = r23
            java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rs r3 = (com.google.android.gms.internal.rs) r3     // Catch:{ all -> 0x01be }
            if (r3 != 0) goto L_0x06d3
            com.google.android.gms.internal.rk r3 = r30.q()     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r4 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r4 = r4.o     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rs r3 = r3.a((java.lang.String) r4, (java.lang.String) r2)     // Catch:{ all -> 0x01be }
            r0 = r23
            r0.put(r2, r3)     // Catch:{ all -> 0x01be }
        L_0x06d3:
            java.lang.Long r2 = r3.g     // Catch:{ all -> 0x01be }
            if (r2 != 0) goto L_0x08e0
            java.lang.Long r2 = r3.h     // Catch:{ all -> 0x01be }
            long r4 = r2.longValue()     // Catch:{ all -> 0x01be }
            r6 = 1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x06f6
            r30.o()     // Catch:{ all -> 0x01be }
            r0 = r28
            com.google.android.gms.internal.xe[] r2 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r4 = "_sr"
            java.lang.Long r5 = r3.h     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe[] r2 = com.google.android.gms.internal.wr.a((com.google.android.gms.internal.xe[]) r2, (java.lang.String) r4, (java.lang.Object) r5)     // Catch:{ all -> 0x01be }
            r0 = r28
            r0.a = r2     // Catch:{ all -> 0x01be }
        L_0x06f6:
            java.lang.Boolean r2 = r3.i     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x0719
            java.lang.Boolean r2 = r3.i     // Catch:{ all -> 0x01be }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x0719
            r30.o()     // Catch:{ all -> 0x01be }
            r0 = r28
            com.google.android.gms.internal.xe[] r2 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "_efs"
            r4 = 1
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe[] r2 = com.google.android.gms.internal.wr.a((com.google.android.gms.internal.xe[]) r2, (java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ all -> 0x01be }
            r0 = r28
            r0.a = r2     // Catch:{ all -> 0x01be }
        L_0x0719:
            int r2 = r18 + 1
            r24[r18] = r28     // Catch:{ all -> 0x01be }
        L_0x071d:
            int r3 = r20 + 1
            r20 = r3
            r18 = r2
            goto L_0x0695
        L_0x0725:
            r2 = 1
            java.lang.String r3 = "_dbg"
            r4 = 1
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x01be }
            r0 = r28
            boolean r3 = a((com.google.android.gms.internal.xd) r0, (java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ all -> 0x01be }
            if (r3 != 0) goto L_0x0acc
            com.google.android.gms.internal.te r2 = r30.j()     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r3 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r3 = r3.o     // Catch:{ all -> 0x01be }
            r0 = r28
            java.lang.String r4 = r0.b     // Catch:{ all -> 0x01be }
            int r2 = r2.d(r3, r4)     // Catch:{ all -> 0x01be }
            r19 = r2
        L_0x074a:
            if (r19 > 0) goto L_0x0766
            com.google.android.gms.internal.sj r2 = r30.f()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.sl r2 = r2.A()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "Sample rate must be positive. event, rate"
            r0 = r28
            java.lang.String r4 = r0.b     // Catch:{ all -> 0x01be }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x01be }
            r2.a(r3, r4, r5)     // Catch:{ all -> 0x01be }
            int r2 = r18 + 1
            r24[r18] = r28     // Catch:{ all -> 0x01be }
            goto L_0x071d
        L_0x0766:
            r0 = r28
            java.lang.String r2 = r0.b     // Catch:{ all -> 0x01be }
            r0 = r23
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rs r2 = (com.google.android.gms.internal.rs) r2     // Catch:{ all -> 0x01be }
            if (r2 != 0) goto L_0x0ac9
            com.google.android.gms.internal.rk r2 = r30.q()     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r3 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r3 = r3.o     // Catch:{ all -> 0x01be }
            r0 = r28
            java.lang.String r4 = r0.b     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rs r3 = r2.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x01be }
            if (r3 != 0) goto L_0x07c0
            com.google.android.gms.internal.sj r2 = r30.f()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.sl r2 = r2.A()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "Event being bundled has no eventAggregate. appId, eventName"
            r0 = r21
            com.google.android.gms.internal.xg r4 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r4 = r4.o     // Catch:{ all -> 0x01be }
            r0 = r28
            java.lang.String r5 = r0.b     // Catch:{ all -> 0x01be }
            r2.a(r3, r4, r5)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rs r3 = new com.google.android.gms.internal.rs     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r2 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r4 = r2.o     // Catch:{ all -> 0x01be }
            r0 = r28
            java.lang.String r5 = r0.b     // Catch:{ all -> 0x01be }
            r6 = 1
            r8 = 1
            r0 = r28
            java.lang.Long r2 = r0.c     // Catch:{ all -> 0x01be }
            long r10 = r2.longValue()     // Catch:{ all -> 0x01be }
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r3.<init>(r4, r5, r6, r8, r10, r12, r14, r15, r16)     // Catch:{ all -> 0x01be }
        L_0x07c0:
            r30.o()     // Catch:{ all -> 0x01be }
            java.lang.String r2 = "_eid"
            r0 = r28
            java.lang.Object r2 = com.google.android.gms.internal.wr.a((com.google.android.gms.internal.xd) r0, (java.lang.String) r2)     // Catch:{ all -> 0x01be }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x0801
            r4 = 1
        L_0x07d0:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x01be }
            r5 = 1
            r0 = r19
            if (r0 != r5) goto L_0x0803
            int r2 = r18 + 1
            r24[r18] = r28     // Catch:{ all -> 0x01be }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01be }
            if (r4 == 0) goto L_0x071d
            java.lang.Long r4 = r3.g     // Catch:{ all -> 0x01be }
            if (r4 != 0) goto L_0x07ef
            java.lang.Long r4 = r3.h     // Catch:{ all -> 0x01be }
            if (r4 != 0) goto L_0x07ef
            java.lang.Boolean r4 = r3.i     // Catch:{ all -> 0x01be }
            if (r4 == 0) goto L_0x071d
        L_0x07ef:
            r4 = 0
            r5 = 0
            r6 = 0
            com.google.android.gms.internal.rs r3 = r3.a(r4, r5, r6)     // Catch:{ all -> 0x01be }
            r0 = r28
            java.lang.String r4 = r0.b     // Catch:{ all -> 0x01be }
            r0 = r23
            r0.put(r4, r3)     // Catch:{ all -> 0x01be }
            goto L_0x071d
        L_0x0801:
            r4 = 0
            goto L_0x07d0
        L_0x0803:
            r0 = r25
            r1 = r19
            int r5 = r0.nextInt(r1)     // Catch:{ all -> 0x01be }
            if (r5 != 0) goto L_0x0853
            r30.o()     // Catch:{ all -> 0x01be }
            r0 = r28
            com.google.android.gms.internal.xe[] r2 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r5 = "_sr"
            r0 = r19
            long r6 = (long) r0     // Catch:{ all -> 0x01be }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe[] r2 = com.google.android.gms.internal.wr.a((com.google.android.gms.internal.xe[]) r2, (java.lang.String) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x01be }
            r0 = r28
            r0.a = r2     // Catch:{ all -> 0x01be }
            int r2 = r18 + 1
            r24[r18] = r28     // Catch:{ all -> 0x01be }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01be }
            if (r4 == 0) goto L_0x083c
            r4 = 0
            r0 = r19
            long r6 = (long) r0     // Catch:{ all -> 0x01be }
            java.lang.Long r5 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01be }
            r6 = 0
            com.google.android.gms.internal.rs r3 = r3.a(r4, r5, r6)     // Catch:{ all -> 0x01be }
        L_0x083c:
            r0 = r28
            java.lang.String r4 = r0.b     // Catch:{ all -> 0x01be }
            r0 = r28
            java.lang.Long r5 = r0.c     // Catch:{ all -> 0x01be }
            long r6 = r5.longValue()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rs r3 = r3.b(r6)     // Catch:{ all -> 0x01be }
            r0 = r23
            r0.put(r4, r3)     // Catch:{ all -> 0x01be }
            goto L_0x071d
        L_0x0853:
            long r6 = r3.f     // Catch:{ all -> 0x01be }
            r0 = r28
            java.lang.Long r5 = r0.c     // Catch:{ all -> 0x01be }
            long r8 = r5.longValue()     // Catch:{ all -> 0x01be }
            long r6 = r8 - r6
            long r6 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x01be }
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x08cb
            r30.o()     // Catch:{ all -> 0x01be }
            r0 = r28
            com.google.android.gms.internal.xe[] r2 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r5 = "_efs"
            r6 = 1
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe[] r2 = com.google.android.gms.internal.wr.a((com.google.android.gms.internal.xe[]) r2, (java.lang.String) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x01be }
            r0 = r28
            r0.a = r2     // Catch:{ all -> 0x01be }
            r30.o()     // Catch:{ all -> 0x01be }
            r0 = r28
            com.google.android.gms.internal.xe[] r2 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r5 = "_sr"
            r0 = r19
            long r6 = (long) r0     // Catch:{ all -> 0x01be }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xe[] r2 = com.google.android.gms.internal.wr.a((com.google.android.gms.internal.xe[]) r2, (java.lang.String) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x01be }
            r0 = r28
            r0.a = r2     // Catch:{ all -> 0x01be }
            int r2 = r18 + 1
            r24[r18] = r28     // Catch:{ all -> 0x01be }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01be }
            if (r4 == 0) goto L_0x08b4
            r4 = 0
            r0 = r19
            long r6 = (long) r0     // Catch:{ all -> 0x01be }
            java.lang.Long r5 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01be }
            r6 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rs r3 = r3.a(r4, r5, r6)     // Catch:{ all -> 0x01be }
        L_0x08b4:
            r0 = r28
            java.lang.String r4 = r0.b     // Catch:{ all -> 0x01be }
            r0 = r28
            java.lang.Long r5 = r0.c     // Catch:{ all -> 0x01be }
            long r6 = r5.longValue()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rs r3 = r3.b(r6)     // Catch:{ all -> 0x01be }
            r0 = r23
            r0.put(r4, r3)     // Catch:{ all -> 0x01be }
            goto L_0x071d
        L_0x08cb:
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01be }
            if (r4 == 0) goto L_0x08e0
            r0 = r28
            java.lang.String r4 = r0.b     // Catch:{ all -> 0x01be }
            r5 = 0
            r6 = 0
            com.google.android.gms.internal.rs r2 = r3.a(r2, r5, r6)     // Catch:{ all -> 0x01be }
            r0 = r23
            r0.put(r4, r2)     // Catch:{ all -> 0x01be }
        L_0x08e0:
            r2 = r18
            goto L_0x071d
        L_0x08e4:
            r0 = r22
            com.google.android.gms.internal.xd[] r2 = r0.b     // Catch:{ all -> 0x01be }
            int r2 = r2.length     // Catch:{ all -> 0x01be }
            r0 = r18
            if (r0 >= r2) goto L_0x08fb
            r0 = r24
            r1 = r18
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.xd[] r2 = (com.google.android.gms.internal.xd[]) r2     // Catch:{ all -> 0x01be }
            r0 = r22
            r0.b = r2     // Catch:{ all -> 0x01be }
        L_0x08fb:
            java.util.Set r2 = r23.entrySet()     // Catch:{ all -> 0x01be }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x01be }
        L_0x0903:
            boolean r2 = r3.hasNext()     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x091d
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x01be }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rk r4 = r30.q()     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rs r2 = (com.google.android.gms.internal.rs) r2     // Catch:{ all -> 0x01be }
            r4.a((com.google.android.gms.internal.rs) r2)     // Catch:{ all -> 0x01be }
            goto L_0x0903
        L_0x091d:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01be }
            r0 = r22
            r0.e = r2     // Catch:{ all -> 0x01be }
            r2 = -9223372036854775808
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01be }
            r0 = r22
            r0.f = r2     // Catch:{ all -> 0x01be }
            r2 = 0
        L_0x0935:
            r0 = r22
            com.google.android.gms.internal.xd[] r3 = r0.b     // Catch:{ all -> 0x01be }
            int r3 = r3.length     // Catch:{ all -> 0x01be }
            if (r2 >= r3) goto L_0x0975
            r0 = r22
            com.google.android.gms.internal.xd[] r3 = r0.b     // Catch:{ all -> 0x01be }
            r3 = r3[r2]     // Catch:{ all -> 0x01be }
            java.lang.Long r4 = r3.c     // Catch:{ all -> 0x01be }
            long r4 = r4.longValue()     // Catch:{ all -> 0x01be }
            r0 = r22
            java.lang.Long r6 = r0.e     // Catch:{ all -> 0x01be }
            long r6 = r6.longValue()     // Catch:{ all -> 0x01be }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x095a
            java.lang.Long r4 = r3.c     // Catch:{ all -> 0x01be }
            r0 = r22
            r0.e = r4     // Catch:{ all -> 0x01be }
        L_0x095a:
            java.lang.Long r4 = r3.c     // Catch:{ all -> 0x01be }
            long r4 = r4.longValue()     // Catch:{ all -> 0x01be }
            r0 = r22
            java.lang.Long r6 = r0.f     // Catch:{ all -> 0x01be }
            long r6 = r6.longValue()     // Catch:{ all -> 0x01be }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0972
            java.lang.Long r3 = r3.c     // Catch:{ all -> 0x01be }
            r0 = r22
            r0.f = r3     // Catch:{ all -> 0x01be }
        L_0x0972:
            int r2 = r2 + 1
            goto L_0x0935
        L_0x0975:
            r0 = r21
            com.google.android.gms.internal.xg r2 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r6 = r2.o     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rk r2 = r30.q()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rd r7 = r2.b(r6)     // Catch:{ all -> 0x01be }
            if (r7 != 0) goto L_0x0a09
            com.google.android.gms.internal.sj r2 = r30.f()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.sl r2 = r2.y()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "Bundling raw events w/o app info. appId"
            r0 = r21
            com.google.android.gms.internal.xg r4 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r4 = r4.o     // Catch:{ all -> 0x01be }
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r4)     // Catch:{ all -> 0x01be }
            r2.a(r3, r4)     // Catch:{ all -> 0x01be }
        L_0x099c:
            r0 = r22
            com.google.android.gms.internal.xd[] r2 = r0.b     // Catch:{ all -> 0x01be }
            int r2 = r2.length     // Catch:{ all -> 0x01be }
            if (r2 <= 0) goto L_0x09d8
            com.google.android.gms.internal.te r2 = r30.j()     // Catch:{ all -> 0x01be }
            r0 = r21
            com.google.android.gms.internal.xg r3 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r3 = r3.o     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.wz r2 = r2.a((java.lang.String) r3)     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x09b7
            java.lang.Long r3 = r2.a     // Catch:{ all -> 0x01be }
            if (r3 != 0) goto L_0x0a8e
        L_0x09b7:
            r0 = r21
            com.google.android.gms.internal.xg r2 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r2.y     // Catch:{ all -> 0x01be }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x0a75
            r2 = -1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01be }
            r0 = r22
            r0.E = r2     // Catch:{ all -> 0x01be }
        L_0x09cd:
            com.google.android.gms.internal.rk r2 = r30.q()     // Catch:{ all -> 0x01be }
            r0 = r22
            r1 = r17
            r2.a((com.google.android.gms.internal.xg) r0, (boolean) r1)     // Catch:{ all -> 0x01be }
        L_0x09d8:
            com.google.android.gms.internal.rk r2 = r30.q()     // Catch:{ all -> 0x01be }
            r0 = r21
            java.util.List<java.lang.Long> r3 = r0.b     // Catch:{ all -> 0x01be }
            r2.a((java.util.List<java.lang.Long>) r3)     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rk r3 = r30.q()     // Catch:{ all -> 0x01be }
            android.database.sqlite.SQLiteDatabase r2 = r3.A()     // Catch:{ all -> 0x01be }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0a96 }
            r7 = 0
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x0a96 }
            r7 = 1
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x0a96 }
            r2.execSQL(r4, r5)     // Catch:{ SQLiteException -> 0x0a96 }
        L_0x09f9:
            com.google.android.gms.internal.rk r2 = r30.q()     // Catch:{ all -> 0x01be }
            r2.y()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rk r2 = r30.q()
            r2.z()
            r2 = 1
        L_0x0a08:
            return r2
        L_0x0a09:
            r0 = r22
            com.google.android.gms.internal.xd[] r2 = r0.b     // Catch:{ all -> 0x01be }
            int r2 = r2.length     // Catch:{ all -> 0x01be }
            if (r2 <= 0) goto L_0x099c
            long r2 = r7.h()     // Catch:{ all -> 0x01be }
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0a71
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01be }
        L_0x0a1e:
            r0 = r22
            r0.h = r4     // Catch:{ all -> 0x01be }
            long r4 = r7.g()     // Catch:{ all -> 0x01be }
            r8 = 0
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x0ac6
        L_0x0a2c:
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0a73
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01be }
        L_0x0a36:
            r0 = r22
            r0.g = r2     // Catch:{ all -> 0x01be }
            r7.r()     // Catch:{ all -> 0x01be }
            long r2 = r7.o()     // Catch:{ all -> 0x01be }
            int r2 = (int) r2     // Catch:{ all -> 0x01be }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x01be }
            r0 = r22
            r0.w = r2     // Catch:{ all -> 0x01be }
            r0 = r22
            java.lang.Long r2 = r0.e     // Catch:{ all -> 0x01be }
            long r2 = r2.longValue()     // Catch:{ all -> 0x01be }
            r7.a((long) r2)     // Catch:{ all -> 0x01be }
            r0 = r22
            java.lang.Long r2 = r0.f     // Catch:{ all -> 0x01be }
            long r2 = r2.longValue()     // Catch:{ all -> 0x01be }
            r7.b((long) r2)     // Catch:{ all -> 0x01be }
            java.lang.String r2 = r7.z()     // Catch:{ all -> 0x01be }
            r0 = r22
            r0.x = r2     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rk r2 = r30.q()     // Catch:{ all -> 0x01be }
            r2.a((com.google.android.gms.internal.rd) r7)     // Catch:{ all -> 0x01be }
            goto L_0x099c
        L_0x0a71:
            r4 = 0
            goto L_0x0a1e
        L_0x0a73:
            r2 = 0
            goto L_0x0a36
        L_0x0a75:
            com.google.android.gms.internal.sj r2 = r30.f()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.sl r2 = r2.A()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = "Did not find measurement config or missing version info. appId"
            r0 = r21
            com.google.android.gms.internal.xg r4 = r0.a     // Catch:{ all -> 0x01be }
            java.lang.String r4 = r4.o     // Catch:{ all -> 0x01be }
            java.lang.Object r4 = com.google.android.gms.internal.sj.a((java.lang.String) r4)     // Catch:{ all -> 0x01be }
            r2.a(r3, r4)     // Catch:{ all -> 0x01be }
            goto L_0x09cd
        L_0x0a8e:
            java.lang.Long r2 = r2.a     // Catch:{ all -> 0x01be }
            r0 = r22
            r0.E = r2     // Catch:{ all -> 0x01be }
            goto L_0x09cd
        L_0x0a96:
            r2 = move-exception
            com.google.android.gms.internal.sj r3 = r3.t()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.sl r3 = r3.y()     // Catch:{ all -> 0x01be }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.internal.sj.a((java.lang.String) r6)     // Catch:{ all -> 0x01be }
            r3.a(r4, r5, r2)     // Catch:{ all -> 0x01be }
            goto L_0x09f9
        L_0x0aaa:
            com.google.android.gms.internal.rk r2 = r30.q()     // Catch:{ all -> 0x01be }
            r2.y()     // Catch:{ all -> 0x01be }
            com.google.android.gms.internal.rk r2 = r30.q()
            r2.z()
            r2 = 0
            goto L_0x0a08
        L_0x0abb:
            r2 = move-exception
            r3 = r11
            goto L_0x0354
        L_0x0abf:
            r2 = move-exception
            goto L_0x02e3
        L_0x0ac2:
            r2 = move-exception
            r4 = r12
            goto L_0x02e3
        L_0x0ac6:
            r2 = r4
            goto L_0x0a2c
        L_0x0ac9:
            r3 = r2
            goto L_0x07c0
        L_0x0acc:
            r19 = r2
            goto L_0x074a
        L_0x0ad0:
            r3 = r4
            r4 = r5
            goto L_0x05a1
        L_0x0ad4:
            r17 = r2
            goto L_0x0528
        L_0x0ad8:
            r2 = r4
            goto L_0x03d8
        L_0x0adb:
            r2 = r12
            r3 = r17
            goto L_0x0158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tk.a(java.lang.String, long):boolean");
    }

    private final boolean a(String str, rx rxVar) {
        long longValue;
        wq wqVar;
        String d2 = rxVar.b.d("currency");
        if ("ecommerce_purchase".equals(rxVar.a)) {
            double doubleValue = rxVar.b.c("value").doubleValue() * 1000000.0d;
            if (doubleValue == 0.0d) {
                doubleValue = ((double) rxVar.b.b("value").longValue()) * 1000000.0d;
            }
            if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                f().A().a("Data lost. Currency value is too big. appId", sj.a(str), Double.valueOf(doubleValue));
                return false;
            }
            longValue = Math.round(doubleValue);
        } else {
            longValue = rxVar.b.b("value").longValue();
        }
        if (!TextUtils.isEmpty(d2)) {
            String upperCase = d2.toUpperCase(Locale.US);
            if (upperCase.matches("[A-Z]{3}")) {
                String valueOf = String.valueOf("_ltv_");
                String valueOf2 = String.valueOf(upperCase);
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                wq c2 = q().c(str, concat);
                if (c2 == null || !(c2.e instanceof Long)) {
                    rk q2 = q();
                    int b2 = this.c.b(str, rz.G) - 1;
                    y.a(str);
                    q2.c();
                    q2.Q();
                    try {
                        q2.A().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str, str, String.valueOf(b2)});
                    } catch (SQLiteException e2) {
                        q2.t().y().a("Error pruning currencies. appId", sj.a(str), e2);
                    }
                    wqVar = new wq(str, rxVar.c, concat, this.p.a(), Long.valueOf(longValue));
                } else {
                    wqVar = new wq(str, rxVar.c, concat, this.p.a(), Long.valueOf(longValue + ((Long) c2.e).longValue()));
                }
                if (!q().a(wqVar)) {
                    f().y().a("Too many unique user properties are set. Ignoring user property. appId", sj.a(str), p().c(wqVar.c), wqVar.e);
                    o().a(str, 9, (String) null, (String) null, 0);
                }
            }
        }
        return true;
    }

    private final xc[] a(String str, xi[] xiVarArr, xd[] xdVarArr) {
        y.a(str);
        return z().a(str, xdVarArr, xiVarArr);
    }

    private final re b(String str) {
        rd b2 = q().b(str);
        if (b2 == null || TextUtils.isEmpty(b2.i())) {
            f().D().a("No app data available; dropping", str);
            return null;
        }
        try {
            String str2 = pw.a(this.b).b(str, 0).versionName;
            if (b2.i() != null && !b2.i().equals(str2)) {
                f().A().a("App version does not match; dropping. appId", sj.a(str));
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
        }
        return new re(str, b2.d(), b2.i(), b2.j(), b2.k(), b2.l(), b2.m(), (String) null, b2.n(), false, b2.f(), b2.A(), 0, 0, b2.B());
    }

    private final void b(rx rxVar, re reVar) {
        rs a2;
        rr rrVar;
        xg xgVar;
        boolean z2;
        rd b2;
        y.a(reVar);
        y.a(reVar.a);
        long nanoTime = System.nanoTime();
        h().c();
        a();
        String str = reVar.a;
        o();
        if (wr.a(rxVar, reVar)) {
            if (!reVar.h) {
                d(reVar);
            } else if (j().b(str, rxVar.a)) {
                f().A().a("Dropping blacklisted event. appId", sj.a(str), p().a(rxVar.a));
                boolean z3 = o().l(str) || o().m(str);
                if (!z3 && !"_err".equals(rxVar.a)) {
                    o().a(str, 11, "_ev", rxVar.a, 0);
                }
                if (z3 && (b2 = q().b(str)) != null) {
                    if (Math.abs(this.p.a() - Math.max(b2.q(), b2.p())) > rz.B.b().longValue()) {
                        f().D().a("Fetching config for blacklisted app");
                        a(b2);
                    }
                }
            } else {
                if (f().a(2)) {
                    f().E().a("Logging event", p().a(rxVar));
                }
                q().x();
                try {
                    d(reVar);
                    if (("_iap".equals(rxVar.a) || "ecommerce_purchase".equals(rxVar.a)) && !a(str, rxVar)) {
                        q().y();
                        q().z();
                        return;
                    }
                    boolean a3 = wr.a(rxVar.a);
                    boolean equals = "_err".equals(rxVar.a);
                    rl a4 = q().a(L(), str, true, a3, false, equals, false);
                    long intValue = a4.b - ((long) rz.m.b().intValue());
                    if (intValue > 0) {
                        if (intValue % 1000 == 1) {
                            f().y().a("Data loss. Too many events logged. appId, count", sj.a(str), Long.valueOf(a4.b));
                        }
                        q().y();
                        q().z();
                        return;
                    }
                    if (a3) {
                        long intValue2 = a4.a - ((long) rz.o.b().intValue());
                        if (intValue2 > 0) {
                            if (intValue2 % 1000 == 1) {
                                f().y().a("Data loss. Too many public events logged. appId, count", sj.a(str), Long.valueOf(a4.a));
                            }
                            o().a(str, 16, "_ev", rxVar.a, 0);
                            q().y();
                            q().z();
                            return;
                        }
                    }
                    if (equals) {
                        long max = a4.d - ((long) Math.max(0, Math.min(1000000, this.c.b(reVar.a, rz.n))));
                        if (max > 0) {
                            if (max == 1) {
                                f().y().a("Too many error events logged. appId, count", sj.a(str), Long.valueOf(a4.d));
                            }
                            q().y();
                            q().z();
                            return;
                        }
                    }
                    Bundle b3 = rxVar.b.b();
                    o().a(b3, "_o", (Object) rxVar.c);
                    if (o().j(str)) {
                        o().a(b3, "_dbg", (Object) 1L);
                        o().a(b3, "_r", (Object) 1L);
                    }
                    long c2 = q().c(str);
                    if (c2 > 0) {
                        f().A().a("Data lost. Too many events stored on disk, deleted. appId", sj.a(str), Long.valueOf(c2));
                    }
                    rr rrVar2 = new rr(this, rxVar.c, str, rxVar.a, rxVar.d, 0, b3);
                    rs a5 = q().a(str, rrVar2.b);
                    if (a5 != null) {
                        rr a6 = rrVar2.a(this, a5.e);
                        a2 = a5.a(a6.c);
                        rrVar = a6;
                    } else if (q().f(str) < 500 || !a3) {
                        a2 = new rs(str, rrVar2.b, 0, 0, rrVar2.c, 0, (Long) null, (Long) null, (Boolean) null);
                        rrVar = rrVar2;
                    } else {
                        f().y().a("Too many event names used, ignoring event. appId, name, supported count", sj.a(str), p().a(rrVar2.b), 500);
                        o().a(str, 8, (String) null, (String) null, 0);
                        q().z();
                        return;
                    }
                    q().a(a2);
                    h().c();
                    a();
                    y.a(rrVar);
                    y.a(reVar);
                    y.a(rrVar.a);
                    y.b(rrVar.a.equals(reVar.a));
                    xgVar = new xg();
                    xgVar.a = 1;
                    xgVar.i = "android";
                    xgVar.o = reVar.a;
                    xgVar.n = reVar.d;
                    xgVar.p = reVar.c;
                    xgVar.C = reVar.j == -2147483648L ? null : Integer.valueOf((int) reVar.j);
                    xgVar.q = Long.valueOf(reVar.e);
                    xgVar.y = reVar.b;
                    xgVar.v = reVar.f == 0 ? null : Long.valueOf(reVar.f);
                    Pair<String, Boolean> a7 = e().a(reVar.a);
                    if (a7 == null || TextUtils.isEmpty((CharSequence) a7.first)) {
                        if (!x().a(this.b)) {
                            String string = Settings.Secure.getString(this.b.getContentResolver(), "android_id");
                            if (string == null) {
                                f().A().a("null secure ID. appId", sj.a(xgVar.o));
                                string = "null";
                            } else if (string.isEmpty()) {
                                f().A().a("empty secure ID. appId", sj.a(xgVar.o));
                            }
                            xgVar.D = string;
                        }
                    } else if (reVar.o) {
                        xgVar.s = (String) a7.first;
                        xgVar.t = (Boolean) a7.second;
                    }
                    x().Q();
                    xgVar.k = Build.MODEL;
                    x().Q();
                    xgVar.j = Build.VERSION.RELEASE;
                    xgVar.m = Integer.valueOf((int) x().x());
                    xgVar.l = x().y();
                    xgVar.r = null;
                    xgVar.d = null;
                    xgVar.e = null;
                    xgVar.f = null;
                    xgVar.F = Long.valueOf(reVar.l);
                    if (B() && rj.B()) {
                        y();
                        xgVar.G = null;
                    }
                    rd b4 = q().b(reVar.a);
                    if (b4 == null) {
                        b4 = new rd(this, reVar.a);
                        b4.a(y().y());
                        b4.d(reVar.k);
                        b4.b(reVar.b);
                        b4.c(e().b(reVar.a));
                        b4.f(0);
                        b4.a(0);
                        b4.b(0);
                        b4.e(reVar.c);
                        b4.c(reVar.j);
                        b4.f(reVar.d);
                        b4.d(reVar.e);
                        b4.e(reVar.f);
                        b4.a(reVar.h);
                        b4.o(reVar.l);
                        q().a(b4);
                    }
                    xgVar.u = b4.c();
                    xgVar.B = b4.f();
                    List<wq> a8 = q().a(reVar.a);
                    xgVar.c = new xi[a8.size()];
                    for (int i2 = 0; i2 < a8.size(); i2++) {
                        xi xiVar = new xi();
                        xgVar.c[i2] = xiVar;
                        xiVar.b = a8.get(i2).c;
                        xiVar.a = Long.valueOf(a8.get(i2).d);
                        o().a(xiVar, a8.get(i2).e);
                    }
                    long a9 = q().a(xgVar);
                    rk q2 = q();
                    if (rrVar.e != null) {
                        Iterator<String> it = rrVar.e.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if ("_r".equals(it.next())) {
                                    z2 = true;
                                    break;
                                }
                            } else {
                                boolean c3 = j().c(rrVar.a, rrVar.b);
                                rl a10 = q().a(L(), rrVar.a, false, false, false, false, false);
                                if (c3) {
                                    if (a10.e < ((long) this.c.a(rrVar.a))) {
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                    if (q2.a(rrVar, a9, z2)) {
                        this.K = 0;
                    }
                    q().y();
                    if (f().a(2)) {
                        f().E().a("Event recorded", p().a(rrVar));
                    }
                    q().z();
                    N();
                    f().E().a("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                } catch (IOException e2) {
                    f().y().a("Data loss. Failed to insert raw event metadata. appId", sj.a(xgVar.o), e2);
                } catch (Throwable th) {
                    q().z();
                    throw th;
                }
            }
        }
    }

    private static void b(uk ukVar) {
        if (ukVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!ukVar.P()) {
            throw new IllegalStateException("Component not initialized");
        }
    }

    private final void d(re reVar) {
        boolean z2 = true;
        h().c();
        a();
        y.a(reVar);
        y.a(reVar.a);
        rd b2 = q().b(reVar.a);
        String b3 = e().b(reVar.a);
        boolean z3 = false;
        if (b2 == null) {
            rd rdVar = new rd(this, reVar.a);
            rdVar.a(y().y());
            rdVar.c(b3);
            b2 = rdVar;
            z3 = true;
        } else if (!b3.equals(b2.e())) {
            b2.c(b3);
            b2.a(y().y());
            z3 = true;
        }
        if (!TextUtils.isEmpty(reVar.b) && !reVar.b.equals(b2.d())) {
            b2.b(reVar.b);
            z3 = true;
        }
        if (!TextUtils.isEmpty(reVar.k) && !reVar.k.equals(b2.f())) {
            b2.d(reVar.k);
            z3 = true;
        }
        if (!(reVar.e == 0 || reVar.e == b2.l())) {
            b2.d(reVar.e);
            z3 = true;
        }
        if (!TextUtils.isEmpty(reVar.c) && !reVar.c.equals(b2.i())) {
            b2.e(reVar.c);
            z3 = true;
        }
        if (reVar.j != b2.j()) {
            b2.c(reVar.j);
            z3 = true;
        }
        if (reVar.d != null && !reVar.d.equals(b2.k())) {
            b2.f(reVar.d);
            z3 = true;
        }
        if (reVar.f != b2.m()) {
            b2.e(reVar.f);
            z3 = true;
        }
        if (reVar.h != b2.n()) {
            b2.a(reVar.h);
            z3 = true;
        }
        if (!TextUtils.isEmpty(reVar.g) && !reVar.g.equals(b2.y())) {
            b2.g(reVar.g);
            z3 = true;
        }
        if (reVar.l != b2.A()) {
            b2.o(reVar.l);
            z3 = true;
        }
        if (reVar.o != b2.B()) {
            b2.b(reVar.o);
        } else {
            z2 = z3;
        }
        if (z2) {
            q().a(b2);
        }
    }

    public final qz A() {
        a((uj) this.y);
        return this.y;
    }

    public final boolean B() {
        boolean z2 = false;
        h().c();
        a();
        if (this.c.x()) {
            return false;
        }
        Boolean b2 = this.c.b("firebase_analytics_collection_enabled");
        if (b2 != null) {
            z2 = b2.booleanValue();
        } else if (!com.google.android.gms.common.api.internal.a.b()) {
            z2 = true;
        }
        return e().c(z2);
    }

    /* access modifiers changed from: package-private */
    public final long C() {
        Long valueOf = Long.valueOf(e().h.a());
        return valueOf.longValue() == 0 ? this.O : Math.min(this.O, valueOf.longValue());
    }

    public final void E() {
        String B2;
        rd b2;
        String str;
        List<Pair<xg, Long>> list;
        String b3;
        h().c();
        a();
        this.N = true;
        try {
            Boolean D2 = w().D();
            if (D2 == null) {
                f().A().a("Upload data called on the client side before use of service was decided");
                this.N = false;
                P();
            } else if (D2.booleanValue()) {
                f().y().a("Upload called in the client side when service should be used");
                this.N = false;
                P();
            } else if (this.K > 0) {
                N();
                this.N = false;
                P();
            } else {
                h().c();
                if (this.F != null) {
                    f().E().a("Uploading requested multiple times");
                    this.N = false;
                    P();
                } else if (!s().y()) {
                    f().E().a("Network not connected, ignoring upload request");
                    N();
                    this.N = false;
                    P();
                } else {
                    long a2 = this.p.a();
                    a((String) null, a2 - rj.z());
                    long a3 = e().c.a();
                    if (a3 != 0) {
                        f().D().a("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(a2 - a3)));
                    }
                    B2 = q().B();
                    if (!TextUtils.isEmpty(B2)) {
                        if (this.J == -1) {
                            this.J = q().I();
                        }
                        List<Pair<xg, Long>> a4 = q().a(B2, this.c.b(B2, rz.i), Math.max(0, this.c.b(B2, rz.j)));
                        if (!a4.isEmpty()) {
                            Iterator<Pair<xg, Long>> it = a4.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    str = null;
                                    break;
                                }
                                xg xgVar = (xg) it.next().first;
                                if (!TextUtils.isEmpty(xgVar.s)) {
                                    str = xgVar.s;
                                    break;
                                }
                            }
                            if (str != null) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= a4.size()) {
                                        break;
                                    }
                                    xg xgVar2 = (xg) a4.get(i2).first;
                                    if (!TextUtils.isEmpty(xgVar2.s) && !xgVar2.s.equals(str)) {
                                        list = a4.subList(0, i2);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            list = a4;
                            xf xfVar = new xf();
                            xfVar.a = new xg[list.size()];
                            ArrayList arrayList = new ArrayList(list.size());
                            boolean z2 = rj.B() && this.c.c(B2);
                            for (int i3 = 0; i3 < xfVar.a.length; i3++) {
                                xfVar.a[i3] = (xg) list.get(i3).first;
                                arrayList.add((Long) list.get(i3).second);
                                xfVar.a[i3].r = 11910L;
                                xfVar.a[i3].d = Long.valueOf(a2);
                                xfVar.a[i3].z = false;
                                if (!z2) {
                                    xfVar.a[i3].G = null;
                                }
                            }
                            String a5 = f().a(2) ? p().a(xfVar) : null;
                            byte[] a6 = o().a(xfVar);
                            b3 = rz.s.b();
                            URL url = new URL(b3);
                            y.b(!arrayList.isEmpty());
                            if (this.F != null) {
                                f().y().a("Set uploading progress before finishing the previous upload");
                            } else {
                                this.F = new ArrayList(arrayList);
                            }
                            e().d.a(a2);
                            String str2 = "?";
                            if (xfVar.a.length > 0) {
                                str2 = xfVar.a[0].o;
                            }
                            f().E().a("Uploading data. app, uncompressed size, data", str2, Integer.valueOf(a6.length), a5);
                            this.M = true;
                            sn s2 = s();
                            tn tnVar = new tn(this);
                            s2.c();
                            s2.Q();
                            y.a(url);
                            y.a(a6);
                            y.a(tnVar);
                            s2.s().b((Runnable) new sr(s2, B2, url, a6, (Map<String, String>) null, tnVar));
                        }
                    } else {
                        this.J = -1;
                        String a7 = q().a(a2 - rj.z());
                        if (!TextUtils.isEmpty(a7) && (b2 = q().b(a7)) != null) {
                            a(b2);
                        }
                    }
                    this.N = false;
                    P();
                }
            }
        } catch (MalformedURLException e2) {
            f().y().a("Failed to parse upload URL. Not uploading. appId", sj.a(B2), b3);
        } catch (Throwable th) {
            this.N = false;
            P();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final void F() {
        this.I++;
    }

    /* access modifiers changed from: package-private */
    public final void G() {
        h().c();
        a();
        if (!this.A) {
            f().C().a("This instance being marked as an uploader");
            h().c();
            a();
            if (O() && K()) {
                int a2 = a(this.E);
                int B2 = y().B();
                h().c();
                if (a2 > B2) {
                    f().y().a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a2), Integer.valueOf(B2));
                } else if (a2 < B2) {
                    if (a(B2, this.E)) {
                        f().E().a("Storage version upgraded. Previous, current version", Integer.valueOf(a2), Integer.valueOf(B2));
                    } else {
                        f().y().a("Storage version upgrade failed. Previous, current version", Integer.valueOf(a2), Integer.valueOf(B2));
                    }
                }
            }
            this.A = true;
            N();
        }
    }

    public final String a(String str) {
        try {
            return (String) h().a(new tm(this, str)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            f().y().a("Failed to get app instance id. appId", sj.a(str), e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!this.z) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, Throwable th, byte[] bArr) {
        rk q2;
        h().c();
        a();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.M = false;
                P();
                throw th2;
            }
        }
        List<Long> list = this.F;
        this.F = null;
        if ((i2 == 200 || i2 == 204) && th == null) {
            try {
                e().c.a(this.p.a());
                e().d.a(0);
                N();
                f().E().a("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                q().x();
                try {
                    for (Long longValue : list) {
                        q2 = q();
                        long longValue2 = longValue.longValue();
                        q2.c();
                        q2.Q();
                        if (q2.A().delete("queue", "rowid=?", new String[]{String.valueOf(longValue2)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    }
                    q().y();
                    q().z();
                    if (!s().y() || !M()) {
                        this.J = -1;
                        N();
                    } else {
                        E();
                    }
                    this.K = 0;
                } catch (SQLiteException e2) {
                    q2.t().y().a("Failed to delete a bundle in a queue table", e2);
                    throw e2;
                } catch (Throwable th3) {
                    q().z();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                f().y().a("Database error while trying to delete uploaded bundles", e3);
                this.K = this.p.b();
                f().E().a("Disable upload, time", Long.valueOf(this.K));
            }
        } else {
            f().E().a("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            e().d.a(this.p.a());
            if (i2 == 503 || i2 == 429) {
                e().e.a(this.p.a());
            }
            N();
        }
        this.M = false;
        P();
    }

    /* access modifiers changed from: package-private */
    public final void a(re reVar) {
        q().b(reVar.a);
        rk q2 = q();
        String str = reVar.a;
        y.a(str);
        q2.c();
        q2.Q();
        try {
            SQLiteDatabase A2 = q2.A();
            String[] strArr = {str};
            int delete = A2.delete("audience_filter_values", "app_id=?", strArr) + A2.delete("apps", "app_id=?", strArr) + 0 + A2.delete("events", "app_id=?", strArr) + A2.delete("user_attributes", "app_id=?", strArr) + A2.delete("conditional_properties", "app_id=?", strArr) + A2.delete("raw_events", "app_id=?", strArr) + A2.delete("raw_events_metadata", "app_id=?", strArr) + A2.delete("queue", "app_id=?", strArr);
            if (delete > 0) {
                q2.t().E().a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            q2.t().y().a("Error resetting analytics data. appId, error", sj.a(str), e2);
        }
        c(a(this.b, reVar.a, reVar.b, reVar.h, reVar.o));
    }

    /* access modifiers changed from: package-private */
    public final void a(rh rhVar) {
        re b2 = b(rhVar.a);
        if (b2 != null) {
            a(rhVar, b2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(rh rhVar, re reVar) {
        boolean z2 = true;
        y.a(rhVar);
        y.a(rhVar.a);
        y.a(rhVar.b);
        y.a(rhVar.c);
        y.a(rhVar.c.a);
        h().c();
        a();
        if (!TextUtils.isEmpty(reVar.b)) {
            if (!reVar.h) {
                d(reVar);
                return;
            }
            rh rhVar2 = new rh(rhVar);
            rhVar2.e = false;
            q().x();
            try {
                rh d2 = q().d(rhVar2.a, rhVar2.c.a);
                if (d2 != null && !d2.b.equals(rhVar2.b)) {
                    f().A().a("Updating a conditional user property with different origin. name, origin, origin (from DB)", p().c(rhVar2.c.a), rhVar2.b, d2.b);
                }
                if (d2 != null && d2.e) {
                    rhVar2.b = d2.b;
                    rhVar2.d = d2.d;
                    rhVar2.h = d2.h;
                    rhVar2.f = d2.f;
                    rhVar2.i = d2.i;
                    rhVar2.e = d2.e;
                    rhVar2.c = new wo(rhVar2.c.a, d2.c.b, rhVar2.c.a(), d2.c.c);
                    z2 = false;
                } else if (TextUtils.isEmpty(rhVar2.f)) {
                    rhVar2.c = new wo(rhVar2.c.a, rhVar2.d, rhVar2.c.a(), rhVar2.c.c);
                    rhVar2.e = true;
                } else {
                    z2 = false;
                }
                if (rhVar2.e) {
                    wo woVar = rhVar2.c;
                    wq wqVar = new wq(rhVar2.a, rhVar2.b, woVar.a, woVar.b, woVar.a());
                    if (q().a(wqVar)) {
                        f().D().a("User property updated immediately", rhVar2.a, p().c(wqVar.c), wqVar.e);
                    } else {
                        f().y().a("(2)Too many active user properties, ignoring", sj.a(rhVar2.a), p().c(wqVar.c), wqVar.e);
                    }
                    if (z2 && rhVar2.i != null) {
                        b(new rx(rhVar2.i, rhVar2.d), reVar);
                    }
                }
                if (q().a(rhVar2)) {
                    f().D().a("Conditional property added", rhVar2.a, p().c(rhVar2.c.a), rhVar2.c.a());
                } else {
                    f().y().a("Too many conditional properties, ignoring", sj.a(rhVar2.a), p().c(rhVar2.c.a), rhVar2.c.a());
                }
                q().y();
            } finally {
                q().z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(rx rxVar, re reVar) {
        List<rh> a2;
        List<rh> a3;
        List<rh> a4;
        y.a(reVar);
        y.a(reVar.a);
        h().c();
        a();
        String str = reVar.a;
        long j2 = rxVar.d;
        o();
        if (wr.a(rxVar, reVar)) {
            if (!reVar.h) {
                d(reVar);
                return;
            }
            q().x();
            try {
                rk q2 = q();
                y.a(str);
                q2.c();
                q2.Q();
                if (j2 < 0) {
                    q2.t().A().a("Invalid time querying timed out conditional properties", sj.a(str), Long.valueOf(j2));
                    a2 = Collections.emptyList();
                } else {
                    a2 = q2.a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j2)});
                }
                for (rh next : a2) {
                    if (next != null) {
                        f().D().a("User property timed out", next.a, p().c(next.c.a), next.c.a());
                        if (next.g != null) {
                            b(new rx(next.g, j2), reVar);
                        }
                        q().e(str, next.c.a);
                    }
                }
                rk q3 = q();
                y.a(str);
                q3.c();
                q3.Q();
                if (j2 < 0) {
                    q3.t().A().a("Invalid time querying expired conditional properties", sj.a(str), Long.valueOf(j2));
                    a3 = Collections.emptyList();
                } else {
                    a3 = q3.a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(a3.size());
                for (rh next2 : a3) {
                    if (next2 != null) {
                        f().D().a("User property expired", next2.a, p().c(next2.c.a), next2.c.a());
                        q().b(str, next2.c.a);
                        if (next2.k != null) {
                            arrayList.add(next2.k);
                        }
                        q().e(str, next2.c.a);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    b(new rx((rx) obj, j2), reVar);
                }
                rk q4 = q();
                String str2 = rxVar.a;
                y.a(str);
                y.a(str2);
                q4.c();
                q4.Q();
                if (j2 < 0) {
                    q4.t().A().a("Invalid time querying triggered conditional properties", sj.a(str), q4.o().a(str2), Long.valueOf(j2));
                    a4 = Collections.emptyList();
                } else {
                    a4 = q4.a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j2)});
                }
                ArrayList arrayList3 = new ArrayList(a4.size());
                for (rh next3 : a4) {
                    if (next3 != null) {
                        wo woVar = next3.c;
                        wq wqVar = new wq(next3.a, next3.b, woVar.a, j2, woVar.a());
                        if (q().a(wqVar)) {
                            f().D().a("User property triggered", next3.a, p().c(wqVar.c), wqVar.e);
                        } else {
                            f().y().a("Too many active user properties, ignoring", sj.a(next3.a), p().c(wqVar.c), wqVar.e);
                        }
                        if (next3.i != null) {
                            arrayList3.add(next3.i);
                        }
                        next3.c = new wo(wqVar);
                        next3.e = true;
                        q().a(next3);
                    }
                }
                b(rxVar, reVar);
                ArrayList arrayList4 = arrayList3;
                int size2 = arrayList4.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList4.get(i3);
                    i3++;
                    b(new rx((rx) obj2, j2), reVar);
                }
                q().y();
            } finally {
                q().z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(rx rxVar, String str) {
        rd b2 = q().b(str);
        if (b2 == null || TextUtils.isEmpty(b2.i())) {
            f().D().a("No app data available; dropping event", str);
            return;
        }
        try {
            String str2 = pw.a(this.b).b(str, 0).versionName;
            if (b2.i() != null && !b2.i().equals(str2)) {
                f().A().a("App version does not match; dropping event. appId", sj.a(str));
                return;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            if (!"_ui".equals(rxVar.a)) {
                f().A().a("Could not find package. appId", sj.a(str));
            }
        }
        rx rxVar2 = rxVar;
        a(rxVar2, new re(str, b2.d(), b2.i(), b2.j(), b2.k(), b2.l(), b2.m(), (String) null, b2.n(), false, b2.f(), b2.A(), 0, 0, b2.B()));
    }

    /* access modifiers changed from: package-private */
    public final void a(uk ukVar) {
        this.H++;
    }

    /* access modifiers changed from: package-private */
    public final void a(wo woVar, re reVar) {
        int i2 = 0;
        h().c();
        a();
        if (!TextUtils.isEmpty(reVar.b)) {
            if (!reVar.h) {
                d(reVar);
                return;
            }
            int e2 = o().e(woVar.a);
            if (e2 != 0) {
                o();
                String a2 = wr.a(woVar.a, 24, true);
                if (woVar.a != null) {
                    i2 = woVar.a.length();
                }
                o().a(reVar.a, e2, "_ev", a2, i2);
                return;
            }
            int b2 = o().b(woVar.a, woVar.a());
            if (b2 != 0) {
                o();
                String a3 = wr.a(woVar.a, 24, true);
                Object a4 = woVar.a();
                if (a4 != null && ((a4 instanceof String) || (a4 instanceof CharSequence))) {
                    i2 = String.valueOf(a4).length();
                }
                o().a(reVar.a, b2, "_ev", a3, i2);
                return;
            }
            Object c2 = o().c(woVar.a, woVar.a());
            if (c2 != null) {
                wq wqVar = new wq(reVar.a, woVar.c, woVar.a, woVar.b, c2);
                f().D().a("Setting user property", p().c(wqVar.c), c2);
                q().x();
                try {
                    d(reVar);
                    boolean a5 = q().a(wqVar);
                    q().y();
                    if (a5) {
                        f().D().a("User property set", p().c(wqVar.c), wqVar.e);
                    } else {
                        f().y().a("Too many unique user properties are set. Ignoring user property", p().c(wqVar.c), wqVar.e);
                        o().a(reVar.a, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    q().z();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        h().c();
        if (this.G == null) {
            this.G = new ArrayList();
        }
        this.G.add(runnable);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        boolean z2 = true;
        h().c();
        a();
        y.a(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.L = false;
                P();
                throw th2;
            }
        }
        f().E().a("onConfigFetched. Response size", Integer.valueOf(bArr.length));
        q().x();
        rd b2 = q().b(str);
        boolean z3 = (i2 == 200 || i2 == 204 || i2 == 304) && th == null;
        if (b2 == null) {
            f().A().a("App does not exist in onConfigFetched. appId", sj.a(str));
        } else if (z3 || i2 == 404) {
            List list = map != null ? map.get("Last-Modified") : null;
            String str2 = (list == null || list.size() <= 0) ? null : (String) list.get(0);
            if (i2 == 404 || i2 == 304) {
                if (j().a(str) == null && !j().a(str, (byte[]) null, (String) null)) {
                    q().z();
                    this.L = false;
                    P();
                    return;
                }
            } else if (!j().a(str, bArr, str2)) {
                q().z();
                this.L = false;
                P();
                return;
            }
            b2.g(this.p.a());
            q().a(b2);
            if (i2 == 404) {
                f().B().a("Config not found. Using empty config. appId", str);
            } else {
                f().E().a("Successfully fetched config. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
            }
            if (!s().y() || !M()) {
                N();
            } else {
                E();
            }
        } else {
            b2.h(this.p.a());
            q().a(b2);
            f().E().a("Fetching config failed. code, error", Integer.valueOf(i2), th);
            j().c(str);
            e().d.a(this.p.a());
            if (!(i2 == 503 || i2 == 429)) {
                z2 = false;
            }
            if (z2) {
                e().e.a(this.p.a());
            }
            N();
        }
        q().y();
        q().z();
        this.L = false;
        P();
    }

    public final void a(boolean z2) {
        N();
    }

    /* access modifiers changed from: package-private */
    public final void b(re reVar) {
        h().c();
        a();
        y.a(reVar.a);
        d(reVar);
    }

    /* access modifiers changed from: package-private */
    public final void b(rh rhVar) {
        re b2 = b(rhVar.a);
        if (b2 != null) {
            b(rhVar, b2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(rh rhVar, re reVar) {
        y.a(rhVar);
        y.a(rhVar.a);
        y.a(rhVar.c);
        y.a(rhVar.c.a);
        h().c();
        a();
        if (!TextUtils.isEmpty(reVar.b)) {
            if (!reVar.h) {
                d(reVar);
                return;
            }
            q().x();
            try {
                d(reVar);
                rh d2 = q().d(rhVar.a, rhVar.c.a);
                if (d2 != null) {
                    f().D().a("Removing conditional user property", rhVar.a, p().c(rhVar.c.a));
                    q().e(rhVar.a, rhVar.c.a);
                    if (d2.e) {
                        q().b(rhVar.a, rhVar.c.a);
                    }
                    if (rhVar.k != null) {
                        Bundle bundle = null;
                        if (rhVar.k.b != null) {
                            bundle = rhVar.k.b.b();
                        }
                        b(o().a(rhVar.k.a, bundle, d2.b, rhVar.k.d, true, false), reVar);
                    }
                } else {
                    f().A().a("Conditional user property doesn't exist", sj.a(rhVar.a), p().c(rhVar.c.a));
                }
                q().y();
            } finally {
                q().z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(wo woVar, re reVar) {
        h().c();
        a();
        if (!TextUtils.isEmpty(reVar.b)) {
            if (!reVar.h) {
                d(reVar);
                return;
            }
            f().D().a("Removing user property", p().c(woVar.a));
            q().x();
            try {
                d(reVar);
                q().b(reVar.a, woVar.a);
                q().y();
                f().D().a("User property removed", p().c(woVar.a));
            } finally {
                q().z();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        boolean z2 = false;
        a();
        h().c();
        if (this.B == null || this.C == 0 || (this.B != null && !this.B.booleanValue() && Math.abs(this.p.b() - this.C) > 1000)) {
            this.C = this.p.b();
            if (o().h("android.permission.INTERNET") && o().h("android.permission.ACCESS_NETWORK_STATE") && (pw.a(this.b).a() || (tb.a(this.b) && wb.a(this.b, false)))) {
                z2 = true;
            }
            this.B = Boolean.valueOf(z2);
            if (this.B.booleanValue()) {
                this.B = Boolean.valueOf(o().f(y().A()));
            }
        }
        return this.B.booleanValue();
    }

    public final byte[] b(rx rxVar, String str) {
        long j2;
        a();
        h().c();
        D();
        y.a(rxVar);
        y.a(str);
        xf xfVar = new xf();
        q().x();
        try {
            rd b2 = q().b(str);
            if (b2 == null) {
                f().D().a("Log and bundle not available. package_name", str);
                return new byte[0];
            } else if (!b2.n()) {
                f().D().a("Log and bundle disabled. package_name", str);
                byte[] bArr = new byte[0];
                q().z();
                return bArr;
            } else {
                if (("_iap".equals(rxVar.a) || "ecommerce_purchase".equals(rxVar.a)) && !a(str, rxVar)) {
                    f().A().a("Failed to handle purchase event at single event bundle creation. appId", sj.a(str));
                }
                xg xgVar = new xg();
                xfVar.a = new xg[]{xgVar};
                xgVar.a = 1;
                xgVar.i = "android";
                xgVar.o = b2.b();
                xgVar.n = b2.k();
                xgVar.p = b2.i();
                long j3 = b2.j();
                xgVar.C = j3 == -2147483648L ? null : Integer.valueOf((int) j3);
                xgVar.q = Long.valueOf(b2.l());
                xgVar.y = b2.d();
                xgVar.v = Long.valueOf(b2.m());
                if (B() && rj.B() && this.c.c(xgVar.o)) {
                    y();
                    xgVar.G = null;
                }
                Pair<String, Boolean> a2 = e().a(b2.b());
                if (b2.B() && a2 != null && !TextUtils.isEmpty((CharSequence) a2.first)) {
                    xgVar.s = (String) a2.first;
                    xgVar.t = (Boolean) a2.second;
                }
                x().Q();
                xgVar.k = Build.MODEL;
                x().Q();
                xgVar.j = Build.VERSION.RELEASE;
                xgVar.m = Integer.valueOf((int) x().x());
                xgVar.l = x().y();
                xgVar.u = b2.c();
                xgVar.B = b2.f();
                List<wq> a3 = q().a(b2.b());
                xgVar.c = new xi[a3.size()];
                for (int i2 = 0; i2 < a3.size(); i2++) {
                    xi xiVar = new xi();
                    xgVar.c[i2] = xiVar;
                    xiVar.b = a3.get(i2).c;
                    xiVar.a = Long.valueOf(a3.get(i2).d);
                    o().a(xiVar, a3.get(i2).e);
                }
                Bundle b3 = rxVar.b.b();
                if ("_iap".equals(rxVar.a)) {
                    b3.putLong("_c", 1);
                    f().D().a("Marking in-app purchase as real-time");
                    b3.putLong("_r", 1);
                }
                b3.putString("_o", rxVar.c);
                if (o().j(xgVar.o)) {
                    o().a(b3, "_dbg", (Object) 1L);
                    o().a(b3, "_r", (Object) 1L);
                }
                rs a4 = q().a(str, rxVar.a);
                if (a4 == null) {
                    q().a(new rs(str, rxVar.a, 1, 0, rxVar.d, 0, (Long) null, (Long) null, (Boolean) null));
                    j2 = 0;
                } else {
                    j2 = a4.e;
                    q().a(a4.a(rxVar.d).a());
                }
                rr rrVar = new rr(this, rxVar.c, str, rxVar.a, rxVar.d, j2, b3);
                xd xdVar = new xd();
                xgVar.b = new xd[]{xdVar};
                xdVar.c = Long.valueOf(rrVar.c);
                xdVar.b = rrVar.b;
                xdVar.d = Long.valueOf(rrVar.d);
                xdVar.a = new xe[rrVar.e.a()];
                Iterator<String> it = rrVar.e.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    String next = it.next();
                    xe xeVar = new xe();
                    xdVar.a[i3] = xeVar;
                    xeVar.a = next;
                    o().a(xeVar, rrVar.e.a(next));
                    i3++;
                }
                xgVar.A = a(b2.b(), xgVar.c, xgVar.b);
                xgVar.e = xdVar.c;
                xgVar.f = xdVar.c;
                long h2 = b2.h();
                xgVar.h = h2 != 0 ? Long.valueOf(h2) : null;
                long g2 = b2.g();
                if (g2 != 0) {
                    h2 = g2;
                }
                xgVar.g = h2 != 0 ? Long.valueOf(h2) : null;
                b2.r();
                xgVar.w = Integer.valueOf((int) b2.o());
                xgVar.r = 11910L;
                xgVar.d = Long.valueOf(this.p.a());
                xgVar.z = Boolean.TRUE;
                b2.a(xgVar.e.longValue());
                b2.b(xgVar.f.longValue());
                q().a(b2);
                q().y();
                q().z();
                try {
                    byte[] bArr2 = new byte[xfVar.f()];
                    ajx a5 = ajx.a(bArr2, 0, bArr2.length);
                    xfVar.a(a5);
                    a5.a();
                    return o().a(bArr2);
                } catch (IOException e2) {
                    f().y().a("Data loss. Failed to bundle and serialize. appId", sj.a(str), e2);
                    return null;
                }
            }
        } finally {
            q().z();
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        h().c();
        q().D();
        if (e().c.a() == 0) {
            e().c.a(this.p.a());
        }
        if (Long.valueOf(e().h.a()).longValue() == 0) {
            f().E().a("Persisting first open", Long.valueOf(this.O));
            e().h.a(this.O);
        }
        if (b()) {
            if (!TextUtils.isEmpty(y().A())) {
                String y2 = e().y();
                if (y2 == null) {
                    e().c(y().A());
                } else if (!y2.equals(y().A())) {
                    f().C().a("Rechecking which service to use due to a GMP App Id change");
                    e().B();
                    this.r.E();
                    this.r.C();
                    e().c(y().A());
                    e().h.a(this.O);
                    e().i.a((String) null);
                }
            }
            l().a(e().i.a());
            if (!TextUtils.isEmpty(y().A())) {
                um l2 = l();
                l2.c();
                l2.Q();
                if (l2.p.b()) {
                    l2.i().B();
                    String C2 = l2.u().C();
                    if (!TextUtils.isEmpty(C2)) {
                        l2.h().Q();
                        if (!C2.equals(Build.VERSION.RELEASE)) {
                            Bundle bundle = new Bundle();
                            bundle.putString("_po", C2);
                            l2.a("auto", "_ou", bundle);
                        }
                    }
                }
                w().a((AtomicReference<String>) new AtomicReference());
            }
        } else if (B()) {
            if (!o().h("android.permission.INTERNET")) {
                f().y().a("App is missing INTERNET permission");
            }
            if (!o().h("android.permission.ACCESS_NETWORK_STATE")) {
                f().y().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!pw.a(this.b).a()) {
                if (!tb.a(this.b)) {
                    f().y().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!wb.a(this.b, false)) {
                    f().y().a("AppMeasurementService not registered/enabled");
                }
            }
            f().y().a("Uploading is not possible. App measurement disabled");
        }
        N();
    }

    public final void c(re reVar) {
        int i2;
        rd b2;
        ApplicationInfo applicationInfo;
        rk q2;
        String b3;
        h().c();
        a();
        y.a(reVar);
        y.a(reVar.a);
        if (!TextUtils.isEmpty(reVar.b)) {
            rd b4 = q().b(reVar.a);
            if (b4 != null && TextUtils.isEmpty(b4.d()) && !TextUtils.isEmpty(reVar.b)) {
                b4.g(0);
                q().a(b4);
                j().d(reVar.a);
            }
            if (!reVar.h) {
                d(reVar);
                return;
            }
            long j2 = reVar.m;
            if (j2 == 0) {
                j2 = this.p.a();
            }
            int i3 = reVar.n;
            if (i3 == 0 || i3 == 1) {
                i2 = i3;
            } else {
                f().A().a("Incorrect app type, assuming installed app. appId, appType", sj.a(reVar.a), Integer.valueOf(i3));
                i2 = 0;
            }
            q().x();
            try {
                b2 = q().b(reVar.a);
                if (!(b2 == null || b2.d() == null || b2.d().equals(reVar.b))) {
                    f().A().a("New GMP App Id passed in. Removing cached database data. appId", sj.a(b2.b()));
                    q2 = q();
                    b3 = b2.b();
                    q2.Q();
                    q2.c();
                    y.a(b3);
                    SQLiteDatabase A2 = q2.A();
                    String[] strArr = {b3};
                    int delete = A2.delete("audience_filter_values", "app_id=?", strArr) + A2.delete("events", "app_id=?", strArr) + 0 + A2.delete("user_attributes", "app_id=?", strArr) + A2.delete("conditional_properties", "app_id=?", strArr) + A2.delete("apps", "app_id=?", strArr) + A2.delete("raw_events", "app_id=?", strArr) + A2.delete("raw_events_metadata", "app_id=?", strArr) + A2.delete("event_filters", "app_id=?", strArr) + A2.delete("property_filters", "app_id=?", strArr);
                    if (delete > 0) {
                        q2.t().E().a("Deleted application data. app, records", b3, Integer.valueOf(delete));
                    }
                    b2 = null;
                }
            } catch (SQLiteException e2) {
                q2.t().y().a("Error deleting application data. appId, error", sj.a(b3), e2);
            } catch (Throwable th) {
                q().z();
                throw th;
            }
            if (b2 != null) {
                if (b2.i() != null && !b2.i().equals(reVar.c)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_pv", b2.i());
                    a(new rx("_au", new rt(bundle), "auto", j2), reVar);
                }
            }
            d(reVar);
            rs rsVar = null;
            if (i2 == 0) {
                rsVar = q().a(reVar.a, "_f");
            } else if (i2 == 1) {
                rsVar = q().a(reVar.a, "_v");
            }
            if (rsVar == null) {
                long j3 = (1 + (j2 / 3600000)) * 3600000;
                if (i2 == 0) {
                    a(new wo("_fot", j2, Long.valueOf(j3), "auto"), reVar);
                    h().c();
                    a();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("_c", 1);
                    bundle2.putLong("_r", 1);
                    bundle2.putLong("_uwa", 0);
                    bundle2.putLong("_pfo", 0);
                    bundle2.putLong("_sys", 0);
                    bundle2.putLong("_sysu", 0);
                    if (this.b.getPackageManager() == null) {
                        f().y().a("PackageManager is null, first open report might be inaccurate. appId", sj.a(reVar.a));
                    } else {
                        PackageInfo packageInfo = null;
                        try {
                            packageInfo = pw.a(this.b).b(reVar.a, 0);
                        } catch (PackageManager.NameNotFoundException e3) {
                            f().y().a("Package info is null, first open report might be inaccurate. appId", sj.a(reVar.a), e3);
                        }
                        if (packageInfo != null) {
                            if (packageInfo.firstInstallTime != 0) {
                                boolean z2 = false;
                                if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                    bundle2.putLong("_uwa", 1);
                                } else {
                                    z2 = true;
                                }
                                a(new wo("_fi", j2, Long.valueOf(z2 ? 1 : 0), "auto"), reVar);
                            }
                        }
                        try {
                            applicationInfo = pw.a(this.b).a(reVar.a, 0);
                        } catch (PackageManager.NameNotFoundException e4) {
                            f().y().a("Application info is null, first open report might be inaccurate. appId", sj.a(reVar.a), e4);
                            applicationInfo = null;
                        }
                        if (applicationInfo != null) {
                            if ((applicationInfo.flags & 1) != 0) {
                                bundle2.putLong("_sys", 1);
                            }
                            if ((applicationInfo.flags & 128) != 0) {
                                bundle2.putLong("_sysu", 1);
                            }
                        }
                    }
                    rk q3 = q();
                    String str = reVar.a;
                    y.a(str);
                    q3.c();
                    q3.Q();
                    long h2 = q3.h(str, "first_open_count");
                    if (h2 >= 0) {
                        bundle2.putLong("_pfo", h2);
                    }
                    a(new rx("_f", new rt(bundle2), "auto", j2), reVar);
                } else if (i2 == 1) {
                    a(new wo("_fvt", j2, Long.valueOf(j3), "auto"), reVar);
                    h().c();
                    a();
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("_c", 1);
                    bundle3.putLong("_r", 1);
                    a(new rx("_v", new rt(bundle3), "auto", j2), reVar);
                }
                Bundle bundle4 = new Bundle();
                bundle4.putLong("_et", 1);
                a(new rx("_e", new rt(bundle4), "auto", j2), reVar);
            } else if (reVar.i) {
                a(new rx("_cd", new rt(new Bundle()), "auto", j2), reVar);
            }
            q().y();
            q().z();
        }
    }

    public final rj d() {
        return this.c;
    }

    public final su e() {
        a((uj) this.d);
        return this.d;
    }

    public final sj f() {
        b((uk) this.e);
        return this.e;
    }

    public final sj g() {
        if (this.e == null || !this.e.P()) {
            return null;
        }
        return this.e;
    }

    public final tf h() {
        b((uk) this.f);
        return this.f;
    }

    public final wg i() {
        b((uk) this.g);
        return this.g;
    }

    public final te j() {
        b((uk) this.h);
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final tf k() {
        return this.f;
    }

    public final um l() {
        b((uk) this.t);
        return this.t;
    }

    public final AppMeasurement m() {
        return this.i;
    }

    public final FirebaseAnalytics n() {
        return this.j;
    }

    public final wr o() {
        a((uj) this.k);
        return this.k;
    }

    public final sh p() {
        a((uj) this.l);
        return this.l;
    }

    public final rk q() {
        b((uk) this.m);
        return this.m;
    }

    public final sf r() {
        b((uk) this.n);
        return this.n;
    }

    public final sn s() {
        b((uk) this.o);
        return this.o;
    }

    public final Context t() {
        return this.b;
    }

    public final d u() {
        return this.p;
    }

    public final vc v() {
        b((uk) this.q);
        return this.q;
    }

    public final vg w() {
        b((uk) this.r);
        return this.r;
    }

    public final rq x() {
        b((uk) this.s);
        return this.s;
    }

    public final se y() {
        b((uk) this.u);
        return this.u;
    }

    public final rg z() {
        b((uk) this.x);
        return this.x;
    }
}
