package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class oe implements DialogInterface.OnClickListener {
    private /* synthetic */ JsPromptResult a;
    private /* synthetic */ EditText b;

    oe(JsPromptResult jsPromptResult, EditText editText) {
        this.a = jsPromptResult;
        this.b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.confirm(this.b.getText().toString());
    }
}
