package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.app;
import com.google.android.gms.internal.asw;
import com.google.android.gms.internal.fn;

final class ap extends WebViewClient {
    private /* synthetic */ ao a;

    ap(ao aoVar) {
        this.a = aoVar;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.a.g != null) {
            try {
                this.a.g.a(0);
            } catch (RemoteException e) {
                fn.c("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.a.d())) {
            return false;
        }
        if (str.startsWith((String) app.f().a(asw.ce))) {
            if (this.a.g != null) {
                try {
                    this.a.g.a(3);
                } catch (RemoteException e) {
                    fn.c("Could not call AdListener.onAdFailedToLoad().", e);
                }
            }
            this.a.a(0);
            return true;
        }
        if (str.startsWith((String) app.f().a(asw.cf))) {
            if (this.a.g != null) {
                try {
                    this.a.g.a(0);
                } catch (RemoteException e2) {
                    fn.c("Could not call AdListener.onAdFailedToLoad().", e2);
                }
            }
            this.a.a(0);
            return true;
        }
        if (str.startsWith((String) app.f().a(asw.cg))) {
            if (this.a.g != null) {
                try {
                    this.a.g.c();
                } catch (RemoteException e3) {
                    fn.c("Could not call AdListener.onAdLoaded().", e3);
                }
            }
            this.a.a(this.a.b(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.a.g != null) {
                try {
                    this.a.g.b();
                } catch (RemoteException e4) {
                    fn.c("Could not call AdListener.onAdLeftApplication().", e4);
                }
            }
            this.a.d(this.a.c(str));
            return true;
        }
    }
}
