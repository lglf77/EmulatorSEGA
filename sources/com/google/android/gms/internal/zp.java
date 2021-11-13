package com.google.android.gms.internal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

final class zp implements yu<yt> {
    zp() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final yt a(age age) {
        try {
            abl a = abl.a(age);
            if (!(a instanceof abl)) {
                throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
            }
            abl abl = a;
            aeo.a(abl.a(), 0);
            zu.a(abl.b());
            abh b = abl.b();
            abn a2 = b.a();
            adu a3 = zu.a(a2.a());
            byte[] c = abl.c().c();
            byte[] c2 = abl.e().c();
            ECParameterSpec a4 = ads.a(a3);
            ECPoint eCPoint = new ECPoint(new BigInteger(1, c), new BigInteger(1, c2));
            ads.a(eCPoint, a4.getCurve());
            ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, a4);
            return new ado((ECPublicKey) KeyFactory.getInstance("EC").generatePublic(eCPublicKeySpec), a2.c().c(), zu.a(a2.b()), zu.a(b.c()), new zw(b.b().a()));
        } catch (ahi e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e);
        }
    }

    public final /* synthetic */ Object a(aid aid) {
        if (!(aid instanceof abl)) {
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        }
        abl abl = (abl) aid;
        aeo.a(abl.a(), 0);
        zu.a(abl.b());
        abh b = abl.b();
        abn a = b.a();
        adu a2 = zu.a(a.a());
        byte[] c = abl.c().c();
        byte[] c2 = abl.e().c();
        ECParameterSpec a3 = ads.a(a2);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, c), new BigInteger(1, c2));
        ads.a(eCPoint, a3.getCurve());
        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, a3);
        return new ado((ECPublicKey) KeyFactory.getInstance("EC").generatePublic(eCPublicKeySpec), a.c().c(), zu.a(a.b()), zu.a(b.c()), new zw(b.b().a()));
    }

    public final aid b(age age) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final aid b(aid aid) {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final abz c(age age) {
        throw new GeneralSecurityException("Not implemented.");
    }
}
