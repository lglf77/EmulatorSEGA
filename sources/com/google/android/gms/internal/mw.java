package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.an;
import com.google.android.gms.ads.internal.bq;
import com.google.android.gms.ads.internal.gmsg.aa;
import com.google.android.gms.ads.internal.js.a;
import com.google.android.gms.ads.internal.js.y;
import com.google.android.gms.ads.internal.overlay.d;
import java.util.Map;
import org.json.JSONObject;

@bfk
public interface mw extends an, a, y, amf, md, nw, nx, ok, om, on, oo {
    int A();

    boolean B();

    void C();

    boolean D();

    boolean E();

    boolean F();

    void G();

    void H();

    View.OnClickListener I();

    aug J();

    void K();

    void L();

    void a(int i);

    void a(Context context);

    void a(d dVar);

    void a(aug aug);

    void a(nq nqVar);

    void a(or orVar);

    void a(String str);

    void a(String str, aa<? super mw> aaVar);

    void a(String str, Map<String, ?> map);

    void a(String str, JSONObject jSONObject);

    nq b();

    void b(int i);

    void b(d dVar);

    void b(String str);

    void b(String str, aa<? super mw> aaVar);

    void b(String str, JSONObject jSONObject);

    void b(boolean z);

    ath c();

    void c(boolean z);

    Activity d();

    void d(boolean z);

    void destroy();

    bq e();

    void e(boolean z);

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    int getWidth();

    String i();

    ati j();

    jp k();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    WebView n();

    void o();

    void onPause();

    void onResume();

    void p();

    void q();

    Context r();

    d s();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    d t();

    or u();

    String v();

    mx w();

    boolean x();

    xr y();

    boolean z();
}
