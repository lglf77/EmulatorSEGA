package com.google.android.gms.internal;

import com.google.android.gms.internal.aac;
import com.google.android.gms.internal.aag;
import com.google.android.gms.internal.aas;
import com.google.android.gms.internal.abt;
import java.security.GeneralSecurityException;
import java.util.Arrays;

final class zw implements adm {
    private final String a;
    private final int b;
    private aas c;
    private aac d;
    private int e;

    zw(acf acf) {
        this.a = acf.a();
        if (this.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                aau a2 = aau.a(acf.b());
                this.c = (aas) zd.b(acf);
                this.b = a2.b();
            } catch (ahi e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else if (this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                aae a3 = aae.a(acf.b());
                this.d = (aac) zd.b(acf);
                this.e = a3.a().b();
                this.b = a3.b().b() + this.e;
            } catch (ahi e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e3);
            }
        } else {
            String valueOf = String.valueOf(this.a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    public final int a() {
        return this.b;
    }

    public final yn a(byte[] bArr) {
        if (this.a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            return (yn) zd.b(this.a, (aas) ((aas.a) aas.c().a(this.c)).a(age.a(bArr)).d());
        } else if (this.a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.e);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.e, this.b);
            aac.a a2 = aac.e().a(this.d.a()).a((aag) ((aag.a) aag.e().a(this.d.b())).a(age.a(copyOfRange)).d());
            return (yn) zd.b(this.a, (aac) a2.a((abt) ((abt.a) abt.e().a(this.d.c())).a(age.a(copyOfRange2)).d()).d());
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
