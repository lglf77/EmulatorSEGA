package com.google.android.gms.internal;

import com.google.android.gms.internal.ady;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class adx<T_WRAPPER extends ady<T_ENGINE>, T_ENGINE> {
    public static final adx<adz, Cipher> a = new adx<>(new adz());
    public static final adx<aee, Mac> b = new adx<>(new aee());
    public static final adx<aea, KeyAgreement> c = new adx<>(new aea());
    public static final adx<aec, KeyPairGenerator> d = new adx<>(new aec());
    private static final Logger e = Logger.getLogger(adx.class.getName());
    private static final List<Provider> f;
    private static adx<aeg, Signature> g = new adx<>(new aeg());
    private static adx<aef, MessageDigest> h = new adx<>(new aef());
    private static adx<aeb, KeyFactory> i = new adx<>(new aeb());
    private T_WRAPPER j;
    private List<Provider> k = f;
    private boolean l = true;

    static {
        if (aen.a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    e.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            f = arrayList;
        } else {
            f = new ArrayList();
        }
    }

    private adx(T_WRAPPER t_wrapper) {
        this.j = t_wrapper;
    }

    private final boolean a(String str, Provider provider) {
        try {
            this.j.a(str, provider);
            return true;
        } catch (Exception e2) {
            return false;
        }
    }

    public final T_ENGINE a(String str) {
        for (Provider next : this.k) {
            if (a(str, next)) {
                return this.j.a(str, next);
            }
        }
        if (this.l) {
            return this.j.a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }
}
