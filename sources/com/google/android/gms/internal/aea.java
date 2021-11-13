package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.KeyAgreement;

public final class aea implements ady<KeyAgreement> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
