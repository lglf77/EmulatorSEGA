package com.google.android.gms.internal;

import com.google.android.gms.internal.abz;
import java.security.GeneralSecurityException;

final class zk implements yu<yn> {
    zk() {
    }

    private static aay a() {
        return (aay) aay.c().a(0).a(age.a(aem.a(32))).d();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final yn a(age age) {
        try {
            aay a = aay.a(age);
            if (!(a instanceof aay)) {
                throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
            }
            aay aay = a;
            aeo.a(aay.a(), 0);
            if (aay.b().a() == 32) {
                return adj.a(aay.b().c());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        } catch (ahi e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    public final /* synthetic */ Object a(aid aid) {
        if (!(aid instanceof aay)) {
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        }
        aay aay = (aay) aid;
        aeo.a(aay.a(), 0);
        if (aay.b().a() == 32) {
            return adj.a(aay.b().c());
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }

    public final aid b(age age) {
        return a();
    }

    public final aid b(aid aid) {
        return a();
    }

    public final abz c(age age) {
        return (abz) abz.e().a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").a(a().j()).a(abz.b.SYMMETRIC).d();
    }
}
