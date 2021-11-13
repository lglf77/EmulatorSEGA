package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.au;

final class bcb implements DialogInterface.OnClickListener {
    private /* synthetic */ bca a;

    bcb(bca bca) {
        this.a = bca;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent b = this.a.b();
        au.e();
        gw.a(this.a.b, b);
    }
}
