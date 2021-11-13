package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.au;
import com.google.android.gms.common.util.j;
import com.google.android.gms.internal.bfk;
import com.google.android.gms.internal.gw;

@bfk
public final class l {
    public static void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.k == 4 && adOverlayInfoParcel.c == null) {
            if (adOverlayInfoParcel.b != null) {
                adOverlayInfoParcel.b.e();
            }
            au.b();
            a.a(context, adOverlayInfoParcel.a, adOverlayInfoParcel.i);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.m.d);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.a(intent, adOverlayInfoParcel);
        if (!j.g()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        au.e();
        gw.a(context, intent);
    }
}
