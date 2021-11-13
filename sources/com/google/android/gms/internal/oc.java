package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class oc implements DialogInterface.OnCancelListener {
    private /* synthetic */ JsPromptResult a;

    oc(JsPromptResult jsPromptResult) {
        this.a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a.cancel();
    }
}
