package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;
import android.webkit.WebChromeClient;

@bfk
@TargetApi(14)
public final class oh extends ny {
    public oh(mw mwVar) {
        super(mwVar);
    }

    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        a(view, i, customViewCallback);
    }
}
