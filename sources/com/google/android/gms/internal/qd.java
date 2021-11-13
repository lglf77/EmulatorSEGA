package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

final class qd {
    static yt a;

    static boolean a() {
        if (a != null) {
            return true;
        }
        String str = (String) app.f().a(asw.bx);
        if (str.length() == 0) {
            return false;
        }
        try {
            try {
                yv a2 = za.a(py.a(str, true));
                for (ach next : zr.a.a()) {
                    if (next.b().isEmpty()) {
                        throw new GeneralSecurityException("Missing type_url.");
                    } else if (next.a().isEmpty()) {
                        throw new GeneralSecurityException("Missing primitive_name.");
                    } else if (next.f().isEmpty()) {
                        throw new GeneralSecurityException("Missing catalogue_name.");
                    } else {
                        zd.a(next.b(), zd.a(next.f()).a(next.b(), next.a(), next.c()), next.e());
                    }
                }
                a = zs.a(a2);
                return a != null;
            } catch (GeneralSecurityException e) {
                return false;
            }
        } catch (IllegalArgumentException e2) {
            return false;
        }
    }
}
