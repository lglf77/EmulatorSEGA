package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.util.Set;

@TargetApi(11)
public class hf extends he {
    public mx a(mw mwVar, boolean z) {
        return new og(mwVar, z);
    }

    public final Set<String> a(Uri uri) {
        return uri.getQueryParameterNames();
    }

    public final boolean a(DownloadManager.Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }

    public boolean a(Context context, WebSettings webSettings) {
        super.a(context, webSettings);
        return ((Boolean) iv.a(context, new hg(this, context, webSettings))).booleanValue();
    }

    public final boolean a(Window window) {
        window.setFlags(16777216, 16777216);
        return true;
    }

    public final boolean b(View view) {
        view.setLayerType(0, (Paint) null);
        return true;
    }

    public WebChromeClient c(mw mwVar) {
        return new ny(mwVar);
    }

    public final boolean c(View view) {
        view.setLayerType(1, (Paint) null);
        return true;
    }
}
