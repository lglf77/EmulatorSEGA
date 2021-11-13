package com.google.android.gms.internal;

import com.google.android.gms.a;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class zu {
    public static adu a(abp abp) {
        switch (zv.b[abp.ordinal()]) {
            case a.b.AdsAttrs_adSizes:
                return adu.NIST_P256;
            case 2:
                return adu.NIST_P384;
            case 3:
                return adu.NIST_P521;
            default:
                String valueOf = String.valueOf(abp);
                throw new GeneralSecurityException(new StringBuilder(String.valueOf(valueOf).length() + 20).append("unknown curve type: ").append(valueOf).toString());
        }
    }

    public static adv a(abb abb) {
        switch (zv.c[abb.ordinal()]) {
            case a.b.AdsAttrs_adSizes:
                return adv.UNCOMPRESSED;
            case 2:
                return adv.COMPRESSED;
            default:
                String valueOf = String.valueOf(abb);
                throw new GeneralSecurityException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("unknown point format: ").append(valueOf).toString());
        }
    }

    public static String a(abr abr) {
        switch (zv.a[abr.ordinal()]) {
            case a.b.AdsAttrs_adSizes:
                return "HmacSha1";
            case 2:
                return "HmacSha256";
            case 3:
                return "HmacSha512";
            default:
                String valueOf = String.valueOf(abr);
                throw new NoSuchAlgorithmException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("hash unsupported for HMAC: ").append(valueOf).toString());
        }
    }

    public static void a(abh abh) {
        ads.a(a(abh.a().a()));
        a(abh.a().b());
        if (abh.c() == abb.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zd.a(abh.b().a());
    }
}
