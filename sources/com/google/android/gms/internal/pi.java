package com.google.android.gms.internal;

public class pi<T> {
    private static final Object a = new Object();
    private static po b = null;
    private static int c = 0;
    private static String d = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    private String e;
    private T f;
    private T g = null;

    protected pi(String str, T t) {
        this.e = str;
        this.f = t;
    }

    public static pi<Integer> a(String str, Integer num) {
        return new pm(str, num);
    }

    public static pi<Long> a(String str, Long l) {
        return new pl(str, l);
    }

    public static pi<String> a(String str, String str2) {
        return new pn(str, str2);
    }

    public static pi<Boolean> a(String str, boolean z) {
        return new pj(str, Boolean.valueOf(z));
    }
}
