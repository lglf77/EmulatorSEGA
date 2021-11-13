package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.webkit.WebChromeClient;

@TargetApi(14)
public class hh extends hf {
    public final String a(SslError sslError) {
        return sslError.getUrl();
    }

    public final WebChromeClient c(mw mwVar) {
        return new oh(mwVar);
    }

    public int f() {
        return 1;
    }
}
