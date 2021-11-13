package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.a;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.ads.internal.bq;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.d;
import java.util.Map;
import org.json.JSONObject;

@bfk
final class nl extends FrameLayout implements mw {
    private static final int a = Color.argb(0, 0, 0, 0);
    private final mw b;
    private final lu c;

    public nl(mw mwVar) {
        super(mwVar.getContext());
        this.b = mwVar;
        this.c = new lu(mwVar.r(), this, this);
        mx w = this.b.w();
        if (w != null) {
            w.a = this;
        }
        mw mwVar2 = this.b;
        if (mwVar2 == null) {
            throw null;
        }
        addView((View) mwVar2);
    }

    public final int A() {
        return this.b.A();
    }

    public final boolean B() {
        return this.b.B();
    }

    public final void C() {
        this.c.c();
        this.b.C();
    }

    public final boolean D() {
        return this.b.D();
    }

    public final boolean E() {
        return this.b.E();
    }

    public final boolean F() {
        return this.b.F();
    }

    public final void G() {
        this.b.G();
    }

    public final void H() {
        this.b.H();
    }

    public final View.OnClickListener I() {
        return this.b.I();
    }

    public final aug J() {
        return this.b.J();
    }

    public final void K() {
        setBackgroundColor(a);
        this.b.setBackgroundColor(a);
    }

    public final void L() {
        TextView textView = new TextView(getContext());
        Resources v = au.i().v();
        textView.setText(v != null ? v.getString(a.C0013a.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (Build.VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    public final lu a() {
        return this.c;
    }

    public final void a(int i) {
        this.b.a(i);
    }

    public final void a(Context context) {
        this.b.a(context);
    }

    public final void a(c cVar) {
        this.b.a(cVar);
    }

    public final void a(d dVar) {
        this.b.a(dVar);
    }

    public final void a(ame ame) {
        this.b.a(ame);
    }

    public final void a(aug aug) {
        this.b.a(aug);
    }

    public final void a(nq nqVar) {
        this.b.a(nqVar);
    }

    public final void a(or orVar) {
        this.b.a(orVar);
    }

    public final void a(String str) {
        this.b.a(str);
    }

    public final void a(String str, aa<? super mw> aaVar) {
        this.b.a(str, aaVar);
    }

    public final void a(String str, Map<String, ?> map) {
        this.b.a(str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        this.b.a(str, jSONObject);
    }

    public final void a(boolean z) {
        this.b.a(z);
    }

    public final void a(boolean z, int i) {
        this.b.a(z, i);
    }

    public final void a(boolean z, int i, String str) {
        this.b.a(z, i, str);
    }

    public final void a(boolean z, int i, String str, String str2) {
        this.b.a(z, i, str, str2);
    }

    public final nq b() {
        return this.b.b();
    }

    public final void b(int i) {
        this.b.b(i);
    }

    public final void b(d dVar) {
        this.b.b(dVar);
    }

    public final void b(String str) {
        this.b.b(str);
    }

    public final void b(String str, aa<? super mw> aaVar) {
        this.b.b(str, aaVar);
    }

    public final void b(String str, JSONObject jSONObject) {
        this.b.b(str, jSONObject);
    }

    public final void b(boolean z) {
        this.b.b(z);
    }

    public final ath c() {
        return this.b.c();
    }

    public final void c(boolean z) {
        this.b.c(z);
    }

    public final Activity d() {
        return this.b.d();
    }

    public final void d(boolean z) {
        this.b.d(z);
    }

    public final void destroy() {
        this.b.destroy();
    }

    public final bq e() {
        return this.b.e();
    }

    public final void e(boolean z) {
        this.b.e(z);
    }

    public final void e_() {
        this.b.e_();
    }

    public final void f() {
        this.b.f();
    }

    public final void f_() {
        this.b.f_();
    }

    public final String i() {
        return this.b.i();
    }

    public final ati j() {
        return this.b.j();
    }

    public final jp k() {
        return this.b.k();
    }

    public final int l() {
        return getMeasuredHeight();
    }

    public final void loadData(String str, String str2, String str3) {
        this.b.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.b.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.b.loadUrl(str);
    }

    public final int m() {
        return getMeasuredWidth();
    }

    public final WebView n() {
        return this.b.n();
    }

    public final void o() {
        this.b.o();
    }

    public final void onPause() {
        this.c.b();
        this.b.onPause();
    }

    public final void onResume() {
        this.b.onResume();
    }

    public final void p() {
        this.b.p();
    }

    public final void q() {
        this.b.q();
    }

    public final Context r() {
        return this.b.r();
    }

    public final d s() {
        return this.b.s();
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.b.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.b.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.b.setWebViewClient(webViewClient);
    }

    public final void stopLoading() {
        this.b.stopLoading();
    }

    public final d t() {
        return this.b.t();
    }

    public final or u() {
        return this.b.u();
    }

    public final String v() {
        return this.b.v();
    }

    public final mx w() {
        return this.b.w();
    }

    public final boolean x() {
        return this.b.x();
    }

    public final xr y() {
        return this.b.y();
    }

    public final boolean z() {
        return this.b.z();
    }
}
