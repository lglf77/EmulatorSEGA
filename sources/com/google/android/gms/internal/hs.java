package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.au;

final class hs implements DialogInterface.OnClickListener {
    private /* synthetic */ String a;
    private /* synthetic */ hq b;

    hs(hq hqVar, String str) {
        this.b = hqVar;
        this.a = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        au.e();
        gw.a(this.b.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.a), "Share via"));
    }
}
