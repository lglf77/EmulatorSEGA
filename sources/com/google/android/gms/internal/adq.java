package com.google.android.gms.internal;

import com.google.android.gms.a;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import javax.crypto.KeyAgreement;

public final class adq {
    private ECPublicKey a;

    public adq(ECPublicKey eCPublicKey) {
        this.a = eCPublicKey;
    }

    public final adr a(String str, byte[] bArr, byte[] bArr2, int i, adv adv) {
        byte[] bArr3;
        ECParameterSpec params = this.a.getParams();
        KeyPairGenerator a2 = adx.d.a("EC");
        a2.initialize(params);
        KeyPair generateKeyPair = a2.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ads.a(this.a.getW(), this.a.getParams().getCurve());
        KeyAgreement a3 = adx.c.a("ECDH");
        a3.init((ECPrivateKey) generateKeyPair.getPrivate());
        a3.doPhase(this.a, true);
        byte[] generateSecret = a3.generateSecret();
        EllipticCurve curve = eCPublicKey.getParams().getCurve();
        ECPoint w = eCPublicKey.getW();
        ads.a(w, curve);
        int a4 = ads.a(curve);
        switch (adt.a[adv.ordinal()]) {
            case a.b.AdsAttrs_adSizes:
                bArr3 = new byte[((a4 * 2) + 1)];
                byte[] byteArray = w.getAffineX().toByteArray();
                byte[] byteArray2 = w.getAffineY().toByteArray();
                System.arraycopy(byteArray2, 0, bArr3, ((a4 * 2) + 1) - byteArray2.length, byteArray2.length);
                System.arraycopy(byteArray, 0, bArr3, (a4 + 1) - byteArray.length, byteArray.length);
                bArr3[0] = 4;
                break;
            case 2:
                byte[] bArr4 = new byte[(a4 + 1)];
                byte[] byteArray3 = w.getAffineX().toByteArray();
                System.arraycopy(byteArray3, 0, bArr4, (a4 + 1) - byteArray3.length, byteArray3.length);
                bArr4[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
                bArr3 = bArr4;
                break;
            default:
                String valueOf = String.valueOf(adv);
                throw new GeneralSecurityException(new StringBuilder(String.valueOf(valueOf).length() + 15).append("invalid format:").append(valueOf).toString());
        }
        return new adr(bArr3, aeh.a(str, add.a(bArr3, generateSecret), bArr, bArr2, i));
    }
}
