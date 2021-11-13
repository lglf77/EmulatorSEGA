package com.google.android.gms.internal;

import com.google.android.gms.a;

final class aht implements aip {
    private static final aic c = new ahu();
    private final aic a;
    private final ahx b;

    public aht() {
        this(ahx.DYNAMIC);
    }

    private aht(ahx ahx) {
        this(new ahw(ahb.a(), a()), ahx);
    }

    private aht(aic aic, ahx ahx) {
        this.a = (aic) ahe.a(aic, "messageInfoFactory");
        this.b = (ahx) ahe.a(ahx, "mode");
    }

    private static aic a() {
        try {
            return (aic) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception e) {
            return c;
        }
    }

    private static <T> aio<T> a(Class<T> cls, aib aib) {
        if (ahc.class.isAssignableFrom(cls)) {
            if (a(aib)) {
                return aih.a(cls, aib, ahp.b(), aiq.c(), agx.a(), aia.b());
            }
            return aih.a(cls, aib, ahp.b(), aiq.c(), (agv<?>) null, aia.b());
        } else if (a(aib)) {
            return aih.a(cls, aib, ahp.a(), aiq.a(), agx.b(), aia.a());
        } else {
            return aih.a(cls, aib, ahp.a(), aiq.b(), (agv<?>) null, aia.a());
        }
    }

    private static boolean a(aib aib) {
        return aib.a() == aik.a;
    }

    private static <T> aio<T> b(Class<T> cls, aib aib) {
        if (ahc.class.isAssignableFrom(cls)) {
            if (a(aib)) {
                return aih.b(cls, aib, ahp.b(), aiq.c(), agx.a(), aia.b());
            }
            return aih.b(cls, aib, ahp.b(), aiq.c(), (agv<?>) null, aia.b());
        } else if (a(aib)) {
            return aih.b(cls, aib, ahp.a(), aiq.a(), agx.b(), aia.a());
        } else {
            return aih.b(cls, aib, ahp.a(), aiq.b(), (agv<?>) null, aia.a());
        }
    }

    public final <T> aio<T> a(Class<T> cls) {
        aiq.a((Class<?>) cls);
        aib b2 = this.a.b(cls);
        if (b2.b()) {
            return ahc.class.isAssignableFrom(cls) ? aii.a(cls, aiq.c(), agx.a(), b2.c()) : aii.a(cls, aiq.a(), agx.b(), b2.c());
        }
        switch (ahv.a[this.b.ordinal()]) {
            case a.b.AdsAttrs_adSizes:
                return a(cls, b2);
            case 2:
                return b(cls, b2);
            default:
                return b2.d() ? a(cls, b2) : b(cls, b2);
        }
    }
}
