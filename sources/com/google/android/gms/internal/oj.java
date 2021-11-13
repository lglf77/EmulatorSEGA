package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@bfk
@TargetApi(21)
public final class oj extends oi {
    public oj(mw mwVar, boolean z) {
        super(mwVar, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
