package com.google.android.gms.internal;

import com.google.android.gms.internal.abz;
import com.google.android.gms.internal.acj;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zd {
    private static final Logger a = Logger.getLogger(zd.class.getName());
    private static final ConcurrentMap<String, yu> b = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> c = new ConcurrentHashMap();
    private static final ConcurrentMap<String, yo> d = new ConcurrentHashMap();

    public static <P> abz a(acf acf) {
        yu b2 = b(acf.a());
        if (((Boolean) c.get(acf.a())).booleanValue()) {
            return b2.c(acf.b());
        }
        String valueOf = String.valueOf(acf.a());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
    }

    public static <P> aid a(String str, aid aid) {
        yu b2 = b(str);
        if (((Boolean) c.get(str)).booleanValue()) {
            return b2.b(aid);
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
    }

    public static yo a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        yo yoVar = (yo) d.get(str.toLowerCase());
        if (yoVar != null) {
            return yoVar;
        }
        String format = String.format("no catalogue found for %s. ", new Object[]{str});
        if (str.toLowerCase().startsWith("tinkaead")) {
            format = String.valueOf(format).concat("Maybe call AeadConfig.init().");
        } else if (str.toLowerCase().startsWith("tinkhybrid")) {
            format = String.valueOf(format).concat("Maybe call HybridConfig.init().");
        } else if (str.toLowerCase().startsWith("tinkmac")) {
            format = String.valueOf(format).concat("Maybe call MacConfig.init().");
        } else if (str.toLowerCase().startsWith("tinksignature")) {
            format = String.valueOf(format).concat("Maybe call SignatureConfig.init().");
        } else if (str.toLowerCase().startsWith("tink")) {
            format = String.valueOf(format).concat("Maybe call TinkConfig.init().");
        }
        throw new GeneralSecurityException(format);
    }

    public static <P> zb<P> a(yv yvVar, yu<P> yuVar) {
        acj a2 = yvVar.a();
        if (a2.c() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        int a3 = a2.a();
        boolean z = true;
        boolean z2 = false;
        for (acj.b next : a2.b()) {
            if (!next.a()) {
                throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.e())}));
            } else if (next.f() == acv.UNKNOWN_PREFIX) {
                throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.e())}));
            } else if (next.c() == acd.UNKNOWN_STATUS) {
                throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.e())}));
            } else {
                if (next.c() == acd.ENABLED && next.e() == a3) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                z = next.b().c() != abz.b.ASYMMETRIC_PUBLIC ? false : z;
            }
        }
        if (z2 || z) {
            zb<P> zbVar = new zb<>();
            for (acj.b next2 : yvVar.a().b()) {
                if (next2.c() == acd.ENABLED) {
                    zc<P> a4 = zbVar.a(a(next2.b().a(), next2.b().b()), next2);
                    if (next2.e() == yvVar.a().a()) {
                        zbVar.a(a4);
                    }
                }
            }
            return zbVar;
        }
        throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
    }

    private static <P> P a(String str, age age) {
        return b(str).a(age);
    }

    public static <P> P a(String str, byte[] bArr) {
        return a(str, age.a(bArr));
    }

    public static synchronized void a(String str, yo yoVar) {
        synchronized (zd.class) {
            if (!d.containsKey(str.toLowerCase()) || yoVar.getClass().equals(((yo) d.get(str.toLowerCase())).getClass())) {
                d.put(str.toLowerCase(), yoVar);
            } else {
                Logger logger = a;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(str);
                logger.logp(level, "com.google.crypto.tink.Registry", "addCatalogue", valueOf.length() != 0 ? "Attempted overwrite of a catalogueName catalogue for name ".concat(valueOf) : new String("Attempted overwrite of a catalogueName catalogue for name "));
                throw new GeneralSecurityException(new StringBuilder(String.valueOf(str).length() + 47).append("catalogue for name ").append(str).append(" has been already registered").toString());
            }
        }
    }

    public static <P> void a(String str, yu<P> yuVar) {
        a(str, yuVar, true);
    }

    public static synchronized <P> void a(String str, yu<P> yuVar, boolean z) {
        synchronized (zd.class) {
            if (yuVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            if (b.containsKey(str)) {
                yu b2 = b(str);
                boolean booleanValue = ((Boolean) c.get(str)).booleanValue();
                if (!yuVar.getClass().equals(b2.getClass()) || (!booleanValue && z)) {
                    Logger logger = a;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(str);
                    logger.logp(level, "com.google.crypto.tink.Registry", "registerKeyManager", valueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(valueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, b2.getClass().getName(), yuVar.getClass().getName()}));
                }
            }
            b.put(str, yuVar);
            c.put(str, Boolean.valueOf(z));
        }
    }

    public static <P> aid b(acf acf) {
        yu b2 = b(acf.a());
        if (((Boolean) c.get(acf.a())).booleanValue()) {
            return b2.b(acf.b());
        }
        String valueOf = String.valueOf(acf.a());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
    }

    private static <P> yu<P> b(String str) {
        yu<P> yuVar = (yu) b.get(str);
        if (yuVar != null) {
            return yuVar;
        }
        throw new GeneralSecurityException(new StringBuilder(String.valueOf(str).length() + 78).append("No key manager found for key type: ").append(str).append(".  Check the configuration of the registry.").toString());
    }

    public static <P> P b(String str, aid aid) {
        return b(str).a(aid);
    }
}
