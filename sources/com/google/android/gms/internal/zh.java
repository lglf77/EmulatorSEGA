package com.google.android.gms.internal;

import com.google.android.gms.internal.abz;
import java.security.GeneralSecurityException;

final class zh implements yu<aej> {
    zh() {
    }

    private static void a(aak aak) {
        if (aak.a() < 12 || aak.a() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final acz a(age age) {
        try {
            aag a = aag.a(age);
            if (!(a instanceof aag)) {
                throw new GeneralSecurityException("expected AesCtrKey proto");
            }
            aag aag = a;
            aeo.a(aag.a(), 0);
            aeo.a(aag.c().a());
            a(aag.b());
            return new acz(aag.c().c(), aag.b().a());
        } catch (ahi e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    public final /* synthetic */ Object a(aid aid) {
        if (!(aid instanceof aag)) {
            throw new GeneralSecurityException("expected AesCtrKey proto");
        }
        aag aag = (aag) aid;
        aeo.a(aag.a(), 0);
        aeo.a(aag.c().a());
        a(aag.b());
        return new acz(aag.c().c(), aag.b().a());
    }

    public final aid b(age age) {
        try {
            return b((aid) aai.a(age));
        } catch (ahi e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    public final aid b(aid aid) {
        if (!(aid instanceof aai)) {
            throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
        }
        aai aai = (aai) aid;
        aeo.a(aai.b());
        a(aai.a());
        return aag.e().a(aai.a()).a(age.a(aem.a(aai.b()))).a(0).d();
    }

    public final abz c(age age) {
        return (abz) abz.e().a("type.googleapis.com/google.crypto.tink.AesCtrKey").a(((aag) b(age)).j()).a(abz.b.SYMMETRIC).d();
    }
}
