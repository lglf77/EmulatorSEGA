package com.google.android.gms.internal;

import android.content.DialogInterface;

final class bcc implements DialogInterface.OnClickListener {
    private /* synthetic */ bca a;

    bcc(bca bca) {
        this.a = bca;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a("Operation denied by user.");
    }
}
