package com.google.android.gms.internal;

import com.google.android.gms.internal.abz;
import java.security.GeneralSecurityException;

final class zn implements yu<yn> {
    zn() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final yn a(age age) {
        try {
            acr a = acr.a(age);
            if (!(a instanceof acr)) {
                throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
            }
            acr acr = a;
            aeo.a(acr.a(), 0);
            String a2 = acr.b().a();
            return new zm(acr.b().b(), yx.a(a2).b(a2));
        } catch (ahi e) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e);
        }
    }

    public final /* synthetic */ Object a(aid aid) {
        if (!(aid instanceof acr)) {
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        }
        acr acr = (acr) aid;
        aeo.a(acr.a(), 0);
        String a = acr.b().a();
        return new zm(acr.b().b(), yx.a(a).b(a));
    }

    public final aid b(age age) {
        try {
            return b((aid) act.a(age));
        } catch (ahi e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }

    public final aid b(aid aid) {
        if (!(aid instanceof act)) {
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
        }
        return acr.c().a((act) aid).a(0).d();
    }

    public final abz c(age age) {
        return (abz) abz.e().a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").a(((acr) b(age)).j()).a(abz.b.REMOTE).d();
    }
}
