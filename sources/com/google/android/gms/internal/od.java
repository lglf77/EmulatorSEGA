package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class od implements DialogInterface.OnClickListener {
    private /* synthetic */ JsPromptResult a;

    od(JsPromptResult jsPromptResult) {
        this.a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.cancel();
    }
}
