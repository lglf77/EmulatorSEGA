package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.an;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.bq;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.d;
import com.google.android.gms.common.util.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@bfk
final class nm extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, mw {
    private ath A;
    private ath B;
    private ati C;
    private WeakReference<View.OnClickListener> D;
    private d E;
    private boolean F;
    private jb G;
    private int H = -1;
    private int I = -1;
    private int J = -1;
    private int K = -1;
    private Map<String, mp> L;
    private final WindowManager M;
    private final aog N;
    private final op a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    private final xr c;
    private final jp d;
    private final an e;
    private final bq f;
    private mx g;
    private d h;
    private or i;
    private String j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private Boolean o;
    private int p;
    private boolean q = true;
    private boolean r = false;
    private String s = "";
    private nq t;
    private boolean u;
    private boolean v;
    private aug w;
    private int x;
    /* access modifiers changed from: private */
    public int y;
    private ath z;

    /* JADX WARNING: type inference failed for: r2v15, types: [com.google.android.gms.internal.nv, com.google.android.gms.internal.nu] */
    private nm(op opVar, or orVar, String str, boolean z2, boolean z3, xr xrVar, jp jpVar, atj atj, an anVar, bq bqVar, aog aog) {
        super(opVar);
        this.a = opVar;
        this.i = orVar;
        this.j = str;
        this.m = z2;
        this.p = -1;
        this.c = xrVar;
        this.d = jpVar;
        this.e = anVar;
        this.f = bqVar;
        this.M = (WindowManager) getContext().getSystemService("window");
        this.N = aog;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            fn.b("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(au.e().a((Context) opVar, jpVar.a));
        au.g().a(getContext(), settings);
        setDownloadListener(this);
        P();
        if (j.c()) {
            addJavascriptInterface(new nt(this, new nu(this)), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.G = new jb(this.a.a(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        T();
        this.C = new ati(new atj(true, "make_wv", this.j));
        this.C.a().a(atj);
        this.A = atc.a(this.C.a());
        this.C.a("native:view_create", this.A);
        this.B = null;
        this.z = null;
        au.g().b((Context) opVar);
    }

    private final boolean M() {
        int i2;
        int i3;
        if (!this.g.b() && !this.g.c()) {
            return false;
        }
        au.e();
        DisplayMetrics a2 = gw.a(this.M);
        app.a();
        int b2 = jc.b(a2, a2.widthPixels);
        app.a();
        int b3 = jc.b(a2, a2.heightPixels);
        Activity a3 = this.a.a();
        if (a3 == null || a3.getWindow() == null) {
            i2 = b3;
            i3 = b2;
        } else {
            au.e();
            int[] a4 = gw.a(a3);
            app.a();
            i3 = jc.b(a2, a4[0]);
            app.a();
            i2 = jc.b(a2, a4[1]);
        }
        if (this.I == b2 && this.H == b3 && this.J == i3 && this.K == i2) {
            return false;
        }
        boolean z2 = (this.I == b2 && this.H == b3) ? false : true;
        this.I = b2;
        this.H = b3;
        this.J = i3;
        this.K = i2;
        new bco(this).a(b2, b3, i3, i2, a2.density, this.M.getDefaultDisplay().getRotation());
        return z2;
    }

    private final Boolean N() {
        Boolean bool;
        synchronized (this.b) {
            bool = this.o;
        }
        return bool;
    }

    private final void O() {
        atc.a(this.C.a(), this.A, "aeh2");
    }

    private final void P() {
        synchronized (this.b) {
            if (this.m || this.i.d()) {
                fn.b("Enabling hardware acceleration on an overlay.");
                Q();
            } else if (Build.VERSION.SDK_INT < 18) {
                fn.b("Disabling hardware acceleration on an AdView.");
                synchronized (this.b) {
                    if (!this.n) {
                        au.g().c((View) this);
                    }
                    this.n = true;
                }
            } else {
                fn.b("Enabling hardware acceleration on an AdView.");
                Q();
            }
        }
    }

    private final void Q() {
        synchronized (this.b) {
            if (this.n) {
                au.g().b((View) this);
            }
            this.n = false;
        }
    }

    private final void R() {
        synchronized (this.b) {
            if (!this.F) {
                this.F = true;
                au.i().x();
            }
        }
    }

    private final void S() {
        synchronized (this.b) {
            this.L = null;
        }
    }

    private final void T() {
        atj a2;
        if (this.C != null && (a2 = this.C.a()) != null && au.i().e() != null) {
            au.i().e().a(a2);
        }
    }

    static nm a(Context context, or orVar, String str, boolean z2, boolean z3, xr xrVar, jp jpVar, atj atj, an anVar, bq bqVar, aog aog) {
        return new nm(new op(context), orVar, str, z2, z3, xrVar, jpVar, atj, anVar, bqVar, aog);
    }

    private final void a(Boolean bool) {
        synchronized (this.b) {
            this.o = bool;
        }
        au.i().a(bool);
    }

    private final void c(String str) {
        synchronized (this.b) {
            if (!B()) {
                loadUrl(str);
            } else {
                fn.e("The webview is destroyed. Ignoring action.");
            }
        }
    }

    private final void d(String str) {
        if (j.e()) {
            if (N() == null) {
                synchronized (this.b) {
                    this.o = au.i().i();
                    if (this.o == null) {
                        try {
                            evaluateJavascript("(function(){})()", (ValueCallback<String>) null);
                            a((Boolean) true);
                        } catch (IllegalStateException e2) {
                            a((Boolean) false);
                        }
                    }
                }
            }
            if (N().booleanValue()) {
                synchronized (this.b) {
                    if (!B()) {
                        evaluateJavascript(str, (ValueCallback<String>) null);
                    } else {
                        fn.e("The webview is destroyed. Ignoring action.");
                    }
                }
                return;
            }
            String valueOf = String.valueOf(str);
            c(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        String valueOf2 = String.valueOf(str);
        c(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    private final void f(boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z2 ? "1" : "0");
        a("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }

    public final int A() {
        int i2;
        synchronized (this.b) {
            i2 = this.p;
        }
        return i2;
    }

    public final boolean B() {
        boolean z2;
        synchronized (this.b) {
            z2 = this.l;
        }
        return z2;
    }

    public final void C() {
        synchronized (this.b) {
            fn.a("Destroying WebView!");
            R();
            gw.a.post(new no(this));
        }
    }

    public final boolean D() {
        boolean z2;
        synchronized (this.b) {
            z2 = this.q;
        }
        return z2;
    }

    public final boolean E() {
        boolean z2;
        synchronized (this.b) {
            z2 = this.r;
        }
        return z2;
    }

    public final boolean F() {
        boolean z2;
        synchronized (this.b) {
            z2 = this.x > 0;
        }
        return z2;
    }

    public final void G() {
        this.G.a();
    }

    public final void H() {
        if (this.B == null) {
            this.B = atc.a(this.C.a());
            this.C.a("native:view_load", this.B);
        }
    }

    public final View.OnClickListener I() {
        return (View.OnClickListener) this.D.get();
    }

    public final aug J() {
        aug aug;
        synchronized (this.b) {
            aug = this.w;
        }
        return aug;
    }

    public final void K() {
        setBackgroundColor(0);
    }

    public final void L() {
        fn.a("Cannot add text view to inner AdWebView");
    }

    public final lu a() {
        return null;
    }

    public final void a(int i2) {
        if (i2 == 0) {
            atc.a(this.C.a(), this.A, "aebb2");
        }
        O();
        if (this.C.a() != null) {
            this.C.a().a("close_type", String.valueOf(i2));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.d.a);
        a("onhide", (Map<String, ?>) hashMap);
    }

    public final void a(Context context) {
        this.a.setBaseContext(context);
        this.G.a(this.a.a());
    }

    public final void a(c cVar) {
        this.g.a(cVar);
    }

    public final void a(d dVar) {
        synchronized (this.b) {
            this.h = dVar;
        }
    }

    public final void a(ame ame) {
        synchronized (this.b) {
            this.u = ame.a;
        }
        f(ame.a);
    }

    public final void a(aug aug) {
        synchronized (this.b) {
            this.w = aug;
        }
    }

    public final void a(nq nqVar) {
        synchronized (this.b) {
            if (this.t != null) {
                fn.c("Attempt to create multiple AdWebViewVideoControllers.");
            } else {
                this.t = nqVar;
            }
        }
    }

    public final void a(or orVar) {
        synchronized (this.b) {
            this.i = orVar;
            requestLayout();
        }
    }

    public final void a(String str) {
        synchronized (this.b) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e2) {
                au.i().a(e2, "AdWebViewImpl.loadUrlUnsafe");
                fn.c("Could not call loadUrl. ", e2);
            }
        }
    }

    public final void a(String str, aa<? super mw> aaVar) {
        if (this.g != null) {
            this.g.a(str, aaVar);
        }
    }

    public final void a(String str, Map<String, ?> map) {
        try {
            a(str, au.e().a(map));
        } catch (JSONException e2) {
            fn.e("Could not convert parameters to JSON.");
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        fn.b(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        d(sb.toString());
    }

    public final void a(boolean z2) {
        this.g.a(z2);
    }

    public final void a(boolean z2, int i2) {
        this.g.a(z2, i2);
    }

    public final void a(boolean z2, int i2, String str) {
        this.g.a(z2, i2, str);
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        this.g.a(z2, i2, str, str2);
    }

    public final nq b() {
        nq nqVar;
        synchronized (this.b) {
            nqVar = this.t;
        }
        return nqVar;
    }

    public final void b(int i2) {
        synchronized (this.b) {
            this.p = i2;
            if (this.h != null) {
                this.h.a(this.p);
            }
        }
    }

    public final void b(d dVar) {
        synchronized (this.b) {
            this.E = dVar;
        }
    }

    public final void b(String str) {
        synchronized (this.b) {
            if (str == null) {
                str = "";
            }
            this.s = str;
        }
    }

    public final void b(String str, aa<? super mw> aaVar) {
        if (this.g != null) {
            this.g.b(str, aaVar);
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        d(new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length()).append(str).append("(").append(jSONObject2).append(");").toString());
    }

    public final void b(boolean z2) {
        synchronized (this.b) {
            boolean z3 = z2 != this.m;
            this.m = z2;
            P();
            if (z3) {
                new bco(this).c(z2 ? "expanded" : "default");
            }
        }
    }

    public final ath c() {
        return this.A;
    }

    public final void c(boolean z2) {
        synchronized (this.b) {
            if (this.h != null) {
                this.h.a(this.g.b(), z2);
            } else {
                this.k = z2;
            }
        }
    }

    public final Activity d() {
        return this.a.a();
    }

    public final void d(boolean z2) {
        synchronized (this.b) {
            this.q = z2;
        }
    }

    public final void destroy() {
        synchronized (this.b) {
            T();
            this.G.b();
            if (this.h != null) {
                this.h.a();
                this.h.k();
                this.h = null;
            }
            this.g.l();
            if (!this.l) {
                au.x();
                mn.a((md) this);
                S();
                this.l = true;
                fn.a("Initiating WebView self destruct sequence in 3...");
                this.g.g();
            }
        }
    }

    public final bq e() {
        return this.f;
    }

    public final void e(boolean z2) {
        synchronized (this.b) {
            this.x = (z2 ? 1 : -1) + this.x;
            if (this.x <= 0 && this.h != null) {
                this.h.q();
            }
        }
    }

    public final void e_() {
        synchronized (this.b) {
            this.r = true;
            if (this.e != null) {
                this.e.e_();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void evaluateJavascript(java.lang.String r3, android.webkit.ValueCallback<java.lang.String> r4) {
        /*
            r2 = this;
            java.lang.Object r1 = r2.b
            monitor-enter(r1)
            boolean r0 = r2.B()     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.fn.e(r0)     // Catch:{ all -> 0x001b }
            if (r4 == 0) goto L_0x0014
            r0 = 0
            r4.onReceiveValue(r0)     // Catch:{ all -> 0x001b }
        L_0x0014:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
        L_0x0015:
            return
        L_0x0016:
            super.evaluateJavascript(r3, r4)     // Catch:{ all -> 0x001b }
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            goto L_0x0015
        L_0x001b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nm.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public final void f() {
        d s2 = s();
        if (s2 != null) {
            s2.p();
        }
    }

    public final void f_() {
        synchronized (this.b) {
            this.r = false;
            if (this.e != null) {
                this.e.f_();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (this.b != null) {
                synchronized (this.b) {
                    if (!this.l) {
                        this.g.l();
                        au.x();
                        mn.a((md) this);
                        S();
                        R();
                    }
                }
            }
        } finally {
            super.finalize();
        }
    }

    public final String i() {
        String str;
        synchronized (this.b) {
            str = this.s;
        }
        return str;
    }

    public final ati j() {
        return this.C;
    }

    public final jp k() {
        return this.d;
    }

    public final int l() {
        return getMeasuredHeight();
    }

    public final void loadData(String str, String str2, String str3) {
        synchronized (this.b) {
            if (!B()) {
                super.loadData(str, str2, str3);
            } else {
                fn.e("The webview is destroyed. Ignoring action.");
            }
        }
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        synchronized (this.b) {
            if (!B()) {
                super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            } else {
                fn.e("The webview is destroyed. Ignoring action.");
            }
        }
    }

    public final void loadUrl(String str) {
        synchronized (this.b) {
            if (!B()) {
                try {
                    super.loadUrl(str);
                } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e2) {
                    au.i().a(e2, "AdWebViewImpl.loadUrl");
                    fn.c("Could not call loadUrl. ", e2);
                }
            } else {
                fn.e("The webview is destroyed. Ignoring action.");
            }
        }
    }

    public final int m() {
        return getMeasuredWidth();
    }

    public final WebView n() {
        return this;
    }

    public final void o() {
        O();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.d.a);
        a("onhide", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        boolean z2 = true;
        synchronized (this.b) {
            super.onAttachedToWindow();
            if (!B()) {
                this.G.c();
            }
            boolean z3 = this.u;
            if (this.g == null || !this.g.c()) {
                z2 = z3;
            } else {
                if (!this.v) {
                    ViewTreeObserver.OnGlobalLayoutListener d2 = this.g.d();
                    if (d2 != null) {
                        au.y();
                        if (this == null) {
                            throw null;
                        }
                        la.a((View) this, d2);
                    }
                    ViewTreeObserver.OnScrollChangedListener e2 = this.g.e();
                    if (e2 != null) {
                        au.y();
                        if (this == null) {
                            throw null;
                        }
                        la.a((View) this, e2);
                    }
                    this.v = true;
                }
                M();
            }
            f(z2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this.b) {
            if (!B()) {
                this.G.d();
            }
            super.onDetachedFromWindow();
            if (this.v && this.g != null && this.g.c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                ViewTreeObserver.OnGlobalLayoutListener d2 = this.g.d();
                if (d2 != null) {
                    au.g().a(getViewTreeObserver(), d2);
                }
                ViewTreeObserver.OnScrollChangedListener e2 = this.g.e();
                if (e2 != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e2);
                }
                this.v = false;
            }
        }
        f(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            au.e();
            gw.a(getContext(), intent);
        } catch (ActivityNotFoundException e2) {
            fn.b(new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length()).append("Couldn't find an Activity to view url/mimetype: ").append(str).append(" / ").append(str4).toString());
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!B()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                if (this.g != null && this.g.m() != null) {
                    this.g.m().a();
                }
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) app.f().a(asw.ar)).booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if (motionEvent.getActionMasked() == 8 && ((axisValue > 0.0f && !canScrollVertically(-1)) || ((axisValue < 0.0f && !canScrollVertically(1)) || ((axisValue2 > 0.0f && !canScrollHorizontally(-1)) || (axisValue2 < 0.0f && !canScrollHorizontally(1)))))) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean M2 = M();
        d s2 = s();
        if (s2 != null && M2) {
            s2.o();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        return;
     */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            r8 = 1073741824(0x40000000, float:2.0)
            r7 = 8
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            java.lang.Object r5 = r9.b
            monitor-enter(r5)
            boolean r0 = r9.B()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0017
            r0 = 0
            r1 = 0
            r9.setMeasuredDimension(r0, r1)     // Catch:{ all -> 0x002e }
            monitor-exit(r5)     // Catch:{ all -> 0x002e }
        L_0x0016:
            return
        L_0x0017:
            boolean r0 = r9.isInEditMode()     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0029
            boolean r0 = r9.m     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0029
            com.google.android.gms.internal.or r0 = r9.i     // Catch:{ all -> 0x002e }
            boolean r0 = r0.e()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0031
        L_0x0029:
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x002e }
            monitor-exit(r5)     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x002e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002e }
            throw r0
        L_0x0031:
            com.google.android.gms.internal.or r0 = r9.i     // Catch:{ all -> 0x002e }
            boolean r0 = r0.f()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0079
            com.google.android.gms.internal.nq r0 = r9.b()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x01a7
            float r0 = r0.e()     // Catch:{ all -> 0x002e }
            r4 = r0
        L_0x0044:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x002e }
            monitor-exit(r5)     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x004d:
            int r3 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x002e }
            int r2 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x002e }
            float r0 = (float) r2     // Catch:{ all -> 0x002e }
            float r0 = r0 * r4
            int r1 = (int) r0     // Catch:{ all -> 0x002e }
            float r0 = (float) r3     // Catch:{ all -> 0x002e }
            float r0 = r0 / r4
            int r0 = (int) r0     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            float r1 = (float) r0     // Catch:{ all -> 0x002e }
            float r1 = r1 * r4
            int r1 = (int) r1     // Catch:{ all -> 0x002e }
            r2 = r0
        L_0x0063:
            int r1 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x002e }
            int r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x002e }
            r9.setMeasuredDimension(r1, r0)     // Catch:{ all -> 0x002e }
            monitor-exit(r5)     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x0070:
            if (r3 != 0) goto L_0x0063
            if (r1 == 0) goto L_0x0063
            float r0 = (float) r1     // Catch:{ all -> 0x002e }
            float r0 = r0 / r4
            int r0 = (int) r0     // Catch:{ all -> 0x002e }
            r3 = r1
            goto L_0x0063
        L_0x0079:
            com.google.android.gms.internal.or r0 = r9.i     // Catch:{ all -> 0x002e }
            boolean r0 = r0.c()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x00d3
            com.google.android.gms.internal.asl<java.lang.Boolean> r0 = com.google.android.gms.internal.asw.bW     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.asu r1 = com.google.android.gms.internal.app.f()     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r1.a(r0)     // Catch:{ all -> 0x002e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0099
            boolean r0 = com.google.android.gms.common.util.j.c()     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x009f
        L_0x0099:
            super.onMeasure(r10, r11)     // Catch:{ all -> 0x002e }
            monitor-exit(r5)     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x009f:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.nn r1 = new com.google.android.gms.internal.nn     // Catch:{ all -> 0x002e }
            r1.<init>(r9)     // Catch:{ all -> 0x002e }
            r9.a((java.lang.String) r0, (com.google.android.gms.ads.internal.gmsg.aa<? super com.google.android.gms.internal.mw>) r1)     // Catch:{ all -> 0x002e }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r9.d((java.lang.String) r0)     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.op r0 = r9.a     // Catch:{ all -> 0x002e }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x002e }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ all -> 0x002e }
            float r0 = r0.density     // Catch:{ all -> 0x002e }
            int r1 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x002e }
            int r2 = r9.y     // Catch:{ all -> 0x002e }
            switch(r2) {
                case -1: goto L_0x00ce;
                default: goto L_0x00c3;
            }     // Catch:{ all -> 0x002e }
        L_0x00c3:
            int r2 = r9.y     // Catch:{ all -> 0x002e }
            float r2 = (float) r2     // Catch:{ all -> 0x002e }
            float r0 = r0 * r2
            int r0 = (int) r0     // Catch:{ all -> 0x002e }
        L_0x00c8:
            r9.setMeasuredDimension(r1, r0)     // Catch:{ all -> 0x002e }
            monitor-exit(r5)     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x00ce:
            int r0 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x002e }
            goto L_0x00c8
        L_0x00d3:
            com.google.android.gms.internal.or r0 = r9.i     // Catch:{ all -> 0x002e }
            boolean r0 = r0.d()     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x00f3
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch:{ all -> 0x002e }
            r0.<init>()     // Catch:{ all -> 0x002e }
            android.view.WindowManager r1 = r9.M     // Catch:{ all -> 0x002e }
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch:{ all -> 0x002e }
            r1.getMetrics(r0)     // Catch:{ all -> 0x002e }
            int r1 = r0.widthPixels     // Catch:{ all -> 0x002e }
            int r0 = r0.heightPixels     // Catch:{ all -> 0x002e }
            r9.setMeasuredDimension(r1, r0)     // Catch:{ all -> 0x002e }
            monitor-exit(r5)     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x00f3:
            int r2 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x002e }
            int r3 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x002e }
            int r4 = android.view.View.MeasureSpec.getMode(r11)     // Catch:{ all -> 0x002e }
            int r1 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x002e }
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r6) goto L_0x010a
            if (r2 != r8) goto L_0x01a4
        L_0x010a:
            r2 = r3
        L_0x010b:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r6) goto L_0x0112
            if (r4 != r8) goto L_0x0113
        L_0x0112:
            r0 = r1
        L_0x0113:
            com.google.android.gms.internal.or r4 = r9.i     // Catch:{ all -> 0x002e }
            int r4 = r4.b     // Catch:{ all -> 0x002e }
            if (r4 > r2) goto L_0x011f
            com.google.android.gms.internal.or r2 = r9.i     // Catch:{ all -> 0x002e }
            int r2 = r2.a     // Catch:{ all -> 0x002e }
            if (r2 <= r0) goto L_0x018e
        L_0x011f:
            com.google.android.gms.internal.op r0 = r9.a     // Catch:{ all -> 0x002e }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x002e }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ all -> 0x002e }
            float r0 = r0.density     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.or r2 = r9.i     // Catch:{ all -> 0x002e }
            int r2 = r2.b     // Catch:{ all -> 0x002e }
            float r2 = (float) r2     // Catch:{ all -> 0x002e }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.or r4 = r9.i     // Catch:{ all -> 0x002e }
            int r4 = r4.a     // Catch:{ all -> 0x002e }
            float r4 = (float) r4     // Catch:{ all -> 0x002e }
            float r4 = r4 / r0
            int r4 = (int) r4     // Catch:{ all -> 0x002e }
            float r3 = (float) r3     // Catch:{ all -> 0x002e }
            float r3 = r3 / r0
            int r3 = (int) r3     // Catch:{ all -> 0x002e }
            float r1 = (float) r1     // Catch:{ all -> 0x002e }
            float r0 = r1 / r0
            int r0 = (int) r0     // Catch:{ all -> 0x002e }
            r1 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x002e }
            r6.<init>(r1)     // Catch:{ all -> 0x002e }
            java.lang.String r1 = "Not enough space to show ad. Needs "
            java.lang.StringBuilder r1 = r6.append(r1)     // Catch:{ all -> 0x002e }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "x"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x002e }
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch:{ all -> 0x002e }
            java.lang.String r2 = " dp, but only has "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x002e }
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "x"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x002e }
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x002e }
            java.lang.String r1 = " dp."
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ all -> 0x002e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.fn.e(r0)     // Catch:{ all -> 0x002e }
            int r0 = r9.getVisibility()     // Catch:{ all -> 0x002e }
            if (r0 == r7) goto L_0x0186
            r0 = 4
            r9.setVisibility(r0)     // Catch:{ all -> 0x002e }
        L_0x0186:
            r0 = 0
            r1 = 0
            r9.setMeasuredDimension(r0, r1)     // Catch:{ all -> 0x002e }
        L_0x018b:
            monitor-exit(r5)     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x018e:
            int r0 = r9.getVisibility()     // Catch:{ all -> 0x002e }
            if (r0 == r7) goto L_0x0198
            r0 = 0
            r9.setVisibility(r0)     // Catch:{ all -> 0x002e }
        L_0x0198:
            com.google.android.gms.internal.or r0 = r9.i     // Catch:{ all -> 0x002e }
            int r0 = r0.b     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.or r1 = r9.i     // Catch:{ all -> 0x002e }
            int r1 = r1.a     // Catch:{ all -> 0x002e }
            r9.setMeasuredDimension(r0, r1)     // Catch:{ all -> 0x002e }
            goto L_0x018b
        L_0x01a4:
            r2 = r0
            goto L_0x010b
        L_0x01a7:
            r4 = r1
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nm.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!B()) {
            try {
                super.onPause();
            } catch (Exception e2) {
                fn.b("Could not pause webview.", e2);
            }
        }
    }

    public final void onResume() {
        if (!B()) {
            try {
                super.onResume();
            } catch (Exception e2) {
                fn.b("Could not resume webview.", e2);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.g.c()) {
            synchronized (this.b) {
                if (this.w != null) {
                    this.w.a(motionEvent);
                }
            }
        } else if (this.c != null) {
            this.c.a(motionEvent);
        }
        if (B()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (this.z == null) {
            atc.a(this.C.a(), this.A, "aes2");
            this.z = atc.a(this.C.a());
            this.C.a("native:view_show", this.z);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.d.a);
        a("onshow", (Map<String, ?>) hashMap);
    }

    public final void q() {
        HashMap hashMap = new HashMap(3);
        au.e();
        hashMap.put("app_muted", String.valueOf(gw.d()));
        au.e();
        hashMap.put("app_volume", String.valueOf(gw.c()));
        au.e();
        hashMap.put("device_volume", String.valueOf(gw.j(getContext())));
        a("volume", (Map<String, ?>) hashMap);
    }

    public final Context r() {
        return this.a.b();
    }

    public final d s() {
        d dVar;
        synchronized (this.b) {
            dVar = this.h;
        }
        return dVar;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.D = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof mx) {
            this.g = (mx) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!B()) {
            try {
                super.stopLoading();
            } catch (Exception e2) {
                fn.b("Could not stop loading webview.", e2);
            }
        }
    }

    public final d t() {
        d dVar;
        synchronized (this.b) {
            dVar = this.E;
        }
        return dVar;
    }

    public final or u() {
        or orVar;
        synchronized (this.b) {
            orVar = this.i;
        }
        return orVar;
    }

    public final String v() {
        String str;
        synchronized (this.b) {
            str = this.j;
        }
        return str;
    }

    public final mx w() {
        return this.g;
    }

    public final boolean x() {
        boolean z2;
        synchronized (this.b) {
            z2 = this.k;
        }
        return z2;
    }

    public final xr y() {
        return this.c;
    }

    public final boolean z() {
        boolean z2;
        synchronized (this.b) {
            z2 = this.m;
        }
        return z2;
    }
}
