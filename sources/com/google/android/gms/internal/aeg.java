package com.google.android.gms.internal;

import java.security.Provider;
import java.security.Signature;

public final class aeg implements ady<Signature> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
