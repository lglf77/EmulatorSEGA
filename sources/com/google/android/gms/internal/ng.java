package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.an;
import com.google.android.gms.ads.internal.bq;

@bfk
public final class ng {
    public static kh<mw> a(Context context, jp jpVar, String str, xr xrVar, bq bqVar) {
        return jx.a(jx.a(null), new nh(context, xrVar, jpVar, bqVar, str), kn.a);
    }

    public final mw a(Context context, or orVar, String str, boolean z, boolean z2, xr xrVar, jp jpVar, atj atj, an anVar, bq bqVar, aog aog) {
        try {
            return (mw) iv.b(context, new nj(this, context, orVar, str, z, z2, xrVar, jpVar, atj, anVar, bqVar, aog));
        } catch (Throwable th) {
            throw new nk(this, "Webview initialization failed.", th);
        }
    }
}
