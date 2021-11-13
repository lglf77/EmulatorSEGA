package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

@bfk
@TargetApi(11)
public final class og extends oi {
    public og(mw mwVar, boolean z) {
        super(mwVar, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str, (Map<String, String>) null);
    }
}
