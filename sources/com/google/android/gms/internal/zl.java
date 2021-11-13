package com.google.android.gms.internal;

import com.google.android.gms.internal.abz;
import java.security.GeneralSecurityException;

final class zl implements yu<yn> {
    zl() {
    }

    private static yn c(aid aid) {
        if (!(aid instanceof acn)) {
            throw new GeneralSecurityException("expected KmsAeadKey proto");
        }
        acn acn = (acn) aid;
        aeo.a(acn.a(), 0);
        String a = acn.b().a();
        return yx.a(a).b(a);
    }

    private static yn d(age age) {
        try {
            return c((aid) acn.a(age));
        } catch (ahi e) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", e);
        }
    }

    public final /* synthetic */ Object a(age age) {
        return d(age);
    }

    public final /* synthetic */ Object a(aid aid) {
        return c(aid);
    }

    public final aid b(age age) {
        try {
            return b((aid) acp.a(age));
        } catch (ahi e) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e);
        }
    }

    public final aid b(aid aid) {
        if (!(aid instanceof acp)) {
            throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
        }
        return acn.c().a((acp) aid).a(0).d();
    }

    public final abz c(age age) {
        return (abz) abz.e().a("type.googleapis.com/google.crypto.tink.KmsAeadKey").a(((acn) b(age)).j()).a(abz.b.REMOTE).d();
    }
}
