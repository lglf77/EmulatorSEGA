package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class ob implements DialogInterface.OnClickListener {
    private /* synthetic */ JsResult a;

    ob(JsResult jsResult) {
        this.a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.confirm();
    }
}
