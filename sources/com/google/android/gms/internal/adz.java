package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.Cipher;

public final class adz implements ady<Cipher> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
