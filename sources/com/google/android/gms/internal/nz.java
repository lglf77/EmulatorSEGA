package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class nz implements DialogInterface.OnCancelListener {
    private /* synthetic */ JsResult a;

    nz(JsResult jsResult) {
        this.a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.cancel();
    }
}
