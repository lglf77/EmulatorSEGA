package com.google.android.gms.internal;

import com.google.android.gms.internal.acx;
import java.security.GeneralSecurityException;

public final class zf {
    public static final acx a = ((acx) ((acx.a) acx.b().a(aab.a)).a(yp.a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).a(yp.a("TinkAead", "Aead", "AesEaxKey", 0, true)).a(yp.a("TinkAead", "Aead", "AesGcmKey", 0, true)).a(yp.a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).a(yp.a("TinkAead", "Aead", "KmsAeadKey", 0, true)).a(yp.a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).a("TINK_AEAD_1_0_0").d());

    static {
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        zd.a("TinkAead", (yo) new ze());
        aab.a();
    }
}
