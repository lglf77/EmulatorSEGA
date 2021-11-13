package com.google.android.gms.internal;

import com.google.android.gms.internal.acj;
import com.google.android.gms.internal.acl;
import java.security.GeneralSecurityException;

public final class yv {
    private acj a;

    private yv(acj acj) {
        this.a = acj;
    }

    static final yv a(acj acj) {
        if (acj != null && acj.c() > 0) {
            return new yv(acj);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* access modifiers changed from: package-private */
    public final acj a() {
        return this.a;
    }

    public final String toString() {
        acj acj = this.a;
        acl.a a2 = acl.a().a(acj.a());
        for (acj.b next : acj.b()) {
            a2.a((acl.b) acl.b.a().a(next.b().a()).a(next.c()).a(next.f()).a(next.e()).d());
        }
        return ((acl) a2.d()).toString();
    }
}
