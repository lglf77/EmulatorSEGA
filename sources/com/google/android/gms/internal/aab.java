package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

public final class aab {
    public static final acx a = ((acx) acx.b().a("TINK_MAC_1_0_0").a(yp.a("TinkMac", "Mac", "HmacKey", 0, true)).d());

    static {
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        zd.a("TinkMac", (yo) new aaa());
    }
}
