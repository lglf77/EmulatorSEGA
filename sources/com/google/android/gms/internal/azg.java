package com.google.android.gms.internal;

@bfk
final class azg {
    private static final azd a = azd.a();
    private static final float b = ((Float) app.f().a(asw.aR)).floatValue();
    private static final long c = ((Long) app.f().a(asw.aP)).longValue();
    private static final float d = ((Float) app.f().a(asw.aS)).floatValue();
    private static final long e = ((Long) app.f().a(asw.aQ)).longValue();

    private static int a(long j, int i) {
        return (int) ((j >>> ((i % 16) * 4)) & 15);
    }

    static boolean a() {
        int i = Integer.MAX_VALUE;
        int h = a.h();
        int i2 = a.i();
        int f = a.f() + a.g();
        if (i2 <= ((h >= 16 || e == 0) ? d != 0.0f ? ((int) (d * ((float) h))) + 1 : Integer.MAX_VALUE : a(e, h))) {
            if (h < 16 && c != 0) {
                i = a(c, h);
            } else if (b != 0.0f) {
                i = (int) (b * ((float) h));
            }
            if (f <= i) {
                return true;
            }
        }
        return false;
    }
}
