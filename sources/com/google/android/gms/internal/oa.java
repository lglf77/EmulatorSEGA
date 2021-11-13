package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class oa implements DialogInterface.OnClickListener {
    private /* synthetic */ JsResult a;

    oa(JsResult jsResult) {
        this.a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.cancel();
    }
}
