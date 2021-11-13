package com.google.android.gms.internal;

import com.google.android.gms.internal.abz;
import java.security.GeneralSecurityException;

final class zi implements yu<yn> {
    zi() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final yn a(age age) {
        try {
            aam a = aam.a(age);
            if (!(a instanceof aam)) {
                throw new GeneralSecurityException("expected AesEaxKey proto");
            }
            aam aam = a;
            aeo.a(aam.a(), 0);
            aeo.a(aam.c().a());
            if (aam.b().a() == 12 || aam.b().a() == 16) {
                return new ada(aam.c().c(), aam.b().a());
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        } catch (ahi e) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e);
        }
    }

    public final /* synthetic */ Object a(aid aid) {
        if (!(aid instanceof aam)) {
            throw new GeneralSecurityException("expected AesEaxKey proto");
        }
        aam aam = (aam) aid;
        aeo.a(aam.a(), 0);
        aeo.a(aam.c().a());
        if (aam.b().a() == 12 || aam.b().a() == 16) {
            return new ada(aam.c().c(), aam.b().a());
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }

    public final aid b(age age) {
        try {
            return b((aid) aao.a(age));
        } catch (ahi e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    public final aid b(aid aid) {
        if (!(aid instanceof aao)) {
            throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
        }
        aao aao = (aao) aid;
        aeo.a(aao.b());
        if (aao.a().a() == 12 || aao.a().a() == 16) {
            return aam.e().a(age.a(aem.a(aao.b()))).a(aao.a()).a(0).d();
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }

    public final abz c(age age) {
        return (abz) abz.e().a("type.googleapis.com/google.crypto.tink.AesEaxKey").a(((aam) b(age)).j()).a(abz.b.SYMMETRIC).d();
    }
}
