package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.br;
import com.google.android.gms.ads.internal.gmsg.a;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.ads.internal.gmsg.ad;
import com.google.android.gms.ads.internal.gmsg.ae;
import com.google.android.gms.ads.internal.gmsg.ag;
import com.google.android.gms.ads.internal.gmsg.b;
import com.google.android.gms.ads.internal.gmsg.i;
import com.google.android.gms.ads.internal.gmsg.k;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.l;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.overlay.q;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@bfk
public class mx extends WebViewClient {
    private static final String[] c = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] d = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    private boolean A;
    private boolean B;
    private int C;
    private View.OnAttachStateChangeListener D;
    protected mw a;
    protected ei b;
    private final HashMap<String, List<aa<? super mw>>> e;
    private final Object f;
    private aot g;
    private n h;
    private nb i;
    private nc j;
    private i k;
    /* access modifiers changed from: private */
    public nd l;
    private boolean m;
    private ae n;
    private boolean o;
    private boolean p;
    private ViewTreeObserver.OnGlobalLayoutListener q;
    private ViewTreeObserver.OnScrollChangedListener r;
    private boolean s;
    private q t;
    private final bcn u;
    private br v;
    private bcd w;
    private bcp x;
    private nf y;
    private boolean z;

    public mx(mw mwVar, boolean z2) {
        this(mwVar, z2, new bcn(mwVar, mwVar.r(), new ash(mwVar.getContext())), (bcd) null);
    }

    private mx(mw mwVar, boolean z2, bcn bcn, bcd bcd) {
        this.e = new HashMap<>();
        this.f = new Object();
        this.m = false;
        this.a = mwVar;
        this.o = z2;
        this.u = bcn;
        this.w = null;
    }

    private final WebResourceResponse a(String str) {
        HttpURLConnection httpURLConnection;
        String f2;
        String g2;
        URL url = new URL(str);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                au.e().a(this.a.getContext(), this.a.k().a, false, httpURLConnection);
                jg jgVar = new jg();
                jgVar.a(httpURLConnection, (byte[]) null);
                int responseCode = httpURLConnection.getResponseCode();
                au.e();
                f2 = gw.f(httpURLConnection.getContentType());
                au.e();
                g2 = gw.g(httpURLConnection.getContentType());
                jgVar.a(httpURLConnection, responseCode);
                if (responseCode >= 300 && responseCode < 400) {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        fn.e("Protocol is null");
                        return null;
                    } else if (protocol.equals("http") || protocol.equals("https")) {
                        String valueOf = String.valueOf(headerField);
                        fn.b(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                        httpURLConnection.disconnect();
                        i2 = i3;
                        url = url2;
                    } else {
                        String valueOf2 = String.valueOf(protocol);
                        fn.e(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                        return null;
                    }
                }
            } else {
                throw new IOException(new StringBuilder(32).append("Too many redirects (20)").toString());
            }
        }
        return new WebResourceResponse(f2, g2, httpURLConnection.getInputStream());
    }

    private final void a(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) app.f().a(asw.be)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString("host", str4);
                    au.e().a(context, this.a.k().a, "gmob-apps", bundle, true);
                }
            }
            str4 = "";
            bundle.putString("host", str4);
            au.e().a(context, this.a.k().a, "gmob-apps", bundle, true);
        }
    }

    private final void a(Uri uri) {
        String path = uri.getPath();
        List<aa> list = this.e.get(path);
        if (list != null) {
            au.e();
            Map<String, String> a2 = gw.a(uri);
            if (fn.a(2)) {
                String valueOf = String.valueOf(path);
                fn.a(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
                for (String next : a2.keySet()) {
                    String str = a2.get(next);
                    fn.a(new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str).length()).append("  ").append(next).append(": ").append(str).toString());
                }
            }
            for (aa zza : list) {
                zza.zza(this.a, a2);
            }
            return;
        }
        String valueOf2 = String.valueOf(uri);
        fn.a(new StringBuilder(String.valueOf(valueOf2).length() + 32).append("No GMSG handler found for GMSG: ").append(valueOf2).toString());
    }

    /* access modifiers changed from: private */
    public final void a(View view, ei eiVar, int i2) {
        if (eiVar.b() && i2 > 0) {
            eiVar.a(view);
            if (eiVar.b()) {
                gw.a.postDelayed(new my(this, view, eiVar, i2), 100);
            }
        }
    }

    private final void a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z2 = false;
        boolean a2 = this.w != null ? this.w.a() : false;
        au.c();
        Context context = this.a.getContext();
        if (!a2) {
            z2 = true;
        }
        l.a(context, adOverlayInfoParcel, z2);
        if (this.b != null) {
            String str = adOverlayInfoParcel.l;
            if (str == null && adOverlayInfoParcel.a != null) {
                str = adOverlayInfoParcel.a.a;
            }
            this.b.a(str);
        }
    }

    private final void o() {
        if (this.D != null) {
            mw mwVar = this.a;
            if (mwVar == null) {
                throw null;
            }
            ((View) mwVar).removeOnAttachStateChangeListener(this.D);
        }
    }

    private final void p() {
        if (this.i != null && ((this.A && this.C <= 0) || this.B)) {
            this.i.a(this.a, !this.B);
            this.i = null;
        }
        this.a.H();
    }

    public final br a() {
        return this.v;
    }

    public final void a(int i2, int i3) {
        if (this.w != null) {
            this.w.a(i2, i3);
        }
    }

    public final void a(int i2, int i3, boolean z2) {
        this.u.a(i2, i3);
        if (this.w != null) {
            this.w.a(i2, i3, z2);
        }
    }

    public final void a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f) {
            this.p = true;
            this.a.G();
            this.q = onGlobalLayoutListener;
            this.r = onScrollChangedListener;
        }
    }

    public final void a(c cVar) {
        n nVar = null;
        boolean z2 = this.a.z();
        aot aot = (!z2 || this.a.u().d()) ? this.g : null;
        if (!z2) {
            nVar = this.h;
        }
        a(new AdOverlayInfoParcel(cVar, aot, nVar, this.t, this.a.k()));
    }

    public final void a(aot aot, n nVar, i iVar, q qVar, boolean z2, ae aeVar, br brVar, bcp bcp, ei eiVar) {
        br brVar2 = brVar == null ? new br(this.a.getContext(), eiVar, (ab) null) : brVar;
        this.w = new bcd(this.a, bcp);
        this.b = eiVar;
        a("/appEvent", (aa<? super mw>) new a(iVar));
        a("/backButton", (aa<? super mw>) k.j);
        a("/refresh", (aa<? super mw>) k.k);
        a("/canOpenURLs", (aa<? super mw>) k.a);
        a("/canOpenIntents", (aa<? super mw>) k.b);
        a("/click", (aa<? super mw>) k.c);
        a("/close", (aa<? super mw>) k.d);
        a("/customClose", (aa<? super mw>) k.e);
        a("/instrument", (aa<? super mw>) k.n);
        a("/delayPageLoaded", (aa<? super mw>) k.p);
        a("/delayPageClosed", (aa<? super mw>) k.q);
        a("/getLocationInfo", (aa<? super mw>) k.r);
        a("/httpTrack", (aa<? super mw>) k.f);
        a("/log", (aa<? super mw>) k.g);
        a("/mraid", (aa<? super mw>) new b(brVar2, this.w));
        a("/mraidLoaded", (aa<? super mw>) this.u);
        a("/open", (aa<? super mw>) new com.google.android.gms.ads.internal.gmsg.c(this.a.getContext(), this.a.k(), this.a.y(), qVar, aot, iVar, nVar, brVar2, this.w));
        a("/precache", (aa<? super mw>) new mt());
        a("/touch", (aa<? super mw>) k.i);
        a("/video", (aa<? super mw>) k.l);
        a("/videoMeta", (aa<? super mw>) k.m);
        if (au.z().a(this.a.getContext())) {
            a("/logScionEvent", (aa<? super mw>) new ag(this.a.getContext()));
        }
        if (aeVar != null) {
            a("/setInterstitialProperties", (aa<? super mw>) new ad(aeVar));
        }
        this.g = aot;
        this.h = nVar;
        this.k = iVar;
        this.t = qVar;
        this.v = brVar2;
        this.x = bcp;
        this.n = aeVar;
        this.m = z2;
    }

    public final void a(nb nbVar) {
        this.i = nbVar;
    }

    public final void a(nc ncVar) {
        this.j = ncVar;
    }

    public final void a(nd ndVar) {
        this.l = ndVar;
    }

    public final void a(nf nfVar) {
        this.y = nfVar;
    }

    public final void a(String str, aa<? super mw> aaVar) {
        synchronized (this.f) {
            List list = this.e.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.e.put(str, list);
            }
            list.add(aaVar);
        }
    }

    public final void a(String str, com.google.android.gms.common.util.k<aa<? super mw>> kVar) {
        synchronized (this.f) {
            List<aa> list = this.e.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (aa aaVar : list) {
                    if (kVar.a(aaVar)) {
                        arrayList.add(aaVar);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final void a(boolean z2) {
        this.m = z2;
    }

    public final void a(boolean z2, int i2) {
        a(new AdOverlayInfoParcel((!this.a.z() || this.a.u().d()) ? this.g : null, this.h, this.t, this.a, z2, i2, this.a.k()));
    }

    public final void a(boolean z2, int i2, String str) {
        ne neVar = null;
        boolean z3 = this.a.z();
        aot aot = (!z3 || this.a.u().d()) ? this.g : null;
        if (!z3) {
            neVar = new ne(this.a, this.h);
        }
        a(new AdOverlayInfoParcel(aot, neVar, this.k, this.t, this.a, z2, i2, str, this.a.k()));
    }

    public final void a(boolean z2, int i2, String str, String str2) {
        ne neVar = null;
        boolean z3 = this.a.z();
        aot aot = (!z3 || this.a.u().d()) ? this.g : null;
        if (!z3) {
            neVar = new ne(this.a, this.h);
        }
        a(new AdOverlayInfoParcel(aot, neVar, this.k, this.t, this.a, z2, i2, str, str2, this.a.k()));
    }

    public final void b(String str, aa<? super mw> aaVar) {
        synchronized (this.f) {
            List list = this.e.get(str);
            if (list != null) {
                list.remove(aaVar);
            }
        }
    }

    public final boolean b() {
        boolean z2;
        synchronized (this.f) {
            z2 = this.o;
        }
        return z2;
    }

    public final boolean c() {
        boolean z2;
        synchronized (this.f) {
            z2 = this.p;
        }
        return z2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener d() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f) {
            onGlobalLayoutListener = this.q;
        }
        return onGlobalLayoutListener;
    }

    public final ViewTreeObserver.OnScrollChangedListener e() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f) {
            onScrollChangedListener = this.r;
        }
        return onScrollChangedListener;
    }

    public final boolean f() {
        boolean z2;
        synchronized (this.f) {
            z2 = this.s;
        }
        return z2;
    }

    public final void g() {
        synchronized (this.f) {
            fn.a("Loading blank page in WebView, 2...");
            this.z = true;
            this.a.a("about:blank");
        }
    }

    public final void h() {
        ei eiVar = this.b;
        if (eiVar != null) {
            WebView n2 = this.a.n();
            if (android.support.v4.d.a.a(n2)) {
                a((View) n2, eiVar, 10);
                return;
            }
            o();
            this.D = new mz(this, eiVar);
            mw mwVar = this.a;
            if (mwVar == null) {
                throw null;
            }
            ((View) mwVar).addOnAttachStateChangeListener(this.D);
        }
    }

    public final void i() {
        synchronized (this.f) {
            this.s = true;
        }
        this.C++;
        p();
    }

    public final void j() {
        this.C--;
        p();
    }

    public final void k() {
        this.B = true;
        p();
    }

    public final void l() {
        if (this.b != null) {
            this.b.d();
            this.b = null;
        }
        o();
        synchronized (this.f) {
            this.e.clear();
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.m = false;
            this.o = false;
            this.p = false;
            this.s = false;
            this.t = null;
            this.l = null;
            if (this.w != null) {
                this.w.a(true);
                this.w = null;
            }
        }
    }

    public final nf m() {
        return this.y;
    }

    public final void n() {
        synchronized (this.f) {
            this.m = false;
            this.o = true;
            au.e();
            gw.a((Runnable) new na(this));
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        fn.a(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            a(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r2.j.a(r2.a);
        r2.j = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r2.A = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r2.j == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.Object r1 = r2.f
            monitor-enter(r1)
            boolean r0 = r2.z     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "Blank page loaded, 1..."
            com.google.android.gms.internal.fn.a(r0)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.mw r0 = r2.a     // Catch:{ all -> 0x0029 }
            r0.C()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
        L_0x0012:
            return
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r0 = 1
            r2.A = r0
            com.google.android.gms.internal.nc r0 = r2.j
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.internal.nc r0 = r2.j
            com.google.android.gms.internal.mw r1 = r2.a
            r0.a(r1)
            r0 = 0
            r2.j = r0
        L_0x0025:
            r2.p()
            goto L_0x0012
        L_0x0029:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mx.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        a(this.a.getContext(), "http_err", (i2 >= 0 || (-i2) + -1 >= c.length) ? String.valueOf(i2) : c[(-i2) - 1], str2);
        super.onReceivedError(webView, i2, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            a(this.a.getContext(), "ssl_err", (primaryError < 0 || primaryError >= d.length) ? String.valueOf(primaryError) : d[primaryError], au.g().a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        anw a2;
        try {
            String a3 = ep.a(str, this.a.getContext());
            if (!a3.equals(str)) {
                return a(a3);
            }
            anz a4 = anz.a(str);
            if (a4 != null && (a2 = au.j().a(a4)) != null && a2.a()) {
                return new WebResourceResponse("", "", a2.b());
            }
            if (jg.c()) {
                if (((Boolean) app.f().a(asw.aU)).booleanValue()) {
                    return a(str);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e2) {
            au.i().a(e2, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 79:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 222:
                return true;
            default:
                return false;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        Uri uri2;
        String valueOf = String.valueOf(str);
        fn.a(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.m && webView == this.a.n()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    if (this.g != null) {
                        if (((Boolean) app.f().a(asw.ad)).booleanValue()) {
                            this.g.e();
                            if (this.b != null) {
                                this.b.a(str);
                            }
                            this.g = null;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.a.n().willNotDraw()) {
                try {
                    xr y2 = this.a.y();
                    if (y2 == null || !y2.a(parse)) {
                        uri2 = parse;
                    } else {
                        Context context = this.a.getContext();
                        mw mwVar = this.a;
                        if (mwVar == null) {
                            throw null;
                        }
                        uri2 = y2.a(parse, context, (View) mwVar, this.a.d());
                    }
                    uri = uri2;
                } catch (xs e2) {
                    String valueOf2 = String.valueOf(str);
                    fn.e(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                    uri = parse;
                }
                if (this.v == null || this.v.b()) {
                    a(new c("android.intent.action.VIEW", uri.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
                } else {
                    this.v.a(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                fn.e(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            a(parse);
        }
        return true;
    }
}
