package com.google.android.gms.internal;

import android.annotation.TargetApi;

@bfk
@TargetApi(17)
public final class iw {
    private static iw b = null;
    String a;

    private iw() {
    }

    public static iw a() {
        if (b == null) {
            b = new iw();
        }
        return b;
    }
}
