package com.google.android.gms.internal;

import com.google.android.gms.a;
import com.google.android.gms.internal.abz;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

final class zx implements yu<yz> {
    zx() {
    }

    private static void a(abx abx) {
        if (abx.b() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        switch (zy.a[abx.a().ordinal()]) {
            case a.b.AdsAttrs_adSizes:
                if (abx.b() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            case 2:
                if (abx.b() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            case 3:
                if (abx.b() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            default:
                throw new GeneralSecurityException("unknown hash type");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final yz a(age age) {
        aek aek;
        try {
            abt a = abt.a(age);
            if (!(a instanceof abt)) {
                throw new GeneralSecurityException("expected HmacKey proto");
            }
            abt abt = a;
            aeo.a(abt.a(), 0);
            if (abt.c().a() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            a(abt.b());
            abr a2 = abt.b().a();
            SecretKeySpec secretKeySpec = new SecretKeySpec(abt.c().c(), "HMAC");
            int b = abt.b().b();
            switch (zy.a[a2.ordinal()]) {
                case a.b.AdsAttrs_adSizes:
                    aek = new aek("HMACSHA1", secretKeySpec, b);
                    break;
                case 2:
                    aek = new aek("HMACSHA256", secretKeySpec, b);
                    break;
                case 3:
                    aek = new aek("HMACSHA512", secretKeySpec, b);
                    break;
                default:
                    throw new GeneralSecurityException("unknown hash");
            }
            return aek;
        } catch (ahi e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    public final /* synthetic */ Object a(aid aid) {
        if (!(aid instanceof abt)) {
            throw new GeneralSecurityException("expected HmacKey proto");
        }
        abt abt = (abt) aid;
        aeo.a(abt.a(), 0);
        if (abt.c().a() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        a(abt.b());
        abr a = abt.b().a();
        SecretKeySpec secretKeySpec = new SecretKeySpec(abt.c().c(), "HMAC");
        int b = abt.b().b();
        switch (zy.a[a.ordinal()]) {
            case a.b.AdsAttrs_adSizes:
                return new aek("HMACSHA1", secretKeySpec, b);
            case 2:
                return new aek("HMACSHA256", secretKeySpec, b);
            case 3:
                return new aek("HMACSHA512", secretKeySpec, b);
            default:
                throw new GeneralSecurityException("unknown hash");
        }
    }

    public final aid b(age age) {
        try {
            return b((aid) abv.a(age));
        } catch (ahi e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    public final aid b(aid aid) {
        if (!(aid instanceof abv)) {
            throw new GeneralSecurityException("expected HmacKeyFormat proto");
        }
        abv abv = (abv) aid;
        if (abv.b() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        a(abv.a());
        return abt.e().a(0).a(abv.a()).a(age.a(aem.a(abv.b()))).d();
    }

    public final abz c(age age) {
        return (abz) abz.e().a("type.googleapis.com/google.crypto.tink.HmacKey").a(((abt) b(age)).j()).a(abz.b.SYMMETRIC).d();
    }
}
