package com.google.android.gms.internal;

import java.security.KeyPairGenerator;
import java.security.Provider;

public final class aec implements ady<KeyPairGenerator> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
