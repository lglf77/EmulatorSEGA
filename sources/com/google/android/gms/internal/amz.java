package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebView;

final class amz implements Runnable {
    final /* synthetic */ amr a;
    final /* synthetic */ WebView b;
    final /* synthetic */ boolean c;
    final /* synthetic */ amx d;
    private ValueCallback<String> e = new ana(this);

    amz(amx amx, amr amr, WebView webView, boolean z) {
        this.d = amx;
        this.a = amr;
        this.b = webView;
        this.c = z;
    }

    public final void run() {
        if (this.b.getSettings().getJavaScriptEnabled()) {
            try {
                this.b.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.e);
            } catch (Throwable th) {
                this.e.onReceiveValue("");
            }
        }
    }
}
