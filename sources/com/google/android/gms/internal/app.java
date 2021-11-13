package com.google.android.gms.internal;

@bfk
public final class app {
    private static final Object a = new Object();
    private static app b;
    private final jc c = new jc();
    private final apg d = new apg(new aox(), new aow(), new arr(), new axb(), new cy(), new bcq(), new axc());
    private final String e = jc.c();
    private final ass f = new ass();
    private final ast g = new ast();
    private final asu h = new asu();

    static {
        app app = new app();
        synchronized (a) {
            b = app;
        }
    }

    protected app() {
    }

    public static jc a() {
        return g().c;
    }

    public static apg b() {
        return g().d;
    }

    public static String c() {
        return g().e;
    }

    public static ast d() {
        return g().g;
    }

    public static ass e() {
        return g().f;
    }

    public static asu f() {
        return g().h;
    }

    private static app g() {
        app app;
        synchronized (a) {
            app = b;
        }
        return app;
    }
}
