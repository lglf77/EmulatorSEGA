package com.google.android.gms.internal;

import android.text.TextUtils;

@bfk
public final class atb {
    public static asz a(asy asy) {
        if (!asy.a()) {
            fn.a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        } else if (asy.c() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(asy.d())) {
            return new asz(asy.c(), asy.d(), asy.b(), asy.e());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
