package com.google.android.gms.internal;

import java.security.KeyFactory;
import java.security.Provider;

public final class aeb implements ady<KeyFactory> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
