package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.Mac;

public final class aee implements ady<Mac> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
