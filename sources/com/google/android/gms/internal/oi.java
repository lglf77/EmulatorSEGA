package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.au;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@bfk
@TargetApi(11)
public class oi extends mx {
    public oi(mw mwVar, boolean z) {
        super(mwVar, z);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse a(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof mw)) {
            fn.e("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        mw mwVar = (mw) webView;
        if (this.b != null) {
            this.b.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            return super.shouldInterceptRequest(webView, str);
        }
        if (mwVar.w() != null) {
            mwVar.w().n();
        }
        String str2 = mwVar.u().d() ? (String) app.f().a(asw.G) : mwVar.z() ? (String) app.f().a(asw.F) : (String) app.f().a(asw.E);
        try {
            Context context = mwVar.getContext();
            String str3 = mwVar.k().a;
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", au.e().a(context, str3));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str4 = (String) new Cif(context).a(str2, (Map<String, String>) hashMap).get(60, TimeUnit.SECONDS);
            if (str4 == null) {
                return null;
            }
            return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str4.getBytes("UTF-8")));
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e.getMessage());
            fn.e(valueOf.length() != 0 ? "Could not fetch MRAID JS. ".concat(valueOf) : new String("Could not fetch MRAID JS. "));
            return null;
        }
    }
}
