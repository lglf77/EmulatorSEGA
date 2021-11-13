package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.a.a;
import com.google.android.gms.a.c;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.aoy;
import com.google.android.gms.internal.apc;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.aps;
import com.google.android.gms.internal.apv;
import com.google.android.gms.internal.aqh;
import com.google.android.gms.internal.aql;
import com.google.android.gms.internal.aqs;
import com.google.android.gms.internal.ara;
import com.google.android.gms.internal.arg;
import com.google.android.gms.internal.asf;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.atq;
import com.google.android.gms.internal.bcy;
import com.google.android.gms.internal.bde;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.cu;
import com.google.android.gms.internal.fn;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.jc;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.xr;
import com.google.android.gms.internal.xs;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@bfk
public final class ao extends aqh {
    /* access modifiers changed from: private */
    public final jp a;
    private final apc b;
    /* access modifiers changed from: private */
    public final Future<xr> c = gq.a((ExecutorService) gq.a, new ar(this));
    /* access modifiers changed from: private */
    public final Context d;
    private final at e;
    /* access modifiers changed from: private */
    public WebView f = new WebView(this.d);
    /* access modifiers changed from: private */
    public apv g;
    /* access modifiers changed from: private */
    public xr h;
    private AsyncTask<Void, Void, String> i;

    public ao(Context context, apc apc, String str, jp jpVar) {
        this.d = context;
        this.a = jpVar;
        this.b = apc;
        this.e = new at(str);
        a(0);
        this.f.setVerticalScrollBarEnabled(false);
        this.f.getSettings().setJavaScriptEnabled(true);
        this.f.setWebViewClient(new ap(this));
        this.f.setOnTouchListener(new aq(this));
    }

    /* access modifiers changed from: private */
    public final String c(String str) {
        if (this.h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.h.a(parse, this.d, (View) null, (Activity) null);
        } catch (xs e2) {
            fn.c("Unable to process ad data", e2);
        }
        return parse.toString();
    }

    /* access modifiers changed from: private */
    public final void d(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.d.startActivity(intent);
    }

    public final String A() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final aql B() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final apv C() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final void D() {
        throw new IllegalStateException("Unused method");
    }

    public final String a() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (this.f != null) {
            this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, i2));
        }
    }

    public final void a(apc apc) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void a(aps aps) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(apv apv) {
        this.g = apv;
    }

    public final void a(aql aql) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(aqs aqs) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(arg arg) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(asf asf) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(atq atq) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(bcy bcy) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(bde bde, String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(cu cuVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(String str) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    public final int b(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            app.a();
            return jc.a(this.d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException e2) {
            return 0;
        }
    }

    public final void b(boolean z) {
    }

    public final boolean b(aoy aoy) {
        y.a(this.f, (Object) "This Search Ad has already been torn down");
        this.e.a(aoy, this.a);
        this.i = new as(this, (ap) null).execute(new Void[0]);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) app.f().a(asw.ch));
        builder.appendQueryParameter("query", this.e.b());
        builder.appendQueryParameter("pubId", this.e.c());
        Map<String, String> d2 = this.e.d();
        for (String next : d2.keySet()) {
            builder.appendQueryParameter(next, d2.get(next));
        }
        Uri build = builder.build();
        if (this.h != null) {
            try {
                build = this.h.a(build, this.d);
            } catch (xs e2) {
                fn.c("Unable to process ad data", e2);
            }
        }
        String d3 = d();
        String encodedQuery = build.getEncodedQuery();
        return new StringBuilder(String.valueOf(d3).length() + 1 + String.valueOf(encodedQuery).length()).append(d3).append("#").append(encodedQuery).toString();
    }

    public final void c(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        String a2 = this.e.a();
        String str = TextUtils.isEmpty(a2) ? "www.google.com" : a2;
        String str2 = (String) app.f().a(asw.ch);
        return new StringBuilder(String.valueOf("https://").length() + String.valueOf(str).length() + String.valueOf(str2).length()).append("https://").append(str).append(str2).toString();
    }

    public final String d_() {
        return null;
    }

    public final void i() {
        y.b("destroy must be called on the main UI thread.");
        this.i.cancel(true);
        this.c.cancel(true);
        this.f.destroy();
        this.f = null;
    }

    public final a j() {
        y.b("getAdFrame must be called on the main UI thread.");
        return c.a(this.f);
    }

    public final apc k() {
        return this.b;
    }

    public final boolean l() {
        return false;
    }

    public final void m() {
        throw new IllegalStateException("Unused method");
    }

    public final void n() {
        y.b("pause must be called on the main UI thread.");
    }

    public final void o() {
        y.b("resume must be called on the main UI thread.");
    }

    public final void p() {
    }

    public final boolean q() {
        return false;
    }

    public final ara r() {
        return null;
    }
}
