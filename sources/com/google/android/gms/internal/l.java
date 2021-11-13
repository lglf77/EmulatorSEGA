package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.au;

@bfk
public final class l {
    /* access modifiers changed from: private */
    public static boolean b(Context context, boolean z) {
        if (!z) {
            return true;
        }
        au.e();
        int n = gw.n(context);
        if (n == 0) {
            return false;
        }
        au.e();
        return n <= gw.o(context);
    }
}
