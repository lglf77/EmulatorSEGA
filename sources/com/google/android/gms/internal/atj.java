package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.au;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@bfk
public final class atj {
    private boolean a;
    private final List<ath> b = new LinkedList();
    private final Map<String, String> c = new LinkedHashMap();
    private final Object d = new Object();
    private String e;
    private atj f;

    public atj(boolean z, String str, String str2) {
        this.a = z;
        this.c.put("action", str);
        this.c.put("ad_format", str2);
    }

    public final ath a() {
        return a(au.k().b());
    }

    public final ath a(long j) {
        if (!this.a) {
            return null;
        }
        return new ath(j, (String) null, (ath) null);
    }

    public final void a(atj atj) {
        synchronized (this.d) {
            this.f = atj;
        }
    }

    public final void a(String str) {
        if (this.a) {
            synchronized (this.d) {
                this.e = str;
            }
        }
    }

    public final void a(String str, String str2) {
        asz e2;
        if (this.a && !TextUtils.isEmpty(str2) && (e2 = au.i().e()) != null) {
            synchronized (this.d) {
                atd a2 = e2.a(str);
                Map<String, String> map = this.c;
                map.put(str, a2.a(map.get(str), str2));
            }
        }
    }

    public final boolean a(ath ath, long j, String... strArr) {
        synchronized (this.d) {
            for (String ath2 : strArr) {
                this.b.add(new ath(j, ath2, ath));
            }
        }
        return true;
    }

    public final boolean a(ath ath, String... strArr) {
        if (!this.a || ath == null) {
            return false;
        }
        return a(ath, au.k().b(), strArr);
    }

    public final String b() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.d) {
            for (ath next : this.b) {
                long a2 = next.a();
                String b2 = next.b();
                ath c2 = next.c();
                if (c2 != null && a2 > 0) {
                    sb2.append(b2).append('.').append(a2 - c2.a()).append(',');
                }
            }
            this.b.clear();
            if (!TextUtils.isEmpty(this.e)) {
                sb2.append(this.e);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> c() {
        Map<String, String> a2;
        synchronized (this.d) {
            asz e2 = au.i().e();
            a2 = (e2 == null || this.f == null) ? this.c : e2.a(this.c, this.f.c());
        }
        return a2;
    }

    public final ath d() {
        synchronized (this.d) {
        }
        return null;
    }
}
