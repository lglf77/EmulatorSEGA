package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

@bfk
public final class ati {
    private final Map<String, ath> a = new HashMap();
    private final atj b;

    public ati(atj atj) {
        this.b = atj;
    }

    public final atj a() {
        return this.b;
    }

    public final void a(String str, ath ath) {
        this.a.put(str, ath);
    }

    public final void a(String str, String str2, long j) {
        atj atj = this.b;
        ath ath = this.a.get(str2);
        String[] strArr = {str};
        if (!(atj == null || ath == null)) {
            atj.a(ath, j, strArr);
        }
        Map<String, ath> map = this.a;
        atj atj2 = this.b;
        map.put(str, atj2 == null ? null : atj2.a(j));
    }
}
