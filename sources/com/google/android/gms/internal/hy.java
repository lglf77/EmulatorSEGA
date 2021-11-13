package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.au;

final class hy implements DialogInterface.OnClickListener {
    private /* synthetic */ hx a;

    hy(hx hxVar) {
        this.a = hxVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        au.e();
        gw.a(this.a.a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
