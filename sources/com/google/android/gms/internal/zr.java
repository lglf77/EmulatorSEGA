package com.google.android.gms.internal;

import com.google.android.gms.internal.acx;
import java.security.GeneralSecurityException;

public final class zr {
    public static final acx a = ((acx) ((acx.a) acx.b().a(zf.a)).a(yp.a("TinkHybrid", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).a(yp.a("TinkHybrid", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).a("TINK_HYBRID_1_0_0").d());

    static {
        try {
            zd.a("TinkHybrid", (yo) new zq());
            zf.a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
