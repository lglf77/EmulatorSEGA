package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.au;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
public final class alb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    protected final akz a;
    private Object b = new Object();
    private final WeakReference<ev> c;
    private WeakReference<ViewTreeObserver> d;
    private final amq e;
    private final Context f;
    private final WindowManager g;
    private final PowerManager h;
    private final KeyguardManager i;
    private final DisplayMetrics j;
    private alm k;
    private boolean l;
    private boolean m = false;
    private boolean n = false;
    private boolean o;
    private boolean p;
    private boolean q;
    private BroadcastReceiver r;
    private final HashSet<Object> s = new HashSet<>();
    private it t;
    private final HashSet<ama> u = new HashSet<>();
    private final Rect v = new Rect();
    private final alh w;
    private float x;

    public alb(Context context, apc apc, ev evVar, jp jpVar, amq amq) {
        this.c = new WeakReference<>(evVar);
        this.e = amq;
        this.d = new WeakReference<>((Object) null);
        this.o = true;
        this.q = false;
        this.t = new it(200);
        this.a = new akz(UUID.randomUUID().toString(), jpVar, apc.a, evVar.j, evVar.a(), apc.h);
        this.g = (WindowManager) context.getSystemService("window");
        this.h = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.i = (KeyguardManager) context.getSystemService("keyguard");
        this.f = context;
        this.w = new alh(this, new Handler());
        this.f.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.w);
        this.j = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.g.getDefaultDisplay();
        this.v.right = defaultDisplay.getWidth();
        this.v.bottom = defaultDisplay.getHeight();
        a();
    }

    private static int a(int i2, DisplayMetrics displayMetrics) {
        return (int) (((float) i2) / displayMetrics.density);
    }

    private final JSONObject a(View view, Boolean bool) {
        if (view == null) {
            return i().put("isAttachedToWindow", false).put("isScreenOn", j()).put("isVisible", false);
        }
        boolean a2 = au.g().a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Exception e2) {
            fn.b("Failure getting view location.", e2);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect2, (Point) null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view.getHitRect(rect4);
        JSONObject i2 = i();
        i2.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", a2).put("viewBox", new JSONObject().put("top", a(this.v.top, this.j)).put("bottom", a(this.v.bottom, this.j)).put("left", a(this.v.left, this.j)).put("right", a(this.v.right, this.j))).put("adBox", new JSONObject().put("top", a(rect.top, this.j)).put("bottom", a(rect.bottom, this.j)).put("left", a(rect.left, this.j)).put("right", a(rect.right, this.j))).put("globalVisibleBox", new JSONObject().put("top", a(rect2.top, this.j)).put("bottom", a(rect2.bottom, this.j)).put("left", a(rect2.left, this.j)).put("right", a(rect2.right, this.j))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", a(rect3.top, this.j)).put("bottom", a(rect3.bottom, this.j)).put("left", a(rect3.left, this.j)).put("right", a(rect3.right, this.j))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", a(rect4.top, this.j)).put("bottom", a(rect4.bottom, this.j)).put("left", a(rect4.left, this.j)).put("right", a(rect4.right, this.j))).put("screenDensity", (double) this.j.density);
        if (bool == null) {
            bool = Boolean.valueOf(au.e().a(view, this.h, this.i));
        }
        i2.put("isVisible", bool.booleanValue());
        return i2;
    }

    private static JSONObject a(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    private final void a(JSONObject jSONObject, boolean z) {
        try {
            JSONObject a2 = a(jSONObject);
            ArrayList arrayList = new ArrayList(this.u);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((ama) obj).a(a2, z);
            }
        } catch (Throwable th) {
            fn.b("Skipping active view message.", th);
        }
    }

    private final void g() {
        if (this.k != null) {
            this.k.a(this);
        }
    }

    private final void h() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.d.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    private final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        JSONObject put = jSONObject.put("afmaVersion", this.a.b()).put("activeViewJSON", this.a.c()).put("timestamp", au.k().b()).put("adFormat", this.a.a()).put("hashCode", this.a.d()).put("isMraid", this.a.e()).put("isStopped", this.n).put("isPaused", this.m).put("isNative", this.a.f()).put("isScreenOn", j());
        au.e();
        JSONObject put2 = put.put("appMuted", gw.d());
        au.e();
        put2.put("appVolume", (double) gw.c()).put("deviceVolume", (double) this.x);
        return jSONObject;
    }

    private final boolean j() {
        return Build.VERSION.SDK_INT >= 20 ? this.h.isInteractive() : this.h.isScreenOn();
    }

    public final void a() {
        au.e();
        this.x = gw.j(this.f);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cc, code lost:
        com.google.android.gms.internal.fn.a("Active view update failed.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r8) {
        /*
            r7 = this;
            r2 = 0
            r1 = 1
            java.lang.Object r4 = r7.b
            monitor-enter(r4)
            java.util.HashSet<com.google.android.gms.internal.ama> r0 = r7.u     // Catch:{ all -> 0x005d }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x005d }
        L_0x000b:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ama r0 = (com.google.android.gms.internal.ama) r0     // Catch:{ all -> 0x005d }
            boolean r0 = r0.a()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x000b
            r0 = r1
        L_0x001e:
            if (r0 == 0) goto L_0x0024
            boolean r0 = r7.o     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x0028
        L_0x0024:
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
        L_0x0025:
            return
        L_0x0026:
            r0 = r2
            goto L_0x001e
        L_0x0028:
            com.google.android.gms.internal.amq r0 = r7.e     // Catch:{ all -> 0x005d }
            android.view.View r5 = r0.a()     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x0060
            com.google.android.gms.internal.gw r0 = com.google.android.gms.ads.internal.au.e()     // Catch:{ all -> 0x005d }
            android.os.PowerManager r3 = r7.h     // Catch:{ all -> 0x005d }
            android.app.KeyguardManager r6 = r7.i     // Catch:{ all -> 0x005d }
            boolean r0 = r0.a((android.view.View) r5, (android.os.PowerManager) r3, (android.app.KeyguardManager) r6)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0060
            r3 = r1
        L_0x003f:
            if (r5 == 0) goto L_0x0062
            if (r3 == 0) goto L_0x0062
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ all -> 0x005d }
            r0.<init>()     // Catch:{ all -> 0x005d }
            r6 = 0
            boolean r0 = r5.getGlobalVisibleRect(r0, r6)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0062
            r0 = r1
        L_0x0050:
            com.google.android.gms.internal.amq r2 = r7.e     // Catch:{ all -> 0x005d }
            boolean r2 = r2.b()     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x0064
            r7.b()     // Catch:{ all -> 0x005d }
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            goto L_0x0025
        L_0x005d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            throw r0
        L_0x0060:
            r3 = r2
            goto L_0x003f
        L_0x0062:
            r0 = r2
            goto L_0x0050
        L_0x0064:
            if (r8 != r1) goto L_0x0074
            com.google.android.gms.internal.it r2 = r7.t     // Catch:{ all -> 0x005d }
            boolean r2 = r2.a()     // Catch:{ all -> 0x005d }
            if (r2 != 0) goto L_0x0074
            boolean r2 = r7.q     // Catch:{ all -> 0x005d }
            if (r0 != r2) goto L_0x0074
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            goto L_0x0025
        L_0x0074:
            if (r0 != 0) goto L_0x007e
            boolean r2 = r7.q     // Catch:{ all -> 0x005d }
            if (r2 != 0) goto L_0x007e
            if (r8 != r1) goto L_0x007e
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            goto L_0x0025
        L_0x007e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch:{ JSONException -> 0x00d2, RuntimeException -> 0x00cb }
            org.json.JSONObject r1 = r7.a((android.view.View) r5, (java.lang.Boolean) r1)     // Catch:{ JSONException -> 0x00d2, RuntimeException -> 0x00cb }
            r2 = 0
            r7.a((org.json.JSONObject) r1, (boolean) r2)     // Catch:{ JSONException -> 0x00d2, RuntimeException -> 0x00cb }
            r7.q = r0     // Catch:{ JSONException -> 0x00d2, RuntimeException -> 0x00cb }
        L_0x008c:
            com.google.android.gms.internal.amq r0 = r7.e     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.amq r0 = r0.c()     // Catch:{ all -> 0x005d }
            android.view.View r1 = r0.a()     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x00c5
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r0 = r7.d     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x005d }
            android.view.ViewTreeObserver r0 = (android.view.ViewTreeObserver) r0     // Catch:{ all -> 0x005d }
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()     // Catch:{ all -> 0x005d }
            if (r1 == r0) goto L_0x00c5
            r7.h()     // Catch:{ all -> 0x005d }
            boolean r2 = r7.l     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x00b5
            if (r0 == 0) goto L_0x00be
            boolean r0 = r0.isAlive()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x00be
        L_0x00b5:
            r0 = 1
            r7.l = r0     // Catch:{ all -> 0x005d }
            r1.addOnScrollChangedListener(r7)     // Catch:{ all -> 0x005d }
            r1.addOnGlobalLayoutListener(r7)     // Catch:{ all -> 0x005d }
        L_0x00be:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x005d }
            r0.<init>(r1)     // Catch:{ all -> 0x005d }
            r7.d = r0     // Catch:{ all -> 0x005d }
        L_0x00c5:
            r7.g()     // Catch:{ all -> 0x005d }
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            goto L_0x0025
        L_0x00cb:
            r0 = move-exception
        L_0x00cc:
            java.lang.String r1 = "Active view update failed."
            com.google.android.gms.internal.fn.a(r1, r0)     // Catch:{ all -> 0x005d }
            goto L_0x008c
        L_0x00d2:
            r0 = move-exception
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.alb.a(int):void");
    }

    public final void a(alm alm) {
        synchronized (this.b) {
            this.k = alm;
        }
    }

    public final void a(ama ama) {
        if (this.u.isEmpty()) {
            synchronized (this.b) {
                if (this.r == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.r = new alf(this);
                    au.C().a(this.f, this.r, intentFilter);
                }
            }
            a(3);
        }
        this.u.add(ama);
        try {
            ama.a(a(a(this.e.a(), (Boolean) null)), false);
        } catch (JSONException e2) {
            fn.b("Skipping measurement update for new client.", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ama ama, Map<String, String> map) {
        String valueOf = String.valueOf(this.a.d());
        fn.b(valueOf.length() != 0 ? "Received request to untrack: ".concat(valueOf) : new String("Received request to untrack: "));
        b(ama);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.a.d());
    }

    public final void b() {
        synchronized (this.b) {
            if (this.o) {
                this.p = true;
                try {
                    JSONObject i2 = i();
                    i2.put("doneReasonCode", "u");
                    a(i2, true);
                } catch (JSONException e2) {
                    fn.b("JSON failure while processing active view data.", e2);
                } catch (RuntimeException e3) {
                    fn.b("Failure while processing active view data.", e3);
                }
                String valueOf = String.valueOf(this.a.d());
                fn.b(valueOf.length() != 0 ? "Untracking ad unit: ".concat(valueOf) : new String("Untracking ad unit: "));
            }
        }
    }

    public final void b(ama ama) {
        this.u.remove(ama);
        ama.b();
        if (this.u.isEmpty()) {
            synchronized (this.b) {
                h();
                synchronized (this.b) {
                    if (this.r != null) {
                        try {
                            au.C().a(this.f, this.r);
                        } catch (IllegalStateException e2) {
                            fn.b("Failed trying to unregister the receiver", e2);
                        } catch (Exception e3) {
                            au.i().a((Throwable) e3, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.r = null;
                    }
                }
                this.f.getContentResolver().unregisterContentObserver(this.w);
                this.o = false;
                g();
                ArrayList arrayList = new ArrayList(this.u);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    b((ama) obj);
                }
            }
            return;
        }
        return;
    }

    /* access modifiers changed from: package-private */
    public final void b(Map<String, String> map) {
        a(3);
    }

    /* access modifiers changed from: package-private */
    public final void c(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            if (!"1".equals(map.get("isVisible"))) {
                "true".equals(map.get("isVisible"));
            }
            Iterator<Object> it = this.s.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.o;
        }
        return z;
    }

    public final void d() {
        synchronized (this.b) {
            this.n = true;
            a(3);
        }
    }

    public final void e() {
        synchronized (this.b) {
            this.m = true;
            a(3);
        }
    }

    public final void f() {
        synchronized (this.b) {
            this.m = false;
            a(3);
        }
    }

    public final void onGlobalLayout() {
        a(2);
    }

    public final void onScrollChanged() {
        a(1);
    }
}
