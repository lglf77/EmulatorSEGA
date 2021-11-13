package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.b.d;
import com.google.android.gms.ads.j;
import com.google.android.gms.ads.mediation.i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@bfk
public final class bbq implements i {
    private final Date a;
    private final int b;
    private final Set<String> c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final auv g;
    private final List<String> h = new ArrayList();
    private final boolean i;
    private final Map<String, Boolean> j = new HashMap();

    public bbq(Date date, int i2, Set<String> set, Location location, boolean z, int i3, auv auv, List<String> list, boolean z2) {
        this.a = date;
        this.b = i2;
        this.c = set;
        this.e = location;
        this.d = z;
        this.f = i3;
        this.g = auv;
        this.i = z2;
        if (list != null) {
            for (String next : list) {
                if (next.startsWith("custom:")) {
                    String[] split = next.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.j.put(split[1], true);
                        } else if ("false".equals(split[2])) {
                            this.j.put(split[1], false);
                        }
                    }
                } else {
                    this.h.add(next);
                }
            }
        }
    }

    public final Date a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final Set<String> c() {
        return this.c;
    }

    public final Location d() {
        return this.e;
    }

    public final int e() {
        return this.f;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.i;
    }

    public final d h() {
        if (this.g == null) {
            return null;
        }
        d.a b2 = new d.a().a(this.g.b).a(this.g.c).b(this.g.d);
        if (this.g.a >= 2) {
            b2.b(this.g.e);
        }
        if (this.g.a >= 3 && this.g.f != null) {
            b2.a(new j(this.g.f));
        }
        return b2.a();
    }

    public final boolean i() {
        return this.h != null && this.h.contains("2");
    }

    public final boolean j() {
        return this.h != null && this.h.contains("1");
    }

    public final boolean k() {
        return this.h != null && this.h.contains("3");
    }

    public final Map<String, Boolean> l() {
        return this.j;
    }
}
