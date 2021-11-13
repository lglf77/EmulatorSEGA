package com.google.android.gms.internal;

import com.google.android.gms.internal.abz;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

final class zo implements yu<ys> {
    zo() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final ys a(age age) {
        try {
            abj a = abj.a(age);
            if (!(a instanceof abj)) {
                throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
            }
            abj abj = a;
            aeo.a(abj.a(), 0);
            zu.a(abj.b().b());
            abh b = abj.b().b();
            abn a2 = b.a();
            adu a3 = zu.a(a2.a());
            byte[] c = abj.c().c();
            ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, c), ads.a(a3));
            return new adn((ECPrivateKey) KeyFactory.getInstance("EC").generatePrivate(eCPrivateKeySpec), a2.c().c(), zu.a(a2.b()), zu.a(b.c()), new zw(b.b().a()));
        } catch (ahi e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e);
        }
    }

    public final /* synthetic */ Object a(aid aid) {
        if (!(aid instanceof abj)) {
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        }
        abj abj = (abj) aid;
        aeo.a(abj.a(), 0);
        zu.a(abj.b().b());
        abh b = abj.b().b();
        abn a = b.a();
        adu a2 = zu.a(a.a());
        byte[] c = abj.c().c();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, c), ads.a(a2));
        return new adn((ECPrivateKey) KeyFactory.getInstance("EC").generatePrivate(eCPrivateKeySpec), a.c().c(), zu.a(a.b()), zu.a(b.c()), new zw(b.b().a()));
    }

    public final aid b(age age) {
        try {
            return b((aid) abf.a(age));
        } catch (ahi e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    public final aid b(aid aid) {
        if (!(aid instanceof abf)) {
            throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
        }
        abf abf = (abf) aid;
        zu.a(abf.a());
        ECParameterSpec a = ads.a(zu.a(abf.a().a().a()));
        KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
        instance.initialize(a);
        KeyPair generateKeyPair = instance.generateKeyPair();
        ECPoint w = ((ECPublicKey) generateKeyPair.getPublic()).getW();
        return abj.e().a(0).a((abl) abl.f().a(0).a(abf.a()).a(age.a(w.getAffineX().toByteArray())).b(age.a(w.getAffineY().toByteArray())).d()).a(age.a(((ECPrivateKey) generateKeyPair.getPrivate()).getS().toByteArray())).d();
    }

    public final abz c(age age) {
        return (abz) abz.e().a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").a(((abj) b(age)).j()).a(abz.b.ASYMMETRIC_PRIVATE).d();
    }
}
