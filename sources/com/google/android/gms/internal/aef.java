package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.Provider;

public final class aef implements ady<MessageDigest> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
