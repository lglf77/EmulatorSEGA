package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.b;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.a;
import com.google.android.gms.ads.mediation.customevent.c;
import java.util.Map;

@bfk
public final class baq extends bas {
    private Map<Class<? extends Object>, Object> a;

    private final <NETWORK_EXTRAS extends f, SERVER_PARAMETERS extends e> bav c(String str) {
        try {
            Class<?> cls = Class.forName(str, false, baq.class.getClassLoader());
            if (b.class.isAssignableFrom(cls)) {
                b bVar = (b) cls.newInstance();
                return new bbr(bVar, (f) this.a.get(bVar.getAdditionalParametersType()));
            } else if (com.google.android.gms.ads.mediation.b.class.isAssignableFrom(cls)) {
                return new bbm((com.google.android.gms.ads.mediation.b) cls.newInstance());
            } else {
                jn.e(new StringBuilder(String.valueOf(str).length() + 64).append("Could not instantiate mediation adapter: ").append(str).append(" (not a valid adapter).").toString());
                throw new RemoteException();
            }
        } catch (Throwable th) {
            return d(str);
        }
    }

    private final bav d(String str) {
        try {
            jn.b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new bbm(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new bbm(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new bbm(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new bbr(customEventAdapter, (c) this.a.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            jn.c(new StringBuilder(String.valueOf(str).length() + 43).append("Could not instantiate mediation adapter: ").append(str).append(". ").toString(), th);
        }
    }

    public final bav a(String str) {
        return c(str);
    }

    public final void a(Map<Class<? extends Object>, Object> map) {
        this.a = map;
    }

    public final boolean b(String str) {
        try {
            return a.class.isAssignableFrom(Class.forName(str, false, baq.class.getClassLoader()));
        } catch (Throwable th) {
            jn.e(new StringBuilder(String.valueOf(str).length() + 80).append("Could not load custom event implementation class: ").append(str).append(", assuming old implementation.").toString());
            return false;
        }
    }
}
