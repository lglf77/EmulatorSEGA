package com.google.android.gms.internal;

final class ahw implements aic {
    private aic[] a;

    ahw(aic... aicArr) {
        this.a = aicArr;
    }

    public final boolean a(Class<?> cls) {
        for (aic a2 : this.a) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final aib b(Class<?> cls) {
        for (aic aic : this.a) {
            if (aic.a(cls)) {
                return aic.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
