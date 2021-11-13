package com.google.android.gms.internal;

import com.google.android.gms.internal.abz;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

class zg implements yu<yn> {
    private static final Logger a = Logger.getLogger(zg.class.getName());

    zg() {
        zd.a("type.googleapis.com/google.crypto.tink.AesCtrKey", new zh());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final yn a(age age) {
        try {
            aac a2 = aac.a(age);
            if (!(a2 instanceof aac)) {
                throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
            }
            aac aac = a2;
            aeo.a(aac.a(), 0);
            return new adw((aej) zd.b("type.googleapis.com/google.crypto.tink.AesCtrKey", aac.b()), (yz) zd.b("type.googleapis.com/google.crypto.tink.HmacKey", aac.c()), aac.c().b().b());
        } catch (ahi e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    public final /* synthetic */ Object a(aid aid) {
        if (!(aid instanceof aac)) {
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        }
        aac aac = (aac) aid;
        aeo.a(aac.a(), 0);
        return new adw((aej) zd.b("type.googleapis.com/google.crypto.tink.AesCtrKey", aac.b()), (yz) zd.b("type.googleapis.com/google.crypto.tink.HmacKey", aac.c()), aac.c().b().b());
    }

    public final aid b(age age) {
        try {
            return b((aid) aae.a(age));
        } catch (ahi e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    public final aid b(aid aid) {
        if (!(aid instanceof aae)) {
            throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
        }
        aae aae = (aae) aid;
        return aac.e().a((aag) zd.a("type.googleapis.com/google.crypto.tink.AesCtrKey", (aid) aae.a())).a((abt) zd.a("type.googleapis.com/google.crypto.tink.HmacKey", (aid) aae.b())).a(0).d();
    }

    public final abz c(age age) {
        return (abz) abz.e().a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").a(((aac) b(age)).j()).a(abz.b.SYMMETRIC).d();
    }
}
