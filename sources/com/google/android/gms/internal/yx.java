package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class yx {
    private static final CopyOnWriteArrayList<yw> a = new CopyOnWriteArrayList<>();

    public static yw a(String str) {
        Iterator<yw> it = a.iterator();
        while (it.hasNext()) {
            yw next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
