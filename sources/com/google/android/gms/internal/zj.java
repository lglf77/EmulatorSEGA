package com.google.android.gms.internal;

import com.google.android.gms.internal.abz;
import java.security.GeneralSecurityException;

final class zj implements yu<yn> {
    zj() {
    }

    private static yn d(age age) {
        try {
            return new adb(aas.a(age).b().c());
        } catch (ahi e) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
    }

    public final /* synthetic */ Object a(age age) {
        return d(age);
    }

    public final /* synthetic */ Object a(aid aid) {
        if (!(aid instanceof aas)) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
        aas aas = (aas) aid;
        aeo.a(aas.a(), 0);
        aeo.a(aas.b().a());
        return new adb(aas.b().c());
    }

    public final aid b(age age) {
        try {
            return b((aid) aau.a(age));
        } catch (ahi e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    public final aid b(aid aid) {
        if (!(aid instanceof aau)) {
            throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
        }
        aau aau = (aau) aid;
        aeo.a(aau.b());
        return aas.c().a(age.a(aem.a(aau.b()))).a(aau.a()).a(0).d();
    }

    public final abz c(age age) {
        return (abz) abz.e().a("type.googleapis.com/google.crypto.tink.AesGcmKey").a(((aas) b(age)).j()).a(abz.b.SYMMETRIC).d();
    }
}
